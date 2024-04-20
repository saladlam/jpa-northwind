package info.saladlam.example.jpa.northwind.dto;

import java.math.BigDecimal;

public class NameValueDto {

    private String name;
    private BigDecimal value;

    public NameValueDto(String name, BigDecimal value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
