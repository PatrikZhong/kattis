import java.util.*;

public class Tarifa{

    public static void main(String[] args){
      
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        int len = in.nextInt();
        int[] megaBytes = new int[len]; 

      
        for(int i = 0; i < len; i++){
            megaBytes[i] = in.nextInt();
        }

        int pott = 0;

        for(int i = 0; i < len; i++){

            if(megaBytes[i] < max){
                pott = pott + (max - megaBytes[i]);
                }
            else{
                pott = pott - (megaBytes[i] - max);
                if(pott < 0){
                    pott = 0;
                }
            }

          
        }


        System.out.println(pott + max);
    
        
    }
}