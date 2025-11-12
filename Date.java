public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%04d", day, month, year);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void addDay() {
        int[] daysInMonth = {
            31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        day++;

        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public static void main(String[] args) {
        Date d1 = new Date(14, 11, 2025);
        d1.addDay();
        System.out.println(d1);

        Date d2 = new Date(30, 4, 2025);
        d2.addDay();
        System.out.println(d2);

        Date d3 = new Date(31, 12, 2025);
        d3.addDay();
        System.out.println(d3); 
        Date d4 = new Date(28, 2, 2023);
        d4.addDay();
        System.out.println(d4); 

        Date d5 = new Date(28, 2, 2024);
        d5.addDay();
        System.out.println(d5); 

        Date d6 = new Date(29, 2, 2024);
        d6.addDay();
        System.out.println(d6); 
    }
}
