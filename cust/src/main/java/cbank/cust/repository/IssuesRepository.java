package cbank.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cbank.cust.entity.Issues;

public interface IssuesRepository extends JpaRepository<Issues, Integer>{

}
