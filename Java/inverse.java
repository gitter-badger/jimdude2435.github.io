//This program will find the inverses of linear equations including square roots, parabolas, cubed roots, and cubed equations.

import java.util.*;

public class Inverses
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Types of equations: sqrt cubert square cubed");
        System.out.print("Enter equation: ");
        String eqtype = input.nextLine();

        if (eqtype.equals("square"))
        {
            System.out.println("Parabola selected.");

            System.out.print("Enter coefficient: ");
            int coefficient = input.nextInt();

            System.out.print("Enter number inside the parentheses: ");
            int inside = input.nextInt();

            System.out.print("Enter number outside the parentheses: ");
            int outside = input.nextInt();

            System.out.println("Your equation should look like this: ");
            
            if (inside < 0)
            {
                int newinside = inside * (-1);
                System.out.print("y = " + coefficient + "(x-" + newinside + ")²");
                if (outside < 0)
                {
                    int newoutside = outside * (-1);
                    System.out.println(" - " + newoutside);
                }
                else
                {
                    System.out.println(" + " + outside);
                }
            }
            else
            {
                System.out.print("y = " + coefficient + "(x+" + inside + ")²");
                if (outside < 0)
                {
                    int newoutside = outside * (-1);
                    System.out.println(" - " + newoutside);
                }
                else
                {
                    System.out.println(" + " + outside);
                }
            }
            
            System.out.println("If so, your inverse looks like this: ");
            if (coefficient > 0)
            {
                System.out.print("x = -" + coefficient + "√y");
            }
            else
            {
                int newcoeff = coefficient * (-1);
                System.out.print("x = " + newcoeff + "√y");
            }
            if (outside < 0)
            {
                int newoutside = outside * (-1);
                System.out.print("+" + newoutside);
                
                if (inside < 0)
                {
                    int newinside = inside * (-1);
                    System.out.print(" + " + newinside);
                }
                else
                {
                    System.out.print(" - " + inside);
                }
            }
            else
            {
                System.out.print("-" + outside);
                
                if (inside < 0)
                {
                    int newinside = inside * (-1);
                    System.out.print(" + " + newinside);
                }
                else
                {
                    System.out.print(" - " + inside);
                }
            }
        }
        
        if (eqtype.equals("sqrt"))
        {
            System.out.println("Square root selected.");
            
            System.out.print("Enter coefficient: ");
            int coefficient = input.nextInt();
            
            System.out.print("\nEnter number inside radical: ");
            int inside = input.nextInt();
            
            System.out.print("\nEnter number outside radical: ");
            int outside = input.nextInt();
            
            System.out.print("\nYour equation should look like this: ");
            
            System.out.print("y = " + coefficient + "√x");
            
            if (inside < 0)
            {
                int newinside = inside * (-1);
                System.out.print("-" + newinside);
            }
            else
            {
                System.out.print("+" + inside);
            }
            
            if (outside < 0)
            {
                int newoutside = outside * (-1);
                System.out.print(" - " + newoutside);
            }
            else
            {
                System.out.print(" + " + outside);
            }
            
            System.out.println("\nIf so, your inverse looks like this: ");
            
            if (coefficient < 0)
            {
                int newcoeff = coefficient * (-1);
                System.out.print("x = " + newcoeff + "√y");
            }
            else
            {
                System.out.print("x = -" + coefficient + "√y");
            }
            
            if (outside < 0)
            {
                int newoutside = outside * (-1);
                System.out.print("+" + newoutside);
            }
            else
            {
                System.out.print("-" + outside);
            }
            
            if (inside < 0)
            {
                int newinside = inside * (-1);
                System.out.print(" + " + newinside);
            }
            else
            {
                System.out.print(" - " + inside);
            }
        }
        
        if (eqtype.equals("cubed"))
        {
            System.out.println ("Cubed equation selected.");
            
            System.out.print("Enter coefficient: ");
            int coefficient = input.nextInt();
            
            System.out.print("\nEnter number inside parentheses: ");
            int inside = input.nextInt();
            
            System.out.print("\nEnter number outside parenthese: ");
            int outside = input.nextInt();
            
            System.out.print("\nYour equation should look like this: ");
            
            System.out.print("y = " + coefficient + "(x");
            
            if (inside < 0)
            {
                int newinside = inside * (-1);
                System.out.print("-" + newinside + ")³");
            }
            else
            {
                System.out.print("+" + inside + ")³");
            }
            
            if (outside < 0)
            {
                int newoutside = outside * (-1);
                System.out.print(" - " + newoutside);
            }
            else
            {
                System.out.print(" + " + outside);
            }
            
            System.out.print("\nIf so, your inverse looks like this: ");
            
            if (coefficient < 0)
            {
                int newcoeff = coefficient * (-1);
                System.out.print("x = " + newcoeff + "³√y");
            }
            else
            {
                System.out.print("x = -" + coefficient + "³√y");
            }
            
            if (outside < 0)
            {
                int newoutside = outside * (-1);
                System.out.print("+" + newoutside);
            }
            else
            {
                System.out.print("-" + outside);
            }
            
            if (inside < 0)
            {
                int newinside = inside * (-1);
                System.out.print(" + " + newinside);
            }
            else
            {
                System.out.print(" - " + inside);
            }
        }
        
        if (eqtype.equals("cubert"))
        {
            System.out.println("Cube root selected.");
            
            System.out.print("Enter coefficient: ");
            int coefficient = input.nextInt();
            
            System.out.print("\nEnter number inside radical: ");
            int inside = input.nextInt();
            
            System.out.print("\nEnter number outside radical: ");
            int outside = input.nextInt();
            
            System.out.print("Your equation should look like this: ");
            System.out.print("y = " + coefficient + "³√x");
            
            if (inside < 0)
            {
                int newinside = inside * (-1);
                System.out.print("-" + newinside);
            }
            else
            {
                System.out.print("+" + inside);
            }
            
            if (outside < 0)
            {
                int newoutside = outside * (-1);
                System.out.print(" - " + newoutside);
            }
            else
            {
                System.out.print(" + " + outside);
            }
            
            System.out.print("\nIf so, your inverse looks like this: ");
            
            if (coefficient < 0)
            {
                int newcoeff = coefficient * (-1);
                System.out.print("x = " + newcoeff + "(y");
            }
            else
            {
                System.out.print("x = -" + coefficient + "(y");
            }
            
            if (outside < 0)
            {
                int newoutside = outside * (-1);
                System.out.print("+" + newoutside + ")³");
            }
            else
            {
                System.out.print("-" + outside + ")³");
            }
            
            if (inside < 0)
            {
                int newinside = inside * (-1);
                System.out.print(" + " + newinside);
            }
            else
            {
                System.out.print(" - " + inside);
            }
        }
    }
}
