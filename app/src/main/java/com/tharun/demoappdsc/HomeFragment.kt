package com.tharun.demoappdsc

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    lateinit var recyclerHome: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    private val eventList = arrayListOf(
            "Adobe XD Scratchclass - Introduction",
            "Latest Innovation and Trends in Flutter",
            "Discuss with DSC - Blockchain and Pi cryptocurrency",
            "Discuss with DSC - Data Engineering with Spark using Databricks",
            "Free Practical Cloud course",
            "DeveLup Series - Machine Learning Novice to Jarvis",
            "DeveLup Series - Problem Solving with Design Thinking",
            "DeveLup Series - Touring google Cloud",
            "DeveLup Series - Unboxing Mixed Reality",
            "DeveLup Series - Flutter Zero to Hero",
            "DeveLup Series - Kickstart with Firebase",
            "DeveLup Series - Graphic Designing - Intermediate",
            "DeveLup Series - Introduction to JavaScript",
            "DeveLup Series - Getting started with LaTeX",
            "DeveLup Series Launch"
    )
    lateinit var recyclerAdapter: HomeRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerHome = view.findViewById(R.id.recyclerHome)
        layoutManager = LinearLayoutManager(activity)
        recyclerAdapter = HomeRecyclerAdapter(activity as Context, eventList)
        recyclerHome.adapter = recyclerAdapter
        recyclerHome.layoutManager = layoutManager

        return view
    }


}