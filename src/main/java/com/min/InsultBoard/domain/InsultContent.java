package com.min.InsultBoard.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Embeddable
@EqualsAndHashCode
@ToString
public class InsultContent {
    @Column(nullable = false)
    private String value;

    protected InsultContent() {}

    public InsultContent(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Empty Insult Content");
        }
        this.value = value;
    }
}
