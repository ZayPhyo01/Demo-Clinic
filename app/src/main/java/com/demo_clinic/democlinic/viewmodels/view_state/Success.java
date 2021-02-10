package com.demo_clinic.democlinic.viewmodels.view_state;

public class Success<T> extends ViewState {
    T uiData;

    Success(T data) {
        this.uiData = data;
    }

    public T getUiData() {
        return uiData;
    }
}
