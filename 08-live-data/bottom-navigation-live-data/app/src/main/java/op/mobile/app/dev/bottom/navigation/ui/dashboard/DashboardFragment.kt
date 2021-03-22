package op.mobile.app.dev.bottom.navigation.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import op.mobile.app.dev.bottom.navigation.R

class DashboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_dashboard, container, false)

        val tvOutput: TextView = view.findViewById(R.id.tv_count)
        val btnPlusOne: Button = view.findViewById(R.id.btn_plus_one)
        val btnReset: Button = view.findViewById(R.id.btn_reset)

<<<<<<< HEAD:08-live-data/bottom-navigation-live-data/app/src/main/java/op/mobile/app/dev/bottom/navigation/ui/dashboard/DashboardFragment.kt
        val viewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)

        viewModel.count.observe(viewLifecycleOwner, Observer {
            tvOutput.text = it.toString()
        })

        btnPlusOne.setOnClickListener {
            viewModel.plusOne()
        }

        btnReset.setOnClickListener {
            viewModel.reset()
=======
        var count = 0
        
        tvOutput.text = count.toString()

        btnPlusOne.setOnClickListener {
            count++
            tvOutput.text = count.toString()
>>>>>>> d4d2c3841bf1a3e7d175fab4a0c9f6d79f2bf56e:07-view-model/07-bottom-navigation/app/src/main/java/op/mobile/app/dev/bottom/navigation/ui/dashboard/DashboardFragment.kt
        }

        return view
    }
}
