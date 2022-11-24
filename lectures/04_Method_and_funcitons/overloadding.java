public class overloadding {
    public static void main(String[] args) {
        funtion(12);
        funtion(45,34);
        funtion( 78, 90 , 678);
        funtion("hello gaurav ");
    }
    // its work in the compile time
    //it select th correct fucitons at the compile time

    static  void funtion(int a ){
        System.out.println(a);
    }
    static  void funtion(int a , int b ){
        System.out.println(a + " " + b );

    }
    static  void funtion(int a , int b , int c  ){
        System.out.println(a + " " + b + " " + c );

    }
    static  void funtion( String  str){
        System.out.println(str);

    }


}
