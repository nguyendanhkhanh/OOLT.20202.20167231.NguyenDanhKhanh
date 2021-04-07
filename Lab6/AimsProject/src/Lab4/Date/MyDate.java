package Lab4.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
    private int day,month,year;
    public static final String[] DATE_FORMAT = {
            "dd/MM/yyyy",
            "dd-MM-yyyy",
            "dd MM yyyy",
            "dd MMM yyyy",
            "MMM dd yyyy",
            "MMM, dd yyyy",
            "dd MMMM yyyy",
            "MMMM dd yyyy",
            "MMMM, dd yyyy",
    };

    public MyDate() {
        super();
        LocalDate currentDate = LocalDate.now();
        this.day = currentDate.getDayOfMonth();
        this.month = currentDate.getMonthValue();
        this.year = currentDate.getYear();
    }

    public MyDate(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;

    }


    public MyDate(String dateString) {
        super();
        LocalDate date = parseDateString(dateString);

        if (date != null) {
            this.day = date.getDayOfMonth();
            this.month = date.getMonthValue();
            this.year = date.getYear();
        } else {
            System.out.println("Invalid date string");
        }
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day=day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (1 < month && month < 12) {
            this.month = month;
            System.out.println("Set month to " + month);
        } else {
            System.out.println("Invalid month");
        }
    }

    public void setMonth(String month) {
        String dateString = month + ", 1 1990";
        LocalDate date = parseDateString(dateString);
        if (date == null) {
            System.out.println("Invalid month");
        } else {
            this.month = date.getMonthValue();
            System.out.println("Set month to " + this.month);
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (1 < year) {
            this.year = year;
            System.out.println("Set year to " + year);
        } else {
            System.out.println("Invalid year");
        }
    }

    public void accept() {
        System.out.print("Enter date string: ");
        Scanner input = new Scanner(System.in);
        String dateString = input.nextLine();
        LocalDate date = parseDateString(dateString);

        if (date != null) {
            this.day = date.getDayOfMonth();
            this.month = date.getMonthValue();
            this.year = date.getYear();
            System.out.println("Set date to: " + date.toString());
        } else {
            System.out.println("Invalid date string");
        }
    }

    public void print() {
        String dateString = day + "/" + month + "/" + year;
        LocalDate date = parseDateString(dateString);
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
            System.out.println(date.format(formatter));
        } else {
            System.out.println("Current value is invalid, please set another value");
        }
    }

    public void print(String format) {
        boolean isValidFormat = false;
        for (int i = 0; i < DATE_FORMAT.length; i++) {
            if (format == DATE_FORMAT[i]) {
                isValidFormat = true;
                break;
            }
        }

        if (!isValidFormat) {
            System.out.println("Invalid format");
            return;
        }

        String dateString = day + "/" + month + "/" + year;
        LocalDate date = parseDateString(dateString);
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            System.out.println(date.format(formatter));
        } else {
            System.out.println("Current value is invalid, please set another value");
        }
    }

    private LocalDate parseDateString(String dateString) {
        LocalDate localDate = null;
        DateFormat format;
        Date date;

        for (int i = 0; i < DATE_FORMAT.length; i++) {
            try {
                format = new SimpleDateFormat(DATE_FORMAT[i]);
                format.setLenient(false);
                date = format.parse(dateString);
                localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                break;
            } catch (ParseException e) {
            }
        }

        return localDate;
    }

}