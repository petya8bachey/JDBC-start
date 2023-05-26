package org.petya8bachey.application;

import org.petya8bachey.domain.Department;
import org.petya8bachey.domain.Employee;
import org.petya8bachey.domain.Organization;
import org.petya8bachey.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DataBaseImpl implements DataBase{
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    OrganizationRepository organizationRepository;

    public void add(Employee employee) { employeeRepository.save(employee);}
    @Override
    public void add(Department department) { departmentRepository.save(department); }
    @Override
    public void add(Organization organization) {organizationRepository.save(organization);}
    @Override
    public void delete(Employee employee) {employeeRepository.delete(employee);}
    @Override
    public void delete(Department department) {departmentRepository.delete(department);}
    @Override
    public void delete(Organization organization) {organizationRepository.delete(organization);}
    @Override
    public void delete(Integer ID) {
        employeeRepository.deleteById(ID);
        departmentRepository.deleteById(ID);
        organizationRepository.deleteById(ID);
    }
    @Override
    public Optional<Employee> findEmployeeById(Integer ID) {  return employeeRepository.findById(ID);   }
    @Override
    public Optional<Department> findDepartmentById(Integer ID) {  return departmentRepository.findById(ID);  }
    @Override
    public Optional<Organization> findOrganizationById(Integer ID) { return organizationRepository.findById(ID); }

    @Override
    public List<Employee> findEmployee(String lastname) {
        return employeeRepository.findAllByLastname(lastname);
    }

    @Override
    public List<Department> findDepartment(String name) {
        return departmentRepository.findAllByName(name);
    }

    @Override
    public List<Organization> findOrganization(String name) {
        return organizationRepository.findAllByName(name);
    }

    @Override
    public void setEmployeeInfo(String firstname, String lastname, Integer ID) {
        employeeRepository.setInfoById(firstname, lastname,ID);
    }

    @Override
    public void setEmployeeInfo(Department department, Integer ID) {
        employeeRepository.setAffiliationById(department, ID);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public List<Organization> getAllOrganization() {
        return organizationRepository.findAll();
    }
}
