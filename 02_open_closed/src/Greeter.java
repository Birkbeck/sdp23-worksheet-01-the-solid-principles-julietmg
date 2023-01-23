public class Greeter {
    GreetingInterface greetingInterface = new DefaultGreeting(); //If someone won't set the formality, the firld will be set to default

    public String greet() {
        return greetingInterface.greeting();
    }

    public void setFormality(GreetingInterface greetingInterface) {
        this.greetingInterface = greetingInterface;
    }
}
