import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain

@QuarkusMain
class HelloMain : QuarkusApplication {
    @Throws(Exception::class)
    override fun run(vararg args: String): Int {
        println("Hello you")
        return 0
    }
}