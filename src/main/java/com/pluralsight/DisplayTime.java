package com.pluralsight;

import java.time.LocalDateTime;

public class DisplayTime {
    public static void main(String[] args) {
        //display current time in following formats
        /*04/22/2026
        2026-04-22
        Wednesday 22, 2026
        Wednesday, Apr 22, 2026 10:02 <---- display in GMT
        5:02 on 22-Apr-2026 <---- display in CST
         */
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
    }
}
