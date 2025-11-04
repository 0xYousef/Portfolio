package com.eagle0eye.portfolio_api.posts.service;

import com.eagle0eye.portfolio_api.posts.dto.PostDTO;
import com.eagle0eye.portfolio_api.posts.dto.PostMetaDTO;

import java.util.List;

public interface PostsService {
    List<PostMetaDTO> getPosts();
    List<PostMetaDTO> getPostsByType(String type);
    List<PostMetaDTO> getPostsByField(String field);
    PostDTO getPostById(String id);


}
