package com.adt.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.adt.preferences.PDefaultValue;

/**
 * Shayan Rais (http://shanraisshan.com)
 * created on 1/4/2017
 */

public class AppVersionCode {

    /**
     * @return actual version code of apk
     */
    public static int getApkVersionCode(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException ignored) {
        }
        return PDefaultValue.VERSION_CODE;
    }
}
