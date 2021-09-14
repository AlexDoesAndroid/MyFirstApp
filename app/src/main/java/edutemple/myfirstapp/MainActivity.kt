package edutemple.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button)
            .setOnClickListener({v, -> (v as Button).text = "You clicked the button"})

    }
}