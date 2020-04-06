package com.example.mySchedule;

import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.mySchedule.R;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter adapter;
    private Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner = (Spinner) findViewById(R.id.inc_wgt);
        adapter = ArrayAdapter.createFromResource(this, R.array.wgt, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner = (Spinner) findViewById(R.id.rep_wgt);
        adapter = ArrayAdapter.createFromResource(this, R.array.wgt, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner = (Spinner) findViewById(R.id.rest);
        adapter = ArrayAdapter.createFromResource(this, R.array.time, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner = (Spinner) findViewById(R.id.rep_rest);
        adapter = ArrayAdapter.createFromResource(this, R.array.time, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        final Button listButton = (Button) findViewById(R.id.listButton);
        final Button timeButton = (Button) findViewById(R.id.timeButton);
        final Button settingButton = (Button) findViewById(R.id.settingButton);
        final LinearLayout notice = (LinearLayout) findViewById(R.id.notice);


        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.GONE);
                listButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                timeButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                settingButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new TimeFlag());
                fragmentTransaction.commit();
            }
        });

        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                timeButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                settingButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

                Intent mainIntent = new Intent(MainActivity.this, MainActivity.class);
                MainActivity.this.startActivity(mainIntent);
            }
        });

        //시간표틀 만들기.v
        //설정 만들어서 세트당 무게 증가량, 쉬는시간 변수 만들기.v
        //시간표에 내용 추가하고 무게 반복횟수 등 설정 할 수 있게 하기
        //메인에 있는 스타트를 누르면 반복 횟수만큼 쉬는시간 카운터 만들기
        //

    }

}
