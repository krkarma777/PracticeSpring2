package hello.core.autowired;

import hello.core.member.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {
        @Autowired(required = false)
        public void setNoBean1(Member member1) {
            System.out.println("setNoBean1 = " + member1);
        }
        @Autowired
        public void setNoBean2(@Nullable Member member2) {
            System.out.println("setNoBean2 = " + member2);
        }
        @Autowired
        public void setNoBean3(Optional<Member> member3) {
            System.out.println("setNoBean3 = " + member3);
        }
    }
}
