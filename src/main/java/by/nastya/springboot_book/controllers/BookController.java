package by.nastya.springboot_book.controllers;

import by.nastya.springboot_book.dao.BookDAO;
import by.nastya.springboot_book.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Receiver;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookDAO bookDAO;
//показывает все книги
    @GetMapping
    public  String index(Model model){
        List<Book> bookList = bookDAO.allBooks();
        model.addAttribute("books",bookList);
        return "books/index";
    }
//показывает инфу по одной книге по id
    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        Book book = bookDAO.getRecipe(id);
        model.addAttribute("book",book);
        return "books/show";
    }
//форма для создания книги
    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("book", new Book());
        return "books/new";
    }
//при нажатии на кнопку "создать книгу"
    @PostMapping
    public String createBook(@ModelAttribute("book") Book book) {
        bookDAO.addBook(book);
        return "redirect:/books";
    }
//форма для редактирования книги
    @GetMapping("/{id}/edit")
    public String updateForm(@PathVariable("id") int id, Model model) {
        Book book = bookDAO.getRecipe(id);
        model.addAttribute("book", book);
        return "books/edit";
    }
//при нажатии на кнопку "отредактировать"
    @PatchMapping("/{id}")
    public String updateBook(@ModelAttribute("recipe") Book book,
                               @PathVariable("id") int id) {
        bookDAO.updateBook(id, book);
        return "redirect:/books";
    }


}
