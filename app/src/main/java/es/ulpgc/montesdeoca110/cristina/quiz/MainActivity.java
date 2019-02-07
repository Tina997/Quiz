package es.ulpgc.montesdeoca110.cristina.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView answerText, questionText;
    private Button trueButton, falseButton,cheatButton, nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //fijar el layout de la activity
        setContentView(R.layout.activity_main);
        //accerder a los componentes del layout
        answerText = findViewById(R.id.answerText);
        questionText = findViewById(R.id.questionText);
        trueButton = findViewById(R.id.trueButton);
        falseButton = findViewById(R.id.falseButton);
        cheatButton = findViewById(R.id.cheatButton);
        nextButton = findViewById(R.id.nextButton);
        questionText.setText("La estatua de la libertad fue un regalo de España a EEUU");

    }
    public void onTrueButtonClicked(View view){
        Log.e("MainActivity","onTrueButtonClicked()");
        answerText.setText(R.string.trueButtonLabel);
    }
    public void onFalseButtonClicked(View view){
        Log.e("MainActivity","onFalseButtonClicked()");
        answerText.setText(R.string.falseButtonLabel);
    }
    public void onNextButtonClicked(View view){
        questionText.setText("Cuestion 2");
    }
}
