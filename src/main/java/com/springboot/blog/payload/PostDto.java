package com.springboot.blog.payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    @NotEmpty
    @Size(min = 2, message = "Post title should at least have 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Post description should at least have 10 characters")
    private String description;

    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
