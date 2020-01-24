package com.company;

import javafx.animation.Animation;

import java.util.Scanner;

public class Main {
// I am taking 3 inputs but it was 5
    public static void main(String[] args) {
	// write your code here


        Shirt[] shirts = new Shirt[3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<3;i++)
        {
            int tag = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            char g = sc.nextLine().charAt(0);
            shirts[i] = new Shirt(tag,brand,price,g);
        }



        double price = sc.nextDouble();

        for(Shirt s: shirts)
        {
            System.out.println(getDiscountPrice(s));
        }

        Shirt[] result = getShirtWithMoreThanSpecificPrice(shirts,price);

        for(Shirt s: result)
        {
            //if(s!=null)
            System.out.println(s.getTag()+" "+s.getPrice()+ " " + s.getBrand());
        }
    }

    private static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts, double price) {

        //Shirt[] forNull = new Shirt[shirts.length];

        int index=0;
        int j=0;
        for(int i=0;i<shirts.length;i++) {
            if (price <shirts[i].getPrice()){
             //   temp[index]=shirts[i];
                index++;
            }
           /*else {
                forNull[j]=shirts[i];
                j++;
            }*/
        }
        Shirt[] temp = new Shirt[index];
        int counter=0;
        for(int i=0;i<shirts.length;i++) {
            if (price <shirts[i].getPrice()){
                  temp[counter]=shirts[i];
                  counter++;
            }
        }

        return temp;
    }

    private static double getDiscountPrice(Shirt s) {
        double temp;
        if(s.getGendar()=='m'){
            temp= (s.getPrice()-((s.getPrice()*10)/100));
        }
        else if(s.getGendar()=='f'){
            temp= (s.getPrice()-((s.getPrice()*20)/100));
        }
        else {
            temp= (s.getPrice()-((s.getPrice()*30)/100));
        }
        return temp;
    }
}
