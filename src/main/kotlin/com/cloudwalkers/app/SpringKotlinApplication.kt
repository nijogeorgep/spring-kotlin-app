package com.cloudwalkers.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringKotlinApplication

fun main(args: Array<String>) {
    //runApplication<SpringKotlinApplication>(*args)
    SpringApplication.run(SpringKotlinApplication::class.java, *args)
}
