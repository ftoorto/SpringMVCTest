import com.yy.enums.Grade;
import org.junit.Test;

import java.beans.MethodDescriptor;
import java.lang.constant.ClassDesc;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.lang.constant.ConstantDescs;
import java.util.Optional;

public class Test02 {
    public final String s="final haha";
    @Test
    public void method01(){
        Grade g=Grade.One;
        System.out.println("g的年级："+ g.grade);
        int length = Grade.values().length;
        String a="haha";
        Optional<String> s = a.describeConstable();
        System.out.println(s.get());
//        Optional<Grade> grade=Optional.empty();
//        System.out.println(grade.get());
//        Grade grade2=null;
//        System.out.println(grade2.toString());
        System.out.println(g.getDeclaringClass());
        ClassDesc classDesc= ConstantDescs.CD_Enum.arrayType();
    }

    ConstantDesc constantDesc= s.
    static void describe(Class<?> clazz, String pad, String leadin) {
        if (clazz == null) return;
        String type =
                clazz.isInterface() ? "interface" :
                        clazz.isArray() ? "array" :
                                clazz.isPrimitive() ? "primitive" :
                                        clazz.isEnum() ? "enum" :
                                                "class";
        System.out.printf("%s%s%s %s ( %s )%n",
                pad, leadin, type, clazz.getSimpleName(), clazz.getName());
        for (Class<?> interfaze : clazz.getInterfaces()) {
            describe(interfaze, pad + "   ", "implements ");
        }
        describe(clazz.getComponentType(), pad + "   ", "elements are ");
        describe(clazz.getSuperclass(), pad + "   ", "extends ");
    }
    static void describe(Class<?> clazz) {
        describe(clazz, "", "");
        System.out.println();
    }
    @Test
    public void test3() {
        describe(boolean[][].class);
        describe(java.math.RoundingMode.class);
        describe(java.util.ArrayList.class);
        describe(void.class);
    }

}
