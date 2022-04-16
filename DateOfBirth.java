import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOfBirth {
    public static void main(String[] args) throws ParseException {
        String thatDay = "30/03/1995 05:01:45 AM";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        Date date1 = formatter.parse(thatDay);
        Date date2 = new Date();
        long d = date2.getTime() - date1.getTime();
        long year = d / (1000l * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;

        System.out.println("Year "+ year);
        System.out.println("Day "+ day);

    }
}
