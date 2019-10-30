package demo.hackerrank.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class TimeCoversion {
	 public static void main(String[] args) throws ParseException
	   {
	       
	       Scanner input = new Scanner(System.in);
	       
	       String date = input.nextLine();
	       
	      //String input = "10:22:12 PM";
	      //Format of the date defined in the input String
	      DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
	      //Desired format: 24 hour format: Change the pattern as per the need
	      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
	      
	      Date date2 = df.parse(date);
	      String output = outputformat.format(date2);
	      
	      System.out.println(output);
	      
	      
	     
	   }
}
