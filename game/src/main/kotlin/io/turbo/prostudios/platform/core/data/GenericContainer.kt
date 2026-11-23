package io.turbo.prostudios.platform.core.data

import io.turbo.prostudios.kernel.domain.scope.Scope
import io.turbo.prostudios.platform.core.data.`object`.BukkitObject
import io.turbo.prostudios.kernel.domain.scope.StorageScope

abstract class GenericContainer(
    val name: String,
    val data: List<BukkitObject>,
    val scope: Scope
) : BaseContainer {

}