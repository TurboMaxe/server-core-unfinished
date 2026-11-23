package io.turbo.prostudios.platform.core.data

import io.turbo.prostudios.kernel.domain.scope.Scope
import io.turbo.prostudios.platform.core.data.`object`.BukkitObject
import java.util.*

open class MappedContainer(name: String,
                           data: List<BukkitObject>,
                           scope: Scope,
                           val id: UUID = UUID.fromString(name)
) : GenericContainer(name, data, scope) {

    constructor(container: GenericContainer) :
            this(container.name,
                 container.data,
                 container.scope,
                 UUID.randomUUID()
    ) {

    }



}