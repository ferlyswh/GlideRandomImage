package ferly.project.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide



class MainActivity : AppCompatActivity() {

    lateinit var makanan_Image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //FULLSCREEN
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        setContentView(R.layout.activity_main)

        //Button Cari Makanan
        val btn_cari_makanan: Button = findViewById(R.id.btn_cari_makanan)

        btn_cari_makanan.setOnClickListener { random_makanan_img()};
        makanan_Image = findViewById(R.id.img_makanan)


    }

    fun random_makanan_img() {
        val text_random_makanan = findViewById<TextView>(R.id.nama_makanan)
        val randomInt = (1..4).random()

        val urlmkn1 = "https://cdn-2.tstatic.net/kaltim/foto/bank/images/aw-restoran-balikpapan.jpg"
        val mkn1 = "Restoran AW"

        val urlmkn2 = "https://asset.kompas.com/crops/nsueiJRoh-BTF94-Y71Nv0f3Zj0=/3x0:700x465/780x390/data/photo/2020/12/30/5fec5602f116e.jpg"
        val mkn2 = "Ayam Bakar"

        val urlmkn3 = "https://assets.pikiran-rakyat.com/crop/0x0:0x0/x/photo/2021/11/21/1061438508.jpg"
        val mkn3 = "Ayam Betutu"

        val urlmkn4 = "https://www.piknikdong.com/wp-content/uploads/2021/11/Resep-Ayam-Geprek-Bensu-min.jpg"
        val mkn4 = "Ayam Geprek"


        when (randomInt){
            1 -> text_random_makanan.setText(mkn1)
            2 -> text_random_makanan.setText(mkn2)
            3 -> text_random_makanan.setText(mkn3)
            else -> text_random_makanan.setText(mkn4)
        }


        val drawableResource = when (randomInt) {
            1 -> {
                Glide.with(getApplicationContext())
                    .asBitmap()
                    .load(urlmkn1)
                    .into(makanan_Image);
            }
            2 -> {
                Glide.with(getApplicationContext())
                    .asBitmap()
                    .load(urlmkn2)
                    .into(makanan_Image);
            }
            3 -> {
                Glide.with(getApplicationContext())
                    .asBitmap()
                    .load(urlmkn3)
                    .into(makanan_Image);
            }
            else -> {
                Glide.with(getApplicationContext())
                    .asBitmap()
                    .load(urlmkn4)
                    .into(makanan_Image);
            }
        }

    }

}
