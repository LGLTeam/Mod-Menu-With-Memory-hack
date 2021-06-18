package com.fuego.team;
import android.animation.*;
import android.app.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.widget.*;
import androtrainer.*;
import menu.mainmenu.*;

import menu.mainmenu.Menu;
import android.view.View.*;
import menu.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Main.start(this);
	
    }
}
