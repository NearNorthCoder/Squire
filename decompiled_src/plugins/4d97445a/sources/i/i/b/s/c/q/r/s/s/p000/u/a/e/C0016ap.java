package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Banking for items", priority = 1, blocking = true, register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ap  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ap.class */
public class C0016ap extends Task {
    private static /* synthetic */ int[] llIlIlII;
    private final /* synthetic */ SquireEcto cY;
    private static /* synthetic */ String[] llIlIIII;
    private final /* synthetic */ SquireEctoConfig cZ;

    @Inject
    public C0016ap(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        this.cY = squireEcto;
        this.cZ = squireEctoConfig;
    }

    private static boolean lIllllIIlI(int i2) {
        return i2 != 0;
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (lIlllllIII(experienceGained.getSkill(), Skill.PRAYER)) {
            this.cY.r(this.cY.bm() + llIlIlII[1]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean by() {
        ?? r0 = llIlIlII[1];
        int[] iArr = new int[llIlIlII[1]];
        iArr[llIlIlII[0]] = llIlIlII[8];
        if (lIllllIlIl(Bank.getCount((boolean) r0, iArr), llIlIlII[12])) {
            ?? r02 = llIlIlII[1];
            int[] iArr2 = new int[llIlIlII[1]];
            iArr2[llIlIlII[0]] = this.cZ.bonesToUse().groundItemId;
            if (lIllllIlIl(Bank.getCount((boolean) r02, iArr2), llIlIlII[12])) {
                ?? r03 = llIlIlII[1];
                "".length();
                return (-" ".length()) >= "  ".length() ? ((((0 + 127) - 64) + 99) ^ (((98 + 72) - 43) + 28)) & (((166 ^ 151) ^ (189 ^ 181)) ^ (-" ".length())) : r03;
            }
        }
        return llIlIlII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean bA() {
        ?? r0 = llIlIlII[1];
        int[] iArr = new int[llIlIlII[1]];
        iArr[llIlIlII[0]] = llIlIlII[6];
        if (lIllllIlIl(Bank.getCount((boolean) r0, iArr), llIlIlII[12])) {
            ?? r02 = llIlIlII[1];
            int[] iArr2 = new int[llIlIlII[1]];
            iArr2[llIlIlII[0]] = this.cZ.bonesToUse().itemId;
            if (lIllllIlIl(Bank.getCount((boolean) r02, iArr2), llIlIlII[12])) {
                ?? r03 = llIlIlII[1];
                "".length();
                return (195 ^ 198) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
            }
        }
        return llIlIlII[0];
    }

    private static String lIlllIIlll(String llIlIllIlIIIlIl, String llIlIllIlIIIlII) {
        try {
            SecretKeySpec llIlIllIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIllIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlII[2], llIlIllIlIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIllIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIllIlIIIllI) {
            llIlIllIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
        if (lIllllIIll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean bu() {
        if (lIllllIIlI(EnumC0013am.ECTOFUNTUS.bo() ? 1 : 0)) {
            int[] iArr = new int[llIlIlII[1]];
            iArr[llIlIlII[0]] = llIlIlII[6];
            if (lIllllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIlII[1]];
                iArr2[llIlIlII[0]] = llIlIlII[7];
                if (lIllllIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIlIlII[1]];
                    iArr3[llIlIlII[0]] = this.cZ.bonesToUse().groundItemId;
                    if (lIllllIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIlIlII[1]];
                        iArr4[llIlIlII[0]] = llIlIlII[8];
                    }
                    ?? r0 = llIlIlII[1];
                    "".length();
                    return " ".length() == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return llIlIlII[0];
    }

    private BankLoadout bx() {
        if (lIllllIIlI(by() ? 1 : 0)) {
            Log.info(llIlIIII[llIlIlII[9]]);
            return (BankLoadout) this.cZ.prayLoadout().selected(BankLoadout.class);
        } else if (lIllllIIlI(bA() ? 1 : 0)) {
            Log.info(llIlIIII[llIlIlII[10]]);
            return (BankLoadout) this.cZ.grindLoadout().selected(BankLoadout.class);
        } else if (lIllllIIlI(bz() ? 1 : 0)) {
            Log.info(llIlIIII[llIlIlII[11]]);
            return (BankLoadout) this.cZ.slimeLoadout().selected(BankLoadout.class);
        } else {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean bv() {
        if (lIllllIIlI(EnumC0013am.ECTO_UPSTAIRS.bo() ? 1 : 0)) {
            int[] iArr = new int[llIlIlII[1]];
            iArr[llIlIlII[0]] = llIlIlII[6];
            if (lIllllIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIlII[1]];
                iArr2[llIlIlII[0]] = this.cZ.bonesToUse().itemId;
                if (lIllllIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    ?? r0 = llIlIlII[1];
                    "".length();
                    return 0 != 0 ? ((38 ^ 118) ^ (152 ^ 198)) & (((((26 + 204) - 215) + 191) ^ (((115 + 105) - 140) + 112)) ^ (-" ".length())) : r0;
                }
            }
        }
        return llIlIlII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public boolean run() {
        if (lIllllIIlI(bu() ? 1 : 0) && lIllllIIll(this.cY.r() ? 1 : 0)) {
            Log.info(llIlIIII[llIlIlII[0]]);
            this.cY.b(llIlIlII[1]);
            return llIlIlII[1];
        } else if (lIllllIIlI(bv() ? 1 : 0) && lIllllIIll(this.cY.r() ? 1 : 0)) {
            Log.info(llIlIIII[llIlIlII[1]]);
            this.cY.b(llIlIlII[1]);
            return llIlIlII[1];
        } else if (lIllllIIlI(bw() ? 1 : 0) && lIllllIIll(this.cY.r() ? 1 : 0)) {
            Log.info(llIlIIII[llIlIlII[2]]);
            this.cY.b(llIlIlII[1]);
            return llIlIlII[1];
        } else if (lIllllIIll(Bank.isOpen() ? 1 : 0)) {
            return llIlIlII[0];
        } else {
            BankLoadout bx = bx();
            if (!lIllllIlII(bx)) {
                if (lIllllIIlI(bx.needsToBank() ? 1 : 0) && lIllllIIlI(BankLoadouts.withdrawWithRetries(bx, llIlIlII[5]).booleanValue() ? 1 : 0)) {
                    this.cY.b(llIlIlII[0]);
                    return llIlIlII[1];
                }
                return llIlIlII[0];
            }
            Log.info(llIlIIII[llIlIlII[3]]);
            if (!lIllllIIll(Inventory.isEmpty() ? 1 : 0)) {
                Log.info(llIlIIII[llIlIlII[5]]);
                return llIlIlII[0];
            }
            Log.info(llIlIIII[llIlIlII[4]]);
            Bank.depositInventory();
            return llIlIlII[1];
        }
    }

    private static String lIlllIlIII(String llIlIllIIlllIII, String llIlIllIIllIlll) {
        try {
            SecretKeySpec llIlIllIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIllIIllIlll.getBytes(StandardCharsets.UTF_8)), llIlIlII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlII[2], llIlIllIIlllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIllIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIllIIlllIIl) {
            llIlIllIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlll(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlllIIllI(String llIlIllIIlIlIII, String llIlIllIIlIIlll) {
        String str = new String(Base64.getDecoder().decode(llIlIllIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIllIIlIIllI = new StringBuilder();
        char[] llIlIllIIlIIlIl = llIlIllIIlIIlll.toCharArray();
        int llIlIllIIlIIlII = llIlIlII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = llIlIlII[0];
        while (lIllllIlll(i2, length)) {
            char llIlIllIIlIlIIl = charArray[i2];
            llIlIllIIlIIllI.append((char) (llIlIllIIlIlIIl ^ llIlIllIIlIIlIl[llIlIllIIlIIlII % llIlIllIIlIIlIl.length]));
            "".length();
            llIlIllIIlIIlII++;
            i2++;
            "".length();
            if ((-" ".length()) > (12 ^ 8)) {
                return null;
            }
        }
        return String.valueOf(llIlIllIIlIIllI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean bw() {
        if (lIllllIIlI(EnumC0013am.SLIME_COLLECTION.bo() ? 1 : 0)) {
            int[] iArr = new int[llIlIlII[1]];
            iArr[llIlIlII[0]] = llIlIlII[7];
            if (lIllllIIll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = llIlIlII[1];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIlIlII[0];
    }

    private static void lIlllIlIll() {
        llIlIIII = new String[llIlIlII[13]];
        llIlIIII[llIlIlII[0]] = lIlllIIllI("Og9XPiBNDh8iIE0aAi08BAQXYGUZAx0pZRkFUC4kAwFe", "mjpLE");
        llIlIIII[llIlIlII[1]] = lIlllIIlll("lii3Oh7A13okie+BROg1cq6xafPg2tyZ/jbvffCJDYGCiQemRL2CjA==", "gMsgq");
        llIlIIII[llIlIlII[2]] = lIlllIlIII("EgJQ5Ws6bVFu0dgSUwHLSl31zmBY2EgvYWmzvWGKVkc0LSuRzZL+54RA9SF8PZz+", "UQqmA");
        llIlIIII[llIlIlII[3]] = lIlllIlIII("40KqbAZE2cmyGoSCAmrEHZWaw2X1FnKIjkSrTbhj7MGB6VINwLVvkw==", "GiTWh");
        llIlIIII[llIlIlII[4]] = lIlllIIllI("KhEmMxobETs4EEsRPXYEBAkkM1cJHHIyEhsKIT8DAgs1dh4FEzc4AwQXK3g=", "keRVw");
        llIlIIII[llIlIlII[5]] = lIlllIlIII("XROXR8E8KC8hMHgiJzlYNKfMyRFqDuczBiyDzVRRZdKO4PoNbPvQ8w==", "XystH");
        llIlIIII[llIlIlII[9]] = lIlllIlIII("scXXDxFr+ZYsMzlHase3qw==", "tllrh");
        llIlIIII[llIlIlII[10]] = lIlllIIlll("l3gFHyJwp9sCvhFs2xOIpQ==", "Cargh");
        llIlIIII[llIlIlII[11]] = lIlllIlIII("b3AbcGZnqzRz0z3XN7QmMUwPJo8z1DNI", "YMMpH");
    }

    private static void lIllllIIIl() {
        llIlIlII = new int[14];
        llIlIlII[0] = ((107 ^ 72) ^ (218 ^ 177)) & (((((125 + 173) - 152) + 60) ^ (((18 + 109) - 125) + 132)) ^ (-" ".length()));
        llIlIlII[1] = " ".length();
        llIlIlII[2] = "  ".length();
        llIlIlII[3] = "   ".length();
        llIlIlII[4] = 122 ^ 126;
        llIlIlII[5] = 13 ^ 8;
        llIlIlII[6] = (-10353) & 12283;
        llIlIlII[7] = (-((-8899) & 15059)) & (-24619) & 32703;
        llIlIlII[8] = (-27457) & 31742;
        llIlIlII[9] = 163 ^ 165;
        llIlIlII[10] = (45 ^ 6) ^ (149 ^ 185);
        llIlIlII[11] = (127 ^ 79) ^ (4 ^ 60);
        llIlIlII[12] = (((90 + 125) - 146) + 59) ^ (((78 + 94) - 98) + 67);
        llIlIlII[13] = 4 ^ 13;
    }

    private static boolean lIllllIlIl(int i2, int i3) {
        return i2 >= i3;
    }

    static {
        lIllllIIIl();
        lIlllIlIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean bz() {
        ?? r0 = llIlIlII[1];
        int[] iArr = new int[llIlIlII[1]];
        iArr[llIlIlII[0]] = llIlIlII[8];
        if (lIllllIlll(Bank.getCount((boolean) r0, iArr), llIlIlII[12])) {
            ?? r02 = llIlIlII[1];
            "".length();
            return "   ".length() < ((57 ^ 33) & ((98 ^ 122) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r02;
        }
        return llIlIlII[0];
    }

    private static boolean lIllllIlII(Object obj) {
        return obj == null;
    }

    private static boolean lIllllIIll(int i2) {
        return i2 == 0;
    }
}
