package com.b1uesoda.myo.dto;

import com.b1uesoda.myo.domain.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;

    public ArticleViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
<<<<<<< HEAD
        this.createdAt = article.getCreatedAt();
=======
        this.createdAt =article.getCreatedAt();
>>>>>>> 6477f6574188554ff50cb8f5829833dc6fb62eb4
    }
}
