package com.example.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setCollorButtonsAction()
        setCollorBox()
    }

    private fun setCollorButtonsAction() {
        button_red.setOnClickListener {
            currentColor = R.color.red

        }

        button_yellow.setOnClickListener {
            currentColor = R.color.yellow
        }

        button_green.setOnClickListener {
            currentColor = R.color.green
        }
    }

    private fun setCollorBox() {
        box_one_text.setOnClickListener {
            box_one_text.setBackgroundResource(currentColor)
        }

        box_two_text.setOnClickListener {
            box_two_text.setBackgroundResource(currentColor)
        }

        box_three_text.setOnClickListener {
            box_three_text.setBackgroundResource(currentColor)
        }

        box_four_text.setOnClickListener {
            box_four_text.setBackgroundResource(currentColor)
        }
        box_five_tex.setOnClickListener {
            box_five_tex.setBackgroundResource(currentColor)
        }
    }
}