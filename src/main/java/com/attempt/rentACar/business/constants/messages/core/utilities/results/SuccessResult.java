package com.etiya.rentACar.business.constants.messages.core.utilities.results;

public class SuccessResult extends Result{

    public SuccessResult(){
        super(true);
    }

    public SuccessResult(String messages) {
        super(true, messages);
    }

}

