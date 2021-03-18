package com.example.homework

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.homework.interfaces.ActivityFragmentCommunication

class SecondFragmentA2 : Fragment() {

    var activityFragmentCommunication: ActivityFragmentCommunication? = null

    companion object {
        fun newInstance(): Fragment {
            return SecondFragmentA2()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_a2, container, false)
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

        val button1 = view.findViewById<Button>(R.id.button_first_f2)
        button1.setOnClickListener {
            activityFragmentCommunication?.replaceF2WithF3()
        }

        val button2 = view.findViewById<Button>(R.id.button_second_f2)
        button2.setOnClickListener {
            activityFragmentCommunication?.goBackToF1()
        }

        val button3 = view.findViewById<Button>(R.id.button_third_f2)
        button3.setOnClickListener {
            activityFragmentCommunication?.closeActivity()
        }

    }

}