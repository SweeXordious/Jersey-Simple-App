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