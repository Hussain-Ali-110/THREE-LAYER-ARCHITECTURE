/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

/**
 *
 * @author DEEBYTE COMPUTERS
 */
import Business.BookService;
import Data.Book;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookDetailsGUI extends JFrame {
    private final JComboBox<String> bookList;
    private final JTextArea bookDetailsArea;
    private final BookService bookService;

    public BookDetailsGUI() {
        setTitle("Book Details Viewer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        bookService = new BookService();
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Select a Book:"));

        bookList = new JComboBox<>();
        for (Book book : bookService.getAllBooks()) {
            bookList.addItem(book.getTitle());
        }
        topPanel.add(bookList);

        JButton viewButton = new JButton("View Details");
        viewButton.addActionListener(new ViewButtonListener());
        topPanel.add(viewButton);

        bookDetailsArea = new JTextArea(10, 30);
        bookDetailsArea.setEditable(false);
        
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(bookDetailsArea), BorderLayout.CENTER);
    }

    private class ViewButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = bookList.getSelectedIndex();
            Book selectedBook = bookService.getBookByIndex(selectedIndex);
            bookDetailsArea.setText(
                "Title: " + selectedBook.getTitle() + "\n" +
                "Author: " + selectedBook.getAuthor() + "\n" +
                "Description: " + selectedBook.getDescription() + "\n" +
                "Price: $" + selectedBook.getPrice() + "\n" +
                "Availability: " + (selectedBook.isAvailable() ? "In Stock" : "Out of Stock")
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BookDetailsGUI().setVisible(true));
    }
}

