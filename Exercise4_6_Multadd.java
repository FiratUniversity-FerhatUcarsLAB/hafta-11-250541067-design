public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // a * b + c işlemi
        return a * b + c;
    }

    public static double expSum(double x) {
        // x * e^(-x) + sqrt(1 - e^(-x))
        double ex = Math.exp(-x);
        return multadd(x, ex, Math.sqrt(1 - ex));
    }

    public static void main(String[] args) {

        // Basit testler
        System.out.println("multadd(2, 3, 4) = " + multadd(2, 3, 4));  
        System.out.println("multadd(1.5, 2, -1) = " + multadd(1.5, 2, -1));  

        // Verilen matematiksel ifadeler:

        // 1) sin(π/4) + cos(π/4)/2
        double expr1 = multadd(Math.sin(Math.PI / 4), 1, Math.cos(Math.PI / 4) / 2);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + expr1);

        // 2) log(10) + log(20)
        double expr2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log(10) + log(20) = " + expr2);

        // 3) expSum testi
        double expr3 = expSum(2);
        System.out.println("expSum(2) = " + expr3);
    }
}
