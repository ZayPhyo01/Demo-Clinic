package com.demo_clinic.democlinic.activities;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.demo_clinic.democlinic.viewmodels.view_state.ViewStateFactory;

abstract class BaseActivity extends AppCompatActivity {

    abstract @LayoutRes
    int inflate();

    abstract void init ();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(inflate());
        init();

    }
}
