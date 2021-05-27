package ExcelUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import sun.tools.jconsole.inspector.XSheet;


public class ReadUtil {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	public void read() throws IOException
	{
		
			FileInputStream fis = new FileInputStream("C:\\Users\\samee\\Desktop\\data.xlsx");
			XSSFWorkbook xs = new XSSFWorkbook(fis);
			XSSFSheet sh = xs.getSheet("user");
			System.out.println(xs.getSheetName(0));
			System.out.println("try");
		
	}

}
