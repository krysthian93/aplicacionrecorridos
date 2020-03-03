package tracking.com.trackingandroid.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

public class CommonUtils {

    public static void showSimpleToastMessages(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static Boolean isNetworkAvailable(Context context){
        try{
            ConnectivityManager cm =
                    (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
            return activeNetwork != null &&
                    activeNetwork.isConnectedOrConnecting();
        }catch (Exception e){
            Log.d("NETWORK", "isNetworkAvailable Error: ", e);
            return false;
        }
    }
}
