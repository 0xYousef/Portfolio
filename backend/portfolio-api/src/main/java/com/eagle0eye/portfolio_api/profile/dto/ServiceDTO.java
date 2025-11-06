package com.eagle0eye.portfolio_api.profile.dto;

import com.eagle0eye.portfolio_api.shared.assets.ReadAsset;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder @Setter @Getter
public class ServiceDTO {
    private String name;
    private String description;
    private ReadAsset image;
}
