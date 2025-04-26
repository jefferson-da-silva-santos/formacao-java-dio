package model;

import enums.LivroCategory;
import enums.LivroState;

import java.util.UUID;

public class PhysicalBook extends Book{
    public PhysicalBook(String title, String author, LivroCategory categoria, LivroState estado) {
        super(title, author, categoria, estado);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public LivroCategory getCategoria() {
        return super.getCategoria();
    }

    @Override
    public void setCategoria(LivroCategory categoria) {
        super.setCategoria(categoria);
    }

    @Override
    public LivroState getEstado() {
        return super.getEstado();
    }

    @Override
    public void setEstado(LivroState estado) {
        super.setEstado(estado);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
