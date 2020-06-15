package api.com.sse

import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import javax.ws.rs.client.Client
import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.client.WebTarget
import javax.ws.rs.sse.InboundSseEvent
import javax.ws.rs.sse.SseEventSource


fun startListening() {
    val client: Client = ClientBuilder.newBuilder().build()
    val target = client.target("http://localhost:8080/dum/dummies/sse/events")
    val sseEventSource = SseEventSource.target(target).build()
    sseEventSource.register { event: InboundSseEvent ->
        println(
            event.name + "; "
                    + event.readData(String::class.java)
        )
    }
    sseEventSource.open()
    target.request().get()
    Thread.sleep(2000L)
    sseEventSource.close()
}