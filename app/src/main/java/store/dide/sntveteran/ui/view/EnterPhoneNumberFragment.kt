package store.dide.sntveteran.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import store.dide.sntveteran.R
import store.dide.sntveteran.databinding.FragmentEnterphonenumBinding
import store.dide.sntveteran.ui.MainActivity


class EnterPhoneNumberFragment : Fragment() {

    private var _binding: FragmentEnterphonenumBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentEnterphonenumBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToSms.setOnClickListener {
            findNavController().navigate(R.id.action_EnterPhonenumNavFr_to_nterCodeNavFr)
        }

        binding.textConfpolicy.setOnClickListener(){
            startActivity(Intent(activity, MainActivity::class.java))
            activity?.finish()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}