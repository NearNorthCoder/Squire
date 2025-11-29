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
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
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
import net.unethicalite.api.game.Combat;

/* TASK: wave 7 to 14 Task -> Wave7To14TaskTask */
@TaskDesc(name="wave 7 to 14 Task", priority=10)
public class Wave7To14Task
extends Task {
    private final /* synthetic */ SquireFightCavesConfig aH;
    private static /* synthetic */ String[] llIIlIIIlIll;
    private final /* synthetic */ n aI;
    private final /* synthetic */ f aG;
    private static /* synthetic */ int[] llIIlIIIllIl;

    private static boolean lllllIIIllIIll(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public s(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aG = f2;
        this.aH = squireFightCavesConfig;
        this.aI = n2;
    }

    public boolean run() {
        int n2 = f.p();
        if (!s.lllllIIIllIIIl(n2, llIIlIIIllIl[0]) || s.lllllIIIllIIlI(n2, llIIlIIIllIl[1])) {
            return llIIlIIIllIl[2];
        }
        SquireFightCavesPlugin.f = llIIlIIIllIl[3];
        if (s.lllllIIIllIIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        n.G();
        NPC var24 = NPCs.getNearest(nPC -> {
            int n2;
            NPC var5;
            if ((!s.lllllIIIlllIII(nPC.getId(), llIIlIIIllIl[14]) || s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[15])) && s.lllllIIIllIlIl(var5.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllIl[4]) && s.lllllIIIllIllI(var5.isDead() ? 1 : 0)) {
                n2 = llIIlIIIllIl[3];
                0;
                if (1 == (0x35 ^ 0x31)) {
                    return false;
                }
            } else {
                n2 = llIIlIIIllIl[2];
            }
            return n2 != 0;
        });
        NPC var2 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var12;
            if ((!s.lllllIIIlllIII(nPC.getId(), llIIlIIIllIl[12]) || s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[13])) && s.lllllIIIllIllI(var12.isDead() ? 1 : 0)) {
                bl = llIIlIIIllIl[3];
                0;
                if ((123 + 140 - 233 + 112 ^ 65 + 20 - 2 + 55) > (0x4C ^ 0x32 ^ (0xF4 ^ 0x8E))) {
                    return ((0x11 ^ 0x2C ^ (0xC9 ^ 0xC2)) & (0x4D ^ 0x1C ^ (9 ^ 0x6E) ^ -1)) != 0;
                }
            } else {
                bl = llIIlIIIllIl[2];
            }
            return bl;
        });
        NPC var4 = NPCs.getNearest(nPC -> {
            int n2;
            if (s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[11]) && s.lllllIIIllIllI(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIIIllIl[3];
                0;
                if ((0xC2 ^ 0xC6) > (0x4E ^ 0x4A)) {
                    return false;
                }
            } else {
                n2 = llIIlIIIllIl[2];
            }
            return n2 != 0;
        });
        NPC var18 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var13;
            if ((!s.lllllIIIlllIII(nPC.getId(), llIIlIIIllIl[9]) || s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[10])) && s.lllllIIIllIllI(var13.isDead() ? 1 : 0)) {
                bl = llIIlIIIllIl[3];
                0;
                if (3 < 3) {
                    return false;
                }
            } else {
                bl = llIIlIIIllIl[2];
            }
            return bl;
        });
        if (s.lllllIIIllIlII(var24) && s.lllllIIIllIlIl(var24.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllIl[4]) && (!s.lllllIIIllIlII(Players.getLocal().getInteracting()) || s.lllllIIIllIlII(Players.getLocal().getInteracting()) && s.lllllIIIllIIll(Players.getLocal().getInteracting().getName(), var24.getName())) && s.lllllIIIllIllI(var24.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[2]];
            var24.interact(llIIlIIIlIll[llIIlIIIllIl[3]]);
            return llIIlIIIllIl[2];
        }
        if (s.lllllIIIllIlII(var18) && s.lllllIIIllIlll(var24) && s.lllllIIIllIlll(Players.getLocal().getInteracting()) && s.lllllIIIllIllI(var18.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[5]];
            var18.interact(llIIlIIIlIll[llIIlIIIllIl[6]]);
            return llIIlIIIllIl[2];
        }
        if (s.lllllIIIllIlII(var4) && s.lllllIIIllIlll(var24) && (!s.lllllIIIllIlII(Players.getLocal().getInteracting()) || s.lllllIIIllIlII(Players.getLocal().getInteracting()) && s.lllllIIIllIIll(Players.getLocal().getInteracting().getName(), var4.getName())) && s.lllllIIIllIllI(var4.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[7]];
            var4.interact(llIIlIIIlIll[llIIlIIIllIl[8]]);
            return llIIlIIIllIl[2];
        }
        if (s.lllllIIIllIlII(var2) && s.lllllIIIllIlll(var24) && s.lllllIIIllIlll(Players.getLocal().getInteracting()) && s.lllllIIIllIllI(var2.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[4]];
            var2.interact(llIIlIIIlIll[llIIlIIIllIl[0]]);
            return llIIlIIIllIl[2];
        }
        return llIIlIIIllIl[2];
    }

    private static boolean lllllIIIllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllllIIIlllIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lllllIIIlIIIII(String var11, String var26) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var9 = var26.toCharArray();
        int var3 = llIIlIIIllIl[2];
        char[] var20 = var11.toCharArray();
        int var23 = var20.length;
        int var25 = llIIlIIIllIl[2];
        while (s.lllllIIIlllIlI(var25, var23)) {
            char var7 = var20[var25];
            var22.append((char)(var7 ^ var9[var3 % var9.length]));
            0;
            ++var3;
            ++var25;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static boolean lllllIIIllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllIIIlIIIIl(String var14, String var19) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llIIlIIIllIl[16]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(llIIlIIIllIl[5], var16);
            return new String(var21.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIllIlII(Object object) {
        return object != null;
    }

    static {
        s.lllllIIIlIllll();
        s.lllllIIIlIIIlI();
    }

    private static boolean lllllIIIllIlll(Object object) {
        return object == null;
    }

    private static void lllllIIIlIllll() {
        llIIlIIIllIl = new int[17];
        s.llIIlIIIllIl[0] = 0xDB ^ 0xAD ^ (0xD ^ 0x7C);
        s.llIIlIIIllIl[1] = 0x35 ^ 0x3B;
        s.llIIlIIIllIl[2] = (0x71 ^ 0x47) & ~(0xBF ^ 0x89);
        s.llIIlIIIllIl[3] = 1;
        s.llIIlIIIllIl[4] = 123 + 110 - 69 + 21 ^ 94 + 164 - 248 + 181;
        s.llIIlIIIllIl[5] = 2;
        s.llIIlIIIllIl[6] = 3;
        s.llIIlIIIllIl[7] = 154 + 17 - 36 + 38 ^ 126 + 57 - 43 + 29;
        s.llIIlIIIllIl[8] = 0x52 ^ 0x57;
        s.llIIlIIIllIl[9] = -(0xFFFFCADF & 0x75A1) & (0xFFFFFCB7 & 0x4FF9);
        s.llIIlIIIllIl[10] = 0xFFFFDFFB & 0x2C36;
        s.llIIlIIIllIl[11] = 0xFFFF8EB4 & 0x7D7B;
        s.llIIlIIIllIl[12] = -(0xFFFFF003 & 0x2FFE) & (0xFFFFFDBF & 0x2E6F);
        s.llIIlIIIllIl[13] = 0xFFFF9CAF & 0x6F7F;
        s.llIIlIIIllIl[14] = 0xFFFFAEFE & 0x5D2D;
        s.llIIlIIIllIl[15] = -(0xFFFFE3D5 & 0x3D3B) & (0xFFFFADBD & 0x7F7F);
        s.llIIlIIIllIl[16] = 173 + 60 - 230 + 199 ^ 141 + 0 - 45 + 98;
    }

    private static boolean lllllIIIlllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllllIIIlIIIlI() {
        llIIlIIIlIll = new String[llIIlIIIllIl[16]];
        s.llIIlIIIlIll[s.llIIlIIIllIl[2]] = s."Attacking bird";
        s.llIIlIIIlIll[s.llIIlIIIllIl[3]] = s."Attack";
        s.llIIlIIIlIll[s.llIIlIIIllIl[5]] = s."Attack ranger";
        s.llIIlIIIlIll[s.llIIlIIIllIl[6]] = s."Attack";
        s.llIIlIIIlIll[s.llIIlIIIllIl[7]] = s."Attacking small blob";
        s.llIIlIIIlIll[s.llIIlIIIllIl[8]] = s."Attack";
        s.llIIlIIIlIll[s.llIIlIIIllIl[4]] = s."Attacking big blob";
        s.llIIlIIIlIll[s.llIIlIIIllIl[0]] = s."Attack";
    }

    private static boolean lllllIIIllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllllIIIIlllll(String var1, String var6) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(llIIlIIIllIl[5], var10);
            return new String(var15.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }
}

