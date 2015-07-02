//This program will find the inverses of linear equations including square roots, parabolas, cubed roots, and cubed equations.

import java.util.*;

public class Inverses
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int coefficient, inside, outside;
        int newinside, newoutside, newcoeff;

        System.out.println("Types of equations: sqrt cubert square cubed");
        System.out.print("Enter equation: ");
        String eqtype = input.nextLine();

        if (eqtype.equals("square"))
        {
            System.out.println("Parabola selected.");

            System.out.print("Enter coefficient: ");
            coefficient = input.nextInt();

            System.out.print("Enter number inside the parentheses: ");
            inside = input.nextInt();

            System.out.print("Enter number outside the parentheses: ");
            outside = input.nextInt();

            System.out.print("Your equation should look like this: ");

            System.out.print("y = " + coefficient + "(x");

            if (inside <0)
            {
                newinside = inside *(-1);
                System.out.print("-" + newinside + ")²");
            }
            else
            {
                System.out.print("y = " + coefficient + "(x+" + inside + ")²");
                if (outside < 0)
                {
                    int newoutside = outside * (-1);
                    System.out.println(" - " + newoutside);
                }
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
                newcoeff = coefficient * (-1);
                System.out.print("x = " + newcoeff + "√y");
            }
            if (outside < 0)
            {
                newoutside = outside * (-1);
                System.out.print("+" + newoutside);
            }
            else
            {
                System.out.print("-" + outside);
            }
            if (inside < 0)
            {
                newinside = inside * (-1);
                System.out.print(" + " + newinside);
            }
            else
            {
                System.out.print(" - " + inside);
            }
        }

        if (eqtype.equals("sqrt"))
        {
            System.out.println("Square root selected.");

            System.out.print("Enter coefficient: ");
            coefficient = input.nextInt();

            System.out.print("\nEnter number inside radical: ");
            inside = input.nextInt();

            System.out.print("\nEnter number outside radical: ");
            outside = input.nextInt();

            System.out.print("\nYour equation should look like this: ");

            System.out.print("y = " + coefficient + "√x");

            if (inside < 0)
            {
                newinside = inside * (-1);
                System.out.print("-" + newinside);
            }
            else
            {
                System.out.print("+" + inside);
            }

            if (outside < 0)
            {
                newoutside = outside * (-1);
                System.out.print(" - " + newoutside);
            }
            else
            {
                System.out.print(" + " + outside);
            }

            System.out.println("\nIf so, your inverse looks like this: ");

            if (coefficient < 0)
            {
                newcoeff = coefficient * (-1);
                System.out.print("x = " + newcoeff + "(y");
            }
            else
            {
                System.out.print("x = -" + coefficient + "(y");
            }

            if (outside < 0)
            {
                newoutside = outside * (-1);
                System.out.print("+" + newoutside + ")²");
            }
            else
            {
                System.out.print("-" + outside + ")²");
            }

            if (inside < 0)
            {
                newinside = inside * (-1);
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
            coefficient = input.nextInt();

            System.out.print("\nEnter number inside parentheses: ");
            inside = input.nextInt();

            System.out.print("\nEnter number outside parenthese: ");
            outside = input.nextInt();

            System.out.print("\nYour equation should look like this: ");

            System.out.print("y = " + coefficient + "(x");

            if (inside < 0)
            {
                newinside = inside * (-1);
                System.out.print("-" + newinside + ")³");
            }
            else
            {
                System.out.print("+" + inside + ")³");
            }

            if (outside < 0)
            {
                newoutside = outside * (-1);
                System.out.print(" - " + newoutside);
            }
            else
            {
                System.out.print(" + " + outside);
            }

            System.out.print("\nIf so, your inverse looks like this: ");

            if (coefficient < 0)
            {
                newcoeff = coefficient * (-1);
                System.out.print("x = " + newcoeff + "³√y");
            }
            else
            {
                System.out.print("x = -" + coefficient + "³√y");
            }

            if (outside < 0)
            {
                newoutside = outside * (-1);
                System.out.print("+" + newoutside);
            }
            else
            {
                System.out.print("-" + outside);
            }

            if (inside < 0)
            {
                newinside = inside * (-1);
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
            coefficient = input.nextInt();

            System.out.print("\nEnter number inside radical: ");
            inside = input.nextInt();

            System.out.print("\nEnter number outside radical: ");
            outside = input.nextInt();

            System.out.print("Your equation should look like this: ");
            System.out.print("y = " + coefficient + "³√x");

            if (inside < 0)
            {
                newinside = inside * (-1);
                System.out.print("-" + newinside);
            }
            else
            {
                System.out.print("+" + inside);
            }

            if (outside < 0)
            {
                newoutside = outside * (-1);
                System.out.print(" - " + newoutside);
            }
            else
            {
                System.out.print(" + " + outside);
            }

            System.out.print("\nIf so, your inverse looks like this: ");

            if (coefficient < 0)
            {
                newcoeff = coefficient * (-1);
                System.out.print("x = " + newcoeff + "(y");
            }
            else
            {
                System.out.print("x = -" + coefficient + "(y");
            }

            if (outside < 0)
            {
                newoutside = outside * (-1);
                System.out.print("+" + newoutside + ")³");
            }
            else
            {
                System.out.print("-" + outside + ")³");
            }

            if (inside < 0)
            {
                newinside = inside * (-1);
                System.out.print(" + " + newinside);
            }
            else
            {
                System.out.print(" - " + inside);
            }
        }
    }
}
