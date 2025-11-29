/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Claiming Rewards (Outside)", priority=0x7FFFFFFF, blocking=true)
public class ClaimingRewardsOutsideTask
extends AutotoaTaskBase {
    
    private static final  int hO;
    private static final  int hP;

    private static boolean lIlIIlIIIlIllI(int n2) {
        return n2 != 0;
    }

    static {
        cg.lIlIIlIIIlIIll();
        cg.lIlIIlIIIlIIlI();
        hO = llIlIIIIIlI[2];
        hP = llIlIIIIIlI[3];
    }

    @Override
    public boolean bl() {
        TileObject tileObject;
        block5: {
            block4: {
                String[] stringArray = new String[llIlIIIIIlI[0]];
                stringArray[cg.llIlIIIIIlI[1]] = llIlIIIIIIl[llIlIIIIIlI[1]];
                tileObject = TileObjects.getNearest((String[])stringArray);
                if (!cg.lIlIIlIIIlIlII(tileObject)) break block4;
                String[] stringArray2 = new String[llIlIIIIIlI[0]];
                stringArray2[cg.llIlIIIIIlI[1]] = llIlIIIIIIl[llIlIIIIIlI[0]];
                if (!cg.lIlIIlIIIlIlIl(tileObject.hasAction(stringArray2) ? 1 : 0)) break block5;
            }
            return llIlIIIIIlI[1];
        }
        Widget var1 = Widgets.get((int)llIlIIIIIlI[2], (int)llIlIIIIIlI[3]);
        if (cg.lIlIIlIIIlIllI(Widgets.isVisible((Widget)var1) ? 1 : 0)) {
            Log.info((String)llIlIIIIIIl[llIlIIIIIlI[4]]);
            var1.interact(llIlIIIIIIl[llIlIIIIIlI[5]]);
            return llIlIIIIIlI[0];
        }
        Log.info((String)llIlIIIIIIl[llIlIIIIIlI[3]]);
        tileObject.interact(llIlIIIIIIl[llIlIIIIIlI[6]]);
        return llIlIIIIIlI[0];
    }

    private static boolean lIlIIlIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }

    private static boolean lIlIIlIIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIIlIIIlIIlI() {
        llIlIIIIIIl = new String[llIlIIIIIlI[7]];
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[1]] = "Rewards Niche";
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[0]] = "Claim";
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[4]] = "[ClaimRewardsItems] Banking reward items...";
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[5]] = "Bank-all";
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[3]] = "[ClaimRewardsItems] Claiming reward items...";
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[6]] = "Claim";
    }

    @Inject
    protected ClaimingRewardsOutsideTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static boolean lIlIIlIIIlIlII(Object object) {
        return object != null;
    }
}

