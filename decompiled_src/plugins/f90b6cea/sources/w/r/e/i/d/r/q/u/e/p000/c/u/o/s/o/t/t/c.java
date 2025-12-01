package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Chopping", priority = 25, register = true)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.c  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/c.class */
public class c extends Task {
    private final /* synthetic */ int[] x;
    private static final /* synthetic */ Logger u;
    private final /* synthetic */ int[] y;
    private static /* synthetic */ int[] lIllIIIlIIIIl;
    private final /* synthetic */ SquireWoodcutterConfig v;
    private static /* synthetic */ String[] lIllIIIIlllIl;

    /* renamed from: w  reason: collision with root package name */
    private final /* synthetic */ SquireWoodcutterPlugin f0w;

    @Inject
    public c(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        int[] iArr = new int[lIllIIIlIIIIl[0]];
        iArr[lIllIIIlIIIIl[1]] = lIllIIIlIIIIl[2];
        iArr[lIllIIIlIIIIl[3]] = lIllIIIlIIIIl[4];
        iArr[lIllIIIlIIIIl[5]] = lIllIIIlIIIIl[6];
        iArr[lIllIIIlIIIIl[7]] = lIllIIIlIIIIl[8];
        this.x = iArr;
        int[] iArr2 = new int[lIllIIIlIIIIl[0]];
        iArr2[lIllIIIlIIIIl[1]] = lIllIIIlIIIIl[9];
        iArr2[lIllIIIlIIIIl[3]] = lIllIIIlIIIIl[10];
        iArr2[lIllIIIlIIIIl[5]] = lIllIIIlIIIIl[11];
        iArr2[lIllIIIlIIIIl[7]] = lIllIIIlIIIIl[12];
        this.y = iArr2;
        this.f0w = squireWoodcutterPlugin;
        this.v = squireWoodcutterConfig;
    }

    private static boolean llIIIlIIlIlIlll(int i) {
        return i != 0;
    }

