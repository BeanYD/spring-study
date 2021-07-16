import com.youngbean7.config.BeanConfig;
import com.youngbean7.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user.toString());
    }
}
