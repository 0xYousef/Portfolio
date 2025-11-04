package com.eagle0eye.portfolio_api.profile.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Builder
@Getter
@Setter
@Document(collection = "experiences")

public class Experience {
    @Id
    private String id;
    private String title;
    private String description;
    private Company company;
    private Duration duration;
    private String image;
    private String field;
    private String location;
    private String locationType;
    private String employmentType;
}
