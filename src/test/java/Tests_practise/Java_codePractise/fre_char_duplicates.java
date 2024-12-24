package Tests_practise.Java_codePractise;

public class fre_char_duplicates {

    public static void fre_str(String ch){

        int[]  freq = new int[256];

        for( int i=0;i<ch.length();i++){
            char  s1;
            s1 =  ch.charAt(i);
              freq[s1]++;
        }

        for(int i=0;i<freq.length;i++){
            if( freq[i]>0){

                System.out.print((char) i + ":" + freq[i]);
            }

        }

    }
    public static void fre_dup(String ch){

        int[]  freq = new int[256];

        for( int i=0;i<ch.length();i++){
            char  s1;
            s1 =  ch.charAt(i);
            freq[s1]++;
        }

        for(int i=0;i<freq.length;i++){
            if( freq[i]>1){

                System.out.println((char) i + ":" + freq[i]);
            }

        }

    }


    public static void main(String[] args){
        fre_str("aabbcckjiosfjn");
        fre_dup("aabbcckji");
    }

}
