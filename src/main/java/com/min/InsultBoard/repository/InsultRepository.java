package com.min.InsultBoard.repository;

import com.min.InsultBoard.entity.Insult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsultRepository extends JpaRepository<Insult, Long> {
}
