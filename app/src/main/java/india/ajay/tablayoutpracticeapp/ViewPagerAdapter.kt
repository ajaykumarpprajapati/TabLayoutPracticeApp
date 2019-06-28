package india.ajay.tablayoutpracticeapp

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager):
    FragmentPagerAdapter(fragmentManager){

    private val fragmentList: MutableList<Fragment>? = ArrayList()
    private val fragmentTitleList: MutableList<String>? = ArrayList()

    override fun getPageTitle(position: Int): CharSequence? {
       //Commenting below line now we are showing icon not title
        return fragmentTitleList?.get(position)
        ///return null
    }

    override fun getItem(position: Int): Fragment? {
        return fragmentList?.get(position)
    }

    override fun getCount(): Int {
        fragmentList?.let {
            return it.size
        }
        return 0
    }

    fun addFragment(fragment: Fragment, title: String){
        fragmentList?.add(fragment)
        fragmentTitleList?.add(title)
    }

}