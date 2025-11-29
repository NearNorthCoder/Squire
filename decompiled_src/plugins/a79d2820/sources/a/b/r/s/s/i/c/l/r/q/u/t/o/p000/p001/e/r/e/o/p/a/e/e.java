package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import gg.squire.corp.SquireCorpConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Banking", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.e  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/e.class */
public class e extends Task {
    private static /* synthetic */ int[] lIlIlllllIII;
    @Inject
    private /* synthetic */ Client q;
    @Inject
    private /* synthetic */ SquireCorpConfig o;
    private /* synthetic */ int r;
    @Inject

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ s f0a;
    private /* synthetic */ BankLocation t;
    @Inject
    private /* synthetic */ SquireCorp p;
    private /* synthetic */ CompletableFuture<Boolean> s;
    private static /* synthetic */ String[] lIlIllllIlll;

    private static boolean lllIIIlIlIlIII(Object obj) {
        return obj != null;
    }

    private static void lllIIIlIlIIIlI() {
        lIlIllllIlll = new String[lIlIlllllIII[5]];
        lIlIllllIlll[lIlIlllllIII[0]] = lllIIIlIlIIIII("BWzO1gH9a3/sGivYWJlGfA==", "owasA");
        lIlIllllIlll[lIlIlllllIII[2]] = lllIIIlIlIIIIl("MiUGLgIYOQBoFRAnAg==", "qWgHv");
    }

