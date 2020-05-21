package com.testcase;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

@DisplayName("测试用例1")
public class JunitDemoTest {

    @BeforeAll
    public static void beforeClass(){
        System.out.println("BeforeClass");
//        ArrayList<Integer> list=new ArrayList<Integer>();
//        list.add(4);
//        list.add(5);
        ArrayList<Integer> list=mock(ArrayList.class);
        when(list.size()).thenReturn(500);
    }

    @BeforeEach
    public void before(){
        System.out.println("Before");
    }

    @DisplayName("测试方法1")
    @Test
    @RepeatedTest(5)
    public void Test(){
        System.out.println("test");
    }

    @Disabled
    @Test
    public void Test1(){
        System.out.println("test1");
    }

    @AfterAll
    public static  void afterClass(){
        System.out.println("AfterClass");
    }
    @AfterEach
    public  void after(){
        System.out.println("after");
    }
}
