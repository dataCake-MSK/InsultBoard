package com.min.InsultBoard.entity;

import com.min.InsultBoard.domain.InsultContent;
import com.min.InsultBoard.domain.LikeCount;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
public class Insult {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name="content"))
    private InsultContent content;

    @Embedded
    private LikeCount likes = LikeCount.init();

    private LocalDateTime createdAt = LocalDateTime.now();

    public Insult() {}

    public Insult(String content) {
        this.content = new InsultContent(content);
    }

    public void like() {
        this.likes = this.likes.increment();
    }
}