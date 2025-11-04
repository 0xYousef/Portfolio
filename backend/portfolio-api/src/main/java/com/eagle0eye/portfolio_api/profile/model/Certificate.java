package com.eagle0eye.portfolio_api.profile.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Builder
@Document(collection = "certificates")
public class Certificate {
    @Id
    private String id;
    private String title;
    private String company;
    private String description;
    private String image;
    private String issued;
    private String link;
}
