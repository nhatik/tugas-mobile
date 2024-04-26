package com.example.kotlin_project

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_project.ui.theme.KotlinprojectTheme
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : ComponentActivity() {
    private lateinit var tvName: TextView
    private lateinit var tvNim: TextView
    private lateinit var tvJurusan: TextView
    private lateinit var tvAddress: TextView
    private lateinit var ivProfilePicture: CircleImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ivProfilePicture = findViewById(R.id.ivProfilePicture)
        tvName = findViewById(R.id.tvName)
        tvNim = findViewById(R.id.tvNim)
        tvJurusan = findViewById(R.id.tvJurusan)
        tvAddress = findViewById(R.id.tvAddress)

        tvName.text = "Atik Nurhaeni"
        tvNim.text = "SSI202203376"
        tvJurusan.text = "Sistem Informasi"
        tvAddress.text = "Bersole, Karang Pucung, Purwokerto Selatan"

        // Jika menggunakan drawable vektor
        ivProfilePicture.setImageResource(R.drawable.profil)
        // Jika menggunakan gambar dari gallery/kamera
        // val bitmap = BitmapFactory.decodeFile("/path/to/image/file.jpg")
        // ivPhoto.setImageBitmap(bitmap)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinprojectTheme {
        Greeting("Android")
    }
}