package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    @NotEmpty(message = "Name should not be empty")
    private String name;

    @NotEmpty(message = "Body should not be empty")
    @Size(min = 10, message = "Body character should have at least 10 characters")
    private String body;

    @Email
    @NotEmpty(message = "Email should not be null or Empty")
    private String email;
}
