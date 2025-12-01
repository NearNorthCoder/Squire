package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.scene.Tiles;
@TaskDesc(name = "Setup Box Trap", priority = 20, blocking = true)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.n  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/n.class */
public class n extends j {
    private final /* synthetic */ int[] y;
    private /* synthetic */ long A;
    private final /* synthetic */ EnumC0003d x;
    private static /* synthetic */ int[] llllIIIIlllI;
    private static /* synthetic */ String[] llllIIIIllIl;
    private final /* synthetic */ int[] z;

    private static boolean lIIIlllIllIlIIl(int i) {
        return i > 0;
    }

    private static void lIIIlllIllIIIll() {
        llllIIIIlllI = new int[19];
        llllIIIIlllI[0] = (69 ^ 123) ^ (13 ^ 55);
        llllIIIIlllI[1] = ((((5 + 32) - (-49)) + 75) ^ (((111 + 90) - 69) + 38)) & (((((176 + 168) - 185) + 27) ^ (((89 + 107) - 32) + 13)) ^ (-" ".length()));
        llllIIIIlllI[2] = (((112 ^ 6) + (((84 + 29) - 87) + 201)) - (((10 + 108) - 38) + 53)) + (143 ^ 170);
        llllIIIIlllI[3] = " ".length();
        llllIIIIlllI[4] = (((15 ^ 8) + (((61 + 41) - (-24)) + 15)) - (-(33 ^ 103))) + (54 ^ 23);
        llllIIIIlllI[5] = "  ".length();
        llllIIIIlllI[6] = ((227 + 242) - 435) + 219;
        llllIIIIlllI[7] = "   ".length();
        llllIIIIlllI[8] = (((193 ^ 135) + (((144 + 69) - 141) + 80)) - (((97 + 86) - 89) + 119)) + ((186 + 14) - 137) + 183;
        llllIIIIlllI[9] = (-(59 ^ 122)) & (-16385) & 22781;
        llllIIIIlllI[10] = (-1793) & 8124;
        llllIIIIlllI[11] = (-((-1047) & 26391)) & (-33) & 30588;
        llllIIIIlllI[12] = (-27268) & 32475;
        llllIIIIlllI[13] = (-16550) & 26557;
        llllIIIIlllI[14] = (-18501) & 19446;
        llllIIIIlllI[15] = (-24581) & 26519;
        llllIIIIlllI[16] = (-10523) & 15771;
        llllIIIIlllI[17] = (-270) & 1517;
        llllIIIIlllI[18] = (((18 + 92) - 102) + 125) ^ (((84 + 39) - 87) + 105);
    }

