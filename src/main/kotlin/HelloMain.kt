package com.zijian

import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
import mu.KLogger
import mu.KotlinLogging
import java.time.Clock
import java.time.Instant
import javax.inject.Inject

@QuarkusMain
class HelloMain(
    private val logger: KLogger = KotlinLogging.logger {}
) : QuarkusApplication {

    @Inject
    lateinit var putObjectService: PutObjectService

    @Inject
    lateinit var clock: Clock

    @Throws(Exception::class)
    override fun run(vararg args: String): Int {
        val nowIs = Instant.now(clock)
        println("Hello you - $nowIs")
        logger.info { "logging ${putObjectService.javaClass}" }
        return 0
    }
}