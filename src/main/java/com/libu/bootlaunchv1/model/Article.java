package com.libu.bootlaunchv1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Article {

    private Long id;

    private String author;
    /**
     * id : 1
     * title : 手摸手教你开发spring boot
     * content : c
     * createTime :
     * reader : [{"name":"zimug","age":18},{"name":"kobe","age":37}]
     */

    //@com.google.gson.annotations.SerializedName("id")
    private int idX;
    private String title;
    private String content;
    private String createTime;
    private List<ReaderBean> reader;

    public int getIdX() {
        return idX;
    }

    public void setIdX(int idX) {
        this.idX = idX;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<ReaderBean> getReader() {
        return reader;
    }

    public void setReader(List<ReaderBean> reader) {
        this.reader = reader;
    }

    public static class ReaderBean {
        /**
         * name : zimug
         * age : 18
         */

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
