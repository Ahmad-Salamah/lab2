public class Class8 {
    public static void main(String[] args) {
        int year = (int) (Math.random() * 3000);

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " this is a leap year ");
        } else {
            System.out.println(year + " this is NOT a Leap year");
        }

    }
}