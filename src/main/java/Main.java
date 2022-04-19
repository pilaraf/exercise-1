import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int [] input =  {5,4,3,2,1};

        int lastPosition = input[input.length -1]*input[0];
        for (int i = 0; i<input.length -1;i++){
            input[i] = input[i] * input[i+1];
        }
        input[input.length-1]=lastPosition;

        System.out.println(Arrays.toString(input));*/

        int [] input = {1,2,3,4,5,6};
        for(int i = 0;i<input.length/2; i++ ){
            int temporal = input[i];
            input[i] = input[input.length-i-1];
            input[input.length-i-1] = temporal;
        }

        System.out.println(Arrays.toString(input));

        int[] input2 = {5,4,3,2,1};
        int[] invertedArray = new int[input2.length];
        for(int i = 0; i< input2.length; i++){
            int index = input2.length -1;
            invertedArray[i] = input2[index-i];
        }

        System.out.println(Arrays.toString(invertedArray));




    }
}
