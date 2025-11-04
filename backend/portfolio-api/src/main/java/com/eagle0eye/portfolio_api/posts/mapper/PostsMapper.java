package com.eagle0eye.portfolio_api.posts.mapper;

import com.eagle0eye.portfolio_api.posts.dto.PostMetaDTO;
import com.eagle0eye.portfolio_api.posts.model.PostMeta;

public class PostsMapper {

    public static PostMetaDTO postMetaToDTO(PostMeta post) {
        return PostMetaDTO.builder()
                .id(post.getId())
                .title(post.getTitle())
                .type(post.getType())
                .tags(post.getTags())
                .link(post.getLink())
                .createdAt(post.getPublishedAt())
                .modifiedAt(post.getModifiedAt())
                .field(post.getField())
                .build();
    }


}
