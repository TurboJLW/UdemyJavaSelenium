package lambda;

public class ItStudent implements Student{
    @Override
    public void SayHello(String name) {
        System.out.println("I am IT guy");
        System.out.println("My name is " + name);
    }
}
