package com.hendramaulana.lionparceltestcases.models

import com.hendramaulana.lionparceltestcases.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)