public class Ovrl19 {
    public void mansee(int ...y){
        System.out.println("1");
     }
     public void mansee(int[] y){
        System.out.println("3");
     }
    
}
//Duplicated. Because, var args (int … a) are nothing but the arrays. So here, (int … a) and (int[] a) are the same.
