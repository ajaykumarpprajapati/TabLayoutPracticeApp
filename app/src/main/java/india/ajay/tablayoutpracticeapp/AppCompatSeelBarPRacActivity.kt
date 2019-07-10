package india.ajay.tablayoutpracticeapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatSeekBar
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class AppCompatSeelBarPRacActivity : AppCompatActivity() {

    private var seekBar: AppCompatSeekBar? = null
    private var textViewOne: TextView? = null
    private var textViewTwo: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider_prac)
        setupView()
    }

    private fun setupView() {
        seekBar = findViewById(R.id.seek_bar)
        textViewOne = findViewById(R.id.text_view_1)
        textViewTwo = findViewById(R.id.text_view_2)

        seekBar?.progress = 0
        seekBar?.keyProgressIncrement = 1
        seekBar?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                // Display the current progress of SeekBar
                textViewOne?.text = "Progress : $i"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Do something
                Toast.makeText(applicationContext,"start tracking",Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Do something
                Toast.makeText(applicationContext,"stop tracking",Toast.LENGTH_SHORT).show()
            }
    })
}
}
