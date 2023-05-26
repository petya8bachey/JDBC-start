package org.petya8bachey.application;

import org.petya8bachey.domain.*;

import java.util.List;
import java.util.Optional;

public interface DataBase {
    public void add(Employee employee);
    public void add(Department department);
    public void add(Organization organization);
    public void delete(Employee employee);
    public void delete(Department department);
    public void delete(Organization organization);
    public void delete(Integer ID);
    public Optional<Employee> findEmployeeById(Integer ID);
    public Optional<Department> findDepartmentById(Integer ID);
    public Optional<Organization> findOrganizationById(Integer ID);
    public List<Employee> findEmployee(String lastname);
    public List<Department> findDepartment(String name);
    public List<Organization> findOrganization(String name);
    public void setEmployeeInfo(String firstname, String lastname, Integer ID);
    public void setEmployeeInfo(Department department, Integer ID);
    public List<Employee> getAllEmployee();
    public List<Department> getAllDepartment();
    public List<Organization> getAllOrganization();
}
