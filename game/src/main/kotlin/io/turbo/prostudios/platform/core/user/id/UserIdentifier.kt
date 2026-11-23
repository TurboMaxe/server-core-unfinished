package io.turbo.prostudios.platform.core.user.id

import io.turbo.prostudios.kernel.domain.scope.Scope
import io.turbo.prostudios.platform.core.data.BaseContainer
import io.turbo.prostudios.platform.core.data.GenericContainer
import io.turbo.prostudios.platform.core.data.MappedContainer
import io.turbo.prostudios.platform.core.data.`object`.BukkitObject
import io.turbo.prostudios.platform.core.user.profile.UserContainer
import main.kotlin.io.turbo.prostudios.kernel.identity.UIdentifier
import main.kotlin.io.turbo.prostudios.kernel.user.User
import java.util.UUID

class UserIdentifier(
    val user: User,
    override val id: UUID = UUID.fromString(user.toString())
) : UIdentifier<User>(id) {

    private val userCache = lazy {
        mutableListOf<BaseContainer>()
    }

    init {
         userCache.value.add(
             UserContainer.builder()
                 .name(user.name())
                 .id(user.id())
                 .build()
         )
    }

}