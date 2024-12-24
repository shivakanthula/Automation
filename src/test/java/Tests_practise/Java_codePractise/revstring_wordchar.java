package Tests_practise.Java_codePractise;

public class revstring_wordchar {


    public static void dfere( String s){

        String space = "";
        String[] sp = s.split(" ");

        for( String word : sp){
            String rev= "";
            for( int i=word.length()-1;i>=0;i--){
                rev += word.charAt(i);
            }
            space +=rev +" ";
        }

        System.out.println(space);
    }
    public static void main(String[] args){

        dfere("hii kanthula shiva");

    }


}
