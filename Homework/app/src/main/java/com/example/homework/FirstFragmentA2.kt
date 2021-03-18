package com.example.homework

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.homework.interfaces.ActivityFragmentCommunication

class FirstFragmentA2 :Fragment(){

    var activityFragmentCommunication: ActivityFragmentCommunication? = null

    companion object {
        fun newInstance(): Fragment {
            return FirstFragmentA2()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first_a2, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        when(context) {
            is ActivityFragmentCommunication ->
                activityFragmentCommunication = context
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        val button1 = view.findViewById<Button>(R.id.button_second)
        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            activityFragmentCommunication?.addSecondFragment(SecondFragmentA2::class.java.name)
        }
    }
}