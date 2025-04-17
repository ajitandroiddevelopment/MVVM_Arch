package com.example.mvvmarch

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun QuoteScreen(viewModel: QuoteViewModel= viewModel()){
    val quote by viewModel.quote
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(12.dp),
        verticalArrangement = Arrangement.Center
    ) {
        quote?.let {
            Text(
                text = "\"${it.quote}\"",  // Display the quote inside double quotes
                fontSize = 20.sp         // Font size of the quote
            )
            Spacer(modifier = Modifier.height(8.dp)) // Add spacing

            Text(
                text = "- ${it.author}", // Display the author
                fontStyle = FontStyle.Italic // Italic style
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {viewModel.loadQuote()}) {
            Text(text = "GET Quote")

        }
    }
}