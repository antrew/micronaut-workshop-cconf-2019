package my.awesome.app

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

interface HelloApi {
    @Get("/")
    HelloMessage index(@QueryValue("name") String name)
}
