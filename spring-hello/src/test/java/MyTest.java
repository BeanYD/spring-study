import com.youngbean7.pojo.Hello;
import com.youngbean7.pojo.Hello1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

        Hello1 hello1 = (Hello1) context.getBean("hello1");
        System.out.println(hello1.toString());

    }
}
