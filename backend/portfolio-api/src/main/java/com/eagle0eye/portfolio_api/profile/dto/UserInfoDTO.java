package com.eagle0eye.portfolio_api.profile.dto;

import com.eagle0eye.portfolio_api.shared.assets.ReadAsset;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @Builder
public class UserInfoDTO {
    private String name;
    private String email;
    private String phone;
    private String address;
    private ReadAsset image;
    private String cv;
    private String job;
}
