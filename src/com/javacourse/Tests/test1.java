package com.javacourse.Tests;



public class test1 {

    public static void main (String[] args) {
    int a= 2;
    int b= 2;
    int r= 1;
    double gip= Math.sqrt(a*a+b*b);
    if (gip <= r*2)
    {
            System.out.println("Картонка с радиусом " + r + " закрывает полностью отверстие размера "+ a +" * "+ b);
    }
    else System.out.println("Картонка с радиусом " + r + " не закрывает полностью отверстие размера "+ a +" * "+ b);

        }
    }
