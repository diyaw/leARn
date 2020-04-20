package com.example.learnnavigation;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ForumFragment extends Fragment {

    private ForumViewModel mViewModel;

    public static ForumFragment newInstance() {
        return new ForumFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.forum_fragment, container, false);
        return RootView;
    }

}
