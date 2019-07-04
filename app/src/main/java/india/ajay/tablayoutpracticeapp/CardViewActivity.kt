package india.ajay.tablayoutpracticeapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.CardView
import android.support.v7.widget.Toolbar

class CardViewActivity : AppCompatActivity() {

    private var cardViewOne: CardView? = null
    private var cardViewTwo: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)
        setupView()
    }

    private fun setupView() {
        cardViewOne = findViewById(R.id.card_view_1)
        cardViewTwo = findViewById(R.id.card_view_2)

        cardViewOne?.setOnClickListener {
            //click listener for card view1
        }

        cardViewTwo?.setOnClickListener {
            //click listener for card view2
        }
    }
}
