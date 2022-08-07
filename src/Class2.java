public class Class2 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*101);
        System.out.println("Our number is "+num );
        if(num>50 ){
            System.out.println("Big!");
        }else
            System.out.println("Small!");

        if(num%2==0){
            System.out.println("Even!");
        }else
            System.out.println("Odd!");
    }

}
