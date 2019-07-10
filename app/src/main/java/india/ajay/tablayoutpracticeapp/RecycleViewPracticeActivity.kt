package india.ajay.tablayoutpracticeapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar

class RecycleViewPracticeActivity : AppCompatActivity() {

    private var toolbar: Toolbar? = null
    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view_practice)
        setupView()
    }

    private fun setupView() {
        toolbar = findViewById(R.id.tool_bar)
        setSupportActionBar(toolbar)
        recyclerView = findViewById(R.id.recycler_view)
        val userList =  ArrayList<User>()
        //need to add items in userList either from server or database


        //Add items in userList in LinearLayout way
        //val linearLayoutManager = LinearLayoutManager(this)
        //recyclerView?.layoutManager = linearLayoutManager

        //Add items in userList in GridLayout way
        val gridLayoutManager = GridLayoutManager(this, 2)
        recyclerView?.layoutManager = gridLayoutManager

        recyclerView?.setHasFixedSize(true)
        recyclerView?.adapter = RecycleAdapter(userList)
    }
}
