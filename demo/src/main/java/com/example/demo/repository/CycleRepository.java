package com.example.demo.repository;

import com.example.demo.model.Cycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CycleRepository extends JpaRepository<Cycle,Long> {
}
