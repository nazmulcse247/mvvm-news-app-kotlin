package com.nazmul.kotlinmvvmnewsapp.db

import androidx.room.TypeConverter
import com.nazmul.kotlinmvvmnewsapp.model.Source

class TypeConverter {


    @TypeConverter
    fun fromSource(source: Source) : String {
        return source.name
    }

    @TypeConverter
    fun toSource(name : String) : Source {
        return Source(name , name)
    }
}