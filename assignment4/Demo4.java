public class Demo4 {
    public static void main(String[] args) {
           /*
            Nested Loops
            Via + (Space)


            + + + + + + +
            + + +   + + +
            + +       + +
            +           +
            + +       + +
            + + +   + + +
            + + + + + + +
          */
          
          int x=0;
          while(x++<4){
            int y=0;
            while(y++<7){
                if(x==1&&y==4||x==3&&y==3||y==4){
                    System.out.print("  ");
                }
                else{
                    System.out.print("+ ");
                }
            }
            System.out.println();
            x++;
          }
          
    }
}
