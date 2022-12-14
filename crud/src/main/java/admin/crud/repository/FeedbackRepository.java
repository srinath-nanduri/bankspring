package admin.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import admin.crud.entity.Feedback;


public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

}
