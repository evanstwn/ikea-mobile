package com.example.finalproject.model

import com.example.finalproject.R

object ItemData {
    private val itemNames = arrayOf(
        "BURVIK",
        "FÖRSIKTIG",
        "FULLÄNDAD",
        "GALIAMELON",
        "GRILLTIDER",
        "KALAS",
        "KUNGSFORS",
        "KVARNVEN",
        "POÄNG",
        "RAJTAN",
        "RÅSKOG",
        "RÖRT"
    )

    private val itemActualNames = arrayOf(
        "Meja samping",
        "Bangku kecil anak",
        "Sudip",
        "Kotak bunga",
        "Alat BBQ",
        "Mangkuk",
        "Rel",
        "Bantal",
        "Kursi berlengan",
        "Stoples bumbu",
        "Troli",
        "Sendok"
    )

    private val itemPrice = arrayOf(
        "499.000",  //BURVIK
        "39.900",   //FORSIKTIG
        "19.900",   //FULLANDAD
        "199.000",  //GALIAMELON
        "149.000",  //GRILLTIDER
        "24.900",   //KALAS
        "79.900",   //KUNGSFORS
        "899.000",  //KVARNVEN
        "1.295.000",//POANG
        "49.900",   //RAJTAN
        "699.000",  //RASKOG
        "29.900",   //RORT
    )

    private val itemAdvertisement = arrayOf(
        "Selalu ada untuk Anda. Terlihat menarik di seluruh bagian rumah dan mudah diangkat sehingga Anda dapat mengatur ulang hunian Anda kapan saja. Nikmati setiap momen dengan semua benda favorit Anda yang mudah dijangkau.", //BURVIK
        "\"Hei! Berdirilah jadi Anda bisa melihat diri sendiri di cermin! Sekarang Anda bisa meraih sikat gigi untuk belajar menggosok gigi sendiri. Selagi Anda melakukannya katakan 'hai' kepada yang sudah mulai dewasa berdiri di sebelah Anda.\"", //FORSIKTIG
        "Terbuat dari bahan plastik poliamida bertulang, yang tahan hingga suhu 220C, serta tidak menempel pada sisa-sisa makanan. Sudip ini menjadi inovasi terbaru kami sebagai solusi dari masalah Anda dalam memasak.", //FULLANDAD
        "Terbuat dari bahan baja, serta poliester, kotak bunga ini cocok sekali sebagai dekorasi untuk digantung di dinding rumah Anda, yang akan menambahkan kesan \"hidup\".", //GALIAMELON
        "Dengan harga yang sangat terjangkau, kami ingin Anda dapat merasakan pengalaman BBQ yang berbeda dari sebelumnya. Tidak hanya satu, ataupun dua, tetapi tiga alat grill dapat Anda miliki tanpa \"membakar\" isi dompet Anda.", //GRILLTIDER
        "Warna cerah dan ceria sehingga semua orang dapat memilih favoritnya. Plastiknya tidak akan retak dan tidak berbahaya - tidak ada zat berbahaya. Alternatif yang berkelanjutan untuk alat makan yang dapat dibuang karena dapat dipakai kembali.", //KALAS
        "Terinspirasi oleh profesional, tapi diadaptasi untuk Anda. Seperti dapur restoran, kami fokus pada bahan tahan lama dan penyimpanan dinding cerdas yang menyediakan ruang untuk segala masakan rumah yang kreatif.", //KUNGSFORS
        "Hari yang panjang tentu sangat melelahkan bagi Anda. Tentu, hari tersebut harus ditutup dengan istirahat yang berkualitas. Bantal ini akan memberikan kenyamanan untuk mengantarkan Anda ke alam mimpi.", //KVARNVEN
        "Tidak ada yang lebih menyenangkan dari bersantai di teras rumah Anda diatas kursi santai yang nyaman. Kursi yang kami tawarkan ini memberikan sentuhan elegan dengan kayu birch, serta kenyamanan bagi Anda.", //POANG
        "Memasak tentu menjadi bagian dari hidup Anda sehari-hari. Stoples ini hadir untuk memudahkan Anda dalam menyimpan bumbu-bumbu, ataupun bahan makanan dengan kapasitas yang besar.", //RAJTAN
        "Troli ini muat dalam ruang yang sangat kecil dan dapat dipindahkan kemanapun Anda membutuhkannya. Gunakan penyimpanan tambahan untuk segala peralatan dapur, aksesori meja atau untuk sarung tangan, kunci dan handphone.", //RASKOG
        "Bagi Anda yang memperhatikan aspek estetika dalam rumah Anda, tentu segala komponen harus cocok dan mengkomplemen satu sama lain. Tidak terlepas ruang makan Anda. Sendok ini akan mengkomplemen ruang makan Anda yang memiliki sentuhan kayu dan minimalis.", //RORT
    )

