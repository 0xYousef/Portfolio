package com.eagle0eye.portfolio_api.profile.model;

import lombok.Getter;

@Getter
public enum SocialType {

    DISCORD("discord", "https://discordapp.com/users/"),
    EMAIL("email", "mailto:"),
    LINKEDIN("linkedin", "https://linkedin.com/in/"),
    GITHUB("github", "https://github.com/"),
    MEDIUM("medium", "https://medium.com/@"),
    YOUTUBE("youtube", "https://www.youtube.com/@");

    private final String assetName;
    private final String baseUrl;

    SocialType(String assetName, String baseUrl) {
        this.assetName = assetName;
        this.baseUrl = baseUrl;
    }

    public String buildFullLink(String handle) {
        return baseUrl + handle;
    }
}
