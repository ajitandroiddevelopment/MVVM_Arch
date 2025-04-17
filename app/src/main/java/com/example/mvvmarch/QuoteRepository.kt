package com.example.mvvmarch

class QuoteRepository {

    fun getQuote():Quote{
        return Quote(
            quote = "Be yourself; everyone else is already taken",
            author = "Oscar Wilde"
        )
    }
}