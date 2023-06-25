package com.example.speakpedia;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText displayText;
    private SpeechRecognizer speechRecognizer;
    TextToSpeech textToSpeech;
    private static final int REQUEST_PERMISSION_CODE = 1;
    private static final int SPEECH_REQUEST_CODE = 2;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);


        //for the textview
        displayText = findViewById(R.id.display_text);
        setupRetrofit();

        //reference to all buttons
        ImageButton imageButtonq = findViewById(R.id.imageButtonq);
        ImageButton imageButtonw = findViewById(R.id.imageButtonw);
        ImageButton imageButtone = findViewById(R.id.imageButtone);
        ImageButton imageButtonr = findViewById(R.id.imageButtonr);
        ImageButton imageButtont = findViewById(R.id.imageButtont);
        ImageButton imageButtony = findViewById(R.id.imageButtony);
        ImageButton imageButtonu = findViewById(R.id.imageButtonu);
        ImageButton imageButtoni = findViewById(R.id.imageButtoni);
        ImageButton imageButtono = findViewById(R.id.imageButtono);
        ImageButton imageButtonp = findViewById(R.id.imageButtonp);
        ImageButton imageButtona = findViewById(R.id.imageButtona);
        ImageButton imageButtons = findViewById(R.id.imageButtons);
        ImageButton imageButtond = findViewById(R.id.imageButtond);
        ImageButton imageButtonf = findViewById(R.id.imageButtonf);
        ImageButton imageButtong = findViewById(R.id.imageButtong);
        ImageButton imageButtonh = findViewById(R.id.imageButtonh);
        ImageButton imageButtonj = findViewById(R.id.imageButtonj);
        ImageButton imageButtonk = findViewById(R.id.imageButtonk);
        ImageButton imageButtonl = findViewById(R.id.imageButtonl);
        ImageButton imageButtonz = findViewById(R.id.imageButtonz);
        ImageButton imageButtonx = findViewById(R.id.imageButtonx);
        ImageButton imageButtonc = findViewById(R.id.imageButtonc);
        ImageButton imageButtonv = findViewById(R.id.imageButtonv);
        ImageButton imageButtonb = findViewById(R.id.imageButtonb);
        ImageButton imageButtonn = findViewById(R.id.imageButtonn);
        ImageButton imageButtonm = findViewById(R.id.imageButtonm);
        ImageButton imageButtondel = findViewById(R.id.imageButtondel);
        Button imageButtonspeak = findViewById(R.id.imageButtonspeak);
        ImageButton imageButtonspace = findViewById(R.id.imageButtonspace);
        ImageView imageButtonsearch = findViewById(R.id.imageButtonsearch);
        ImageButton imageButtonclearall = findViewById(R.id.imageButtonclearall);
        ImageView imageButtonspeech = findViewById(R.id.imageButtonspeech);


        //set onclick listener for each buttons
        imageButtonq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "Q");
            }
        });
        imageButtonw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "W");
            }
        });
        imageButtone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "E");
            }
        });
        imageButtonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "R");
            }
        });
        imageButtont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "T");
            }
        });
        imageButtony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "Y");
            }
        });
        imageButtonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "U");
            }
        });
        imageButtoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "I");
            }
        });
        imageButtono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "O");
            }
        });
        imageButtonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "P");
            }
        });
        imageButtona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "A");
            }
        });
        imageButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "S");
            }
        });
        imageButtond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "D");
            }
        });
        imageButtonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "F");
            }
        });
        imageButtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "G");
            }
        });
        imageButtonh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "H");
            }
        });
        imageButtonj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "J");
            }
        });
        imageButtonk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "K");
            }
        });
        imageButtonl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "L");
            }
        });
        imageButtonz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "Z");
            }
        });
        imageButtonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "X");
            }
        });
        imageButtonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "C");
            }
        });
        imageButtonv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "V");
            }
        });
        imageButtonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "B");
            }
        });
        imageButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "N");
            }
        });
        imageButtonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + "M");
            }
        });
        imageButtondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                //check if  the text is not empty
                if (!currentText.isEmpty()) {
                    //this will remove the last character from the text
                    String updateText = currentText.substring(0, currentText.length() - 1);
                    displayText.setText(updateText);
                }
            }
        });
        imageButtonspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = displayText.getText().toString();
                displayText.setText(currentText + " ");
            }
        });

        imageButtonclearall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText("");
            }
        });

        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int language = textToSpeech.setLanguage(Locale.ENGLISH);
                }
            }

        });
        imageButtonspeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = displayText.getText().toString();
                int speech = textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        imageButtonsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = displayText.getText().toString();
                searchWord(userInput);
            }
        });

        imageButtonspeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPermissionAndStartSpeechToText();
            }
        });
        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
    }

    private void checkPermissionAndStartSpeechToText() {
        //check if the record audio permission is okay
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            //request the permission
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, REQUEST_PERMISSION_CODE);
        } else {
            //is permission is already granted, start the stt
            startSpeechToText();
        }
    }

    private void startSpeechToText() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);

        //start the stt act and results
        startActivityForResult(intent, SPEECH_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == SPEECH_REQUEST_CODE && resultCode == RESULT_OK) {
            //retrieve the stt result
            ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            if (result != null && !result.isEmpty()) {
                //update the textview with the recognized text
                displayText.setText(result.get(0));
            }
        }
    }

    public void onRequestPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //permission granted, start stt
                startSpeechToText();
            } else {
                //permission denied
                Toast.makeText(this, "Permission is denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //release the speechRecodnizer resources
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
    }


    private TextView textView;
    private DictionaryService dictionaryService;


    private void setupRetrofit() {

        textView = findViewById(R.id.textView2);
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(
                        new Interceptor() {
                            @Override
                            public okhttp3.Response intercept(Chain chain) throws IOException {
                                Request.Builder requestBuilder = chain.request().newBuilder();
                                requestBuilder.header("Content-Type", "application/json");
                                return chain.proceed(requestBuilder.build());
                            }
                        })
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.dictionaryapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        dictionaryService = retrofit.create(DictionaryService.class);
    }

    private void searchWord(String word) {
        Call<WordResponse[]> call = dictionaryService.getWordDefinition(word, "fd5d3406-f23d-42b4-acfd-42a0eb637af9");
        call.enqueue(new Callback<WordResponse[]>() {
            @Override
            public void onResponse(Call<WordResponse[]> call, Response<WordResponse[]> response) {
                if (response.isSuccessful()) {
                    WordResponse[] wordResponses = response.body();
                    if (wordResponses != null && wordResponses.length > 0) {
                        WordResponse firstEntry = wordResponses[0];
                        String definition = parseDefinitionFromResponse(firstEntry);
                        runOnUiThread(() -> textView.setText(definition));
                    } else {
                        runOnUiThread(() -> textView.setText("No definition found."));
                    }
                } else {
                    runOnUiThread(() -> textView.setText("Unable to fetch definition. Please try again."));
                }
            }

            @Override
            public void onFailure(Call<WordResponse[]> call, Throwable t) {
                runOnUiThread(() -> textView.setText("Unable to fetch definition. Please try again."));
            }
        });
    }

    private String parseDefinitionFromResponse(WordResponse responseBody) {
        if(responseBody.getHwi().getPhonetics() == null){
            return "No definition found.";
        }
        if(responseBody.getDefinitions() == null){
            return "No definition found.";
        }
        return "Phonetics: " + responseBody.getHwi().getPhonetics()[0].getMw().toString() + "\n\nDefinition: " + responseBody.getShortDef()[0] + "\n\n";
    }
}

