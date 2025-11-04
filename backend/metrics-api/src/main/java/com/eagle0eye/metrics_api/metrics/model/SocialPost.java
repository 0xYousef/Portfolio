package com.eagle0eye.metrics_api.metrics.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Setter @Getter @Builder
@Document(collection = "social_posts")
public class SocialPost {

    @Id private String id;

    private String post_id;

    private List<UserActions> interactions;

}
