import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        double Salary =Math.random()*100001;
        double tax;
        if(Salary>0 && Salary < 23000){
            tax =Salary * 0.1;
            System.out.println("Salary before tax "+Salary);
            Salary -=tax;
            System.out.println("the Tax is "+ tax );
            System.out.println("Salary After tax "+Salary);
            
        } else if (Salary>23000 && Salary<50000) {
            tax =Salary * 0.2;
            System.out.println("Salary before tax "+Salary);
            Salary -=tax;
            System.out.println("the Tax is "+ tax );
            System.out.println("Salary After tax "+Salary);

        }else if (Salary>50000 && Salary<100000){
            tax =Salary * 0.3;
            System.out.println("Salary before tax "+Salary);
            Salary -=tax;
            System.out.println("the Tax is "+ tax );
            System.out.println("Salary After tax "+Salary);

        }else {
            tax =Salary * 0.4;
            System.out.println("Salary before tax "+Salary);
            Salary -=tax;
            System.out.println("the Tax is "+ tax );
            System.out.println("Salary After tax "+Salary);

        }


    }
}
