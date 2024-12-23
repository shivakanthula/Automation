package Tests_practise.TestNG;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Supply_data_Excel_DParam {

// Note  -- WorkBook -->  get Sheet --> get Rows --> get Cell values
// Imp Note --> After getting data from Excel u have to close the workBook and FileInputStream


    public static void main(String[] args) throws IOException {
        getdata();
// Note : this method is used to get the data from the exceli
        File file  = new File("./src/test/resources/Excel_DParam.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("sheet1");
        int rows = sheet.getPhysicalNumberOfRows();
        int columns = sheet.getRow(0).getLastCellNum();
        for(int i=1;i<rows-1;i++){
            for(int j=0;j<columns;j++){
                DataFormatter df  = new DataFormatter();
                df.formatCellValue(sheet.getRow(i).getCell(j));
            }
            }
        wb.close();
        fis.close();

    }

// This method used for Dataprovider for dynamic inputs

    @DataProvider(name="logindata")
    public static String[][] getdata() throws IOException {

        File file = new File("./src/test/resources/Excel_DParam.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("sheet1");
        int rows = sheet.getPhysicalNumberOfRows();
        int columns = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rows - 1][columns];
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns; j++) {
                DataFormatter df = new DataFormatter();
                data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
            }
        }
        wb.close();
        fis.close();

        for (String[] dataArr : data) {
            System.out.println(Arrays.toString(dataArr));
        }
        return data;
    }
}