package store.dide.sntveteran.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import store.dide.sntveteran.R
import store.dide.sntveteran.ui.viewmodels.VotesViewModel

class VotesFragment : Fragment() {

    companion object {
        fun newInstance() = VotesFragment()
    }

    private lateinit var viewModel: VotesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.votes_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VotesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}