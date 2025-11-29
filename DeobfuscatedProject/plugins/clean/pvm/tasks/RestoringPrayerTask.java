/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.widgets.Prayers
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Restoring Prayer", priority=11, blocking=true)
public class RestoringPrayerTask
extends Task {
    private static final  Logger W;

    static {
        l.lIlIllIlllIlIIl();
        l.lIlIllIlllIlIII();
        W = LoggerFactory.getLogger(RestoringPrayerTask.class);
    }

    private static boolean lIlIllIlllIlIll(Object object) {
        return object == null;
    }

    private static boolean lIlIllIlllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (l.lIlIllIlllIlIlI(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            return lIIlIlllIllIl[0];
        }
        String[] stringArray = new String[lIIlIlllIllIl[3]];
        stringArray[l.lIIlIlllIllIl[0]] = lIIlIlllIIIII[lIIlIlllIllIl[0]];
        TileObject var1 = TileObjects.getFirstAt((WorldPoint)new WorldPoint(lIIlIlllIllIl[1], lIIlIlllIllIl[2], lIIlIlllIllIl[0]), (String[])stringArray);
        if (l.lIlIllIlllIlIll(var1)) {
            int[] nArray = new int[lIIlIlllIllIl[4]];
            nArray[l.lIIlIlllIllIl[0]] = lIIlIlllIllIl[5];
            nArray[l.lIIlIlllIllIl[3]] = lIIlIlllIllIl[6];
            nArray[l.lIIlIlllIllIl[7]] = lIIlIlllIllIl[8];
            var1 = TileObjects.getNearest((int[])nArray);
            if (l.lIlIllIlllIlIll(var1)) {
                return lIIlIlllIllIl[0];
            }
        }
        if (l.lIlIllIlllIllII(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            Prayers.toggleQuickPrayer((boolean)lIIlIlllIllIl[0]);
            return lIIlIlllIllIl[3];
        }
        String[] stringArray2 = new String[lIIlIlllIllIl[7]];
        stringArray2[l.lIIlIlllIllIl[0]] = lIIlIlllIIIII[lIIlIlllIllIl[3]];
        stringArray2[l.lIIlIlllIllIl[3]] = lIIlIlllIIIII[lIIlIlllIllIl[7]];
        var1_1.interact(stringArray2);
        return lIIlIlllIllIl[3];
    }

    private static boolean lIlIllIlllIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIlllIlIII() {
        lIIlIlllIIIII = new String[lIIlIlllIllIl[4]];
        l.lIIlIlllIIIII[l.lIIlIlllIllIl[0]] = "Altar";
        l.lIIlIlllIIIII[l.lIIlIlllIllIl[3]] = "Pray-at";
        l.lIIlIlllIIIII[l.lIIlIlllIllIl[7]] = "Drink";
    }

        return String.valueOf(var2);
    }

}

