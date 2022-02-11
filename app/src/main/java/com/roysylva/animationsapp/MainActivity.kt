package com.roysylva.animationsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var bartIsShowing = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  imageView = findViewById<ImageView>(R.id.imageView)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)

        combinedAnimation(imageView)
        imageView.setOnClickListener {

            //fade(imageView,imageView2)
           // slideDownVertically(imageView,imageView2)
           // slideHorizontally(imageView,imageView2)
           // rotateItem(imageView,imageView2)
            scaleAnimation(imageView)



        }

    }

    private fun combinedAnimation(imageView: ImageView) {
        //Set image constraint to negative to hide it on one side

        imageView?.animate()?.translationXBy(-1000F)?.rotation(1800F)?.duration = 1000

    }

    private fun scaleAnimation(imageView: ImageView?) {

        imageView?.animate()?.scaleX(0.5f)?.scaleY(0.5f)?.duration = 1000

    }

    private fun rotateItem(imageView: ImageView?, imageView2: ImageView?) {

        //rotate
        imageView?.animate()?.rotation(1800F)?.duration = 1000

        //rotate and fade
        imageView?.animate()?.rotation(1800F)?.alpha(0F)?.duration = 1000

    }

    private fun slideHorizontally(imageView: ImageView?, imageView2: ImageView?) {
      // positive value moves the item right while negative value moves item left

        imageView?.animate()?.translationXBy(-1000F)?.duration = 2000

    }

    private fun slideDownVertically(imageView: ImageView?, imageView2: ImageView?) {
        // positive value moves the item down while negative value moves item up

        imageView?.animate()?.translationYBy(1000F)?.duration = 2000

    }


    //fade animations
     fun  fade(imageView: ImageView, imageView2: ImageView) {

        if (bartIsShowing) {

            bartIsShowing = false

            //fade out
            imageView.animate().alpha(0F).duration = 2000

            //fade in
            imageView2.animate().alpha(1F).duration = 2000
        }
        else{
            bartIsShowing = true
            imageView.animate().alpha(1F).duration = 2000

            //fade in
            imageView2.animate().alpha(0F).duration = 2000
        }
        }
}