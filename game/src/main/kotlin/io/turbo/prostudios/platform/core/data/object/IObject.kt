package io.turbo.prostudios.platform.core.data.`object`

import io.turbo.prostudios.kernel.domain.scope.Scope
import io.turbo.prostudios.kernel.domain.scope.StorageScope

interface IObject {

    fun scope(): Scope

}