package com.example.translatorapp.model

import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.TextRecognizer
import com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions
import com.google.mlkit.vision.text.devanagari.DevanagariTextRecognizerOptions
import com.google.mlkit.vision.text.japanese.JapaneseTextRecognizerOptions
import com.google.mlkit.vision.text.korean.KoreanTextRecognizerOptions
import com.google.mlkit.vision.text.latin.TextRecognizerOptions

class TextRecognizerModel {
    private lateinit var recognizer: TextRecognizer

    init {
        // Initialize the recognizer based on your desired script library
        recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)
    }

    // You can create different methods or functions to switch the recognizer as needed

    fun setChineseRecognizer() {
        recognizer = TextRecognition.getClient(ChineseTextRecognizerOptions.Builder().build())
    }

    fun setLatinRecognizer() {
        // When using Latin script library
        recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)
    }

    fun setDevanagariRecognizer() {
        // When using Devanagari script library
        recognizer = TextRecognition.getClient(DevanagariTextRecognizerOptions.Builder().build())
    }

    fun setJapaneseRecognizer() {
        // When using Japanese script library
        recognizer = TextRecognition.getClient(JapaneseTextRecognizerOptions.Builder().build())
    }

    fun setKoreanRecognizer() {
        // When using Korean script library
        recognizer = TextRecognition.getClient(KoreanTextRecognizerOptions.Builder().build())
    }

    fun getRecognizer(): TextRecognizer {
        return recognizer
    }
}
