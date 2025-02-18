package Tests_practise.Java_codePractise;

class a {
  public int a=10;

 void vechile(){

  }
  public void display(){
   System.out.println("iam class a");
  }
 }
 class b extends a {

 public int a = 20;

 public void car(){
  System.out.println("iam class b");
 }
 }
 class Display{

 public static void main(String[] args){

   a cal = new  b();
//  b caal = new  a();
//cal.();
   System.out.println(cal.a);
  System.out.println(((b) cal).a);
 }
 }




