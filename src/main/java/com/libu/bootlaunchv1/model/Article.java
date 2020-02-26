package com.libu.bootlaunchv1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {

    @JsonIgnore
    private Long  id;
    private String author;
    private String title;
    private String content;
    private Date createTime;
    private List<Reader> reader;
}