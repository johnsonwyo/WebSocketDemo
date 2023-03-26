# WebSocket-SpringBoot | Getting Started

## Requirements/Build

You need Java and Maven. This project is essentially a Spring Server that simply uses Spring Boot, so I would imagine that everyone should know how to get Spring Boot 
Apps up and running by this point in the semester. You shouldn't have to add any dependencies, but maybe you'll have to tweak versions on the dependencies.
Hopefully not though.

## Connecting to the WebSocket/ServerEndpoint
- After cloning the repo on your local machine, start the SpringBoot application.
- The application will be started on `http://localhost:8080/`.
- The application will expose two endpoints.

  i. WebSocket (ws) Endpoint
  
  ii. HTTP Endpoint
 
- You need to establish a WS connection on `ws://localhost:8080/webSocket` with your websocket client (see next comment).
- I recommend using `https://www.piesocket.com/websocket-tester` as an online websocket client, so you don't have to build the client.
- Once you establish a connection to the WebSocket endpoint, you will start listening to any messages that get sent to the listeners.
 
## Broadcasting Messages to WebSocket Listeners
- To broadcast the message, you need to use the `http://localhost:8080/server/send` endpoint.
- A query parameter `message` has been set up to send messages.
- Make a HTTP `GET` or `POST` call on `http://localhost:8080/server/send?message=Hello World`, and your socket listeners will receive the message `Hello World` on their clients.
