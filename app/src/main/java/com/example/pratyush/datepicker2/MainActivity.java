package com.example.pratyush.datepicker2;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void processDatePickerResult(int year, int month, int day){
        String month_string=Integer.toString(month+1);
        String day_string=Integer.toString(day);
        String year_string=Integer.toString(year);
        String dateMessage=(month_string+"/"+day_string+"/"+year_string);
        Toast.makeText(this,"Date "+dateMessage,Toast.LENGTH_SHORT).show();

    }
    public void showDatePickerDialog(View view){
        DatePickerFragment newFragment=new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }
    public void processTimePickerResult(int hourOfDay, int minute){
        String hour_string=Integer.toString(hourOfDay);
        String minute_string=Integer.toString(minute);
        String timeMessage=(hour_string+":"+minute_string);
        Toast.makeText(this,"Time is "+timeMessage,Toast.LENGTH_SHORT).show();
    }
    public void showTimePickerDialog(View view){
        TimePickerFragment newFragment=new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),"timepicker");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
//    public	void	onFavoritesClick(MenuItem item)	{
//        //	The	item	parameter	indicates	which	item	was	clicked.
//        //	Add	code	to	handle	the	Favorites	click.
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch	(item.getItemId())	{
//            case	R.id.action_order:
//                showOrder();
//                return	true;
//            case	R.id.action_status:
//                showStatus();
//                return	true;
//            case	R.id.action_contact:
//                showContact();
//                return	true;
//            default:
//                //	Do	nothing
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
