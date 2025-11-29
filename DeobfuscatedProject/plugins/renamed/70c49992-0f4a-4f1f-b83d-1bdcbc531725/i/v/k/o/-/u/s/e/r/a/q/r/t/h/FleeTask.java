/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f_Unknown;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

/* TASK: Flee -> FleeTask */
@TaskDesc(name="Flee", priority=108, register=true)
public class FleeTask
extends w_Unknown {
    public static final /* synthetic */ int ci;
    private static /* synthetic */ int[] lIlIllIIIIlIl;
    private static /* synthetic */ String[] lIlIllIIIIlII;
    public static final /* synthetic */ int cj;
    private /* synthetic */ int ck;

    private boolean Y() {
        int n2 = this.cf.getBoostedSkillLevel(Skill.PRAYER);
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlIl(n2, lIlIllIIIIlIl[6])) {
            return lIlIllIIIIlIl[0];
        }
        return Inventory.contains(item -> item.getName().startsWith(lIlIllIIIIlII[lIlIllIIIIlIl[9]]));
    }

    static {
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIlI();
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIIl();
        cj = lIlIllIIIIlIl[5];
        ci = lIlIllIIIIlIl[7];
    }

    private boolean Z() {
        int n2;
        x var18;
        int n3;
        int n4 = lIlIllIIIIlIl[7];
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0)) {
            n3 = lIlIllIIIIlIl[6];
            0;
            if (((0x73 ^ 0x54) & ~(0x37 ^ 0x10)) != 0) {
                return false;
            }
        } else {
            n3 = lIlIllIIIIlIl[1];
        }
        int var16 = n4 + n3;
        String var8 = lIlIllIIIIlII[lIlIllIIIIlIl[8]];
        if (!i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlII(var18.X() ? 1 : 0) || !i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0) || !i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlll(Combat.getCurrentHealth(), var16) || i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIll(Inventory.contains(item -> item.getName().startsWith(var8)) ? 1 : 0)) {
            n2 = lIlIllIIIIlIl[0];
            0;
            if (1 > 2) {
                return ((123 + 17 - 85 + 72 ^ (0xC ^ 0x74)) & (0xA2 ^ 0xC3 ^ (0x63 ^ 5) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIllIIIIlIl[1];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIIIIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIIIIIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static String llIIIIIIIIIllll(String var17, String var7) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var22 = var7.toCharArray();
        int var5 = lIlIllIIIIlIl[1];
        char[] var11 = var17.toCharArray();
        int var15 = var11.length;
        int var14 = lIlIllIIIIlIl[1];
        while (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIllIIl(var14, var15)) {
            char var3 = var11[var14];
            var10.append((char)(var3 ^ var22[var5 % var22.length]));
            0;
            ++var5;
            ++var14;
            0;
            if (-1 <= ((0x99 ^ 0xC1) & ~(0xE9 ^ 0xB1))) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static String llIIIIIIIIIlllI(String var2, String var1) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var27 = Cipher.getInstance("Blowfish");
            var27.init(lIlIllIIIIlIl[3], var24);
            return new String(var27.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private boolean X() {
        boolean bl;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlIl(Combat.getCurrentHealth(), this.ce.eatAtHP())) {
            return lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIllI(Inventory.getCount((boolean)lIlIllIIIIlIl[0], item -> {
            String[] stringArray = new String[lIlIllIIIIlIl[0]];
            stringArray[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[1]] = lIlIllIIIIlII[lIlIllIIIIlIl[10]];
            return item.hasAction(stringArray);
        }))) {
            bl = lIlIllIIIIlIl[0];
            0;
            if (-1 > (0xD4 ^ 0xA9 ^ (0x3A ^ 0x43))) {
                return ((0x1F ^ 0x3B ^ (0xC5 ^ 0xB3)) & (0x46 ^ 8 ^ (0x42 ^ 0x5E) ^ -1)) != 0;
            }
        } else {
            bl = lIlIllIIIIlIl[1];
        }
        return bl;
    }

    private static void llIIIIIIIIlIIlI() {
        lIlIllIIIIlIl = new int[12];
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[0] = 1;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[1] = (0x4B ^ 0x16) & ~(0x16 ^ 0x4B);
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[2] = 0xFFFFF76F & 0x3BDC;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[3] = 2;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[4] = 3;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[5] = 0x1E ^ 0x1A;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[6] = 0x52 ^ 0x34 ^ (0x44 ^ 0x28);
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[7] = 0x34 ^ 0x14;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[8] = 148 + 146 - 272 + 131 ^ 15 + 147 - 125 + 119;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[9] = 0xC1 ^ 0xC7;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[10] = 0xA ^ 0xD;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[11] = 97 + 71 - 44 + 40 ^ 97 + 67 - 71 + 79;
    }

    private boolean aa() {
        int n2;
        int var25;
        int n3;
        int var13;
        int n4;
        x var19;
        int n5;
        int n6 = lIlIllIIIIlIl[7];
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0)) {
            n5 = lIlIllIIIIlIl[6];
            0;
            if (-3 >= 0) {
                return false;
            }
        } else {
            n5 = lIlIllIIIIlIl[1];
        }
        int llllllllllllllIllIlIIlllIllllIll = n6 + n5;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlll(var19.cf.getBoostedSkillLevel(Skill.HITPOINTS), lIlIllIIIIlIl[7])) {
            n4 = lIlIllIIIIlIl[0];
            0;
            if ((7 ^ 2 ^ (0x2F ^ 0x24) & ~(0x6F ^ 0x64)) == 0) {
                return ((0xC7 ^ 0xA5 ^ (0xF1 ^ 0xC7)) & (56 + 148 - 4 + 7 ^ 93 + 153 - 234 + 143 ^ -1)) != 0;
            }
        } else {
            n4 = var13 = lIlIllIIIIlIl[1];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlIl(var19.cf.getTickCount() - var19.cg.F(), lIlIllIIIIlIl[5])) {
            n3 = lIlIllIIIIlIl[0];
            0;
            if (2 < 1) {
                return false;
            }
        } else {
            n3 = var25 = lIlIllIIIIlIl[1];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIll(var13) && i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlII(var25) && i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIll(var19.ab() ? 1 : 0)) {
            n2 = lIlIllIIIIlIl[0];
            0;
            if (-1 >= 1) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            n2 = lIlIllIIIIlIl[1];
        }
        return n2 != 0;
    }

    @Inject
    protected x(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean llIIIIIIIIlIIll(int n2) {
        return n2 != 0;
    }

    private boolean ab() {
        boolean bl;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlIl(this.cf.getTickCount() - this.ck, lIlIllIIIIlIl[8])) {
            bl = lIlIllIIIIlIl[0];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            bl = lIlIllIIIIlIl[1];
        }
        return bl;
    }

    private static void W() {
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIll(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            TeleportLoader.enterHouse();
            0;
            0;
            if (3 != 3) {
                return;
            }
        } else {
            int[] nArray = new int[lIlIllIIIIlIl[0]];
            nArray[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[1]] = lIlIllIIIIlIl[2];
            if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIllIIIIlIl[0]];
                nArray2[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[1]] = lIlIllIIIIlIl[2];
                Inventory.getFirst((int[])nArray2).interact(lIlIllIIIIlII[lIlIllIIIIlIl[1]]);
            }
        }
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIllIII(hitsplatApplied.getActor(), Players.getLocal())) {
            this.ck = this.cf.getTickCount();
        }
    }

    private static void llIIIIIIIIlIIIl() {
        lIlIllIIIIlII = new String[lIlIllIIIIlIl[11]];
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[1]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask."Teleport";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[0]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask."Fleeing since we don't have food that we need";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[3]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask."Fleeing since we need prayer and don't have any";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[4]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask."Fleeing since we need a venom cure";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[5]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask."Fleeing since we can be killed currently";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[8]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask."anti";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[9]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask."Prayer pot";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.lIlIllIIIIlIl[10]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask."Eat";
    }

    private static boolean llIIIIIIIIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIIIIIIIIlIIII(String var21, String var20) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIlIllIIIIlIl[11]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIlIllIIIIlIl[3], var9);
            return new String(var6.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean Q() {
        x var23;
        int var4;
        int n2 = lIlIllIIIIlIl[1];
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlII(this.X() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[0]]);
            var4 = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlII(var23.Y() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[3]]);
            var4 = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlII(var23.Z() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[4]]);
            var4 = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIIll(var23.aa() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[5]]);
            var4 = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.llIIIIIIIIlIlII(var4)) {
            return lIlIllIIIIlIl[1];
        }
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.FleeTask.W();
        this.x.a(lIlIllIIIIlIl[0]);
        return lIlIllIIIIlIl[0];
    }

    private static boolean llIIIIIIIIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

