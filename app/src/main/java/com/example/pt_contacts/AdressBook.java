package com.example.pt_contacts;

import java.util.ArrayList;

public class AdressBook {

    private static AdressBook sharedInstance =new AdressBook();

    private ArrayList<Contact>mContacts;

    Contact c1=new Contact("Cristinita","Sabaterita","C/Murillo","Mi mujercita","971900180"
    ,"");
    Contact c2=new Contact("Lucía","Sabaterita","C/Murillo","Mi hijita","971900180"
            ,"");

    public static AdressBook getInstance (){

        return sharedInstance;
    }
    private AdressBook(){
        mContacts=new ArrayList<Contact>();
        mContacts.add(c1);
        mContacts.add(c2);

    }
    public ArrayList<Contact>getContacts(){
        return mContacts;
    }
}
