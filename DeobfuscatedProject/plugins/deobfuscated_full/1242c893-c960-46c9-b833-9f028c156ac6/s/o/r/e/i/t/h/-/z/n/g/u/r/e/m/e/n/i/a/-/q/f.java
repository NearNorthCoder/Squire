/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
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
import gg.squire.client.util.Log;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
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
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

/* TASK: Drink Overload -> DrinkoverloadTask */
@TaskDesc(name="Drink Overload", priority=20, blocking=true)
public class f
extends Task {
    private static /* synthetic */ String[] lIIIlIIIlllll;
    private static /* synthetic */ int[] lIIIlIIlIIIII;
    private final /* synthetic */ Client N;
    private final /* synthetic */ SquireNightmareZone L;
    private final /* synthetic */ SquireNightmareZoneConfig M;

    private static void lIIllllIlIlllll() {
        lIIIlIIIlllll = new String[lIIIlIIlIIIII[5]];
        f.lIIIlIIIlllll[f.lIIIlIIlIIIII[0]] = f."Under 51 hp, not overloading";
        f.lIIIlIIIlllll[f.lIIIlIIlIIIII[3]] = f."Drink";
        f.lIIIlIIIlllll[f.lIIIlIIlIIIII[4]] = f."Overload (";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        f var7;
        if (f.lIIllllIllIIIIl(this.M.overload())) {
            return lIIIlIIlIIIII[0];
        }
        if (f.lIIllllIllIIIIl(var7.N.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIIIII[0];
        }
        int var3 = Static.getClient().getVarbitValue(lIIIlIIlIIIII[1]);
        if (f.lIIllllIllIIIlI(var3)) {
            return lIIIlIIlIIIII[0];
        }
        if (f.lIIllllIllIIIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIlIIlIIIII[2])) {
            Log.error((String)lIIIlIIIlllll[lIIIlIIlIIIII[0]]);
            return lIIIlIIlIIIII[0];
        }
        Item var8 = Inventory.getFirst(item -> item.getName().startsWith(lIIIlIIIlllll[lIIIlIIlIIIII[4]]));
        if (f.lIIllllIllIIlII(var8)) {
            return lIIIlIIlIIIII[0];
        }
        var2_2.interact(lIIIlIIIlllll[lIIIlIIlIIIII[3]]);
        return lIIIlIIlIIIII[3];
    }

    private static boolean lIIllllIllIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllllIllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllllIllIIIII() {
        lIIIlIIlIIIII = new int[7];
        f.lIIIlIIlIIIII[0] = (0xD6 ^ 0x9B) & ~(0x7C ^ 0x31);
        f.lIIIlIIlIIIII[1] = 0xFFFFDF7B & 0x2FF7;
        f.lIIIlIIlIIIII[2] = 0x9A ^ 0x96 ^ (0xA3 ^ 0x9C);
        f.lIIIlIIlIIIII[3] = 1;
        f.lIIIlIIlIIIII[4] = 2;
        f.lIIIlIIlIIIII[5] = 3;
        f.lIIIlIIlIIIII[6] = 0x65 ^ 0x3C ^ (0x3C ^ 0x6D);
    }

    private static boolean lIIllllIllIIIlI(int n2) {
        return n2 > 0;
    }

    @Inject
    public f(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.L = squireNightmareZone;
        this.M = squireNightmareZoneConfig;
        this.N = client;
    }

    static {
        f.lIIllllIllIIIII();
        f.lIIllllIlIlllll();
    }

    private static boolean lIIllllIllIIlII(Object object) {
        return object == null;
    }

    private static String lIIllllIlIllllI(String var2, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIIlIIlIIIII[6]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIIlIIlIIIII[4], var5);
            return new String(var6.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }
}

