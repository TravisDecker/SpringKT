package com.decker.springkt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtSpringApplication

fun main(args: Array<String>) {
	runApplication<KtSpringApplication>(*args)
}
