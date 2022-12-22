public class Run_compileTimePolymorphiism {
    static class A{
        void run(){
            System.out.println("Mai bhag rha hu");
        }
    }
    static class B extends A{
        void run(){
            System.out.println("Mai ni rukunga");
        }
    }
//    static class Doctor extends Person{
//        void run(){
//            System.out.println("Mai ni rukunga");
//        }
//    }
//    public static void puneet(int a){
//        System.out.println("cringe");
//    }
//    public static void puneet(int a, int b){
//        System.out.println("superstar");
//    }
    public static void main(String[] args){
        System.out.println("Hello world!");
        A chu = new B();
        chu.run();
//        puneet(2,4);
    }
}