    private static int lIIIlllIllIIlII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static String lIIIlllIllIIIII(String lllllllllllllllIIlIllIIllIlIIIII, String lllllllllllllllIIlIllIIllIIlllll) {
        String lllllllllllllllIIlIllIIllIlIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIIllIIlllll.toCharArray();
        int lllllllllllllllIIlIllIIllIIlllII = llllIIIIlllI[1];
        char[] charArray2 = lllllllllllllllIIlIllIIllIlIIIII2.toCharArray();
        int length = charArray2.length;
        int i = llllIIIIlllI[1];
        while (lIIIlllIllIllIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIllIIllIIlllII % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIIllIIlllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        Player local = Players.getLocal();
        if (lIIIlllIllIIlIl(y().b() ? 1 : 0) && lIIIlllIllIIllI(local.getAnimation(), llllIIIIlllI[11])) {
            return llllIIIIlllI[1];
        }
        if (!lIIIlllIllIIllI(local.getAnimation(), llllIIIIlllI[11]) || lIIIlllIllIIlll(local.getAnimation(), llllIIIIlllI[12])) {
            if (lIIIlllIllIlIII(z().tickManipulation() ? 1 : 0)) {
                tickManipulation();
                "".length();
            }
            return llllIIIIlllI[3];
        } else if (lIIIlllIllIlIIl(lIIIlllIllIIlII(this.A - 2, y().i().get()))) {
            Movement.walkTo(this.x.l());
            "".length();
            return llllIIIIlllI[3];
        } else if (lIIIlllIllIlIlI(z().method(), EnumC0004e.CHINS)) {
            WorldPoint a = y().a(this.x);
            if (lIIIlllIllIlIll(a)) {
                return llllIIIIlllI[1];
            }
            Tile at = Tiles.getAt(a);
            if (lIIIlllIllIllII(at) && lIIIlllIllIllII(at.getGroundItems())) {
                List list = (List) at.getGroundItems().stream().filter(tileItem -> {
                    if (lIIIlllIllIIlll(tileItem.getId(), llllIIIIlllI[13])) {
                        ?? r0 = llllIIIIlllI[3];
                        "".length();
                        return (-"  ".length()) >= 0 ? ((51 ^ 27) ^ (35 ^ 25)) & (((55 ^ 58) ^ (149 ^ 138)) ^ (-" ".length())) : r0;
                    }
                    return llllIIIIlllI[1];
                }).collect(Collectors.toList());
                if (lIIIlllIllIIlIl(list.isEmpty() ? 1 : 0)) {
                    ((TileItem) list.get(llllIIIIlllI[1])).interact(llllIIIIllIl[llllIIIIlllI[1]]);
                    this.A = y().i().get() - (local.distanceTo(a) / llllIIIIlllI[5]);
                    return llllIIIIlllI[3];
                }
            }
            if (lIIIlllIllIIlIl(local.getWorldLocation().equals(a) ? 1 : 0)) {
                Movement.walkTo(a, (boolean) llllIIIIlllI[1]);
                "".length();
                return llllIIIIlllI[3];
            }
            int[] iArr = new int[llllIIIIlllI[3]];
            iArr[llllIIIIlllI[1]] = llllIIIIlllI[13];
            Item first = Inventory.getFirst(iArr);
            if (lIIIlllIllIlIll(first)) {
                return llllIIIIlllI[1];
            }
            first.interact(llllIIIIllIl[llllIIIIlllI[3]]);
            this.A = y().i().get();
            return llllIIIIlllI[3];
        } else {
            return llllIIIIlllI[3];
        }
    }

    private static boolean lIIIlllIllIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private boolean tickManipulation() {
        int[] iArr = new int[llllIIIIlllI[3]];
        iArr[llllIIIIlllI[1]] = llllIIIIlllI[14];
        Item first = Inventory.getFirst(iArr);
        Item first2 = Inventory.getFirst(this.z);
        if (lIIIlllIllIllII(first2) && lIIIlllIllIllII(first)) {
            int[] iArr2 = new int[llllIIIIlllI[3]];
            iArr2[llllIIIIlllI[1]] = first.getId();
            Inventory.getFirst(iArr2).useOn(first2);
            return llllIIIIlllI[3];
        }
        Item first3 = Inventory.getFirst(this.y);
        int[] iArr3 = new int[llllIIIIlllI[3]];
        iArr3[llllIIIIlllI[1]] = llllIIIIlllI[15];
        Item first4 = Inventory.getFirst(iArr3);
        if (lIIIlllIllIllII(first3) && lIIIlllIllIllII(first4)) {
            int[] iArr4 = new int[llllIIIIlllI[3]];
            iArr4[llllIIIIlllI[1]] = first3.getId();
            Inventory.getFirst(iArr4).useOn(first4);
            return llllIIIIlllI[3];
        }
        return llllIIIIlllI[1];
    }

    private static boolean lIIIlllIllIllIl(int i, int i2) {
        return i < i2;
    }

    @Inject
    public n(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.CHINS);
        this.x = z().chinLocation();
        int[] iArr = new int[llllIIIIlllI[0]];
        iArr[llllIIIIlllI[1]] = llllIIIIlllI[2];
        iArr[llllIIIIlllI[3]] = llllIIIIlllI[4];
        iArr[llllIIIIlllI[5]] = llllIIIIlllI[6];
        iArr[llllIIIIlllI[7]] = llllIIIIlllI[8];
        this.y = iArr;
        int[] iArr2 = new int[llllIIIIlllI[5]];
        iArr2[llllIIIIlllI[1]] = llllIIIIlllI[9];
        iArr2[llllIIIIlllI[3]] = llllIIIIlllI[10];
        this.z = iArr2;
        this.A = 0L;
    }

    private static boolean lIIIlllIllIIlIl(int i) {
        return i == 0;
    }

    private static void lIIIlllIllIIIlI() {
        llllIIIIllIl = new String[llllIIIIlllI[5]];
        llllIIIIllIl[llllIIIIlllI[1]] = lIIIlllIllIIIII("CSo/", "EKFte");
        llllIIIIllIl[llllIIIIlllI[3]] = lIIIlllIllIIIIl("ZoimakDVfSw=", "dLKIV");
    }

    private static boolean lIIIlllIllIlIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean A() {
        int animation = Players.getLocal().getAnimation();
        if (!lIIIlllIllIIllI(animation, llllIIIIlllI[16]) || lIIIlllIllIIlll(animation, llllIIIIlllI[17])) {
            ?? r0 = llllIIIIlllI[3];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIIIIlllI[1];
    }

    private static boolean lIIIlllIllIIllI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIlllIllIlIII(int i) {
        return i != 0;
    }

    private static boolean lIIIlllIllIllII(Object obj) {
        return obj != null;
    }

    private static String lIIIlllIllIIIIl(String lllllllllllllllIIlIllIIllIIIlIll, String lllllllllllllllIIlIllIIllIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIllIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), llllIIIIlllI[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIIlllI[5], lllllllllllllllIIlIllIIllIIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIllIIIllII) {
            lllllllllllllllIIlIllIIllIIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIllIIlll(int i, int i2) {
        return i == i2;
    }

    static {
        lIIIlllIllIIIll();
        lIIIlllIllIIIlI();
    }
}
