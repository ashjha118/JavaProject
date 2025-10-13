package functional_interfaces;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class dateformat {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("=== Date Format Utility ===");

     
        System.out.println("Default Format: " + today);
        System.out.println("DD/MM/YYYY : " + DateUtils.formatDate(today, "dd/MM/yyyy"));
        System.out.println("MM-DD-YYYY : " + DateUtils.formatDate(today, "MM-dd-yyyy"));
        System.out.println("Full Month Format: " + DateUtils.formatDate(today, "dd-MMMM-yyyy"));
        System.out.println("Invoice Style: " + DateUtils.formatDate(today, "yyyyMMdd"));
    }
}