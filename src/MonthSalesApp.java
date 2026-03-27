import java.text.NumberFormat;

public class MonthSalesApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");

        // declare monthNames and monthSales arrays
        String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        double[] monthSales = {
            15234.56, 18765.43, 22345.67, 19876.54,
            25432.10, 28901.23, 31234.56, 29876.54,
            24567.89, 21098.76, 17654.32, 35678.90
        };

        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");

            // validate input
            if (monthNumber < 1 || monthNumber > 12) {
                Console.displayLine("Invalid month number. Try again.");
                continue;
            }

            // get the index number for the month
            // and display the month name and sales
            int index = monthNumber - 1;
            Console.displayLine("Month: " + monthNames[index]);
            Console.displayLine("Sales: " + currency.format(monthSales[index]));
            Console.displayLine();

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }

        // display the total sales for the year
        double totalSales = 0;
        for (double sales : monthSales) {
            totalSales += sales;
        }
        Console.displayLine("Total sales for the year: " + currency.format(totalSales));

        Console.displayLine();
    }
}
