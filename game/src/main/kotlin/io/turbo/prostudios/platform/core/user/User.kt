package main.kotlin.io.turbo.prostudios.kernel.user

import java.util.UUID

interface User {

    fun id(): UUID

    fun name(): String

    fun online(): Boolean

}

