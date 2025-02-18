package Tests_practise.Java_codePractise;

public class sort_wordposition {


    public static void swapalternate(String arr){
        String[] s1 = arr.split(" ");
        String rev="";
        for(int i=0;i<s1.length-1;i=i+2){
            rev += s1[i+1] +" "+ s1[i]+ " ";
        }
        if(s1.length %2!=0){
            rev += s1[s1.length-1];
        }
        System.out.println(rev);
    }

    public static void swap_char(String s) {
        s.replaceAll(" ", ""); // Remove spaces (but result is not stored)

        String swap = "";
        for (int i = 0; i < s.length() - 1; i = i + 2) {
            swap =swap+ s.charAt(i + 1) + s.charAt(i); // Concatenating characters
        }
        if (swap.length() % 2 != 0) {
            swap =swap + s.charAt(s.length() - 1); // Handle odd-length strings
        }
        System.out.println(swap);
    }



    public static void main (String[] args){

        swapalternate("Hii shiva kumar hii");
        //shiva hii kanthula kumar namaste hii
        swap_char("hii swamy");

    }
}
