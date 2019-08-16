package edu.escuelaing.arem;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class of an App
 * @author Sergio Ruiz
 * 
 */
public class App 
{
    private static LinkedList lK;
    
    /**
     * Encapsulates the application's main entry point.
     * @param args
     */
    public static void main( String[] args ) {
        
        lK = new LinkedList();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int userOption;
        int value;
 
        while (!exit) {
            System.out.println("Here you can calculate mean and standard deviation");
            System.out.println("Choose 1 if you want to add one element to the Linked List");
            System.out.println("Choose 2 if you want to delete one element to the Linked List");
            System.out.println("Choose 3 if you want calculate Linked List´s mean");
            System.out.println("Choose 4 if you want calculate Linked List´s standard deviation");
            System.out.println("Otherwise, choose 5 to exit");
 
            try {
 
                System.out.println("Choose one option");
                userOption = sc.nextInt();
 
                switch (userOption) {
                    case 1:
                        System.out.println("You have chosen 1");
                        System.out.println("How many values do you want to add?");
                        int quantity = sc.nextInt();
                        System.out.println("Inser values");
                        for (int i = 0; i < quantity; i++) {
                            value = sc.nextInt();
                            lK.append(value);
                        }
                        System.out.println("Values added");
                        break;
                    case 2:
                        System.out.println("You have chosen 2");
                        value = sc.nextInt();
                        System.out.println("Insert value to delete");
                        lK.delete(value);
                        System.out.println("Value deleted");
                        break;
                    case 3:
                        System.out.println("You have chosen 3");
                        System.out.println("Mean is: " + mean());
                        break;
                    case 4:
                        System.out.println("You have chosen 4");
                        System.out.println("Standard Deviation is: " + standardDev());
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }
        sc.close();
        
    }
    
    /**
     * Method that calculates LinkedList's mean
     * @return ans Mean value
     */
    public static float mean() {
        
        float values = 0;
        float add = 0;
        Node current = lK.getHead();
        
        while (current != null) {
            values += 1;
            add += current.getData();
            current = current.getNext();
        }
        
        float ans = add/values;
        return ans;
    }
    
    /**
     * Method that calculates LinkedList's standard deviation
     * @return Standard deviation value
     */
    public static String standardDev(){
        double mean = mean();
        double add = 0;
        double values = -1;
        Node current = lK.getHead();
        DecimalFormat decimalF = new DecimalFormat("#.##");
        decimalF.setRoundingMode(RoundingMode.CEILING);
        
        while (current != null){
            values += 1;
            add += (current.getData()-mean)*(current.getData()-mean);
            current = current.getNext();
        }
        
        return decimalF.format(Math.sqrt(add/values));
    }
}