package com.harini.SampleProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CalculatorDTO {

    private Double num1;
    private Double num2;
    private Double num3;
    private Double num4;
    private Double num5;
    @JsonProperty("num61")
    private Double num6;

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getNum3() {
        return num3;
    }

    public void setNum3(Double num3) {
        this.num3 = num3;
    }

    public Double getNum4() {
        return num4;
    }

    public void setNum4(Double num4) {
        this.num4 = num4;
    }

    public Double getNum5() {
        return num5;
    }

    public void setNum5(Double num5) {
        this.num5 = num5;
    }

    public Double getNum6() {
        return num6;
    }

    public void setNum6(Double num6) {
        this.num6 = num6;
    }


}
