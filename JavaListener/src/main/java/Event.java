public class Event {
    private Developer developer;

    public Event(Developer developer) {
        this.developer = developer;
    }

    public Event() {
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}
