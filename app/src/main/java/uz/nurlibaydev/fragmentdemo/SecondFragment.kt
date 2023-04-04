package uz.nurlibaydev.fragmentdemo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.nurlibaydev.fragmentdemo.databinding.FragmentFirstBinding
import uz.nurlibaydev.fragmentdemo.databinding.FragmentSecondBinding
import kotlin.random.Random

/**
 *  Created by Nurlibay Koshkinbaev on 05/04/2023 00:44
 */

class SecondFragment: Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

        binding.text.text = Random.nextInt(10, 50).toString()
    }
}