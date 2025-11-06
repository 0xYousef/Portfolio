package com.eagle0eye.portfolio_api.profile.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder @Setter @Getter
@Document(collection = "skills")
public class Skill {
    @Id
    private String id;
    private String title;
    private String icon;
    @Builder.Default
    private int progress = 0;
}
