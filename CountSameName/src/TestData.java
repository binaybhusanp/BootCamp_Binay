import java.util.ArrayList;
import java.util.List;

/**
 * Created by pradhanb on 7/20/2017.
 */
public class TestData {
    public void TestPerson(){
        ArrayList<Person> person = createPersonList();
        for (Person p: person) {
            System.out.println(p);
        }
    }

    public ArrayList<Person> createPersonList() {
        ArrayList<Person> personList= new ArrayList<Person>;
        personList.add(new Person("Sushant", 'M'));
        personList.add(new Person("Snigdha", 'F'));
        personList.add(new Person("Harshita",'F'));
        personList.add(new Person("Snigdha", 'M'));

        return personList;
    }
}
