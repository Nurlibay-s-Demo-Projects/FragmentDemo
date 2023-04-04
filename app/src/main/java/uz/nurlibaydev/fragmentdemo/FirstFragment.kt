package uz.nurlibaydev.fragmentdemo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.nurlibaydev.fragmentdemo.databinding.FragmentFirstBinding
import kotlin.random.Random

/**
 *  Created by Nurlibay Koshkinbaev on 05/04/2023 00:41
 */

class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)

        binding.text.text = Random.nextInt(10, 50).toString()

        val fm = requireActivity().supportFragmentManager.beginTransaction()
        fm.replace(R.id.frame, FirstFragment())
        fm.commit()
    }
}