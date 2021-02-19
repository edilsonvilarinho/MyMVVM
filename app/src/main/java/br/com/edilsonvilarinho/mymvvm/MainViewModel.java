package br.com.edilsonvilarinho.mymvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<Integer> cont;

    public MainViewModel() {
        cont = new MutableLiveData<>();
        cont.setValue(0);
    }

    public MutableLiveData<Integer> getCont() {
        return cont;
    }

    public void add() {
        cont.setValue(cont.getValue() + 1);
    }
}
