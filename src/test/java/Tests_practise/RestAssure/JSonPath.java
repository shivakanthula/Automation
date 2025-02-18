package Tests_practise.RestAssure;

import io.restassured.path.json.JsonPath;

import java.util.List;

public class JSonPath {

    public static void main(String[] args){

        String data ="{ \"loanId\": \"12345\", \"borrower\": \"Shiva\", \"loans\": " +
                "[{\"id\": \"L1\", \"amount\": 10000}, {\"id\": \"L2\", \"amount\": 20000}] }";
        JsonPath jsp = new JsonPath(data);
      String typ=  jsp.getString("borrower");
       String type= jsp.getString("loans[1].id");
      int amount =   jsp.getInt("loans[1].amount");
      List<Integer> list = jsp.getList("$..amount");
        System.out.println(typ);
        System.out.println(type);
        System.out.println(amount);
    }
}
