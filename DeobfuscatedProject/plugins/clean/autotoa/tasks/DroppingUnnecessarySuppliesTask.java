/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum90;
import gg.squire.autotoa.tasks.GameEnum95;

@TaskDesc(name="Dropping unnecessary supplies", priority=10)
public class DroppingUnnecessarySuppliesTask
extends AutotoaTaskBase {

    private final  C cM;

    private static boolean lIlIIllIIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIIIIllI(int n2) {
        return n2 > 0;
    }

    @Inject
    protected DroppingUnnecessarySuppliesTask(Client client, C c2) {
        super(client);
        this.cM = c2;
    }

    private static boolean lIlIIllIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lIlIIllIIIIIlI(int n2) {
        return n2 <= 0;
    }

        return String.valueOf(var1);
    }

    private static void lIlIIlIlllllll() {
        llIlIIllIll = new String[llIlIIlllII[8]];
        aj.llIlIIllIll[aj.llIlIIlllII[0]] = "Drop";
        aj.llIlIIllIll[aj.llIlIIlllII[2]] = "Drop";
        aj.llIlIIllIll[aj.llIlIIlllII[1]] = "Drink";
        aj.llIlIIllIll[aj.llIlIIlllII[3]] = "Drop";
        aj.llIlIIllIll[aj.llIlIIlllII[4]] = "Drink";
        aj.llIlIIllIll[aj.llIlIIlllII[5]] = "Drop";
        aj.llIlIIllIll[aj.llIlIIlllII[6]] = "anti";
        aj.llIlIIllIll[aj.llIlIIlllII[7]] = "anti";
    }

    static {
        aj.lIlIIllIIIIIII();
        aj.lIlIIlIlllllll();
    }

    public boolean run() {
        aj var2;
        if (!aj.lIlIIllIIIIIIl(this.aq() ? 1 : 0) || aj.lIlIIllIIIIIlI(this.aX())) {
            return llIlIIlllII[0];
        }
        if (aj.lIlIIllIIIIIll(Inventory.getFreeSlots(), llIlIIlllII[1])) {
            return llIlIIlllII[0];
        }
        if (aj.lIlIIllIIIIIIl(Inventory.contains(item -> item.getName().toLowerCase().contains(llIlIIllIll[llIlIIlllII[7]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlIIllIll[llIlIIlllII[6]])).interact(llIlIIllIll[llIlIIlllII[0]]);
            return llIlIIlllII[2];
        }
        Item var3 = a.values();
        int llllllllllllllllIIllIlIllIllllll22 = ((a[])var3).length;
        int var4 = llIlIIlllII[0];
        while (aj.lIlIIllIIIIlII(var4, llllllllllllllllIIllIlIllIllllll22)) {
            a var5 = var3[var4];
            Item var6 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var5.l().toLowerCase()));
            if (aj.lIlIIllIIIIlIl(var6)) {
                var6.interact(llIlIIllIll[llIlIIlllII[2]]);
                return llIlIIlllII[2];
            }
            ++var4;

            if (((0xA6 ^ 0xBD) & ~(0x87 ^ 0x9C)) <= ((0x42 ^ 0x18) & ~(0x17 ^ 0x4D))) continue;
            return false;
        }
        var3 = Inventory.getFirst(item -> e.TEARS_OF_ELIDINIS.d(item.getId()));
        if (aj.lIlIIllIIIIllI(var2.cM.av().getOrDefault((Object)e.AMBROSIA, llIlIIlllII[0])) && aj.lIlIIllIIIIlIl(var3) && aj.lIlIIllIIIIIIl(var2.be() ? 1 : 0) && aj.lIlIIllIIIIlll(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
            String string;
            if (aj.lIlIIllIIIIlII(Prayers.getPoints(), Skills.getLevel((Skill)Skill.PRAYER))) {
                string = llIlIIllIll[llIlIIlllII[1]];

                if (((0x79 ^ 0x65 ^ (0xD ^ 0x71)) & (0x40 ^ 0x36 ^ (0x34 ^ 0x22) ^ -1)) >= 3) {
                    return false;
                }
            } else {
                string = llIlIIllIll[llIlIIlllII[3]];
            }
            var3.interact(string);
            var2.sleep(llIlIIlllII[4]);
            return llIlIIlllII[2];
        }
        Item llllllllllllllllIIllIlIllIllllll22 = Inventory.getFirst(item -> e.NECTAR.d(item.getId()));
        if (aj.lIlIIllIIIIllI(var2.cM.av().getOrDefault((Object)e.AMBROSIA, llIlIIlllII[0])) && aj.lIlIIllIIIIIIl(var2.be() ? 1 : 0) && aj.lIlIIllIIIIlll(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
            String string;
            if (aj.lIlIIllIIIlIII(llllllllllllllllIIllIlIllIllllll22)) {
                return llIlIIlllII[0];
            }
            if (aj.lIlIIllIIIIllI(Combat.getMissingHealth())) {
                string = llIlIIllIll[llIlIIlllII[4]];

                if (2 >= 3) {
                    return false;
                }
            } else {
                string = llIlIIllIll[llIlIIlllII[5]];
            }
            llllllllllllllllIIllIlIllIllllll22.interact(string);
            var2.sleep(llIlIIlllII[4]);
            return llIlIIlllII[2];
        }
        return llIlIIlllII[0];
    }

    private static boolean lIlIIllIIIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIllIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIIIIIIl(int n2) {
        return n2 != 0;
    }
}

