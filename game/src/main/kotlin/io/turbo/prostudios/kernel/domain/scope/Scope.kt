package io.turbo.prostudios.kernel.domain.scope

enum class Scope {
   INTERNAL, // Accessible from one gamemode
   SHARED, // Shared across multiple gamemodes
   GLOBAL, // Shared across the server
}