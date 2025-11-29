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
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Smelting", register=true)
public class P
extends a {
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
            P llllllllllllllllIIlIIlIIIIlIIIIl;
            int llllllllllllllllIIlIIlIIIIlIIIII = llllllllllllllllIIlIIlIIIIlIIIIl.j.smeltingProduct().w();
            Production.chooseOption((int)llllllllllllllllIIlIIlIIIIlIIIII);
            llllllllllllllllIIlIIlIIIIlIIIIl.sleep(llllllllllllllllIIlIIlIIIIlIIIIl.i());
            return lllIlIlllII[1];
        }
        if (P.lIllIIIIIlIlIl(Movement.isRunEnabled() ? 1 : 0) && P.lIllIIIIIlIllI(Movement.getRunEnergy(), lllIlIlllII[2])) {
            Movement.toggleRun();
            return lllIlIlllII[0];
        }
        TileObject llllllllllllllllIIlIIlIIIIlIIIII = TileObjects.getNearest(tileObject -> {
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
        if (P.lIllIIIIIlIlll(llllllllllllllllIIlIIlIIIIlIIIII)) {
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

    private static String lIllIIIIIlIIII(String llllllllllllllllIIlIIIlllllllllI, String llllllllllllllllIIlIIIllllllllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIIIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIIllllllllIl.getBytes(StandardCharsets.UTF_8)), lllIlIlllII[5]), "DES");
            Cipher llllllllllllllllIIlIIlIIIIIIIIII = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlIIIIIIIIII.init(lllIlIlllII[4], llllllllllllllllIIlIIlIIIIIIIIIl);
            return new String(llllllllllllllllIIlIIlIIIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIIlllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIIllllllllll) {
            llllllllllllllllIIlIIIllllllllll.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIIlIIIl(String llllllllllllllllIIlIIlIIIIIIlllI, String llllllllllllllllIIlIIlIIIIIlIIlI) {
        llllllllllllllllIIlIIlIIIIIIlllI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIIIIIlIIIl = new StringBuilder();
        char[] llllllllllllllllIIlIIlIIIIIlIIII = llllllllllllllllIIlIIlIIIIIlIIlI.toCharArray();
        int llllllllllllllllIIlIIlIIIIIIllll = lllIlIlllII[0];
        char[] llllllllllllllllIIlIIlIIIIIIlIIl = llllllllllllllllIIlIIlIIIIIIlllI.toCharArray();
        int llllllllllllllllIIlIIlIIIIIIlIII = llllllllllllllllIIlIIlIIIIIIlIIl.length;
        int llllllllllllllllIIlIIlIIIIIIIlll = lllIlIlllII[0];
        while (P.lIllIIIIIllIIl(llllllllllllllllIIlIIlIIIIIIIlll, llllllllllllllllIIlIIlIIIIIIlIII)) {
            char llllllllllllllllIIlIIlIIIIIlIlII = llllllllllllllllIIlIIlIIIIIIlIIl[llllllllllllllllIIlIIlIIIIIIIlll];
            llllllllllllllllIIlIIlIIIIIlIIIl.append((char)(llllllllllllllllIIlIIlIIIIIlIlII ^ llllllllllllllllIIlIIlIIIIIlIIII[llllllllllllllllIIlIIlIIIIIIllll % llllllllllllllllIIlIIlIIIIIlIIII.length]));
            0;
            ++llllllllllllllllIIlIIlIIIIIIllll;
            ++llllllllllllllllIIlIIlIIIIIIIlll;
            0;
            if (((0x51 ^ 0x64 ^ (0x20 ^ 0x1F)) & (0x68 ^ 0x45 ^ (0x11 ^ 0x36) ^ -1)) < (33 + 23 - 26 + 124 ^ 120 + 75 - 110 + 73)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlIIIIIlIIIl);
    }

    private static boolean lIllIIIIIlIllI(int n2, int n3) {
        return n2 >= n3;
    }
}

