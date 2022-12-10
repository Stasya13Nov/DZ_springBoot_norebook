package by.nastya.springboot_book.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Book {
    private int id;
    @NotEmpty(message = "Поле обязательно для заполнения!")
    @Size(min = 2, max = 50, message = "Поле должно содержать от 2 до 50 символов")
    @Pattern(regexp = "[A-Za-z\\s]+", message = "Разрешены только латинские буквы")
    private String author;

    @NotEmpty(message = "Поле обязательно для заполнения!")
    @Size(min = 2, max = 50, message = "Поле должно содержать от 2 до 50 символов")
    @Pattern(regexp = "[A-Za-z\\s]+", message = "Разрешены только латинские буквы")
    private String nameOfBook;

    @NotEmpty(message = "Поле обязательно для заполнения!")
    @Size(min = 2, max = 50, message = "Поле должно содержать от 2 до 50 символов")
    @Pattern(regexp = "[A-Za-z\\s]+", message = "Разрешены только латинские буквы")
    private String genre;
}
