package com.avs.flexboxexample.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.avs.flexboxexample.R
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexWrap
import com.google.android.flexbox.FlexboxLayoutManager

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var startersAdapter: MenuAdapter
    private lateinit var mainCoursesAdapter: MenuAdapter
    private lateinit var dessertsAdapter: MenuAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val root = inflater.inflate(R.layout.main_fragment, container, false)

        setUpStartersUI(root)
        setUpMainCoursesUI(root)
        setUpDessertsUI(root)

        return root
    }

    private fun setUpStartersUI(root: View) {
        val rvStarters = root.findViewById<RecyclerView>(R.id.rvStarters)
        startersAdapter = MenuAdapter(viewModel.starters, context)
        rvStarters.apply {
            adapter = startersAdapter
            layoutManager = FlexboxLayoutManager(context, FlexDirection.ROW, FlexWrap.NOWRAP)
        }
    }

    private fun setUpMainCoursesUI(root: View) {
        val rvMainCourses = root.findViewById<RecyclerView>(R.id.rvMainCourses)
        mainCoursesAdapter = MenuAdapter(viewModel.mainCourses, context)
        rvMainCourses.apply {
            adapter = mainCoursesAdapter
            layoutManager = FlexboxLayoutManager(context, FlexDirection.ROW, FlexWrap.NOWRAP)
        }
    }

    private fun setUpDessertsUI(root: View) {
        val rvDesserts = root.findViewById<RecyclerView>(R.id.rvDesserts)
        dessertsAdapter = MenuAdapter(viewModel.desserts, context)
        rvDesserts.apply {
            adapter = dessertsAdapter
            layoutManager = FlexboxLayoutManager(context, FlexDirection.ROW, FlexWrap.NOWRAP)
        }
    }
}