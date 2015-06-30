package ibp.plugin.watch;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class WatchPlugin extends CordovaPlugin{
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        switch (action) {
        case "start":
            this.start(callbackContext);
            break;
        case "stop":
            stop(callbackContext);
            break;
        case "nextPage":
            this.nextPage(callbackContext);
            break;
        case "prevPage":
            this.prevPage(callbackContext);
            break;
        }
        return true;
    }

    private void prevPage(CallbackContext callbackContext) {
        // TODO Auto-generated method stub
        
    }

    private void nextPage(CallbackContext callbackContext) {
        // TODO Auto-generated method stub
        
    }

    private void stop(CallbackContext callbackContext) {
        // TODO Auto-generated method stub
        
    }

    private void start(CallbackContext callbackContext) {
        // TODO Auto-generated method stub
        
    }
    class MsgReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            //String message = intent.getStringExtra("message");
            Bundle bundle = intent.getExtras();
            Log.v("myTag", "Main activity received message");
            // Display message in UI
            if(bundle.containsKey("message"))
            {
                String s = bundle.getString("message");
                if(s.equals("0"))
                {
                    Log.e("Tag","The message is "+s);
//                    WebViewActivity.backPPT();
                }
                else if(s.equals("1"))
                {
//                    WebViewActivity.nextPPT();
                }
                else if(s.equals("2"))
                {
//                    WebViewActivity.stopPPT();
                }
            }
            

        }
    }
}
