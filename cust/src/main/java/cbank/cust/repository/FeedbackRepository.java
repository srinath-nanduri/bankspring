package cbank.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cbank.cust.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

}
