package com.study.jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zzs
 * @date 2021/7/14 8:13
 */
public class Homework1 {
    public static void main(String[] args) {
        List<News> newsList = new ArrayList<>();
        newsList.add(new News("新冠确诊病例超千万，数百万印度教徒赴恒河“圣浴”引民众担忧"));
        newsList.add(new News("男子突然想起两个月前钓的鱼还在网兜里，捞起一看赶紧放生"));
        newsList.add(new News(null));
        System.out.println("newslist:" + newsList);
        Collections.reverse(newsList);
        System.out.println("倒序" + newsList);
        for (News news : newsList) {
            String title = news.getTitle();
            if (null == title) {
                news.setTitle("");
                continue;
            }
            if (title.length() > 15) {
                news.setTitle(title.substring(0, 15) + "...");
            }
        }
        System.out.println("处理过后标题: " + newsList);
    }
}

class News {
    private String title;
    private String content;


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

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }

    public News(String title) {
        this.title = title;
    }
}