    private static boolean lllIIIlIlIIlIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    private boolean j() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(lIlIllllIlll[lIlIlllllIII[2]]);
        });
        if (lllIIIlIlIlIII(first)) {
            first.interact(lIlIllllIlll[lIlIlllllIII[0]]);
            return lIlIlllllIII[2];
        }
        if (lllIIIlIlIIllI(this.t)) {
            this.t = BankLocation.getNearestCommon();
        }
        Movement.walkTo(this.t.getArea());
        "".length();
        return lIlIlllllIII[2];
    }

    private static String lllIIIlIlIIIII(String lllllllllllllllIllIIIllIllIllIII, String lllllllllllllllIllIIIllIllIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIIIllIllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIllIllIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIlllllIII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlllllIII[5], lllllllllllllllIllIIIllIllIllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIllIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIllIllIllIIl) {
            lllllllllllllllIllIIIllIllIllIIl.printStackTrace();
            return null;
        }
    }

    static {
        lllIIIlIlIIIll();
        lllIIIlIlIIIlI();
    }

    private static void lllIIIlIlIIIll() {
        lIlIlllllIII = new int[7];
        lIlIlllllIII[0] = ((126 ^ 122) ^ (118 ^ 36)) & (((148 ^ 195) ^ " ".length()) ^ (-" ".length()));
        lIlIlllllIII[1] = (((90 + 22) - 71) + 127) ^ (((49 + 28) - (-10)) + 95);
        lIlIlllllIII[2] = " ".length();
        lIlIlllllIII[3] = (154 ^ 133) ^ (176 ^ 187);
        lIlIlllllIII[4] = -" ".length();
        lIlIlllllIII[5] = "  ".length();
        lIlIlllllIII[6] = (47 ^ 58) ^ (18 ^ 15);
    }

    private static boolean lllIIIlIlIIlII(int i) {
        return i == 0;
    }

    private static String lllIIIlIlIIIIl(String lllllllllllllllIllIIIllIllIIlIII, String lllllllllllllllIllIIIllIllIIIlll) {
        String lllllllllllllllIllIIIllIllIIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIllIllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIllIllIIIlll.toCharArray();
        int lllllllllllllllIllIIIllIllIIIlII = lIlIlllllIII[0];
        char[] charArray2 = lllllllllllllllIllIIIllIllIIlIII2.toCharArray();
        int lllllllllllllllIllIIIllIlIllllIl = charArray2.length;
        int lllllllllllllllIllIIIllIlIllllII = lIlIlllllIII[0];
        while (lllIIIlIlIlIIl(lllllllllllllllIllIIIllIlIllllII, lllllllllllllllIllIIIllIlIllllIl)) {
            char lllllllllllllllIllIIIllIllIIlIIl = charArray2[lllllllllllllllIllIIIllIlIllllII];
            sb.append((char) (lllllllllllllllIllIIIllIllIIlIIl ^ charArray[lllllllllllllllIllIIIllIllIIIlII % charArray.length]));
            "".length();
            lllllllllllllllIllIIIllIllIIIlII++;
            lllllllllllllllIllIIIllIlIllllII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    public boolean run() {
        if (lllIIIlIlIIlII(k() ? 1 : 0)) {
            this.p.a((boolean) lIlIlllllIII[0]);
            return lIlIlllllIII[0];
        } else if (lllIIIlIlIIlII(this.p.b() ? 1 : 0)) {
            return lIlIlllllIII[0];
        } else {
            BankLoadout bankLoadout = (BankLoadout) this.o.bankLoadout().selected(BankLoadout.class);
            if (lllIIIlIlIIlII(Bank.open() ? 1 : 0)) {
                return j();
            }
            this.f0a.v();
            if (lllIIIlIlIIlIl(this.q.getTickCount() - this.r, lIlIlllllIII[1])) {
                this.s = null;
            }
            if (lllIIIlIlIIllI(this.s)) {
                this.s = BankLoadouts.withdraw(bankLoadout, (boolean) lIlIlllllIII[2]);
                this.r = this.q.getTickCount();
            }
            if (lllIIIlIlIIlll(this.s.isDone() ? 1 : 0)) {
                boolean booleanValue = this.s.join().booleanValue();
                this.s = null;
                if (lllIIIlIlIIlll(booleanValue ? 1 : 0)) {
                    sleep(lIlIlllllIII[3]);
                }
            }
            return lIlIlllllIII[2];
        }
    }

    private static boolean lllIIIlIlIlIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIIIlIlIlIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    protected boolean k() {
        BankLoadout bankLoadout = (BankLoadout) this.o.bankLoadout().selected(BankLoadout.class);
        if (lllIIIlIlIIllI(bankLoadout)) {
            return lIlIlllllIII[0];
        }
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] ids = inventorySetup.getIds();
        int length = ids.length;
        int i = lIlIlllllIII[0];
        while (lllIIIlIlIlIIl(i, length)) {
            int i2 = ids[i];
            hashMap.put(Integer.valueOf(i2), Integer.valueOf(((Integer) hashMap.getOrDefault(Integer.valueOf(i2), Integer.valueOf(lIlIlllllIII[0]))).intValue() + lIlIlllllIII[2]));
            "".length();
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        for (Integer num : hashMap.keySet()) {
            int intValue = num.intValue();
            if (lllIIIlIlIlIlI(intValue, lIlIlllllIII[4])) {
                "".length();
                if ("  ".length() <= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                int intValue2 = ((Integer) hashMap.get(Integer.valueOf(intValue))).intValue();
                int[] iArr = new int[lIlIlllllIII[2]];
                iArr[lIlIlllllIII[0]] = intValue;
                if (lllIIIlIlIlIIl(Inventory.getCount(iArr), intValue2)) {
                    return lIlIlllllIII[2];
                }
                "".length();
                if (" ".length() <= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIlIlllllIII[0];
    }

    private static boolean lllIIIlIlIIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    protected boolean d(int i) {
        int[] mapRegions = this.q.getMapRegions();
        int length = mapRegions.length;
        int i2 = lIlIlllllIII[0];
        while (lllIIIlIlIlIIl(i2, length)) {
            if (lllIIIlIlIlIlI(mapRegions[i2], i)) {
                return lIlIlllllIII[2];
            }
            i2++;
            "".length();
            if ("   ".length() < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIlllllIII[0];
    }

    private static boolean lllIIIlIlIIlll(int i) {
        return i != 0;
    }
}
