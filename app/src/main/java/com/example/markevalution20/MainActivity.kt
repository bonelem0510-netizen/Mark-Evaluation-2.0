
package com.example.markevalution20
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val marksInput = findViewById<EditText>(R.id.editMarks)
        val resultText = findViewById<TextView>(R.id.txtResult)
        val button = findViewById<Button>(R.id.btnCheck)
        val restButton = findViewById<Button>(R.id.btnReset)


        button.setOnClickListener {

            val marks = marksInput.text.toString().toInt()

            if (marks >= 80) {
                resultText.text = "Symbol : A "
            } else if (marks >= 70) {
                resultText.text = "Symbol : B "
            } else if (marks >= 60) {
                resultText.text = "Symbol : C "
            } else if (marks >= 50) {
                resultText.text = "Symbol : D "
            } else {
                resultText.text = "Symbol : E "
            }
        }
        //Reset Button
        restButton.setOnClickListener{
            marksInput.text.clear()
            resultText.text = "Result will appear here"
        }
    }
}



