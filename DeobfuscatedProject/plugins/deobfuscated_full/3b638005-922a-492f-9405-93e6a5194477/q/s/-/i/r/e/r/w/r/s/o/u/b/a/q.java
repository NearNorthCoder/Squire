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
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.a;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

/* TASK: Digging next brother -> DiggingnextbrotherTask */
@TaskDesc(name="Digging next brother", priority=100, blocking=true)
public class q
extends Task {
    private final /* synthetic */ SquireBarrows X;
    private static /* synthetic */ int[] llllIlIIllI;
    private final /* synthetic */ a Y;
    private static /* synthetic */ String[] llllIlIIlIl;
    private final /* synthetic */ Client Z;

    private static String lIllIlIlIlIlIl(String var13, String var24) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llllIlIIllI[4], var19);
            return new String(var14.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlIlllIl(Object object) {
        return object != null;
    }

    private static String lIllIlIlIlIllI(String var7, String var1) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), llllIlIIllI[7]), "DES");
            Cipher var25 = Cipher.getInstance("DES");
            var25.init(llllIlIIllI[4], var8);
            return new String(var25.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIlIlIlII(String var17, String var15) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var23 = var15.toCharArray();
        int var16 = llllIlIIllI[0];
        char[] var10 = var17.toCharArray();
        int var12 = var10.length;
        int var5 = llllIlIIllI[0];
        while (q.lIllIlIlIllllI(var5, var12)) {
            char var21 = var10[var5];
            var9.append((char)(var21 ^ var23[var16 % var23.length]));
            0;
            ++var16;
            ++var5;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    public boolean run() {
        q var6;
        if (q.lIllIlIlIllIIl(this.X.u() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllIIl(var6.X.h() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllIIl(var6.Z.isInInstancedRegion() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllIlI(var6.X.m() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        d var2 = var6.X.n();
        if (q.lIllIlIlIllIlI(Movement.isRunEnabled() ? 1 : 0) && q.lIllIlIlIllIll(Movement.getRunEnergy(), llllIlIIllI[1])) {
            Movement.toggleRun();
        }
        WorldPoint var18 = var2.D();
        WorldPoint var11 = Players.getLocal().getWorldLocation();
        if (q.lIllIlIlIllIlI(Gear.isEquipped((int[])var6.Y.c(var2)) ? 1 : 0)) {
            Gear.swapTo((int[])var6.Y.c(var2));
            0;
        }
        int[] nArray = new int[llllIlIIllI[2]];
        nArray[q.llllIlIIllI[0]] = llllIlIIllI[3];
        Item var22 = Inventory.getFirst((int[])nArray);
        if (q.lIllIlIlIlllII(var22)) {
            int[] nArray2 = new int[llllIlIIllI[2]];
            nArray2[q.llllIlIIllI[0]] = llllIlIIllI[3];
            TileItem var20 = TileItems.getNearest((int[])nArray2);
            if (q.lIllIlIlIlllIl(var20)) {
                var20.interact(llllIlIIlIl[llllIlIIllI[0]]);
                var6.sleep(llllIlIIllI[4]);
                return llllIlIIllI[2];
            }
            Log.info((String)llllIlIIlIl[llllIlIIllI[2]]);
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllllI(var18.distanceTo2D(var11), llllIlIIllI[4])) {
            int[] nArray3 = new int[llllIlIIllI[2]];
            nArray3[q.llllIlIIllI[0]] = llllIlIIllI[3];
            Inventory.interact((String)llllIlIIlIl[llllIlIIllI[4]], (int[])nArray3);
            0;
            var6.sleep(llllIlIIllI[5]);
            var6.X.j();
            var6.X.b(var2);
            0;
            if (2 < 1) {
                return ((201 + 109 - 134 + 62 ^ 10 + 155 - -18 + 8) & (0x72 ^ 6 ^ (0x23 ^ 6) ^ -1)) != 0;
            }
        } else if (q.lIllIlIlIlllll(var11.getRegionID(), var18.getRegionID())) {
            Movement.setDestination((WorldPoint)var18);
        }
        return llllIlIIllI[2];
    }

    static {
        q.lIllIlIlIllIII();
        q.lIllIlIlIlIlll();
    }

    private static boolean lIllIlIlIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIlIlIllIII() {
        llllIlIIllI = new int[8];
        q.llllIlIIllI[0] = (147 + 72 - 21 + 42 ^ 120 + 89 - 191 + 146) & (0xA7 ^ 0xC3 ^ (4 ^ 0x34) ^ -1);
        q.llllIlIIllI[1] = 0x7D ^ 0x69;
        q.llllIlIIllI[2] = 1;
        q.llllIlIIllI[3] = 0xFFFFD3FD & 0x2FBA;
        q.llllIlIIllI[4] = 2;
        q.llllIlIIllI[5] = 113 + 84 - 181 + 183 ^ 156 + 140 - 294 + 193;
        q.llllIlIIllI[6] = 3;
        q.llllIlIIllI[7] = 0x3B ^ 0x33;
    }

    private static boolean lIllIlIlIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllIlIlIlIlll() {
        llllIlIIlIl = new String[llllIlIIllI[6]];
        q.llllIlIIlIl[q.llllIlIIllI[0]] = q."Take";
        q.llllIlIIlIl[q.llllIlIIllI[2]] = q."Player does not have a spade to dig with LOL";
        q.llllIlIIlIl[q.llllIlIIllI[4]] = q."Dig";
    }

    private static boolean lIllIlIlIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIlllII(Object object) {
        return object == null;
    }

    @Inject
    public q(SquireBarrows squireBarrows, a a2, Client client) {
        this.X = squireBarrows;
        this.Y = a2;
        this.Z = client;
    }

    private static boolean lIllIlIlIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIlIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

