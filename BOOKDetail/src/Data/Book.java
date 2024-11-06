/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

 public class Book {
    private String title, author, description;
    private double price;
    private boolean availability;

    public Book(String title, String author, String description, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.availability = availability;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return availability; }
}
