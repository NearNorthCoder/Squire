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
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Mining volcanic ash", priority=5)
public class N
extends Task {
    private static /* synthetic */ int[] llllllIlIIlI;
    private final /* synthetic */ SquireMinerConfig aq;
    private static /* synthetic */ String[] llllllIlIIIl;

    private static String lIIlIlIIIllllIl(String lllllllllllllllIIlIIIllIllIlIIIl, String lllllllllllllllIIlIIIllIllIIlIll) {
        lllllllllllllllIIlIIIllIllIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIllIllIIllll = new StringBuilder();
        char[] lllllllllllllllIIlIIIllIllIIlllI = lllllllllllllllIIlIIIllIllIIlIll.toCharArray();
        int lllllllllllllllIIlIIIllIllIIllIl = llllllIlIIlI[0];
        char[] lllllllllllllllIIlIIIllIllIIIlll = lllllllllllllllIIlIIIllIllIlIIIl.toCharArray();
        int lllllllllllllllIIlIIIllIllIIIllI = lllllllllllllllIIlIIIllIllIIIlll.length;
        int lllllllllllllllIIlIIIllIllIIIlIl = llllllIlIIlI[0];
        while (N.lIIlIlIIlIIIllI(lllllllllllllllIIlIIIllIllIIIlIl, lllllllllllllllIIlIIIllIllIIIllI)) {
            char lllllllllllllllIIlIIIllIllIlIIlI = lllllllllllllllIIlIIIllIllIIIlll[lllllllllllllllIIlIIIllIllIIIlIl];
            lllllllllllllllIIlIIIllIllIIllll.append((char)(lllllllllllllllIIlIIIllIllIlIIlI ^ lllllllllllllllIIlIIIllIllIIlllI[lllllllllllllllIIlIIIllIllIIllIl % lllllllllllllllIIlIIIllIllIIlllI.length]));
            "".length();
            ++lllllllllllllllIIlIIIllIllIIllIl;
            ++lllllllllllllllIIlIIIllIllIIIlIl;
            "".length();
            if ("  ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIllIllIIllll);
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
        Player lllllllllllllllIIlIIIllIllIlllIl = Players.getLocal();
        if (!N.lIIlIlIIlIIIIIl(Inventory.isFull() ? 1 : 0) || !N.lIIlIlIIlIIIIlI(lllllllllllllllIIlIIIllIllIlllIl) || !N.lIIlIlIIlIIIIIl(lllllllllllllllIIlIIIllIllIlllIl.isAnimating() ? 1 : 0) || N.lIIlIlIIlIIIIll(lllllllllllllllIIlIIIllIllIlllIl.isMoving() ? 1 : 0)) {
            return llllllIlIIlI[0];
        }
        if (N.lIIlIlIIlIIIIIl(Movement.isRunEnabled() ? 1 : 0) && N.lIIlIlIIlIIIlII(Movement.getRunEnergy(), llllllIlIIlI[1])) {
            Movement.toggleRun();
        }
        int[] nArray = new int[llllllIlIIlI[2]];
        nArray[N.llllllIlIIlI[0]] = llllllIlIIlI[3];
        TileObject lllllllllllllllIIlIIIllIllIlllII = TileObjects.getNearest((int[])nArray);
        if (N.lIIlIlIIlIIIlIl(lllllllllllllllIIlIIIllIllIlllII)) {
            System.out.println(llllllIlIIIl[llllllIlIIlI[0]]);
            return llllllIlIIlI[0];
        }
        var2_2.interact(llllllIlIIIl[llllllIlIIlI[2]]);
        return llllllIlIIlI[2];
    }

    private static String lIIlIlIIIllllII(String lllllllllllllllIIlIIIllIlIllllII, String lllllllllllllllIIlIIIllIlIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllIlIlllIIl.getBytes(StandardCharsets.UTF_8)), llllllIlIIlI[5]), "DES");
            Cipher lllllllllllllllIIlIIIllIlIlllllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIllIlIlllllI.init(llllllIlIIlI[4], lllllllllllllllIIlIIIllIlIllllll);
            return new String(lllllllllllllllIIlIIIllIlIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIllIlIllllIl) {
            lllllllllllllllIIlIIIllIlIllllIl.printStackTrace();
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
        N.llllllIlIIIl[N.llllllIlIIlI[0]] = N.lIIlIlIIIllllII("w1oGlJotXGu9wKLS0l0PiUOgMb8NQatLuxtuHu6Dv9Q=", "KbmaV");
        N.llllllIlIIIl[N.llllllIlIIlI[2]] = N.lIIlIlIIIllllIl("CgwvFQ==", "GeApq");
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
        N.llllllIlIIlI[2] = " ".length();
        N.llllllIlIIlI[3] = -(0xFFFFE7C7 & 0x1C7F) & (0xFFFFFD5F & 0x7FEF);
        N.llllllIlIIlI[4] = "  ".length();
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

