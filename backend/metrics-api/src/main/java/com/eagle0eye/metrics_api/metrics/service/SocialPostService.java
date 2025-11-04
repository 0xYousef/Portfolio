package com.eagle0eye.metrics_api.metrics.service;

import com.eagle0eye.metrics_api.metrics.dto.CommentResponse;
import com.eagle0eye.metrics_api.metrics.dto.LikeResponse;
import com.eagle0eye.metrics_api.metrics.dto.PostResponse;
import com.eagle0eye.metrics_api.metrics.model.SocialPost;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SocialPostService {
    List<PostResponse>  getAllPosts(Pageable pageable);
    PostResponse getPostById(String id);
    PostResponse savePost(SocialPost post);
    void deletePostById(String id);
     List<LikeResponse> getLikesOfPost(String id);
     List<CommentResponse> getCommentsOfPost(String id);



}
