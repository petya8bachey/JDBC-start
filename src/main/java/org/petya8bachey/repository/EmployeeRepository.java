package org.petya8bachey.repository;

import org.petya8bachey.domain.Department;
import org.petya8bachey.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository  @Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByLastname(String lastname);
    @Modifying
    @Query("update Employee u set u.firstname = ?1, u.lastname = ?2 where u.id = ?3")
    void setInfoById(String firstname, String lastname, Integer userId);

    @Modifying
    @Query("update Employee u set u.affiliation = ?1 where u.id = ?2")
    void setAffiliationById(Department department, Integer userId);
}
