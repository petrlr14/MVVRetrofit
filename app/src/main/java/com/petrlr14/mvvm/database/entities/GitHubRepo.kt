package com.petrlr14.mvvm.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "repos")
data class GitHubRepo(
    @PrimaryKey
    val id: Long,
    val name: String,
    @ColumnInfo(name="full_name")
    val fullName:String
)