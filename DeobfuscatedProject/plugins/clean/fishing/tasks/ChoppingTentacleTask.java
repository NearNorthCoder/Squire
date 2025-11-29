/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Chopping Tentacle")
public class ChoppingTentacleTask
extends Task {
    
    private  int q;
    
    private static final  Logger o;
    private final  SquireFisherConfig p;

    private static boolean lllIlIlIllIllI(int n) {
        return n == 0;
    }

    private static boolean lllIlIlIlllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        a var1;
        if (a.lllIlIlIllIllI(this.p.fishingTrawler() ? 1 : 0)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIllIlll(var1.q)) {
            var1.q -= lIlllIlIIlll[1];
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIllIllI(Widgets.isVisible((Widget)Widgets.get((WidgetInfo)WidgetInfo.FISHING_TRAWLER_CONTRIBUTION)) ? 1 : 0)) {
            return lIlllIlIIlll[0];
        }
        String[] stringArray = new String[lIlllIlIIlll[1]];
        stringArray[a.lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[0]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIlllIlIIlll[1]];
        stringArray2[a.lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[1]];
        NPC var3 = NPCs.getNearest((String[])stringArray2);
        if (a.lllIlIlIlllIII(var2)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIlllIIl(var3)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIlllIlI(var3.getAnimation(), lIlllIlIIlll[2])) {
            return lIlllIlIIlll[0];
        }
        String[] stringArray3 = new String[lIlllIlIIlll[1]];
        stringArray3[a.lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[3]];
        if (a.lllIlIlIllIllI(var3.hasAction(stringArray3) ? 1 : 0)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIlllIlI(Players.getLocal().getAnimation(), lIlllIlIIlll[4])) {
            return lIlllIlIIlll[0];
        }
        var2_2.interact(lIlllIlIIllI[lIlllIlIIlll[5]]);
        return lIlllIlIIlll[1];
    }

    private static boolean lllIlIlIlllIlI(int n, int n2) {
        return n == n2;
    }

    private static boolean lllIlIlIlllIll(int n, int n2) {
        return n < n2;
    }

    static {
        a.lllIlIlIllIlIl();
        a.lllIlIlIllIlII();
        o = LoggerFactory.getLogger(ChoppingTentacleTask.class);
    }

    @Inject
    public ChoppingTentacleTask(SquireFisherConfig squireFisherConfig) {
        this.p = squireFisherConfig;
    }

    private static boolean lllIlIlIllIlll(int n) {
        return n >= 0;
    }

    private static void lllIlIlIllIlII() {
        lIlllIlIIllI = new String[lIlllIlIIlll[6]];
        a.lIlllIlIIllI[a.lIlllIlIIlll[0]] = "Murphy";
        a.lIlllIlIIllI[a.lIlllIlIIlll[1]] = "Enormous Tentacle";
        a.lIlllIlIIllI[a.lIlllIlIIlll[3]] = "Chop";
        a.lIlllIlIIllI[a.lIlllIlIIlll[5]] = "Chop";
    }

        return String.valueOf(var4);
    }

    private static boolean lllIlIlIlllIII(Object object) {
        return object != null;
    }
}

