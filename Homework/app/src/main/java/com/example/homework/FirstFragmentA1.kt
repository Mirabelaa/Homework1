package com.example.homework

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.example.homework.interfaces.ActivityFragmentCommunication
import androidx.navigation.fragment.findNavController

class FirstFragmentA1 : Fragment() {

    var activityFragmentCommunication: ActivityFragmentCommunication? = null

    companion object {
        fun newInstance() : Fragment {
            return FirstFragmentA1()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        when(context) {
            is ActivityFragmentCommunication ->
                activityFragmentCommunication = context
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_a1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            openSecondActivity()
        }
    }

    private fun openSecondActivity() {
        val intent: Intent = Intent(activity, SecondActivity::class.java)

        startActivity(intent)
    }
}