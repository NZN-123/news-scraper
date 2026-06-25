package oop.search.domain;

// https://developers.naver.com/docs/serviceapi/search/blog/blog.md#%EA%B2%80%EC%83%89-api-%EB%B8%94%EB%A1%9C%EA%B7%B8-%EA%B2%80%EC%83%89-%EA%B5%AC%ED%98%84-%EC%98%88%EC%A0%9C

public record NewsResult(
        String title,
        String description,
        String url,
        String pubDate
) {
    public static void main(String[] args) {
        NewsResult result = new NewsResult("환욜 1600원 되나?", "음?", "https://naver.com", "2026.06.25");
        System.out.println("result = " + result);
        System.out.println("result.title() = " + result.title());

    }
}
