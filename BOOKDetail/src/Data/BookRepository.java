/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

 import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    public BookRepository() {
         books.add(new Book("Java Programming", "Tahir Khan", "Learn Java basics to advanced.", 29.99, true));
books.add(new Book("Data Structures", "Ali Ahmed", "Guide on data structures.", 35.50, true));
books.add(new Book("Web Development", "Usama Qureshi", "Intro to HTML, CSS, JS.", 25.00, false));
books.add(new Book("Machine Learning", "Sara Ali", "Comprehensive ML guide.", 50.00, true));
books.add(new Book("Database Systems", "Ahmed Khan", "Intro to SQL and database design.", 40.00, true));
books.add(new Book("Python for Beginners", "Zain Malik", "Learn Python step-by-step.", 27.50, true));
books.add(new Book("Advanced Java", "Kiran Shah", "Java advanced topics.", 45.99, false));
books.add(new Book("Network Security", "Asad Ali", "Essentials of network security.", 30.00, true));
books.add(new Book("Cloud Computing", "Nadia Raza", "Guide to cloud platforms.", 55.00, true));
books.add(new Book("Algorithms in C++", "Imran Hussain", "Comprehensive algorithm guide.", 37.99, false));
books.add(new Book("Operating Systems", "Faraz Haider", "Principles of OS design.", 33.75, true));
books.add(new Book("Data Science", "Ayesha Malik", "Intro to data science.", 44.00, false));
books.add(new Book("Software Engineering", "Bilal Zafar", "Complete guide to SE.", 32.99, true));
books.add(new Book("Mobile App Development", "Usman Tariq", "Guide to Android and iOS.", 39.50, true));
books.add(new Book("AI Fundamentals", "Fatima Zahra", "Basic concepts of AI.", 47.00, true));
books.add(new Book("JavaScript Essentials", "Kamran Ali", "JavaScript from basics.", 24.50, false));
books.add(new Book("Cybersecurity Basics", "Owais Khan", "Intro to cybersecurity.", 34.00, true));
books.add(new Book("Linear Algebra", "Sadia Qadir", "Math for data science.", 28.99, true));
books.add(new Book("Calculus I", "Taha Riaz", "Fundamentals of calculus.", 29.00, false));
books.add(new Book("Discrete Mathematics", "Faisal Ahmed", "Mathematics for CS.", 31.99, true));
books.add(new Book("Web APIs", "Hina Tariq", "Building APIs for the web.", 38.00, false));
books.add(new Book("ReactJS Guide", "Kashif Mirza", "React from basics to advanced.", 26.75, true));
books.add(new Book("Angular Essentials", "Rashid Khan", "Intro to Angular framework.", 27.50, true));
books.add(new Book("VueJS Basics", "Mehmood Shah", "Guide to VueJS framework.", 25.00, false));
books.add(new Book("Flutter for Mobile", "Yasir Raza", "Build apps with Flutter.", 42.99, true));
books.add(new Book("Blockchain Basics", "Qasim Malik", "Intro to blockchain.", 45.00, false));
books.add(new Book("Digital Marketing", "Zainab Javed", "Guide to digital marketing.", 35.00, true));
books.add(new Book("Business Analytics", "Rehan Ali", "Intro to business analytics.", 29.99, true));
books.add(new Book("Embedded Systems", "Hamza Awan", "Basics of embedded systems.", 44.50, false));
books.add(new Book("Robotics Engineering", "Ibrahim Qureshi", "Guide to robotics.", 50.00, true));
books.add(new Book("Artificial Intelligence", "Ameer Aslam", "Advanced AI concepts.", 46.99, true));
books.add(new Book("Data Mining", "Salman Ali", "Extract insights from data.", 38.50, true));
books.add(new Book("PHP for Web", "Kamran Shah", "Learn PHP for web development.", 25.99, false));
books.add(new Book("Perl Programming", "Faisal Raza", "Guide to Perl language.", 34.50, true));
books.add(new Book("R Programming", "Ayesha Tariq", "R for data analysis.", 28.00, true));
books.add(new Book("Linear Regression", "Ahmad Jameel", "Basics of linear regression.", 30.00, false));
books.add(new Book("AWS Cloud Essentials", "Hassan Ali", "Intro to AWS cloud.", 49.00, true));
books.add(new Book("Kubernetes Fundamentals", "Rabia Qadir", "Orchestrate with Kubernetes.", 47.99, true));
books.add(new Book("Big Data Analytics", "Adnan Malik", "Analyze big data.", 39.99, false));
books.add(new Book("Scala for Beginners", "Saad Riaz", "Scala programming basics.", 32.50, true));
books.add(new Book("Ruby on Rails", "Hira Saeed", "Build web apps with Rails.", 29.50, true));
books.add(new Book("Hadoop Basics", "Asma Ali", "Intro to Hadoop ecosystem.", 50.00, false));
books.add(new Book("SQL Mastery", "Zara Khan", "Master SQL queries.", 33.99, true));
books.add(new Book("Power BI Essentials", "Ali Tahir", "Visualize data with Power BI.", 27.50, true));
books.add(new Book("Jenkins CI/CD", "Haris Shah", "Continuous integration guide.", 36.75, false));
books.add(new Book("Agile Methodology", "Umer Saleem", "Learn agile for projects.", 24.99, true));
books.add(new Book("Data Visualization", "Fahad Malik", "Visualize data effectively.", 31.99, true));
books.add(new Book("Quantum Computing", "Sana Farooq", "Intro to quantum computing.", 59.00, false));
books.add(new Book("C++ for Beginners", "Sadia Khan", "Intro to C++ language.", 22.99, true));

    }

    public List<Book> getBooks() {
        return books;
    }

}

