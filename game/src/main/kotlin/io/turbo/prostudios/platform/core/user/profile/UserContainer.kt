package io.turbo.prostudios.platform.core.user.profile

import io.turbo.prostudios.kernel.domain.scope.Scope
import io.turbo.prostudios.platform.core.data.GenericContainer
import io.turbo.prostudios.platform.core.data.`object`.BukkitObject
import io.turbo.prostudios.platform.core.persistence.Query.Companion.data
import java.lang.IllegalStateException
import java.util.UUID

class UserContainer(name: String,
                    data: List<BukkitObject>,
                    id: UUID = UUID.fromString(name),
    ) :
    GenericContainer(
    name, data, Scope.GLOBAL
) {

    companion object {
        fun builder() = Builder()
    }

    class Builder() {
        private var name = ""
        private var id = UUID.fromString(name)
        private var data: MutableList<BukkitObject> = mutableListOf()

        fun name(string: String): Builder {
            this.name = string
            return this
        }

        fun id(id: UUID): Builder {
            this.id = id
            return this
        }

        fun dataAdd(vararg objects: BukkitObject): Builder {
            for (obj in objects) {
                this.data.add(obj)
            }
            return this
        }


        fun dataSet(objects: MutableList<BukkitObject>): Builder {
            this.data = objects
            return this
        }

        fun build(): GenericContainer {
            if (name.isEmpty()
            ) {
                throw IllegalStateException("Name is Empty!!!!")
            }
            val dataImmutable = this.data.toList()
            return UserContainer(name, dataImmutable, id)
        }
    }
}