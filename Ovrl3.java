public class Ovrl3 {
    void m1(long x ,int y){
        System.out.println("THIS IS 1st METHOD");
    }
        void m1(int x, long y){
        System.out.println("THIS IS 2nd METHOD");
        }
}
class overloding{   
    public static void main(String[] args) {
        Ovrl3 object=new Ovrl3();
        object.m1(10,20);
    }
}
