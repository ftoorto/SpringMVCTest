public class ListenerTest {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.registerListener(new DeveloperListenerImpl());
        developer.study();
        developer.work();
    }
}
