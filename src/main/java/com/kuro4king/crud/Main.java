package com.kuro4king.crud;

import com.kuro4king.crud.view.MainView;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        MainView mainView = new MainView();
        mainView.start();
    }
}
