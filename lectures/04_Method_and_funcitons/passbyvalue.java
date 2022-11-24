public class passbyvalue {
    public static void main(String[] args) {
        String name = "kunal kushwaha";    //object of string class
        System.out.println(greet(name));
        System.out.println(name);
    }
    static String greet(String naam){
        naam = "guarav"; //creating a new opject
        //u can't modifies / manupilate the string
        return naam;
    }
}
