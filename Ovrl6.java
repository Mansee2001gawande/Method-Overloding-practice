/*2) In a class, one method has two overloaded forms. One form is defined as static and another form is 
defined as non-static. Is that method properly overloaded?*/
public  class Ovrl6 {
    void show1 (float...a){
        System.out.println("var arg int..");
    }
    void show1(int   a){                 // var can also catch the array but there are confused compiler
        System.out.println("2");
    }
       void show1(float c,float y)  {
        System.out.println("55");
    }
        void show1(int []  a){             //it execute fine but in anather method we use int...a, is error
        System.out.println("00");       // similar to int ... & int []a . var-arg stores the array. 
    }
    //void show1(int...a){
       // System.out.println("4");
    //}
}

    class Test{
        public static void main(String[] args) {
            Ovrl6 ob=new Ovrl6();
            ob.show1(20);              // perfect match found match.
            ob.show1(20.45f);       // float perfect match found

            ob.show1(34.2f,54.1f); 
          
        }
    }

    
//error  Ovrl6.java:7: error: cannot declare both show(int[]) and show(int...) in Ovrl6
//    void show(int [] a){
 //           ^
