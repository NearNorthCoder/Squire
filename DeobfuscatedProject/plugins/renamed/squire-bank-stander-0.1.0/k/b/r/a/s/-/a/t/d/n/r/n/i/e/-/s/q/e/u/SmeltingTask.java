/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a_Unknown;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.BEnum;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

/* TASK: Smelting -> SmeltingTask */
@TaskDesc(name="Smelting", register=true)
public class SmeltingTask
extends a_Unknown {
    private static /* synthetic */ String[] lllIlIllIll;
    private static /* synthetic */ int[] lllIlIlllII;

    private static boolean lIllIIIIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIllIII(Object object) {
        return object != null;
    }

    static {
        P.lIllIIIIIlIIll();
        P.lIllIIIIIlIIlI();
    }

    private static boolean lIllIIIIIlIlII(int n2) {
        return n2 != 0;
    }

    @Override
    public int i() {
        return lllIlIlllII[3];
    }

    private static boolean lIllIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIlIlll(Object object) {
        return object == null;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.smeltingProduct().q(), this.j.smeltingProduct().r(), this.j.smeltingProduct().t(), this.j.smeltingProduct().u());
    }

    private static void lIllIIIIIlIIlI() {
        lllIlIllIll = new String[lllIlIlllII[4]];
        P.lllIlIllIll[P.lllIlIlllII[0]] = P."Smelt";
        P.lllIlIllIll[P.lllIlIlllII[1]] = P."Smelt";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1_2;
        if (P.lIllIIIIIlIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllIlIlllII[0]);
            return lllIlIlllII[1];
        }
        if (P.lIllIIIIIlIlII(Production.isOpen() ? 1 : 0)) {
            P var9;
            int var7 = var9.j.smeltingProduct().w();
            Production.chooseOption((int)var7);
            var9.sleep(var9.i());
            return lllIlIlllII[1];
        }
        if (P.lIllIIIIIlIlIl(Movement.isRunEnabled() ? 1 : 0) && P.lIllIIIIIlIllI(Movement.getRunEnergy(), lllIlIlllII[2])) {
            Movement.toggleRun();
            return lllIlIlllII[0];
        }
        TileObject var7 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (P.lIllIIIIIllIII(tileObject.getActions())) {
                String[] stringArray = new String[lllIlIlllII[1]];
                stringArray[P.lllIlIlllII[0]] = lllIlIllIll[lllIlIlllII[1]];
                if (P.lIllIIIIIlIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIlIlllII[1];
                    0;
                    if (((0xBE ^ 0xA0 ^ (0xAB ^ 0xA4)) & (0xE7 ^ 0xA0 ^ (0x97 ^ 0xC1) ^ -1)) <= ((106 + 73 - 5 + 32 ^ 106 + 90 - 178 + 128) & (0x51 ^ 0x4A ^ (0x25 ^ 0x62) ^ -1))) return n2 != 0;
                    return ((0xB9 ^ 0x9E ^ (0xFB ^ 0x89)) & (0x71 ^ 0x45 ^ (0x48 ^ 0x29) ^ -1)) != 0;
                }
            }
            n2 = lllIlIlllII[0];
            return n2 != 0;
        });
        if (P.lIllIIIIIlIlll(var7)) {
            return lllIlIlllII[0];
        }
        var1_2.interact(lllIlIllIll[lllIlIlllII[0]]);
        return lllIlIlllII[1];
    }

    private static void lIllIIIIIlIIll() {
        lllIlIlllII = new int[6];
        P.lllIlIlllII[0] = (0x5A ^ 0x53) & ~(0xCC ^ 0xC5);
        P.lllIlIlllII[1] = 1;
        P.lllIlIlllII[2] = 0x1D ^ 0x56;
        P.lllIlIlllII[3] = 0xDF ^ 0xBD ^ (0xC1 ^ 0xA6);
        P.lllIlIlllII[4] = 2;
        P.lllIlIlllII[5] = 0xCF ^ 0xC6 ^ 1;
    }

    @Inject
    public P(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.SMELTING);
    }

    private static String lIllIIIIIlIIII(String var15, String var2) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lllIlIlllII[5]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lllIlIlllII[4], var14);
            return new String(var6.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIIlIIIl(String var3, String var1) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var16 = var1.toCharArray();
        int var8 = lllIlIlllII[0];
        char[] var12 = var3.toCharArray();
        int var10 = var12.length;
        int var5 = lllIlIlllII[0];
        while (P.lIllIIIIIllIIl(var5, var10)) {
            char var11 = var12[var5];
            var4.append((char)(var11 ^ var16[var8 % var16.length]));
            0;
            ++var8;
            ++var5;
            0;
            if (((0x51 ^ 0x64 ^ (0x20 ^ 0x1F)) & (0x68 ^ 0x45 ^ (0x11 ^ 0x36) ^ -1)) < (33 + 23 - 26 + 124 ^ 120 + 75 - 110 + 73)) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean lIllIIIIIlIllI(int n2, int n3) {
        return n2 >= n3;
    }
}

