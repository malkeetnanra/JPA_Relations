package com.JPA.JPArelation.Repository;

import com.JPA.JPArelation.models.SocialProfile;
import com.JPA.JPArelation.models.SocialUser;
import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialProfileRepository extends JpaRepository<SocialProfile, Long> {
}
