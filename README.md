# MinecraftAnticheatPrototype

This is my attempt at writing a platform-independent Minecraft anticheat.
I've never written a Minecraft anticheat before this, and it seemed interesting so I'm giving it a go.

> [!WARNING]
> Do not use this in production and do not expect much from it.

Currently, this will not be available on sites like SpigotMC.
I do not want people attempting to use it on their production servers.

It will be available to download through GitHub actions for anyone who wants to test it out and leave feedback.

## My Idea

I've seen multiple anticheats for Minecraft, but they all require Spigot to run.
My plan is to make a single, core anticheat that is able to run on any Minecraft platform.
It'll use abstracted methods to get whatever data it needs to perform checks.

I've had an idea to run a Minestom server but there's no anticheats available for Minestom or for any proxy software.
Since the fundamental game mechanics are the same across all these platforms, it should be possible, hence why I created
this prototype.

However, I've never written a Minecraft anticheat before, so I have absolutely no idea what I'm doing.
My plan is to look through Minecraft's client code to understand how the game functions and handles movement.
**Any help would be greatly appreciated!**

## Checklist

- Support platforms
    - [ ] Bukkit/Spigot/Paper/Folia (and any forks that don't completely change everything)
    - [ ] BungeeCord/Waterfall
    - [ ] Velocity
    - [ ] Fabric
    - [ ] Minestom (might generalize this and make it for any packet listener system)
- Implement checks
    - Movement
        - [ ] Fly
        - [ ] Speed
    - Combat
        - [ ] Reach
    - Misc
        - [ ] Timer

As you can see, I don't plan on adding many checks right now.
This is mostly because I have no experience with anticheats...
I might plan on adding more things later on, but for now, I want to see if this "platform-independent" idea is good.