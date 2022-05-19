package com.hendramaulana.lionparceltestcases.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.hendramaulana.lionparceltestcases.models.Article

@Dao
interface ArticleDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    @Query("SELECT * FROM tb_article")
    fun getAllArticle(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}