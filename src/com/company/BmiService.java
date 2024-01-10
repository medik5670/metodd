package com.company;

public class BmiService {
    int weight = 98;
    int height = (int) 1.87;
    int index;

    public int calculate(int index) {
        return weight / (height * height);
    }
}
