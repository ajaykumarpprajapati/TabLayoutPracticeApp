package india.ajay.tablayoutpracticeapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.CardView
import android.support.v7.widget.Toolbar

class RecycleViewPracticeActivity : AppCompatActivity() {

    private var toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view_practice)
        setupView()
    }

    private fun setupView() {
        toolbar = findViewById(R.id.tool_bar)
        setSupportActionBar(toolbar)
    }
}
