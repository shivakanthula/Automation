package Tests_practise.Java_codePractise;

public class Alternatewords_rev {

    public  static void altrev(String s) {

        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {

        // if(i%2==0) it reverse the even words

            if (i % 2 != 0) { //reverse the odd words
                String rev = new StringBuilder(arr[i]).reverse().toString();
                System.out.print(rev + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void strrevsb(String s1){

        StringBuilder sb = new StringBuilder(s1);
        sb.reverse().toString();
        System.out.println(sb);

    }

    public static void main(String[] args){


//        altrev("hii shiva kumar kanthula");
        strrevsb("abcdef");

    }
}
