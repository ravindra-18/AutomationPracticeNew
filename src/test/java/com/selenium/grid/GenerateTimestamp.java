package com.selenium.grid;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateTimestamp {

	public static void main(String[] args) {
		String timestamp=new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss").format(new Date());
		System.out.println(timestamp);

	}

}