    private val itemImages = intArrayOf(
        R.drawable.burvik,
        R.drawable.forsiktig,
        R.drawable.fullandad,
        R.drawable.galiamelon,
        R.drawable.grilltider,
        R.drawable.kalas,
        R.drawable.kungsfors,
        R.drawable.kvarnven,
        R.drawable.poang,
        R.drawable.rajtan,
        R.drawable.raskog,
        R.drawable.rort,
    )

    private val itemMaterial = arrayOf(
        "Bagian plastik: Plastik poliamida, Baja\n" +
                "Mur tertanam: Baja, Galvanis\n" +
                "Rangka bawah: Baja, Dilapisi serbuk epoksi/poliester\n" +
                "Panel: Kayu lapis, Cetakan veneer lapisan kayu yang direkatkan, Lem dari air, Veneer kayu birch, Lacquer akrilik bening berwarna, Lacquer akrilik bening berwarna, Lacquer akrilik bening berwarna",
        "Plastik polipropilena, Karet sintetis",
        "Plastik poliamida bertulang",
        "Pot tanaman bagian dalam: Plastik PET\n" +
                "Bagian logam: Baja, Poliester powder coating",
        "Baja tahan karat",
        "Plastik polipropilena",
        "Tube: Baja tahan karat, Baja tahan karat\n" +
                "Mur tertanam/ Bracket: Baja tahan karat",
        "Kain atas: 90% nilon, 10% elasten\n" +
                "Kain belakang/ Kain dalam: 100 % poliester (100% daur ulang)\n" +
                "Isi: Busa memory poliuretana\n" +
                "Renda: 100 % poliester",
        "Kain penyangga: 100% polipropilena\n" +
                "Rangka: Kayu veneer yang dilem berlapis, Veneer kayu birch, Lacquer akrilik bening",
        "Kaca, Plastik polipropilena",
        "Baja, Dilapis serbuk epoksi",
        "Kayu beech solid, Minyak"
    )

    private val itemTips = arrayOf(
        "Lap bersih dengan kain basah.\n" +
                "Lap hingga kering dengan kain bersih.\n" +
                "Periksa secara teratur bahwa semua alat pemasangan perakitan dikencangkan dengan benar dan kencangkan ulang jika diperlukan.",
        "Lap hingga kering dengan kain bersih.\n" +
                "Lap bersih dengan kain lembut yang dibasahi dalam air dan detergen atau sabun lembut non abrasif, jika perlu.",
        "Tahan hingga suhu 220 ° C.\n" +
                "Aman untuk mesin cuci piring.",
        "",
        "",
        "Aman untuk microwave; panaskan makanan pada suhu 100°C.\n" +
                "Aman untuk mesin cuci piring hingga 70°C.",
        "Lap bersih dengan kain lembut yang dibasahi air dan deterjen atau sabun ringan, jika perlu.\n" +
                "Lap hingga kering dengan kain bersih.\n" +
                "Jangan gunakan abu gosok, wol baja, peralatan keras atau tajam yang dapat mengores permukaan baja tahan karat.",
        "",
        "",
        "Bagian kaca aman untuk mesin cuci piring. Penutup harus dicuci tangan.",
        "Lap hingga kering dengan kain bersih.\n" +
                "Lap bersih dengan kain lembut yang dibasahi dalam air dan detergen atau sabun lembut non abrasif, jika perlu.\n" +
                "Untuk kualitas maksimal, kencangkan kembali sekrup bila perlu.",
        "Hanya dapat dicuci dengan tangan.\n" +
                "Permukaan telah dirawat dengan minyak. Untuk perlindungan penuh, sapukan secara berkala dengan minyak kayu.",
    )

    val listData: ArrayList<Item>
        get() {
            val list = arrayListOf<Item>()
            for (position in itemNames.indices) {
                val item = Item()
                item.name = itemNames[position]
                item.actualName = itemActualNames[position]
                item.advertisement = itemAdvertisement[position]
                item.price = "Rp. " + itemPrice[position]
                item.material = itemMaterial[position]
                item.tips = itemTips[position]
                item.img = itemImages[position]
                list.add(item)
            }
            return list
        }
}