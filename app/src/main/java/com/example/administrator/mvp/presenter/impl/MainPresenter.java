package com.example.administrator.mvp.presenter.impl;

import com.example.administrator.mvp.model.impl.TextModel;
import com.example.administrator.mvp.presenter.inter.Presenter;
import com.example.administrator.mvp.view.activity.MainActivity;

public class MainPresenter implements Presenter {
    private String carousel;
    private MainActivity view;

    public MainPresenter(MainActivity view) {
        this.view = view;
    }

    @Override
    public void GetNetwork() {
        TextModel textModel = new TextModel();
        carousel = textModel.getData();
        view.showBanner(carousel);
    }
}
