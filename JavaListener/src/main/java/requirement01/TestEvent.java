package requirement01;

import java.util.EventObject;

public class TestEvent extends EventObject {
    private TestData td;
    private Object obj;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public TestEvent(Object source) {
        super(source);
        obj=source;
    }

    @Override
    public Object getSource() {
        return obj;
    }

    public void modify(TestData td){
        System.out.println("修改数值为10");
        td.setI(10);
    }

}
