package com.JPA.JPArelation.Repository;

import com.JPA.JPArelation.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
