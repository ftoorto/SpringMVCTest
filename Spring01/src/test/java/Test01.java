import com.yy.dao.UserDaoImpl;
import com.yy.pojo.User;
import com.yy.service.UserService;
import com.yy.service.UserServiceImpl;
import org.junit.Test;

public class Test01 {
    @Test
    public void testMethod01(){
        UserServiceImpl userService=new UserServiceImpl();
        User user=userService.getUser();
        System.out.println(user.toString());
    }
}
