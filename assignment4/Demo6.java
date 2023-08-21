public class Demo6 {
    public static void main(String[] args) {
        int y=0;
        int k=0;
        while(y++<4){
            int x=0;
            while(x++<7){
                if(x>(4-k) && x<(4+k)){
                    System.out.print("  ");
                }
                 else{
                 System.out.print("+ ");
                }
            }
            k++;
            System.out.println();
        }
        
    }
}
