package com.eagle0eye.portfolio_api.posts.repository;

import com.eagle0eye.portfolio_api.posts.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostsRepository extends MongoRepository<Post,String> {

    Optional<Post> findByPost(String post);
}
