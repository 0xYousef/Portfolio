package com.eagle0eye.portfolio_api.profile.dto;

import com.eagle0eye.portfolio_api.profile.model.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Builder
@Setter
@Getter
public class AboutUser {

    private EducationDTO education;

    @Builder.Default private List<ExperienceDTO> experiences = new ArrayList<>();
    @Builder.Default private List<SkillDTO> skills = new ArrayList<>();
    @Builder.Default private List<CertificationDTO> certificates = new ArrayList<>();
    @Builder.Default private List<VolunteerDTO> volunteers = new ArrayList<>();

}
