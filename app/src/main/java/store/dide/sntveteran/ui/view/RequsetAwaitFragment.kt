package store.dide.sntveteran.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import store.dide.sntveteran.R
import store.dide.sntveteran.ui.MainActivity


class RequsetAwaitFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_requset_await, container, false)

        view.findViewById<TextView>(R.id.textView11).setOnClickListener(){
            startActivity(Intent(activity, MainActivity::class.java))
            activity?.finish()
        }

        return  view
    }


}