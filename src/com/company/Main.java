package com.company;

public class Main {

    public static void main(String[] args) {
     mayGoWalk( 60,9);
     mayGoWalk( 35,32);
     mayGoWalk( 7, 3);
     mayGoWalk( 67, 27);
     mayGoWalk( 7, 13);

    }
    public static String mayGoWalk(int age, int temperature) {
        String result = "";
        if (age> 19 && age < 45 && temperature > -20 && temperature <30){
            System.out.println("May Walk");
        }else if (age < 20 && temperature> 0 && temperature<= 28){
            System.out.println("May Walk");
        }else if (age > 45 && temperature > -10 && temperature <25){
            System.out.println("May Walk");
        }else {
            System.out.println("Stay at Home");
        }
        return result;
    }


}
