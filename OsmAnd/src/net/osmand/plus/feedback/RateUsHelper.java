package net.osmand.plus.feedback;

import net.osmand.plus.OsmandApplication;
import net.osmand.plus.activities.MapActivity;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

public class RateUsHelper {
    public RateUsHelper() { }
    public void storeRateResult(FragmentActivity activity) { }
    public void updateState(@Nullable RateUsState state) { }
    public static boolean shouldShowRateDialog(OsmandApplication app) {
        return false;
    }
    public static void showRateDialog(MapActivity mapActivity) { }
}
