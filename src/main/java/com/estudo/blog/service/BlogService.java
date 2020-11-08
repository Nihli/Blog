package com.estudo.blog.service;

import com.estudo.blog.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
