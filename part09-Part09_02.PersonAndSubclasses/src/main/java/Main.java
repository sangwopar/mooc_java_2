import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        Person ada = new Person("ada love", "24 madd st  . ad") ;
        Person esko = new Person("Esko ukk", "mannhr");

        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "24132");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);

        Teacher ada2 = new Teacher("ada", "24", 1200);
        System.out.println(ada2);
        
        ArrayList<Person> list = new ArrayList<>();
        list.add(ada);
        list.add(ollie);
        list.add(ada2);
        printPersons(list);

        



    }
    
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
