package com.MyRH.MyRHback.repository;

import com.MyRH.MyRHback.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {
    Agent findByEmailAndPassword(String email, String password);
}
