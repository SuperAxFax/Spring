import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
    //Student{name='fax',
    // address=Address{address='西安'},
    // books=[红楼梦, 西游记, 水浒传, 三国演义],
    // hobbys=[听歌, 敲代码, 看电影],
    // card={身份证=11112323123123, 银行卡=12345649489153481},
    // games=[LOL, COC, BOB],
    // info={password=123456, url=男, driver=20190254, username=root},
    // wife='null'}
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user2");
        System.out.println(user);
    }
}
