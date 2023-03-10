package com.vanphuc.exsqldelight.cache

import com.squareup.sqldelight.db.SqlDriver

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}