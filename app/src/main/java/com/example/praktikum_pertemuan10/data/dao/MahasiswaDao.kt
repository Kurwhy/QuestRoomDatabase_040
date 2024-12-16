package com.example.praktikum_pertemuan10.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.example.praktikum_pertemuan10.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    @Delete
    suspend fun deleteMahasiswa (mahasiswa: Mahasiswa)

}