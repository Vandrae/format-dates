package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class DisplayTime {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        //ZDT knows what time zone its in ZoneId.of("GMT") tells it to use GMT as timezone
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime cst = ZonedDateTime.now(ZoneId.of("US/Central"));

        //date formatted in mm/dd/yyyy
        DateTimeFormatter formatter1  = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = today.format(formatter1);
        System.out.println("Today's Date is: " + formattedDate);
        System.out.println();

        //un formatted date b/c it was easier than formatting LocalDateTime
        LocalDate todayDash = LocalDate.now();
        System.out.println("Today's Date a different way: " + todayDash);
        System.out.println();

        //Formatted date to Day of week day, Year
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE d, yyyy");
        String formattedDate2 = today.format(formatter2);
        System.out.println("Day of week, day of month, Year: " + formattedDate2);
        System.out.println();

        //Format in GMT
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy  HH:mm zzz");
        String formattedDate3 = gmt.format(formatter3);
        System.out.println("Today's date and time if we weren't back-to-back World War champs: " + formattedDate3);
        System.out.println();


        //Formatted to CST
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("HH:mm zzz 'on' d-MMM-yyyy");
        String formattedDate4 = cst.format(formatter4);
        System.out.println("Today's date and time of the back-to-back World War champs: " + formattedDate4);
        System.out.print("                  /T /I\n" +
                "                              / |/ | .-~/\n" +
                "                          T\\ Y  I  |/  /  _\n" +
                "         /T               | \\I  |  I  Y.-~/\n" +
                "        I l   /I       T\\ |  |  l  |  T  /\n" +
                "     T\\ |  \\ Y l  /T   | \\I  l   \\ `  l Y\n" +
                " __  | \\l   \\l  \\I l __l  l   \\   `  _. |\n" +
                " \\ ~-l  `\\   `\\  \\  \\\\ ~\\  \\   `. .-~   |\n" +
                "  \\   ~-. \"-.  `  \\  ^._ ^. \"-.  /  \\   |\n" +
                ".--~-._  ~-  `  _  ~-_.-\"-.\" ._ /._ .\" ./\n" +
                " >--.  ~-.   ._  ~>-\"    \"\\\\   7   7   ]\n" +
                "^.___~\"--._    ~-{  .-~ .  `\\ Y . /    |\n" +
                " <__ ~\"-.  ~       /_/   \\   \\I  Y   : |\n" +
                "   ^-.__           ~(_/   \\   >._:   | l______\n" +
                "       ^--.,___.-~\"  /_/   !  `-.~\"--l_ /     ~\"-.\n" +
                "              (_/ .  ~(   /'     \"~\"--,Y   -=b-. _)\n" +
                "               (_/ .  \\  :           / l      c\"~o \\\n" +
                "                \\ /    `.    .     .^   \\_.-~\"~--.  )\n" +
                "                 (_/ .   `  /     /       !       )/\n" +
                "                  / / _.   '.   .':      /        '\n" +
                "                  ~(_/ .   /    _  `  .-<_\n" +
                "                    /_/ . ' .-~\" `.  / \\  \\          ,z=.\n" +
                "                    ~( /   '  :   | K   \"-.~-.______//\n" +
                "                      \"-,.    l   I/ \\_    __{--->._(==.\n" +
                "                       //(     \\  <    ~\"~\"     //\n" +
                "                      /' /\\     \\  \\     ,v=.  ((\n" +
                "                    .^. / /\\     \"  }__ //===-  `\n" +
                "                   / / ' '  \"-.,__ {---(==-\n" +
                "                 .^ '       :  T  ~\"   ll           \n" +
                "                / .  .  . : | :!        \\\\\n" +
                "               (_/  /   | | j-\"          ~^\n" +
                "                 ~-<_(_.^-~\"\n" +
                "\n" +
                "                             ");








    }
}
