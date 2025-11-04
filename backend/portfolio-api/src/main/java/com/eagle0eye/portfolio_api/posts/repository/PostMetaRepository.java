package com.eagle0eye.portfolio_api.posts.repository;

import com.eagle0eye.portfolio_api.posts.model.PostMeta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostMetaRepository extends MongoRepository<PostMeta,String> {
}
