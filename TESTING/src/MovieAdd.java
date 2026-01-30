import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class MovieAdd {

      static  String url = "jdbc:mysql://localhost:3306/movie_watchlist";
       static String user = "root";
       static String pass = "ipsita@123006";

        String sql = "INSERT INTO movies (id,Title,genre,language,rating,watched) VALUES (?, ?, ?, ?, ?, ?)";

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

       
        int choice=0;
        while(choice!=3){
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Update Movie Rating");
            System.out.println("4. Delete Movie");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice=Sc.nextInt();
            Sc.nextLine(); 

            if(choice==1){
               addMovie();
            }
            else if(choice==2){
                viewMovies();
            }
            else if(choice==3){
                updateMovieRating();
            }
            else if(choice==4){
                deleteMovie();
            }
            else if(choice==5){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid choice. Please try again.");
            }
        }
        Sc.close();
    }

    //    adding movie

       public static void addMovie() {
        Scanner Sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("Enter your id");
            String id =Sc.nextLine();
 
            System.out.println("Enter your title");
            String title =Sc.nextLine();

            System.out.println("Enter your genre");
            String genre =Sc.nextLine();

            System.out.println("Enter your language");
            String language =Sc.nextLine();

            System.out.println("Enter your rating");
            String rating =Sc.nextLine();

            System.out.println("Enter your watched status (1 for watched, 0 for not watched)");
            String watched =Sc.nextLine();


            PreparedStatement ps = con.prepareStatement("INSERT INTO movies (id, Title, genre, language, rating, watched) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, id);
            ps.setString(2, title);
            ps.setString(3, genre);
            ps.setString(4, language);
            ps.setString(5, rating);
            ps.setString(6, watched);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record inserted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Sc.close();
    }

    public static void viewMovies() {
       
    String sql = "SELECT * FROM movies";

    try 
    
    {
        Connection con = DriverManager.getConnection(url, user, pass);
        
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " " +
                rs.getString("title") + " " +
                rs.getString("genre") + " " +
                rs.getFloat("rating")
            );
        }
    
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }


    }

    // update movie rating
    public static void updateMovieRating() {
        Scanner Sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("Enter movie id to update rating:");
            int id = Sc.nextInt();
            Sc.nextLine(); 

            System.out.println("Enter new rating:");
            float rating = Sc.nextFloat();

            String sql = "UPDATE movies SET rating = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, rating);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record updated");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Sc.close();

    
    }


    // delete movie
    public static void deleteMovie() {
        Scanner Sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("Enter movie id to delete:");
            int id = Sc.nextInt();

            String sql = "DELETE FROM movies WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record deleted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Sc.close();
    }

}
