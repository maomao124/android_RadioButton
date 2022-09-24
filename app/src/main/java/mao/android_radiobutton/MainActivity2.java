package mao.android_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RadioGroup radioGroup = findViewById(R.id.question1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId==R.id.b)
                {
                    Toast.makeText(MainActivity2.this,"YES", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity2.this,"ERROR", Toast.LENGTH_SHORT).show();
                }
            }
        });

        RadioGroup radioGroup2 = findViewById(R.id.question2);
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId==R.id.c2)
                {
                    Toast.makeText(MainActivity2.this,"YES", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity2.this,"ERROR", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}