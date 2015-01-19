package com.navigationdrawer;


import java.util.ArrayList;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;


public class MainActivity extends Activity  {

	private DrawerLayout drawerLayout;
	private ListView listView;
	ArrayList<String> socialName;
	private ActionBarDrawerToggle drawerListener;	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        socialName=new ArrayList<String>();
        socialName.add("Apple");
        socialName.add("Blogger");
        socialName.add("Delicious");
        socialName.add("DeviantART");
        socialName.add("Digg");
        socialName.add("Dribbble");
        socialName.add("Evernote");
        socialName.add("Facebook");
        socialName.add("Flickr");
        socialName.add("Forrst");
        socialName.add("GoogleBuzz");
        socialName.add("Google");
        socialName.add("Last.FM");
        socialName.add("LinkedIn");
        socialName.add("Mixx");
        socialName.add("MobileMe");
        socialName.add("MySpace");
        socialName.add("Netvibes");
        socialName.add("Picasa");
        socialName.add("Readernaut");
        socialName.add("Reddit");
        socialName.add("RSS");
        
        drawerLayout=(DrawerLayout) findViewById(R.id.drawerLayout);
      //  planets=getResources().getStringArray(R.array.planets);
        listView=(ListView) findViewById(R.id.drawerList);
        
        CustomAdapter adapter = new CustomAdapter(this,socialName);
        listView.setAdapter(adapter);
        
        //listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,planets));
        //drawerListener=new ActionBarDrawerToggle(this, drawerLayout, R.drawable.ic_launcher, openDrawerContentDescRes, closeDrawerContentDescRes)
     
        drawerListener=new ActionBarDrawerToggle(this, drawerLayout, R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close)
        
        {
        	
        	@Override
        	public void onDrawerClosed(View drawerView) {
        		// TODO Auto-generated method stub
        		super.onDrawerClosed(drawerView);
        	}
        	
        	@Override
        	public void onDrawerOpened(View drawerView) {
        		// TODO Auto-generated method stub
        		super.onDrawerOpened(drawerView);
        	}
        	
        	
        };
        
        drawerLayout.setDrawerListener(drawerListener);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        
        
        listView.setOnItemClickListener(new OnItemClickListener() {
		
        	@Override
        	public void onItemClick(AdapterView<?> arg0, View arg1, int position,
        			long arg3) {
        		// TODO Auto-generated method stub
        		
        		Toast.makeText(getApplicationContext(), socialName.get(position),Toast.LENGTH_LONG).show();
        		
        	}
        });
        
        
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	
    	if(drawerListener.onOptionsItemSelected(item))
    	{
    		return true;
    	}
    	
    	return super.onOptionsItemSelected(item);
    }
    
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
    	// TODO Auto-generated method stub
    	super.onConfigurationChanged(newConfig);
    	drawerListener.onConfigurationChanged(newConfig);
    }
    
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onPostCreate(savedInstanceState);
    	drawerListener.syncState();
    }


//	@Override
//	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
//		Toast.makeText(this, planets[position]+"was selected",Toast.LENGTH_LONG).show();
//		selectItem(position);
//	}


	public void selectItem(int position) {
		// TODO Auto-generated method stub
		listView.setItemChecked(position, true);
		setTitle(position);
	}
	


	





}
