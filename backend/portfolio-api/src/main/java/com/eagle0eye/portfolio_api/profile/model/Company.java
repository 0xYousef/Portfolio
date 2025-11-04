package com.eagle0eye.portfolio_api.profile.model;

import lombok.Builder;
import lombok.Getter;

@Builder @Getter
public class Company {
    private String name;
    private String link;
}
