import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //只要new一下立马会出现无参构造的内容！
        //User user = new User();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml","bean.xml");
        //默认输出的是无参构造的内容
        User user = (User) context.getBean("ttt");
        user.show();
    }
}
