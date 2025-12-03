public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
         System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        String day = "Wednesday";
        int date = 5;
        String month = "February";
        int year = 2025;

        System.out.println("American format:");
        printAmerican(day, date, month, year);

        System.out.println("European format:");
        printEuropean(day, date, month, year);
    }
}
