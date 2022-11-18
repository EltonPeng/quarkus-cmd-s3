import io.quarkus.test.junit.main.Launch
import io.quarkus.test.junit.main.LaunchResult
import io.quarkus.test.junit.main.QuarkusMainTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


@QuarkusMainTest
class HelloMainTest {
    @Test
    @Launch("World")
    fun testLaunchCommand(result: LaunchResult) {
        Assertions.assertTrue(result.getOutput().contains("Hello you - 1970-01-01T00:00:00Z"))
    }
}