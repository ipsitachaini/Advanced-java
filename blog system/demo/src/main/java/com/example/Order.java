package com.example;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private int productId;
    private String item;
    private double total;
    private int userId;
    private String orderDate;

    public Order(){}

    public Order(int productId,String item,double total,int userId,String orderDate){
        this.productId = productId;
        this.item = item;
        this.total = total;
        this.userId = userId;
        this.orderDate = orderDate;
    }

    public int getProductId(){ return productId; }
    public String getItem(){ return item; }
    public double getTotal(){ return total; }
    public int getUserId(){ return userId; }
    public String getOrderDate(){ return orderDate; }
}