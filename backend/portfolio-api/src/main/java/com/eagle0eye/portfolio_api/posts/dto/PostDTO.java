package com.eagle0eye.portfolio_api.posts.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
public class PostDTO {
    private PostMetaDTO meta;
    @Builder.Default
    private List<Object> content = new ArrayList<>();
}
