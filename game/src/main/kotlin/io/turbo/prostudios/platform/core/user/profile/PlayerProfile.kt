package io.turbo.prostudios.platform.core.user.profile

import main.kotlin.io.turbo.prostudios.kernel.user.User
import kotlin.reflect.KClass

class PlayerProfile<out T : User>(
    val container: UserContainer
) {

}