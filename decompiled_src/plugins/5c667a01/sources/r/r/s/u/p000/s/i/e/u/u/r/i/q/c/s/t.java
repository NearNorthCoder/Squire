package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Killing Giant Rats", priority = 5001)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.t  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/t.class */
public class t extends Task {
    private static /* synthetic */ int[] lIIlIllIllIIl;
    private static /* synthetic */ String[] lIIlIllIllIII;
    private final /* synthetic */ SquireScurriusConfig af;
    private final /* synthetic */ SquireScurrius ae;

    private List<Prayer> x() {
        ArrayList arrayList = new ArrayList();
        if (lIlIllIlIllIIIl(Static.getClient().getVarbitValue(lIIlIllIllIIl[2]), lIIlIllIllIIl[3])) {
            Prayer[] prayerArr = new Prayer[lIIlIllIllIIl[4]];
            prayerArr[lIIlIllIllIIl[0]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArr[lIIlIllIllIIl[1]] = Prayer.ULTIMATE_STRENGTH;
            prayerArr[lIIlIllIllIIl[5]] = Prayer.STEEL_SKIN;
            arrayList.addAll(Arrays.asList(prayerArr));
            "".length();
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        } else {
            arrayList.add(Prayer.PIETY);
            "".length();
        }
        int[] iArr = new int[lIIlIllIllIIl[5]];
        iArr[lIIlIllIllIIl[0]] = d.C;
        iArr[lIIlIllIllIIl[1]] = d.D;
        Projectile nearest = Projectiles.getNearest(iArr);
        if (!lIlIllIlIlIllII(nearest) || !lIlIllIlIllIIlI(nearest.getRemainingCycles(), lIIlIllIllIIl[6])) {
            arrayList.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
        } else if (lIlIllIlIlIlllI(nearest.getId(), d.C)) {
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        } else {
            arrayList.add(Prayer.PROTECT_FROM_MAGIC);
            "".length();
            "".length();
            if (((((136 + 183) - 220) + 89) ^ (((144 + 136) - 254) + 158)) == (-" ".length())) {
                return null;
            }
        }
        return arrayList;
    }

    private static void lIlIllIlIlIlIIl() {
        lIIlIllIllIII = new String[lIIlIllIllIIl[7]];
        lIIlIllIllIII[lIIlIllIllIIl[0]] = lIlIllIlIlIIlll("FMJNorsOUuzPMMNx2wbv8g==", "nBzSS");
        lIIlIllIllIII[lIIlIllIllIIl[1]] = lIlIllIlIlIlIII("MhAiKRQY", "sdVHw");
        lIIlIllIllIII[lIIlIllIllIIl[5]] = lIlIllIlIlIIlll("+YRx2eLcev4=", "TUmJq");
        lIIlIllIllIII[lIIlIllIllIIl[4]] = lIlIllIlIlIlIII("PwsvBBNYEC8e", "xbNjg");
    }

    private static boolean lIlIllIlIllIIII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllIlIlIlIII(String llllllllllllllIllllIlIIlllIlIIll, String llllllllllllllIllllIlIIlllIlIIlI) {
        String llllllllllllllIllllIlIIlllIlIIll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIlllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIIlllIlIIIl = new StringBuilder();
        char[] charArray = llllllllllllllIllllIlIIlllIlIIlI.toCharArray();
        int llllllllllllllIllllIlIIlllIIllll = lIIlIllIllIIl[0];
        char[] charArray2 = llllllllllllllIllllIlIIlllIlIIll2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIllIllIIl[0];
        while (lIlIllIlIllIIII(i, length)) {
            char llllllllllllllIllllIlIIlllIlIlII = charArray2[i];
            llllllllllllllIllllIlIIlllIlIIIl.append((char) (llllllllllllllIllllIlIIlllIlIlII ^ charArray[llllllllllllllIllllIlIIlllIIllll % charArray.length]));
            "".length();
            llllllllllllllIllllIlIIlllIIllll++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIlIIlllIlIIIl);
    }

    private static boolean lIlIllIlIllIIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIllIlIlIllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    public boolean run() {
        if (lIlIllIlIlIlIll(this.ae.c() ? 1 : 0)) {
            return lIIlIllIllIIl[0];
        }
        String[] strArr = new String[lIIlIllIllIIl[1]];
        strArr[lIIlIllIllIIl[0]] = lIIlIllIllIII[lIIlIllIllIIl[0]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlIllIlIlIlIll(this.af.focusRats() ? 1 : 0) && lIlIllIlIlIllII(nearest)) {
            return lIIlIllIllIIl[0];
        }
        for (GraphicsObject graphicsObject : Static.getClient().getGraphicsObjects()) {
            if (lIlIllIlIlIlllI(graphicsObject.getId(), d.B)) {
                return lIIlIllIllIIl[0];
            }
            "".length();
            if ("   ".length() <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        NPC nearest2 = NPCs.getNearest(npc -> {
            if (lIlIllIlIlIllIl(npc.getName().equals(lIIlIllIllIII[lIIlIllIllIIl[4]]) ? 1 : 0) && lIlIllIlIlIlIll(npc.isDead() ? 1 : 0)) {
                ?? r0 = lIIlIllIllIIl[1];
                "".length();
                return (166 ^ 162) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIllIllIIl[0];
        });
        if (!lIlIllIlIlIllll(nearest2)) {
            nearest2.interact(lIIlIllIllIII[lIIlIllIllIIl[1]]);
            return lIIlIllIllIIl[1];
        } else if (lIlIllIlIllIIII(Inventory.getCount(item -> {
            String[] strArr2 = new String[lIIlIllIllIIl[1]];
            strArr2[lIIlIllIllIIl[0]] = lIIlIllIllIII[lIIlIllIllIIl[5]];
            return item.hasAction(strArr2);
        }), this.af.food())) {
            this.ae.e((boolean) lIIlIllIllIIl[1]);
            return lIIlIllIllIIl[1];
        } else {
            return lIIlIllIllIIl[0];
        }
    }

    @Inject
    public t(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ae = squireScurrius;
        this.af = squireScurriusConfig;
    }

    private static void lIlIllIlIlIlIlI() {
        lIIlIllIllIIl = new int[8];
        lIIlIllIllIIl[0] = (139 ^ 154) & ((3 ^ 18) ^ (-1));
        lIIlIllIllIIl[1] = " ".length();
        lIIlIllIllIIl[2] = (-((-337) & 29051)) & (-17) & 32639;
        lIIlIllIllIIl[3] = (16 ^ 121) ^ (42 ^ 75);
        lIIlIllIllIIl[4] = "   ".length();
        lIIlIllIllIIl[5] = "  ".length();
        lIIlIllIllIIl[6] = 176 ^ 174;
        lIIlIllIllIIl[7] = 157 ^ 153;
    }

    private static boolean lIlIllIlIlIllIl(int i) {
        return i != 0;
    }

    static {
        lIlIllIlIlIlIlI();
        lIlIllIlIlIlIIl();
    }

    private static boolean lIlIllIlIllIIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIllIlIlIlIll(int i) {
        return i == 0;
    }

    private static boolean lIlIllIlIlIllII(Object obj) {
        return obj != null;
    }

    private static String lIlIllIlIlIIlll(String llllllllllllllIllllIlIIllIlllllI, String llllllllllllllIllllIlIIllIllllIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIlllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIllIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIIlllIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIIlllIIIIII.init(lIIlIllIllIIl[5], llllllllllllllIllllIlIIlllIIIIIl);
            return new String(llllllllllllllIllllIlIIlllIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIllIllllll) {
            llllllllllllllIllllIlIIllIllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIlIlllI(int i, int i2) {
        return i == i2;
    }
}
