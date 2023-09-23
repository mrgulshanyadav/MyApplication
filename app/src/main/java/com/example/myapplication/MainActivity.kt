package com.example.myapplication;

import android.content.res.Resources
import android.os.Bundle
import android.text.Layout.Alignment
import android.view.Gravity
import android.view.ViewGroup.LayoutParams
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayout = findViewById(R.id.linear_layout)

        // Example: Dynamically add text views and image views to the LinearLayout
        for (i in 1..2) {
            val textView = TextView(this)
            textView.text = "Plant $i"
            textView.gravity = Gravity.CENTER
            linearLayout.addView(textView)

            val imageView = ImageView(this)
            val resources: Resources = resources
            val resourceId: Int = resources.getIdentifier("plant$i", "drawable", packageName)
            // Set the height and width of the ImageView
            val layoutParams = LayoutParams(
                LayoutParams.MATCH_PARENT,  // Width (you can use LayoutParams.WRAP_CONTENT for wrap_content)
                800                         // Height in pixels (adjust as needed)
            )
            imageView.layoutParams = layoutParams
            imageView.setImageResource(resourceId)
            linearLayout.addView(imageView)
        }
    }
}
