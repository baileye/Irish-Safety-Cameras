package org.dgtug.irishsafetycameras;
 
//import android.app.Activity;
import com.google.android.maps.MapActivity;
//import com.google.android.maps.MapView;
import android.os.Bundle;

public class Main extends MapActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    /** Called when the activity is started (i.e. loaded by the user) */

    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }
}