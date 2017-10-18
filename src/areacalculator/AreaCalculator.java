/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalculator;

import java.util.Scanner;

/**
 *
 * @author Saleron
 */
public class AreaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, h, w, r, ar, result;
        String shape;
        //a = lenght of side
        //b = base
        //h = vertical hight
        //w = width
        //r = radius
        //ar = angle in radius
        //I know it would be enought to use only 3 variable but i wanted to stick with the mathematical designations.
        Scanner input = new Scanner (System.in);
        
        System.out.println("Which shapes area do you want to calculate?");
        System.out.println("");
        System.out.println("For triangle type in TA.");
        System.out.println("For rectangle type in RA.");
        System.out.println("For trapezium type in TP.");
        System.out.println("For square type in SQ.");
        System.out.println("For parallelogram type in PL.");
        System.out.println("For circle type in CR.");
        System.out.println("For sector type in SC.");
        
        shape = input.nextLine();
        
            while (!shape.equalsIgnoreCase("TA") && !shape.equalsIgnoreCase("RA") && !shape.equalsIgnoreCase("TP") && !shape.equalsIgnoreCase("SQ") && !shape.equalsIgnoreCase("PL") && !shape.equalsIgnoreCase("CR") && !shape.equalsIgnoreCase("SC"))
            {
                System.out.println("Wrong code, try again:");
                shape = input.nextLine();
            }
                    if (shape.equalsIgnoreCase("TA"))
                        {
                            System.out.println("Please type in the lenght of the base:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            b = input.nextDouble();
                            System.out.println("Please type in the hight:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            h = input.nextDouble();
                            result = (b * h) / 2;
                            System.out.println("The area of the triangle is: " + result);
                        }

                    if (shape.equalsIgnoreCase("RA"))
                        {
                            System.out.println("Please type in the width:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            w = input.nextDouble();
                            System.out.println("Please type in the hight:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            h = input.nextDouble();
                            result = w * h;
                            System.out.println("The area of the rectangle is: " + result);
                        }

                    if (shape.equalsIgnoreCase("TP"))
                        {
                            System.out.println("Please type in the lenght of the side:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            a = input.nextDouble();
                            System.out.println("Please type in the lenght of the base:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            b = input.nextDouble();
                            System.out.println("Please type in the hight:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            h = input.nextDouble();
                            result = ((a + b) / 2) * h;
                            System.out.println("The area of the trapezium is: " + result);
                        }

                    if (shape.equalsIgnoreCase("SQ"))
                        {
                            System.out.println("Please type in the lenght of the side:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            a = input.nextDouble();
                            result = a * a;
                            System.out.println("The area of the square is: " + result);
                        }

                    if (shape.equalsIgnoreCase("PL"))
                        {
                            System.out.println("Please type in the lenght of the base:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            b = input.nextDouble();
                            System.out.println("Please type in the hight:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            h = input.nextDouble();
                            result = b * h;
                            System.out.println("The area of the parallelogram is: " + result);
                        }

                    if (shape.equalsIgnoreCase("CR"))
                        {
                            System.out.println("Please type in the lenght of the radius:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            r = input.nextDouble();
                            result = Math.PI * r * r;
                            System.out.println("The area of the circle is: " + result);
                        }

                    if (shape.equalsIgnoreCase("SC"))
                        {
                            System.out.println("Please type in the lenght of the radius:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            r = input.nextDouble();
                            System.out.println("Please type in the angle in the radius:");
                            while (!input.hasNextDouble())
                            {
                                System.out.println("This is not a number, try again:");
                                input.next();
                            }
                            ar = input.nextDouble();
                            result = 0.5 * r * r * ar;
                            System.out.println("The area of the sector is: " + result);
                        }
                    
    }
    
}
