package requirement01;

import java.util.EventListener;

public interface ValueModified extends EventListener {
    void dataModify(TestData td);
}
