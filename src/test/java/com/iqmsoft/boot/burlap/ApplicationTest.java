package com.iqmsoft.boot.burlap;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iqmsoft.boot.burlap.BurlapService;
import com.iqmsoft.boot.burlap.Foo;

@IntegrationTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private BurlapService burlapClient;

    @Test
    public void shouldSayHello() {

        //when
        String message = burlapClient.sayHello();

        then(message)
                .isNotEmpty()
                .isEqualTo("Burlap World");
    }

    @Test
    public void shouldReceiveFoo() {

        //when
        Foo foo = burlapClient.foo();

        then(foo.getName())
                .isEqualTo("foo");
    }

}
