package ada.septimaback.springbootdemo.model;

import javax.persistence.*;

@Entity
@Table(name="book_name",uniqueConstraints = {@UniqueConstraint(columnNames={"name"})})
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    // standard constructors

    // standard getters and setters
}

