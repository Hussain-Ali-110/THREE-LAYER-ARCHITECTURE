/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Data.Book;
import Data.BookRepository;
 import java.util.List;

public class BookService {
    private final BookRepository bookRepository = new BookRepository();

    public List<Book> getAllBooks() {
        return bookRepository.getBooks();
    }

    public Book getBookByIndex(int index) {
        return bookRepository.getBooks().get(index);
    }
}
