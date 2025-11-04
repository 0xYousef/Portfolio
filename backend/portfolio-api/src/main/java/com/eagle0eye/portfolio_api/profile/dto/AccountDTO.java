package com.eagle0eye.portfolio_api.profile.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class AccountDTO {
    private String account;
    private ReadAsset readAsset;
}
