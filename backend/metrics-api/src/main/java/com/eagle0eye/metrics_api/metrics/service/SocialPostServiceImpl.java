package com.eagle0eye.metrics_api.metrics.service;

import com.eagle0eye.metrics_api.metrics.dto.CommentResponse;
import com.eagle0eye.metrics_api.metrics.dto.LikeResponse;
import com.eagle0eye.metrics_api.metrics.dto.PostResponse;
import com.eagle0eye.metrics_api.metrics.model.SocialPost;
import com.eagle0eye.metrics_api.metrics.repository.SocialPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SocialPostServiceImpl implements SocialPostService {


    @Override
    public List<PostResponse> getAllPosts(Pageable pageable) {
        return List.of();
    }

    @Override
    public PostResponse getPostById(String id) {
        return null;
    }

    @Override
    public PostResponse savePost(SocialPost post) {
        return null;
    }

    @Override
    public void deletePostById(String id) {

    }

    @Override
    public List<LikeResponse> getLikesOfPost(String id) {
        return List.of();
    }

    @Override
    public List<CommentResponse> getCommentsOfPost(String id) {
        return List.of();
    }
}
