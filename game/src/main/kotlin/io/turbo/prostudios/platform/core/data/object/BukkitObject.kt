package io.turbo.prostudios.platform.core.data.`object`

import io.turbo.prostudios.kernel.domain.scope.Scope
import io.turbo.prostudios.kernel.domain.scope.StorageScope
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.checkerframework.checker.units.qual.t
import javax.xml.stream.Location

/**
 *
 * Provides an interface to construct immutable
 * Bukkit objects using a number of functions.
 *
 * @author TurboMaxe
 */

class BukkitObject private constructor(
    val obj: Any,
    val scope: Scope = Scope.INTERNAL
) : IObject {

    override fun scope() = this.scope

    companion object {
        val objectConsumer: (Any, Scope) -> BukkitObject ={ t, s ->
                BukkitObject(t, s)
            }

        fun location(location: Location, scope: Scope): BukkitObject {
            return objectConsumer(location, scope)
        }

        fun item(item: ItemStack, scope: Scope): BukkitObject {
            return objectConsumer(item, scope)
        }

        fun player(player: Player,  scope: Scope): BukkitObject {
            return objectConsumer(player, scope)
        }

        fun material(material: Material, scope: Scope): BukkitObject {
            return objectConsumer(material, scope)
        }

        fun world(world: World, scope: Scope): BukkitObject {
            return objectConsumer(world, scope)
        }

        fun serverObject(obj: Any, scope: Scope): BukkitObject {
            return objectConsumer(Pair(obj, scope), scope)
        }
    }
}