package com.deadapps.unmsm.presentation.presenters;

import android.content.Context;
import android.support.annotation.NonNull;

import com.deadapps.unmsm.data.local.SessionManager;
import com.deadapps.unmsm.presentation.contracts.ExampleContract;

/**
 * Created by manu on 08/08/16.
 */
public class ExamplePresenter implements ExampleContract.Presenter{

    private final ExampleContract.View mView;
    private final SessionManager mSessionManager;
    private String next;
    private boolean mFirstLoad = false;


    public ExamplePresenter(@NonNull ExampleContract.View view,
                            Context context) {
        this.mView = view;
        this.mSessionManager = new SessionManager(context);
        this.mView.setPresenter(this);
    }


    @Override
    public void start() {

    }



}
