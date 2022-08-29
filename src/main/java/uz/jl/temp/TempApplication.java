package uz.jl.temp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.jl.temp.modul.Author;
import uz.jl.temp.modul.Book;

import java.util.List;

@SpringBootApplication
@RestController
public class TempApplication {
    private final static List<Book> books = List.of(
            Book.builder().name("Name 1").author(new Author("Author1", 30, "Author1")).build(),
            Book.builder().name("Name 2").author(new Author("Author2", 45, "Author2")).build());

    public static void main(String[] args) {
        SpringApplication.run(TempApplication.class, args);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

}
