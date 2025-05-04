package com.min.InsultBoard.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Embeddable
@EqualsAndHashCode
@ToString
public class LikeCount {
    @Column(nullable = false)
    private int value;

    protected LikeCount() {}

    private LikeCount(int value){
        this.value = value;
    }

    public static LikeCount init() {
        return new LikeCount(0);
    }

    public LikeCount increment() {
        return new LikeCount(this.value + 1);
    }
}
