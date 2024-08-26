package com.example.spring_app.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title", nullable = false, length = 50)
    @Size(max = 50, message = "Title must be less than or equal to 50 characters")
    @NotBlank(message = "Title is mandatory plz")
    private String title;

    @Column(name = "author", nullable = false, length = 50)
    @Size(max = 50, message = "Author must have less than or equal to 50 characters")
    @NotBlank(message = "Author is mandatory!")
    private String author;

    @Column(name = "copies")
    @Min(value = 1, message = "Copies must be a positive number")
    private int copies;

    @Column(name = "available")
    private boolean available;
}
