package listenersource;

import java.util.EventListener;

public interface DemoListener extends EventListener {
    public void demoEvent(DemoEvent dm);
}
