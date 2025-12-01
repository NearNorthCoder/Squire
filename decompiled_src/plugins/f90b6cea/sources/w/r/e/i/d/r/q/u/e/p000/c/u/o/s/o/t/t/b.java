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
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
@TaskDesc(name = "Banking", priority = 100)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.b  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/b.class */
public class b extends Task {
    private final /* synthetic */ SquireWoodcutterPlugin s;
    private static /* synthetic */ String[] lIllIIIIlIIll;
    private static /* synthetic */ int[] lIllIIIIlIlIl;
    private final /* synthetic */ SquireWoodcutterConfig t;

    private static boolean llIIIlIIIlIllll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIlIIIlIllII(int i) {
        return i == 0;
    }

    private static boolean llIIIlIIIlIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIIIlIIIlIIlII(String llllllllllllllIllIIllIIlIlIlIIIl, String llllllllllllllIllIIllIIlIlIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIIlIlIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIIlIlIlIIll.init(lIllIIIIlIlIl[2], secretKeySpec);
            return new String(llllllllllllllIllIIllIIlIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIlIlIlIIlI) {
            llllllllllllllIllIIllIIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIlIlIll(int i) {
        return i != 0;
    }

    private static boolean llIIIlIIIlIlllI(Object obj) {
        return obj != null;
    }

    private static boolean llIIIlIIIllIIII(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIlIIIlIlIlI();
        llIIIlIIIlIlIII();
    }

    @Inject
    public b(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.s = squireWoodcutterPlugin;
        this.t = squireWoodcutterConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v53, types: [boolean] */
    public boolean run() {
        BankLocation nearest;
        if (!llIIIlIIIlIlIll(this.t.bank() ? 1 : 0) || llIIIlIIIlIlIll(this.t.cutLogs() ? 1 : 0)) {
            return lIllIIIIlIlIl[0];
        }
        if (llIIIlIIIlIllII(this.s.p() ? 1 : 0)) {
            if (llIIIlIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                return lIllIIIIlIlIl[1];
            }
            return lIllIIIIlIlIl[0];
        } else if (llIIIlIIIlIlIll(Inventory.isEmpty() ? 1 : 0)) {
            this.s.a((boolean) lIllIIIIlIlIl[0]);
            return lIllIIIIlIlIl[1];
        } else if (llIIIlIIIlIllII(Bank.isOpen() ? 1 : 0)) {
            if (llIIIlIIIlIlIll(Bank.open() ? 1 : 0)) {
                return lIllIIIIlIlIl[1];
            }
            if (llIIIlIIIlIlIll(this.t.fastTickChop() ? 1 : 0)) {
                nearest = BankLocation.FOSSIL_ISLAND_CAMP;
                "".length();
                if ((-" ".length()) > (((((68 + 78) - 77) + 137) ^ (((0 + 6) - (-145)) + 22)) & (((((51 + 57) - 95) + 150) ^ (((10 + 24) - (-113)) + 45)) ^ (-" ".length())))) {
                    return ((85 ^ 56) ^ (177 ^ 139)) & (((142 ^ 157) ^ (238 ^ 170)) ^ (-" ".length()));
                }
            } else {
                nearest = BankLocation.getNearest();
            }
            BankLocation bankLocation = nearest;
            if (!llIIIlIIIlIllIl(this.t.tree(), a.REDWOOD) || !llIIIlIIIlIlIll(Static.getClient().getPlane())) {
                Movement.walkTo(bankLocation.getArea().getCenter());
                "".length();
                return lIllIIIIlIlIl[1];
            }
            TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                String[] strArr = new String[lIllIIIIlIlIl[1]];
                strArr[lIllIIIIlIlIl[0]] = lIllIIIIlIIll[lIllIIIIlIlIl[13]];
                return tileObject.hasAction(strArr);
            });
            if (llIIIlIIIlIlllI(nearest2)) {
                nearest2.interact(lIllIIIIlIIll[lIllIIIIlIlIl[0]]);
                return lIllIIIIlIlIl[1];
            }
            Log.info(lIllIIIIlIIll[lIllIIIIlIlIl[1]]);
            return lIllIIIIlIlIl[0];
        } else {
            if (llIIIlIIIlIlIll(Inventory.contains(item -> {
                return item.getName().contains(lIllIIIIlIIll[lIllIIIIlIlIl[12]]);
            }) ? 1 : 0) && llIIIlIIIlIllII(Inventory.isFull() ? 1 : 0)) {
                Log.info(lIllIIIIlIIll[lIllIIIIlIlIl[2]]);
                String name = Inventory.getFirst(item2 -> {
                    return item2.getName().contains(lIllIIIIlIIll[lIllIIIIlIlIl[11]]);
                }).getName();
                if (llIIIlIIIlIlIll(name.contains(lIllIIIIlIIll[lIllIIIIlIlIl[3]]) ? 1 : 0)) {
                    int[] iArr = new int[lIllIIIIlIlIl[1]];
                    iArr[lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[4];
                    if (llIIIlIIIlIllII(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIllIIIIlIlIl[1]];
                        iArr2[lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[4];
                        if (!llIIIlIIIlIllII(Bank.contains(iArr2) ? 1 : 0)) {
                            Bank.withdraw(lIllIIIIlIlIl[4], lIllIIIIlIlIl[1], Bank.WithdrawMode.ITEM);
                            return lIllIIIIlIlIl[1];
                        }
                        Log.info(lIllIIIIlIIll[lIllIIIIlIlIl[5]]);
                        this.s.forceStop();
                        return lIllIIIIlIlIl[1];
                    }
                }
                if (llIIIlIIIlIlIll(name.contains(lIllIIIIlIIll[lIllIIIIlIlIl[6]]) ? 1 : 0)) {
                    int[] iArr3 = new int[lIllIIIIlIlIl[1]];
                    iArr3[lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[7];
                    if (llIIIlIIIlIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIllIIIIlIlIl[1]];
                        iArr4[lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[7];
                        if (!llIIIlIIIlIllII(Bank.contains(iArr4) ? 1 : 0)) {
                            Bank.withdraw(lIllIIIIlIlIl[7], lIllIIIIlIlIl[1], Bank.WithdrawMode.ITEM);
                            return lIllIIIIlIlIl[1];
                        }
                        Log.info(lIllIIIIlIIll[lIllIIIIlIlIl[8]]);
                        this.s.forceStop();
                        return lIllIIIIlIlIl[1];
                    }
                }
            }
            Log.info(lIllIIIIlIIll[lIllIIIIlIlIl[9]]);
            Bank.depositAllExcept(item3 -> {
                if (!llIIIlIIIlIllII(item3.getName().toLowerCase().contains(lIllIIIIlIIll[lIllIIIIlIlIl[10]]) ? 1 : 0) || llIIIlIIIlIlIll(IntStream.of(this.s.i()).anyMatch(i -> {
                    if (llIIIlIIIlIllll(item3.getId(), i)) {
                        ?? r0 = lIllIIIIlIlIl[1];
                        "".length();
                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIlIlIl[0];
                }) ? 1 : 0)) {
                    ?? r0 = lIllIIIIlIlIl[1];
                    "".length();
                    return ((138 ^ 158) & ((91 ^ 79) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIIIIlIlIl[0];
            });
            return lIllIIIIlIlIl[1];
        }
    }

    private static String llIIIlIIIlIIIll(String llllllllllllllIllIIllIIlIlIllllI, String llllllllllllllIllIIllIIlIlIlllIl) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIlIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIlIl[10]), "DES");
            Cipher llllllllllllllIllIIllIIlIllIIIII = Cipher.getInstance("DES");
            llllllllllllllIllIIllIIlIllIIIII.init(lIllIIIIlIlIl[2], llllllllllllllIllIIllIIlIllIIIIl);
            return new String(llllllllllllllIllIIllIIlIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIlIlIlllll) {
            llllllllllllllIllIIllIIlIlIlllll.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIIIlIlIII() {
        lIllIIIIlIIll = new String[lIllIIIIlIlIl[14]];
        lIllIIIIlIIll[lIllIIIIlIlIl[0]] = llIIIlIIIlIIIll("N+dfXKOT0XtSr9X9fMqtfw==", "NAlnZ");
        lIllIIIIlIIll[lIllIIIIlIlIl[1]] = llIIIlIIIlIIIll("m4WYg+Cu07dzW5knHSuZUf74B5HVU1pMtwpMgNJbCtpldTDnuGlVWmo8QQB4ayR+", "dTNBi");
        lIllIIIIlIIll[lIllIIIIlIlIl[2]] = llIIIlIIIlIIlII("w2pTOrq34lmS4CpOYDI6fU3KacC+F0vHC6mtQkd6WDWTtkeYDPmK9kkaevTCohdaZtUoYyDrj5Q=", "RaDRw");
        lIllIIIIlIIll[lIllIIIIlIlIl[3]] = llIIIlIIIlIIlII("XPC/0CpcKK5b7gHvGIHeFw==", "MZdPZ");
        lIllIIIIlIIll[lIllIIIIlIlIl[5]] = llIIIlIIIlIIllI("JT1ZCTsXeBYdPVI3H0gkEzAWDygcIVkEJhUrVUg6BjcJGCAcP1kcIRd4Cgs7GygNRg==", "rXyhI");
        lIllIIIIlIIll[lIllIIIIlIlIl[6]] = llIIIlIIIlIIlII("4kfECZsZq3c=", "RFPHy");
        lIllIIIIlIIll[lIllIIIIlIlIl[8]] = llIIIlIIIlIIIll("ze7wFGmRzV3m93gQ+npY4YHAzy5bZ4cgc+RHm/NVl0uE4xJICTxF31QGeYCn2T8z", "QLnQp");
        lIllIIIIlIIll[lIllIIIIlIlIl[9]] = llIIIlIIIlIIIll("inQNYtoW21AIWY3wCWyAp3a0ec20R2Tnee98MZSBT/Jm6b2PZFO47T66LyVfoHdP", "OqCBV");
        lIllIIIIlIIll[lIllIIIIlIlIl[10]] = llIIIlIIIlIIlII("JM1ot2nnFeU=", "IlgNM");
        lIllIIIIlIIll[lIllIIIIlIlIl[11]] = llIIIlIIIlIIIll("XRbDpEru698=", "kPhhm");
        lIllIIIIlIIll[lIllIIIIlIlIl[12]] = llIIIlIIIlIIllI("HSIoNC0=", "nVGWF");
        lIllIIIIlIIll[lIllIIIIlIlIl[13]] = llIIIlIIIlIIllI("Ah8nGQdsFyEDCw==", "AsNte");
    }

    private static String llIIIlIIIlIIllI(String llllllllllllllIllIIllIIlIlllIIll, String llllllllllllllIllIIllIIlIlllIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIIlIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIllIIlIlllIIlI.toCharArray();
        int llllllllllllllIllIIllIIlIllIllll = lIllIIIIlIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIIlIlIl[0];
        while (llIIIlIIIllIIII(i, length)) {
            char llllllllllllllIllIIllIIlIlllIlII = charArray2[i];
            sb.append((char) (llllllllllllllIllIIllIIlIlllIlII ^ charArray[llllllllllllllIllIIllIIlIllIllll % charArray.length]));
            "".length();
            llllllllllllllIllIIllIIlIllIllll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIIIlIIIlIlIlI() {
        lIllIIIIlIlIl = new int[15];
        lIllIIIIlIlIl[0] = (170 ^ 151) & ((97 ^ 92) ^ (-1));
        lIllIIIIlIlIl[1] = " ".length();
        lIllIIIIlIlIl[2] = "  ".length();
        lIllIIIIlIlIl[3] = "   ".length();
        lIllIIIIlIlIl[4] = (-9796) & 16127;
        lIllIIIIlIlIl[5] = 19 ^ 23;
        lIllIIIIlIlIl[6] = (((24 + 121) - 45) + 74) ^ (((85 + 30) - 7) + 63);
        lIllIIIIlIlIl[7] = (-8513) & 14845;
        lIllIIIIlIlIl[8] = (201 ^ 172) ^ (118 ^ 21);
        lIllIIIIlIlIl[9] = (((120 + 63) - 133) + 138) ^ (((172 + 103) - 142) + 54);
        lIllIIIIlIlIl[10] = (((113 + 106) - 217) + 165) ^ (((11 + 60) - (-69)) + 35);
        lIllIIIIlIlIl[11] = (149 ^ 134) ^ (180 ^ 174);
        lIllIIIIlIlIl[12] = 28 ^ 22;
        lIllIIIIlIlIl[13] = (1 ^ 71) ^ (68 ^ 9);
        lIllIIIIlIlIl[14] = (220 ^ 176) ^ (249 ^ 153);
    }
}
