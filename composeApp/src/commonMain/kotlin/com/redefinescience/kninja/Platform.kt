package com.redefinescience.kninja

import org.koin.dsl.module

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

val commonKoinModule = module {

}