package com.hfad.guessinggame

import android.util.Log
import androidx.lifecycle.ViewModel

class ResultViewModel(finalResult: String) : ViewModel() {
    val result = finalResult

    init {
        Log.d("ResultViewModel", "created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("ResultViewModel", "destroyed")
    }
}