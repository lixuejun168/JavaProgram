package com.suitedemo;


import com.testcase.BuyTest;
import com.testcase.LoginTest;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@Ignore
@RunWith(Suite.class)
@Suite.SuiteClasses({
    LoginTest.class,
    BuyTest.class

})
class SuiteDemoTest1 {
}
