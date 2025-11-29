package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.api.InventorySetup;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@Singleton
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.c  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/c.class */
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
        return n().stream().noneMatch(list -> {
            return list.contains(worldPoint);
        });
    }

    private static String lIlIlllIlIIllIl(String llllllllllllllIllllIIlIlIllIlIII, String llllllllllllllIllllIIlIlIllIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), lIIllIIIIlIIl[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIIIlIIl[12], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlIlIllIlIll) {
            llllllllllllllIllllIIlIlIllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIlIIIl(int i) {
        return i != 0;
    }

    private static void lIlIlllIlIIllll() {
        lIIllIIIIlIII = new String[lIIllIIIIlIIl[1]];
        lIIllIIIIlIII[lIIllIIIIlIIl[2]] = lIlIlllIlIIllIl("Yv9rISrloBOLb3we4cNX9w==", "dffMP");
        lIIllIIIIlIII[lIIllIIIIlIIl[0]] = lIlIlllIlIIlllI("S4SVMoYlVQVk7TT9uddQCk4DGYKOe+of", "DlIvt");
        lIIllIIIIlIII[lIIllIIIIlIIl[12]] = lIlIlllIlIIlllI("jcpfNy2MbS8=", "ibUXr");
    }

    private static boolean lIlIlllIlIlIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public InventorySetup r() {
        InventorySetup add = new InventorySetup().add(this.c.food().w(), this.c.foodAmount()).add(this.c.cure().u(), this.c.amountOfRemedies()).add(this.c.teleportItem().u(), lIIllIIIIlIIl[0]).add(this.c.rangePotion().u(), this.c.rangePotionAmount()).add(lIIllIIIIlIIl[4], this.c.prayerPotionAmount());
        if (lIlIlllIlIlIIIl(this.c.boneCrusher() ? 1 : 0)) {
            add.add(lIIllIIIIlIIl[5], lIIllIIIIlIIl[0]);
            "".length();
        }
        if (lIlIlllIlIlIIIl(this.c.stamina() ? 1 : 0)) {
            add.add(item -> {
                if (lIlIlllIlIlIlIl(item.getId(), lIIllIIIIlIIl[10]) && lIlIlllIlIlIllI(item.getId(), lIIllIIIIlIIl[11])) {
                    ?? r0 = lIIllIIIIlIIl[0];
                    "".length();
                    return "  ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIllIIIIlIIl[2];
            }, lIIllIIIIlIIl[0]);
            "".length();
        }
        if (lIlIlllIlIlIIIl(this.c.teleportItem().D() ? 1 : 0)) {
            add.add(item2 -> {
                if (!lIlIlllIlIlIlII(item2.getId(), lIIllIIIIlIIl[8]) || lIlIlllIlIlIIll(item2.getId(), lIIllIIIIlIIl[9])) {
                    ?? r0 = lIIllIIIIlIIl[0];
                    "".length();
                    return (-" ".length()) == "   ".length() ? " ".length() & (" ".length() ^ (-1)) : r0;
                }
                return lIIllIIIIlIIl[2];
            }, lIIllIIIIlIIl[0]);
            "".length();
        }
        if (lIlIlllIlIlIIIl(this.c.alch() ? 1 : 0)) {
            if (lIlIlllIlIlIIIl(this.c.runePouch() ? 1 : 0)) {
                add.add(item3 -> {
                    return item3.getName().toLowerCase().contains(lIIllIIIIlIII[lIIllIIIIlIIl[2]]);
                }, lIIllIIIIlIIl[0]);
                "".length();
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else {
                add.add(lIIllIIIIlIIl[6]);
                "".length();
                add.add(lIIllIIIIlIIl[7]);
                "".length();
            }
        }
        return add;
    }

    private static boolean lIlIlllIlIlIlII(int i, int i2) {
        return i != i2;
    }

    public WorldPoint a(WorldPoint worldPoint, NPC npc) {
        if (lIlIlllIlIlIIlI(a(npc))) {
            return null;
        }
        return a(npc).stream().min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(worldPoint);
        })).orElse(null);
    }

    public g t() {
        return this.c.room();
    }

    public WorldArea p() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        return new WorldArea(worldLocation.getX() - lIIllIIIIlIIl[0], worldLocation.getY() - lIIllIIIIlIIl[0], lIIllIIIIlIIl[1], lIIllIIIIlIIl[1], lIIllIIIIlIIl[2]);
    }

    private static boolean lIlIlllIlIlIllI(int i, int i2) {
        return i <= i2;
    }

    public Set<List<WorldPoint>> n() {
        HashSet hashSet = new HashSet();
        for (NPC npc : NPCs.getAll(npc2 -> {
            if (lIlIlllIlIlIIIl(npc2.getName().equals(lIIllIIIIlIII[lIIllIIIIlIIl[12]]) ? 1 : 0) && lIlIlllIlIlIIll(npc2.getAnimation(), lIIllIIIIlIIl[13])) {
                ?? r0 = lIIllIIIIlIIl[0];
                "".length();
                return ((166 ^ 138) & ((189 ^ 145) ^ (-1))) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIIlIIl[2];
        })) {
            WorldPoint worldLocation = npc.getWorldLocation();
            hashSet.add(new WorldArea(worldLocation.getX() - lIIllIIIIlIIl[0], worldLocation.getY() - lIIllIIIIlIIl[0], lIIllIIIIlIIl[1], lIIllIIIIlIIl[1], lIIllIIIIlIIl[2]).toWorldPointList());
            "".length();
            "".length();
            if ("   ".length() > (154 ^ 158)) {
                return null;
            }
        }
        return hashSet;
    }

    public List<WorldPoint> a(NPC npc) {
        if (lIlIlllIlIlIIlI(npc)) {
            return null;
        }
        return npc.getWorldArea().toWorldPointList();
    }

    private static boolean lIlIlllIlIlIlIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIlIlllIlIlIIII() {
        lIIllIIIIlIIl = new int[26];
        lIIllIIIIlIIl[0] = " ".length();
        lIIllIIIIlIIl[1] = "   ".length();
        lIIllIIIIlIIl[2] = ((169 ^ 185) ^ (41 ^ 105)) & (((((152 + 198) - 199) + 93) ^ (((35 + 10) - (-92)) + 27)) ^ (-" ".length()));
        lIIllIIIIlIIl[3] = (-14) & 7165;
        lIIllIIIIlIIl[4] = (-29697) & 32130;
        lIIllIIIIlIIl[5] = (-1156) & 14271;
        lIIllIIIIlIIl[6] = (-14598) & 15151;
        lIIllIIIIlIIl[7] = (-((-1577) & 24431)) & (-9225) & 32639;
        lIIllIIIIlIIl[8] = (-((-513) & 16123)) & (-16386) & 32767;
        lIIllIIIIlIIl[9] = (-((-4204) & 22767)) & (-4097) & 31743;
        lIIllIIIIlIIl[10] = (-((-4177) & 24309)) & (-9) & 32765;
        lIIllIIIIlIIl[11] = (-19489) & 32119;
        lIIllIIIIlIIl[12] = "  ".length();
        lIIllIIIIlIIl[13] = (-((-14613) & 15645)) & (-8193) & 16383;
        lIIllIIIIlIIl[14] = (-((-2661) & 28269)) & (-1) & 32765;
        lIIllIIIIlIIl[15] = (-((-9433) & 15611)) & (-8917) & 16383;
        lIIllIIIIlIIl[16] = (-(((95 + 33) - 61) + 64)) & (-18433) & 28655;
        lIIllIIIIlIIl[17] = (250 ^ 141) ^ (((45 + 26) - (-9)) + 47);
        lIIllIIIIlIIl[18] = (-((-511) & 27135)) & (-65) & 27997;
        lIIllIIIIlIIl[19] = (-18577) & 19902;
        lIIllIIIIlIIl[20] = (-22545) & 32638;
        lIIllIIIIlIIl[21] = (-((-1831) & 20391)) & (-1) & 28655;
        lIIllIIIIlIIl[22] = (-14420) & 15711;
        lIIllIIIIlIIl[23] = (-2178) & 12273;
        lIIllIIIIlIIl[24] = (-19163) & 20475;
        lIIllIIIIlIIl[25] = (-6145) & 16241;
    }

    static {
        lIlIlllIlIlIIII();
        lIlIlllIlIIllll();
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
        return this.c.room().x().contains(Players.getLocal());
    }

    private static boolean lIlIlllIlIlIIlI(Object obj) {
        return obj == null;
    }

    public NPC o() {
        return NPCs.getNearest(npc -> {
            if (lIlIlllIlIlIIIl(npc.getName().equals(lIIllIIIIlIII[lIIllIIIIlIIl[0]]) ? 1 : 0) && lIlIlllIlIlIlll(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = lIIllIIIIlIIl[0];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIIlIIl[2];
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean q() {
        NPC o = o();
        if (!lIlIlllIlIlIIlI(o) && lIlIlllIlIlIIll(o.getAnimation(), lIIllIIIIlIIl[3])) {
            ?? r0 = lIIllIIIIlIIl[0];
            "".length();
            return "   ".length() > "   ".length() ? ((((186 + 130) - 213) + 116) ^ (((136 + 29) - 66) + 38)) & (((((51 + 42) - (-83)) + 66) ^ (((141 + 50) - 172) + 141)) ^ (-" ".length())) : r0;
        }
        return lIIllIIIIlIIl[2];
    }

    private static String lIlIlllIlIIlllI(String llllllllllllllIllllIIlIlIlllIlll, String llllllllllllllIllllIIlIlIlllIllI) {
        try {
            SecretKeySpec llllllllllllllIllllIIlIlIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIIIlIIl[12], llllllllllllllIllllIIlIlIllllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlIlIllllIII) {
            llllllllllllllIllllIIlIlIllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIlIIll(int i, int i2) {
        return i == i2;
    }
}
