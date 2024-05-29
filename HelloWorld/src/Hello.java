public class Hello {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;

        double x = (var1 + var2) * 100.00;
        double y = x % 40.00;

        // System.out.println(x);
        System.out.println(y);

        boolean z = y == 0.00 ? true : false;
        System.out.println(z);
    }
}
