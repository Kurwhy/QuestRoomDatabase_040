package com.example.praktikum_pertemuan10.repository

import com.example.praktikum_pertemuan10.data.dao.MahasiswaDao
import com.example.praktikum_pertemuan10.data.entity.Mahasiswa

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
        override suspend fun insertMhs(mahasiswa: Mahasiswa) {
            mahasiswaDao.insertMahasiswa(mahasiswa)
        }
}
