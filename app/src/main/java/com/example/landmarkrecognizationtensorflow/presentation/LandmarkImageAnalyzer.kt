package com.example.landmarkrecognizationtensorflow.presentation

import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import com.example.landmarkrecognizationtensorflow.domain.Classification
import com.example.landmarkrecognizationtensorflow.domain.LandmarkClassifier

class LandmarkImageAnalyzer(
    private val classifier : LandmarkClassifier,
    private val onResult: (List<Classification>) -> Unit
): ImageAnalysis.Analyzer {

    private var frameSkipCounter = 0
    override fun analyze(image: ImageProxy) {
        if (frameSkipCounter % 60 == 0){
        val rotationDegress = image.imageInfo.rotationDegrees
        val bitmap = image
            .toBitmap()
            .centerCrop(321,321)
         val result = classifier.classify(bitmap, rotationDegress)
        onResult(result)
        }
        frameSkipCounter++

        image.close()

    }
}