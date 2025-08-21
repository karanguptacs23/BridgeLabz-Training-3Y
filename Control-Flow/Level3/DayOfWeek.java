public class DayOfWeek {
    public static void main(String[] args) {
        // Take input from command line arguments
        int m = Integer.parseInt(args[0]);  // month (1 = January, 2 = February, ...)
        int d = Integer.parseInt(args[1]);  // day
        int y = Integer.parseInt(args[2]);  // year

        // Apply formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the result
        System.out.println("Day number: " + d0);

        // Optional: Print day name for better readability
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day is: " + days[d0]);
    }
}