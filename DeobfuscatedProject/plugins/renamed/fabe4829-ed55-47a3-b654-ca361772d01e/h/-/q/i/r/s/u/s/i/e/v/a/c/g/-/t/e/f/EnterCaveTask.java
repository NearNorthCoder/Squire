/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

/* TASK: Enter cave Task -> EntercavetaskTask */
@TaskDesc(name="Enter cave Task", priority=10)
public class EnterCaveTask
extends Task {
    /* synthetic */ WorldArea R;
    private final /* synthetic */ SquireFightCavesConfig X;
    private static /* synthetic */ String[] llIIlIIIlIIl;
    private final /* synthetic */ f W;
    private static /* synthetic */ int[] llIIlIIIlIlI;
    /* synthetic */ WorldPoint Z;
    public static /* synthetic */ long aa;
    public static /* synthetic */ int ab;
    private final /* synthetic */ n Y;

    private static boolean lllllIIIIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lllllIIIIlIlll() {
        llIIlIIIlIlI = new int[14];
        j.llIIlIIIlIlI[0] = 0xFFFFFD4E & 0xBF7;
        j.llIIlIIIlIlI[1] = -(0xFFFFF9FA & 0x2FB7) & (0xFFFFBFBF & 0x7DF5);
        j.llIIlIIIlIlI[2] = (0xE1 ^ 0xC1) + (0x41 ^ 0x5C) - -(0x33 ^ 0x25) + (0x11 ^ 0x5C);
        j.llIIlIIIlIlI[3] = 0xDD ^ 0x96;
        j.llIIlIIIlIlI[4] = (91 + 54 - 125 + 108 ^ 104 + 23 - 79 + 109) & (1 ^ 0x5F ^ (0x39 ^ 0x7A) ^ -1);
        j.llIIlIIIlIlI[5] = 0xFFFF8D97 & 0x7BEF;
        j.llIIlIIIlIlI[6] = 0xFFFFB63B & 0x5DF5;
        j.llIIlIIIlIlI[7] = 1;
        j.llIIlIIIlIlI[8] = 2;
        j.llIIlIIIlIlI[9] = 3;
        j.llIIlIIIlIlI[10] = 0x1A ^ 0x1E;
        j.llIIlIIIlIlI[11] = 85 + 32 - 71 + 116 ^ 32 + 84 - -44 + 8;
        j.llIIlIIIlIlI[12] = 0x1B ^ 0x7B ^ (0x4F ^ 0x2A);
        j.llIIlIIIlIlI[13] = 0xC8 ^ 0x92 ^ (0x1C ^ 0x4E);
    }

    private static boolean lllllIIIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllllIIIIlllII(Object object) {
        return object != null;
    }

    private static String lllllIIIIlIlIl(String var3, String var18) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llIIlIIIlIlI[8], var8);
            return new String(var6.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static String lllllIIIIlIlII(String var10, String var9) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), llIIlIIIlIlI[13]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(llIIlIIIlIlI[8], var20);
            return new String(var7.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        j lllllllllllllllIlIIllllllIIlIlII;
        if (!j.lllllIIIIllIIl(this.R.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !j.lllllIIIIllIlI(this.x().needsToBank() ? 1 : 0) || j.lllllIIIIllIIl(SquireFightCavesPlugin.g ? 1 : 0) && j.lllllIIIIllIIl(this.X.stopAfterCape() ? 1 : 0)) {
            return llIIlIIIlIlI[4];
        }
        if (j.lllllIIIIllIll(j.lllllIIIIllIII(System.currentTimeMillis(), aa + 120000L)) && j.lllllIIIIllIIl(SquireFightCavesPlugin.f ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIIl[llIIlIIIlIlI[4]];
            return llIIlIIIlIlI[4];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (j.lllllIIIIllIIl(tileObject.getName().contains(llIIlIIIlIIl[llIIlIIIlIlI[9]]) ? 1 : 0)) {
                String[] stringArray = new String[llIIlIIIlIlI[7]];
                stringArray[j.llIIlIIIlIlI[4]] = llIIlIIIlIIl[llIIlIIIlIlI[10]];
                if (j.lllllIIIIllIIl(tileObject.hasAction(stringArray) ? 1 : 0) && j.lllllIIIIlllIl(tileObject.getWorldLocation().distanceTo(this.Z), llIIlIIIlIlI[11])) {
                    n2 = llIIlIIIlIlI[7];
                    0;
                    if (((0xDA ^ 0x83) & ~(0x37 ^ 0x6E)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = llIIlIIIlIlI[4];
            return n2 != 0;
        });
        if (j.lllllIIIIlllII(var1)) {
            SquireFightCavesPlugin.h = llIIlIIIlIIl[llIIlIIIlIlI[7]];
            var1.interact(llIIlIIIlIIl[llIIlIIIlIlI[8]]);
            n.al = null;
            SquireFightCavesPlugin.f = llIIlIIIlIlI[4];
            ab = llIIlIIIlIlI[4];
            return llIIlIIIlIlI[4];
        }
        return llIIlIIIlIlI[4];
    }

    protected BankLoadout x() {
        return (BankLoadout)this.X.bankLoadout().selected(BankLoadout.class);
    }

    private static boolean lllllIIIIllIll(int n2) {
        return n2 > 0;
    }

    private static void lllllIIIIlIllI() {
        llIIlIIIlIIl = new String[llIIlIIIlIlI[12]];
        j.llIIlIIIlIIl[j.llIIlIIIlIlI[4]] = j."Enter cave cool down";
        j.llIIlIIIlIIl[j.llIIlIIIlIlI[7]] = j."Entering cave";
        j.llIIlIIIlIIl[j.llIIlIIIlIlI[8]] = j."Enter";
        j.llIIlIIIlIIl[j.llIIlIIIlIlI[9]] = j."Cave entrance";
        j.llIIlIIIlIIl[j.llIIlIIIlIlI[10]] = j."Enter";
    }

    private static int lllllIIIIllIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    static {
        j.lllllIIIIlIlll();
        j.lllllIIIIlIllI();
        aa = System.currentTimeMillis();
    }

    private static String lllllIIIIlIIll(String var15, String var5) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var5.toCharArray();
        int var14 = llIIlIIIlIlI[4];
        char[] var16 = var15.toCharArray();
        int var2 = var16.length;
        int var13 = llIIlIIIlIlI[4];
        while (j.lllllIIIIllllI(var13, var2)) {
            char var17 = var16[var13];
            var11.append((char)(var17 ^ var12[var14 % var12.length]));
            0;
            ++var14;
            ++var13;
            0;
            if (3 >= -1) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    @Inject
    public j(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.R = new WorldArea(llIIlIIIlIlI[0], llIIlIIIlIlI[1], llIIlIIIlIlI[2], llIIlIIIlIlI[3], llIIlIIIlIlI[4]);
        this.Z = new WorldPoint(llIIlIIIlIlI[5], llIIlIIIlIlI[6], llIIlIIIlIlI[4]);
        this.W = f2;
        this.X = squireFightCavesConfig;
        this.Y = n2;
    }

    private static boolean lllllIIIIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

