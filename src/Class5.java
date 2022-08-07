public class Class5 {
    public static void main(String[] args) {
        double min = 1 ;
        System.out.println("the numbers are  ");
        for (int i=0 ;i<3 ; i++ ){
            double num= Math.random();
            System.out.println(num);
            min= Math.min(min,num);
        }
        System.out.println("the max is "+min );
    }
}
