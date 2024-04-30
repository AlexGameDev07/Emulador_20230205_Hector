package alejandro.murcia.emulador_20230205_hector

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class FragmentContactanos : Fragment() {
    
    private val mail: String = "20230205@ricaldone.edu.sv"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_contactanos, container, false)
        
        val lbContact = root.findViewById<TextView>(R.id.lbContact)
        val btncontact = root.findViewById<Button>(R.id.btnContact)
        
        btncontact.setOnClickListener {
            Toast.makeText(context, mail, Toast.LENGTH_SHORT).show()
            lbContact.text = mail
        }
        
        return root
    }

    
}