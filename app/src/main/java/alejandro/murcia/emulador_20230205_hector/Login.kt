package alejandro.murcia.emulador_20230205_hector

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtUser = findViewById<EditText>(R.id.txtUser).text
        val txtPass = findViewById<EditText>(R.id.txtPass).text
        val btnLogin = findViewById<Button>(R.id.btnLogin)


        btnLogin.setOnClickListener {
            if (txtUser.equals("ADMIN") && txtPass.equals("ADMIN")) {
                val main = Intent(this, MainActivity::class.java)
                startActivity(main)
            } else {
                Toast.makeText(this, "Credenciales Inválidas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}