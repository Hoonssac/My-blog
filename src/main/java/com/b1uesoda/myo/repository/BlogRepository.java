package com.b1uesoda.myo.repository;

import com.b1uesoda.myo.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
