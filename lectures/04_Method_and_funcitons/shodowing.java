
public class shodowing {

    static int GLOBAL = 69; // this will we shadowed
    //It in the shodowing class scope
    public static void main(String[] args) {
        //everything in side the main should be static

        System.out.println("GLOBAL : " + GLOBAL); // 69
        int GLOBAL = 78;
        System.out.println("golbal in side the main scope : " +GLOBAL); // 78
        fun();
    }

    static void fun(){
        System.out.println("GLOBAL : " + GLOBAL); //78
    }
}
