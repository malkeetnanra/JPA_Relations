package com.JPA.JPArelation.Repository;

import com.JPA.JPArelation.models.SocialProfile;
import com.JPA.JPArelation.models.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialUserRepository extends JpaRepository<SocialUser, Long> {
}
