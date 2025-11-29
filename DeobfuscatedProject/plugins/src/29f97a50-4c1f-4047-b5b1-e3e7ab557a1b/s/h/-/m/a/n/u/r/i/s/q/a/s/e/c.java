/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.api.InventorySetup;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.g;

@Singleton
public class c {
    private static /* synthetic */ int[] lIIllIIIIlIIl;
    public static final /* synthetic */ int z;
    public static final /* synthetic */ WorldPoint F;
    public static final /* synthetic */ WorldArea C;
    @Inject
    private /* synthetic */ SquireShamanConfig c;
    public static final /* synthetic */ WorldPoint G;
    private static /* synthetic */ String[] lIIllIIIIlIII;
    public static final /* synthetic */ WorldArea A;
    public static final /* synthetic */ int x;
    public static final /* synthetic */ WorldPoint I;
    public static final /* synthetic */ WorldPoint D;
    public static final /* synthetic */ WorldPoint E;
    public static final /* synthetic */ WorldArea B;
    public static final /* synthetic */ WorldPoint H;
    public static final /* synthetic */ int y;

    public boolean a(WorldPoint worldPoint) {
        return this.n().stream().noneMatch(list -> list.contains(worldPoint));
    }

    private static String lIlIlllIlIIllIl(String llllllllllllllIllllIIlIlIllIlIlI, String llllllllllllllIllllIIlIlIllIIlll) {
        try {
            SecretKeySpec llllllllllllllIllllIIlIlIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIlIllIIlll.getBytes(StandardCharsets.UTF_8)), lIIllIIIIlIIl[17]), "DES");
            Cipher llllllllllllllIllllIIlIlIllIllII = Cipher.getInstance("DES");
            llllllllllllllIllllIIlIlIllIllII.init(lIIllIIIIlIIl[12], llllllllllllllIllllIIlIlIllIllIl);
            return new String(llllllllllllllIllllIIlIlIllIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIlIlIllIlIll) {
            llllllllllllllIllllIIlIlIllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIlIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIlllIlIIllll() {
        lIIllIIIIlIII = new String[lIIllIIIIlIIl[1]];
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIII[s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[2]] = s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIIllIl("Yv9rISrloBOLb3we4cNX9w==", "dffMP");
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIII[s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[0]] = s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIIlllI("S4SVMoYlVQVk7TT9uddQCk4DGYKOe+of", "DlIvt");
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIII[s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[12]] = s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIIlllI("jcpfNy2MbS8=", "ibUXr");
    }

    private static boolean lIlIlllIlIlIlll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public InventorySetup r() {
        void llllllllllllllIllllIIlIllIIIIlll;
        c llllllllllllllIllllIIlIllIIIlIII;
        InventorySetup inventorySetup = new InventorySetup().add(this.c.food().w(), this.c.foodAmount()).add(this.c.cure().u(), this.c.amountOfRemedies()).add(this.c.teleportItem().u(), lIIllIIIIlIIl[0]).add(this.c.rangePotion().u(), this.c.rangePotionAmount()).add(lIIllIIIIlIIl[4], this.c.prayerPotionAmount());
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(this.c.boneCrusher() ? 1 : 0)) {
            inventorySetup.add(lIIllIIIIlIIl[5], lIIllIIIIlIIl[0]);
            "".length();
        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(llllllllllllllIllllIIlIllIIIlIII.c.stamina() ? 1 : 0)) {
            llllllllllllllIllllIIlIllIIIIlll.add(item -> {
                int n2;
                if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIlIl(item.getId(), lIIllIIIIlIIl[10]) && s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIllI(item.getId(), lIIllIIIIlIIl[11])) {
                    n2 = lIIllIIIIlIIl[0];
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return ((0x15 ^ 0x52) & ~(0x5E ^ 0x19)) != 0;
                    }
                } else {
                    n2 = lIIllIIIIlIIl[2];
                }
                return n2 != 0;
            }, lIIllIIIIlIIl[0]);
            "".length();
        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(llllllllllllllIllllIIlIllIIIlIII.c.teleportItem().D() ? 1 : 0)) {
            llllllllllllllIllllIIlIllIIIIlll.add(item -> {
                boolean bl;
                if (!s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIlII(item.getId(), lIIllIIIIlIIl[8]) || s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIll(item.getId(), lIIllIIIIlIIl[9])) {
                    bl = lIIllIIIIlIIl[0];
                    "".length();
                    if (-" ".length() == "   ".length()) {
                        return (" ".length() & ~" ".length()) != 0;
                    }
                } else {
                    bl = lIIllIIIIlIIl[2];
                }
                return bl;
            }, lIIllIIIIlIIl[0]);
            "".length();
        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(llllllllllllllIllllIIlIllIIIlIII.c.alch() ? 1 : 0)) {
            if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(llllllllllllllIllllIIlIllIIIlIII.c.runePouch() ? 1 : 0)) {
                llllllllllllllIllllIIlIllIIIIlll.add(item -> item.getName().toLowerCase().contains(lIIllIIIIlIII[lIIllIIIIlIIl[2]]), lIIllIIIIlIIl[0]);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
            } else {
                llllllllllllllIllllIIlIllIIIIlll.add(lIIllIIIIlIIl[6]);
                "".length();
                llllllllllllllIllllIIlIllIIIIlll.add(lIIllIIIIlIIl[7]);
                "".length();
            }
        }
        return inventorySetup;
    }

    private static boolean lIlIlllIlIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    public WorldPoint a(WorldPoint worldPoint, NPC nPC) {
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIlI(this.a(nPC))) {
            return null;
        }
        return this.a(nPC).stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(worldPoint))).orElse(null);
    }

    public g t() {
        return this.c.room();
    }

    public WorldArea p() {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        return new WorldArea(worldPoint.getX() - lIIllIIIIlIIl[0], worldPoint.getY() - lIIllIIIIlIIl[0], lIIllIIIIlIIl[1], lIIllIIIIlIIl[1], lIIllIIIIlIIl[2]);
    }

    private static boolean lIlIlllIlIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public Set<List<WorldPoint>> n() {
        HashSet<List<WorldPoint>> hashSet = new HashSet<List<WorldPoint>>();
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(nPC.getName().equals(lIIllIIIIlIII[lIIllIIIIlIIl[12]]) ? 1 : 0) && s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIll(nPC.getAnimation(), lIIllIIIIlIIl[13])) {
                n2 = lIIllIIIIlIIl[0];
                "".length();
                if (((0xA6 ^ 0x8A) & ~(0xBD ^ 0x91)) == "  ".length()) {
                    return ((0xD9 ^ 0x81) & ~(0xB ^ 0x53)) != 0;
                }
            } else {
                n2 = lIIllIIIIlIIl[2];
            }
            return n2 != 0;
        });
        Iterator llllllllllllllIllllIIlIllIIllIlI = list.iterator();
        while (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(llllllllllllllIllllIIlIllIIllIlI.hasNext() ? 1 : 0)) {
            void llllllllllllllIllllIIlIllIIlllII;
            NPC llllllllllllllIllllIIlIllIIllIIl = (NPC)llllllllllllllIllllIIlIllIIllIlI.next();
            WorldPoint llllllllllllllIllllIIlIllIIllIII = llllllllllllllIllllIIlIllIIllIIl.getWorldLocation();
            WorldArea llllllllllllllIllllIIlIllIIlIlll = new WorldArea(llllllllllllllIllllIIlIllIIllIII.getX() - lIIllIIIIlIIl[0], llllllllllllllIllllIIlIllIIllIII.getY() - lIIllIIIIlIIl[0], lIIllIIIIlIIl[1], lIIllIIIIlIIl[1], lIIllIIIIlIIl[2]);
            llllllllllllllIllllIIlIllIIlllII.add(llllllllllllllIllllIIlIllIIlIlll.toWorldPointList());
            "".length();
            "".length();
            if ("   ".length() <= (0x9A ^ 0x9E)) continue;
            return null;
        }
        return hashSet;
    }

    public List<WorldPoint> a(NPC nPC) {
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIlI(nPC)) {
            return null;
        }
        return nPC.getWorldArea().toWorldPointList();
    }

    private static boolean lIlIlllIlIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIlllIlIlIIII() {
        lIIllIIIIlIIl = new int[26];
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[0] = " ".length();
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[1] = "   ".length();
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[2] = (0xA9 ^ 0xB9 ^ (0x29 ^ 0x69)) & (152 + 198 - 199 + 93 ^ 35 + 10 - -92 + 27 ^ -" ".length());
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[3] = 0xFFFFFFF2 & 0x1BFD;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[4] = 0xFFFF8BFF & 0x7D82;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[5] = 0xFFFFFB7C & 0x37BF;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[6] = 0xFFFFC6FA & 0x3B2F;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[7] = -(0xFFFFF9D7 & 0x5F6F) & (0xFFFFDBF7 & 0x7F7F);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[8] = -(0xFFFFFDFF & 0x3EFB) & (0xFFFFBFFE & Short.MAX_VALUE);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[9] = -(0xFFFFEF94 & 0x58EF) & (0xFFFFEFFF & 0x7BFF);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[10] = -(0xFFFFEFAF & 0x5EF5) & (0xFFFFFFF7 & 0x7FFD);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[11] = 0xFFFFB3DF & 0x7D77;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[12] = "  ".length();
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[13] = -(0xFFFFC6EB & 0x3D1D) & (0xFFFFDFFF & 0x3FFF);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[14] = -(0xFFFFF59B & 0x6E6D) & (0xFFFFFFFF & 0x7FFD);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[15] = -(0xFFFFDB27 & 0x3CFB) & (0xFFFFDD2B & 0x3FFF);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[16] = -(95 + 33 - 61 + 64) & (0xFFFFB7FF & 0x6FEF);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[17] = 0xFA ^ 0x8D ^ 45 + 26 - -9 + 47;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[18] = -(0xFFFFFE01 & 0x69FF) & (0xFFFFFFBF & 0x6D5D);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[19] = 0xFFFFB76F & 0x4DBE;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[20] = 0xFFFFA7EF & 0x7F7E;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[21] = -(0xFFFFF8D9 & 0x4FA7) & (0xFFFFFFFF & 0x6FEF);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[22] = 0xFFFFC7AC & 0x3D5F;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[23] = 0xFFFFF77E & 0x2FF1;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[24] = 0xFFFFB525 & 0x4FFB;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[25] = 0xFFFFE7FF & 0x3F71;
    }

    static {
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIII();
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIIllll();
        y = lIIllIIIIlIIl[14];
        z = lIIllIIIIlIIl[13];
        x = lIIllIIIIlIIl[3];
        A = new WorldArea(lIIllIIIIlIIl[15], lIIllIIIIlIIl[16], lIIllIIIIlIIl[17], lIIllIIIIlIIl[17], lIIllIIIIlIIl[2]);
        B = new WorldArea(lIIllIIIIlIIl[18], lIIllIIIIlIIl[16], lIIllIIIIlIIl[17], lIIllIIIIlIIl[17], lIIllIIIIlIIl[2]);
        C = new WorldArea(lIIllIIIIlIIl[19], lIIllIIIIlIIl[16], lIIllIIIIlIIl[17], lIIllIIIIlIIl[17], lIIllIIIIlIIl[2]);
        D = new WorldPoint(lIIllIIIIlIIl[15], lIIllIIIIlIIl[20], lIIllIIIIlIIl[2]);
        E = new WorldPoint(lIIllIIIIlIIl[18], lIIllIIIIlIIl[20], lIIllIIIIlIIl[2]);
        F = new WorldPoint(lIIllIIIIlIIl[19], lIIllIIIIlIIl[21], lIIllIIIIlIIl[2]);
        G = new WorldPoint(lIIllIIIIlIIl[22], lIIllIIIIlIIl[23], lIIllIIIIlIIl[2]);
        H = new WorldPoint(lIIllIIIIlIIl[24], lIIllIIIIlIIl[25], lIIllIIIIlIIl[2]);
        I = new WorldPoint(lIIllIIIIlIIl[22], lIIllIIIIlIIl[23], lIIllIIIIlIIl[2]);
    }

    public boolean s() {
        return this.c.room().x().contains((Locatable)Players.getLocal());
    }

    private static boolean lIlIlllIlIlIIlI(Object object) {
        return object == null;
    }

    public NPC o() {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(nPC.getName().equals(lIIllIIIIlIII[lIIllIIIIlIIl[0]]) ? 1 : 0) && s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIlll(nPC.getInteracting(), Players.getLocal())) {
                n2 = lIIllIIIIlIIl[0];
                "".length();
                if (null != null) {
                    return ((0x27 ^ 0x2B) & ~(0xB7 ^ 0xBB)) != 0;
                }
            } else {
                n2 = lIIllIIIIlIIl[2];
            }
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    public boolean q() {
        boolean bl;
        void llllllllllllllIllllIIlIllIIIlIll;
        NPC nPC = this.o();
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIlI(nPC)) {
            return lIIllIIIIlIIl[2];
        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIll(llllllllllllllIllllIIlIllIIIlIll.getAnimation(), lIIllIIIIlIIl[3])) {
            bl = lIIllIIIIlIIl[0];
            "".length();
            if ("   ".length() > "   ".length()) {
                return ((186 + 130 - 213 + 116 ^ 136 + 29 - 66 + 38) & (51 + 42 - -83 + 66 ^ 141 + 50 - 172 + 141 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIllIIIIlIIl[2];
        }
        return bl;
    }

    private static String lIlIlllIlIIlllI(String llllllllllllllIllllIIlIlIlllIlIl, String llllllllllllllIllllIIlIlIlllIllI) {
        try {
            SecretKeySpec llllllllllllllIllllIIlIlIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIlIlIllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIlIlIllllIIl.init(lIIllIIIIlIIl[12], llllllllllllllIllllIIlIlIllllIlI);
            return new String(llllllllllllllIllllIIlIlIllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIlIlIllllIII) {
            llllllllllllllIllllIIlIlIllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIlIIll(int n2, int n3) {
        return n2 == n3;
    }
}

