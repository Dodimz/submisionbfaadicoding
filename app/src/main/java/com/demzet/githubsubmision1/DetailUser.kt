package com.demzet.githubsubmision1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_detail_user.*

class DetailUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        //get data dari putExtra intent di myAdapter
//        var intent = intent
//        //val dName = intent.getParcelableArrayExtra("iName")
//        val dName = intent.getStringExtra("iName")
//        //val dUsername = intent.getParcelableArrayExtra("iUsername")
//        val dUsername = intent.getStringExtra("iUsername")
//        val dAvatar = intent.getIntExtra("iAvatar", 0)
//        val dCompany = intent.getStringExtra("iCompany")
//        val dLocation = intent.getStringExtra("iLocation")
//        val dFollower = intent.getStringExtra("iFollower")
//        val dRepository = intent.getStringExtra("iRepository")
//        val dFollowing = intent.getStringExtra("iFollowing")

        val item = intent.getParcelableExtra<Model>("data")

        //set detail user
        actionBar.setTitle(item?.Name)
        nameDtv.text = item?.Name
        usernameDtv.text = "Username: "+item?.Username
        item?.Avatar?.let { imageD.setImageResource(it) }
        followerDtv.text = item?.Follower+"\nFollower"
        repositoryDtv.text = item?.Repository+"\nRepository"
        followingDtv.text = item?.Following+"\nFollowing"
        companyDtv.text = "Company: "+item?.Company
        locationDtv.text = "Location: "+item?.Location

    }
}
