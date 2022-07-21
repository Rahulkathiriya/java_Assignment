package Asssignment_queastion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class As18_display_date_time {

	public static void main(String[] args) {

		SimpleDateFormat currentTime= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date date = new Date();
		System.out.println(currentTime.format(date));
	}

}
