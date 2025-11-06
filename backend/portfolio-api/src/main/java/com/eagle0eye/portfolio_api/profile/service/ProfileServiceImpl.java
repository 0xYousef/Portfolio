package com.eagle0eye.portfolio_api.profile.service;

import com.eagle0eye.portfolio_api.profile.dto.*;
import com.eagle0eye.portfolio_api.profile.model.Company;
import com.eagle0eye.portfolio_api.profile.model.Duration;
import com.eagle0eye.portfolio_api.profile.model.SocialType;
import com.eagle0eye.portfolio_api.profile.repository.*;
import com.eagle0eye.portfolio_api.shared.assets.ReadAsset;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProfileServiceImpl implements ProfileService {

    private final UserInfoRepository  userInfoRepository;
    private final ServiceRepository serviceRepository;
    private final ExperienceRepository experienceRepository;
    private final EducationRepository educationRepository;
    private final SkillRepository skillRepository;
    private final CertificateRepository certificateRepository;
    private final VolunteerRepository volunteerRepository;
    private final AccountRepository accountRepository;

//    private final AssetsGrpcClient assetService;

    @Override
    public List<ServiceDTO> getServices() {
        return serviceRepository.findAll()
                .stream()
                .map( service -> {
                    return ServiceDTO.builder()
                            .name(service.getName())
                            .description(service.getDescription())
                            .image(ReadAsset.builder().build())
                            .build();
                        })
                .toList();
    }

    @Override
    public UserInfoDTO getUserInfo() {
        return userInfoRepository.findAll().stream().findFirst()
                .map(userInfo -> UserInfoDTO.builder()
                        .name(userInfo.getName())
                        .email(userInfo.getEmail())
                        .phone(userInfo.getPhone())
                        .address(userInfo.getAddress())
                        .cv(userInfo.getCv())
                        .job(userInfo.getJob())
                        .image(ReadAsset.builder().build())
                        .build()
                )
                .orElseGet(() -> UserInfoDTO.builder().build());
    }


    @Override
    public List<ExperienceDTO> getExperiences() {
        return experienceRepository.findAll()
                .stream()
                .map(exp -> {
//                    ReadAsset image =  assetService.getAsset(exp.getImage());

                    return ExperienceDTO.builder()
                            .title(exp.getTitle())
                            .description(exp.getDescription())
                            .image(ReadAsset.builder().build())
                            .build();
                })
                .toList();
    }

    @Override
    public AboutUser getAboutUser() {
        EducationDTO educationDTO = educationRepository.findAll()
                .stream()
                .findFirst()
                .map((education -> {
                    return EducationDTO.builder()
                            .university(education.getUniversity())
                            .skills(education.getSkills())
                            .degree(education.getDegree())
                            .duration(Duration.builder().build())
                            .faculty(education.getFaculty())
                            .image(ReadAsset.builder().build())
                            .build();
                }))
                .orElse(EducationDTO.builder().build());

        List<ExperienceDTO> experiences = experienceRepository.findAll()
                .stream()
                .map((experience -> {
                    return ExperienceDTO.builder()
                            .title(experience.getTitle())
                            .description(experience.getDescription())
                            .field(experience.getField())
                            .company(Company.builder().build())
                            .image(ReadAsset.builder().build())
                            .duration(Duration.builder().build())
                            .location(experience.getLocation())
                            .locationType(experience.getLocationType())
                            .employmentType(experience.getEmploymentType())
                            .build();
                        }))
                .toList();


        return AboutUser.builder()
                .education(educationDTO)
                .build();
    }

    @Override
    public List<AccountDTO> getAccounts() {
        return accountRepository.findAll().stream()
                .map(acc -> {
                    SocialType platform = SocialType.findPlatform(acc.getName());

                    String fullLink = (platform != null)
                            ? platform.buildFullLink(acc.getUsername())
                            : acc.getUsername();

                    return AccountDTO.builder()
                            .account(fullLink)
                            .readAsset(ReadAsset.builder().build())
                            .build();
                })
                .collect(Collectors.toList());
    }


}
