/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Climbing Up Ladder")
public class ClimbingUpLadderTask
extends Task {
    private static final  Logger r;
    private final  SquireFisherConfig s;

    @Inject
    public ClimbingUpLadderTask(SquireFisherConfig squireFisherConfig) {
        this.s = squireFisherConfig;
    }

    private static boolean lllIllIIlIIlII(Object object) {
        return object == null;
    }

    public boolean run() {
        if (b.lllIllIIlIIIll(this.s.fishingTrawler() ? 1 : 0)) {
            return lIllllIIIIlI[0];
        }
        String[] stringArray = new String[lIllllIIIIlI[1]];
        stringArray[b.lIllllIIIIlI[0]] = lIllllIIIIIl[lIllllIIIIlI[0]];
        NPC var1 = NPCs.getNearest((String[])stringArray);
        if (b.lllIllIIlIIIll(Widgets.isVisible((Widget)Widgets.get((WidgetInfo)WidgetInfo.FISHING_TRAWLER_CONTRIBUTION)) ? 1 : 0)) {
            return lIllllIIIIlI[0];
        }
        if (b.lllIllIIlIIlII(var1)) {
            return lIllllIIIIlI[0];
        }
        int[] nArray = new int[lIllllIIIIlI[1]];
        nArray[b.lIllllIIIIlI[0]] = lIllllIIIIlI[2];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        tileObject.interact(lIllllIIIIIl[lIllllIIIIlI[1]]);
        return lIllllIIIIlI[1];
    }

    static {
        b.lllIllIIlIIIlI();
        b.lllIllIIlIIIIl();
        r = LoggerFactory.getLogger(ClimbingUpLadderTask.class);
    }

        return String.valueOf(var2);
    }

    private static void lllIllIIlIIIIl() {
        lIllllIIIIIl = new String[lIllllIIIIlI[3]];
        b.lIllllIIIIIl[b.lIllllIIIIlI[0]] = "Murphy";
        b.lIllllIIIIIl[b.lIllllIIIIlI[1]] = "Climb-up";
    }

    private static boolean lllIllIIlIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIllIIlIIIll(int n) {
        return n == 0;
    }
}

