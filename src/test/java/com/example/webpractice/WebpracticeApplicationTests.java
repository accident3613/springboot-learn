package com.example.webpractice;

import com.example.webpractice.entity.stu;
import com.example.webpractice.mapper.stumap;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WebpracticeApplicationTests {
    @Autowired   //用于实现依赖注入,可以用来自动注入 Spring 容器中的 Bean,减少手动创建对象和管理依赖的复杂性
    private stumap s;

    @Test
    void contextLoads() {
        List<stu> st=s.gtstu("201215121");
        int de=s.delstu();
        System.out.println(de);
        st.stream().forEach(so->{
           System.out.println(so);  //有toString()方法能直接调用
        });
    }

}
