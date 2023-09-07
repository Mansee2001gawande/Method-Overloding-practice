public class Ovrl12 {
    void m2(int...f){
    for(int i=0;i<f.length;i++){
        System.out.print(f[i]);
    }
}
 }
 class Chintu{
    public static void main(String[] args) {
        Ovrl12 obj=new Ovrl12();
        int a[]={9,4,2,11,5,9};
        obj.m2(a);
    }
 }
