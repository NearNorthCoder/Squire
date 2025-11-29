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
        f.lIIIlIIIlllll[f.lIIIlIIlIIIII[0]] = f.lIIllllIlIllllI("Ycc8vatvPTavRTQnVpdctnzY6yyBh78l6pkZDxDQHdA=", "XVjhz");
        f.lIIIlIIIlllll[f.lIIIlIIlIIIII[3]] = f.lIIllllIlIllllI("GXmDORw4ykI=", "MPRgq");
        f.lIIIlIIIlllll[f.lIIIlIIlIIIII[4]] = f.lIIllllIlIllllI("ABxi+sS13HyBnxFnBbHfog==", "VLqZC");
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        f lllllllllllllllIIIlIIIIIIlIllIll;
        if (f.lIIllllIllIIIIl(this.M.overload())) {
            return lIIIlIIlIIIII[0];
        }
        if (f.lIIllllIllIIIIl(lllllllllllllllIIIlIIIIIIlIllIll.N.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIIIII[0];
        }
        int lllllllllllllllIIIlIIIIIIlIllIlI = Static.getClient().getVarbitValue(lIIIlIIlIIIII[1]);
        if (f.lIIllllIllIIIlI(lllllllllllllllIIIlIIIIIIlIllIlI)) {
            return lIIIlIIlIIIII[0];
        }
        if (f.lIIllllIllIIIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIlIIlIIIII[2])) {
            Log.error((String)lIIIlIIIlllll[lIIIlIIlIIIII[0]]);
            return lIIIlIIlIIIII[0];
        }
        Item lllllllllllllllIIIlIIIIIIlIllIIl = Inventory.getFirst(item -> item.getName().startsWith(lIIIlIIIlllll[lIIIlIIlIIIII[4]]));
        if (f.lIIllllIllIIlII(lllllllllllllllIIIlIIIIIIlIllIIl)) {
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
        f.lIIIlIIlIIIII[3] = " ".length();
        f.lIIIlIIlIIIII[4] = "  ".length();
        f.lIIIlIIlIIIII[5] = "   ".length();
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

    private static String lIIllllIlIllllI(String lllllllllllllllIIIlIIIIIIlIlIIIl, String lllllllllllllllIIIlIIIIIIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIIIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIIIlIlIIII.getBytes(StandardCharsets.UTF_8)), lIIIlIIlIIIII[6]), "DES");
            Cipher lllllllllllllllIIIlIIIIIIlIlIIll = Cipher.getInstance("DES");
            lllllllllllllllIIIlIIIIIIlIlIIll.init(lIIIlIIlIIIII[4], lllllllllllllllIIIlIIIIIIlIlIlII);
            return new String(lllllllllllllllIIIlIIIIIIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlIIIIIIlIlIIlI) {
            lllllllllllllllIIIlIIIIIIlIlIIlI.printStackTrace();
            return null;
        }
    }
}

