package store.dide.sntveteran.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.flow.combine
import store.dide.sntveteran.R
import store.dide.sntveteran.databinding.FragmentEntersmscodeBinding
import store.dide.sntveteran.databinding.FragmentRequestAccessBinding
import store.dide.sntveteran.ui.viewmodels.RequestAccessViewModel

class RequestAccessFragment : Fragment() {

    companion object {
        fun newInstance() = RequestAccessFragment()
    }

    private var _binding: FragmentRequestAccessBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: RequestAccessViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRequestAccessBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RequestAccessViewModel::class.java)

        binding.buttonSend.setOnClickListener() {
            findNavController().navigate(R.id.action_requestAccessFragment_to_requsetAwaitFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}