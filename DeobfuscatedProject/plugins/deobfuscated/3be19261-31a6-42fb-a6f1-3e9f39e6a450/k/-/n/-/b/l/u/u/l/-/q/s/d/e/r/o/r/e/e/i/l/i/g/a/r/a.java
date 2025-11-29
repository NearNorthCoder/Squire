/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

@Singleton
public class a {
    private static /* synthetic */ int[] lIIlllIllIIl;
    private static /* synthetic */ String[] lIIlllIlIlll;
    private final /* synthetic */ SquireBlueDragonKillerConfig n;

    private static void llIlIIIlIIIlIl() {
        lIIlllIllIIl = new int[6];
        a.lIIlllIllIIl[0] = (0x6C ^ 0xC ^ (0x2B ^ 0x5D)) & (0x2C ^ 0x59 ^ (0x7A ^ 0x19) ^ -1);
        a.lIIlllIllIIl[1] = 1;
        a.lIIlllIllIIl[2] = 2;
        a.lIIlllIllIIl[3] = 3;
        a.lIIlllIllIIl[4] = 3 ^ 7;
        a.lIIlllIllIIl[5] = 0xB7 ^ 0xBF;
    }

    private static String llIlIIIIlllllI(String lllllllllllllllIlllIlIlIllIIIlll, String lllllllllllllllIlllIlIlIllIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIlIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIlIllIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIlIllIIlIll.init(lIIlllIllIIl[2], lllllllllllllllIlllIlIlIllIIllII);
            return new String(lllllllllllllllIlllIlIlIllIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIlIllIIlIlI) {
            lllllllllllllllIlllIlIlIllIIlIlI.printStackTrace();
            return null;
        }
    }

