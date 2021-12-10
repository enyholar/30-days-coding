import java.util.ArrayList;
import java.util.List;

//Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements. 
//        Example : 
//        Input :  arr[] = [1, 2, 3, 4, 5, 6, 7]
//        d = 7, n= 7
//        Output : arr[] = [3, 4, 5, 6, 7, 1, 2]
public class RotateFunction {
     public static void main(String[] args) {
         int [] input = new int[] {1, 2, 3, 4, 5, 6, 7};
         int d = 6;
         int n = input.length;
         int [] result =  rotateMethod(d,n,input);
         for (int i = 0; i < result.length; i++)
             System.out.print(result[i]+"");
    }

    public static int []  rotateMethod(int d, int n, int[] input){
        List<Integer> arrayValue = new ArrayList<>();
             for  (int i = d; i < input.length; i++) {
                 arrayValue.add(input[i]);
             }

             for  (int i = 0; i < d; i++) {
                 arrayValue.add(input[i]);
             }

         return arrayValue.stream().mapToInt(i->i).toArray();
    }
}

