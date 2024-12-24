package Tests_practise.Java_codePractise;

public class Stringrev_palindreome {



    public static void str_rev(String s1){
         String rev ="";

        for (int i=s1.length()-1;i>=0;i--){
            rev += s1.charAt(i);
        }
        System.out.println(rev);
        if(s1.equals(rev)){
            System.out.println(" String is palindrome");

        }
        else{
            System.out.println(" String is not a  palindrome");

        }

    }

public static boolean int_rev(int num){

//        int cmp = num;
        int digit ;
        int rev=0;
        while(num!=0){

            digit = num %10;  //121 %10 = 1;
            rev = rev *10 +digit;  // rev = 1;
            num/=10; // 121 /10 = 12 loop ends until the condition fails

        }
   return num == rev;


}

    public static void main(String[] args){

//        str_rev("dadadb");

        int num=1261;
      if(int_rev(num)){

        System.out.println("string is palindrome");
        }
      else{
          System.out.println("string is  not a palindrome");
      }


    }
}



