package com.example.pockettale.ui.overview

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.pockettale.R
import com.example.pockettale.adapter.OverviewSpinnerAdapter
import com.example.pockettale.data.AccountPockets
import kotlinx.android.synthetic.main.fragment_overview.*

class OverviewFragment : Fragment(R.layout.fragment_overview) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupOverviewSpinner()
    }

    private fun setupOverviewSpinner(){
        val adapter = this.context?.let { OverviewSpinnerAdapter(it, AccountPockets.accList!!) }
        spinnerAccOverview.adapter = adapter
    }
}