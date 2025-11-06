package com.eagle0eye.portfolio_api.profile.dto;

import com.eagle0eye.portfolio_api.profile.model.Company;
import com.eagle0eye.portfolio_api.profile.model.Duration;
import com.eagle0eye.portfolio_api.shared.assets.ReadAsset;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ExperienceDTO {
    private String title;
    private String description;
    private Company company;
    private ReadAsset image;
    private Duration duration;
    private String field;
    private String location;
    private String locationType;
    private String employmentType;
}
