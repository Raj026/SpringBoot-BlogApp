package com.springboot.blog.payload;

import lombok.Data;

@Data
public class CommentDto {
    private String name;
    private String body;
    private String email;
}
