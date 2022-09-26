package enumeration;

public final class WeekDays{
    
    private final String day;

    private WeekDays(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public static final WeekDays MONDAY = new WeekDays("MONDAY");
    public static final WeekDays TUESDAY = new WeekDays("TUESDAY");
    public static final WeekDays WEDNESDAY = new WeekDays("WEDNESDAY");
    public static final WeekDays THURSDAY = new WeekDays("THURSDAY");
    public static final WeekDays FRIDAY = new WeekDays("FRIDAY");
    public static final WeekDays SATURDAY = new WeekDays("SATURDAY");
    public static final WeekDays SUNDAY = new WeekDays("SUNDAY");

    public static void main(String[] args) {
        System.out.println(WeekDays.SUNDAY.getDay());
        System.out.println(WeekDays.WEDNESDAY.getDay());
        System.out.println(WeekDays.MONDAY.getDay());
    }

}
