import com.yy.enums.Grade;
import org.junit.Test;

import java.lang.constant.Constable;

public class Test02 {
    @Test
    public void method01(){
        Grade g=Grade.One;
        System.out.println("g的年级："+ g.grade);
        int length = Grade.values().length;
        Constable String a="haha";
    }

}
