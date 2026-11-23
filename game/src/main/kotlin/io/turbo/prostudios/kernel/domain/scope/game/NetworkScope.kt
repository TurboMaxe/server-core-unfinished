package main.kotlin.io.turbo.prostudios.kernel.domain.storage.game

import io.turbo.prostudios.kernel.domain.scope.Scope
import io.turbo.prostudios.kernel.domain.scope.StorageScope

abstract class NetworkScope(

) : StorageScope {

    override fun level(): Scope = Scope.GLOBAL

}