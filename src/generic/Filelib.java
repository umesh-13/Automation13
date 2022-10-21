package generic;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {

	public String readExcelData(String path,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row rw = sheet.getRow(rowcount);
		Cell cell = rw.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;

	}
	public int getRowCount(String path,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;

	}


	public void writeExcel(String path,String sheetName,int rowcount, int cellcount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new  FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowcount);

		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);

	}

	public String readDataFromPropfile(String proppath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(proppath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}

}
