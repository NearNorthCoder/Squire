package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Placing a cell", priority = 3, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.v  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/v.class */
public class v extends h {
    private static final /* synthetic */ Comparator<TileObject> be;
    private static /* synthetic */ int[] llIIlllIIlll;
    private static /* synthetic */ String[] llIIlllIIllI;

    private static boolean lllllllIIllIll(int i, int i2) {
        return i == i2;
    }

    private static void lllllllIIlIllI() {
        llIIlllIIlll = new int[11];
        llIIlllIIlll[0] = "  ".length();
        llIIlllIIlll[1] = ((((35 + 116) - 23) + 39) ^ (((47 + 83) - 67) + 81)) & (((8 ^ 123) ^ (78 ^ 10)) ^ (-" ".length()));
        llIIlllIIlll[2] = " ".length();
        llIIlllIIlll[3] = (((87 + 107) - 98) + 47) ^ (((55 + 31) - (-14)) + 59);
        llIIlllIIlll[4] = (34 ^ 119) ^ (230 ^ 147);
        llIIlllIIlll[5] = "   ".length();
        llIIlllIIlll[6] = -" ".length();
        llIIlllIIlll[7] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        llIIlllIIlll[8] = (((96 + 61) - 130) + 116) ^ (((21 + 54) - 49) + 113);
        llIIlllIIlll[9] = (((42 + 21) - 23) + 155) ^ (((197 + 130) - 190) + 61);
        llIIlllIIlll[10] = 107 ^ 109;
    }

    private static boolean lllllllIIlllII(Object obj) {
        return obj != null;
    }

