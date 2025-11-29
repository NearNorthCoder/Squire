/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Deposit and exit -> DepositandexitTask */
@TaskDesc(name="Deposit and exit")
public class DepositAndExitTask
extends Task {
    private static /* synthetic */ int[] lIIIIIIIlIlll;
    private static /* synthetic */ String[] lIIIIIIIlIIll;
    final /* synthetic */ WorldArea M;

    private static boolean lIIlIllIlIlllII(int n) {
        return n != 0;
    }

    private static void lIIlIllIlIllIIl() {
        lIIIIIIIlIlll = new int[18];
        e.lIIIIIIIlIlll[0] = -(0xFFFFBE39 & 0x69EF) & (0xFFFFADFF & 0x7FFB);
        e.lIIIIIIIlIlll[1] = 0xFFFFE57B & 0x3FDD;
        e.lIIIIIIIlIlll[2] = 0x6A ^ 0x41;
        e.lIIIIIIIlIlll[3] = 0xB9 ^ 0x93;
        e.lIIIIIIIlIlll[4] = (0x35 ^ 0x50 ^ (0x88 ^ 0xA6)) & (99 + 99 - 98 + 103 ^ 13 + 25 - 9 + 99 ^ -1);
        e.lIIIIIIIlIlll[5] = 0xFFFFEED6 & 0x37AB;
        e.lIIIIIIIlIlll[6] = 1;
        e.lIIIIIIIlIlll[7] = 0xFFFFE7EB & 0x3E97;
        e.lIIIIIIIlIlll[8] = -(0xFFFFFB63 & 0x5DE) & (0xFFFFB7F5 & 0x6FCF);
        e.lIIIIIIIlIlll[9] = -(0xFFFFEC5F & 0x7BA9) & (0xFFFFEB6F & 0x7FFC);
        e.lIIIIIIIlIlll[10] = 0x78 ^ 0x26 ^ (0x1A ^ 0x50);
        e.lIIIIIIIlIlll[11] = 2;
        e.lIIIIIIIlIlll[12] = 3;
        e.lIIIIIIIlIlll[13] = 0x78 ^ 0x7C;
        e.lIIIIIIIlIlll[14] = -(0xFFFFDAF1 & 0x6F1F) & (0xFFFFEFFD & 0x5FFB);
        e.lIIIIIIIlIlll[15] = -(0xFFFFDD9C & 0x32E7) & (0xFFFFFFFF & 0x35FF);
        e.lIIIIIIIlIlll[16] = 0x8A ^ 0xB3 ^ (0xFB ^ 0xC7);
        e.lIIIIIIIlIlll[17] = 0x36 ^ 0x3E;
    }

    private static String lIIlIllIlIIllll(String var9, String var7) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(lIIIIIIIlIlll[11], var11);
            return new String(var22.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    static {
        e.lIIlIllIlIllIIl();
        e.lIIlIllIlIlIllI();
    }

    private static void lIIlIllIlIlIllI() {
        lIIIIIIIlIIll = new String[lIIIIIIIlIlll[16]];
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[4]] = e."Depositing to bank";
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[6]] = e."Bank-all";
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[11]] = e."Exiting to Cavern";
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[12]] = e."Pass-through";
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[13]] = e."Entrance";
    }

    public boolean run() {
        e var4;
        if (e.lIIlIllIlIllIlI(Vars.getBit((int)lIIIIIIIlIlll[5]), lIIIIIIIlIlll[6]) && e.lIIlIllIlIllIlI(Vars.getBit((int)lIIIIIIIlIlll[7]), lIIIIIIIlIlll[6]) && e.lIIlIllIlIllIlI(Vars.getBit((int)lIIIIIIIlIlll[8]), lIIIIIIIlIlll[6])) {
            return lIIIIIIIlIlll[4];
        }
        if (e.lIIlIllIlIllIll(var4.M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIIlIlll[4];
        }
        if (e.lIIlIllIlIlllII(var4.M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            TileObject var10;
            Widget var14 = Widgets.get((int)lIIIIIIIlIlll[9], (int)lIIIIIIIlIlll[10]);
            if (e.lIIlIllIlIlllIl(var14)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIIll[lIIIIIIIlIlll[4]];
                var14.interact(lIIIIIIIlIIll[lIIIIIIIlIlll[6]]);
                return lIIIIIIIlIlll[6];
            }
            if (e.lIIlIllIlIllllI(var14) && e.lIIlIllIlIlllIl(var10 = TileObjects.getNearest(tileObject -> {
                int n;
                if (e.lIIlIllIlIlllII(tileObject.getName().contains(lIIIIIIIlIIll[lIIIIIIIlIlll[13]]) ? 1 : 0) && e.lIIlIllIlIlllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIIlIlll[14], lIIIIIIIlIlll[15], lIIIIIIIlIlll[4])), lIIIIIIIlIlll[16])) {
                    n = lIIIIIIIlIlll[6];
                    0;
                    if (((0x2A ^ 7) & ~(0x31 ^ 0x1C)) <= -1) {
                        return false;
                    }
                } else {
                    n = lIIIIIIIlIlll[4];
                }
                return n != 0;
            }))) {
                SquireMoonsOfPeril.g = lIIIIIIIlIIll[lIIIIIIIlIlll[11]];
                var10.interact(lIIIIIIIlIIll[lIIIIIIIlIlll[12]]);
                return lIIIIIIIlIlll[6];
            }
        }
        return lIIIIIIIlIlll[4];
    }

    private static boolean lIIlIllIllIIIII(int n, int n2) {
        return n < n2;
    }

    private static String lIIlIllIlIlIIIl(String var3, String var17) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlIlll[17]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIIIIIIlIlll[11], var1);
            return new String(var15.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlIllIll(int n) {
        return n == 0;
    }

    private static String lIIlIllIlIlIlIl(String var13, String var5) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var20 = var5.toCharArray();
        int var19 = lIIIIIIIlIlll[4];
        char[] var21 = var13.toCharArray();
        int var18 = var21.length;
        int var16 = lIIIIIIIlIlll[4];
        while (e.lIIlIllIllIIIII(var16, var18)) {
            char var2 = var21[var16];
            var12.append((char)(var2 ^ var20[var19 % var20.length]));
            0;
            ++var19;
            ++var16;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean lIIlIllIlIllllI(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIlIlllll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIllIlIllIlI(int n, int n2) {
        return n == n2;
    }

    public e() {
        this.M = new WorldArea(lIIIIIIIlIlll[0], lIIIIIIIlIlll[1], lIIIIIIIlIlll[2], lIIIIIIIlIlll[3], lIIIIIIIlIlll[4]);
    }

    private static boolean lIIlIllIlIlllIl(Object object) {
        return object != null;
    }
}

