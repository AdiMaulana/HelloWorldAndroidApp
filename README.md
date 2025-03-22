# HelloWorldAndroidApp

## Deskripsi

Ini adalah aplikasi Android sederhana yang dikembangkan sebagai bagian dari tugas pemrograman saya dalam pengembangan mobile. Aplikasi ini menunjukkan prinsip dasar pengembangan Android menggunakan Jetpack Compose, serta cara membuat antarmuka pengguna dan menampilkan teks di layar.

## Fitur

- **Tampilan Hello World**: Aplikasi menampilkan pesan "Hello World!" yang terletak di tengah layar.
- **UI Modern**: Menggunakan Jetpack Compose untuk antarmuka pengguna yang modern dan responsif.
- **Tema**: Menerapkan prinsip Material Design dengan tema yang dapat disesuaikan.

## Teknologi yang Digunakan

- **Bahasa Pemrograman**: Kotlin
- **Lingkungan Pengembangan**: Android Studio
- **Kerangka UI**: Jetpack Compose
- **Alat Bangun**: Gradle

## Struktur Proyek

Struktur proyek ini mengikuti konvensi standar untuk aplikasi Android. Berikut adalah komponen utama dari struktur proyek:

### 1. Folder `manifests`
- **AndroidManifest.xml**: File ini berisi informasi penting tentang aplikasi, seperti nama aplikasi, ikon, tema, dan izin yang diperlukan (misalnya, akses internet, kamera, dll.).

### 2. Folder `java`
- Folder ini berisi kode sumber aplikasi Anda. Biasanya, ada subfolder yang sesuai dengan nama paket yang Anda tetapkan saat membuat proyek (misalnya, `com.example.helloworld`). Di dalamnya terdapat file utama seperti:
  - **MainActivity.kt**: Kelas utama yang berfungsi sebagai titik masuk aplikasi.

### 3. Folder `res`
Folder ini menyimpan semua sumber daya non-kode yang digunakan dalam aplikasi:
- **drawable**: Menyimpan gambar dan ikon yang digunakan dalam aplikasi.
- **layout**: Berisi file XML untuk mendefinisikan tata letak antarmuka pengguna (UI), seperti `activity_main.xml`.
- **mipmap**: Menyimpan ikon aplikasi dengan berbagai resolusi untuk mendukung berbagai perangkat.
- **values**: Berisi file seperti:
  - **colors.xml**: Mendefinisikan warna yang digunakan dalam aplikasi.
  - **strings.xml**: Menyimpan teks yang digunakan dalam aplikasi untuk mendukung internasionalisasi.
  - **styles.xml**: Mendefinisikan gaya dan tema untuk elemen UI.

### 4. Folder `Gradle Scripts`
Folder ini berisi file konfigurasi Gradle yang digunakan untuk membangun dan mengelola proyek Anda. Berikut adalah dua file utama yang biasanya ditemukan di sini:

#### a. **build.gradle (Project Level)**
File ini berisi konfigurasi build untuk seluruh proyek.

#### b. **build.gradle (Module Level)**
File ini berisi konfigurasi spesifik untuk modul aplikasi (biasanya modul `app`). Di sini Anda dapat menentukan dependensi yang diperlukan oleh aplikasi, pengaturan versi SDK, dan pengaturan spesifik lainnya.

### Contoh Konten `build.gradle` (Module Level)

```plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.ridexone.taskhelloworld"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ridexone.taskhelloworld"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}
```

## Cara Memulai

Untuk menjalankan proyek ini secara lokal, ikuti langkah-langkah berikut:

1. Clone repositori: **git clone https://github.com/usernameAnda/HelloWorldAndroidApp.git**
2. Buka proyek di Android Studio.
3. Pastikan Anda telah menginstal SDK yang diperlukan.
4. Jalankan aplikasi di emulator atau perangkat fisik.

## Tangkapan Layar

![Image](https://github.com/user-attachments/assets/9766bc29-eafc-4815-804c-b6b4bfa97878)

# Proyek Hello World di Android Studio

## Deskripsi
Proyek ini adalah aplikasi Android sederhana yang menampilkan pesan "Hello World!" di layar. Ini adalah langkah awal dalam belajar pengembangan aplikasi Android menggunakan Android Studio dan Kotlin.

## Tahap-Tahap Membuat Proyek

### 1. Buka Android Studio
Buka aplikasi Android Studio yang telah terinstal di komputer Anda.

![Image](https://github.com/user-attachments/assets/2fab76f0-4b9d-4c4c-b863-1f9bd84429ff)

### 2. Buat Proyek Baru
Klik **"Start a New Android Studio Project"** untuk memulai membuat proyek baru.

### 3. Pilih Template Activity
Pilih **"Empty Activity"** sebagai template untuk proyek Anda, lalu klik **Next**.

![Image](https://github.com/user-attachments/assets/e115582f-f10d-4305-94cd-ad3efb821815)

### 4. Konfigurasi Proyek
Isi informasi berikut pada jendela konfigurasi proyek:
- **Name**: HelloWorld
- **Package name**: com.example.helloworld (atau sesuai keinginan)
- **Save location**: Tentukan lokasi penyimpanan proyek.
- **Language**: Pilih Kotlin.
- **Minimum API level**: Pilih API level yang sesuai (misalnya, API 26: Android 8.0 Oreo).

![Image](https://github.com/user-attachments/assets/47f826e7-27a8-43a7-9e6f-d52c9d3b956b)

Setelah mengisi semua informasi, klik **Finish**.

### 5. Tunggu Proses Gradle
Tunggu hingga proses Gradle selesai. Ini mungkin memakan waktu beberapa menit.

### 6. Atur Layout `activity_main.xml`
Buka file `activity_main.xml` yang terletak di `res/layout`. Tambahkan kode berikut untuk menampilkan teks "Hello World!":

```<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textSize="30sp"
        android:textStyle="bold"
    android:gravity="center"
    app:layout_constraintTop_toTopOf="parent"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintEnd_toEndOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
```

### 7. Menjalankan Aplikasi di Android Emulator
Setelah Anda selesai membuat proyek "Hello World", Anda dapat menjalankannya di emulator
Pilih jenis perangkat yang ingin Anda buat (misalnya, Phone) dan pilih model perangkat (misalnya, Pixel 5).

![Image](https://github.com/user-attachments/assets/e5b16146-e6d5-4eb8-959c-4029a38fedb3)



## Lisensi

Proyek ini dilisensikan di bawah Lisensi MIT - lihat file [LICENSE](LICENSE) untuk detail lebih lanjut.

## Ucapan Terima Kasih

- Terima kasih kepada para instruktur dan teman-teman saya atas dukungan dan masukan selama proyek ini.


