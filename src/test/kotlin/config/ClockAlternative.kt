package config

import io.quarkus.arc.Priority
import java.time.Clock
import java.time.Instant
import java.time.ZoneId
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Alternative
import javax.enterprise.inject.Produces

//@ApplicationScoped
//@Priority
@Alternative
class ClockAlternative {

    @get:Produces
    val clock: Clock
        get() = Clock.fixed(Instant.EPOCH, ZoneId.of("UTC"))
}