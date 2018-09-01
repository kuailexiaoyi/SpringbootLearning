package com.zrblog.springboot.controller;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.net.URL;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @Description: ${Description}
 * @Author: zrblog
 * @CreateTime: 2018-09-01 00:56
 * @Version:v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloWorldControllerTest {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception{
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getHello() throws Exception{
        ResponseEntity<String> responseEntity = template.getForEntity(base.toString(), String.class);
//        assertThat(responseEntity.getBody(),equalTo("Greeting from Spring Boot"));
        assertThat(responseEntity.getBody(), equalTo("Greetings from Spring Boot!"));
    }
}
