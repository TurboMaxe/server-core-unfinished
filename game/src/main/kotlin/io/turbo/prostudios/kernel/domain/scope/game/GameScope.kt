package main.kotlin.io.turbo.prostudios.kernel.domain.storage.game

import io.turbo.prostudios.kernel.domain.scope.StorageScope
import io.turbo.prostudios.kernel.server.Gamemode

abstract class GameScope(
    val gamemode: Gamemode
) : StorageScope {
}