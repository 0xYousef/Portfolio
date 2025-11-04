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

    private Education education;

    @Builder.Default
    private List<Experience> experiences = new ArrayList<>();

    @Builder.Default
    private List<Skill> skills = new ArrayList<>();

    @Builder.Default
    private List<Certificate> certificates = new ArrayList<>();

    @Builder.Default
    private List<Account> accounts = new ArrayList<>();

    @Builder.Default
    private List<Volunteer> volunteers = new ArrayList<>();

}
