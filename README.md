# Multiplayer server for [DragonBallArena](https://github.com/Draym/DragonBallArena)

It is a pretty simple game server using [kryonet](https://github.com/EsotericSoftware/kryonet) which handle one game instance.

When the required number of player have joined the server, the game can start. If more people join the server, they can attend the game as observers and watch the other players play.

Multiple instances of the server can be launched at the same time, but because there is no live indexing server to reference the custom ones, the client have to enter te IP address of the game server it wishes to join.


### Functionalities
- one server = game instance
- game can start when required number of players have joined
- observer mode for the extra players
- client join custom server with their IP

### Improvement
- handle multiple games instance per server
- create a master server which list all the custom ones, so client only haave to enter master server IP to get the list of available games
