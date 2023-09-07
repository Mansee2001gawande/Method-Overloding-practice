public class Ovrl11 {
    void chiku(double...a){
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]);
        }
    }  
}
class Miku{
    public static void main(String[] args) {
        Ovrl11 obj=new Ovrl11();
        double a[]={4.67,8.3,9.0};
        obj.chiku(a);
    }
}
