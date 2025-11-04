package com.eagle0eye.portfolio_api.posts.service;

import com.eagle0eye.portfolio_api.posts.dto.PostDTO;
import com.eagle0eye.portfolio_api.posts.dto.PostMetaDTO;

import com.eagle0eye.portfolio_api.posts.mapper.PostsMapper;
import com.eagle0eye.portfolio_api.posts.model.Post;
import com.eagle0eye.portfolio_api.posts.model.PostMeta;
import com.eagle0eye.portfolio_api.posts.repository.PostMetaRepository;
import com.eagle0eye.portfolio_api.posts.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.eagle0eye.portfolio_api.posts.mapper.PostsMapper.postMetaToDTO;


@Service
@RequiredArgsConstructor
public class PostsServiceImpl implements PostsService {
    private static final Logger log = LoggerFactory.getLogger(PostsServiceImpl.class);
    private final PostsRepository postsRepository;
    private final PostMetaRepository  postMetaRepository;


    @Override
    public List<PostMetaDTO> getPosts() {
        return postMetaRepository.findAll().stream().map(PostsMapper::postMetaToDTO).toList();
    }

    @Override
    public List<PostMetaDTO> getPostsByType(String type) {
        return postMetaRepository.findAll().stream()
                .filter(postMeta ->  postMeta.getType().equals(type))
                .map(PostsMapper::postMetaToDTO)
                .toList();
    }

    @Override
    public List<PostMetaDTO> getPostsByField(String field) {
        return postMetaRepository.findAll().stream()
                .filter(postMeta ->  postMeta.getField().equals(field))
                .map(PostsMapper::postMetaToDTO)
                .toList();
    }

    @Override
    public PostDTO getPostById(String id) {
        Optional<PostMeta> found = postMetaRepository.findById(id);
        if (found.isEmpty()) {
            log.error("Post id {} not found", id);
            throw new RuntimeException("Post id " + id + " not found");
        }

        Optional<Post> post = postsRepository.findByPost(found.get().getId());
        return PostDTO.builder()
                .meta(postMetaToDTO(found.get()))
                .content(post.get().getContent())
                .build();
    }
}
