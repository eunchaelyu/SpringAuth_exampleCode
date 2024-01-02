package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("pizza")
    Food food; //같은 타입의 빈이 여러개더라도 @primary 가 붙어있는 객체에 선언됨 but @Qulifier 와 같이 쓴다면 우선순위가 @Qulifier 붙은 것에 있음(큰범위 <좁은 범위)

    @Test
    @DisplayName("테스트")
    void test1(){
        food.eat();
    }
}
