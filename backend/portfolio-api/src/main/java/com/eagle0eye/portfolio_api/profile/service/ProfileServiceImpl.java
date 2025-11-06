package com.eagle0eye.portfolio_api.profile.service;

import com.eagle0eye.portfolio_api.profile.dto.*;
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
    public AboutUser getAboutUser() {
        return AboutUser.builder()
                .education(getEducation())
                .experiences(getExperiences())
                .certificates(getCertifications())
                .skills(getSkills())
                .volunteers(getVolunteers())
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

    private EducationDTO getEducation() {
        return educationRepository.findAll()
                .stream()
                .findFirst()
                .map((education -> {
                    return EducationDTO.builder()
                            .university(education.getUniversity())
                            .skills(education.getSkills())
                            .degree(education.getDegree())
                            .duration(education.getDuration())
                            .faculty(education.getFaculty())
                            .image(ReadAsset.builder().build())
                            .build();
                }))
                .orElse(EducationDTO.builder().build());
    }

    private List<ExperienceDTO> getExperiences() {
        return experienceRepository.findAll()
                .stream()
                .map((experience -> {
                    return ExperienceDTO.builder()
                            .title(experience.getTitle())
                            .description(experience.getDescription())
                            .field(experience.getField())
                            .company(experience.getCompany())
                            .image(ReadAsset.builder().build())
                            .duration(experience.getDuration())
                            .location(experience.getLocation())
                            .locationType(experience.getLocationType())
                            .employmentType(experience.getEmploymentType())
                            .build();
                }))
                .toList();
    }

    private List<SkillDTO> getSkills() {
        return skillRepository.findAll()
                .stream()
                .map((skill -> {
                    return SkillDTO.builder()
                            .title(skill.getTitle())
                            .icon(ReadAsset.builder().build())
                            .progress(skill.getProgress())
                            .build();
                })).toList();
    }

    private List<CertificationDTO> getCertifications(){
        return certificateRepository.findAll()
                .stream()
                .map((certificate)->{
                    return CertificationDTO.builder()
                            .title(certificate.getTitle())
                            .company(certificate.getCompany())
                            .description(certificate.getDescription())
                            .issued(certificate.getIssued())
                            .image(ReadAsset.builder().build())
                            .link(certificate.getLink())
                            .build();
                }).toList();
    }

    private List<VolunteerDTO> getVolunteers(){
        return volunteerRepository.findAll()
                .stream()
                .map(volunteer -> {
                    return VolunteerDTO.builder()
                            .title(volunteer.getTitle())
                            .company(volunteer.getCompany())
                            .duration(volunteer.getDuration())
                            .description(volunteer.getDescription())
                            .skills(volunteer.getSkills())
                            .image(ReadAsset.builder().build())
                            .build();
                }).toList();
    }

}
