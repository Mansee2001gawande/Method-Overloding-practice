public class Ovrl10 {
    void mannu(byte x){
        System.out.println("byte version....");      // if want to call byte in main method declare it
    }
        void mannu(short x){
        System.out.println("short version....");     // write = obj.mannu(2); integer version print perfect m
    }
        void mannu(int  x){
        System.out.println("integer version....");
    }
        void mannu(long x){
        System.out.println("long version....");
    }
}
class manne{
    public static void main(String[] args) {
        Ovrl10 obj=new Ovrl10();
        byte b=2;                                   // byte version...
        short a=129;                                //version  short... 
        long c=45L;                                 // long version...
        obj.mannu(56);                            // integer version
       // obj.mannu(b);
    }
}
