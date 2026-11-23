package io.turbo.prostudios.kernel.domain.scope

/**
 *  Defines the boundaries of where a
 *  container or object can be accessed.
 *
 *  @author TurboMaxe
 */

interface StorageScope {

    fun level(): Scope

}