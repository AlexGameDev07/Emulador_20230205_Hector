package alejandro.murcia.emulador_20230205_hector.ui.dashboard

import alejandro.murcia.emulador_20230205_hector.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import alejandro.murcia.emulador_20230205_hector.databinding.FragmentPerfilBinding
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class FragmentPerfil : Fragment() {

    private var _binding: FragmentPerfilBinding? = null
    private val nombre: String = "Alejandro Murcia"

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)


        val root = FragmentPerfilBinding.inflate(inflater, container, false).root
        val lbPerfil = root.findViewById<TextView>(R.id.lbPerfil)
        val btnPerfil = root.findViewById<Button>(R.id.btnPerfil)

        btnPerfil.setOnClickListener {
            Toast.makeText(context, nombre, Toast.LENGTH_SHORT).show()

            lbPerfil.text = nombre


        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}