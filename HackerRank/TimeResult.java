package Hackerank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TimeResult {


    public static String timeConversion(String s) {
    
    
    String solution;
        if (s.contains("PM")) {
            String[] arr = s.replace("PM","").split(":");
            int hours = Integer.parseInt(arr[0]);
            if(hours!=12) {
                hours = hours + 12;
            }
            arr[0] = hours + "";
            solution=(arr[0] + ":" + arr[1] + ":" + arr[2]);
        } else {
            String[] arr = s.replace("PM","").split(":");
            if(arr[0].equals("12")) {
                arr[0] = "00";
            }
            solution=(arr[0] + ":" + arr[1] + ":" + arr[2]).replace("AM","");

        }
        return solution;

    }

	}



