package gthb.libgt.githblibry

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import gthb.libgt.githublib.MathProb

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(MathProb.calculateSum(20, 21).toString())

    }
}