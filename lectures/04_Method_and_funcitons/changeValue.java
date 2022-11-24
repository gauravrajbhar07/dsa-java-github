import java.lang.reflect.Array;
import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,2,3,4,5,6,7};
        Change(arr);
//        String arrr = Arrays.toString(arr);
//        System.out.println(arrr);
        System.out.println(Arrays.toString(arr));

    }
    static void Change(int[] nums){
        nums[0] = 99; //if you make changes to the object via this ref variable ,same object will be changes

        //manupilating the sae object
    }
}