    private void l() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n;
            if (a.llIlIIIlIIlIIl(nPC.isDead() ? 1 : 0) && a.llIlIIIlIIlIlI(nPC.getInteracting(), Players.getLocal())) {
                n = lIIlllIllIIl[1];
                0;
                if (((0x31 ^ 0x2C) & ~(0x77 ^ 0x6A)) >= (0x5B ^ 0x5F)) {
                    return ((0x82 ^ 0xC7) & ~(0x5C ^ 0x19)) != 0;
                }
            } else {
                n = lIIlllIllIIl[0];
            }
            return n != 0;
        });
        if (a.llIlIIIlIIlIII(nPC2)) {
            return;
        }
        nPC2.interact(lIIlllIlIlll[lIIlllIllIIl[1]]);
    }

    private static String llIlIIIIllllIl(String lllllllllllllllIlllIlIlIlIlIllII, String lllllllllllllllIlllIlIlIlIlIIllI) {
        lllllllllllllllIlllIlIlIlIlIllII = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIlIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIlIlIlIlIlI = new StringBuilder();
        char[] lllllllllllllllIlllIlIlIlIlIlIIl = lllllllllllllllIlllIlIlIlIlIIllI.toCharArray();
        int lllllllllllllllIlllIlIlIlIlIlIII = lIIlllIllIIl[0];
        char[] lllllllllllllllIlllIlIlIlIlIIIlI = lllllllllllllllIlllIlIlIlIlIllII.toCharArray();
        int lllllllllllllllIlllIlIlIlIlIIIIl = lllllllllllllllIlllIlIlIlIlIIIlI.length;
        int lllllllllllllllIlllIlIlIlIlIIIII = lIIlllIllIIl[0];
        while (a.llIlIIIlIIlIll(lllllllllllllllIlllIlIlIlIlIIIII, lllllllllllllllIlllIlIlIlIlIIIIl)) {
            char lllllllllllllllIlllIlIlIlIlIllIl = lllllllllllllllIlllIlIlIlIlIIIlI[lllllllllllllllIlllIlIlIlIlIIIII];
            lllllllllllllllIlllIlIlIlIlIlIlI.append((char)(lllllllllllllllIlllIlIlIlIlIllIl ^ lllllllllllllllIlllIlIlIlIlIlIIl[lllllllllllllllIlllIlIlIlIlIlIII % lllllllllllllllIlllIlIlIlIlIlIIl.length]));
            0;
            ++lllllllllllllllIlllIlIlIlIlIlIII;
            ++lllllllllllllllIlllIlIlIlIlIIIII;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIlIlIlIlIlI);
    }

    public boolean n() {
        return this.n.dragonLocation().p().contains(Players.getLocal().getWorldLocation());
    }

    public NPC j() {
        return NPCs.getNearest(nPC -> {
            int n;
            if (a.llIlIIIlIIlIIl(nPC.isDead() ? 1 : 0) && a.llIlIIIlIIIlll(nPC.getName().equals(lIIlllIlIlll[lIIlllIllIIl[3]]) ? 1 : 0) && a.llIlIIIlIIIlll(nPC.getWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) {
                n = lIIlllIllIIl[1];
                0;
                if (((35 + 92 - 110 + 117 ^ 108 + 50 - 19 + 0) & (0xA ^ 0x38 ^ (0xFD ^ 0xC2) ^ -1)) != ((70 + 73 - 22 + 82 ^ 131 + 119 - 189 + 72) & (142 + 119 - 205 + 140 ^ 76 + 92 - 70 + 40 ^ -1))) {
                    return ((210 + 153 - 152 + 24 ^ 139 + 117 - 190 + 130) & (0x2A ^ 0x43 ^ (0x62 ^ 0x24) ^ -1)) != 0;
                }
            } else {
                n = lIIlllIllIIl[0];
            }
            return n != 0;
        });
    }

    private static boolean llIlIIIlIIlIIl(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public void k() {
        void var1_1;
        NPC lllllllllllllllIlllIlIlIllIllIll;
        a lllllllllllllllIlllIlIlIllIlllII;
        if (a.llIlIIIlIIIllI(Players.getLocal().getInteracting())) {
            return;
        }
        if (a.llIlIIIlIIIlll(lllllllllllllllIlllIlIlIllIlllII.m() ? 1 : 0)) {
            lllllllllllllllIlllIlIlIllIlllII.l();
        }
        if (a.llIlIIIlIIlIII(lllllllllllllllIlllIlIlIllIllIll = lllllllllllllllIlllIlIlIllIlllII.j())) {
            return;
        }
        var1_1.interact(lIIlllIlIlll[lIIlllIllIIl[0]]);
    }

    private static boolean llIlIIIlIIIllI(Object object) {
        return object != null;
    }

    private static String llIlIIIIllllll(String lllllllllllllllIlllIlIlIlIlllIlI, String lllllllllllllllIlllIlIlIlIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIlIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIlIlllIll.getBytes(StandardCharsets.UTF_8)), lIIlllIllIIl[5]), "DES");
            Cipher lllllllllllllllIlllIlIlIlIlllllI = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIlIlIlllllI.init(lIIlllIllIIl[2], lllllllllllllllIlllIlIlIlIllllll);
            return new String(lllllllllllllllIlllIlIlIlIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIlIlIllllIl) {
            lllllllllllllllIlllIlIlIlIllllIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean m() {
        boolean bl;
        block4: {
            block3: {
                block2: {
                    Actor actor = Players.getLocal().getInteracting();
                    if (!a.llIlIIIlIIIllI(actor)) break block2;
                    String[] stringArray = new String[lIIlllIllIIl[1]];
                    stringArray[a.lIIlllIllIIl[0]] = lIIlllIlIlll[lIIlllIllIIl[2]];
                    if (!a.llIlIIIlIIlIIl(actor.hasAction(stringArray) ? 1 : 0)) break block3;
                }
                if (!a.llIlIIIlIIlIIl(NPCs.getAll(nPC -> {
                    boolean bl;
                    if (a.llIlIIIlIIlIlI(nPC.getInteracting(), Players.getLocal())) {
                        bl = lIIlllIllIIl[1];
                        0;
                        if (((0xC6 ^ 0x88 ^ (0x57 ^ 0x79)) & (0x29 ^ 0x2F ^ (0xE7 ^ 0x81) ^ -1)) > 0) {
                            return ((0x60 ^ 0x67 ^ (0x2C ^ 0x66)) & (135 + 41 - 83 + 153 ^ 40 + 9 - -63 + 75 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlllIllIIl[0];
                    }
                    return bl;
                }).isEmpty() ? 1 : 0)) break block4;
            }
            bl = lIIlllIllIIl[1];
            0;
            if (-1 >= -1) return bl;
            return ((0x15 ^ 0x59) & ~(0x7F ^ 0x33)) != 0;
        }
        bl = lIIlllIllIIl[0];
        return bl;
    }

    private static boolean llIlIIIlIIlIII(Object object) {
        return object == null;
    }

    private static boolean llIlIIIlIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIIIlIIIlll(int n) {
        return n != 0;
    }

    @Inject
    public a(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.n = squireBlueDragonKillerConfig;
    }

    private static boolean llIlIIIlIIlIll(int n, int n2) {
        return n < n2;
    }

    private static void llIlIIIlIIIIII() {
        lIIlllIlIlll = new String[lIIlllIllIIl[4]];
        a.lIIlllIlIlll[a.lIIlllIllIIl[0]] = a."Attack";
        a.lIIlllIlIlll[a.lIIlllIllIIl[1]] = a."Attack";
        a.lIIlllIlIlll[a.lIIlllIllIIl[2]] = a."Attack";
        a.lIIlllIlIlll[a.lIIlllIllIIl[3]] = a."Blue dragon";
    }

    static {
        a.llIlIIIlIIIlIl();
        a.llIlIIIlIIIIII();
    }
}

