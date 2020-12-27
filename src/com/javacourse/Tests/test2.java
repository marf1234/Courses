/*package com.javacourse.Tests;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        short day, month, year;
        System.out.print("Введите день: ");
        day = new Scanner(System.in).nextShort();
        System.out.print("Введите месяц: ");
        month = new Scanner(System.in).nextShort();
        System.out.print("Введите год: ");
        year = new Scanner(System.in).nextShort();

        if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8)|| (month == 10)||(month == 12)) && (day=31))
        {
            day= 1;
            month=month+1;
        }
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
        {

        }
        System.out.println(day + "  "+month+ "  "+year);



    }
}



       /* if(n == 1)
        {
        System.out.println("Понедельник");
        }
        else if(n == 2)
        {
        System.out.println("Вторник");
        }
        else if(n == 3)
        {
        System.out.println("Среда");
        }
        else if(n == 4)
        {
        System.out.println("Четверг");
        }
        else if(n == 5)
        {
        System.out.println("Пятница");
        }
        else if(n == 6)
        {
        System.out.println("Суббота");
        }
        else if(n == 7)
        {
        System.out.println("Воскресенье");
        }
        else
        {
        System.out.println("Дня с таким номером не существует");
        }*/