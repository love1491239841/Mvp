package com.example.administrator.mvp.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.mvp.R;
import com.example.administrator.mvp.presenter.impl.MainPresenter;
import com.example.administrator.mvp.view.inter.Views;

public class MainActivity extends AppCompatActivity implements Views{
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        MainPresenter mainPresenter = new MainPresenter(this);
        mainPresenter.GetNetwork();
    }

    @Override
    public void showData(String carousel) {

    }

    @Override
    public void showBanner(String carousel) {
        textView.setText(carousel);
    }
}
