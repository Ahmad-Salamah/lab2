public class SalaryRaiser {
    public static void main(String[] args) {
        double salary= (Math.random()*(6001-5000))+5000;
        System.out.println("the current salary is "+salary);
        if(salary + salary*0.1 <= 6000){
            salary += 0.1*salary;
        }
        else {
            salary += 0.05*salary;
        }
        System.out.println("the updated salary is "+salary);
    }
}
