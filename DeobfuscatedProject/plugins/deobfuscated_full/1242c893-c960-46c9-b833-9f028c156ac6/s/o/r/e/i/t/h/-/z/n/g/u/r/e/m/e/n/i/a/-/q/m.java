/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
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
import net.unethicalite.api.game.Combat;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.a;

/* TASK: Using special attack -> UsingspecialattackTask */
@TaskDesc(name="Using special attack", priority=50)
public class m
extends Task {
    private /* synthetic */ a i;
    private static /* synthetic */ String[] lIIIlIIlIIlll;
    private final /* synthetic */ Client ak;
    private /* synthetic */ boolean f;
    private final /* synthetic */ SquireNightmareZone ai;
    private final /* synthetic */ SquireNightmareZoneConfig aj;
    private static /* synthetic */ int[] lIIIlIIlIlIIl;

    static {
        m.lIIlllllIIIIIIl();
        m.lIIllllIlllllII();
    }

    private static void lIIllllIlllllII() {
        lIIIlIIlIIlll = new String[lIIIlIIlIlIIl[4]];
        m.lIIIlIIlIIlll[m.lIIIlIIlIlIIl[0]] = m."None";
        m.lIIIlIIlIIlll[m.lIIIlIIlIlIIl[1]] = m."No Spec Gear selected";
        m.lIIIlIIlIIlll[m.lIIIlIIlIlIIl[3]] = m."Using spec";
    }

    public boolean run() {
        m var20;
        if (m.lIIlllllIIIIIlI(this.aj.powerSurge() ? 1 : 0)) {
            return lIIIlIIlIlIIl[0];
        }
        if (m.lIIlllllIIIIIll(var20.aj.specGear().getSelected().equals(lIIIlIIlIIlll[lIIIlIIlIlIIl[0]]) ? 1 : 0)) {
            Log.error((String)lIIIlIIlIIlll[lIIIlIIlIlIIl[1]]);
            return lIIIlIIlIlIIl[0];
        }
        if (m.lIIlllllIIIIIlI(var20.ak.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIlIIl[0];
        }
        if (m.lIIlllllIIIIIlI(var20.ai.g() ? 1 : 0)) {
            return lIIIlIIlIlIIl[0];
        }
        if (m.lIIlllllIIIIIll(Combat.isSpecEnabled() ? 1 : 0)) {
            return lIIIlIIlIlIIl[0];
        }
        if (m.lIIlllllIIIIlII(Combat.getSpecEnergy(), lIIIlIIlIlIIl[2])) {
            return lIIIlIIlIlIIl[0];
        }
        Combat.toggleSpec();
        System.out.println(lIIIlIIlIIlll[lIIIlIIlIlIIl[3]]);
        return lIIIlIIlIlIIl[1];
    }

    private static String lIIllllIllllIlI(String var10, String var1) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIIIlIIlIlIIl[5]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIIlIIlIlIIl[3], var16);
            return new String(var15.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Inject
    public m(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.f = lIIIlIIlIlIIl[0];
        this.ai = squireNightmareZone;
        this.aj = squireNightmareZoneConfig;
        this.ak = client;
    }

    private static boolean lIIlllllIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllllIIIIIll(int n2) {
        return n2 != 0;
    }

    private static void lIIlllllIIIIIIl() {
        lIIIlIIlIlIIl = new int[6];
        m.lIIIlIIlIlIIl[0] = (0x63 ^ 0x26) & ~(0x27 ^ 0x62);
        m.lIIIlIIlIlIIl[1] = 1;
        m.lIIIlIIlIlIIl[2] = 83 + 127 - 168 + 107 ^ 147 + 114 - 203 + 111;
        m.lIIIlIIlIlIIl[3] = 2;
        m.lIIIlIIlIlIIl[4] = 3;
        m.lIIIlIIlIlIIl[5] = 34 + 161 - 182 + 163 ^ 102 + 25 - 0 + 57;
    }

    private static String lIIllllIllllIll(String var14, String var7) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIIIlIIlIlIIl[3], var13);
            return new String(var19.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String lIIllllIllllIIl(String var5, String var11) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var6 = var11.toCharArray();
        int var3 = lIIIlIIlIlIIl[0];
        char[] var4 = var5.toCharArray();
        int var8 = var4.length;
        int var17 = lIIIlIIlIlIIl[0];
        while (m.lIIlllllIIIIlII(var17, var8)) {
            char var2 = var4[var17];
            var9.append((char)(var2 ^ var6[var3 % var6.length]));
            0;
            ++var3;
            ++var17;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIIlllllIIIIlII(int n2, int n3) {
        return n2 < n3;
    }
}

