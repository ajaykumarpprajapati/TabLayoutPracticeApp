package india.ajay.tablayoutpracticeapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private var toolBar: Toolbar? = null
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    private fun setupView() {
        toolBar = findViewById(R.id.tool_bar)
        tabLayout = findViewById(R.id.tab_layout)
        viewPager = findViewById(R.id.view_pager)
        val viewPageradapter = ViewPagerAdapter(supportFragmentManager)
        /*tab with label*/
        viewPageradapter.addFragment(OneFragment(), getString(R.string.one))
        viewPageradapter.addFragment(TwoFragment(), getString(R.string.two))
        viewPageradapter.addFragment(ThreeFragment(), getString(R.string.three))
        viewPageradapter.addFragment(FourFragment(), getString(R.string.four))
        viewPageradapter.addFragment(FiveFragment(), getString(R.string.five))

        /*tab with icon*/
        viewPageradapter.addFragment(RecentFragment(), "")
        viewPageradapter.addFragment(HeartFragment(), "")
        viewPageradapter.addFragment(NearByFragment(), "")


        viewPager?.adapter = viewPageradapter
        tabLayout?.setupWithViewPager(viewPager)
        /*Tab with icons
        tabLayout?.getTabAt(0)?.icon = getDrawable(R.drawable.phone)
        tabLayout?.getTabAt(1)?.icon = getDrawable(R.drawable.heart)
        tabLayout?.getTabAt(2)?.icon = getDrawable(R.drawable.account)*/
    }
}
