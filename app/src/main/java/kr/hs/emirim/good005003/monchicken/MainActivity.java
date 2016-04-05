package kr.hs.emirim.good005003.monchicken;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicken);
        mButton.setOnClickListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);
    }

    @Override
    public void onClick(View v) {

        String name = mName.getText().toString();

//        if (name == null) {
//            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
//        } else {
//
//            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent);
//        }

        try {
            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);

        } catch(NullPointerException e) {
            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(this, "뭔지 모르지만 잘 안되네요!", Toast.LENGTH_LONG).show();
        }
    }
}