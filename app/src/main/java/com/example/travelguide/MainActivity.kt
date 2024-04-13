package com.example.travelguide

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {


    var imgCODE:Int = 0
    lateinit var img: ImageView
    val food = arrayOf("Biryani","Chole Bhature","Dosa","Gobi 65","Kadhai Paneer")
    val foodDesc = arrayOf("Biryani, a beloved South Asian dish, combines aromatic basmati rice, tender meat or vegetables, and a blend of spices like cardamom and saffron. Slow-cooked to perfection, it's a symphony of flavors, garnished with caramelized onions and fresh herbs, delighting palates worldwide.","Chole Bhature, a popular North Indian dish, pairs spicy chickpea curry (chole) with deep-fried bread (bhature). The tangy and aromatic curry, flavored with a medley of spices, complements the fluffy and crispy bhature, creating a tantalizing culinary experience.","Dosa, a South Indian staple, is a thin, crispy crepe made from fermented rice and lentil batter. Served with coconut chutney and savory sambar, it offers a delightful combination of textures and flavors, enjoyed for breakfast or as a snack.","Gobi 65 is a popular Indian appetizer featuring crispy cauliflower florets marinated in a spicy batter, deep-fried to golden perfection. Each bite offers a tantalizing mix of crunchy texture and bold flavors, making it a favorite snack or starter dish.","Kadhai Paneer is a vibrant North Indian dish comprising soft paneer cubes cooked with bell peppers, onions, and tomatoes, infused with aromatic spices like cumin, coriander, and garam masala. Served hot, it's a flavorsome delight that pairs well with roti or rice.")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPREV = findViewById<ImageButton>(R.id.btnPREV)
        val btnNEXT = findViewById<ImageButton>(R.id.btnNEXT)
        val foodname = findViewById<TextView>(R.id.foodname)
        val foodDESC = findViewById<TextView>(R.id.fooddesc)

        btnPREV.setOnClickListener{


            var imgID = "pic$imgCODE"          //getting the string id
            var imgIDint = this.resources.getIdentifier(imgID,"id",packageName) //getting img INT id
            img = findViewById(imgIDint)      // inserts the value of image to img variable
            img.alpha = 0f                   //makes the img invisible

            //sets the img code to prev one
            imgCODE = (5+imgCODE-1)%5

            var imgTOshow = "pic$imgCODE"
            var imgTOshowINT = this.resources.getIdentifier(imgTOshow,"id",packageName)
            img = findViewById(imgTOshowINT)
            img.alpha = 1f
            foodname.text = food[imgCODE]
            foodDESC.text = foodDesc[imgCODE]



        }

        btnNEXT.setOnClickListener {
            var imgID = "pic$imgCODE"          //getting the string id
            var imgIDint = this.resources.getIdentifier(imgID,"id",packageName) //getting img INT id
            img = findViewById(imgIDint)      // inserts the value of image to img variable
            img.alpha = 0f                   //makes the img invisible

            //sets the img code to next one
            imgCODE = (5+imgCODE+1)%5

            var imgTOshow = "pic$imgCODE"
            var imgTOshowINT = this.resources.getIdentifier(imgTOshow,"id",packageName)
            img = findViewById(imgTOshowINT)
            img.alpha = 1f
            foodname.text = food[imgCODE]
            foodDESC.text = foodDesc[imgCODE]
        }
    }
}