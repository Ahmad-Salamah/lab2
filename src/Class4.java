public class Class4 {
    public static void main(String[] args) {
double max = -1 ;
        System.out.println("the numbers are  ");
for (int i=0 ;i<3 ; i++ ){
    double num= Math.random();
    System.out.println(num);
    max= Math.max(max,num);
}
        System.out.println("the max is "+max );
    }
}
