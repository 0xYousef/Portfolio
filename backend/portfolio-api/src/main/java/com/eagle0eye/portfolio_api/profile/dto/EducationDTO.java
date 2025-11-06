package com.eagle0eye.portfolio_api.profile.dto;

import com.eagle0eye.portfolio_api.profile.model.Duration;
import com.eagle0eye.portfolio_api.shared.assets.ReadAsset;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter @Builder
public class EducationDTO {
    private String university;
    private String degree;
    private String faculty;
    private ReadAsset image;
    private List<String> skills;
    private Duration duration;
}
