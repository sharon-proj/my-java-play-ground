package com.sharon;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    private SayHello sayHello = new SayHello();

    @Test
    public void testHello(){
        Assert.assertEquals("Hello test", sayHello.hello("test"));
    }
}
