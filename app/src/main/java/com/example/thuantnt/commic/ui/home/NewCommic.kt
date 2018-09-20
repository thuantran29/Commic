package com.example.thuantnt.commic.ui.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thuantnt.commic.R


class NewCommic : Fragment() {
    companion object {
        fun newInstance(): NewCommic {
            return NewCommic()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.new_commic_fragment, container, false)
    }
}