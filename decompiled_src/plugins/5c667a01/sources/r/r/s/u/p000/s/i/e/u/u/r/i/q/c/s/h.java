package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Restoring prayer at Ardougne Monastery", priority = 2147483597, blocking = true)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.h  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/h.class */
public class h extends i {
    private static /* synthetic */ int[] lIIlIllIIIIll;
    private static /* synthetic */ String[] lIIlIllIIIIlI;

    private static void lIlIllIIlIlIlll() {
        lIIlIllIIIIll = new int[9];
        lIIlIllIIIIll[0] = ((131 ^ 197) ^ (125 ^ 33)) & (((11 ^ 105) ^ (37 ^ 93)) ^ (-" ".length()));
        lIIlIllIIIIll[1] = "  ".length();
        lIIlIllIIIIll[2] = " ".length();
        lIIlIllIIIIll[3] = 65 ^ 75;
        lIIlIllIIIIll[4] = "   ".length();
        lIIlIllIIIIll[5] = 78 ^ 74;
        lIIlIllIIIIll[6] = (90 ^ 71) ^ (90 ^ 66);
        lIIlIllIIIIll[7] = (61 ^ 111) ^ (205 ^ 153);
        lIIlIllIIIIll[8] = 66 ^ 69;
    }

    static {
        lIlIllIIlIlIlll();
        lIlIllIIlIlIllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.i
    public boolean d(int i) {
        int[] mapRegions = Static.getClient().getMapRegions();
        int length = mapRegions.length;
        int i2 = lIIlIllIIIIll[0];
        while (lIlIllIIlIlllII(i2, length)) {
            if (lIlIllIIlIlllIl(mapRegions[i2], i)) {
                return lIIlIllIIIIll[2];
            }
            i2++;
            "".length();
            if ("  ".length() < (-" ".length())) {
                return ((103 ^ 72) ^ (50 ^ 75)) & (((((136 + 163) - 104) + 32) ^ (((156 + 146) - 288) + 167)) ^ (-" ".length()));
            }
        }
        return lIIlIllIIIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.i
    protected boolean a() {
        if (!lIlIllIIlIllIII(this.b.ardyCloak() ? 1 : 0) && !lIlIllIIlIllIIl(Skills.getBoostedLevel(Skill.PRAYER), Skills.getLevel(Skill.PRAYER))) {
            if (!lIlIllIIlIllIII(d(d.G) ? 1 : 0)) {
                if (lIlIllIIlIllIll(Players.getLocal().distanceTo(d.H), lIIlIllIIIIll[3])) {
                    Movement.setDestination(d.H);
                    return lIIlIllIIIIll[2];
                }
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIlIllIIlIllllI(tileObject.getName().equals(lIIlIllIIIIlI[lIIlIllIIIIll[4]]) ? 1 : 0)) {
                        String[] strArr = new String[lIIlIllIIIIll[2]];
                        strArr[lIIlIllIIIIll[0]] = lIIlIllIIIIlI[lIIlIllIIIIll[5]];
                        if (lIlIllIIlIllllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = lIIlIllIIIIll[2];
                            "".length();
                            return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIIlIllIIIIll[0];
                });
                if (lIlIllIIlIllIlI(nearest)) {
                    return lIIlIllIIIIll[0];
                }
                nearest.interact(lIIlIllIIIIlI[lIIlIllIIIIll[1]]);
                return lIIlIllIIIIll[2];
            }
            Item first = Inventory.getFirst(item -> {
                return item.getName().startsWith(lIIlIllIIIIlI[lIIlIllIIIIll[7]]);
            });
            if (lIlIllIIlIllIlI(first)) {
                first = Equipment.getFirst(item2 -> {
                    return item2.getName().startsWith(lIIlIllIIIIlI[lIIlIllIIIIll[6]]);
                });
            }
            if (lIlIllIIlIllIlI(first)) {
                return lIIlIllIIIIll[0];
            }
            String[] strArr = new String[lIIlIllIIIIll[1]];
            strArr[lIIlIllIIIIll[0]] = lIIlIllIIIIlI[lIIlIllIIIIll[0]];
            strArr[lIIlIllIIIIll[2]] = lIIlIllIIIIlI[lIIlIllIIIIll[2]];
            first.interact(strArr);
            return lIIlIllIIIIll[2];
        }
        return lIIlIllIIIIll[0];
    }

    private static boolean lIlIllIIlIllIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIllIIlIllIlI(Object obj) {
        return obj == null;
    }

    private static String lIlIllIIlIlIlII(String llllllllllllllIllllIllIIIIIIIlIl, String llllllllllllllIllllIllIIIIIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIllIIIIIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIllIIIIIIIlll.init(lIIlIllIIIIll[1], secretKeySpec);
            return new String(llllllllllllllIllllIllIIIIIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllIIIIIIIllI) {
            llllllllllllllIllllIllIIIIIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIlIllIII(int i) {
        return i == 0;
    }

    private static boolean lIlIllIIlIllIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIllIIlIlllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIllIIlIllllI(int i) {
        return i != 0;
    }

    private static boolean lIlIllIIlIlllII(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllIIlIlIllI() {
        lIIlIllIIIIlI = new String[lIIlIllIIIIll[8]];
        lIIlIllIIIIlI[lIIlIllIIIIll[0]] = lIlIllIIlIlIlII("sKyrPASwVGTVTmKBo2nDTZGxRU25S5Fu", "GWdEf");
        lIIlIllIIIIlI[lIIlIllIIIIll[2]] = lIlIllIIlIlIlIl("AiAkMRQ7KjgpRxsqJjUXID0+", "OOJPg");
        lIIlIllIIIIlI[lIIlIllIIIIll[1]] = lIlIllIIlIlIlII("NQ3lI/1sKeY=", "mrNqK");
        lIIlIllIIIIlI[lIIlIllIIIIll[4]] = lIlIllIIlIlIlII("cV2nHT8oh+o=", "FNOKe");
        lIIlIllIIIIlI[lIIlIllIIIIll[5]] = lIlIllIIlIlIlII("hM09Q8PgTL8=", "CmYcB");
        lIIlIllIIIIlI[lIIlIllIIIIll[6]] = lIlIllIIlIlIlIl("IjYsCzwEKi1EKg8rKQ8=", "cDHdI");
        lIIlIllIIIIlI[lIIlIllIIIIll[7]] = lIlIllIIlIlIlIl("BCQFCQMiOARGFSk5AA0=", "EVafv");
    }

    private static String lIlIllIIlIlIlIl(String llllllllllllllIllllIllIIIIIlIlIl, String llllllllllllllIllllIllIIIIIllIIl) {
        String llllllllllllllIllllIllIIIIIlIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIllIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIllIIIIIllIIl.toCharArray();
        int llllllllllllllIllllIllIIIIIlIllI = lIIlIllIIIIll[0];
        char[] charArray2 = llllllllllllllIllllIllIIIIIlIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIllIIIIll[0];
        while (lIlIllIIlIlllII(i, length)) {
            char llllllllllllllIllllIllIIIIIllIll = charArray2[i];
            sb.append((char) (llllllllllllllIllllIllIIIIIllIll ^ charArray[llllllllllllllIllllIllIIIIIlIllI % charArray.length]));
            "".length();
            llllllllllllllIllllIllIIIIIlIllI++;
            i++;
            "".length();
            if ((((118 ^ 3) ^ (33 ^ 22)) & (((245 ^ 140) ^ (122 ^ 65)) ^ (-" ".length()))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
