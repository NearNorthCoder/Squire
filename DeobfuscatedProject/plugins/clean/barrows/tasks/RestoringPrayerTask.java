/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.barrows.tasks.GameEnum20;

@TaskDesc(name="Restoring prayer", priority=133337)
public class RestoringPrayerTask
extends Task {
    
    private final  SquireBarrows Q;

    private static boolean lIllIIlIllllll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (m.lIllIIlIlllIlI(this.Q.h() ? 1 : 0)) {
            return llllIIIIIlI[0];
        }
        if (m.lIllIIlIlllIll(Prayers.getPoints())) {
            return llllIIIIIlI[0];
        }
        Item var1 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIIIIIlI[2]];
            stringArray[m.llllIIIIIlI[0]] = llllIIIIIIl[llllIIIIIlI[2]];
            if (m.lIllIIlIlllllI(item.hasAction(stringArray) ? 1 : 0) && (!m.lIllIIlIlllIlI(item.getName().toLowerCase().contains(llllIIIIIIl[llllIIIIIlI[3]]) ? 1 : 0) || m.lIllIIlIlllllI(item.getName().toLowerCase().contains(llllIIIIIIl[llllIIIIIlI[4]]) ? 1 : 0))) {
                n2 = llllIIIIIlI[2];

                if (((0xEC ^ 0xC4) & ~(0x3D ^ 0x15)) > 2) {
                    return false;
                }
            } else {
                n2 = llllIIIIIlI[0];
            }
            return n2 != 0;
        });
        if (m.lIllIIlIllllII(var1)) {
            return llllIIIIIlI[0];
        }
        NPC var2 = NPCs.getNearest(d::a);
        if (!m.lIllIIlIllllIl(var2) || m.lIllIIlIlllllI(var2.isDead() ? 1 : 0)) {
            return llllIIIIIlI[0];
        }
        var1_1.interact(llllIIIIIIl[llllIIIIIlI[0]]);
        this.sleep(llllIIIIIlI[1]);
        return llllIIIIIlI[2];
    }

    static {
        m.lIllIIlIlllIIl();
        m.lIllIIlIllIlll();
    }

    private static boolean lIllIIlIlllIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIlIlllllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public RestoringPrayerTask(SquireBarrows squireBarrows) {
        this.Q = squireBarrows;
    }

        return String.valueOf(var3);
    }

    private static boolean lIllIIlIllllIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIllllII(Object object) {
        return object == null;
    }

    private static void lIllIIlIllIlll() {
        llllIIIIIIl = new String[llllIIIIIlI[1]];
        m.llllIIIIIIl[m.llllIIIIIlI[0]] = "Drink";
        m.llllIIIIIIl[m.llllIIIIIlI[2]] = "Drink";
        m.llllIIIIIIl[m.llllIIIIIlI[3]] = "prayer";
        m.llllIIIIIIl[m.llllIIIIIlI[4]] = "restore";
    }

    private static boolean lIllIIlIlllIlI(int n2) {
        return n2 == 0;
    }
}

