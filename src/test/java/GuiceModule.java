import com.google.inject.AbstractModule;

public class GuiceModule extends AbstractModule {
    protected void configure() {
        bind(String.class).toInstance("Rick James");
    }
}
