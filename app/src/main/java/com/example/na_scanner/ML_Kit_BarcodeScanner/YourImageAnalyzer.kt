package com.example.na_scanner.ML_Kit_BarcodeScanner

import android.annotation.SuppressLint
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import com.google.mlkit.vision.common.InputImage



@SuppressLint("UnsafeOptInUsageError")
private class YourImageAnalyzer : ImageAnalysis.Analyzer {

    override fun analyze(imageProxy: ImageProxy) {
        val mediaImage = imageProxy.image
        if (mediaImage != null) {

            val image = InputImage.fromMediaImage(mediaImage, imageProxy.imageInfo.rotationDegrees)

            val BarcodeScanner_Result = BarcodeScanner(image).result

            TODO("Use BarcodeScanner_Result to Make Function Call")

        }
    }
}


