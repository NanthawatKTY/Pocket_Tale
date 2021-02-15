package com.example.pockettale.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.pockettale.R
import com.example.pockettale.data.OverviewData
import com.example.pockettale.ui.overview.OverviewFragment
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.spinner_acc_item.view.*

class OverviewSpinnerAdapter(context: Context, accountList: List<OverviewData>) : ArrayAdapter<OverviewData>(context, 0, accountList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    private fun initView(position: Int, convertView: View?, parent: ViewGroup): View {
       val account = getItem(position)

       val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.spinner_acc_item, parent, false)
//       Picasso.get().load(account!!.accImage).into(view.imgAccSpinner)
       view.imgAccSpinner.setImageResource(account!!.accImage)
       view.txtAccSpinner.text = account.name

        return  view
    }

}