public class Ovrl17 {
    public void m8(int x,int y,int...z){
        System.out.print("X: "+x);
        System.out.print("y:"+y);
    
    for(int i=0;i<z.length;i++)
        System.out.print("z: "+z[i]);
    }
}
class Less{
    public static void main(String[] args) {
        Ovrl17 obj=new Ovrl17();
        obj.m8(4,3,5,6,7,8,9,0);
    }
}
