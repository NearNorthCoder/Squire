package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Harvesting resources", priority = 2, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.L  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/L.class */
public class L extends AbstractC0013n {
    private static /* synthetic */ int[] llIIlllllIIl;
    private static /* synthetic */ String[] llIIllllIIlI;
    private final /* synthetic */ String[] bW;
    private final /* synthetic */ C0001b bV;

    static {
        lIIIIIIIIlIIIII();
        lIIIIIIIIIlllll();
    }

    private static void lIIIIIIIIlIIIII() {
        llIIlllllIIl = new int[9];
        llIIlllllIIl[0] = (128 ^ 165) ^ (157 ^ 188);
        llIIlllllIIl[1] = "  ".length() & ("  ".length() ^ (-" ".length()));
        llIIlllllIIl[2] = " ".length();
        llIIlllllIIl[3] = "  ".length();
        llIIlllllIIl[4] = "   ".length();
        llIIlllllIIl[5] = 185 ^ 173;
        llIIlllllIIl[6] = 152 ^ 157;
        llIIlllllIIl[7] = 48 ^ 54;
        llIIlllllIIl[8] = 119 ^ 127;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        if (!lIIIIIIIIlIIIIl(local) && !lIIIIIIIIlIIIlI(this.ba.M(), llIIlllllIIl[5])) {
            Item bC = bC();
            if (lIIIIIIIIlIIIll(bC)) {
                bC.interact(llIIllllIIlI[llIIlllllIIl[0]]);
                return llIIlllllIIl[2];
            }
            if (!lIIIIIIIIlIIlII(this.ba.R() ? 1 : 0) && !lIIIIIIIIlIIlII(Inventory.isFull() ? 1 : 0)) {
                if (lIIIIIIIIlIIlII(this.bV.p() ? 1 : 0)) {
                    return llIIlllllIIl[2];
                }
                Player local2 = Players.getLocal();
                GameObject U = this.ba.U();
                if (lIIIIIIIIlIIIll(U)) {
                    if (lIIIIIIIIlIIIll(local2.getInteracting())) {
                        this.bV.e(Rand.nextInt(llIIlllllIIl[3], llIIlllllIIl[0]));
                        return llIIlllllIIl[2];
                    }
                    C0007h V = this.ba.V();
                    if (lIIIIIIIIlIIIIl(V)) {
                        return llIIlllllIIl[1];
                    }
                    C0011l d = V.d(U.getWorldLocation());
                    if (lIIIIIIIIlIIIIl(d)) {
                        return llIIlllllIIl[1];
                    }
                    if (lIIIIIIIIlIIlIl(d.e(local.getWorldLocation()) ? 1 : 0)) {
                        return this.ba.a(d, local.getWorldLocation());
                    }
                    if (lIIIIIIIIlIIlII(U.hasAction(this.bW) ? 1 : 0)) {
                        U.interact(this.bW);
                        this.bV.e(Rand.nextInt(llIIlllllIIl[3], llIIlllllIIl[0]));
                        return llIIlllllIIl[2];
                    }
                    String str = llIIllllIIlI[llIIlllllIIl[6]];
                    Object[] objArr = new Object[llIIlllllIIl[3]];
                    objArr[llIIlllllIIl[1]] = U.getName();
                    objArr[llIIlllllIIl[2]] = U.getActions();
                    Log.info(str, objArr);
                    return llIIlllllIIl[1];
                }
                return llIIlllllIIl[1];
            }
            return llIIlllllIIl[1];
        }
        return llIIlllllIIl[1];
    }

