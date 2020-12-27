package com.javacourse.project1;

public class Main {
    public static void main(String[] args) {
        int marks[] = {2,1,3,6,3,8,5,4};
        int m = marks[0] + marks[1];
        for(int i=1;i<marks.length-1;i++){
            if(marks[i] + marks[i+1] > m)
                m=marks[i] + marks[i+1];
        }
        System.out.println("m=" + m);
        }
    }

    //long tBegin = System.currentTimeMillis();
    //long tEnd = System.currentTimeMillis();
    //System.out.println(tBegin);
    //System.out.println(tEnd);
//System.out.println("Hello world");
     //   float x = (int)(Math.random()*10 + 1);
    //   int y= 2;
     //   System.out.println(x);