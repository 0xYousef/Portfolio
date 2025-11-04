package com.eagle0eye.portfolio_api.profile.controller;

import com.eagle0eye.portfolio_api.profile.dto.ExperienceDTO;
import com.eagle0eye.portfolio_api.profile.service.ProfileServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/portfolio")
@RequiredArgsConstructor
public class PortfolioController {
    private final ProfileServiceImpl profileService;
    @GetMapping("/experiences")
    public List<ExperienceDTO> viewExperiences() {
        return profileService.getExperiences();
    }
}