    private static String lllllllIIlIIll(String lllllllllllllllIlIIlIllllIlllIll, String lllllllllllllllIlIIlIllllIlllIlI) {
        String lllllllllllllllIlIIlIllllIlllIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIllllIlllIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIllllIlllIlI.toCharArray();
        int lllllllllllllllIlIIlIllllIllIlll = llIIlllIIlll[1];
        char[] charArray2 = lllllllllllllllIlIIlIllllIlllIll2.toCharArray();
        int length = charArray2.length;
        int i = llIIlllIIlll[1];
        while (lllllllIIlllIl(i, length)) {
            char lllllllllllllllIlIIlIllllIlIlllI = charArray2[i];
            lllllllllllllllIlIIlIllllIlllIIl.append((char) (lllllllllllllllIlIIlIllllIlIlllI ^ charArray[lllllllllllllllIlIIlIllllIllIlll % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIllllIllIlll++;
            i++;
            "".length();
            if (((29 ^ 74) ^ (69 ^ 23)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIllllIlllIIl);
    }

    private static boolean lllllllIIlllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIlllIIlll[0]];
        enumC0002cArr[llIIlllIIlll[1]] = EnumC0002c.ACTIVE;
        enumC0002cArr[llIIlllIIlll[2]] = EnumC0002c.FINISHING;
    }

    private static boolean lllllllIIllIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        int i;
        Item e = this.aV.e();
        if (!lllllllIIlIlll(this.aV.g() ? 1 : 0) || lllllllIIllIII(e)) {
            return llIIlllIIlll[1];
        }
        if (lllllllIIlIlll(e.getName().contains(llIIlllIIllI[llIIlllIIlll[1]]) ? 1 : 0) && lllllllIIlIlll(this.aW.craftGuardian() ? 1 : 0)) {
            return llIIlllIIlll[1];
        }
        Player local = Players.getLocal();
        if (!lllllllIIllIIl(SquireGOTRPlugin.f0g.contains(local) ? 1 : 0) || lllllllIIlIlll(SquireGOTRPlugin.h.contains(local) ? 1 : 0)) {
            return llIIlllIIlll[1];
        }
        if (lllllllIIlIlll(e.getName().contains(llIIlllIIllI[llIIlllIIlll[2]]) ? 1 : 0)) {
            i = llIIlllIIlll[3];
            "".length();
            if ((-"   ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIIlllIIlll[4];
        }
        int i2 = i;
        TileObject tileObject = (TileObject) TileObjects.getAll(tileObject2 -> {
            return tileObject2.getName().contains(llIIlllIIllI[llIIlllIIlll[5]]);
        }).stream().min(be.thenComparing((v0) -> {
            return v0.getId();
        }).thenComparing(tileObject3 -> {
            return Integer.valueOf(tileObject3.distanceTo(local));
        })).orElse(null);
        if (!lllllllIIllIII(tileObject) && !lllllllIIllIlI(tileObject.distanceTo(local), i2)) {
            if (lllllllIIlIlll(local.isMoving() ? 1 : 0)) {
                return llIIlllIIlll[2];
            }
            tileObject.interact(llIIlllIIllI[llIIlllIIlll[0]]);
            return llIIlllIIlll[2];
        }
        return llIIlllIIlll[1];
    }

    private static String lllllllIIlIlII(String lllllllllllllllIlIIlIlllllIIlIll, String lllllllllllllllIlIIlIlllllIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlllllIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlllllIIllIl.init(llIIlllIIlll[0], lllllllllllllllIlIIlIlllllIIlllI);
            return new String(lllllllllllllllIlIIlIlllllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllllIIllII) {
            lllllllllllllllIlIIlIlllllIIllII.printStackTrace();
            return null;
        }
    }

    private static void lllllllIIlIlIl() {
        llIIlllIIllI = new String[llIIlllIIlll[10]];
        llIIlllIIllI[llIIlllIIlll[1]] = lllllllIIlIIll("HzUzPCI4IiQpJDQ=", "PCVNA");
        llIIlllIIllI[llIIlllIIlll[2]] = lllllllIIlIIll("ISQiAg==", "vACis");
        llIIlllIIllI[llIIlllIIlll[0]] = lllllllIIlIIll("BSEyBjJ4LjYJOw==", "UMSeW");
        llIIlllIIllI[llIIlllIIlll[5]] = lllllllIIlIlII("yy8kuYBNnXbdgIN1Siuldg==", "ThxWT");
        llIIlllIIllI[llIIlllIIlll[8]] = lllllllIIlIIll("AxoYOA==", "motTM");
        llIIlllIIllI[llIIlllIIlll[9]] = lllllllIIlIlII("Hq1HWdBHEoE=", "IBICi");
    }

    private static boolean lllllllIIlIlll(int i) {
        return i != 0;
    }

    static {
        lllllllIIlIllI();
        lllllllIIlIlIl();
        be = tileObject, tileObject2 -> {
            int healthRatio;
            int healthRatio2;
            NPC nearest = NPCs.getNearest(tileObject.getWorldLocation(), npc -> {
                if (!lllllllIIlllII(npc.getName()) || lllllllIIlIlll(llIIlllIIllI[llIIlllIIlll[9]].equals(npc.getName()) ? 1 : 0)) {
                    ?? r0 = llIIlllIIlll[2];
                    "".length();
                    return ((116 ^ 122) & ((105 ^ 103) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlllIIlll[1];
            });
            NPC nearest2 = NPCs.getNearest(tileObject2.getWorldLocation(), npc2 -> {
                if (!lllllllIIlllII(npc2.getName()) || lllllllIIlIlll(llIIlllIIllI[llIIlllIIlll[8]].equals(npc2.getName()) ? 1 : 0)) {
                    ?? r0 = llIIlllIIlll[2];
                    "".length();
                    return "   ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlllIIlll[1];
            });
            if (lllllllIIllIII(nearest) && lllllllIIllIII(nearest2)) {
                return llIIlllIIlll[1];
            }
            if (lllllllIIllIII(nearest)) {
                return llIIlllIIlll[2];
            }
            if (lllllllIIllIII(nearest2)) {
                return llIIlllIIlll[6];
            }
            if (lllllllIIllIll(nearest.getHealthRatio(), llIIlllIIlll[6])) {
                healthRatio = llIIlllIIlll[7];
                "".length();
                if ((-"  ".length()) >= 0) {
                    return (179 ^ 172) & ((145 ^ 142) ^ (-1));
                }
            } else {
                healthRatio = nearest.getHealthRatio();
            }
            int i = healthRatio;
            if (lllllllIIllIll(nearest2.getHealthRatio(), llIIlllIIlll[6])) {
                healthRatio2 = llIIlllIIlll[7];
                "".length();
                if ((((106 ^ 76) ^ "   ".length()) & (((77 ^ 113) ^ (100 ^ 125)) ^ (-" ".length()))) != 0) {
                    return ("   ".length() ^ (75 ^ 106)) & (((((6 + 48) - (-97)) + 13) ^ (((103 + 26) - 88) + 93)) ^ (-" ".length()));
                }
            } else {
                healthRatio2 = nearest2.getHealthRatio();
            }
            return Integer.compare(i, healthRatio2);
        };
    }

    private static boolean lllllllIIllIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lllllllIIllIIl(int i) {
        return i == 0;
    }
}
