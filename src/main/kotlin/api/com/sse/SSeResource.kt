package api.com.sse

import org.glassfish.jersey.media.sse.EventOutput
import org.glassfish.jersey.media.sse.OutboundEvent
import org.glassfish.jersey.media.sse.SseFeature
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.sse.Sse
import javax.ws.rs.sse.SseEventSink

class SSeResource {

    @GET
    @Produces(SseFeature.SERVER_SENT_EVENTS)
    @Path("events")
    fun serverSentEvents(@Context eventSink: SseEventSink, @Context sse: Sse){
        Thread(Runnable {
            for (i in 1..10) {
                Thread.sleep(500L)
                val eventBuilder = OutboundEvent.Builder().also {
                    it.name("Jersey simple app")
                    it.mediaType(MediaType.APPLICATION_JSON_TYPE)
                    it.data(String::class.java, "Hello multiple times!")
                }
                eventSink.send(eventBuilder.build())
            }
        }).start()
    }
}