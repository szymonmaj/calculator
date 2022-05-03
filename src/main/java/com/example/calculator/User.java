package com.example.calculator;

import java.math.BigDecimal;

public class User {
private double a;
private double b;

public double add(){
    return a + b;
};

public double sub(){
    return a - b;
};

public double multi(){
    return a * b;
};

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
