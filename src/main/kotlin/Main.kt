import api.com.sse.startListening
import server.JettyServer
import javax.ws.rs.client.Client
import javax.ws.rs.client.ClientBuilder

fun main() {
    JettyServer().start()
//    startListening() // Starts listening to SSEs then sends a request for no reason :D
}