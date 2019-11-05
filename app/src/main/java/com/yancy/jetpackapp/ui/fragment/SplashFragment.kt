package com.yancy.jetpackapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

import com.yancy.jetpackapp.R
import kotlinx.android.synthetic.main.fragment_splash.*


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


    override fun onResume() {
        super.onResume()

        splash_login.setOnClickListener {
            /// 跳转动画操作
            val navOptions = navOptions {
                anim {
                    enter = R.anim.slide_in_right
                }
            }
            /// 携带点数据
            val bundle = Bundle()
            bundle.putString("name", "test")

            /// 跳转
            findNavController().navigate(R.id.login, bundle, navOptions)
        }

    }
}
