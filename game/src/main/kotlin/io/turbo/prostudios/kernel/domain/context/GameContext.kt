package io.turbo.prostudios.kernel.domain.context

import io.turbo.prostudios.kernel.domain.scope.Scope
import io.turbo.prostudios.kernel.server.Gamemode
import io.turbo.prostudios.kernel.server.Season
import org.bukkit.Server
import org.bukkit.entity.Player

data class GameContext(
    val game: Gamemode,
    val player: Player,
    val host: Server,
    val season: Season = Season.NORMAL
)

