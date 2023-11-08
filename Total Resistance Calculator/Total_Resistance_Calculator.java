import java.util.Scanner;

public class Total_Resistance_Calculator {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int n;          

        System.out.println();
        System.out.println("Total Resistance Calculator");
        System.out.println();

        System.out.println("How many Resistors?");
        n = input.nextInt();       

        double[] values = new double[n];        
        String[] relationships = new String[n-1];

        
        System.out.println();        
        int countdown = n;        
        int counter = 1;
        while(countdown != 0){
            countdown--;
            System.out.println("Value of Resistor " + counter);
            values[counter-1] = input.nextDouble();         
            input.nextLine();   
            counter++;
        }        

        System.out.println();        
        int counter2 = counter-1;        
        while(counter2 > 1){        
            System.out.println("Relationship of Resistor " + counter2 + " and " + "Resistor " + (counter2-1));
            relationships[counter2-2] = input.nextLine();
            counter2--;            

        }
        
        System.out.println();
        int counter3 = n;
        double totalResistance=values[(counter3-1)];        
        while(counter3!=1){            
            if(relationships[counter3-2].equals("P")||relationships[counter3-2].equals("p")){
                totalResistance = ((totalResistance*values[counter3-2])/(totalResistance+values[counter3-2]));
            }else if(relationships[counter3-2].equals("S")||relationships[counter3-2].equals("s")){
                totalResistance = (totalResistance+values[counter3-2]);
            }            
            counter3--;            
        }

        System.out.println();
        System.out.println("Total Reistance " + totalResistance + " Ohms");        
        System.out.println();
        
    }
}
