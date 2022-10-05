package com.pkj.spring_boot_datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DTService {
    // Print Time in words.
    public void printWords(Integer h, Integer m)
    {
        String nums[] = { "zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine",
        		"ten", "eleven", "twelve", "thirteen","fourteen", "fifteen", "sixteen", "seventeen",
        		"eighteen", "nineteen", "twenty", "twenty one","twenty two", "twenty three", "twenty four",
        		"twenty five", "twenty six", "twenty seven","twenty eight", "twenty nine","thirty","thirty one","thirty two",
        		"thirty three","thirty four","thirty five","thirty six","thirty seven","thirty eight",
        		"thirty nine","forty","forty one","forty two","forty three","forty four","forty five","forty six","forty seven","forty eight","forty nine",
        		"fifty","fifty one","fifty two","fifty three","fifty four","fifty five","fifty six","fifty seven","fifty eight","fifty nine"
                        };
     
        if (h >= 0 && m == 0)
            System.out.println("It's "+ nums[h] + " o' clock ");
        else if (h == 0 && m == 0)
        	System.out.println("It's Midnight");
        else if (h == 12 && m == 0)
        	System.out.println("It's Midday");
        else if (h >= 0 && m >= 1)
            System.out.println("\"It's "+ nums[h] +" " + nums[m]+"\"" );
    }
     
    // Driven code
    public String  dtCall()
    {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm"); 
		Date date = new Date();  
		System.out.println(formatter.format(date).toString());    
    	String[]  timestr=formatter.format(date).toString().split(":");
        printWords(Integer.valueOf(timestr[0]), Integer.valueOf(timestr[1]));
        return "success";
    }


}
