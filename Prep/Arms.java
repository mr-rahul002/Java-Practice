public class Arms {
    public static void main(String[] args) {
        int n = 371;
        int temp, sum = 0;
        temp = n;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n /= 10;
        }
        if (sum == temp) {
            System.out.println("Arm");
        } else {
            System.out.println("Not");
        }
    }
}
