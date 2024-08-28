package com.springboot.blog.service;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(Long postId, CommentDto commentDto);
    List<CommentDto> getCommentsByPostId(Long postId);

    CommentDto getCommentById(Long postId, Long id);

    CommentDto updateCommentById(Long postId, Long id, CommentDto commentDto);

    String deleteCommentById(Long postId, Long id);
}
