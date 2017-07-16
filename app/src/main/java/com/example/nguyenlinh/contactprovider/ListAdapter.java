package com.example.nguyenlinh.contactprovider;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nguyenlinh on 16/07/2017.
 */

public class ListAdapter extends ArrayAdapter<Contact> {
    public ListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view =  inflater.inflate(R.layout.layout_contact, null);
        }

        Contact contact = getItem(position);
        if (contact != null) {
            // Anh xa + Gan gia tri
            TextView txtName = (TextView) view.findViewById(R.id.txtvName);
            txtName.setText(contact.getName());

            TextView txtPhone = (TextView) view.findViewById(R.id.txtvNumeber);
            txtPhone.setText(contact.getPhoneNumber());
        }
        return view;
    }
}
