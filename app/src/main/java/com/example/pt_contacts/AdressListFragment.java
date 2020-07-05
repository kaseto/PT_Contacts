package com.example.pt_contacts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.ContentView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class AdressListFragment extends ListFragment {

    private ArrayList<Contact> contacts;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contacts=AdressBook.getInstance().getContacts();
        AdressListAdapter adapter=new AdressListAdapter(contacts);

        setListAdapter(adapter);
    }
    public class AdressListAdapter extends ArrayAdapter<Contact> {


        public AdressListAdapter(ArrayList<Contact> contacts) {
            super(getActivity(), R.layout.list_item, contacts);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            if(convertView==null){

               LayoutInflater inflater=(LayoutInflater)getActivity().getLayoutInflater();
               convertView =inflater.inflate(R.layout.list_item,null);

            }
            Contact currentContact=getItem(position);

            TextView txtName=(TextView)convertView.findViewById(R.id.txt_name);
            txtName.setText(currentContact.getName()+" "+currentContact.getSurNames());
            return convertView;

        }
    }

}




