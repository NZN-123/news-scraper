package oop.search.presentation;

import oop.search.application.NewsPublisher;
import oop.search.domain.NewsResult;

import java.util.List;

public class ConsoleNewsPublisher implements NewsPublisher {
    @Override
    public void publish(String topic, List<NewsResult> newsResults) {
        System.out.println("뉴스 주제: %s".formatted(topic));
        for (NewsResult newsResult : newsResults) {
//            System.out.println(newsResult);
            System.out.println("=".repeat(16));
            String output = """
                    제목 : %s
                    링크 : %s
                    설명 : %s
                    발행일자 : %s
                    
                    """.formatted(newsResult.title(),
                            newsResult.url(),
                            newsResult.description(),
                            newsResult.pubDate())
                    .trim();
            System.out.println(output);
        }

    }

    public static void main(String[] args) {
        NewsPublisher cnp = new ConsoleNewsPublisher();
        cnp.publish("축구", List.of(new NewsResult(
                "축구 졌어",
                "32강 진출 못해?",
                "http://naver.com",
                "2026.06.25"
        ), new NewsResult(
                "머리아프다",
                "다음엔 누구랑 붙지?",
                "http://naver.com",
                "2026.06.25"
        )));
    }
}
