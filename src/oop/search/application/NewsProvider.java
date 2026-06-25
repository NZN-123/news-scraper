package oop.search.application;

import oop.search.domain.NewsResult;

import java.util.List;

/**
 * 검색을 위한 인터페이스
 */

public interface NewsProvider {
    /// searchQuery : 검색 Limit : 갯수 제한
    List<NewsResult> fetchNews(String searchQuery, int limit);
}
