package main.kotlin.io.turbo.prostudios.kernel.identity

import java.util.UUID

open class UIdentifier<T>(
    open val id: UUID
) : Identifier<T>() {



}