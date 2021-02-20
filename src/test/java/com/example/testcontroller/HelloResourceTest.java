package com.example.testcontroller;

import com.example.testcontroller.resource.HelloResource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
class HelloResourceTest {

    private MockMvc mockMvc;

    @Autowired
    private HelloResource helloResource;

    @BeforeEach
    public void setUp () throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(helloResource)
                .build();
    }

    @Test
    public void testHelloWorld () throws Exception{
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello world"));
    }



}