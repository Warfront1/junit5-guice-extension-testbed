import com.google.inject.Guice;
import com.google.inject.Injector;
import name.falgout.jeffrey.testing.junit.guice.IncludeModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GuiceExtensionTests {
    @Test
    @IncludeModule(GuiceModule.class)
    public void canWeInjectAString(String name){
        Assertions.assertEquals(name, "Rick James");
    }

    @Test
    @IncludeModule(GuiceModule.class)
    public void canWeInjectAPerson(Person p){
        Assertions.assertEquals(p.getName(), "Rick James");
    }

    @Test
    public void canWeInjectAPersonWithOurOwnInjector(){
        Injector i = Guice.createInjector(new GuiceModule());
        Person p = i.getInstance(Person.class);
        Assertions.assertEquals(p.getName(), "Rick James");
    }
}
