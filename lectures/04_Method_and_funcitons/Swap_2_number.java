public class Swap_2_number {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
/*
        int temp = a ;
        a = b ;
        b = temp;



 */
        System.out.println(a);
        {
            // int a = 0; error can't use same value

            //reassingo or updating the varible a
            a = 90;
            int c = 56;
            System.out.println(c);
            //value initialised in this block , will reamain in the same block
            System.out.println(a);

        }
        //  a will updated
        System.out.println(a);



      //System.out.println(c); can't use c outside the block
        swap(a,b);
        System.out.println(" a = " + a + " b = " + b );


        //scoping in the for loops / while loops
        for(int i = 0 ; i<10;i++) {
            System.out.println("value of i = " + i);
            int num = 90;
          // a =0 ; i can update the value of a b but i can't initialized a new value of a

        }
        // we can't can't use the i outside the loop scope
        //  System.out.println(i); will give error


    }



    //this will not swap the values
    //because its a  pass by value thing
    static void swap(int a , int b ){
        int temp = a ;
        a = b ;
        b = temp;

        //this change is only valid in the function this funciton scope only
        //this why the values are getting changed


    }





    //scopeing in the for loops


    }

