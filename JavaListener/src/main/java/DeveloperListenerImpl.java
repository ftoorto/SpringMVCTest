public class DeveloperListenerImpl implements DeveloperListener{
    @Override
    public void work(Event event) {
        Developer developer = event.getDeveloper();
        System.out.println("work developer impl listener");
    }

    @Override
    public void study(Event event) {
        Developer developer = event.getDeveloper();
        System.out.println("study developer impl listener");
    }
}
