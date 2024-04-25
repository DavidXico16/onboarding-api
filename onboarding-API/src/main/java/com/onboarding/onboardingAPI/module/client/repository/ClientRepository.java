package com.onboarding.onboardingAPI.module.client.repository;

import com.onboarding.onboardingAPI.module.client.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
    public ClientRepository findOneById(Integer id);
}
