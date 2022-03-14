package com.metehanbolat.recyclerviewcurrentstatecontrol

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.metehanbolat.recyclerviewcurrentstatecontrol.databinding.NamesRowBinding

class NamesAdapter(val nameList: ArrayList<String>): RecyclerView.Adapter<NamesAdapter.NamesViewHolder>() {
    class NamesViewHolder(val binding: NamesRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val binding = NamesRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NamesViewHolder(binding)

    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val name = nameList[position]
        holder.binding.apply {
            nameText.text = name
        }
        holder.binding.nameText.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToDetailsFragment(name)
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int = nameList.size
}