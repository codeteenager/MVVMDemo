package com.codeteenager.mvvmdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by codeteenager on 2017/12/3.
 */

public class User extends BaseObservable {
    private String name;
    private String password;
    private String header;

    public User(String name, String password, String header) {
        this.name = name;
        this.password = password;
        this.header = header;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.codeteenager.mvvmdemo.BR.name);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(com.codeteenager.mvvmdemo.BR.password);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @BindingAdapter("bind:header")
    public static void getImageView(ImageView imageView, String url) {
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }
}
