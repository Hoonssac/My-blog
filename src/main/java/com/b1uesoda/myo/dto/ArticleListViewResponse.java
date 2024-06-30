package com.b1uesoda.myo.dto;

import com.b1uesoda.myo.domain.Article;
import lombok.Getter;

@Getter
public class ArticleListViewResponse {
    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article aritlce) {
       this.id = aritlce.getId();
       this.title = aritlce.getTitle();
       this.content = aritlce.getContent();
    }
}
