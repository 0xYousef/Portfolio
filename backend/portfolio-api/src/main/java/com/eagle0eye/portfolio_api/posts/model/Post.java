package com.eagle0eye.portfolio_api.posts.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@Document(collection = "posts")
public class Post {

    @Id
    private String id;
    private String post;
    @Builder.Default
    private List<Object> content = new ArrayList<>();
}
