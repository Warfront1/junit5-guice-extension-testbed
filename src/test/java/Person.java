import com.google.inject.Inject;

public class Person {
    private String name;

    @Inject
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
