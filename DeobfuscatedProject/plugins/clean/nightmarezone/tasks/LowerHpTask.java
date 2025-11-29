/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Lower HP", priority=15, blocking=true)
public class LowerHpTask
extends Task {
    
    private final  SquireNightmareZoneConfig T;
    private final  SquireNightmareZone S;
    private final  Client U;

    private static boolean lIIlllllIllllll(Object object) {
        return object != null;
    }

    private static boolean lIIlllllIllllII(int n2) {
        return n2 != 0;
    }

    private static void lIIlllllIlllIII() {
        lIIIlIIlllIII = new String[lIIIlIIlllIIl[6]];
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[0]] = "Locator orb";
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[1]] = "Feel";
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[3]] = "Dwarven rock cake";
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[5]] = "Guzzle";
    }

    private static boolean lIIlllllIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllllIlllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllllllIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllllIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlllllIlllIlI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        h var1;
        if (h.lIIlllllIlllIlI(this.U.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlllIIl[0];
        }
        if (h.lIIlllllIlllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIlIIlllIIl[1])) {
            return lIIIlIIlllIIl[0];
        }
        int var2 = Static.getClient().getVarbitValue(lIIIlIIlllIIl[2]);
        if (h.lIIlllllIllllII(var1.T.overload()) && !h.lIIlllllIllllIl(var2, lIIIlIIlllIIl[3]) || h.lIIlllllIlllllI(var2, lIIIlIIlllIIl[4])) {
            return lIIIlIIlllIIl[0];
        }
        String[] stringArray = new String[lIIIlIIlllIIl[1]];
        stringArray[h.lIIIlIIlllIIl[0]] = lIIIlIIlllIII[lIIIlIIlllIIl[0]];
        Item var3 = Inventory.getFirst((String[])stringArray);
        if (h.lIIlllllIllllll(var3)) {
            var3.interact(lIIIlIIlllIII[lIIIlIIlllIIl[1]]);
            return lIIIlIIlllIIl[1];
        }
        String[] stringArray2 = new String[lIIIlIIlllIIl[1]];
        stringArray2[h.lIIIlIIlllIIl[0]] = lIIIlIIlllIII[lIIIlIIlllIIl[3]];
        Item var4 = Inventory.getFirst((String[])stringArray2);
        if (h.lIIlllllIllllll(var4)) {
            var4.interact(lIIIlIIlllIII[lIIIlIIlllIIl[5]]);
            return lIIIlIIlllIIl[1];
        }
        return lIIIlIIlllIIl[0];
    }

    @Inject
    public LowerHpTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.S = squireNightmareZone;
        this.T = squireNightmareZoneConfig;
        this.U = client;
    }

    static {
        h.lIIlllllIlllIIl();
        h.lIIlllllIlllIII();
    }

        return String.valueOf(var5);
    }

}

