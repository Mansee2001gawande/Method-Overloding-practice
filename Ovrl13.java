import java.util.Scanner ;
public class Ovrl13 {
    boolean flag=true;
    Scanner sc=new Scanner(System.in);
    //System.out.println("enter array length in character capital");
    //char length=sc.next().charAt(0);

    char q[]=new char['Z'];
   // System.out.print("enter array elements");
    for(char i='A';i<'Z';i++){
        q[i]=sc.next().charAt(0);
    }

   // System.out.print("enter the character you want to find:=");
    char found =sc.next().charAt(0);


    void m2(char... q){
        for(char i='A';i<'Z';i++){
                if(q[i]==found){
                    flag=true;
                    System.out.print("ele found "+q[i]);
                }
                flag=false; 
                System.out.print("element not found"+found);
        }
    }
}
class Allu{
public static void main(String[] args) {
    Ovrl13 obj=new Ovrl13();
    obj.m2(q[i]);
}
}

