package SikuliDemo.SikuliDemo;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang.RandomStringUtils;

import com.github.javafaker.Faker;
public class FakeTestDataGenerator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Date now = new Date();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("hh mm ss");
//		String time = dateFormat.format(now);
//		File dir = new File(time);
//		dir.mkdirs();
//		System.out.println(dir.mkdirs());

		
		
		
		/*
		LocalDate date = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");  
		   LocalDateTime now = LocalDateTime.now();  
		   
		   
		   System.out.println(dtf.format(now));  
		   System.out.println(now.toLocalDate());
//		   File f = new File("C:\\Automation\\ESDC\\SeleniumFrameworkClass\\reports\\ram1");// + dtf.format(now));
//		   File f = new File("C:\\Automation\\ESDC\\SeleniumFrameworkClass\\reports\\" + dtf.format(now));
		   File f = new File(System.getProperty("user.dir")+"\\reports\\" + dtf.format(now));
		   f.mkdir();
		   System.out.println(f.mkdir());
		   
		   */
		   
//		   System.getProperty("user.dir")
		   
//		LocalDate date = LocalDate.now();
//		
////		DateTimeFormatter fmt = DateTimeFormat.forPattern("d MMMM, yyyy");
////		String str = date.toString(fmt);
//		System.out.println(date);
		
//		File f1 = new File("C:\\tmp\\"+ date.atTime(null));
//		f1.mkdir();
		
//		String dateTime = date.ToString("dd-MM-yy HH:mm:ss");
//		File f = new File("C:\\tmp\\" + dateTime);
//		f.mkdir();
		
		
		/*
		Date data = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd-mm-yyyy");
		String dataFormatada = formatar.format(data);

		try {

			File f = new File(dataFormatada);

			System.out.println(dataFormatada);

			f.mkdir();

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		*/
		

		/*
		 * 
		 * Faker faker= new Faker(new Locale("en-IND")); int i; for(i=0;i<10;i++) {
		 * String fullName=faker.name().fullName(); String
		 * fullAddress=faker.address().fullAddress(); // String
		 * fullName=faker.name().fullName(); // String fullName=faker.name().fullName();
		 * System.out.println("Full Details are:\n" + fullName + fullAddress); }
		 */
		   
		   //Create a unique file
		   
//		LocalDate date = LocalDate.now();
		
		/*
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");  
		   LocalDateTime now = LocalDateTime.now();
		   int i = 0;
		   String filename = Integer.toString(i);
		   File f1 = new File(System.getProperty("user.dir")+"\\reports\\" + dtf.format(now));
		   while (f1.exists()) {
		       i++;
		       filename = Integer.toString(i);
		       f1 = new File(System.getProperty("user.dir")+"\\reports\\" + dtf.format(now) + filename);
		   }
		   f1.mkdir();
		   System.out.println("File in use: " + f1);
		   
		   */
		
		
//		String ext = "dat";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");  
		   LocalDateTime now = LocalDateTime.now();
		File dir = new File(System.getProperty("user.dir")+"\\reports\\" );
		String name =System.getProperty("user.dir")+"\\reports\\"+ String.format("%s.%s", dtf.format(now),RandomStringUtils.randomAlphanumeric(2));
		File file = new File(dir, name);
		 file.mkdir();
		System.out.println(name);
		   
	}


}
