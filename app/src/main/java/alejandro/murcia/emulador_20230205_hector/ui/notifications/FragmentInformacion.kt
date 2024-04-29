package alejandro.murcia.emulador_20230205_hector.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import alejandro.murcia.emulador_20230205_hector.databinding.FragmentInformacionBinding
import android.widget.Button

class FragmentInformacion : Fragment() {

    private var _binding: FragmentInformacionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)


        val root = FragmentInformacionBinding.inflate(inflater, container, false).root



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}