package com.example.webpractice.mapper;

import com.example.webpractice.entity.stu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper   //自动生成对象交给ioc容器管理
public interface stumap {
@Select("select * from student where Sno = #{Sno}")  //这种传参方式能让传进来是什么就是什么，不会改变原sql语句，只是把参数的值传进来，能防SQL注入
public List<stu> gtstu(String Sno);
@Delete("delete from student where Sno = 1")
public int delstu();   //返回删除信息数
}
