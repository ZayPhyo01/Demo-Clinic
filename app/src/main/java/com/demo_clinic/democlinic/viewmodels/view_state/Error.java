package com.demo_clinic.democlinic.viewmodels.view_state;

public class Error extends ViewState {
    String message;

    Error(String m) {
        this.message = m;
    }

    public String getMessage() {
        return message;
    }
}
