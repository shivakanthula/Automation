package Tests_practise.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dynamic_Parameters extends Supply_data_Excel_DParam {

@DataProvider(name="DynamicData")
    public Object[][] edata(){

         Object[][] data =  new Object[][]{

                {"Shiva",28},
                {"Riyaz",30},
                {"Swamy",35},
                {"Anil",40},
                {"Jithu",45}
        }; return data;
    }

@Test(dataProvider = "logindata",dataProviderClass = Supply_data_Excel_DParam.class)
    public void dynamic(String name,int age){

    System.out.println(" Name :- "+ name + " " +" Age :- "+age);

    }

}
