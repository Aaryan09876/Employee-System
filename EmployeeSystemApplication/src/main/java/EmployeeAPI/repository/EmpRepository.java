package EmployeeAPI.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EmployeeAPI.entity.Emp;
@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer>{
	public Optional<Emp> findByEname(String ename);

}
