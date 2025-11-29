/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f_Unknown;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

/* TASK: wave 1 to 6 Task -> Wave1To6TaskTask */
@TaskDesc(name="wave 1 to 6 Task", priority=10)
public class Wave1To6Task
extends Task {
    private static /* synthetic */ int[] llIIlIIIIlII;
    private static /* synthetic */ String[] llIIlIIIIIll;
    private final /* synthetic */ f aA;
    private final /* synthetic */ SquireFightCavesConfig aB;
    private final /* synthetic */ n aC;

    static {
        q.lllllIIIIIIIll();
        q.lllllIIIIIIIlI();
    }

    private static boolean lllllIIIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIIIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllIIIIIIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllllIIIIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public q(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aA = f2;
        this.aB = squireFightCavesConfig;
        this.aC = n2;
    }

    private static void lllllIIIIIIIlI() {
        llIIlIIIIIll = new String[llIIlIIIIlII[0]];
        q.llIIlIIIIIll[q.llIIlIIIIlII[1]] = q."Attacking bird";
        q.llIIlIIIIIll[q.llIIlIIIIlII[2]] = q."Attack";
        q.llIIlIIIIIll[q.llIIlIIIIlII[3]] = q."Attacking small blob";
        q.llIIlIIIIIll[q.llIIlIIIIlII[4]] = q."Attack";
        q.llIIlIIIIIll[q.llIIlIIIIlII[5]] = q."Attacking big blob";
        q.llIIlIIIIIll[q.llIIlIIIIlII[6]] = q."Attack";
    }

    private static String lllllIIIIIIIIl(String var2, String var16) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), llIIlIIIIlII[12]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(llIIlIIIIlII[3], var22);
            return new String(var15.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lllllIIIIIIIII(String var17, String var4) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var7 = var4.toCharArray();
        int var1 = llIIlIIIIlII[1];
        char[] var12 = var17.toCharArray();
        int var10 = var12.length;
        int var21 = llIIlIIIIlII[1];
        while (q.lllllIIIIIlIll(var21, var10)) {
            char var23 = var12[var21];
            var11.append((char)(var23 ^ var7[var1 % var7.length]));
            0;
            ++var1;
            ++var21;
            0;
            if ((0x6E ^ 0x15 ^ (0x25 ^ 0x5B)) > 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void lllllIIIIIIIll() {
        llIIlIIIIlII = new int[13];
        q.llIIlIIIIlII[0] = 0xA1 ^ 0xA7;
        q.llIIlIIIIlII[1] = (0x38 ^ 0x2C ^ (0x5D ^ 0x54)) & (0x7F ^ 0x62 ^ (0x65 ^ 0x4F) & ~(0x3D ^ 0x17) ^ -1) & ((0x25 ^ 3 ^ (0xA9 ^ 0x98)) & (0x51 ^ 0x24 ^ (0xE7 ^ 0x85) ^ -1) ^ -1);
        q.llIIlIIIIlII[2] = 1;
        q.llIIlIIIIlII[3] = 2;
        q.llIIlIIIIlII[4] = 3;
        q.llIIlIIIIlII[5] = 0x4E ^ 0x4A;
        q.llIIlIIIIlII[6] = 36 + 132 - 69 + 51 ^ 133 + 124 - 200 + 90;
        q.llIIlIIIIlII[7] = -(0xFFFFF3FF & 0x5E83) & (0xFFFFDEB7 & 0x7FFA);
        q.llIIlIIIIlII[8] = -(0xFFFF9DF2 & 0x63CF) & (0xFFFF9FFF & 0x6DEF);
        q.llIIlIIIIlII[9] = -(0xFFFFDFEF & 0x6251) & (0xFFFFEF6F & 0x5EFF);
        q.llIIlIIIIlII[10] = 0xFFFFEDBD & 0x1E6E;
        q.llIIlIIIIlII[11] = -(0xFFFFBB33 & 0x77DF) & (0xFFFFFF7F & 0x3FBF);
        q.llIIlIIIIlII[12] = 0x2B ^ 0x5E ^ (5 ^ 0x78);
    }

    private static boolean lllllIIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIIIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lllllIIIIIIllI(Object object) {
        return object != null;
    }

    public boolean run() {
        int n2 = f.p();
        if (!q.lllllIIIIIIlII(n2, llIIlIIIIlII[0]) || q.lllllIIIIIIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llIIlIIIIlII[1];
        }
        SquireFightCavesPlugin.f = llIIlIIIIlII[2];
        NPC var3 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var5;
            if ((!q.lllllIIIIIlIlI(nPC.getId(), llIIlIIIIlII[10]) || q.lllllIIIIIlIIl(nPC.getId(), llIIlIIIIlII[11])) && q.lllllIIIIIIlIl(var5.isDead() ? 1 : 0)) {
                bl = llIIlIIIIlII[2];
                0;
                
                }
            } else {
                bl = llIIlIIIIlII[1];
            }
            return bl;
        });
        NPC var9 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var19;
            if ((!q.lllllIIIIIlIlI(nPC.getId(), llIIlIIIIlII[8]) || q.lllllIIIIIlIIl(nPC.getId(), llIIlIIIIlII[9])) && q.lllllIIIIIIlIl(var19.isDead() ? 1 : 0)) {
                bl = llIIlIIIIlII[2];
                0;
                if (((0xF9 ^ 0xB4) & ~(0x2C ^ 0x61)) != 0) {
                    return false;
                }
            } else {
                bl = llIIlIIIIlII[1];
            }
            return bl;
        });
        NPC var8 = NPCs.getNearest(nPC -> {
            int n2;
            if (q.lllllIIIIIlIIl(nPC.getId(), llIIlIIIIlII[7]) && q.lllllIIIIIIlIl(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIIIIlII[2];
                0;
                if (2 == (0x42 ^ 0x4E ^ (0x59 ^ 0x51))) {
                    return ((87 + 132 - 160 + 187 ^ 65 + 84 - 110 + 124) & (0x8E ^ 0xC7 ^ (0x30 ^ 0x2C) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIIIIlII[1];
            }
            return n2 != 0;
        });
        if (q.lllllIIIIIIllI(var3) && (!q.lllllIIIIIIllI(Players.getLocal().getInteracting()) || q.lllllIIIIIIllI(Players.getLocal().getInteracting()) && q.lllllIIIIIIlll(Players.getLocal().getInteracting().getName(), var3.getName())) && q.lllllIIIIIIlIl(var3.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIll[llIIlIIIIlII[1]];
            var3.interact(llIIlIIIIIll[llIIlIIIIlII[2]]);
            return llIIlIIIIlII[1];
        }
        if (q.lllllIIIIIIllI(var8) && q.lllllIIIIIlIII(Players.getLocal().getInteracting()) && q.lllllIIIIIIlIl(var8.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIll[llIIlIIIIlII[3]];
            var8.interact(llIIlIIIIIll[llIIlIIIIlII[4]]);
            return llIIlIIIIlII[1];
        }
        if (q.lllllIIIIIIllI(var9) && q.lllllIIIIIlIII(Players.getLocal().getInteracting()) && q.lllllIIIIIIlIl(var9.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIll[llIIlIIIIlII[5]];
            var9.interact(llIIlIIIIIll[llIIlIIIIlII[6]]);
            return llIIlIIIIlII[1];
        }
        return llIIlIIIIlII[1];
    }

    private static String llllIlllllllll(String var18, String var13) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var24 = Cipher.getInstance("Blowfish");
            var24.init(llIIlIIIIlII[3], var20);
            return new String(var24.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIIIlIlI(int n2, int n3) {
        return n2 != n3;
    }
}

