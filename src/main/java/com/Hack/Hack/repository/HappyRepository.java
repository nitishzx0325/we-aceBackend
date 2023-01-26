package com.Hack.Hack.repository;

import com.Hack.Hack.model.Happy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HappyRepository extends JpaRepository<Happy,Long> {
}
