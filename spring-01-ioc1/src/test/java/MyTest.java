import com.youngbean7.dao.UserDaoImpl;
import com.youngbean7.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        UserServiceImpl userService = (UserServiceImpl)context.getBean("userServiceImpl");

        userService.getUser();
    }
}
