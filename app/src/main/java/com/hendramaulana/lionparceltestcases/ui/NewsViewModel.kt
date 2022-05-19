package com.hendramaulana.lionparceltestcases.ui

import androidx.lifecycle.ViewModel
import com.hendramaulana.lionparceltestcases.repository.NewsRepository

class NewsViewModel(
    val newsRepository : NewsRepository
) : ViewModel(){
}