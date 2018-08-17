package jp.techacademy.hironori.nonaka.lesson2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("野仲",23,"シンギュラリティ");

        human.say();
        human.think();
    }
}
