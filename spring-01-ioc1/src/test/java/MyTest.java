import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //用户只会接触到业务层，不会接触到Dao层
        //用户调用的是业务层，但代码在执行的时候是去调用dao层里的方法
        //业务层就做一个事情就是去调用Dao层进行查询
        //UserService userService = new UserServiceImpl();
        //((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
        //userService.getUser();
        //===========================================================
        //获取ApplicationContext:拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //容器在手，天下我有，需要什么，就直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userserviceImpl");
        userServiceImpl.getUser();
    }
}
