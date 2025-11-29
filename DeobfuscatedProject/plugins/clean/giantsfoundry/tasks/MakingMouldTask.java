/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GameEnum19;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Making mould", priority=10)
public class MakingMouldTask
extends GiantsfoundryTaskBase {

    private static boolean lIIIIIlllIllllI(Object object) {
        return object == null;
    }

    private static boolean lIIIIIlllIlllll(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIlllIllIll() {
        llIlIllIlIII = new String[llIlIllIlIIl[8]];
        u.llIlIllIlIII[u.llIlIllIlIIl[0]] = "No mould jig found";
        u.llIlIllIlIII[u.llIlIllIlIIl[1]] = "Interacting with mould jig";
        u.llIlIllIlIII[u.llIlIllIlIIl[3]] = "Setup";
        u.llIlIllIlIII[u.llIlIllIlIIl[4]] = "Selecting FORTE mould";
        u.llIlIllIlIII[u.llIlIllIlIIl[5]] = "Selecting BLADE mould";
        u.llIlIllIlIII[u.llIlIllIlIIl[6]] = "Selecting TIP mould";
    }

    private boolean MakingMouldTask() {
        Widget widget = Widgets.get((int)llIlIllIlIIl[7], (int)llIlIllIlIIl[3]);
        return Widgets.isVisible((Widget)widget);
    }

    static {
        u.lIIIIIlllIlllII();
        u.lIIIIIlllIllIll();
    }

    @Inject
    public MakingMouldTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    @Override
    public boolean M() {
        u var1;
        if (u.lIIIIIlllIlllIl(this.T.g() ? 1 : 0)) {
            return llIlIllIlIIl[0];
        }
        int[] nArray = new int[llIlIllIlIIl[1]];
        nArray[u.llIlIllIlIIl[0]] = llIlIllIlIIl[2];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (u.lIIIIIlllIllllI(var2)) {
            Log.info((String)llIlIllIlIII[llIlIllIlIIl[0]]);
            return llIlIllIlIIl[0];
        }
        if (u.lIIIIIlllIlllll(var1.MakingMouldTask() ? 1 : 0)) {
            Log.info((String)llIlIllIlIII[llIlIllIlIIl[1]]);
            var2.interact(llIlIllIlIII[llIlIllIlIIl[3]]);
            return llIlIllIlIIl[1];
        }
        if (u.lIIIIIlllIlllll(Vars.getBit((int)f.FORTE.E()))) {
            Log.info((String)llIlIllIlIII[llIlIllIlIIl[4]]);
            if (u.lIIIIIlllIlllll(f.FORTE.B() ? 1 : 0)) {
                f.FORTE.C();
                return llIlIllIlIIl[1];
            }
            f.FORTE.D();
            return llIlIllIlIIl[1];
        }
        if (u.lIIIIIlllIlllll(Vars.getBit((int)f.BLADE.E()))) {
            Log.info((String)llIlIllIlIII[llIlIllIlIIl[5]]);
            if (u.lIIIIIlllIlllll(f.BLADE.B() ? 1 : 0)) {
                f.BLADE.C();
                return llIlIllIlIIl[1];
            }
            f.BLADE.D();
            return llIlIllIlIIl[1];
        }
        if (u.lIIIIIlllIlllll(Vars.getBit((int)f.TIP.E()))) {
            Log.info((String)llIlIllIlIII[llIlIllIlIIl[6]]);
            if (u.lIIIIIlllIlllll(f.TIP.B() ? 1 : 0)) {
                f.TIP.C();
                return llIlIllIlIIl[1];
            }
            f.TIP.D();
            return llIlIllIlIIl[1];
        }
        return llIlIllIlIIl[0];
    }

    private static boolean lIIIIIlllIlllIl(int n2) {
        return n2 != 0;
    }

}

