package com.example.pt_contacts;

import java.io.Serializable;

public class Contact implements Serializable {

    private String mName;
    private String mSurNames;
    private String mAdress;
    private String mComents;
    private String mTelephone;
    private String mTelephone2;

    public Contact(String name,
                   String surnames,
                   String adress,
                   String coments,
                   String telephone,
                   String telephone2) {

        this.mName = name;
        this.mSurNames = surnames;
        this.mAdress = adress;
        this.mComents = coments;
        this.mTelephone = telephone;
        this.mTelephone2 = telephone2;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getSurNames() {
        return mSurNames;
    }

    public void setSurNames(String mSurNames) {
        this.mSurNames = mSurNames;
    }

    public String getAdress() {
        return mAdress;
    }

    public void setAdress(String mAdress) {
        this.mAdress = mAdress;
    }

    public String getComents() {
        return mComents;
    }

    public void setComents(String mComents) {
        this.mComents = mComents;
    }

    public String getTelephone() {
        return mTelephone;
    }

    public void setTelephone(String mTelephone) {
        this.mTelephone = mTelephone;
    }

    public String getTelephone2() {
        return mTelephone2;
    }

    public void setTelephone2(String mTelephone2) {
        this.mTelephone2 = mTelephone2;
    }
}
