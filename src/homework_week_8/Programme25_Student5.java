package homework_week_8;

public class Programme25_Student5 {//Java program to overload constructors
    int id;
    String name;
    int age;

    //creating two arg constructor
    Programme25_Student5(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Programme25_Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Programme25_Student5 s1 = new Programme25_Student5(111, "Karan");
        Programme25_Student5 s2 = new Programme25_Student5(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}

