package vcmsa.ci.project2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text



class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    private lateinit var inputext:EditText
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Variable Declaration
        val ResetButton = findViewById<Button>(R.id.ResetButton)
        val suggestiontextView = findViewById<TextView>(R.id.suggestionTextView)
        val mealTextView = findViewById<TextView>(R.id.mealTextView)
        var inputext= findViewById<EditText>(R.id.inputext)
        val AcceptButton = findViewById<Button>(R.id.AcceptButton)

            //meal menu
            val morning = "Cereal,pudding,toast"
            val lunch = "sandwitch, fruit,salad"
            val Dinner = "rice and chicken,spaghetti"
        AcceptButton.setOnClickListener{
            // When user inputs time of day,it should display food
            if(inputext.text.toString()=="morning") {
                mealTextView.text=" Your Food ${morning}" }
            else if(inputext.text.toString()=="lunch")
            {mealTextView.text=" your food ${lunch}"}
            else{
                inputext.text.toString()=="Dinner"
                mealTextView.text="your food ${Dinner}"}
        }
        ResetButton.setOnClickListener{
            mealTextView.text="suggestion"
            inputext.text.clear()

        }







    }
}