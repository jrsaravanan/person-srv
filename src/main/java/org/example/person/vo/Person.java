package org.example.person.vo;

public class Person {

    private Long id;
    private String name;
    private String deptName;

    public Person(Long id, String name, String departmentName) {
        this.id = id;
        this.name = name;
        this.deptName = departmentName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}