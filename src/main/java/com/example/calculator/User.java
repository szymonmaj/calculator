package com.example.calculator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
private double a;
private double b;
    @NotBlank
    @Size(max=3, message="Wrong")
public String C = "o";


public double add(){
    return a + b;
};

public double sub() { return a - b; };

public double multi() { return a * b; };

public double div(){
    if (b != 0){
    return a / b;}
    else { return 0;
    }
};

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

}
