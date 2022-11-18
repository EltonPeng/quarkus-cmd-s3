package com.zijian.config

import java.time.Clock
import java.time.Instant.EPOCH
import java.time.ZoneId
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Produces

class ClockProducer {

    @get:Produces
    val clock: Clock
        get() = Clock.systemUTC()
}