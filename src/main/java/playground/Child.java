package playground;

public class Child extends Parent{

    @Override
    public void say() {
        System.out.println("Child talks to you");
    }

    public static void hello(){
        System.out.println("Hello from Child");
    }


}
