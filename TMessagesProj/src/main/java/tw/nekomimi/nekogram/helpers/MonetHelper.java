package tw.nekomimi.nekogram.helpers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
<<<<<<< HEAD
import android.os.Build;
import android.os.PatternMatcher;

import androidx.annotation.RequiresApi;
=======
import android.graphics.Color;
import android.os.Build;
import android.os.PatternMatcher;
import android.util.SparseIntArray;

import androidx.annotation.RequiresApi;
import androidx.core.graphics.ColorUtils;
>>>>>>> upstream/dev

import com.google.android.exoplayer2.util.Log;

import org.telegram.messenger.ApplicationLoader;
<<<<<<< HEAD
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

import java.util.HashMap;

@RequiresApi(api = Build.VERSION_CODES.S)
public class MonetHelper {
    private static final HashMap<String, Integer> ids = new HashMap<>();
    private static final String ACTION_OVERLAY_CHANGED = "android.intent.action.OVERLAY_CHANGED";
    private static final OverlayChangeReceiver overlayChangeReceiver = new OverlayChangeReceiver();

    static {
        ids.put("a1_0", android.R.color.system_accent1_0);
        ids.put("a1_10", android.R.color.system_accent1_10);
        ids.put("a1_50", android.R.color.system_accent1_50);
        ids.put("a1_100", android.R.color.system_accent1_100);
        ids.put("a1_200", android.R.color.system_accent1_200);
        ids.put("a1_300", android.R.color.system_accent1_300);
        ids.put("a1_400", android.R.color.system_accent1_400);
        ids.put("a1_500", android.R.color.system_accent1_500);
        ids.put("a1_600", android.R.color.system_accent1_600);
        ids.put("a1_700", android.R.color.system_accent1_700);
        ids.put("a1_800", android.R.color.system_accent1_800);
        ids.put("a1_900", android.R.color.system_accent1_900);
        ids.put("a1_1000", android.R.color.system_accent1_1000);
        ids.put("a2_0", android.R.color.system_accent2_0);
        ids.put("a2_10", android.R.color.system_accent2_10);
        ids.put("a2_50", android.R.color.system_accent2_50);
        ids.put("a2_100", android.R.color.system_accent2_100);
        ids.put("a2_200", android.R.color.system_accent2_200);
        ids.put("a2_300", android.R.color.system_accent2_300);
        ids.put("a2_400", android.R.color.system_accent2_400);
        ids.put("a2_500", android.R.color.system_accent2_500);
        ids.put("a2_600", android.R.color.system_accent2_600);
        ids.put("a2_700", android.R.color.system_accent2_700);
        ids.put("a2_800", android.R.color.system_accent2_800);
        ids.put("a2_900", android.R.color.system_accent2_900);
        ids.put("a2_1000", android.R.color.system_accent2_1000);
        ids.put("a3_0", android.R.color.system_accent3_0);
        ids.put("a3_10", android.R.color.system_accent3_10);
        ids.put("a3_50", android.R.color.system_accent3_50);
        ids.put("a3_100", android.R.color.system_accent3_100);
        ids.put("a3_200", android.R.color.system_accent3_200);
        ids.put("a3_300", android.R.color.system_accent3_300);
        ids.put("a3_400", android.R.color.system_accent3_400);
        ids.put("a3_500", android.R.color.system_accent3_500);
        ids.put("a3_600", android.R.color.system_accent3_600);
        ids.put("a3_700", android.R.color.system_accent3_700);
        ids.put("a3_800", android.R.color.system_accent3_800);
        ids.put("a3_900", android.R.color.system_accent3_900);
        ids.put("a3_1000", android.R.color.system_accent3_1000);
        ids.put("n1_0", android.R.color.system_neutral1_0);
        ids.put("n1_10", android.R.color.system_neutral1_10);
        ids.put("n1_50", android.R.color.system_neutral1_50);
        ids.put("n1_100", android.R.color.system_neutral1_100);
        ids.put("n1_200", android.R.color.system_neutral1_200);
        ids.put("n1_300", android.R.color.system_neutral1_300);
        ids.put("n1_400", android.R.color.system_neutral1_400);
        ids.put("n1_500", android.R.color.system_neutral1_500);
        ids.put("n1_600", android.R.color.system_neutral1_600);
        ids.put("n1_700", android.R.color.system_neutral1_700);
        ids.put("n1_800", android.R.color.system_neutral1_800);
        ids.put("n1_900", android.R.color.system_neutral1_900);
        ids.put("n1_1000", android.R.color.system_neutral1_1000);
        ids.put("n2_0", android.R.color.system_neutral2_0);
        ids.put("n2_10", android.R.color.system_neutral2_10);
        ids.put("n2_50", android.R.color.system_neutral2_50);
        ids.put("n2_100", android.R.color.system_neutral2_100);
        ids.put("n2_200", android.R.color.system_neutral2_200);
        ids.put("n2_300", android.R.color.system_neutral2_300);
        ids.put("n2_400", android.R.color.system_neutral2_400);
        ids.put("n2_500", android.R.color.system_neutral2_500);
        ids.put("n2_600", android.R.color.system_neutral2_600);
        ids.put("n2_700", android.R.color.system_neutral2_700);
        ids.put("n2_800", android.R.color.system_neutral2_800);
        ids.put("n2_900", android.R.color.system_neutral2_900);
        ids.put("n2_1000", android.R.color.system_neutral2_1000);
        ids.put("monetRedDark", R.color.monetRedDark);
        ids.put("monetRedLight", R.color.monetRedLight);
        ids.put("monetRedCall", R.color.monetRedCall);
        ids.put("monetGreenCall", R.color.monetGreenCall);
    }

=======
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

@RequiresApi(api = Build.VERSION_CODES.S)
public class MonetHelper {
    private static final SparseIntArray IDS = new SparseIntArray() {{
        put(1_1_0000, android.R.color.system_accent1_0);
        put(1_1_0010, android.R.color.system_accent1_10);
        put(1_1_0050, android.R.color.system_accent1_50);
        put(1_1_0100, android.R.color.system_accent1_100);
        put(1_1_0200, android.R.color.system_accent1_200);
        put(1_1_0300, android.R.color.system_accent1_300);
        put(1_1_0400, android.R.color.system_accent1_400);
        put(1_1_0500, android.R.color.system_accent1_500);
        put(1_1_0600, android.R.color.system_accent1_600);
        put(1_1_0700, android.R.color.system_accent1_700);
        put(1_1_0800, android.R.color.system_accent1_800);
        put(1_1_0900, android.R.color.system_accent1_900);
        put(1_1_1000, android.R.color.system_accent1_1000);
        put(1_2_0000, android.R.color.system_accent2_0);
        put(1_2_0010, android.R.color.system_accent2_10);
        put(1_2_0050, android.R.color.system_accent2_50);
        put(1_2_0100, android.R.color.system_accent2_100);
        put(1_2_0200, android.R.color.system_accent2_200);
        put(1_2_0300, android.R.color.system_accent2_300);
        put(1_2_0400, android.R.color.system_accent2_400);
        put(1_2_0500, android.R.color.system_accent2_500);
        put(1_2_0600, android.R.color.system_accent2_600);
        put(1_2_0700, android.R.color.system_accent2_700);
        put(1_2_0800, android.R.color.system_accent2_800);
        put(1_2_0900, android.R.color.system_accent2_900);
        put(1_2_1000, android.R.color.system_accent2_1000);
        put(1_3_0000, android.R.color.system_accent3_0);
        put(1_3_0010, android.R.color.system_accent3_10);
        put(1_3_0050, android.R.color.system_accent3_50);
        put(1_3_0100, android.R.color.system_accent3_100);
        put(1_3_0200, android.R.color.system_accent3_200);
        put(1_3_0300, android.R.color.system_accent3_300);
        put(1_3_0400, android.R.color.system_accent3_400);
        put(1_3_0500, android.R.color.system_accent3_500);
        put(1_3_0600, android.R.color.system_accent3_600);
        put(1_3_0700, android.R.color.system_accent3_700);
        put(1_3_0800, android.R.color.system_accent3_800);
        put(1_3_0900, android.R.color.system_accent3_900);
        put(1_3_1000, android.R.color.system_accent3_1000);
        put(2_1_0000, android.R.color.system_neutral1_0);
        put(2_1_0010, android.R.color.system_neutral1_10);
        put(2_1_0050, android.R.color.system_neutral1_50);
        put(2_1_0100, android.R.color.system_neutral1_100);
        put(2_1_0200, android.R.color.system_neutral1_200);
        put(2_1_0300, android.R.color.system_neutral1_300);
        put(2_1_0400, android.R.color.system_neutral1_400);
        put(2_1_0500, android.R.color.system_neutral1_500);
        put(2_1_0600, android.R.color.system_neutral1_600);
        put(2_1_0700, android.R.color.system_neutral1_700);
        put(2_1_0800, android.R.color.system_neutral1_800);
        put(2_1_0900, android.R.color.system_neutral1_900);
        put(2_1_1000, android.R.color.system_neutral1_1000);
        put(2_2_0000, android.R.color.system_neutral2_0);
        put(2_2_0010, android.R.color.system_neutral2_10);
        put(2_2_0050, android.R.color.system_neutral2_50);
        put(2_2_0100, android.R.color.system_neutral2_100);
        put(2_2_0200, android.R.color.system_neutral2_200);
        put(2_2_0300, android.R.color.system_neutral2_300);
        put(2_2_0400, android.R.color.system_neutral2_400);
        put(2_2_0500, android.R.color.system_neutral2_500);
        put(2_2_0600, android.R.color.system_neutral2_600);
        put(2_2_0700, android.R.color.system_neutral2_700);
        put(2_2_0800, android.R.color.system_neutral2_800);
        put(2_2_0900, android.R.color.system_neutral2_900);
        put(2_2_1000, android.R.color.system_neutral2_1000);
    }};
    private static final String ACTION_OVERLAY_CHANGED = "android.intent.action.OVERLAY_CHANGED";
    private static final OverlayChangeReceiver overlayChangeReceiver = new OverlayChangeReceiver();

>>>>>>> upstream/dev
    public static int getColor(String color) {
        return getColor(color, false);
    }

<<<<<<< HEAD
    public static int getColor(String color, boolean amoled) {
        try {
            //noinspection ConstantConditions
            int id = ids.getOrDefault(amoled && "n1_900".equals(color) ? "n1_1000" : color, 0);
            return ApplicationLoader.applicationContext.getColor(id);
        } catch (Exception e) {
            Log.e("Theme", "Error loading color " + color);
            e.printStackTrace();
            return 0;
        }
=======
    private static int adaptHue(int baseColor, int hueColor) {
        var hueoklch = OKLCH.rgb2oklch(OKLCH.rgb(hueColor));
        var oklch = OKLCH.rgb2oklch(OKLCH.rgb(baseColor));
        oklch[2] = hueoklch[2];
        if (Double.isNaN(hueoklch[2]) || hueoklch[1] < .08f) {
            oklch[1] = hueoklch[1];
        }
        return OKLCH.rgb(OKLCH.oklch2rgb(oklch));
    }

    public static int getColor(String rawColor, boolean amoled) {
        if (rawColor.length() < 4) {
            return 0;
        }
        var context = ApplicationLoader.applicationContext;
        if (rawColor.startsWith("monet")) {
            var primaryColor = context.getColor(android.R.color.system_accent1_400);
            if (rawColor.startsWith("monetRed")) {
                return adaptHue(primaryColor, Color.RED);
            } else {
                return adaptHue(primaryColor, Color.GREEN);
            }
        }
        var group = rawColor.charAt(0) == 'a' ? 1 : 2;
        var palette = Integer.parseInt(rawColor.substring(1, 2));
        var alphaStart = rawColor.indexOf("_", 3);
        int shade;
        int alpha;
        if (alphaStart > 0) {
            shade = Integer.parseInt(rawColor.substring(3, alphaStart));
            alpha = Integer.parseInt(rawColor.substring(alphaStart + 1));
        } else {
            shade = Integer.parseInt(rawColor.substring(3));
            alpha = -1;
        }
        if (amoled && group == 2 && palette == 1 && shade == 900) {
            shade = 1000;
        }
        var key = group * 1_0_0000 + palette * 1_0000 + shade;
        var id = IDS.get(key);
        if (id == 0) {
            return 0;
        }
        var color = context.getColor(id);
        if (alpha != -1) {
            color = ColorUtils.setAlphaComponent(color, alpha);
        }
        return color;
>>>>>>> upstream/dev
    }

    private static class OverlayChangeReceiver extends BroadcastReceiver {

        public void register(Context context) {
            IntentFilter packageFilter = new IntentFilter(ACTION_OVERLAY_CHANGED);
            packageFilter.addDataScheme("package");
            packageFilter.addDataSchemeSpecificPart("android", PatternMatcher.PATTERN_LITERAL);
            context.registerReceiver(this, packageFilter);
        }

        public void unregister(Context context) {
            context.unregisterReceiver(this);
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (ACTION_OVERLAY_CHANGED.equals(intent.getAction())) {
                if (Theme.getActiveTheme().isMonet()) {
<<<<<<< HEAD
                    Theme.applyTheme(Theme.getActiveTheme());
=======
                    Theme.applyTheme(Theme.getActiveTheme(), Theme.isCurrentThemeNight());
>>>>>>> upstream/dev
                }
            }
        }
    }

    public static void registerReceiver(Context context) {
        overlayChangeReceiver.register(context);
    }

    public static void unregisterReceiver(Context context) {
        overlayChangeReceiver.unregister(context);
    }
}