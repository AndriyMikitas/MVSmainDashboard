package com.example.generaldashboard;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingPlaceRepository extends JpaRepository<WorkingPlace, Long> {
}
