package com.eagle0eye.portfolio_api.profile.service;

import com.eagle0eye.portfolio_api.profile.dto.ExperienceDTO;
import com.eagle0eye.portfolio_api.profile.dto.ReadAsset;
import com.eagle0eye.portfolio_api.profile.repository.ExperienceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProfileServiceImpl implements ProfileService {

    private final ExperienceRepository experienceRepository;
    private final RestTemplate restTemplate;

    @Override
    public List<ExperienceDTO> getExperiences() {
        return experienceRepository.findAll()
                .stream()
                .map(exp -> {
                    ReadAsset image = restTemplate.getForObject(
                            "http://localhost:8081/portfolio/api/media/" + exp.getImage(),
                            ReadAsset.class
                    );

                    return ExperienceDTO.builder()
                            .title(exp.getTitle())
                            .description(exp.getDescription())
                            .image(image)
                            .build();
                })
                .toList();
    }
}
