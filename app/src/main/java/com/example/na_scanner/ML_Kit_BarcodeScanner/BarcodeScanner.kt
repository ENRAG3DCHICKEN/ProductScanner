package com.example.na_scanner.ML_Kit_BarcodeScanner

import com.google.mlkit.vision.barcode.BarcodeScannerOptions
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.common.InputImage


class BarcodeScanner(image: InputImage) {

    val options = BarcodeScannerOptions.Builder()
        .setBarcodeFormats(
            Barcode.FORMAT_UPC_A,
            Barcode.FORMAT_UPC_E
        )
        .build()

    val scanner = BarcodeScanning.getClient(options)

    val result = scanner.process(image)
        .addOnSuccessListener { barcodes ->
            // Task completed successfully
            // ...
        }
        .addOnFailureListener {
            // Task failed with an exception
            // ...
        }

}