public class Ovrl15 {
    int jhingi(int [] p){
        int max=0;
        for(int i=0;i<p.length;i++){
            if(p[i]>max){
                max=p[i];
            }
        }
            return max;
    }
}
class Titu{
public static void main(String[] args) {
    int [] p={10,20,30,40,50,90,4,15};
    Ovrl15 obj= new Ovrl15();
    System.out.println("max element in given array is:"+obj.jhingi(p));
}
}