    private static String lIIIIIIIIIIllII(String lllllllllllllllIlIIIlllllIllIIIl, String lllllllllllllllIlIIIlllllIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllllIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllllIllIIII.getBytes(StandardCharsets.UTF_8)), llIIlllllIIl[8]), "DES");
            Cipher lllllllllllllllIlIIIlllllIllIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIIIlllllIllIIll.init(llIIlllllIIl[3], lllllllllllllllIlIIIlllllIllIlII);
            return new String(lllllllllllllllIlIIIlllllIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIlllllIllIIlI) {
            lllllllllllllllIlIIIlllllIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIlIIlIl(int i) {
        return i == 0;
    }

    private static boolean lIIIIIIIIlIIIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIIIlIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIIIIIIlIIIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L(C0002c c0002c, C0001b c0001b) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlllllIIl[0]];
        enumC0003dArr[llIIlllllIIl[1]] = EnumC0003d.FIRST_ROTATION_EXPLORE;
        enumC0003dArr[llIIlllllIIl[2]] = EnumC0003d.DEMI_BOSS_EXPLORE;
        enumC0003dArr[llIIlllllIIl[3]] = EnumC0003d.EXTRA_FOOD_EXPLORE;
        enumC0003dArr[llIIlllllIIl[4]] = EnumC0003d.PREPARE_BOSS_FIGHT;
        String[] strArr = new String[llIIlllllIIl[0]];
        strArr[llIIlllllIIl[1]] = llIIllllIIlI[llIIlllllIIl[1]];
        strArr[llIIlllllIIl[2]] = llIIllllIIlI[llIIlllllIIl[2]];
        strArr[llIIlllllIIl[3]] = llIIllllIIlI[llIIlllllIIl[3]];
        strArr[llIIlllllIIl[4]] = llIIllllIIlI[llIIlllllIIl[4]];
        this.bW = strArr;
        this.bV = c0001b;
    }

    private static boolean lIIIIIIIIlIlIII(int i) {
        return i <= 0;
    }

    private static String lIIIIIIIIIIlIll(String lllllllllllllllIlIIIlllllIlIIlII, String lllllllllllllllIlIIIlllllIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllllIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIlllllIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIlllllIlIIllI.init(llIIlllllIIl[3], lllllllllllllllIlIIIlllllIlIIlll);
            return new String(lllllllllllllllIlIIIlllllIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIlllllIlIIlIl) {
            lllllllllllllllIlIIIlllllIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIIIIIlllll() {
        llIIllllIIlI = new String[llIIlllllIIl[7]];
        llIIllllIIlI[llIIlllllIIl[1]] = lIIIIIIIIIIlIll("RFjCy9A8ZaY=", "bvBdR");
        llIIllllIIlI[llIIlllllIIl[2]] = lIIIIIIIIIIllII("RdFTnI8em1U=", "LgJVe");
        llIIllllIIlI[llIIlllllIIl[3]] = lIIIIIIIIIllllI("DBkSOQ==", "JpaQG");
        llIIllllIIlI[llIIlllllIIl[4]] = lIIIIIIIIIIlIll("NIaKBKVZ7Qc=", "FEVuh");
        llIIllllIIlI[llIIlllllIIl[0]] = lIIIIIIIIIIllII("mrOeT2+sqlI=", "JUeBG");
        llIIllllIIlI[llIIlllllIIl[6]] = lIIIIIIIIIllllI("CQFDLQozBwwiSSEBFiINZwgMPkkzDxErDDNUQzcUa04COgguAgIuBSJOAi8dLgENP1NnFR4=", "GncLi");
    }

    private static boolean lIIIIIIIIlIIIIl(Object obj) {
        return obj == null;
    }

    private static String lIIIIIIIIIllllI(String lllllllllllllllIlIIIllllllIIIllI, String lllllllllllllllIlIIIllllllIIIlIl) {
        String lllllllllllllllIlIIIllllllIIIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllllllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllllllIIIlII = new StringBuilder();
        char[] lllllllllllllllIlIIIllllllIIIIll = lllllllllllllllIlIIIllllllIIIlIl.toCharArray();
        int lllllllllllllllIlIIIllllllIIIIlI = llIIlllllIIl[1];
        char[] charArray = lllllllllllllllIlIIIllllllIIIllI2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlIIIlllllIlllIlI = llIIlllllIIl[1];
        while (lIIIIIIIIlIlIIl(lllllllllllllllIlIIIlllllIlllIlI, length)) {
            char lllllllllllllllIlIIIllllllIIIlll = charArray[lllllllllllllllIlIIIlllllIlllIlI];
            lllllllllllllllIlIIIllllllIIIlII.append((char) (lllllllllllllllIlIIIllllllIIIlll ^ lllllllllllllllIlIIIllllllIIIIll[lllllllllllllllIlIIIllllllIIIIlI % lllllllllllllllIlIIIllllllIIIIll.length]));
            "".length();
            lllllllllllllllIlIIIllllllIIIIlI++;
            lllllllllllllllIlIIIlllllIlllIlI++;
            "".length();
            if ((-(92 ^ 88)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIllllllIIIlII);
    }

    private static boolean lIIIIIIIIlIIlII(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIIIlIIlll(int i) {
        return i > 0;
    }

    private static boolean lIIIIIIIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private Item bC() {
        return Inventory.getFirst(item -> {
            if (lIIIIIIIIlIIlII(EnumC0008i.FISH.ay().contains(Integer.valueOf(item.getId())) ? 1 : 0)) {
                if (!lIIIIIIIIlIIllI(this.ba.W(), EnumC0003d.DEMI_BOSS_EXPLORE) || lIIIIIIIIlIIlll(Inventory.getFreeSlots())) {
                    return llIIlllllIIl[1];
                }
                int intValue = this.ba.E().getOrDefault(EnumC0008i.FISH, Integer.valueOf(llIIlllllIIl[1])).intValue();
                if (lIIIIIIIIlIIllI(this.ba.W(), EnumC0003d.DEMI_BOSS_EXPLORE) && lIIIIIIIIlIIlll(intValue)) {
                    return llIIlllllIIl[1];
                }
            }
            Optional findFirst = Arrays.stream(EnumC0008i.values()).filter(enumC0008i -> {
                return enumC0008i.ay().contains(Integer.valueOf(item.getId()));
            }).findFirst();
            if (!lIIIIIIIIlIIlII(findFirst.isEmpty() ? 1 : 0) && lIIIIIIIIlIlIII(this.ba.E().getOrDefault(findFirst.get(), Integer.valueOf(llIIlllllIIl[1])).intValue())) {
                ?? r0 = llIIlllllIIl[2];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
            }
            return llIIlllllIIl[1];
        });
    }
}
