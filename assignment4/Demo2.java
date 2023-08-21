public class Demo2 {
    public static void main(String[] args) {
        /*
            Single Loop, Nested Loops
            Via +

            + + + + + + +
            + + +   + + +
            + +       + +
            +           +

          */
        int y=4;
        int x=0;
        while(x<4){
            int a=0;
            while(a<y-x){
                System.out.print("+ ");
                a++;
            }
            int b=0;
            while(b<x){
                System.out.print("  ");
                b++;
            }
            int c=0;
            while(c<x-1){
                System.out.print("  ");
                c++;
            }
            int d=0;
            while(d<y-x){
                System.out.print("+ ");
                d++;
            }
            
            System.out.println();
            x++;
         }

          
    }
}
