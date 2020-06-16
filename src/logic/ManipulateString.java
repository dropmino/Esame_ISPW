package logic;

import java.util.Scanner;
import java.util.logging.Level; 
import java.util.logging.Logger; 

public class ManipulateString {
	
	public String concatenete(String str1 , String str2) {
		
		return str1.concat(str2);
	}

	public boolean contain(String str1 , String str2) {
		
		return str1.contains(str2);
	}

	
	public static void main(String[] args) {
		
		
		ManipulateString elem = new ManipulateString();
	
		
		boolean cont;
		 
		Logger logger = Logger.getLogger(ManipulateString.class.getName());
		Scanner scan = new Scanner(System.in);
		
		logger.log(Level.INFO, "introduci la prima stringa");
		String str1 = scan.next();
		
		logger.log(Level.INFO, "introduci la seconda stringa");
		String str2 = scan.next();
		
		String conc = elem.concatenete(str1, str2);
		cont = elem.contain(str1, str2);
		logger.log(Level.INFO, "\nstringa1 concatenata = " + conc);
		logger.log(Level.INFO, "\nstr2 è contenuta in str1?  = " + cont);
	
	}
}
