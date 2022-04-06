package store.dide.sntveteran.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import store.dide.sntveteran.R
import store.dide.sntveteran.databinding.FragmentEntersmscodeBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class EnterSmsCodeFragment : Fragment() {

    private var _binding: FragmentEntersmscodeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentEntersmscodeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonEntersms.setOnClickListener {
            findNavController().navigate(R.id.action_smscode_tophonenum)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}