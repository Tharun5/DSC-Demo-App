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

    val eventInfoList = arrayListOf<Event>(
        Event("Adobe XD Scratchclass - Introduction", "https://www.youtube.com/watch?v=XFl43uTPnXw",R.drawable.ic_adobexd),
        Event("Latest Innovation and Trends in Flutter", "https://www.youtube.com/watch?v=N89VGJVDGp4",R.drawable.ic_flutter),
        Event("Introduction to Graphic Designing - Basics", "https://www.youtube.com/watch?v=KVgV-jNWI38",R.drawable.ic_photoshop),
        Event("Free Practical Cloud course", "https://www.youtube.com/watch?v=jAAVNpnnCVo",R.drawable.ic_cloud),
        Event("DeveLup Series - Machine Learning Novice to Jarvis", "https://www.youtube.com/watch?v=HsQLXm8qG6I",R.drawable.ic_ml),
        Event("DeveLup Series - Touring google Cloud", "https://www.youtube.com/watch?v=0Lefoh5Dm_Q",R.drawable.ic_gcloud),
        Event("DeveLup Series - Unboxing Mixed Reality", "https://www.youtube.com/watch?v=zPy9UNc-1fc",R.drawable.ic_ar),
        Event("DeveLup Series - Flutter Zero to Hero", "https://www.youtube.com/watch?v=XtPlemLLh8s",R.drawable.ic_flutter),
        Event("DeveLup Series - Kickstart with Firebase", "https://www.youtube.com/watch?v=fSIRtE1wLn8",R.drawable.ic_firebase),
        Event("DeveLup Series - Graphic Designing - Intermediate", "https://www.youtube.com/watch?v=W-UNTtRV0Dk",R.drawable.ic_photoshop),
        Event("DeveLup Series - Introduction to JavaScript", "https://www.youtube.com/watch?v=yLgl0TVlU6Y",R.drawable.ic_javascript),
        Event("DeveLup Series - Getting started with LaTeX", "https://www.youtube.com/watch?v=HulcPIPJzU0",R.drawable.ic_latex)
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
        recyclerAdapter = HomeRecyclerAdapter(activity as Context, eventInfoList)
        recyclerHome.adapter = recyclerAdapter
        recyclerHome.layoutManager = layoutManager

        return view
    }


}