public class Ovrl5 {
    void main(float...a){
        System.out.println("float version...");
    }
    void main(int a){
    System.out.println("integer version");
    }
}
class Over{
    public static void main(String[] args) {
        Ovrl5 object=new Ovrl5();
        object.main (10);



        object.main (10.98f);


    }
}
