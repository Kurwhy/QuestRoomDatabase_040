package com.example.praktikum_pertemuan10.repository

import com.example.praktikum_pertemuan10.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}