package com.example.myshoppingbymidili.db

import androidx.room.Insert
import androidx.room.Query
import com.example.myshoppingbymidili.entities.NoteItem

@androidx.room.Dao
interface Dao {
    @Query("SELECT * FROM note_list")
    fun getAllNotes():kotlinx.coroutines.flow.Flow<List<NoteItem>>

    @Insert
    suspend fun insertNote(note: NoteItem)
}