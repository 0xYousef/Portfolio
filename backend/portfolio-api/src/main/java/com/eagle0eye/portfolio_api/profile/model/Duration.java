package com.eagle0eye.portfolio_api.profile.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder @Getter @Setter
public class Duration {
    private String start;
    private String end;
}
