import com.kuang.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //这个位置必须是接口，因为要实现的就是接口里的方法
        //动态代理代理的是接口
        UserService userservice = (UserService) context.getBean("userService");
        userservice.add();
    }
}
