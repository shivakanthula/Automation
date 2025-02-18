package Tests_practise.automation;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excelcode{

    public static void main(String[] args) throws IOException {
        // Path to the Excel file
        String excelFilePath = "C:/path/to/your/excel/file.xlsx";

        // Open the Excel file
        FileInputStream fis = new FileInputStream(new File(excelFilePath));

        // Create Workbook instance (for .xlsx files use XSSFWorkbook)
        Workbook workbook = new XSSFWorkbook(fis);

        // Get the first sheet from the workbook
        Sheet sheet = workbook.getSheetAt(0); // 0 indicates the first sheet

        // Iterate through all the rows of the sheet
        for (Row row : sheet) {
            // Iterate through all the cells of the row
            for (Cell cell : row) {
                // Print cell data based on the type of the cell
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        System.out.print("UNKNOWN TYPE\t");
                }
            }
            System.out.println(); // Move to the next row
        }
        // Close the workbook and the file input stream
        workbook.close();
        fis.close();
    }
}
