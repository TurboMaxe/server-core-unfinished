package io.turbo.prostudios.kernel.server

import java.util.*

interface Gamemode {

    val id: UUID

    val name: String

    val dev: Boolean

    fun isProd() = !dev
}