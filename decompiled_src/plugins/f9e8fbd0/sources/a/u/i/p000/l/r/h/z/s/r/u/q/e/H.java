package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Handling house", priority = 10)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.H  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/H.class */
public class H extends E {
    private static /* synthetic */ String[] lIllIlllIIllI;
    private static /* synthetic */ int[] lIllIlllIlIII;

    private static boolean llIIlIIllIIIlIl(int i, int i2) {
        return i < i2;
    }

    private static void llIIlIIlIllllll() {
        lIllIlllIlIII = new int[9];
        lIllIlllIlIII[0] = (103 ^ 112) & ((74 ^ 93) ^ (-1));
        lIllIlllIlIII[1] = (-4369) & 4958;
        lIllIlllIlIII[2] = (201 ^ 160) ^ (33 ^ 123);
        lIllIlllIlIII[3] = " ".length();
        lIllIlllIlIII[4] = (-((-16450) & 18631)) & (-75) & 11263;
        lIllIlllIlIII[5] = (-((-97) & 19697)) & (-4097) & 32703;
        lIllIlllIlIII[6] = "  ".length();
        lIllIlllIlIII[7] = "   ".length();
        lIllIlllIlIII[8] = (242 ^ 166) ^ (101 ^ 57);
    }

    private static String llIIlIIlIlllIIl(String llllllllllllllIllIIIlIIlIIIIlIll, String llllllllllllllIllIIIlIIlIIIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lIllIlllIlIII[8]), "DES");
            Cipher llllllllllllllIllIIIlIIlIIIIllIl = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIIlIIIIllIl.init(lIllIlllIlIII[6], secretKeySpec);
            return new String(llllllllllllllIllIIIlIIlIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIIlIIIIllII) {
            llllllllllllllIllIIIlIIlIIIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIllIIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        llIIlIIlIllllll();
        llIIlIIlIllllII();
    }

    private static String llIIlIIlIlllIll(String llllllllllllllIllIIIlIIIlllllllI, String llllllllllllllIllIIIlIIIllllllIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIlIIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIIllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlllIlIII[6], llllllllllllllIllIIIlIIlIIIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIIIllllllll) {
            llllllllllllllIllIIIlIIIllllllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIllIIIllI(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIlIIllIIIlll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.E
    public boolean run() {
        if (!llIIlIIllIIIIII(ag() ? 1 : 0) || llIIlIIllIIIIII(ae().needsToBank() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        if ((!llIIlIIllIIIIIl(Inventory.getCount(item -> {
            String str = lIllIlllIIllI[lIllIlllIlIII[6]];
            return item.hasAction((v1) -> {
                return r1.equals(v1);
            });
        }), this.X.multiple()) || !llIIlIIllIIIIlI(this.X.multiple())) && !llIIlIIllIIIIlI(ad() ? 1 : 0) && !llIIlIIllIIIIII(this.Z.isInInstancedRegion() ? 1 : 0)) {
            if (!llIIlIIllIIIIlI(Players.getLocal().isIdle() ? 1 : 0) || llIIlIIllIIIIll(Static.getClient().getGameState(), GameState.LOADING)) {
                return lIllIlllIlIII[0];
            }
            if (llIIlIIllIIIIlI(Widgets.isVisible(Widgets.get(lIllIlllIlIII[1], lIllIlllIlIII[0])) ? 1 : 0)) {
                Keyboard.type(lIllIlllIlIII[2]);
                return lIllIlllIlIII[3];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIIlIIllIIIlII(tileObject.getName()) && llIIlIIllIIIIlI(tileObject.getName().contains(lIllIlllIIllI[lIllIlllIlIII[3]]) ? 1 : 0)) {
                    ?? r0 = lIllIlllIlIII[3];
                    "".length();
                    return (-" ".length()) >= (14 ^ 10) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIlllIlIII[0];
            });
            if (llIIlIIllIIIlII(nearest)) {
                nearest.interact(lIllIlllIIllI[lIllIlllIlIII[0]]);
                return lIllIlllIlIII[3];
            }
            return lIllIlllIlIII[0];
        }
        return lIllIlllIlIII[0];
    }

    private static String llIIlIIlIlllIlI(String llllllllllllllIllIIIlIIlIIIllIll, String llllllllllllllIllIIIlIIlIIIlllll) {
        String llllllllllllllIllIIIlIIlIIIllIll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIlIIlIIIlllll.toCharArray();
        int llllllllllllllIllIIIlIIlIIIlllII = lIllIlllIlIII[0];
        char[] charArray2 = llllllllllllllIllIIIlIIlIIIllIll2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlllIlIII[0];
        while (llIIlIIllIIIlIl(i, length)) {
            char llllllllllllllIllIIIlIIlIIlIIIIl = charArray2[i];
            sb.append((char) (llllllllllllllIllIIIlIIlIIlIIIIl ^ charArray[llllllllllllllIllIIIlIIlIIIlllII % charArray.length]));
            "".length();
            llllllllllllllIllIIIlIIlIIIlllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIlIIllIIIIlI(int i) {
        return i != 0;
    }

    private static void llIIlIIlIllllII() {
        lIllIlllIIllI = new String[lIllIlllIlIII[7]];
        lIllIlllIIllI[lIllIlllIlIII[0]] = llIIlIIlIlllIIl("YBrm26pBSYnZudi61vRRTA==", "KEpHB");
        lIllIlllIIllI[lIllIlllIlIII[3]] = llIIlIIlIlllIlI("BQs5FjsjCzwKdw0BNg==", "OnNsW");
        lIllIlllIIllI[lIllIlllIlIII[6]] = llIIlIIlIlllIll("Jk+McZ6+mLE=", "CDMAL");
    }

    private static boolean llIIlIIllIIIlII(Object obj) {
        return obj != null;
    }

    @Inject
    protected H(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, C0019t c0019t) {
        super(squireZulrah, squireZulrahConfig, client, c0019t);
    }

    private static boolean llIIlIIllIIIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlIIllIIIIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    private boolean ag() {
        if (llIIlIIllIIIIII(this.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        int[] mapRegions = this.Z.getMapRegions();
        int length = mapRegions.length;
        int i = lIllIlllIlIII[0];
        while (llIIlIIllIIIlIl(i, length)) {
            int i2 = mapRegions[i];
            if (!llIIlIIllIIIllI(i2, lIllIlllIlIII[4]) || llIIlIIllIIIlll(i2, lIllIlllIlIII[5])) {
                return lIllIlllIlIII[3];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((128 ^ 171) ^ (49 ^ 47)) & (((((107 + 128) - 219) + 228) ^ (((33 + 5) - (-134)) + 21)) ^ (-" ".length()));
            }
        }
        return lIllIlllIlIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.E
    public boolean ac() {
        return lIllIlllIlIII[0];
    }
}
