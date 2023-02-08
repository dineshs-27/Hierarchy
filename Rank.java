package Topper;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.Scanner;

public class Rank {
    public static void main(String[] args) throws IOException {
        Scanner getInput = new Scanner(System.in);
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<Integer> Regno = new ArrayList<>();
        ArrayList<Float> Avg = new ArrayList<>();
        ArrayList<Float> SortedAvg = new ArrayList<>();
        System.out.println("Enter the number of students : ");
        int x = getInput.nextInt();
        for(int i=0; i<x; i++){
            System.out.println("\nEnter the name : ");
            String name = Input.readLine();
            Name.add(name);
            System.out.println("Enter the Register Number : ");
            int regno = getInput.nextInt();
            Regno.add(regno);
            System.out.println("Mark 1 : ");
            int m1 = getInput.nextInt();
            System.out.println("Mark 2 : ");
            int m2 = getInput.nextInt();
            System.out.println("Mark 3 : ");
            int m3 = getInput.nextInt();
            System.out.println("Mark 4 : ");
            int m4 = getInput.nextInt();
            System.out.println("Mark 5 : ");
            int m5 = getInput.nextInt();
            int total = (m1+m2+m3+m4+m5);
            float avg = total/5;
            Avg.add(avg);
        }
        float[] arr = new float[Avg.size()];
        for(int j=0; j<Avg.size(); j++){
            arr[j] = Avg.get(j);
        }
        float temp;
        for(int k=0; k<arr.length; k++){
            for(int l=k+1; l< arr.length; l++){
                if(arr[k]<arr[l]){
                    temp = arr[l];
                    arr[l] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for(int m=0; m< arr.length; m++){
            SortedAvg.add(arr[m]);
        }
        for(int n=0; n<SortedAvg.size(); n++) {
            if(SortedAvg.get(n)>90){
                for(int p=0; p<Avg.size(); p++) {
                    if(SortedAvg.get(n).equals(Avg.get(p))){
                        System.out.println("\nName : " + Name.get(p));
                        System.out.println("Register Number : " + Regno.get(p));
                        System.out.println("Average : " + SortedAvg.get(n));
                        System.out.println("Rank : " + (n+1) + " rank");
                    }
                }
            }
        }
    }
}