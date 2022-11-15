package com.zijian

import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
import mu.KLogger
import mu.KotlinLogging
import javax.inject.Inject

@QuarkusMain
class HelloMain(
    private val logger: KLogger = KotlinLogging.logger {}
) : QuarkusApplication {

    @Inject
    lateinit var putObjectService: PutObjectService

    @Throws(Exception::class)
    override fun run(vararg args: String): Int {
        println("Hello you")
        logger.info { "logging ${putObjectService.javaClass}" }
        return 0
    }
}