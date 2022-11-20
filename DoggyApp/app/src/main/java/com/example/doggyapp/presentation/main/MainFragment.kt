package com.example.doggyapp.presentation.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import coil.load
import coil.transform.CircleCropTransformation
import com.example.doggyapp.R
import com.example.doggyapp.domain.adapter.avatar.avatar
import com.example.doggyapp.domain.adapter.avatar.totalCount
import com.example.doggyapp.domain.adapter.leaderBoard.LeaderBoardAdapter
import com.example.doggyapp.domain.entities.LeaderBoardData
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setUpUi()
    }
    private fun setUpUi(){
        firstPlace.load(R.drawable.avatar6){
            crossfade(true)
            transformations(CircleCropTransformation())
        }
        secondPlace.load(R.drawable.avatar3){
            crossfade(true)
            transformations(CircleCropTransformation())
        }
        thirdPlace.load(R.drawable.avatar7){
            crossfade(true)
            transformations(CircleCropTransformation())
        }
        val leaderBoardData:ArrayList<LeaderBoardData> = ArrayList()
        leaderBoardData.add(LeaderBoardData(avatar,"Your Podition","rank:45", "coins:"+totalCount.toString(),true))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar2,"bondo","rank:4", "coins:250",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar3,"gordo","rank:5", "coins:240",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar5,"dzia","rank:6", "coins:210",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar1,"beli","rank:7", "coins:200",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar2,"what","rank:8","coins:190",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar1,"hot","rank:9", "coins:180",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar6,"not","rank:10", "coins:160",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar2,"what","rank:11","coins:190",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar1,"hot","rank:12", "coins:180",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar6,"not","rank:13", "coins:160",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar2,"what","rank:14","coins:190",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar1,"hot","rank:15", "coins:180",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar6,"not","rank:16", "coins:160",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar2,"what","rank:17","coins:190",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar1,"hot","rank:18", "coins:180",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar6,"not","rank:19", "coins:160",false))
        leaderBoardData.add(LeaderBoardData(R.drawable.avatar6,"not","rank:20", "coins:160",false))
        leaderboard.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        leaderboard.adapter = LeaderBoardAdapter(leaderBoardData)
    }
}