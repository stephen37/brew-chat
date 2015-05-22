package com.example.brewchat.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.brewchat.R;
import com.example.brewchat.activities.ContactsActivity;
import com.example.brewchat.events.UserLogoutEvent;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import de.greenrobot.event.EventBus;

public class NavigationDrawerFragment extends Fragment {
    @InjectView(R.id.logout_button)
    LinearLayout logoutLinearLayout;

    @OnClick(R.id.contacts_nav_item)
    void contactsClicked() {
       // if (getActivity().equals(ContactsActivity.class)) {
        //    Log.d("LOG"," We're in the Contact Activity" );
        //}else {
         //   Log.d("LOG", "We're not in the contact activity, we're in " +getActivity());
            startActivity(new Intent(getActivity(), ContactsActivity.class));
        //}
    }

    public NavigationDrawerFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        ButterKnife.inject(this, layout);
        return layout;
    }

    @OnClick(R.id.logout_button)
    public void logout() {
        EventBus.getDefault().post(new UserLogoutEvent());
    }

}