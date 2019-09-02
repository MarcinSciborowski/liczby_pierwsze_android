package com.example.marcin.czypierwsza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btRes;
    EditText editNum;
    TextView resText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btRes = (Button) findViewById(R.id.btRes);
        editNum = (EditText) findViewById(R.id.editNum);
        resText = (TextView) findViewById(R.id.resText);

        btRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num, count = 0;
                Boolean flag = false;
                num = Integer.parseInt(editNum.getText().toString());
                for(int i = 1; i<=num; i++){
                    if (num%i==0){
                        count+=1;
                    }
                }

                if(count==2){
                    resText.setText("Podana liczba jest pierwsza!");
                }
                else{
                    while(flag == false){
                        num = num - 1;
                        count = 0;
                        for(int i = 1; i<=num; i++){
                            if (num%i==0){
                                count+=1;
                            }
                        }
                        if(count==2){
                            resText.setText("Podana liczba jest złożona. Najbliższa pierwsza to: " + num);
                            flag = true;
                        }
                    }

                }
            }
        });

    }
}
