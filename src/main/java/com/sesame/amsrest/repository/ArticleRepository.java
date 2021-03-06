package com.sesame.amsrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesame.amsrest.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> { }
