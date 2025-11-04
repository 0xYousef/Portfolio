package com.eagle0eye.metrics_api.metrics.mapper;

import com.eagle0eye.metrics_api.metrics.dto.CommentResponse;
import com.eagle0eye.metrics_api.metrics.dto.LikeResponse;
import com.eagle0eye.metrics_api.metrics.dto.PostResponse;
import com.eagle0eye.metrics_api.metrics.model.Comment;
import com.eagle0eye.metrics_api.metrics.model.SocialPost;
import com.eagle0eye.metrics_api.metrics.model.UserActions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PostMapper {

    public static PostResponse toPostResponse(SocialPost post) {
        if (post == null || post.getInteractions() == null) {
            return PostResponse.builder().build();
        }

        List<LikeResponse> likes = toLikesResponse(post);
        List<CommentResponse> comments = toCommentsResponse(post);
        int sharesCount = (int) post.getInteractions().stream()
                .filter(UserActions::isShares)
                .count();

        return PostResponse.builder()
                .likes(likes)
                .comments(comments)
                .shares(sharesCount)
                .build();
    }

    public static List<LikeResponse> toLikesResponse(SocialPost post) {
        if (post.getInteractions() == null) return new ArrayList<>();

        return post.getInteractions().stream()
                .filter(UserActions::isLiked)
                .map(interaction -> LikeResponse.builder()
                        .author(interaction.getName())
                        .liked(true)
                        .build())
                .collect(Collectors.toList());
    }

    public static List<CommentResponse> toCommentsResponse(SocialPost post) {
        if (post.getInteractions() == null) return new ArrayList<>();

        return post.getInteractions().stream()
                .flatMap(interaction -> interaction.getComments().stream()
                        .map(comment -> toCommentResponse(interaction, comment)))
                .collect(Collectors.toList());
    }

    private static CommentResponse toCommentResponse(UserActions interaction, Comment comment) {
        return CommentResponse.builder()
                .author(interaction.getName())
                .comment(comment.getText())
                .date(comment.getDate())
                .build();
    }
}
