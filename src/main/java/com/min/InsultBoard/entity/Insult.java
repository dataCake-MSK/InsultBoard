package com.min.InsultBoard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@ToString
public class Insult {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ToString.Include
    private Long id;

    @ToString.Include
    private LocalDateTime createdAt = LocalDateTime.now();

    public Insult() {}
}
