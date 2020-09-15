package com.baotu.demo.ui.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.baotu.demo.R;
import com.baotu.demo.base.BaseActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * author:liujie 2020-9-15
 * 作用：主页面
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //监听底部导航实现跳转
        BottomNavigationView navView = findViewById(R.id.nv_botttom);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.oneFragment, R.id.twoFragment, R.id.threeFragment, R.id.fourFragment)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.my_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);



    }

}