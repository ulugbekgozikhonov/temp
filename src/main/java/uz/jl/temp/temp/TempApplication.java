package uz.jl.temp.temp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TempApplication {
    private final static List<Book> books = List.of(
            Book.builder().name("Name 1").build(),
            Book.builder().name("Name 2").build()
    );

    public static void main(String[] args) {
        SpringApplication.run(TempApplication.class, args);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

}
