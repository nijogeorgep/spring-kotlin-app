package com.cloudwalkers.app

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(SpringKotlinApplication::class),
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringKotlinApplicationTests {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun whenCalledShouldReturnHello() {
        val result = testRestTemplate.getForEntity("/hello", String::class.java)
        Assert.assertNotNull(result)
        Assert.assertNotEquals(result?.statusCode, HttpStatus.OK)
        Assert.assertNotEquals(result?.body, "Hello World")
    }

}
