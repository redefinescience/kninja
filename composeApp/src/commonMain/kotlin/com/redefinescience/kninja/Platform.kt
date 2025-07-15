package com.redefinescience.kninja

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform