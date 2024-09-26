import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
        
        System.out.println("PIZZA BILL COMPUTATION PROGRAM");
        System.out.print("Please enter the number of slices of pizza: ");
        int numSlices = input.nextInt();
        
        System.out.print("Please enter the number of sodas: " );
        int numSodas = input.nextInt(); 
        
        // fill in the rest of the code here. 
        System.out.print("Please enter the tax rate percentage: " );
        int taxRate = input.nextInt(); 
        
        double slicesTotal = numSlices * 2.5;
        
        double sodaTotal = numSodas * 1.5;
        
        double subTotal =  (slicesTotal + sodaTotal);
        
        double salesTax = (double) taxRate / 100;
 
        double addedTax = salesTax * subTotal;
        
        System.out.println("Thank you for your order. Your total bill is:");
        
        System.out.println(numSlices + " slices of pizza @ $2.50/each = $" + slicesTotal);
        System.out.println(numSodas + " sodas @ $1.50/each = $" + sodaTotal);
       
        System.out.println("Subtotal: $" + subTotal);
    
        System.out.println("Sales Tax (" + taxRate + "%): $" + addedTax );
        System.out.println("Total Owed: $" + (subTotal + addedTax));
       
    }
}