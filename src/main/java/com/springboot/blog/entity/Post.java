package com.springboot.blog.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
//We Removed the Data annotation as it was throwing the toString error while model-mapping with the DTO.
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})})
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "content", nullable = false)
    private String content;

    //Using set instead of List as list contains the duplicate but the set does not contain the duplicates.
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true) //here this is the bi-directional mapping and mappedBy method is
    private Set<Comment> comments = new HashSet<>();


}
