import com.youngbean7.pojo.Student;
import com.youngbean7.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);

        User user2 = context.getBean("user2", User.class);
        System.out.println(user2);
        User user3 = context.getBean("user2", User.class);
        System.out.println(user2 == user3);
    }


}
