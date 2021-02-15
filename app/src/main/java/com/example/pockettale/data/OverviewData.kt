package com.example.pockettale.data

import com.example.pockettale.R

data class OverviewData(val accImage: Int, val name: String)

object AccountPockets {
    private val accImage = intArrayOf(
        R.drawable.ic_action_acc_bank,
        R.drawable.ic_action_acc_bank,
        R.drawable.ic_action_acc_bank,
        R.drawable.ic_action_acc_bank
    )

    private val accounts = arrayOf(
        "General Account",
        "Account 2",
        "Account 3",
        "Account 4"
    )

    var accList: ArrayList<OverviewData>? = null
        get(){
            if (field != null)
                return field

            field = ArrayList()
            for (i in accImage.indices) {
                val accImageID = accImage[i]
                val accountName = accounts[i]

                val  account = OverviewData(accImageID, accountName)
                field!!.add(account)
            }
            return field
        }
}