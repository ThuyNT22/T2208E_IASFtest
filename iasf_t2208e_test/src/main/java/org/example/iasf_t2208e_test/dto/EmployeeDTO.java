package org.example.iasf_t2208e_test.dto;

public class EmployeeDTO {
    private Long id;
    private String name;
    private Double wage;

    // Constructors
    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, String name, Double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }
}