    private static boolean llIIIlIIlIllIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    public boolean run() {
        if (llIIIlIIlIlIlll(this.v.fastTickChop() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        if (!llIIIlIIlIllIII(Bank.isOpen() ? 1 : 0) || llIIIlIIlIlIlll(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        if (llIIIlIIlIlIlll(this.f0w.p() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        if (llIIIlIIlIllIIl(this.v.tree(), a.REDWOOD) && llIIIlIIlIllIII(Static.getClient().getPlane())) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                String[] strArr = new String[lIllIIIlIIIIl[3]];
                strArr[lIllIIIlIIIIl[1]] = lIllIIIIlllIl[lIllIIIlIIIIl[16]];
                return tileObject.hasAction(strArr);
            });
            if (llIIIlIIlIllIlI(nearest)) {
                return lIllIIIlIIIIl[1];
            }
            nearest.interact(lIllIIIIlllIl[lIllIIIlIIIIl[1]]);
            return lIllIIIlIIIIl[3];
        } else if (llIIIlIIlIllIII(this.v.tickChop() ? 1 : 0) && llIIIlIIlIlIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        } else {
            Predicate predicate = str -> {
                if (!llIIIlIIlIllIll(str) || (llIIIlIIlIllIII(str.startsWith(lIllIIIIlllIl[lIllIIIlIIIIl[0]]) ? 1 : 0) && !llIIIlIIlIlIlll(str.equals(lIllIIIIlllIl[lIllIIIlIIIIl[14]]) ? 1 : 0))) {
                    return lIllIIIlIIIIl[1];
                }
                ?? r0 = lIllIIIlIIIIl[3];
                "".length();
                return ((85 ^ 20) ^ (216 ^ 156)) <= 0 ? ((((52 + 188) - 152) + 159) ^ (((106 + 88) - 84) + 60)) & (((173 ^ 142) ^ (1 ^ 127)) ^ (-" ".length())) : r0;
            };
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                if (llIIIlIIlIlIlll(tileObject2.getName().startsWith(this.v.tree().r()) ? 1 : 0) && llIIIlIIlIlllIl(tileObject2.distanceTo(Players.getLocal()), lIllIIIlIIIIl[15]) && llIIIlIIlIlIlll(tileObject2.hasAction(predicate) ? 1 : 0)) {
                    ?? r0 = lIllIIIlIIIIl[3];
                    "".length();
                    return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIIIlIIIIl[1];
            });
            if (!llIIIlIIlIllIll(nearest2) || !llIIIlIIlIlllII(Players.getLocal().distanceTo(this.f0w.o().getCenter()), lIllIIIlIIIIl[13]) || llIIIlIIlIllIII(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                Movement.walkTo(this.f0w.o());
                "".length();
                return lIllIIIlIIIIl[3];
            } else if (!llIIIlIIlIlIlll(this.v.tickChop() ? 1 : 0)) {
                if (llIIIlIIlIlIlll(Movement.shouldWalk() ? 1 : 0)) {
                    nearest2.interact(predicate);
                    sleep(lIllIIIlIIIIl[14]);
                    return lIllIIIlIIIIl[3];
                }
                return lIllIIIlIIIIl[1];
            } else if (llIIIlIIlIllIII(Inventory.contains(this.x) ? 1 : 0) && llIIIlIIlIlIlll(Inventory.contains(this.y) ? 1 : 0)) {
                Log.info(lIllIIIIlllIl[lIllIIIlIIIIl[3]]);
                Inventory.getFirst(this.y).interact(lIllIIIIlllIl[lIllIIIlIIIIl[5]]);
                return lIllIIIlIIIIl[3];
            } else if (llIIIlIIlIllIII(this.f0w.d() ? 1 : 0)) {
                System.out.println(lIllIIIIlllIl[lIllIIIlIIIIl[7]]);
                return lIllIIIlIIIIl[1];
            } else {
                this.f0w.h();
                nearest2.interact(predicate);
                sleep(lIllIIIlIIIIl[7]);
                return lIllIIIlIIIIl[3];
            }
        }
    }

    static {
        llIIIlIIlIlIllI();
        llIIIlIIlIIllII();
        u = LoggerFactory.getLogger(c.class);
    }

    private static String llIIIlIIlIIIllI(String llllllllllllllIllIIllIIIIIllIIIl, String llllllllllllllIllIIllIIIIIllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIIIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIlIIIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIIIIllIIlI) {
            llllllllllllllIllIIllIIIIIllIIlI.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIIlIIIlIl(String llllllllllllllIllIIllIIIIlIIIllI, String llllllllllllllIllIIllIIIIlIIIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIIIIlIIIlII = new StringBuilder();
        char[] charArray = llllllllllllllIllIIllIIIIlIIIlIl.toCharArray();
        int llllllllllllllIllIIllIIIIlIIIIlI = lIllIIIlIIIIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIlIIIIl[1];
        while (llIIIlIIlIlllII(i, length)) {
            llllllllllllllIllIIllIIIIlIIIlII.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIllIIIIlIIIIlI % charArray.length]));
            "".length();
            llllllllllllllIllIIllIIIIlIIIIlI++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIllIIIIlIIIlII);
    }

    private static boolean llIIIlIIlIllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void llIIIlIIlIIllII() {
        lIllIIIIlllIl = new String[lIllIIIlIIIIl[17]];
        lIllIIIIlllIl[lIllIIIlIIIIl[1]] = llIIIlIIlIIIlII("OGtKyAU9dsw4maIE5Z3ofA==", "agNDO");
        lIllIIIIlllIl[lIllIIIlIIIIl[3]] = llIIIlIIlIIIlIl("LCs8EQYGKT5QAAo1Ow==", "oGYph");
        lIllIIIIlllIl[lIllIIIlIIIIl[5]] = llIIIlIIlIIIlII("MUdHDwZfy04=", "CjDIX");
        lIllIIIIlllIl[lIllIIIlIIIIl[7]] = llIIIlIIlIIIllI("AV+eC6Pmq4BaTniSDAmt88yoqgU1bMNIJFWGK/M5Fj3LxsgSbi2EGuRQa9gC8aOa", "BVgoI");
        lIllIIIIlllIl[lIllIIIlIIIIl[0]] = llIIIlIIlIIIlIl("GTwsEQ==", "ZTCaM");
        lIllIIIIlllIl[lIllIIIlIIIIl[14]] = llIIIlIIlIIIllI("gNONqWekriM=", "asooH");
        lIllIIIIlllIl[lIllIIIlIIIIl[16]] = llIIIlIIlIIIllI("crBHR4S4SQXlP0n/CbPfLw==", "Vmlid");
    }

    private static boolean llIIIlIIlIlllII(int i, int i2) {
        return i < i2;
    }

    private static void llIIIlIIlIlIllI() {
        lIllIIIlIIIIl = new int[19];
        lIllIIIlIIIIl[0] = (((89 + 164) - 210) + 146) ^ (((153 + 180) - 261) + 113);
        lIllIIIlIIIIl[1] = ((33 ^ 23) ^ " ".length()) & (((224 ^ 157) ^ (139 ^ 193)) ^ (-" ".length()));
        lIllIIIlIIIIl[2] = (((42 ^ 90) + (251 ^ 169)) - (225 ^ 155)) + ((12 + 55) - (-98)) + 12;
        lIllIIIlIIIIl[3] = " ".length();
        lIllIIIlIIIIl[4] = (((26 ^ 14) + (85 ^ 62)) - (72 ^ 33)) + ((76 + 157) - 53) + 49;
        lIllIIIlIIIIl[5] = "  ".length();
        lIllIIIlIIIIl[6] = ((68 + 74) - 127) + 238;
        lIllIIIlIIIIl[7] = "   ".length();
        lIllIIIlIIIIl[8] = (((((5 + 44) - 39) + 134) + (((76 + 195) - 94) + 22)) - ((-13990) & 14319)) + ((176 + 176) - 343) + 233;
        lIllIIIlIIIIl[9] = ((31 + 30) - 53) + 191;
        lIllIIIlIIIIl[10] = ((10 + 142) - (-3)) + 46;
        lIllIIIlIIIIl[11] = (((201 ^ 184) + (1 ^ 45)) - (((18 + 89) - (-6)) + 20)) + ((124 + 46) - 113) + 122;
        lIllIIIlIIIIl[12] = ((76 + 165) - 179) + 143;
        lIllIIIlIIIIl[13] = (((35 + 69) - 51) + 108) ^ (((50 + 5) - (-96)) + 17);
        lIllIIIlIIIIl[14] = (31 ^ 71) ^ (25 ^ 68);
        lIllIIIlIIIIl[15] = (67 ^ 122) ^ (139 ^ 189);
        lIllIIIlIIIIl[16] = 155 ^ 157;
        lIllIIIlIIIIl[17] = "  ".length() ^ (187 ^ 190);
        lIllIIIlIIIIl[18] = "   ".length() ^ (103 ^ 108);
    }

    private static boolean llIIIlIIlIllIll(Object obj) {
        return obj != null;
    }

    private static boolean llIIIlIIlIllIII(int i) {
        return i == 0;
    }

    private static boolean llIIIlIIlIlllIl(int i, int i2) {
        return i <= i2;
    }

    private static String llIIIlIIlIIIlII(String llllllllllllllIllIIllIIIIlIlIllI, String llllllllllllllIllIIllIIIIlIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), lIllIIIlIIIIl[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIlIIIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIIIlIlIlll) {
            llllllllllllllIllIIllIIIIlIlIlll.printStackTrace();
            return null;
        }
    }
}
