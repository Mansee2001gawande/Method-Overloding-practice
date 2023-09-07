////5) In the below Class X, is ‘method’ properly overloaded?


class Ovrl7 {
      
  // public void main(int A,int b)   {  // perfect match found
     // System.out.println(A+b); 
  // }                              
    //static void main (int c,double d){   // (int) assign double 
    // System.out.println((c+d));
   //}
  // void main(double e,int f){           // (int) assign double
     // System.out.println((e+f));
  // }
   static void main(double g,double h){    // suitable matching
      System.out.println ((g+h));
   }
      
}
  class Test2{
   public static void main(String[] args) {   
   Ovrl7 obj =new Ovrl7();
      obj.main(1040,2078);            
      
   }
  }  



