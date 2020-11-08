package com.estudo.blog.util;

import com.estudo.blog.model.Post;
import com.estudo.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    BlogRepository blogRepository;

    //@PostConstruct
    public void savePosts(){
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Lia");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut aliquam sollicitudin metus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus aliquam sem nulla, vitae egestas libero rutrum sed. Vestibulum sem lorem, dapibus vitae scelerisque sed, aliquet sed nisl. Suspendisse potenti. Vestibulum ultricies eu dui eu suscipit. Sed ut gravida nisi.");

        Post post2 = new Post();
        post2.setAutor("Lia");
        post2.setData(LocalDate.now());
        post2.setTitulo("AWS");
        post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut aliquam sollicitudin metus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus aliquam sem nulla, vitae egestas libero rutrum sed. Vestibulum sem lorem, dapibus vitae scelerisque sed, aliquet sed nisl. Suspendisse potenti. Vestibulum ultricies eu dui eu suscipit. Sed ut gravida nisi.");

        postList.add(post1);
        postList.add(post2);

        for (Post post : postList) {
            blogRepository.save(post);
            System.out.println(post.getId());
        }
    }
}
