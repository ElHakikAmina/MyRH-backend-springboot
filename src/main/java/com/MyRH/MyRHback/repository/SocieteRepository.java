package com.MyRH.MyRHback.repository;

import com.MyRH.MyRHback.entity.Societe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocieteRepository extends JpaRepository<Societe, Long> {
}
