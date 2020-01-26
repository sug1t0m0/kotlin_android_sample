package tomo.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var sheepCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val trialTime = Date()
        var greeting = "こんばんは"
        val calendar = GregorianCalendar()
        calendar.time = trialTime

        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        if (hour in 3..11){
            greeting = "おはよう"
        } else if (hour > 15){
            greeting = "こんばんは"
        }

        greeting += "ねむれませんか？"

        val sheepNum = 10

        for (i in 1..sheepNum){
            greeting += "羊が" + i + "匹\n"
        }

        textview.text = greeting

        rootLayout.setOnClickListener {
            sheepCount++
            val sheepText = "羊が $sheepCount 匹"
            textview.text = sheepText
        }

    }
}