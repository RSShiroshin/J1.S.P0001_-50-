
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Main {
    private static int inputInt() {
        //loop until user input correct
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean check = true;
        //Nhap kich thuowc mang
        while(check){
            try{
                n = Integer.parseInt(sc.nextLine().trim());
                check = false;
            }catch (NumberFormatException e){
                System.err.println("Please input a number: ");
            }                    
        }
        return n;    
    }
    
    public static void display(int[] a){

        int i;
        for ( i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[i]);
    }
            
    public static int[] bubbleSort(int[] a){  
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }           
        }
        return a;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean check = true;
        //Nhap kich thuowc mang
        System.out.println("Input size of array(positive decimal number): ");
        while(check){
            try{
                n = Integer.parseInt(sc.nextLine().trim());
                if(n>0)
                    check = false;
                else
                    throw new Exception("Please input a positive decimal number: ");
            }catch (NumberFormatException e){
                System.err.println("Please input a positive decimal number: ");
            }catch (Exception e){
                System.err.println(e.getMessage());
            }                    
        }
        
//nhap range
        int max,min;
        System.out.println("Input range");
        System.out.print("max = ");
        max = inputInt();
        System.out.print("min = ");
        min = inputInt();
        if(max<min){
            int tmp=max;
            max = min;
            min = tmp;
        }
        
//        khoi tao va Nhap mang
        int[] a = new int[n];
        Random rn = new Random();
        for (int i = 0; i < n; i++) {            
            a[i]= (int)(Math.random() * (max - min + 1) + min); //+1 de gia tri random ko thap hon 1 don vi
        }                                                       //+min de gia tri tra ra tinh tu min
        
//        int[] a = {4,3,5,1,2};
        
        //in ra mang chua sort
        System.out.print("\nUnsorted array: ");
//        int i;
//        for ( i = 0; i < a.length-1; i++) {
//            System.out.print(a[i] + ", ");
//        }
//        System.out.print(a[i]);
        display(a);
        System.out.println();
        
        //ham bubble sort
//        for ( i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length - i - 1; j++) {
//                if (a[j] > a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//            int k;
//            for ( k = 0; k < a.length-1; k++) {
//              System.out.print(a[k] + ", ");
//            }
//            System.out.println(a[k]);
//                3, 4, 1, 2, 5
//                3, 1, 2, 4, 5
//                1, 2, 3, 4, 5
//                1, 2, 3, 4, 5
//                1, 2, 3, 4, 5
//        }
        System.out.println();
        System.out.print("Sorted array: ");
        display(bubbleSort(a));
                    
    }
}
