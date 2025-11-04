package com.eagle0eye.portfolio_api.posts.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Builder @Setter @Getter
@Document(collection = "meta-posts")
public class PostMeta {
    @Id private String id;
    private String title;
    @Builder.Default
    private List<String> tags = new ArrayList<>();
    private String field;
    private String type;
    private String modifiedAt;
    private String publishedAt;
    private String link;
}
