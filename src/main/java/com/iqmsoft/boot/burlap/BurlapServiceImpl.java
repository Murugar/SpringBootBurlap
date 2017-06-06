package com.iqmsoft.boot.burlap;

import org.springframework.stereotype.Service;

@Service("burlapService")
public class BurlapServiceImpl implements BurlapService {

   
    public String sayHello(){
        return "Burlap World";
    }

    public Foo foo() {
        return new Foo("foo");
    }
}
