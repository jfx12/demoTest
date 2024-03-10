import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[]args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student student= (Student) context.getBean("student");
        System.out.println(student.toString());

        /*
        Student{name='sj', address=Address{address='河南'},
        books=[jiangshan, 啥农机], hobbys=[fdsf, 税收], cards={fsfd=1234,
         xjf=1213}, snds='null', properties={姓名=xjg, 年龄=fsd}}*/

    }
    @Test
    public  void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("user.xml");
        User user=context.getBean("user2",User.class);
        System.out.println(user);


    }
}
