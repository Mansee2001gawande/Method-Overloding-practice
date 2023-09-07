 class Ovrl8 {
     void m1(byte x)
    {
        System.out.print("byte version...");   // it take 20 as integer (int)to(byte)possible lossy conversion
    }
     public void m1(int x)
    {
        System.out.print("integer version..."); // it work fine perfect match found
    }
     void m1(long x)
    {
        System.out.print("long version...");   // int take 20 as integer (int)to(long) print long version
    }
 }
     class Test1{
        public static void main(String[] args) {
          Ovrl8 object =new Ovrl8();
          object.m1(20);  // 1 st it found int if it does not found it found suitable match 
        }
    }
    

