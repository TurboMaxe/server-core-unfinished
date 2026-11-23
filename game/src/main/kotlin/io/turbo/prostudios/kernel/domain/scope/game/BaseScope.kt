package io.turbo.prostudios.kernel.domain.scope.game

import io.turbo.prostudios.kernel.domain.scope.Scope
import io.turbo.prostudios.kernel.domain.scope.StorageScope

class BaseScope(
    private val scope: Scope
) : StorageScope {

   override fun level() = scope
}