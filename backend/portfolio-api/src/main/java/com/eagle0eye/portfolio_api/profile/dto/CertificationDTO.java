package com.eagle0eye.portfolio_api.profile.dto;

import com.eagle0eye.portfolio_api.shared.assets.ReadAsset;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CertificationDTO {
    private String title;
    private String company;
    private String description;
    private ReadAsset image;
    private String issued;
    private String link;
}
