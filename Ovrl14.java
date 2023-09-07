import java.util.Scanner ;
 class Ovrl14 {
     public void ma(int []q){
         public void ma1(int found){

    //public static void main(String[] args) {
        boolean flag=true;

        //Scanner sc=new Scanner(System.in);
        //System.out.print("enter the length of an array");
       // int length=sc.nextInt();

       // int q[]=new int [length];
       // System.out.print("enter array elements");
        //for(int i=0;i<q.length;i++) {
           // q[i]=sc.nextInt();
    //}
        //System.out.print("enter the character you want to find:=");
       // int found =sc.nextInt();

        for(int i=0;i<q.length;i++){
            if(found==q[i]){
                flag=true;
                break;
            }
        }   
            if(flag==true)
             System.out.print("ele found ");
            else
            System.out.print("element not found"); 
        } 
    }          
 }          
 class Allu{
    public static void main(String[] args) {
        int q[]={10,20,30,40,40,60};
        Ovrl13 obj=new Ovrl13();
        System.out.println(obj.ma(q));
    }
}


    

