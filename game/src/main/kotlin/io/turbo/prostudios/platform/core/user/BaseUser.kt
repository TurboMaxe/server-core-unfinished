package io.turbo.prostudios.platform.core.user

import io.turbo.prostudios.kernel.domain.context.ContextFactory
import main.kotlin.io.turbo.prostudios.kernel.user.User
import org.bukkit.entity.Player
import java.util.UUID

/**
 * Defines an online or offline player.
 *
 * @author TurboMaxe
 */

abstract class BaseUser(
    private val name: String,
    private val id: UUID = UUID.fromString(name),
    val connected: Boolean,
) : User {

    constructor(player: Player) : this(player.name, player.uniqueId, player.isConnected) {

    }

    override fun id(): UUID = id

    override fun name(): String = name

    override fun online(): Boolean = connected
}