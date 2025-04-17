package com.example.mvvmarch

import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class QuoteViewModel: ViewModel() {
    // creating an instance of repo to get quote
    private val quoteRepository = QuoteRepository()

    private val _quote = mutableStateOf<Quote?>(null)
    val quote: State<Quote?> = _quote

    fun loadQuote(){
        _quote.value = quoteRepository.getQuote()
    }


}