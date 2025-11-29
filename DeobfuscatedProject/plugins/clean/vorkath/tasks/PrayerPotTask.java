/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prayer pot", priority=110)
public class PrayerPotTask
extends VorkathTaskBase {

    static {
        H.llIIIIIIIIIlIII();
        H.llIIIIIIIIIIlll();
    }

    private static boolean llIIIIIIIIIlIlI(Object object) {
        return object != null;
    }

    private static boolean llIIIIIIIIIllII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected PrayerPotTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean llIIIIIIIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        if (H.llIIIIIIIIIlIIl(this.cf.getBoostedSkillLevel(Skill.PRAYER), lIlIllIIIIIll[0])) {
            return lIlIllIIIIIll[1];
        }
        int[] nArray = new int[lIlIllIIIIIll[2]];
        nArray[H.lIlIllIIIIIll[1]] = lIlIllIIIIIll[3];
        if (H.llIIIIIIIIIlIlI(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIIIIll[1];
        }
        Item var1 = Inventory.getFirst(item -> {
            int n2;
            if (!H.llIIIIIIIIIllII(item.getName().toLowerCase().contains(lIlIllIIIIIlI[lIlIllIIIIIll[2]]) ? 1 : 0) || H.llIIIIIIIIIllIl(item.getName().toLowerCase().contains(lIlIllIIIIIlI[lIlIllIIIIIll[4]]) ? 1 : 0)) {
                n2 = lIlIllIIIIIll[2];

                }
            } else {
                n2 = lIlIllIIIIIll[1];
            }
            return n2 != 0;
        });
        if (H.llIIIIIIIIIlIll(var1)) {
            return lIlIllIIIIIll[1];
        }
        var1_1.interact(lIlIllIIIIIlI[lIlIllIIIIIll[1]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIIIIll[2];
    }

    private static boolean llIIIIIIIIIllIl(int n2) {
        return n2 != 0;
    }

    private static void llIIIIIIIIIIlll() {
        lIlIllIIIIIlI = new String[lIlIllIIIIIll[5]];
        H.lIlIllIIIIIlI[H.lIlIllIIIIIll[1]] = "Drink";
        H.lIlIllIIIIIlI[H.lIlIllIIIIIll[2]] = "restore";
        H.lIlIllIIIIIlI[H.lIlIllIIIIIll[4]] = "prayer";
    }

    private static boolean llIIIIIIIIIlIll(Object object) {
        return object == null;
    }
}

