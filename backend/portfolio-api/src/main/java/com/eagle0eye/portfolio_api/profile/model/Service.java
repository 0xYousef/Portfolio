package com.eagle0eye.portfolio_api.profile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder @Setter @Getter
@Document(collection = "services")
public class Service {
    @Id
    private String id;
    private String name;
    private String description;
    private String image;
}
