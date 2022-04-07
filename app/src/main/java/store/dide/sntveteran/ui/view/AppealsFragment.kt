package store.dide.sntveteran.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import store.dide.sntveteran.R
import store.dide.sntveteran.ui.viewmodels.AppealsViewModel

class AppealsFragment : Fragment() {

    companion object {
        fun newInstance() = AppealsFragment()
    }

    private lateinit var viewModel: AppealsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.appeals_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AppealsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}