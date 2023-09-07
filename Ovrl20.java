 public class Ovrl20 {
    void cc(int k){
        System.out.println("one");
    }
    void cc(double a){
        System.out.print("two");
    }
}
class X extends Ovrl20 {
    void cc(double a) {
        System.out.println("four");
    }
}
 class Y {
    public static void main(String[] args) {
        X obj=new X();
        obj.cc(300);
    }
}
