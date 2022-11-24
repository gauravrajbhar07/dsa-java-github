import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5324,36,56,47,47,7,67,565,456);
        multiple(12,43,"guarav","rahul","mahi");
    }

    //variable lengths arguments u can pass 0 to varible lengths arguments
    static void fun(int ...v){
        //System.out.println(v); this will show the correspording ascaie values
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a ,int b , String  ...mul){
        // varible length arugment should be the last  in the rgs lists

        System.out.println(a + " " +  b  + " "+ Arrays.toString(mul));
        System.out.println(Arrays.toString(mul));
    }
}
