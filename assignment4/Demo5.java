public class Demo5 {
    public static void main(String[] args) {
        int y=0;
        int k=5;
       boolean reverse=false;
        while(y++<9){
            int x=0;
            while(x++<k){
                System.out.print("+ ");
                
            }
            System.out.println();
            k--;
            if(k==1) {reverse=true;
            k++;}
        }
    }
}
