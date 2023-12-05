package net.gitonivan.ppspringboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @Size(min = 2, max = 30, message = "between 2 and 30 characters")
    private String name;

    @Column(name = "lastname")
    @Size(min = 2, max = 30, message = "between 2 and 30 characters")
    private String lastname;

    @Column(name = "sex")
    @Size(min = 4, max = 6, message = "between 4 and 6 characters")
    private String sex;

    @Column(name = "age")
    @PositiveOrZero(message = "should no be less then 0")
    @Digits(integer = 3, fraction = 0, message = "between 1 and 3 characters")
    private int age;
}
