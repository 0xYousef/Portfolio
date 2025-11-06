package com.eagle0eye.portfolio_api.profile.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter @Setter
@Builder
@Document(collection = "education")
public class Education {
    @Id
    private String id;
    private String university;
    private String degree;
    private String faculty;
    private String image;
    private List<String> skills;
    private Duration duration;
}
