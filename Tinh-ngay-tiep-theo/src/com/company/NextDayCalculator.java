package com.company;
import java.util.Scanner;
public class NextDayCalculator {
    public static boolean NamNhuan(int year){
        return ((year%4 == 0 && year % 100 !=0)|| year % 400 == 0);
    }
    public static int NumberOfDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                return 31;
            }
            case 2: {
                if (NamNhuan(year)) {
                    return 29;
                }
                return 28;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                return 30;
            }
        } return 0;
    }
    public static void NgayTiepTheo(int year, int month, int day){
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        if(year > 0 && month >0 && month <13 && day> 0 && day<=NumberOfDaysInMonth(month,year))
            nextDay = day +1;

        if (month != 12 && day==NumberOfDaysInMonth(month,year)){
            nextDay = day +1;
            nextMonth = month +1;
        } else if(month == 12 && day ==NumberOfDaysInMonth(month,year)){
            nextDay =1;
            nextMonth =1;
            nextYear = year + 1;
        } else if(month == 2){
            if(NamNhuan(year)){
                if(day ==29){
                    nextDay = 1;
                    nextMonth = month +1;
                }
            }
        } else if(day == 28){
            nextDay = 1;
            nextMonth = month +1;
        }
        System.out.println("Ngay tiep theo la: " + nextDay + "/" + nextMonth + "/" + nextYear);
    }

    public static void main(String[] args) {
        NgayTiepTheo(2018,12,31);
    }
}

