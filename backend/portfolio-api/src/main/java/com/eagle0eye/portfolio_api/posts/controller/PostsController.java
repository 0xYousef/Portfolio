package com.eagle0eye.portfolio_api.posts.controller;

import com.eagle0eye.portfolio_api.posts.dto.PostDTO;
import com.eagle0eye.portfolio_api.posts.dto.PostMetaDTO;
import com.eagle0eye.portfolio_api.posts.service.PostsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/portfolio/api/posts")
public class PostsController {

    private final PostsServiceImpl postsService;

    @GetMapping("/")
    public ResponseEntity<List<PostMetaDTO>> getPosts(
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String field,
            @RequestParam(required = false) List<String> tags
    ) {

        return ResponseEntity.ok(postsService.getPosts());
    }
    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(postsService.getPostById(id));
    }

}
