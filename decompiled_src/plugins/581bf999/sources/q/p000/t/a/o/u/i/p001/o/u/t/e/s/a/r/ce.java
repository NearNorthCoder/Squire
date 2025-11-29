package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Banking to go back in", priority = 10, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ce  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ce.class */
public class ce extends ck {
    private static /* synthetic */ int[] llIIIllIIII;
    private static /* synthetic */ String[] llIIIlIllll;

    private static void lIIllllIlIlIII() {
        llIIIllIIII = new int[7];
        llIIIllIIII[0] = ((30 ^ 33) ^ (77 ^ 64)) & (((205 ^ 188) ^ (97 ^ 34)) ^ (-" ".length()));
        llIIIllIIII[1] = " ".length();
        llIIIllIIII[2] = "  ".length();
        llIIIllIIII[3] = "   ".length();
        llIIIllIIII[4] = (134 ^ 148) ^ (117 ^ 98);
        llIIIllIIII[5] = 59 ^ 63;
        llIIIllIIII[6] = 107 ^ 99;
    }

    private static String lIIllllIlIIllI(String llllllllllllllllIlIIIlIIIIIIIllI, String llllllllllllllllIlIIIlIIIIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), llIIIllIIII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIlIIIIIIIlll) {
            llllllllllllllllIlIIIlIIIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIlIlIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ck
    public boolean bl() {
        BankLoadout bankLoadout = (BankLoadout) this.hY.loadout().selected(BankLoadout.class);
        if (lIIllllIlIlIIl(bankLoadout.needsToBank() ? 1 : 0)) {
            Log.info(llIIIlIllll[llIIIllIIII[0]]);
            return llIIIllIIII[0];
        } else if (lIIllllIlIlIlI(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info(llIIIlIllll[llIIIllIIII[1]]);
            return llIIIllIIII[0];
        } else if (!lIIllllIlIlIIl(Bank.isOpen() ? 1 : 0)) {
            if (lIIllllIlIlIIl(BankLoadouts.withdrawWithRetries(bankLoadout, llIIIllIIII[4]).booleanValue() ? 1 : 0)) {
                Log.info(llIIIlIllll[llIIIllIIII[5]]);
                return llIIIllIIII[0];
            }
            return llIIIllIIII[1];
        } else {
            String[] strArr = new String[llIIIllIIII[1]];
            strArr[llIIIllIIII[0]] = llIIIlIllll[llIIIllIIII[2]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIIllllIlIlIll(nearest)) {
                return llIIIllIIII[0];
            }
            nearest.interact(llIIIlIllll[llIIIllIIII[3]]);
            return llIIIllIIII[1];
        }
    }

    private static String lIIllllIlIIlIl(String llllllllllllllllIlIIIlIIIIIllIll, String llllllllllllllllIlIIIlIIIIIllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIlIIIlIIIIIllIII = llllllllllllllllIlIIIlIIIIIllIlI.toCharArray();
        int llllllllllllllllIlIIIlIIIIIlIlll = llIIIllIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIllIIII[0];
        while (lIIllllIlIllII(i, length)) {
            char llllllllllllllllIlIIIlIIIIIlllII = charArray[i];
            sb.append((char) (llllllllllllllllIlIIIlIIIIIlllII ^ llllllllllllllllIlIIIlIIIIIllIII[llllllllllllllllIlIIIlIIIIIlIlll % llllllllllllllllIlIIIlIIIIIllIII.length]));
            "".length();
            llllllllllllllllIlIIIlIIIIIlIlll++;
            i++;
            "".length();
            if ((((((3 + 72) - (-6)) + 120) ^ (((125 + 98) - 172) + 83)) & (((137 ^ 141) ^ (19 ^ 88)) ^ (-" ".length()))) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIllllIlIIlll() {
        llIIIlIllll = new String[llIIIllIIII[4]];
        llIIIlIllll[llIIIllIIII[0]] = lIIllllIlIIlIl("MCcsFi4tCj8xMQ4IPiVlPABtHCoFQjlYKw4AKVgxBEUvGSsA", "keMxE");
        llIIIlIllll[llIIIllIIII[1]] = lIIllllIlIIllI("6rfNnrbya+DF2OpPx9SKpUzOHrwz4IduVTctTcnK4s3sJT0D4zQubyJ3RBmUX4MT", "JUKYK");
        llIIIlIllll[llIIIllIIII[2]] = lIIllllIlIIlIl("DSsXPWUMKxQzKQ==", "OJyVE");
        llIIIlIllll[llIIIllIIII[3]] = lIIllllIlIIllI("DjGSMTy5B9U=", "XQsLN");
        llIIIlIllll[llIIIllIIII[5]] = lIIllllIlIIlIl("CBsXIikVNgQFNjY0BRFiEj8CKTBzbFY4MDo8BWBiIC0fIC5zNxk4YjYoAyUyIzAYK2InMRNsMDo+HjhiIC0DKiQ=", "SYvLB");
    }

    private static boolean lIIllllIlIlIlI(int i) {
        return i != 0;
    }

    private static boolean lIIllllIlIlIIl(int i) {
        return i == 0;
    }

    static {
        lIIllllIlIlIII();
        lIIllllIlIIlll();
    }

    @Inject
    protected ce(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static boolean lIIllllIlIllII(int i, int i2) {
        return i < i2;
    }
}
