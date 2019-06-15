package my.awesome.app

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.QueryValue


@Controller("/hello")
class HelloController implements HelloApi {
    @Override
    HelloMessage index(@QueryValue("name") String name) {
        return new HelloMessage(greeting: "Hello ${name}!")
    }
}
