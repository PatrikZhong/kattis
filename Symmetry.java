import java.util.*;

public class Symmetry {
    public static void main (String[] args){
        
        String[] printArray = new String[l000000];
        Scanner in = new Scanner(System.in);

        int lengths = in.nextInt();

        while(lengths!= 0){

            String[] nameArr = new String[lengths];

                for(int i = 0; i < lengths; i++){
                    String name = in.next();
                    nameArr[i] = name;
                }

            System.out.println(Arrays.toString(nameArr)); //här har vi en del-array med namn i sig
          
            for(int i = 0; i < lengths; i++){
                

            }
        }               
    }
}