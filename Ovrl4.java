public class Ovrl4 {
    void mansee(){
        System.out.print("default");
        }
     void mansee(int x,int y){
        System.out.println("THIS IS 1st METHOD");
        }
        void mansee(float x ,float y){
            System.out.println("THIS IS 2ND METHOD");
        }
        void mansee(String x,String y){
                System.out.println("THIS IS 3st METHOD");
         }
    }
          class mannu{
            public static void main(String[] args) {
                Ovrl4 obj=new Ovrl4();
                obj.mansee("mansee","gawande");
                obj.mansee(9.4f,8.32f);
                obj.mansee(10,20);
                obj.mansee();


            }
         }

    
    

