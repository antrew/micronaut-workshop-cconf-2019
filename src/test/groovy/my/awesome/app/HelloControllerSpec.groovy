package my.awesome.app

import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import spock.lang.AutoCleanup
import spock.lang.Specification

import javax.inject.Inject


@MicronautTest
class HelloControllerSpec extends Specification {

    @Inject
    EmbeddedServer embeddedServer

    @AutoCleanup @Inject @Client("/")
    RxHttpClient client

    void "test hello"() {
        given:
        def client = embeddedServer.getApplicationContext().getBean(HelloClient.class);
        expect:
        HelloMessage serverResponse = client.index("codecentric");

        "Hello codecentric!" == serverResponse.greeting
    }
}
