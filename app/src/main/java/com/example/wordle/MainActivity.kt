package com.example.wordle

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var words =
        "Abuse Adult Agent Anger Apple Award Basis Beach Birth Block Blood Board Brain Bread Break Brown " +
                "Buyer light might white flake poise noise voice vocal abode chase cabin right focal focus" +
                " train waste eight yacht adopt crate sedan " +
                "paste paint faint whale quail image zebra brave crave dream" +
                " steam stare flare great shale frail grail night sight fight" +
                " chain break brake trace satin haste urban " +
                "eland extra hover cover lover"
    var a = words.split(" ")


    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var b7: Button
    lateinit var b8: Button
    lateinit var b9: Button
    lateinit var b10: Button
    lateinit var b11: Button
    lateinit var b12: Button
    lateinit var b13: Button
    lateinit var b14: Button
    lateinit var b15: Button
    lateinit var b16: Button
    lateinit var b17: Button
    lateinit var b18: Button
    lateinit var b19: Button
    lateinit var b20: Button
    lateinit var b21: Button
    lateinit var b22: Button
    lateinit var b23: Button
    lateinit var b25: Button
    lateinit var b24: Button
    lateinit var restart: Button
    lateinit var submit: Button
    lateinit var text: TextView
    lateinit var txt: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.textView)
        b1 = findViewById(R.id.button1)
        b2 = findViewById(R.id.button2)
        b3 = findViewById(R.id.button3)
        b4 = findViewById(R.id.button4)
        b5 = findViewById(R.id.button5)
        b6 = findViewById(R.id.button6)
        b7 = findViewById(R.id.button7)
        b8 = findViewById(R.id.button8)
        b9 = findViewById(R.id.button9)
        b10 = findViewById(R.id.button10)
        b11 = findViewById(R.id.button11)
        b12 = findViewById(R.id.button12)
        b13 = findViewById(R.id.button13)
        b14 = findViewById(R.id.button14)
        b15 = findViewById(R.id.button15)
        b16 = findViewById(R.id.button16)
        b17 = findViewById(R.id.button17)
        b18 = findViewById(R.id.button18)
        b19 = findViewById(R.id.button19)
        b20 = findViewById(R.id.button20)
        b21 = findViewById(R.id.button21)
        b22 = findViewById(R.id.button22)
        b23 = findViewById(R.id.button23)
        b24 = findViewById(R.id.button24)
        b25 = findViewById(R.id.button25)
        var buttonRow = arrayOf(
            arrayOf(b1, b2, b3, b4, b5),
            arrayOf(b6, b7, b8, b9, b10),
            arrayOf(b11, b12, b13, b14, b15),
            arrayOf(b16, b17, b18, b19, b20),
            arrayOf(b21, b22, b23, b24, b25)
        )
        txt = findViewById(R.id.answer)
        submit = findViewById(R.id.submit)
        //to get random word
        var b = a[(Math.random() * 13).toInt()]
        var t = true
        var count = 0

        submit.setOnClickListener {


            if (count < 5) {
                var s = txt.editableText.toString()
                for (i in b.indices) {
                    if (s.equals(b, t)) {

                        for (j in s.indices) {
                            buttonRow[count][j].setText("" + s[j])
                            buttonRow[count][j].setBackgroundColor(Color.GREEN)
                            buttonRow[count][j].setTextColor(Color.BLACK)
                        }
                        Toast.makeText(applicationContext, "YOU WIN!!",Toast.LENGTH_SHORT).show()
                        count = 6
                        break

                    } else if (s[i].equals(b[i], t)) {
                        buttonRow[count][i].setText("" + s[i])
                        buttonRow[count][i].setBackgroundColor(Color.GREEN)
                        buttonRow[count][i].setTextColor(Color.BLACK)


                    } else if (s[i].equals(b[0], t) || s[i].equals(b[1], t) || s[i].equals(
                            b[2],
                            t
                        ) || s[i].equals(b[3], t) || s[i].equals(b[4], t)
                    ) {
                        buttonRow[count][i].setBackgroundColor(Color.YELLOW)
                        buttonRow[count][i].setTextColor(Color.BLACK)
                        buttonRow[count][i].setText("" + s[i])

                    } else {
                        buttonRow[count][i].setBackgroundColor(Color.LTGRAY)
                        buttonRow[count][i].setTextColor(Color.BLACK)
                        buttonRow[count][i].setText("" + s[i])

                    }



                }
                count++

            if(count == 5){
                Toast.makeText(applicationContext, "You Lost",Toast.LENGTH_SHORT).show()
                text.setText(b+ " was the answer")
            }
            }


        }
        restart = findViewById(R.id.restart)
        restart.setOnClickListener{
            b = a[(Math.random() * a.size-1).toInt()]
            count = 0
            for(i in 0 until 5){
                for(j in 0 until 5){
                    buttonRow[i][j].setText("")
                    buttonRow[i][j].setBackgroundColor(Color.MAGENTA)

                }
            }
        }
    }
}
