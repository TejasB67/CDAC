import java.util.Calendar;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;
class DateTimeConverter {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date : ");
        int date = sc.nextInt();
        
        System.out.println("Enter Month : ");
        int month = sc.nextInt();
        
        System.out.println("Enter Year  : ");
        int year = sc.nextInt();
        
        System.out.println("Enter hours in 24 hours format: ");
        int hour = sc.nextInt();

        System.out.println("Enter minutes : ");
        int min = sc.nextInt();

        System.out.println("Enter seconds : ");
        int sec = sc.nextInt();

        LocalDateTime dateTime = LocalDateTime.of(year, month, date, hour, min, sec );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        String text = dateTime.format(formatter);
        System.out.println(text);
        
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("mm/dd/yyyy");
        String text1 = dateTime.format(formatter1);
        System.out.println(text1);
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/mm/dd");
        String text2 = dateTime.format(formatter2);
        System.out.println(text2);

        System.out.println("------------------------------------------------");

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String text3 = dateTime.format(formatter3);
        System.out.println(text3);
        
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String text4 = dateTime.format(formatter4);
        System.out.println(text4);

        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm");
        String text5 = dateTime.format(formatter5);
        System.out.println(text5);

        System.out.println("------------------------------------------------");

        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
        String text6 = dateTime.format(formatter6);
        System.out.println(text6);

        DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("mm/dd/yyyy hh:mm:ss a");
        String text7 = dateTime.format(formatter7);
        System.out.println(text7);

        DateTimeFormatter formatter8 = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm");
        String text8 = dateTime.format(formatter8);
        System.out.println(text8);



    }

}