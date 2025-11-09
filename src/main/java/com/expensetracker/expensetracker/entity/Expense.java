package com.expensetracker.expensetracker.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity //tells JPA that this is a database table
@Data //Lombok generates getters, setters, toString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expense{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Double amount;
    private String category;
    private String date;
}