# 📸 CameraX Landmark Recognition using TensorFlow Lite

A real-time Android application built with **CameraX** and powered by **TensorFlow Lite** to recognize famous landmarks through the device camera.

## 🚀 Features

* 🔍 Real-time landmark recognition using TFLite model
* 📷 CameraX integration for smooth and fast camera preview
* 🌐 Works offline (once model is integrated)
* 📱 Built with Kotlin (Jetpack components)

## 🛠️ Tech Stack

* **CameraX** – Modern Android camera API
* **TensorFlow Lite** – Efficient ML inference on mobile devices
* **Kotlin** – Language for building the Android app
* **ML Model** – Pre-trained landmark recognition model (TFLite)

## 🎥 Demo

Here's a demo of the app in action:

![Landmark Recognition Demo](https://github.com/soumya07ad/LandMarkRecognizationTensorflow/assets/demo.gif)

## 📦 Model Info

This project uses a pre-trained **Landmark Recognition model** from TensorFlow Lite or a custom-trained model. If you're using a custom model, ensure:

* Format: `.tflite`
* Input shape: Matches your `ImageProcessor`
* Output shape: Should be mapped with label indices

## 🧠 How it Works

1. CameraX captures frames from the Android device.
2. Each frame is converted to a format TensorFlow Lite can process.
3. The model runs inference on the frame and outputs the most probable landmark.
4. The result (landmark name + confidence) is displayed on screen.

## 📲 Getting Started

### Prerequisites

* Android Studio Electric Eel or later
* Android device or emulator (Camera support required)
* Kotlin 1.8+
* Minimum SDK 21+

### Installation

1. **Clone the repo**

   ```bash
   git clone https://github.com/soumya07ad/LandMarkRecognizationTensorflow.git
   cd LandMarkRecognizationTensorflow

   ```
