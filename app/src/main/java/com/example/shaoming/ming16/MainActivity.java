package com.example.shaoming.ming16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class MainActivity extends AppCompatActivity {
    //BottomNavigation實作練習
    //在Gradle Scripot > build gradle 加入compile 'com.aurelhubert:ahbottomnavigation:1.2.3'
    //參考網址:https://github.com/aurelhubert/ahbottomnavigation
    AHBottomNavigation ahBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ahBottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);

        //Create items

        AHBottomNavigationItem item1 = new AHBottomNavigationItem("Home", R.drawable.home);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem("Camera", R.drawable.camera);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem("Picture", R.drawable.picture);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem("Calendar", R.drawable.calendar);
        AHBottomNavigationItem item5 = new AHBottomNavigationItem("Settings", R.drawable.settings);


        // Add items
        // 加入

        ahBottomNavigation.addItem(item1);
        ahBottomNavigation.addItem(item2);
        ahBottomNavigation.addItem(item3);
        ahBottomNavigation.addItem(item4);
        ahBottomNavigation.addItem(item5);


        // Set current item programmatically
        //設定它目前在第幾個

        ahBottomNavigation.setCurrentItem(1);
    }
}
