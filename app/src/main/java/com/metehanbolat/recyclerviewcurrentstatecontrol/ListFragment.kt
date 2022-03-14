package com.metehanbolat.recyclerviewcurrentstatecontrol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.metehanbolat.recyclerviewcurrentstatecontrol.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private var _binding : FragmentListBinding? = null
    private val binding get() = _binding!!

    private lateinit var nameList: ArrayList<String>
    private lateinit var adapter: NamesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        val view = binding.root

        nameList = ArrayList()
        nameList.add("Metehan 1")
        nameList.add("Metehan 2")
        nameList.add("Metehan 3")
        nameList.add("Metehan 4")
        nameList.add("Metehan 5")
        nameList.add("Metehan 6")
        nameList.add("Metehan 7")
        nameList.add("Metehan 8")
        nameList.add("Metehan 9")
        nameList.add("Metehan 10")
        nameList.add("Metehan 11")
        nameList.add("Metehan 12")
        nameList.add("Metehan 13")
        nameList.add("Metehan 14")
        nameList.add("Metehan 15")
        nameList.add("Metehan 16")
        nameList.add("Metehan 17")
        nameList.add("Metehan 18")
        nameList.add("Metehan 19")
        nameList.add("Metehan 20")
        nameList.add("Metehan 21")
        nameList.add("Metehan 22")
        nameList.add("Metehan 23")
        nameList.add("Metehan 24")
        nameList.add("Metehan 25")
        nameList.add("Metehan 26")
        nameList.add("Metehan 27")
        nameList.add("Metehan 28")
        nameList.add("Metehan 29")
        nameList.add("Metehan 30")
        nameList.add("Metehan 31")
        nameList.add("Metehan 32")

        adapter = NamesAdapter(nameList)
        /** Navigation yapısıyla birlikte defaultta sağlanıyor. */
        adapter.stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}