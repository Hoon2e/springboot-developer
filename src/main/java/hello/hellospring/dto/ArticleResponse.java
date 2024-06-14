package hello.hellospring.dto;

import hello.hellospring.domain.Article;
import lombok.Getter;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.content = article.getContent();
        this.title = article.getTitle();
    }
}
