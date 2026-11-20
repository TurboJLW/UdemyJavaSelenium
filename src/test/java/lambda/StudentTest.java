package lambda;

public class StudentTest {

    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John",it);

        Student med = new Student() {
            @Override
            public void SayHello(String name) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
            }
        };

        sayHello("Kate",med);

        //Zamiast powyższego zapisu, można uprościć cały @override przy tworzeniu obiektu na bazie jednometodowego
        //interfejsu używając lambdy
        //
        // (parametr,parametr1) -> System.out.println("I am not a student, My name is " + name);
        // Nawiasy sa konieczne jesli uzywamy wiecej niz 1 parametr
        Student notStudent = name -> System.out.println("I am not a student, My name is " + name );
        sayHello("Michael",notStudent);

    }

    public static void sayHello(String name, Student student){
        student.SayHello(name);

    };
}
