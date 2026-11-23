package io.turbo.prostudios.kernel.server

import io.turbo.prostudios.kernel.domain.scope.Scope
import java.util.UUID

private data class SeasonContainer(val name: String, val id: UUID, val scope: Scope)

enum class Season {
    NORMAL;


    companion object Builder {
        private var name: String = ""
        lateinit var id: UUID
        private var scope: Scope = Scope.GLOBAL

        fun name(value: String): Builder {
            name = value
            return this
        }

        fun uuid(value: UUID): Builder {
            id = value
            return this
        }

        fun scope(value: Scope): Builder {
            scope = value
            return this
        }

        fun build() {
            if (!this.id::isInitialized)
            return SeasonContainer()
        }
    }
}