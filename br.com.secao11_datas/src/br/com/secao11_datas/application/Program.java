package br.com.secao11_datas.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		System.out.println();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		// adicionar horas a data
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		// pegando apenas os minutos 
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println(d);
		System.out.println("Minutes: "+minutes);
		System.out.println("Month: " + month);
		
	}
	
	public static void DatasTradicionais() throws ParseException  {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		// ISO-8601 padrão UTC
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println();
		// format
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(x3));
		System.out.println(sdf2.format(x4));
		System.out.println();
		
		System.out.println(sdf2.format(y3));
		System.out.println();
		
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));
		System.out.println(sdf3.format(x1));
		System.out.println(sdf3.format(x2));
		System.out.println(sdf3.format(x3));
		System.out.println(sdf3.format(x4));
		System.out.println(sdf3.format(y3));
	}

}
