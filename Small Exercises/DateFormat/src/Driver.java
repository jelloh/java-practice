import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Driver {
    public static void main(String[] args) throws ParseException {
        // weeeee

        //  "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"
        //String date = "2017-10-26T19:43:07-07:00";
        String date = "2017-10-26T11:43:07-07:00";
        //2001-07-04T12:08:56.235-07:00
        //"yyyy-MM-dd'T'HH:mm:ss.SSSXXX"
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");

        Date d = f.parse(date, new ParsePosition(0));

        //System.out.println(f.toPattern());
        if(d == null) System.out.println("is null");
        else System.out.println(d.toString());

        f.applyPattern("MM/dd/YYYY h:mm a");
        System.out.println(f.format(d));

    }
}
