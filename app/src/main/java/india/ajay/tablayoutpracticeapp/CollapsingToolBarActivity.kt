package india.ajay.tablayoutpracticeapp

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

class CollapsingToolBarActivity : AppCompatActivity() {

    private var toolBar: Toolbar? = null
    private var fabButton: FloatingActionButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collasping_tool_bar)
        setupView()
    }

    private fun setupView() {
        toolBar = findViewById(R.id.tool_bar)
        fabButton = findViewById(R.id.fab_button)
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        fabButton?.setOnClickListener {
            //Code for fab button click
        }
    }
}
