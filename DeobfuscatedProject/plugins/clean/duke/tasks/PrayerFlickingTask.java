/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class PrayerFlickingTask
extends Task {
    private final  SquireDukeSucellus aZ;
    
    private final  SquireDukeSucellusConfig ba;

    private static boolean lllIlIlIlIIllI(Object object) {
        return object == null;
    }

    public boolean run() {
        if (A.lllIlIlIlIIlIl(Prayers.getPoints())) {
            return lIlllIIIIIlI[0];
        }
        NPC var1 = NPCs.getNearest(nPC -> {
            int n2;
            if (A.lllIlIlIlIlIII(nPC.getName().equals(lIlllIIIIIII[lIlllIIIIIlI[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlllIIIIIlI[4]];
                stringArray[A.lIlllIIIIIlI[0]] = lIlllIIIIIII[lIlllIIIIIlI[3]];
                if (A.lllIlIlIlIlIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlllIIIIIlI[4];

                    if (3 > -1) return n2 != 0;
                    return (2 & (2 ^ -1)) != 0;
                }
            }
            n2 = lIlllIIIIIlI[0];
            return n2 != 0;
        });
        if (A.lllIlIlIlIIllI(var1)) {
            Prayers.disableAll();
            return lIlllIIIIIlI[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (A.lllIlIlIlIlIII(tileObject.getName().equals(lIlllIIIIIII[lIlllIIIIIlI[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlllIIIIIlI[4]];
                stringArray[A.lIlllIIIIIlI[0]] = lIlllIIIIIII[lIlllIIIIIlI[4]];
                if (A.lllIlIlIlIlIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlllIIIIIlI[4];

                    if (-1 <= 3) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlllIIIIIlI[0];
            return n2 != 0;
        });
        if (A.lllIlIlIlIIllI(var2)) {
            return lIlllIIIIIlI[0];
        }
        Prayers.flick(this.V());

        return lIlllIIIIIlI[0];
    }

    private static boolean lllIlIlIlIIlll(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public PrayerFlickingTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aZ = squireDukeSucellus;
        this.ba = squireDukeSucellusConfig;
    }

        return String.valueOf(var3);
    }

    private static boolean lllIlIlIlIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> V() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        if (A.lllIlIlIlIIlll(Static.getClient().getVarbitValue(lIlllIIIIIlI[1]), lIlllIIIIIlI[2])) {
            Prayer[] prayerArray = new Prayer[lIlllIIIIIlI[3]];
            prayerArray[A.lIlllIIIIIlI[0]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArray[A.lIlllIIIIIlI[4]] = Prayer.ULTIMATE_STRENGTH;
            prayerArray[A.lIlllIIIIIlI[5]] = Prayer.STEEL_SKIN;
            List<Prayer> list = Arrays.asList(prayerArray);
            arrayList.addAll(list);

            if ((0x59 ^ 0x5C) <= 0) {
                return null;
            }
        } else {
            void var4;
            var4.add(Prayer.PIETY);

        }
        arrayList.add(Prayer.PROTECT_FROM_MELEE);

        return arrayList;
    }

    private static boolean lllIlIlIlIIlIl(int n2) {
        return n2 <= 0;
    }

    private static void lllIlIlIIlllll() {
        lIlllIIIIIII = new String[lIlllIIIIIlI[6]];
        A.lIlllIIIIIII[A.lIlllIIIIIlI[0]] = "Gate";
        A.lIlllIIIIIII[A.lIlllIIIIIlI[4]] = "Quick-escape";
        A.lIlllIIIIIII[A.lIlllIIIIIlI[5]] = "Duke Sucellus";
        A.lIlllIIIIIII[A.lIlllIIIIIlI[3]] = "Attack";
    }

    static {
        A.lllIlIlIlIIlII();
        A.lllIlIlIIlllll();
    }

    private static boolean lllIlIlIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }
}

