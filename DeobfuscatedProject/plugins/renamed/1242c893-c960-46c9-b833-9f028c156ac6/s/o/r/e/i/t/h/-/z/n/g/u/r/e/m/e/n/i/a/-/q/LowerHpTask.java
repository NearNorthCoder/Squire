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
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

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

/* TASK: Lower HP -> LowerhpTask */
@TaskDesc(name="Lower HP", priority=15, blocking=true)
public class LowerHpTask
extends Task {
    private static /* synthetic */ String[] lIIIlIIlllIII;
    private final /* synthetic */ SquireNightmareZoneConfig T;
    private final /* synthetic */ SquireNightmareZone S;
    private final /* synthetic */ Client U;
    private static /* synthetic */ int[] lIIIlIIlllIIl;

    private static boolean lIIlllllIllllll(Object object) {
        return object != null;
    }

    private static boolean lIIlllllIllllII(int n2) {
        return n2 != 0;
    }

    private static void lIIlllllIlllIII() {
        lIIIlIIlllIII = new String[lIIIlIIlllIIl[6]];
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[0]] = h."Locator orb";
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[1]] = h."Feel";
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[3]] = h."Dwarven rock cake";
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[5]] = h."Guzzle";
    }

    private static String lIIlllllIllIllI(String var3, String var16) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIIIlIIlllIIl[3], var8);
            return new String(var1.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
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
        h var9;
        if (h.lIIlllllIlllIlI(this.U.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlllIIl[0];
        }
        if (h.lIIlllllIlllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIlIIlllIIl[1])) {
            return lIIIlIIlllIIl[0];
        }
        int var10 = Static.getClient().getVarbitValue(lIIIlIIlllIIl[2]);
        if (h.lIIlllllIllllII(var9.T.overload()) && !h.lIIlllllIllllIl(var10, lIIIlIIlllIIl[3]) || h.lIIlllllIlllllI(var10, lIIIlIIlllIIl[4])) {
            return lIIIlIIlllIIl[0];
        }
        String[] stringArray = new String[lIIIlIIlllIIl[1]];
        stringArray[h.lIIIlIIlllIIl[0]] = lIIIlIIlllIII[lIIIlIIlllIIl[0]];
        Item var2 = Inventory.getFirst((String[])stringArray);
        if (h.lIIlllllIllllll(var2)) {
            var2.interact(lIIIlIIlllIII[lIIIlIIlllIIl[1]]);
            return lIIIlIIlllIIl[1];
        }
        String[] stringArray2 = new String[lIIIlIIlllIIl[1]];
        stringArray2[h.lIIIlIIlllIIl[0]] = lIIIlIIlllIII[lIIIlIIlllIIl[3]];
        Item var13 = Inventory.getFirst((String[])stringArray2);
        if (h.lIIlllllIllllll(var13)) {
            var13.interact(lIIIlIIlllIII[lIIIlIIlllIIl[5]]);
            return lIIIlIIlllIIl[1];
        }
        return lIIIlIIlllIIl[0];
    }

    @Inject
    public h(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.S = squireNightmareZone;
        this.T = squireNightmareZoneConfig;
        this.U = client;
    }

    static {
        h.lIIlllllIlllIIl();
        h.lIIlllllIlllIII();
    }

    private static String lIIlllllIllIlll(String var4, String var11) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var17 = var11.toCharArray();
        int var14 = lIIIlIIlllIIl[0];
        char[] var18 = var4.toCharArray();
        int var12 = var18.length;
        int var5 = lIIIlIIlllIIl[0];
        while (h.lIIllllllIIIIII(var5, var12)) {
            char var6 = var18[var5];
            var15.append((char)(var6 ^ var17[var14 % var17.length]));
            0;
            ++var14;
            ++var5;
            0;
            if ((147 + 164 - 269 + 148 ^ 109 + 58 - 126 + 145) >= (0x4D ^ 0x4B ^ 2)) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void lIIlllllIlllIIl() {
        lIIIlIIlllIIl = new int[7];
        h.lIIIlIIlllIIl[0] = 2 & ~2;
        h.lIIIlIIlllIIl[1] = 1;
        h.lIIIlIIlllIIl[2] = -(0xFFFFF85F & 0x67A1) & (0xFFFFEF7B & 0x7FF7);
        h.lIIIlIIlllIIl[3] = 2;
        h.lIIIlIIlllIIl[4] = 91 + 36 - 109 + 135 ^ 41 + 135 - 156 + 118;
        h.lIIIlIIlllIIl[5] = 3;
        h.lIIIlIIlllIIl[6] = 0x7B ^ 0x7F;
    }
}

