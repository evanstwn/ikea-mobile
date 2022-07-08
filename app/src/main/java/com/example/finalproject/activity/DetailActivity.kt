package com.example.finalproject.activity

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.finalproject.R
import com.example.finalproject.model.Item

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var imgDetailItem: ImageView
    private lateinit var tvDetailName: TextView
    private lateinit var tvDetailActualName: TextView
    private lateinit var tvDetailPrice: TextView
    private lateinit var tvDetailAdvertisement: TextView
    private lateinit var tvDetailMaterial: TextView
    private lateinit var tvDetailTips: TextView

    private lateinit var tvDetailTipsHeader: TextView

    private lateinit var btnDetailBack: ImageButton
    private lateinit var btnBuy: Button

    companion object {
        const val INTENT_EXTRA = "intent_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val item = intent.extras?.get(INTENT_EXTRA) as Item

        imgDetailItem = findViewById(R.id.img_detail_item)
        tvDetailName = findViewById(R.id.tv_detail_item_name)
        tvDetailActualName = findViewById(R.id.tv_detail_item_actual_name)
        tvDetailPrice = findViewById(R.id.tv_detail_item_price)
        tvDetailAdvertisement = findViewById(R.id.tv_detail_item_advertisement)
        tvDetailMaterial = findViewById(R.id.tv_detail_item_material)
        tvDetailTips = findViewById(R.id.tv_detail_item_tips)
        tvDetailTipsHeader = findViewById(R.id.tv_detail_item_tips_header)

        btnDetailBack = findViewById(R.id.btn_detail_back)
        btnBuy = findViewById(R.id.btn_buy)

        imgDetailItem.setImageResource(item.img)
        tvDetailName.text = item.name
        tvDetailActualName.text = item.actualName
        tvDetailPrice.text = item.price
        tvDetailAdvertisement.text = item.advertisement
        tvDetailMaterial.text = item.material
        tvDetailTips.text = item.tips

        if(tvDetailTips.text.isNullOrEmpty()){
            tvDetailTipsHeader.visibility = View.INVISIBLE
        }

        btnDetailBack.setOnClickListener(this)
        btnBuy.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_detail_back -> {
                super.onBackPressed()
            }
            R.id.btn_buy -> {
                Toast.makeText(this@DetailActivity, "Sukses membeli ${tvDetailName.text}!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}