package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.homework.interfaces.ActivityFragmentCommunication

class SecondActivity : AppCompatActivity(), ActivityFragmentCommunication {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        addFirstFragment()
    }

    override fun onStart() {
        super.onStart()

        Log.e(SecondActivity::class.java.name, "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.e(SecondActivity::class.java.name, "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.e(SecondActivity::class.java.name, "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.e(SecondActivity::class.java.name, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e(SecondActivity::class.java.name, "onDestroy")
    }

    fun addFirstFragment(){
        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()

        val firstFragmentA2 = FirstFragmentA2.newInstance()

        val TAG = FirstFragmentA2::class.java.name

        val addTransaction = transaction.add(
                R.id.fl_container,
                firstFragmentA2,
                TAG
        )

        addTransaction.addToBackStack(TAG)

        addTransaction.commit()
    }



    override fun addSecondFragment(TAG: String) {
        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()

        val secondFragmentA2 = SecondFragmentA2.newInstance()

        val TAG = SecondFragmentA2::class.java.name

        val addTransaction = transaction.add(
                R.id.fl_container,
                secondFragmentA2,
                TAG
        )

        addTransaction.addToBackStack(TAG)

        addTransaction.commit()
    }

    override fun replaceF2WithF3(){
        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()

        val TAG = ThirdFragmentA2::class.java.name

        val thirdFragmentA2 = ThirdFragmentA2.newInstance()

        val replaceTransaction = transaction.replace(
                R.id.fl_container,
                thirdFragmentA2,
                TAG
        )

        replaceTransaction.addToBackStack(TAG)

        replaceTransaction.commit()
    }

    override fun goBackToF1() {
        super.onBackPressed()
    }

    override fun closeActivity() {
        finishAffinity()
    }

    override fun onBackPressed() {
        finishAffinity()
    }


}