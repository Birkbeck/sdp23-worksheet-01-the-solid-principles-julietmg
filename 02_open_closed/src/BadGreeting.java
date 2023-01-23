public class BadGreeting implements GreetingInterface {

    @Override
    public String greeting() {
        return "<growls>";
    }
    
}
