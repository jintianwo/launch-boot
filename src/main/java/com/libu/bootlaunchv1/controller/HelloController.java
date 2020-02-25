package com.libu.bootlaunchv1.controller;

import com.libu.bootlaunchv1.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Article hello() {

        //Article article = new Article(1L,"libu");

        //article.setAuthor("libu1");

        Article article1 = Article.builder().id(2L).author("libush5665").build();

        log.info("测试"+article1);
        return article1;
    }

}

