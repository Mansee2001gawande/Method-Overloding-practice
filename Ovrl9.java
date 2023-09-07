public class Ovrl9 {
    //void method(int a)
    //{
       // System.out.println("integer version");    //it works find int found int
    //}
    void method (char x)
    {
        System.out.println("character version");
    }
 }
 class Demo{
    public static void main(String[] args) {
        Ovrl9 obj =new Ovrl9();
       // obj.method(97);                    // 1st it check int
       obj.method((char)(97));               //char can  store int.       char=(char)(int)
    }
 }
