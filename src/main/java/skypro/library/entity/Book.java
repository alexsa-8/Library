package skypro.library.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "author_id", nullable = false)
    private Long author_id;

    @Column(name = "name", nullable = false)
    private String name;

    public Book(Long author_id, String name) {
        this.author_id = author_id;
        this.name = name;
    }

    public Book() {

    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author_id, book.author_id) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author_id, name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author_id=" + author_id +
                ", name='" + name + '\'' +
                '}';
    }
}
