package com.eagle0eye.metrics_api.metrics.repository;

import com.eagle0eye.metrics_api.metrics.model.SocialPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialPostRepository extends MongoRepository<SocialPost, String> {
    // Page<SocialPost> getAllPosts(Pageable pageable);
    // SocialPost getPostById(String id);
    // SocialPost savePost(SocialPost post);
    // void deletePost(String id);
}
