package Test;

import java.time.LocalDate;

public class DateAndTime {
    public static void main(String[] args) {

        // 1. CURRENT DATE
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // 2. CUSTOM DATE
        LocalDate custom = LocalDate.of(2026, 4, 12);
        System.out.println("Custom Date: " + custom);

        // 3. GET PARTS OF DATE
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Month Value: " + today.getMonthValue());
        System.out.println("Day: " + today.getDayOfMonth());

        // 4. ADD / SUBTRACT DATE
        System.out.println("After 5 days: " + today.plusDays(5));
        System.out.println("Before 5 days: " + today.minusDays(5));

        System.out.println("After 2 months: " + today.plusMonths(2));
        System.out.println("Before 1 year: " + today.minusYears(1));

        // 5. COMPARISON
        LocalDate d1 = LocalDate.of(2026, 1, 1);
        LocalDate d2 = LocalDate.of(2026, 12, 31);

        System.out.println("d1 is before d2: " + d1.isBefore(d2));
        System.out.println("d1 is after d2: " + d1.isAfter(d2));
        System.out.println("d1 equals today: " + d1.equals(today));

        // 6. CHAINING EXAMPLE
        LocalDate futureDate = LocalDate.now()
                                        .plusDays(10)
                                        .plusMonths(1);

        System.out.println("Future Date: " + futureDate);
    }
}