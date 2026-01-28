package com.jorge.Payroll.Respository;

import com.jorge.Payroll.Entiy.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
