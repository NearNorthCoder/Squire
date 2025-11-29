/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import com.google.inject.Inject;
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
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Cannon Balls")
public class O
extends a {
    private static /* synthetic */ String[] lllIIlIllII;
    private static /* synthetic */ int[] lllIIlIllIl;

    private static boolean lIlIlllIIIIllI(int n2) {
        return n2 == 0;
    }

    static {
        O.lIlIlllIIIIlIl();
        O.lIlIlllIIIIlII();
    }

    private static String lIlIlllIIIIIlI(String llllllllllllllllIIlIlIIIIIIlllll, String llllllllllllllllIIlIlIIIIIIllllI) {
        llllllllllllllllIIlIlIIIIIIlllll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIIIIlIIIlI = new StringBuilder();
        char[] llllllllllllllllIIlIlIIIIIlIIIIl = llllllllllllllllIIlIlIIIIIIllllI.toCharArray();
        int llllllllllllllllIIlIlIIIIIlIIIII = lllIIlIllIl[2];
        char[] llllllllllllllllIIlIlIIIIIIllIlI = llllllllllllllllIIlIlIIIIIIlllll.toCharArray();
        int llllllllllllllllIIlIlIIIIIIllIIl = llllllllllllllllIIlIlIIIIIIllIlI.length;
        int llllllllllllllllIIlIlIIIIIIllIII = lllIIlIllIl[2];
        while (O.lIlIlllIIIlIlI(llllllllllllllllIIlIlIIIIIIllIII, llllllllllllllllIIlIlIIIIIIllIIl)) {
            char llllllllllllllllIIlIlIIIIIlIIlIl = llllllllllllllllIIlIlIIIIIIllIlI[llllllllllllllllIIlIlIIIIIIllIII];
            llllllllllllllllIIlIlIIIIIlIIIlI.append((char)(llllllllllllllllIIlIlIIIIIlIIlIl ^ llllllllllllllllIIlIlIIIIIlIIIIl[llllllllllllllllIIlIlIIIIIlIIIII % llllllllllllllllIIlIlIIIIIlIIIIl.length]));
            0;
            ++llllllllllllllllIIlIlIIIIIlIIIII;
            ++llllllllllllllllIIlIlIIIIIIllIII;
            0;
            if ((0x50 ^ 0x4A ^ (0xB9 ^ 0xA7)) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIIIIIlIIIlI);
    }

    @Override
    public int i() {
        return lllIIlIllIl[4];
    }

    private static boolean lIlIlllIIIIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1_1;
        if (!O.lIlIlllIIIIllI(Players.getLocal().isMoving() ? 1 : 0) || O.lIlIlllIIIIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIlIllIl[2];
        }
        if (O.lIlIlllIIIIlll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllIIlIllIl[2]);
        }
        if (O.lIlIlllIIIIllI(Movement.isRunEnabled() ? 1 : 0) && O.lIlIlllIIIlIII(Movement.getRunEnergy(), lllIIlIllIl[3])) {
            Movement.toggleRun();
            return lllIIlIllIl[2];
        }
        String[] stringArray = new String[lllIIlIllIl[1]];
        stringArray[O.lllIIlIllIl[2]] = lllIIlIllII[lllIIlIllIl[2]];
        TileObject llllllllllllllllIIlIlIIIIIlIllll = TileObjects.getNearest((String[])stringArray);
        if (O.lIlIlllIIIlIIl(llllllllllllllllIIlIlIIIIIlIllll)) {
            return lllIIlIllIl[2];
        }
        if (O.lIlIlllIIIIlll(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return lllIIlIllIl[1];
        }
        var1_1.interact(lllIIlIllII[lllIIlIllIl[1]]);
        return lllIIlIllIl[1];
    }

    private static boolean lIlIlllIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIlllIIIIlII() {
        lllIIlIllII = new String[lllIIlIllIl[5]];
        O.lllIIlIllII[O.lllIIlIllIl[2]] = O."Furnace";
        O.lllIIlIllII[O.lllIIlIllIl[1]] = O."Smelt";
    }

    private static void lIlIlllIIIIlIl() {
        lllIIlIllIl = new int[7];
        O.lllIIlIllIl[0] = 0xFFFFA977 & 0x5FB9;
        O.lllIIlIllIl[1] = 1;
        O.lllIIlIllIl[2] = (0x9A ^ 0xB1 ^ (0x28 ^ 5)) & (11 + 43 - 11 + 96 ^ 0 + 112 - 86 + 115 ^ -1);
        O.lllIIlIllIl[3] = 0x76 ^ 0x40 ^ (0x5D ^ 0x20);
        O.lllIIlIllIl[4] = 0xE3 ^ 0x85 ^ (0xD ^ 0x6E);
        O.lllIIlIllIl[5] = 2;
        O.lllIIlIllIl[6] = 0x4B ^ 0x43;
    }

    private static String lIlIlllIIIIIll(String llllllllllllllllIIlIlIIIIIIIllIl, String llllllllllllllllIIlIlIIIIIIIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIIIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), lllIIlIllIl[6]), "DES");
            Cipher llllllllllllllllIIlIlIIIIIIlIIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIIIIIlIIIl.init(lllIIlIllIl[5], llllllllllllllllIIlIlIIIIIIlIIlI);
            return new String(llllllllllllllllIIlIlIIIIIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIIIIlIIII) {
            llllllllllllllllIIlIlIIIIIIlIIII.printStackTrace();
            return null;
        }
    }

    @Inject
    public O(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.CANNON_BALLS);
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIlIllIl[0], lllIIlIllIl[1]);
    }

    private static boolean lIlIlllIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllIIIlIIl(Object object) {
        return object == null;
    }
}

