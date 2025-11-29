package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@Singleton
@TaskDesc(name = "Cooking food", priority = 4, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.B  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/B.class */
public class B extends AbstractC0013n {
    private static /* synthetic */ int[] llIIlllIlIll;
    private /* synthetic */ int bP;
    private static /* synthetic */ String[] llIIlllIlIlI;

    private static boolean lllllllllIllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        C0012m av = this.ba.V().av();
        List all = TileItems.getAll(tileItem -> {
            if (lllllllllIllll(av.e(tileItem.getWorldLocation()) ? 1 : 0) && lllllllllIllll(EnumC0008i.FISH.aA().contains(Integer.valueOf(tileItem.getId())) ? 1 : 0)) {
                ?? r0 = llIIlllIlIll[0];
                "".length();
                return (((66 ^ 43) ^ (7 ^ 63)) & (((49 ^ 115) ^ (167 ^ 180)) ^ (-" ".length()))) != 0 ? ((((130 + 8) - 71) + 130) ^ (((129 + 98) - 91) + 9)) & (((172 ^ 151) ^ (20 ^ 123)) ^ (-" ".length())) : r0;
            }
            return llIIlllIlIll[1];
        });
        if (lllllllllIlIlI(all.size()) && lllllllllIlIlI(Inventory.getFreeSlots())) {
            ((TileItem) all.get(llIIlllIlIll[1])).interact(llIIlllIlIlI[llIIlllIlIll[1]]);
            av.l(TileItems.getAll(tileItem2 -> {
                if (lllllllllIllll(av.e(tileItem2.getWorldLocation()) ? 1 : 0) && lllllllllIllll(EnumC0008i.FISH.aA().contains(Integer.valueOf(tileItem2.getId())) ? 1 : 0)) {
                    ?? r0 = llIIlllIlIll[0];
                    "".length();
                    return (6 ^ 2) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlllIlIll[1];
            }).size());
            return llIIlllIlIll[0];
        }
        av.l(all.size());
        int aC = EnumC0008i.FISH.aC();
        if (lllllllllIlIll(aC)) {
            this.bP = llIIlllIlIll[2];
            return llIIlllIlIll[1];
        } else if (lllllllllIllII(aC, this.bP)) {
            this.bP = aC;
            Time.sleepTick();
            "".length();
            return llIIlllIlIll[0];
        } else {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                return C0004e.aE.contains(Integer.valueOf(tileObject.getId()));
            });
            if (!lllllllllIllIl(nearest) && !lllllllllIllIl(Players.getLocal())) {
                if (lllllllllIllII(Skills.getBoostedLevel(Skill.HITPOINTS), Skills.getLevel(Skill.HITPOINTS) - llIIlllIlIll[3])) {
                    Item first = Inventory.getFirst(item -> {
                        return C0004e.aH.contains(Integer.valueOf(item.getId()));
                    });
                    if (lllllllllIlllI(first)) {
                        first.interact(llIIlllIlIlI[llIIlllIlIll[0]]);
                    }
                }
                nearest.interact(llIIlllIlIlI[llIIlllIlIll[4]]);
                return llIIlllIlIll[0];
            }
            return llIIlllIlIll[1];
        }
    }

    private static void lllllllllIlIIl() {
        llIIlllIlIll = new int[7];
        llIIlllIlIll[0] = " ".length();
        llIIlllIlIll[1] = ((113 ^ 83) ^ (23 ^ 87)) & (((((33 + 100) - (-51)) + 59) ^ (((86 + 14) - 21) + 66)) ^ (-" ".length()));
        llIIlllIlIll[2] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        llIIlllIlIll[3] = (98 ^ 10) ^ (221 ^ 161);
        llIIlllIlIll[4] = "  ".length();
        llIIlllIlIll[5] = "   ".length();
        llIIlllIlIll[6] = (((4 + 133) - 89) + 87) ^ (((44 + 87) - 71) + 83);
    }

    private static boolean lllllllllIllIl(Object obj) {
        return obj == null;
    }

    private static String lllllllllIIllI(String lllllllllllllllIlIIlIIIlIllIlIll, String lllllllllllllllIlIIlIIIlIllIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIIIlIllIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIIIlIllIllIl.init(llIIlllIlIll[4], secretKeySpec);
            return new String(lllllllllllllllIlIIlIIIlIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIIlIllIllII) {
            lllllllllllllllIlIIlIIIlIllIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllllIlIll(int i) {
        return i == 0;
    }

    private static boolean lllllllllIlIlI(int i) {
        return i > 0;
    }

    private static boolean lllllllllIlllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlllIlIll[0]];
        enumC0003dArr[llIIlllIlIll[1]] = EnumC0003d.PREPARE_BOSS_FIGHT;
        this.bP = llIIlllIlIll[2];
    }

    private static String lllllllllIIlIl(String lllllllllllllllIlIIlIIIlIlIIlllI, String lllllllllllllllIlIIlIIIlIlIIllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIIIlIlIIllII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIIIlIlIIllIl.toCharArray();
        int lllllllllllllllIlIIlIIIlIlIIlIlI = llIIlllIlIll[1];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIlIIlIIIlIlIIIIll = charArray2.length;
        int i = llIIlllIlIll[1];
        while (lllllllllIllII(i, lllllllllllllllIlIIlIIIlIlIIIIll)) {
            char lllllllllllllllIlIIlIIIlIlIIllll = charArray2[i];
            lllllllllllllllIlIIlIIIlIlIIllII.append((char) (lllllllllllllllIlIIlIIIlIlIIllll ^ charArray[lllllllllllllllIlIIlIIIlIlIIlIlI % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIIIlIlIIlIlI++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIIIlIlIIllII);
    }

    static {
        lllllllllIlIIl();
        lllllllllIlIII();
    }

    private static void lllllllllIlIII() {
        llIIlllIlIlI = new String[llIIlllIlIll[5]];
        llIIlllIlIlI[llIIlllIlIll[1]] = lllllllllIIlIl("DiI4Eg==", "ZCSwi");
        llIIlllIlIlI[llIIlllIlIll[0]] = lllllllllIIllI("1nDht6il+zQ=", "WUQQC");
        llIIlllIlIlI[llIIlllIlIll[4]] = lllllllllIIlll("yLvUWUwwVTk=", "LAiXn");
    }

    private static boolean lllllllllIllII(int i, int i2) {
        return i < i2;
    }

    private static String lllllllllIIlll(String lllllllllllllllIlIIlIIIlIlIllllI, String lllllllllllllllIlIIlIIIlIlIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIIlIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), llIIlllIlIll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllIlIll[4], lllllllllllllllIlIIlIIIlIllIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIIlIlIllIlI) {
            lllllllllllllllIlIIlIIIlIlIllIlI.printStackTrace();
            return null;
        }
    }
}
