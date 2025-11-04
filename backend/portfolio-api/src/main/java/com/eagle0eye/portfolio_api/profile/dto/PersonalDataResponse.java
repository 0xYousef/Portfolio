package com.eagle0eye.portfolio_api.profile.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PersonalDataResponse {
    private ReadAsset image;
    private String account;
}
