public class Ovrl2{
    void show(int x){
        System.out.println("THIS IS 1 ST METHOD");
    }
    void show (int x,int y){
        System.out.println("THIS IS 2 ND METHOD");
    }
    void show (int x,int y,int z){
        System.out.println("THIS IS 3 RD METHOD");
    }
}
class Test{
    public static void main(String[] args) {
        Ovrl2 ob=new Ovrl2();
        ob.show (10,20,30);
    }
}