package com.eagle0eye.portfolio_api.profile.dto;

import com.eagle0eye.portfolio_api.profile.model.Duration;
import com.eagle0eye.portfolio_api.shared.assets.ReadAsset;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter @Builder
public class VolunteerDTO {
    private String title;
    private String company;
    private String description;
    private ReadAsset image;
    private Duration duration;
    private List<String> skills;
}
