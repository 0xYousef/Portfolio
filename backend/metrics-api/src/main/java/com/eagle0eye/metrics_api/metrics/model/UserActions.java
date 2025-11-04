package com.eagle0eye.metrics_api.metrics.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
public class UserActions {

    private String email;
    private String name;

    @Builder.Default
    private boolean isLiked = false;

    @Builder.Default
    private boolean shares = false;

    @Builder.Default
    private List<Comment> comments = new ArrayList<>();
}
