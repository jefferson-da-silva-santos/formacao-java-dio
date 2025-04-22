package model;

import enums.LivroCategory;
import enums.LivroState;

import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private String author;
    private LivroCategory categoria;
    private LivroState estado;

    public Book(
            String title,
            String author,
            LivroCategory categoria,
            LivroState estado
    ) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LivroCategory getCategoria() {
        return categoria;
    }

    public void setCategoria(LivroCategory categoria) {
        this.categoria = categoria;
    }

    public LivroState getEstado() {
        return estado;
    }

    public void setEstado(LivroState estado) {
        this.estado = estado;
    }
}
