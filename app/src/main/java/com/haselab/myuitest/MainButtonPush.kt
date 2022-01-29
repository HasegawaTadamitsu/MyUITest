package com.haselab.myuitest

import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainButtonPush(activity: MainActivity) : View.OnClickListener {
    private val mActivity: MainActivity = activity
    override fun onClick(v: View) {
       when( v.id ){
           R.id.bt_change->{
               onClickChange()
           }
           R.id.bt_clear ->{
               onClickClear()
           }
       }
    }
    private fun onClickChange(){
        val input = mActivity.findViewById<EditText>(R.id.et_inputName)
        val output = mActivity.findViewById<TextView>(R.id.tv_msg)
        val str = input.text.toString() + "san"
        output.text = str
    }
    private fun onClickClear(){
        val output = mActivity.findViewById<TextView>(R.id.tv_msg)
        output.text = ""
        val input = mActivity.findViewById<EditText>(R.id.et_inputName)
        input.setText("")
    }
}