/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.B;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Crafting gear", priority=5, blocking=true)
public class C
extends n {
    private static /* synthetic */ int[] llIlIIIlIIlI;
    private static /* synthetic */ String[] llIlIIIlIIIl;
    private final /* synthetic */ B bQ;
    private /* synthetic */ int bR;

    private static boolean lIIIIIIlIIlIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        C lllllllllllllllIlIIIllIIlIllllII;
        void lllllllllllllllIlIIIllIIlIlllIll;
        void lllllllllllllllIlIIIllIIlIlllIlI;
        Player player = Players.getLocal();
        h h2 = this.ba.V();
        if (!C.lIIIIIIlIIIlllI(h2) || C.lIIIIIIlIIIllll(player)) {
            return llIlIIIlIIlI[1];
        }
        int lllllllllllllllIlIIIllIIlIlllIIl = lllllllllllllllIlIIIllIIlIlllIlI.av().e(lllllllllllllllIlIIIllIIlIlllIll.getWorldLocation()) ? 1 : 0;
        if (C.lIIIIIIlIIlIIII(lllllllllllllllIlIIIllIIlIlllIIl)) {
            if (C.lIIIIIIlIIlIIIl(Movement.isWalking() ? 1 : 0)) {
                return llIlIIIlIIlI[2];
            }
            m lllllllllllllllIlIIIllIIlIlllIII = lllllllllllllllIlIIIllIIlIllllII.ba.V().av();
            WorldPoint lllllllllllllllIlIIIllIIlIllIlll = lllllllllllllllIlIIIllIIlIlllIII.aQ();
            if (C.lIIIIIIlIIlIIIl(lllllllllllllllIlIIIllIIlIllIlll.isInScene(Static.getClient()) ? 1 : 0)) {
                ScenePoint lllllllllllllllIlIIIllIIlIllIllI = ScenePoint.fromWorld((WorldPoint)lllllllllllllllIlIIIllIIlIllIlll);
                Movement.setDestination((int)lllllllllllllllIlIIIllIIlIllIllI.getX(), (int)lllllllllllllllIlIIIllIIlIllIllI.getY());
                0;
                if (((0x31 ^ 0x23) & ~(0xD ^ 0x1F)) != 0) {
                    return ((0x5A ^ 0x10) & ~(0x49 ^ 3)) != 0;
                }
            } else {
                lllllllllllllllIlIIIllIIlIllllII.ba.a((l)lllllllllllllllIlIIIllIIlIlllIII, lllllllllllllllIlIIIllIIlIlllIll.getWorldLocation());
                0;
            }
            return llIlIIIlIIlI[2];
        }
        List<f> lllllllllllllllIlIIIllIIlIlllIII = lllllllllllllllIlIIIllIIlIllllII.ba.I();
        if (C.lIIIIIIlIIlIIII(lllllllllllllllIlIIIllIIlIlllIII.isEmpty() ? 1 : 0)) {
            Item lllllllllllllllIlIIIllIIlIllIllI;
            Widget lllllllllllllllIlIIIllIIlIllIlll;
            if (C.lIIIIIIlIIlIIIl(Movement.isWalking() ? 1 : 0)) {
                return llIlIIIlIIlI[2];
            }
            if (C.lIIIIIIlIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                int[] nArray = new int[llIlIIIlIIlI[2]];
                nArray[C.llIlIIIlIIlI[1]] = llIlIIIlIIlI[4];
                lllllllllllllllIlIIIllIIlIllIlll = Inventory.getFirst((int[])nArray);
                if (C.lIIIIIIlIIIlllI(lllllllllllllllIlIIIllIIlIllIlll)) {
                    lllllllllllllllIlIIIllIIlIllIlll.interact(llIlIIIlIIIl[llIlIIIlIIlI[1]]);
                    lllllllllllllllIlIIIllIIlIllllII.ba.V().av().k(llIlIIIlIIlI[2]);
                    return llIlIIIlIIlI[2];
                }
                int[] nArray2 = new int[llIlIIIlIIlI[2]];
                nArray2[C.llIlIIIlIIlI[1]] = llIlIIIlIIlI[5];
                lllllllllllllllIlIIIllIIlIllIllI = Inventory.getFirst((int[])nArray2);
                if (C.lIIIIIIlIIIlllI(lllllllllllllllIlIIIllIIlIllIllI)) {
                    lllllllllllllllIlIIIllIIlIllIllI.interact(llIlIIIlIIIl[llIlIIIlIIlI[2]]);
                    return llIlIIIlIIlI[2];
                }
            }
            if (C.lIIIIIIlIIlIIlI(lllllllllllllllIlIIIllIIlIllllII.bR)) {
                lllllllllllllllIlIIIllIIlIllllII.bR -= llIlIIIlIIlI[2];
                return llIlIIIlIIlI[2];
            }
            lllllllllllllllIlIIIllIIlIllIlll = Widgets.get((int)llIlIIIlIIlI[6], (int)llIlIIIlIIlI[7]);
            if (C.lIIIIIIlIIIlllI(lllllllllllllllIlIIIllIIlIllIlll) && C.lIIIIIIlIIlIIII(lllllllllllllllIlIIIllIIlIllIlll.isHidden() ? 1 : 0)) {
                Item lllllllllllllllIlIIIllIIlIllIlIl = lllllllllllllllIlIIIllIIlIllIllI = lllllllllllllllIlIIIllIIlIllIlll.getStaticChildren();
                int lllllllllllllllIlIIIllIIlIllIlII = ((Widget[])lllllllllllllllIlIIIllIIlIllIlIl).length;
                int lllllllllllllllIlIIIllIIlIllIIll = llIlIIIlIIlI[1];
                while (C.lIIIIIIlIIlIIll(lllllllllllllllIlIIIllIIlIllIIll, lllllllllllllllIlIIIllIIlIllIlII)) {
                    Item lllllllllllllllIlIIIllIIlIllIIlI = lllllllllllllllIlIIIllIIlIllIlIl[lllllllllllllllIlIIIllIIlIllIIll];
                    String lllllllllllllllIlIIIllIIlIllIIIl = lllllllllllllllIlIIIllIIlIllIIlI.getName();
                    List<String> lllllllllllllllIlIIIllIIlIllIIII = lllllllllllllllIlIIIllIIlIlllIII.get(llIlIIIlIIlI[1]).ae();
                    Stream stream = lllllllllllllllIlIIIllIIlIllIIII.stream();
                    String string = lllllllllllllllIlIIIllIIlIllIIIl;
                    Objects.requireNonNull(string);
                    0;
                    if (C.lIIIIIIlIIlIIIl(stream.anyMatch(string::contains) ? 1 : 0)) {
                        lllllllllllllllIlIIIllIIlIllIIlI.interact(llIlIIIlIIIl[llIlIIIlIIlI[3]]);
                        lllllllllllllllIlIIIllIIlIllllII.bR = llIlIIIlIIlI[2];
                        return llIlIIIlIIlI[2];
                    }
                    ++lllllllllllllllIlIIIllIIlIllIIll;
                    0;
                    if (-1 != 3) continue;
                    return ((22 + 57 - 70 + 175 ^ 136 + 102 - 141 + 47) & (5 ^ 0x56 ^ (0x53 ^ 0x28) ^ -1)) != 0;
                }
                return llIlIIIlIIlI[1];
            }
            String[] stringArray = new String[llIlIIIlIIlI[2]];
            stringArray[C.llIlIIIlIIlI[1]] = llIlIIIlIIIl[llIlIIIlIIlI[0]];
            lllllllllllllllIlIIIllIIlIllIllI = TileObjects.getNearest((String[])stringArray);
            if (C.lIIIIIIlIIIlllI(lllllllllllllllIlIIIllIIlIllIllI)) {
                lllllllllllllllIlIIIllIIlIllIllI.interact(llIlIIIlIIIl[llIlIIIlIIlI[8]]);
                return llIlIIIlIIlI[2];
            }
        }
        return llIlIIIlIIlI[1];
    }

    private static String lIIIIIIlIIIlIlI(String lllllllllllllllIlIIIllIIlIIIIIIl, String lllllllllllllllIlIIIllIIlIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIIlIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllIIlIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllIIlIIIIlIl.init(llIlIIIlIIlI[3], lllllllllllllllIlIIIllIIlIIIIllI);
            return new String(lllllllllllllllIlIIIllIIlIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllIIlIIIIlII) {
            lllllllllllllllIlIIIllIIlIIIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIIlIIIlIll(String lllllllllllllllIlIIIllIIlIlIIIII, String lllllllllllllllIlIIIllIIlIlIIlII) {
        lllllllllllllllIlIIIllIIlIlIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllIIlIlIIIll = new StringBuilder();
        char[] lllllllllllllllIlIIIllIIlIlIIIlI = lllllllllllllllIlIIIllIIlIlIIlII.toCharArray();
        int lllllllllllllllIlIIIllIIlIlIIIIl = llIlIIIlIIlI[1];
        char[] lllllllllllllllIlIIIllIIlIIllIll = lllllllllllllllIlIIIllIIlIlIIIII.toCharArray();
        int lllllllllllllllIlIIIllIIlIIllIlI = lllllllllllllllIlIIIllIIlIIllIll.length;
        int lllllllllllllllIlIIIllIIlIIllIIl = llIlIIIlIIlI[1];
        while (C.lIIIIIIlIIlIIll(lllllllllllllllIlIIIllIIlIIllIIl, lllllllllllllllIlIIIllIIlIIllIlI)) {
            char lllllllllllllllIlIIIllIIlIlIIllI = lllllllllllllllIlIIIllIIlIIllIll[lllllllllllllllIlIIIllIIlIIllIIl];
            lllllllllllllllIlIIIllIIlIlIIIll.append((char)(lllllllllllllllIlIIIllIIlIlIIllI ^ lllllllllllllllIlIIIllIIlIlIIIlI[lllllllllllllllIlIIIllIIlIlIIIIl % lllllllllllllllIlIIIllIIlIlIIIlI.length]));
            0;
            ++lllllllllllllllIlIIIllIIlIlIIIIl;
            ++lllllllllllllllIlIIIllIIlIIllIIl;
            0;
            if (((0x79 ^ 0x6B) & ~(0x8E ^ 0x9C)) >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIllIIlIlIIIll);
    }

    private static void lIIIIIIlIIIllIl() {
        llIlIIIlIIlI = new int[11];
        C.llIlIIIlIIlI[0] = 3;
        C.llIlIIIlIIlI[1] = (0xB2 ^ 0x9D) & ~(0x2C ^ 3);
        C.llIlIIIlIIlI[2] = 1;
        C.llIlIIIlIIlI[3] = 2;
        C.llIlIIIlIIlI[4] = 0xFFFFFDD7 & 0x5F68;
        C.llIlIIIlIIlI[5] = -(0xFFFFB69D & 0x6BEF) & (0xFFFFFFEF & 0x7FDE);
        C.llIlIIIlIIlI[6] = -(0xFFFFBCA9 & 0x5FF7) & (0xFFFFFFBF & 0x1DEE);
        C.llIlIIIlIIlI[7] = 0x2D ^ 0x23;
        C.llIlIIIlIIlI[8] = 0xCB ^ 0x87 ^ (0x6B ^ 0x23);
        C.llIlIIIlIIlI[9] = 0xF9 ^ 0xC5 ^ (0xFF ^ 0xC6);
        C.llIlIIIlIIlI[10] = 0x4A ^ 0x42;
    }

    private static boolean lIIIIIIlIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIIIlIIIlIIl(String lllllllllllllllIlIIIllIIlIIlIIII, String lllllllllllllllIlIIIllIIlIIIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIIlIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIlIIIllll.getBytes(StandardCharsets.UTF_8)), llIlIIIlIIlI[10]), "DES");
            Cipher lllllllllllllllIlIIIllIIlIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIIIllIIlIIlIIlI.init(llIlIIIlIIlI[3], lllllllllllllllIlIIIllIIlIIlIIll);
            return new String(lllllllllllllllIlIIIllIIlIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllIIlIIlIIIl) {
            lllllllllllllllIlIIIllIIlIIlIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public C(c c2, B b2) {
        d[] dArray = new d[llIlIIIlIIlI[0]];
        dArray[C.llIlIIIlIIlI[1]] = d.FIRST_ROTATION_CREATE;
        dArray[C.llIlIIIlIIlI[2]] = d.PREPARE_BOSS_FIGHT;
        dArray[C.llIlIIIlIIlI[3]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
        this.bQ = b2;
    }

    private static boolean lIIIIIIlIIIlllI(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIlIIlIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIIlIIlIIIl(int n2) {
        return n2 != 0;
    }

    static {
        C.lIIIIIIlIIIllIl();
        C.lIIIIIIlIIIllII();
    }

    private static void lIIIIIIlIIIllII() {
        llIlIIIlIIIl = new String[llIlIIIlIIlI[9]];
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[1]] = C."Drop";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[2]] = C."Eat";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[3]] = C."Make";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[0]] = C."Singing Bowl";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[8]] = C."Sing-crystal";
    }
}

