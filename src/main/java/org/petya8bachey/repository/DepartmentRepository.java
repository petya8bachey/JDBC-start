package org.petya8bachey.repository;

import org.petya8bachey.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository  @Transactional
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    List<Department> findAllByName(String name);
}
