package com.bigomby.compartemesa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fima.cardsui.objects.CardStack;
import com.fima.cardsui.views.CardUI;


public class home_fragment extends Fragment {

    private CardUI mCardView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {



        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}