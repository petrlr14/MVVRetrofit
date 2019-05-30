package com.petrlr14.mvvm.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.petrlr14.mvvm.database.entities.GitHubRepo

@Dao
interface GitHubDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(repo:GitHubRepo)

    @Query("SELECT*FROM repos")
    fun getAllRepos():LiveData<List<GitHubRepo>>

    @Query("DELETE FROM repos")
    suspend fun nukeTable()

}