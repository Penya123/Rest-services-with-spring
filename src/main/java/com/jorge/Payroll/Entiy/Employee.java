package com.jorge.Payroll.Entiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String firtsName;
    private String lastName;
    private String role;

    public Employee() {
    }

    public Employee(String role,String lastname, String name) {
        this.role = role;
        this.lastName = lastname;
        this.firtsName = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.firtsName, employee.firtsName)
                && Objects.equals(this.role, employee.role)
                && Objects.equals(this.lastName, employee.lastName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.firtsName, this.lastName, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", " +
                "name='" + this.firtsName + '\'' + ", " +
                "last name='" + this.lastName + '\'' + ", " +
                "role='" + this.role + '\'' + '}';
    }
}
