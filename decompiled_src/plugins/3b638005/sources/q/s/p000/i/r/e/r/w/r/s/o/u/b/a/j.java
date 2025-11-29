package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Banking", priority = 1337, blocking = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.j  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/j.class */
public class j extends i {
    private static /* synthetic */ int[] llllIIlIllI;
    private /* synthetic */ CompletableFuture<Boolean> J;
    private static /* synthetic */ String[] llllIIlIIll;

    private static boolean lIllIlIIIlIlll(int i) {
        return i == 0;
    }

    private static void lIllIlIIIlIlII() {
        llllIIlIIll = new String[llllIIlIllI[4]];
        llllIIlIIll[llllIIlIllI[0]] = lIllIlIIIIlIIl("5sFZx6uMZ7TOKd0Bcl7bcc5lGVh9pdKdEXGiDrIg83E=", "XYIcU");
        llllIIlIIll[llllIIlIllI[1]] = lIllIlIIIIlIIl("iVlbnLtiHBDVS9tdxGD0caWj8lPAwIhkZd+YPbwpgX0=", "mwIWj");
        llllIIlIIll[llllIIlIllI[2]] = lIllIlIIIlIIll("NycMIAQVZhEjQQYvESQFAycSbA0eJwEjFAVqRTsEVjQAbBEDKQctAx0/RSMUBWYKKkEQKwgjQR40RT8VECADbAIZJxcrBAJoRR8VHjYVJQ8WZhUgFBYvC2BBECgBbA0eIQIlDxZmCjkVXw==", "qFeLa");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @Override // q.s.p000.i.r.e.r.w.r.s.o.u.b.a.i
    public boolean K() {
        BankLoadout A = this.I.A();
        if (lIllIlIIIlIllI(A)) {
            Log.error(llllIIlIIll[llllIIlIllI[0]]);
            return llllIIlIllI[0];
        } else if (lIllIlIIIlIlll(Bank.isOpen() ? 1 : 0)) {
            return Bank.open();
        } else {
            if (lIllIlIIIllIII(Inventory.isFull() ? 1 : 0)) {
                Bank.depositInventory();
            }
            if (lIllIlIIIlIlll(L() ? 1 : 0)) {
                this.G.a((boolean) llllIIlIllI[0]);
                return llllIIlIllI[0];
            }
            if (lIllIlIIIlIllI(this.J)) {
                this.J = BankLoadouts.withdraw(A, (boolean) llllIIlIllI[1]);
            }
            if (lIllIlIIIllIII(this.J.isDone() ? 1 : 0)) {
                if (!lIllIlIIIllIII(this.J.join().booleanValue() ? 1 : 0)) {
                    Log.info(llllIIlIIll[llllIIlIllI[2]]);
                    Squire.stop();
                    return llllIIlIllI[0];
                }
                Log.error(llllIIlIIll[llllIIlIllI[1]]);
                this.G.a((boolean) llllIIlIllI[0]);
                this.J = null;
                return llllIIlIllI[1];
            }
            return llllIIlIllI[1];
        }
    }

    private static String lIllIlIIIlIIll(String llllllllllllllllIIIlllIIIIIlIIlI, String llllllllllllllllIIIlllIIIIIlIIIl) {
        String llllllllllllllllIIIlllIIIIIlIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIIlllIIIIIlIIIl.toCharArray();
        int llllllllllllllllIIIlllIIIIIIlllI = llllIIlIllI[0];
        char[] charArray2 = llllllllllllllllIIIlllIIIIIlIIlI2.toCharArray();
        int length = charArray2.length;
        int i = llllIIlIllI[0];
        while (lIllIlIIIllIIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIIlllIIIIIIlllI % charArray.length]));
            "".length();
            llllllllllllllllIIIlllIIIIIIlllI++;
            i++;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIlIIIllIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    protected boolean L() {
        BankLoadout bankLoadout = (BankLoadout) this.H.bankLoadout().selected(BankLoadout.class);
        if (lIllIlIIIlIllI(bankLoadout)) {
            return llllIIlIllI[0];
        }
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] ids = inventorySetup.getIds();
        int length = ids.length;
        int i = llllIIlIllI[0];
        while (lIllIlIIIllIIl(i, length)) {
            int i2 = ids[i];
            hashMap.put(Integer.valueOf(i2), Integer.valueOf(((Integer) hashMap.getOrDefault(Integer.valueOf(i2), Integer.valueOf(llllIIlIllI[0]))).intValue() + llllIIlIllI[1]));
            "".length();
            i++;
            "".length();
            if (("   ".length() & ("   ".length() ^ (-1))) < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        for (Integer num : hashMap.keySet()) {
            int intValue = num.intValue();
            if (lIllIlIIIllIlI(intValue, llllIIlIllI[3])) {
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                int intValue2 = ((Integer) hashMap.get(Integer.valueOf(intValue))).intValue();
                int[] iArr = new int[llllIIlIllI[1]];
                iArr[llllIIlIllI[0]] = intValue;
                if (lIllIlIIIllIIl(Inventory.getCount(iArr), intValue2)) {
                    int[] iArr2 = new int[llllIIlIllI[1]];
                    iArr2[llllIIlIllI[0]] = intValue;
                    Log.info("Need to bank, we're missing " + (intValue2 - Inventory.getCount(iArr2)) + " " + Static.getClient().getItemDefinition(intValue).getName() + "s");
                    return llllIIlIllI[1];
                }
                "".length();
                if ("  ".length() <= 0) {
                    return ((118 ^ 110) ^ (234 ^ 179)) & (((69 ^ 66) ^ (12 ^ 74)) ^ (-" ".length()));
                }
            }
        }
        return llllIIlIllI[0];
    }

    private static String lIllIlIIIIlIIl(String llllllllllllllllIIIllIllllllllIl, String llllllllllllllllIIIllIllllllllII) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIIIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIllllllllII.getBytes(StandardCharsets.UTF_8)), llllIIlIllI[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlIllI[2], llllllllllllllllIIIlllIIIIIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIllllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIlllllllllI) {
            llllllllllllllllIIIllIlllllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIIllIlI(int i, int i2) {
        return i == i2;
    }

    static {
        lIllIlIIIlIlIl();
        lIllIlIIIlIlII();
    }

    @Inject
    public j(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        super(squireBarrows, squireBarrowsConfig);
        this.J = null;
    }

    private static boolean lIllIlIIIlIllI(Object obj) {
        return obj == null;
    }

    private static void lIllIlIIIlIlIl() {
        llllIIlIllI = new int[6];
        llllIIlIllI[0] = (239 ^ 198) & ((183 ^ 158) ^ (-1));
        llllIIlIllI[1] = " ".length();
        llllIIlIllI[2] = "  ".length();
        llllIIlIllI[3] = -" ".length();
        llllIIlIllI[4] = "   ".length();
        llllIIlIllI[5] = (32 ^ 102) ^ (224 ^ 174);
    }

    private static boolean lIllIlIIIllIIl(int i, int i2) {
        return i < i2;
    }
}
