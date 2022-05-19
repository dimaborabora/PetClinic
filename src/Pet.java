import java.util.HashSet;
import java.util.Set;

public class Pet {
    private String name;
    private int age;
    private String gender;



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Pet(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
