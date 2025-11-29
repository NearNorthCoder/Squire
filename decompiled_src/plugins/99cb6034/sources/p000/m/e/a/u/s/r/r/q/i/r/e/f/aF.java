package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Depositing birdhouse materials", priority = 1001, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aF  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aF.class */
public class aF extends Task {
    private final /* synthetic */ C0035j cs;
    private static /* synthetic */ int[] llIIIIIllllI;
    private static /* synthetic */ String[] llIIIIIlllIl;
    private final /* synthetic */ SquireFarmer cq;
    private final /* synthetic */ SquireFarmerConfig cr;

    @Inject
    public aF(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, C0035j c0035j) {
        this.cq = squireFarmer;
        this.cr = squireFarmerConfig;
        this.cs = c0035j;
    }

    private static boolean llllIIlIIIIIII(int i, int i2) {
        return i < i2;
    }

    private static String llllIIIlllIlll(String lllllllllllllllIlIlIllIIllllIIIl, String lllllllllllllllIlIlIllIIllllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIIllllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIllIIllllIlII) {
            lllllllllllllllIlIlIllIIllllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIllllIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    public boolean run() {
        if (llllIIIllllIlI(this.cr.birdhouses_enabled() ? 1 : 0)) {
            return llIIIIIllllI[0];
        }
        if (llllIIIllllIll(this.cq.a(), EnumC0040o.BIRD_HOUSE) && llllIIIlllllII(this.cs.O())) {
            return llIIIIIllllI[0];
        }
        if (llllIIIllllIlI(Bank.isOpen() ? 1 : 0) && llllIIIlllllIl(this.cq.a(), EnumC0040o.BIRD_HOUSE)) {
            return llIIIIIllllI[0];
        }
        boolean contains = Inventory.contains(item -> {
            return Stream.of((Object[]) G.values()).anyMatch(g -> {
                if (llllIIIlllllll(g.aA(), item.getId())) {
                    ?? r0 = llIIIIIllllI[2];
                    "".length();
                    return (172 ^ 168) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIIIllllI[0];
            });
        });
        String[] strArr = new String[llIIIIIllllI[1]];
        strArr[llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[0]];
        strArr[llIIIIIllllI[2]] = llIIIIIlllIl[llIIIIIllllI[2]];
        strArr[llIIIIIllllI[3]] = llIIIIIlllIl[llIIIIIllllI[3]];
        if (llllIIIllllIlI(Inventory.contains(strArr) ? 1 : 0) && llllIIIllllIlI(contains ? 1 : 0)) {
            return llIIIIIllllI[0];
        }
        if (!llllIIIllllllI(Bank.isOpen() ? 1 : 0)) {
            if (llllIIIllllllI(Bank.open() ? 1 : 0)) {
                return llIIIIIllllI[2];
            }
            Movement.walkTo(BankLocation.getNearestCommon());
            "".length();
            return llIIIIIllllI[2];
        } else if (llllIIIllllllI(Inventory.contains(item2 -> {
            return Stream.of((Object[]) G.values()).anyMatch(g -> {
                if (llllIIIlllllll(g.aA(), item2.getId())) {
                    ?? r0 = llIIIIIllllI[2];
                    "".length();
                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIIIllllI[0];
            });
        }) ? 1 : 0)) {
            Bank.depositAll(item3 -> {
                return Stream.of((Object[]) G.values()).anyMatch(g -> {
                    if (llllIIIlllllll(g.aA(), item3.getId())) {
                        ?? r0 = llIIIIIllllI[2];
                        "".length();
                        return (-" ".length()) >= (((((1 + 94) - (-82)) + 43) ^ (((37 + 41) - (-61)) + 12)) & (((81 ^ 123) ^ (40 ^ 73)) ^ (-" ".length()))) ? ((((80 + 42) - 99) + 111) ^ (((88 + 98) - 69) + 41)) & (((211 ^ 186) ^ (85 ^ 36)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIIllllI[0];
                });
            });
            return llIIIIIllllI[2];
        } else {
            String[] strArr2 = new String[llIIIIIllllI[2]];
            strArr2[llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[1]];
            if (llllIIIllllllI(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[llIIIIIllllI[2]];
                strArr3[llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[4]];
                Bank.depositAll(strArr3);
                return llIIIIIllllI[2];
            }
            String[] strArr4 = new String[llIIIIIllllI[2]];
            strArr4[llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[5]];
            if (llllIIIllllllI(Inventory.contains(strArr4) ? 1 : 0)) {
                String[] strArr5 = new String[llIIIIIllllI[2]];
                strArr5[llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[6]];
                Bank.depositAll(strArr5);
                return llIIIIIllllI[2];
            }
            String[] strArr6 = new String[llIIIIIllllI[2]];
            strArr6[llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[7]];
            if (llllIIIllllllI(Inventory.contains(strArr6) ? 1 : 0)) {
                String[] strArr7 = new String[llIIIIIllllI[3]];
                strArr7[llIIIIIllllI[0]] = llIIIIIlllIl[llIIIIIllllI[8]];
                strArr7[llIIIIIllllI[2]] = llIIIIIlllIl[llIIIIIllllI[9]];
                Bank.depositAll(strArr7);
                return llIIIIIllllI[2];
            }
            return llIIIIIllllI[0];
        }
    }

    private static void llllIIIllllIIl() {
        llIIIIIllllI = new int[11];
        llIIIIIllllI[0] = (187 ^ 132) & ((99 ^ 92) ^ (-1));
        llIIIIIllllI[1] = "   ".length();
        llIIIIIllllI[2] = " ".length();
        llIIIIIllllI[3] = "  ".length();
        llIIIIIllllI[4] = (28 ^ 86) ^ (244 ^ 186);
        llIIIIIllllI[5] = (80 ^ 58) ^ (219 ^ 180);
        llIIIIIllllI[6] = (172 ^ 171) ^ " ".length();
        llIIIIIllllI[7] = (((41 + 155) - 144) + 122) ^ (((72 + 100) - 38) + 35);
        llIIIIIllllI[8] = 102 ^ 110;
        llIIIIIllllI[9] = 205 ^ 196;
        llIIIIIllllI[10] = 149 ^ 159;
    }

    private static boolean llllIIIlllllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llllIIIllllllI(int i) {
        return i != 0;
    }

    private static void llllIIIllllIII() {
        llIIIIIlllIl = new String[llIIIIIllllI[10]];
        llIIIIIlllIl[llIIIIIllllI[0]] = llllIIIlllIlIl("FQETMEg5DRIg", "WhaTh");
        llIIIIIlllIl[llIIIIIllllI[2]] = llllIIIlllIllI("hSMr1ZHWNHU=", "dLGnN");
        llIIIIIlllIl[llIIIIIllllI[3]] = llllIIIlllIlIl("ChErFgwl", "IyBei");
        llIIIIIlllIl[llIIIIIllllI[1]] = llllIIIlllIllI("wCiRbCPru3M=", "swwFJ");
        llIIIIIlllIl[llIIIIIllllI[4]] = llllIIIlllIlll("ffCJ8tvz4+A=", "YjiWm");
        llIIIIIlllIl[llIIIIIllllI[5]] = llllIIIlllIlll("C5jU/YSM5+Y=", "GGwBj");
        llIIIIIlllIl[llIIIIIllllI[6]] = llllIIIlllIlIl("MhkuGREd", "qqGjt");
        llIIIIIlllIl[llIIIIIllllI[7]] = llllIIIlllIllI("rauyz5Wnu6RtOABxCpilNw==", "SLsyH");
        llIIIIIlllIl[llIIIIIllllI[8]] = llllIIIlllIlll("OVmnSwGdwEM=", "WvZFM");
        llIIIIIlllIl[llIIIIIllllI[9]] = llllIIIlllIllI("Mcenz32fEZcBDcOHkmVwrg==", "UPATp");
    }

    private static boolean llllIIIlllllII(Object obj) {
        return obj != null;
    }

    private static String llllIIIlllIlIl(String lllllllllllllllIlIlIllIIlllIIIll, String lllllllllllllllIlIlIllIIlllIIIlI) {
        String lllllllllllllllIlIlIllIIlllIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIllIIlllIIIII = lllllllllllllllIlIlIllIIlllIIIlI.toCharArray();
        int lllllllllllllllIlIlIllIIllIlllll = llIIIIIllllI[0];
        char[] charArray = lllllllllllllllIlIlIllIIlllIIIll2.toCharArray();
        int length = charArray.length;
        int i = llIIIIIllllI[0];
        while (llllIIlIIIIIII(i, length)) {
            char lllllllllllllllIlIlIllIIlllIIlII = charArray[i];
            sb.append((char) (lllllllllllllllIlIlIllIIlllIIlII ^ lllllllllllllllIlIlIllIIlllIIIII[lllllllllllllllIlIlIllIIllIlllll % lllllllllllllllIlIlIllIIlllIIIII.length]));
            "".length();
            lllllllllllllllIlIlIllIIllIlllll++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllIIIlllllll(int i, int i2) {
        return i == i2;
    }

    static {
        llllIIIllllIIl();
        llllIIIllllIII();
    }

    private static boolean llllIIIllllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llllIIIlllIllI(String lllllllllllllllIlIlIllIIllIIlllI, String lllllllllllllllIlIlIllIIllIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllIIllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIllIIllIl.getBytes(StandardCharsets.UTF_8)), llIIIIIllllI[8]), "DES");
            Cipher lllllllllllllllIlIlIllIIllIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIlIllIIllIlIIII.init(llIIIIIllllI[3], lllllllllllllllIlIlIllIIllIlIIIl);
            return new String(lllllllllllllllIlIlIllIIllIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIllIIllIIllll) {
            lllllllllllllllIlIlIllIIllIIllll.printStackTrace();
            return null;
        }
    }
}
