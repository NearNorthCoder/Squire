/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Pathing to Demiboss", priority=1)
public class I
extends n {
    private static /* synthetic */ String[] llIlIIlIIIIl;
    private final /* synthetic */ c bU;
    private static /* synthetic */ int[] llIlIIlIIIlI;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var5_6;
        I lllllllllllllllIlIIIlIlIIlllIlIl;
        Player player = Players.getLocal();
        if (!I.lIIIIIIllIlIlII(player) || I.lIIIIIIllIlIlII(player.getInteracting())) {
            return llIlIIlIIIlI[1];
        }
        if (I.lIIIIIIllIlIlIl(Movement.shouldWalk() ? 1 : 0)) {
            return llIlIIlIIIlI[1];
        }
        g lllllllllllllllIlIIIlIlIIlllIIll = lllllllllllllllIlIIIlIlIIlllIlIl.bU.J();
        if (I.lIIIIIIllIlIllI((Object)lllllllllllllllIlIIIlIlIIlllIIll)) {
            return llIlIIlIIIlI[1];
        }
        if (I.lIIIIIIllIlIlll(Inventory.getCount((boolean)llIlIIlIIIlI[0], (int[])lllllllllllllllIlIIIlIlIIlllIIll.an().aB()))) {
            return llIlIIlIIIlI[1];
        }
        h lllllllllllllllIlIIIlIlIIlllIIlI = lllllllllllllllIlIIIlIlIIlllIlIl.bU.V();
        if (I.lIIIIIIllIlIllI(lllllllllllllllIlIIIlIlIIlllIIlI)) {
            Log.info((String)llIlIIlIIIIl[llIlIIlIIIlI[1]]);
            return llIlIIlIIIlI[1];
        }
        List<l> lllllllllllllllIlIIIlIlIIlllIIIl = lllllllllllllllIlIIIlIlIIlllIIlI.b(l2 -> {
            boolean bl;
            if (I.lIIIIIIllIllIIl((Object)l2.aZ(), (Object)lllllllllllllllIlIIIlIlIIlllIIll)) {
                bl = llIlIIlIIIlI[0];
                "".length();
                if (((0xFA ^ 0xB3 ^ (0x3F ^ 0x64)) & (43 + 156 - 77 + 61 ^ 57 + 99 - 17 + 26 ^ -" ".length())) > 0) {
                    return ((0x9E ^ 0xC0 ^ "   ".length()) & (0x53 ^ 7 ^ (0xB8 ^ 0xB1) ^ -" ".length())) != 0;
                }
            } else {
                bl = llIlIIlIIIlI[1];
            }
            return bl;
        });
        if (I.lIIIIIIllIlIlIl(lllllllllllllllIlIIIlIlIIlllIIIl.isEmpty() ? 1 : 0)) {
            void lllllllllllllllIlIIIlIlIIlllIlII;
            l lllllllllllllllIlIIIlIlIIlllIIII = lllllllllllllllIlIIIlIlIIlllIIIl.get(llIlIIlIIIlI[1]);
            if (I.lIIIIIIllIlIlIl(lllllllllllllllIlIIIlIlIIlllIIII.e(lllllllllllllllIlIIIlIlIIlllIlII.getWorldLocation()) ? 1 : 0)) {
                if (I.lIIIIIIllIlIlll(I.lIIIIIIllIlIIll(lllllllllllllllIlIIIlIlIIlllIIII.aQ().distanceTo((Locatable)lllllllllllllllIlIIIlIlIIlllIlII), 1.5 * (double)lllllllllllllllIlIIIlIlIIlllIIII.aQ().distanceTo(lllllllllllllllIlIIIlIlIIlllIIlI.av().aQ())))) {
                    Item lllllllllllllllIlIIIlIlIIllIllll = Inventory.getFirst(item -> e.ab.contains(item.getId()));
                    if (I.lIIIIIIllIlIlII(lllllllllllllllIlIIIlIlIIllIllll)) {
                        lllllllllllllllIlIIIlIlIIllIllll.interact(llIlIIlIIIIl[llIlIIlIIIlI[0]]);
                        "".length();
                        if ((0x10 ^ 0x42 ^ (0x58 ^ 0xE)) == "   ".length()) {
                            return ((0xC8 ^ 0xBE ^ (0xB9 ^ 0x8B)) & (130 + 125 - 39 + 16 ^ 133 + 17 - 103 + 125 ^ -" ".length())) != 0;
                        }
                    } else {
                        lllllllllllllllIlIIIlIlIIlllIlIl.bU.a((l)lllllllllllllllIlIIIlIlIIlllIIlI.av(), lllllllllllllllIlIIIlIlIIlllIlII.getWorldLocation());
                        "".length();
                    }
                    "".length();
                    if (null != null) {
                        return ((0x2D ^ 0x1E) & ~(0x13 ^ 0x20)) != 0;
                    }
                } else {
                    lllllllllllllllIlIIIlIlIIlllIlIl.bU.a(lllllllllllllllIlIIIlIlIIlllIIII, lllllllllllllllIlIIIlIlIIlllIlII.getWorldLocation());
                    "".length();
                }
                return llIlIIlIIIlI[0];
            }
            return llIlIIlIIIlI[1];
        }
        List<l> lllllllllllllllIlIIIlIlIIlllIIII = lllllllllllllllIlIIIlIlIIlllIIlI.b(l2 -> {
            int n2;
            if (I.lIIIIIIllIlIlIl(l2.aY() ? 1 : 0) && I.lIIIIIIllIllIII(l2.aS() ? 1 : 0)) {
                n2 = llIlIIlIIIlI[0];
                "".length();
                if ("  ".length() == (0x64 ^ 0x3B ^ (0x5A ^ 1))) {
                    return ((0xE9 ^ 0xBE ^ (0x65 ^ 0x69)) & (0x78 ^ 0x69 ^ (0x16 ^ 0x5C) ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIlIIlIIIlI[1];
            }
            return n2 != 0;
        });
        if (I.lIIIIIIllIllIII(lllllllllllllllIlIIIlIlIIlllIIII.isEmpty() ? 1 : 0)) {
            Log.info((String)llIlIIlIIIIl[llIlIIlIIIlI[2]]);
            return llIlIIlIIIlI[1];
        }
        var5_6.sort(Comparator.comparingInt(l2 -> l2.aW().distanceTo(player.getWorldLocation())));
        l l3 = (l)var5_6.get(llIlIIlIIIlI[1]);
        Log.info((String)llIlIIlIIIIl[llIlIIlIIIlI[3]]);
        return this.bU.a(l3, player.getWorldLocation());
    }

    private static void lIIIIIIllIlIIIl() {
        llIlIIlIIIIl = new String[llIlIIlIIIlI[4]];
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[1]] = I.lIIIIIIllIIIIlI("3zAz/SFNef7CKpkgSQIfiZf0GC9Llovt", "gKhMo");
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[0]] = I.lIIIIIIllIIIIll("IhYcPS8CAQ0=", "cuhTY");
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[2]] = I.lIIIIIIllIIIIll("Jy4BACkDKBQJNFcgBwBnEiwFET4=", "wAueG");
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[3]] = I.lIIIIIIllIIIIlI("jjSjcA8cig/FnUPA1MZMoVOGdombHl4RUNOfPk78ks8=", "XLcWT");
    }

    private static boolean lIIIIIIllIlIlll(int n2) {
        return n2 > 0;
    }

    private static void lIIIIIIllIlIIlI() {
        llIlIIlIIIlI = new int[5];
        I.llIlIIlIIIlI[0] = " ".length();
        I.llIlIIlIIIlI[1] = (0x52 ^ 0x7B) & ~(0x32 ^ 0x1B);
        I.llIlIIlIIIlI[2] = "  ".length();
        I.llIlIIlIIIlI[3] = "   ".length();
        I.llIlIIlIIIlI[4] = 4 ^ 0;
    }

    private static boolean lIIIIIIllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIllIlIlIl(int n2) {
        return n2 == 0;
    }

    static {
        I.lIIIIIIllIlIIlI();
        I.lIIIIIIllIlIIIl();
    }

    private static boolean lIIIIIIllIlIllI(Object object) {
        return object == null;
    }

    @Inject
    public I(c c2) {
        d[] dArray = new d[llIlIIlIIIlI[0]];
        dArray[I.llIlIIlIIIlI[1]] = d.DEMI_BOSS_EXPLORE;
        super(c2, dArray);
        this.bU = c2;
    }

    private static String lIIIIIIllIIIIll(String lllllllllllllllIlIIIlIlIIlIllIIl, String lllllllllllllllIlIIIlIlIIlIllIII) {
        lllllllllllllllIlIIIlIlIIlIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlIlIIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIlIlIIlIlllII = new StringBuilder();
        char[] lllllllllllllllIlIIIlIlIIlIllIll = lllllllllllllllIlIIIlIlIIlIllIII.toCharArray();
        int lllllllllllllllIlIIIlIlIIlIllIlI = llIlIIlIIIlI[1];
        char[] lllllllllllllllIlIIIlIlIIlIlIlII = lllllllllllllllIlIIIlIlIIlIllIIl.toCharArray();
        int lllllllllllllllIlIIIlIlIIlIlIIll = lllllllllllllllIlIIIlIlIIlIlIlII.length;
        int lllllllllllllllIlIIIlIlIIlIlIIlI = llIlIIlIIIlI[1];
        while (I.lIIIIIIllIllIlI(lllllllllllllllIlIIIlIlIIlIlIIlI, lllllllllllllllIlIIIlIlIIlIlIIll)) {
            char lllllllllllllllIlIIIlIlIIlIlllll = lllllllllllllllIlIIIlIlIIlIlIlII[lllllllllllllllIlIIIlIlIIlIlIIlI];
            lllllllllllllllIlIIIlIlIIlIlllII.append((char)(lllllllllllllllIlIIIlIlIIlIlllll ^ lllllllllllllllIlIIIlIlIIlIllIll[lllllllllllllllIlIIIlIlIIlIllIlI % lllllllllllllllIlIIIlIlIIlIllIll.length]));
            "".length();
            ++lllllllllllllllIlIIIlIlIIlIllIlI;
            ++lllllllllllllllIlIIIlIlIIlIlIIlI;
            "".length();
            if (-(0x5D ^ 0x58) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIlIlIIlIlllII);
    }

    private static boolean lIIIIIIllIllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIIllIlIlII(Object object) {
        return object != null;
    }

    private static String lIIIIIIllIIIIlI(String lllllllllllllllIlIIIlIlIIlIIIlll, String lllllllllllllllIlIIIlIlIIlIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlIlIIlIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlIlIIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIlIlIIlIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIlIlIIlIIlIll.init(llIlIIlIIIlI[2], lllllllllllllllIlIIIlIlIIlIIllII);
            return new String(lllllllllllllllIlIIIlIlIIlIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlIlIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIlIlIIlIIlIlI) {
            lllllllllllllllIlIIIlIlIIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIllIllIII(int n2) {
        return n2 != 0;
    }

    private static int lIIIIIIllIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }
}

