package config

import java.time.Clock
import java.time.Instant
import java.time.ZoneId
import javax.annotation.Priority
import javax.enterprise.inject.Alternative
import javax.enterprise.inject.Produces

@Alternative
@Priority(1)
class ClockAlternative {

    @get:Produces
    val clock: Clock
        get() = Clock.fixed(Instant.EPOCH, ZoneId.of("UTC"))
}