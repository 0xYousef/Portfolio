package com.eagle0eye.portfolio_api.profile.dto;

import com.eagle0eye.portfolio_api.shared.assets.ReadAsset;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
public class SkillDTO {
    private String title;
    private ReadAsset icon;
    private int progress;
}
