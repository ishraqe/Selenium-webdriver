package basics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWriteExcel {

	public static void main(String[] args) {
		try {
			//   Specify the path of file
			File src=new File("excel file path");

			// load file
			 FileInputStream fis=new FileInputStream(src);
			
// Load workbook
 XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			// Load sheet- Here we are loading first sheetonly
			XSSFSheet sh1= wb.getSheetAt(0);
		
			// getRow() specify which row we want to read.

			// and getCell() specify which column to read.
			// getStringCellValue() specify that we are reading String data.


			System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());

			System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());

			System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());

			System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());

			System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());

			System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			
			// here createCell will create column

			// and setCellvalue will set the value

			sh1.getRow(0).createCell(2).setCellValue("a");

			sh1.getRow(1).createCell(2).setCellValue("b");

			sh1.getRow(2).createCell(2).setCellValue("c");


			// here we need to specify where you want to save file

			FileOutputStream fout=new FileOutputStream(new File("location of file/filename.xlsx"));


			// finally write content 

			wb.write(fout);

			// close the file
			
			fout.close();
			
		 } catch (Exception e) {

			 System.out.println(e.getMessage());

		}
			
		
	}

}
