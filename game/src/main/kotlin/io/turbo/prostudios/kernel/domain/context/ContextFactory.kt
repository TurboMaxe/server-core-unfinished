package io.turbo.prostudios.kernel.domain.context

import io.turbo.prostudios.kernel.server.Gamemode
import io.turbo.prostudios.kernel.server.Season
import org.bukkit.entity.Player
import java.util.Stack
import java.util.concurrent.ConcurrentHashMap


object ContextFactory {

    private val contexts: ConcurrentHashMap<Gamemode, Stack<GameContext>> = ConcurrentHashMap()

    fun add(game: Gamemode, vararg gameContexts: GameContext) {
        val stack = Stack<GameContext>()

        if (contexts.containsKey(game)) gameContexts.forEach {
            contexts.get(game)?.push(it)
        }

        for (context in gameContexts) {
             stack.push(context)
        }
        contexts[game] = stack
    }


    fun create(
        game: Gamemode,
        player: Player,
        host: Server,
        season: Season = Season.NORMAL
    ): GameContext {
       val context = GameContext(game, player, host, season)
       if (contexts.get(game).isNullOrEmpty()) {
          contexts.get(game)?.add(Stack<GameContext>().push(context))
       } else {
          contexts.get(game)?.add(context)
       }
       return context
    }

}