import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("Day Of semana "  + localDate.getDayOfWeek().name());
        System.out.println("Day of week " + localDate.getDayOfWeek().ordinal());
        System.out.println("Month: " + localDate.getMonthValue());
        System.out.println("Month " + localDate.getMonth().name() );
        System.out.println("Year " + localDate.getYear());
    }
}