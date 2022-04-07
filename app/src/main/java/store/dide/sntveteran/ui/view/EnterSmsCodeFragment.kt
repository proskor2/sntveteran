package store.dide.sntveteran.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import store.dide.sntveteran.databinding.FragmentEntersmscodeBinding
import store.dide.sntveteran.ui.MainActivity


class EnterSmsCodeFragment : Fragment() {

    private var _binding: FragmentEntersmscodeBinding? = null

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
//            findNavController().navigate(R.id.action_smscode_tophonenum)
            startActivity(Intent(this.context, MainActivity::class.java))
            activity?.finish()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}