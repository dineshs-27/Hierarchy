package Topper;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.*;

class Output {
    String Name;
    String RegNo;
    float Average;

    Output(String Name, String RegNo, float Average){
        this.Name = Name;
        this.RegNo = RegNo;
        this.Average = Average;
    }

    public void display(){
        System.out.println("Name : " + Name);
        System.out.println("RegNo : " + RegNo);
        System.out.println("Average : " + Average);
    }
}
public class Rank {
    public static void main(String[] args) throws IOException {
        Scanner getInput = new Scanner(System.in);
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Students : ");
        int a = getInput.nextInt();
        Output[] details = new Output[a];
        for(int i=0; i<a; i++){
            System.out.println("\nEnter the Name " + (i+1) + " : ");
            String name = Input.readLine();
            System.out.println("Enter the Register Number : ");
            String regNo = Input.readLine();
            System.out.println("Enter the Mark 1 : ");
            int m1 = getInput.nextInt();
            System.out.println("Enter the Mark 2 : ");
            int m2 = getInput.nextInt();
            System.out.println("Enter the Mark 3 : ");
            int m3 = getInput.nextInt();
            System.out.println("Enter the Mark 4 : ");
            int m4 = getInput.nextInt();
            System.out.println("Enter the Mark 5 : ");
            int m5 = getInput.nextInt();
            float Avg = (m1+m2+m3+m4+m5)/5;
            details[i] = new Output(name,regNo,Avg);
        }
    }
}