public class Vararg {
    public int sumNumber(int ... g){
            System.out.println("argument length: " + g.length);
            int sum = 0;
            // using for each loop to display contents of a

            for(int x: g){
                sum = sum + x;
            }
            return sum;
        }
    
        public static void main( String[] args ) {
            Vararg ex = new Vararg();
    
            int sum2 = ex.sumNumber(2, 4);
            System.out.println("sum2 = " + sum2);
    
            int sum3 = ex.sumNumber(1, 3, 5);
            System.out.println("sum3 = " + sum3);
    
            int sum4 = ex.sumNumber(1, 3, 5, 7);
            System.out.println("sum4 = " + sum4);
        }
    }
    

