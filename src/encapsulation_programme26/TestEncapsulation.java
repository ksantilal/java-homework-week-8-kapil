package encapsulation_programme26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //setting value of the variables

        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        //Display values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo());


    }
}

