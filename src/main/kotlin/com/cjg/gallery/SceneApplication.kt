package com.cjg.gallery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing


@SpringBootApplication
@EnableMongoAuditing
class SceneApplication

fun main(args: Array<String>) {
    runApplication<SceneApplication>(*args)
}
