package com.deadapps.unmsm.presentation.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

import com.deadapps.unmsm.R;
import com.deadapps.unmsm.core.BaseActivity;
import com.deadapps.unmsm.presentation.fragments.ExampleFragment;
import com.deadapps.unmsm.presentation.presenters.ExamplePresenter;
import com.deadapps.unmsm.utils.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExampleActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        ButterKnife.bind(this);

        toolbar.setTitle("Ejemplo");

        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowHomeEnabled(true);

        ExampleFragment fragment = (ExampleFragment) getSupportFragmentManager()
                .findFragmentById(R.id.body);

        if (fragment == null) {
            fragment = ExampleFragment.newInstance();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    fragment, R.id.body);
        }

        // Create the presenter
        new ExamplePresenter(fragment,this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
