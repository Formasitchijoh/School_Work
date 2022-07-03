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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = bufferedReader.readLine();

	        String result =TimeResult.timeConversion(s);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

