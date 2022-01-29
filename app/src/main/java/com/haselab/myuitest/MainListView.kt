package com.haselab.myuitest

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainListView(activity: MainActivity) : AdapterView.OnItemClickListener {
    private val mActivity: MainActivity = activity
    fun setItem() {
        var list = mutableListOf("A","B","C")
        var addpter = ArrayAdapter(mActivity,android.R.layout.simple_list_item_1,list)

        val lv= mActivity.findViewById<ListView>(R.id.lv_sample)
        lv.adapter = addpter
    }
    override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        Toast.makeText(mActivity, "hello", Toast.LENGTH_LONG).show()
    }
}