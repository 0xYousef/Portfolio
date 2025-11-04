package com.eagle0eye.portfolio_api.profile.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Setter
@Getter
@Document(collection = "user-info")
public class UserInfo {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String image;
    private String cv;
    private String job;
}
