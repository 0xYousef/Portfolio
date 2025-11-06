package com.eagle0eye.portfolio_api.profile.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Builder @Getter @Setter
@Document(collection = "volunteers")
public class Volunteer {
    @Id private String id;
    private String title;
    private String company;
    private String description;
    private String image;
    private Duration duration;

    @Builder.Default
    private List<String> skills = new ArrayList<>();
}
