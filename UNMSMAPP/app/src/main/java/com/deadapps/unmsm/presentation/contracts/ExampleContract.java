package com.deadapps.unmsm.presentation.contracts;

import com.deadapps.unmsm.core.BasePresenter;
import com.deadapps.unmsm.core.BaseView;

/**
 * Especifica el contrato entre la vista y el presentador para logueo
 */
public interface ExampleContract {

    interface View extends BaseView<Presenter> {


        boolean isActive();
    }

    interface Presenter extends BasePresenter {


    }
}
