public class Class1 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*101);
        System.out.println("Our number is "+num );
        if (num>50){
            System.out.println("Big!");
        }else if (num<50){
            System.out.println("Small!");
        }else
            System.out.println("Bingo!");

    }
}
