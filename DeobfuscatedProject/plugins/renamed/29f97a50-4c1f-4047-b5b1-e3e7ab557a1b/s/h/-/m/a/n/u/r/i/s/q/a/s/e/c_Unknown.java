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
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.GEnum;

@Singleton
public class c_Unknown {
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

    private static String lIlIlllIlIIllIl(String var16, String var4) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIllIIIIlIIl[17]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIIllIIIIlIIl[12], var1);
            return new String(var2.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIlIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIlllIlIIllll() {
        lIIllIIIIlIII = new String[lIIllIIIIlIIl[1]];
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIII[s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[2]] = s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown."rune pouch";
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIII[s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[0]] = s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown."Lizardman shaman";
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIII[s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[12]] = s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown."Spawn";
    }

    private static boolean lIlIlllIlIlIlll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public InventorySetup r() {
        void var18;
        c var17;
        InventorySetup inventorySetup = new InventorySetup().add(this.c.food().w(), this.c.foodAmount()).add(this.c.cure().u(), this.c.amountOfRemedies()).add(this.c.teleportItem().u(), lIIllIIIIlIIl[0]).add(this.c.rangePotion().u(), this.c.rangePotionAmount()).add(lIIllIIIIlIIl[4], this.c.prayerPotionAmount());
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIIl(this.c.boneCrusher() ? 1 : 0)) {
            inventorySetup.add(lIIllIIIIlIIl[5], lIIllIIIIlIIl[0]);
            0;
        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIIl(var17.c.stamina() ? 1 : 0)) {
            var18.add(item -> {
                int n2;
                if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIlIl(item.getId(), lIIllIIIIlIIl[10]) && s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIllI(item.getId(), lIIllIIIIlIIl[11])) {
                    n2 = lIIllIIIIlIIl[0];
                    0;
                    if (2 > 3) {
                        return false;
                    }
                } else {
                    n2 = lIIllIIIIlIIl[2];
                }
                return n2 != 0;
            }, lIIllIIIIlIIl[0]);
            0;
        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIIl(var17.c.teleportItem().D() ? 1 : 0)) {
            var18.add(item -> {
                boolean bl;
                if (!s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIlII(item.getId(), lIIllIIIIlIIl[8]) || s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIll(item.getId(), lIIllIIIIlIIl[9])) {
                    bl = lIIllIIIIlIIl[0];
                    0;
                    if (-1 == 3) {
                        return (1 & ~1) != 0;
                    }
                } else {
                    bl = lIIllIIIIlIIl[2];
                }
                return bl;
            }, lIIllIIIIlIIl[0]);
            0;
        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIIl(var17.c.alch() ? 1 : 0)) {
            if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIIl(var17.c.runePouch() ? 1 : 0)) {
                var18.add(item -> item.getName().toLowerCase().contains(lIIllIIIIlIII[lIIllIIIIlIIl[2]]), lIIllIIIIlIIl[0]);
                0;
                0;
                
                }
            } else {
                var18.add(lIIllIIIIlIIl[6]);
                0;
                var18.add(lIIllIIIIlIIl[7]);
                0;
            }
        }
        return inventorySetup;
    }

    private static boolean lIlIlllIlIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    public WorldPoint a(WorldPoint worldPoint, NPC nPC) {
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIlI(this.a(nPC))) {
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
            if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIIl(nPC.getName().equals(lIIllIIIIlIII[lIIllIIIIlIIl[12]]) ? 1 : 0) && s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIll(nPC.getAnimation(), lIIllIIIIlIIl[13])) {
                n2 = lIIllIIIIlIIl[0];
                0;
                if (((0xA6 ^ 0x8A) & ~(0xBD ^ 0x91)) == 2) {
                    return false;
                }
            } else {
                n2 = lIIllIIIIlIIl[2];
            }
            return n2 != 0;
        });
        Iterator var11 = list.iterator();
        while (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIIl(var11.hasNext() ? 1 : 0)) {
            void var3;
            NPC var15 = (NPC)var11.next();
            WorldPoint var6 = var15.getWorldLocation();
            WorldArea var7 = new WorldArea(var6.getX() - lIIllIIIIlIIl[0], var6.getY() - lIIllIIIIlIIl[0], lIIllIIIIlIIl[1], lIIllIIIIlIIl[1], lIIllIIIIlIIl[2]);
            var3.add(var7.toWorldPointList());
            0;
            0;
            if (3 <= (0x9A ^ 0x9E)) continue;
            return null;
        }
        return hashSet;
    }

    public List<WorldPoint> a(NPC nPC) {
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIlI(nPC)) {
            return null;
        }
        return nPC.getWorldArea().toWorldPointList();
    }

    private static boolean lIlIlllIlIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIlllIlIlIIII() {
        lIIllIIIIlIIl = new int[26];
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[0] = 1;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[1] = 3;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[2] = (0xA9 ^ 0xB9 ^ (0x29 ^ 0x69)) & (152 + 198 - 199 + 93 ^ 35 + 10 - -92 + 27 ^ -1);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[3] = 0xFFFFFFF2 & 0x1BFD;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[4] = 0xFFFF8BFF & 0x7D82;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[5] = 0xFFFFFB7C & 0x37BF;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[6] = 0xFFFFC6FA & 0x3B2F;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[7] = -(0xFFFFF9D7 & 0x5F6F) & (0xFFFFDBF7 & 0x7F7F);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[8] = -(0xFFFFFDFF & 0x3EFB) & (0xFFFFBFFE & Short.MAX_VALUE);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[9] = -(0xFFFFEF94 & 0x58EF) & (0xFFFFEFFF & 0x7BFF);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[10] = -(0xFFFFEFAF & 0x5EF5) & (0xFFFFFFF7 & 0x7FFD);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[11] = 0xFFFFB3DF & 0x7D77;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[12] = 2;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[13] = -(0xFFFFC6EB & 0x3D1D) & (0xFFFFDFFF & 0x3FFF);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[14] = -(0xFFFFF59B & 0x6E6D) & (0xFFFFFFFF & 0x7FFD);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[15] = -(0xFFFFDB27 & 0x3CFB) & (0xFFFFDD2B & 0x3FFF);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[16] = -(95 + 33 - 61 + 64) & (0xFFFFB7FF & 0x6FEF);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[17] = 0xFA ^ 0x8D ^ 45 + 26 - -9 + 47;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[18] = -(0xFFFFFE01 & 0x69FF) & (0xFFFFFFBF & 0x6D5D);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[19] = 0xFFFFB76F & 0x4DBE;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[20] = 0xFFFFA7EF & 0x7F7E;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[21] = -(0xFFFFF8D9 & 0x4FA7) & (0xFFFFFFFF & 0x6FEF);
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[22] = 0xFFFFC7AC & 0x3D5F;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[23] = 0xFFFFF77E & 0x2FF1;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[24] = 0xFFFFB525 & 0x4FFB;
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIIllIIIIlIIl[25] = 0xFFFFE7FF & 0x3F71;
    }

    static {
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIII();
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIIllll();
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
            if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIIl(nPC.getName().equals(lIIllIIIIlIII[lIIllIIIIlIIl[0]]) ? 1 : 0) && s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIlll(nPC.getInteracting(), Players.getLocal())) {
                n2 = lIIllIIIIlIIl[0];
                0;
                
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
        void var10;
        NPC nPC = this.o();
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIlI(nPC)) {
            return lIIllIIIIlIIl[2];
        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown.lIlIlllIlIlIIll(var10.getAnimation(), lIIllIIIIlIIl[3])) {
            bl = lIIllIIIIlIIl[0];
            0;
            if (3 > 3) {
                return false;
            }
        } else {
            bl = lIIllIIIIlIIl[2];
        }
        return bl;
    }

    private static String lIlIlllIlIIlllI(String var9, String var14) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIllIIIIlIIl[12], var12);
            return new String(var8.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIlIIll(int n2, int n3) {
        return n2 == n3;
    }
}

