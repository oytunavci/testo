package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicApplicationTests {

//    @Autowired
//    private MockMvc mvc;
    
    @Autowired
    private ThemeParkRideController cont;
    
    @Test
    void contextLoads() {
    }

    @Test
    public void givenEmployees_whenGetEmployees_thenStatus200()
            throws Exception {


        cont = new ThemeParkRideController();
        String result = cont.getRides();
//        assertEquals(result, "Hello World!");
    }

}
