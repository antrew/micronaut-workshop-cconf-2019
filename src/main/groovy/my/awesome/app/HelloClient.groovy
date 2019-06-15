package my.awesome.app

import io.micronaut.http.client.annotation.Client
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Client("/hello")
interface HelloClient extends HelloApi {
}
