/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.AEnum;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Mining volcanic ash -> MiningvolcanicashTask */
@TaskDesc(name="Mining volcanic ash", priority=5)
public class MiningVolcanicAshTask
extends Task {
    private static /* synthetic */ int[] llllllIlIIlI;
    private final /* synthetic */ SquireMinerConfig aq;
    private static /* synthetic */ String[] llllllIlIIIl;

    private static String lIIlIlIIIllllIl(String var13, String var8) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var3 = var8.toCharArray();
        int var5 = llllllIlIIlI[0];
        char[] var10 = var13.toCharArray();
        int var6 = var10.length;
        int var7 = llllllIlIIlI[0];
        while (N.lIIlIlIIlIIIllI(var7, var6)) {
            char var15 = var10[var7];
            var9.append((char)(var15 ^ var3[var5 % var3.length]));
            0;
            ++var5;
            ++var7;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIIlIlIIlIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIlIIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (N.lIIlIlIIlIIIIII((Object)this.aq.activity(), (Object)a.VOLCANIC_ASH)) {
            return llllllIlIIlI[0];
        }
        Player var14 = Players.getLocal();
        if (!N.lIIlIlIIlIIIIIl(Inventory.isFull() ? 1 : 0) || !N.lIIlIlIIlIIIIlI(var14) || !N.lIIlIlIIlIIIIIl(var14.isAnimating() ? 1 : 0) || N.lIIlIlIIlIIIIll(var14.isMoving() ? 1 : 0)) {
            return llllllIlIIlI[0];
        }
        if (N.lIIlIlIIlIIIIIl(Movement.isRunEnabled() ? 1 : 0) && N.lIIlIlIIlIIIlII(Movement.getRunEnergy(), llllllIlIIlI[1])) {
            Movement.toggleRun();
        }
        int[] nArray = new int[llllllIlIIlI[2]];
        nArray[N.llllllIlIIlI[0]] = llllllIlIIlI[3];
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if (N.lIIlIlIIlIIIlIl(var4)) {
            System.out.println(llllllIlIIIl[llllllIlIIlI[0]]);
            return llllllIlIIlI[0];
        }
        var2_2.interact(llllllIlIIIl[llllllIlIIlI[2]]);
        return llllllIlIIlI[2];
    }

    private static String lIIlIlIIIllllII(String var11, String var12) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llllllIlIIlI[5]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llllllIlIIlI[4], var16);
            return new String(var1.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    @Inject
    public N(SquireMinerConfig squireMinerConfig) {
        this.aq = squireMinerConfig;
    }

    private static boolean lIIlIlIIlIIIlIl(Object object) {
        return object == null;
    }

    private static void lIIlIlIIIlllllI() {
        llllllIlIIIl = new String[llllllIlIIlI[4]];
        N.llllllIlIIIl[N.llllllIlIIlI[0]] = N."No volcanic ash pile found";
        N.llllllIlIIIl[N.llllllIlIIlI[2]] = N."Mine";
    }

    private static boolean lIIlIlIIlIIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIlIIIllllll() {
        llllllIlIIlI = new int[6];
        N.llllllIlIIlI[0] = (6 ^ 0x4C) & ~(0xF3 ^ 0xB9);
        N.llllllIlIIlI[1] = 132 + 81 - 109 + 75 ^ 147 + 94 - 171 + 100;
        N.llllllIlIIlI[2] = 1;
        N.llllllIlIIlI[3] = -(0xFFFFE7C7 & 0x1C7F) & (0xFFFFFD5F & 0x7FEF);
        N.llllllIlIIlI[4] = 2;
        N.llllllIlIIlI[5] = 0x66 ^ 0x43 ^ (0x82 ^ 0xAF);
    }

    static {
        N.lIIlIlIIIllllll();
        N.lIIlIlIIIlllllI();
    }

    private static boolean lIIlIlIIlIIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIIlIIIIIl(int n2) {
        return n2 == 0;
    }
}

