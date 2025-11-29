/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.BankingTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

/* TASK: Handling house -> HandlePOHTask */
@TaskDesc(name="Handling house", priority=10)
public class HandlingHouseTask
extends BankingTask {
    private static /* synthetic */ String[] lIllIlllIIllI;
    private static /* synthetic */ int[] lIllIlllIlIII;

    private static boolean llIIlIIllIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIlIllllll() {
        lIllIlllIlIII = new int[9];
        H.lIllIlllIlIII[0] = (0x67 ^ 0x70) & ~(0x4A ^ 0x5D);
        H.lIllIlllIlIII[1] = 0xFFFFEEEF & 0x135E;
        H.lIllIlllIlIII[2] = 0xC9 ^ 0xA0 ^ (0x21 ^ 0x7B);
        H.lIllIlllIlIII[3] = 1;
        H.lIllIlllIlIII[4] = -(0xFFFFBFBE & 0x48C7) & (0xFFFFFFB5 & 0x2BFF);
        H.lIllIlllIlIII[5] = -(0xFFFFFF9F & 0x4CF1) & (0xFFFFEFFF & 0x7FBF);
        H.lIllIlllIlIII[6] = 2;
        H.lIllIlllIlIII[7] = 3;
        H.lIllIlllIlIII[8] = 0xF2 ^ 0xA6 ^ (0x65 ^ 0x39);
    }

    private static String llIIlIIlIlllIIl(String var7, String var2) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIllIlllIlIII[8]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIllIlllIlIII[6], var9);
            return new String(var18.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIllIIIIll(Object object, Object object2) {
        return object == object2;
    }

    static {
        H.llIIlIIlIllllll();
        H.llIIlIIlIllllII();
    }

    private static String llIIlIIlIlllIll(String var24, String var17) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var27 = Cipher.getInstance("Blowfish");
            var27.init(lIllIlllIlIII[6], var25);
            return new String(var27.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIllIIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIlIIllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean run() {
        H var12;
        if (!H.llIIlIIllIIIIII(this.ag() ? 1 : 0) || H.llIIlIIllIIIIII(this.ae().needsToBank() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        int var16 = Inventory.getCount(item -> item.hasAction(lIllIlllIIllI[lIllIlllIlIII[6]]::equals));
        if (H.llIIlIIllIIIIIl(var16, var12.X.multiple()) && H.llIIlIIllIIIIlI(var12.X.multiple())) {
            return lIllIlllIlIII[0];
        }
        if (H.llIIlIIllIIIIlI(var12.ad() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        if (H.llIIlIIllIIIIII(var12.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        if (!H.llIIlIIllIIIIlI(Players.getLocal().isIdle() ? 1 : 0) || H.llIIlIIllIIIIll(Static.getClient().getGameState(), GameState.LOADING)) {
            return lIllIlllIlIII[0];
        }
        if (H.llIIlIIllIIIIlI(Widgets.isVisible((Widget)Widgets.get((int)lIllIlllIlIII[1], (int)lIllIlllIlIII[0])) ? 1 : 0)) {
            Keyboard.type((char)lIllIlllIlIII[2]);
            return lIllIlllIlIII[3];
        }
        TileObject var6 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (H.llIIlIIllIIIlII(tileObject.getName()) && H.llIIlIIllIIIIlI(tileObject.getName().contains(lIllIlllIIllI[lIllIlllIlIII[3]]) ? 1 : 0)) {
                n2 = lIllIlllIlIII[3];
                0;
                if (-1 >= (0xE ^ 0xA)) {
                    return false;
                }
            } else {
                n2 = lIllIlllIlIII[0];
            }
            return n2 != 0;
        });
        if (H.llIIlIIllIIIlII(var6)) {
            var6.interact(lIllIlllIIllI[lIllIlllIlIII[0]]);
            return lIllIlllIlIII[3];
        }
        return lIllIlllIlIII[0];
    }

    private static String llIIlIIlIlllIlI(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var13 = var15.toCharArray();
        int var23 = lIllIlllIlIII[0];
        char[] var20 = var14.toCharArray();
        int var4 = var20.length;
        int var21 = lIllIlllIlIII[0];
        while (H.llIIlIIllIIIlIl(var21, var4)) {
            char var22 = var20[var21];
            var11.append((char)(var22 ^ var13[var23 % var13.length]));
            0;
            ++var23;
            ++var21;
            0;
            
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean llIIlIIllIIIIlI(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIlIllllII() {
        lIllIlllIIllI = new String[lIllIlllIlIII[7]];
        H.lIllIlllIIllI[H.lIllIlllIlIII[0]] = H."Teleport Menu";
        H.lIllIlllIIllI[H.lIllIlllIlIII[3]] = H."Jewellery Box";
        H.lIllIlllIIllI[H.lIllIlllIlIII[6]] = H."Eat";
    }

    private static boolean llIIlIIllIIIlII(Object object) {
        return object != null;
    }

    @Inject
    protected H(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }

    private static boolean llIIlIIllIIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIIllIIIIII(int n2) {
        return n2 == 0;
    }

    private boolean ag() {
        H var19;
        if (H.llIIlIIllIIIIII(this.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        int[] var1 = var19.Z.getMapRegions();
        int var8 = var1.length;
        int var10 = lIllIlllIlIII[0];
        while (H.llIIlIIllIIIlIl(var10, var8)) {
            int var26 = var1[var10];
            if (!H.llIIlIIllIIIllI(var26, lIllIlllIlIII[4]) || H.llIIlIIllIIIlll(var26, lIllIlllIlIII[5])) {
                return lIllIlllIlIII[3];
            }
            ++var10;
            0;
            
            return ((0x80 ^ 0xAB ^ (0x31 ^ 0x2F)) & (107 + 128 - 219 + 228 ^ 33 + 5 - -134 + 21 ^ -1)) != 0;
        }
        return lIllIlllIlIII[0];
    }

    @Override
    public boolean ac() {
        return lIllIlllIlIII[0];
    }
}

