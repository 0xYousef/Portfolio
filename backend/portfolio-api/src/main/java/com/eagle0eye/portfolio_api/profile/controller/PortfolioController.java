package com.eagle0eye.portfolio_api.profile.controller;

import com.eagle0eye.portfolio_api.profile.dto.AboutUser;
import com.eagle0eye.portfolio_api.profile.dto.AccountDTO;

import com.eagle0eye.portfolio_api.profile.dto.UserInfoDTO;
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
    @GetMapping("/about-me")
    public AboutUser viewAboutMe() {
        return profileService.getAboutUser();
    }
    @GetMapping("/accounts")
    public List<AccountDTO> viewAccounts() {
        return profileService.getAccounts();
    }

    @GetMapping("/user-info")
    public UserInfoDTO viewUserInfo() {
        return profileService.getUserInfo();
    }
}
