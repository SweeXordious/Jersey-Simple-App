package integrationTest

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.glassfish.jersey.test.JerseyTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import server.ResourceConfig
import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.core.Application


class DummyTest : JerseyTest() {

    @BeforeEach
    override fun setUp() {
        super.setUp()
    }

    @AfterEach
    override fun tearDown() {
        super.tearDown()
    }

    override fun configure(): Application {
        return ResourceConfig()
    }

    @Test
    fun `listing test`() {
        assert(target("/dum/dummies").request().get().readEntity(String::class.java) == "dummy, anotherDummy")
    }

    @Test
    fun `Sse test`() {
        assert(target("/dum/dummies/sse/events").request().get().readEntity(String::class.java).contains("event"))
    }
}