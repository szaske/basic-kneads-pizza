package com.zaske.szaske.basic_kneads_pizza;

import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertTrue;

/**
 * Created by szaske on 9/4/17.
 */

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    // Had to alter my jUnit config to get this to work.
    // Run -> Edit Configurations -> Set working directory to $MODULE_DIR$ solved the problem.
    //
    @Test
    public void validateTextViewContent() {
        TextView appNameTextView = (TextView) activity.findViewById(R.id.appNameTextView);
        assertTrue("Basic Kneads Pizza".equals(appNameTextView.getText().toString()));
    }
}
