package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayTime {
    public static void main(String[] args) {
        //display current time in following formats
        /*04/22/2026
        2026-04-22
        Wednesday 22, 2026
        Wednesday, Apr 22, 2026 10:02 <---- display in GMT Time
        5:02 on 22-Apr-2026 <---- display in cst Time
         */
        LocalDate today = LocalDate.now();
        System.out.println(today);


        DateTimeFormatter formatter1  = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = today.format(formatter1);
        System.out.println(formattedDate);





    }
}
