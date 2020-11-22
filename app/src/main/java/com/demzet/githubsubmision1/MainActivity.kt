package com.demzet.githubsubmision1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var userAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val arrayList = ArrayList<Model>()
        arrayList.add(Model("JakeWharton", "Jake Wharton", R.drawable.user1 , "Google, Inc.", "Pittsburgh, PA, USA", "102","56995", "12"))
        arrayList.add(Model("amitshekhariitbhu", "AMIT SHEKHAR", R.drawable.user2, "@MindOrksOpenSource", "New Delhi, India", "37","5153", "2"))
        arrayList.add(Model("romainguy", "Romain Guy", R.drawable.user3, "Google", "California", "9","7972", "0"))
        arrayList.add(Model("chrisbanes", "Chris Banes", R.drawable.user4, "@google working on @android", "Sydney, Australia", "30","14725", "1"))
        arrayList.add(Model("tipsy", "David", R.drawable.user5, "Working Group Two", "Trondheim, Norway", "56","788", "0"))
        arrayList.add(Model("ravi8x", "Ravi Tamada", R.drawable.user6, "AndroidHive | Droid5", "India", "28","18628", "3"))
        arrayList.add(Model("jasoet", "Deny Prasetyo", R.drawable.user7, "@gojek-engineering", "Kotagede, Yogyakarta, Indonesia", "44","277", "39"))
        arrayList.add(Model("hendisantika", "Hendi Santika", R.drawable.user8, "@JVMDeveloperID @KotlinID @IDDevOps", "Bojongsoang - Bandung Jawa Barat", "1064","428", "61"))
        arrayList.add(Model("sidiqpermana", "Sidiq Permana", R.drawable.user9, "Nusantara Beta Studio", "Jakarta Indonesia", "65","465", "10"))
        arrayList.add(Model("budioktaviyan", "Budi Oktaviyan", R.drawable.user10, "@KotlinID", "Jakarta, Indonesia", "110","178", "23"))

        userAdapter = MyAdapter(arrayList,this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = userAdapter
        userAdapter.setOnItemClickCallback(object : MyAdapter.OnItemClickCallback {

            override fun onItemClicked(data: Model, position: Int) {

                val intent = Intent(this@MainActivity, DetailUser::class.java)
                intent.putExtra("data", data)
                startActivity(intent)


            }
        })

    }
}
