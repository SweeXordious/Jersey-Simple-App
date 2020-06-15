package api.com.sse

import org.glassfish.jersey.media.sse.EventOutput
import org.glassfish.jersey.media.sse.OutboundEvent
import org.glassfish.jersey.media.sse.SseFeature
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

class SSeResource {

    @GET
    @Produces(SseFeature.SERVER_SENT_EVENTS)
    @Path("events")
    fun serverSentEvents() : EventOutput {
        val eventOutput = EventOutput()
        Thread(Runnable {
            try {
                for (i in 1..10){
                    val eventBuilder = OutboundEvent.Builder().also {
                        it.name("Jersey simple app")
                        it.mediaType(MediaType.APPLICATION_JSON_TYPE)
                        it.data(String::class.java, "Hello multiple times!")
                    }
                    eventOutput.write(eventBuilder.build())
                }
            } catch (e: Exception) {throw e}
            finally {
                eventOutput.close()
            }
        }).start()
        return eventOutput
    }
}