package uz.nurlibaydev.fragmentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import uz.nurlibaydev.fragmentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var first: FirstFragment
    private var fragments = mutableListOf<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFirstAdd.setOnClickListener {
            val fm = supportFragmentManager.beginTransaction()
            first = FirstFragment()
            fragments.add(first)
            fm.replace(R.id.frame, first)
            fm.commit()
        }

        binding.btnFirstRemove.setOnClickListener {
            val fm = supportFragmentManager.beginTransaction()
            if(fragments.isNotEmpty()) {
                fm.remove(fragments.last())
                fragments.remove(fragments.last())
                fm.commit()
            }
        }

//        binding.btnAdd.setOnClickListener {
//            val fm = supportFragmentManager.beginTransaction()
//            fm.add(R.id.frame, SecondFragment())
//            fm.commit()
//        }
    }
}