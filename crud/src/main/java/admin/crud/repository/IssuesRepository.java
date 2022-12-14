package admin.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import admin.crud.entity.Issues;



public interface IssuesRepository extends JpaRepository<Issues, Integer>{

}