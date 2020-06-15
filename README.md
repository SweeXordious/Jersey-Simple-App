# Jersey-Simple-App

## Hierarchy:

/dum/dummies
- /dummy
    - /first
    - /second/{value}
- /anotherDummy
    - /anotherFirst
    
Served using an embedded Jetty server.

## What it contains:
##### Resources registration
- using package name
- using direct reference to the implementation class
- using Service Provider Interface (SPI)

Check the `ResourceConfig` class for more information.

##### Integration test
Uses `JerseyTest` framework.

##### Events
Events are handled using Server-Side Events (SSE). You can find a simple SSE client as well.