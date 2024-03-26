package com.api.employerManagement.repository;

import com.api.employerManagement.entity.Employer;
import org.springframework.data.repository.CrudRepository;

public interface EmployerRepository extends CrudRepository<Employer, Integer> {

}
