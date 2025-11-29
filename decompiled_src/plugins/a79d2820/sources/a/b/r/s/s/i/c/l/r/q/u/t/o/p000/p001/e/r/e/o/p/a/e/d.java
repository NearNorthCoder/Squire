package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.corp.SquireCorp;
import gg.squire.corp.SquireCorpConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Checking if we should bank")
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.d  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/d.class */
public class d extends Task {
    private static /* synthetic */ String[] lIlIllllllII;
    @Inject
    private /* synthetic */ SquireCorp p;
    private static /* synthetic */ int[] lIlIllllllIl;
    @Inject
    private /* synthetic */ SquireCorpConfig o;

    private static String lllIIIlIlllIlI(String lllllllllllllllIllIIIllIIIllllIl, String lllllllllllllllIllIIIllIIIllllII) {
        try {
            SecretKeySpec lllllllllllllllIllIIIllIIlIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIllIIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllllllIl[3], lllllllllllllllIllIIIllIIlIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIllIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIllIIIlllllI) {
            lllllllllllllllIllIIIllIIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIlllllI(Object obj) {
        return obj != null;
    }

    static {
        lllIIIlIllllIl();
        lllIIIlIllllII();
    }

    private static void lllIIIlIllllIl() {
        lIlIllllllIl = new int[10];
        lIlIllllllIl[0] = " ".length();
        lIlIllllllIl[1] = "   ".length() & ("   ".length() ^ (-" ".length()));
        lIlIllllllIl[2] = (7 ^ 25) ^ (134 ^ 146);
        lIlIllllllIl[3] = "  ".length();
        lIlIllllllIl[4] = "   ".length();
        lIlIllllllIl[5] = (((2 + 32) - (-20)) + 141) ^ (((15 + 157) - 26) + 53);
        lIlIllllllIl[6] = 117 ^ 112;
        lIlIllllllIl[7] = 73 ^ 79;
        lIlIllllllIl[8] = 7 ^ 0;
        lIlIllllllIl[9] = (((5 + 31) - (-64)) + 28) ^ (((134 + 24) - 152) + 130);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[lIlIllllllIl[0]];
        strArr[lIlIllllllIl[1]] = lIlIllllllII[lIlIllllllIl[1]];
        if (lllIIIlIlllllI(NPCs.getNearest(strArr))) {
            sleep(lIlIllllllIl[2]);
            return lIlIllllllIl[1];
        }
        if (!lllIIIlIllllll(this.p.c() ? 1 : 0) && !lllIIIlIllllll(this.p.b() ? 1 : 0)) {
            if (lllIIIlIllllll(Inventory.isFull() ? 1 : 0)) {
                Log.info(lIlIllllllII[lIlIllllllIl[0]]);
                this.p.a((boolean) lIlIllllllIl[0]);
            }
            if (lllIIIllIIIIII(Inventory.getFirst(item -> {
                return a(item.getName());
            })) && lllIIIlIllllll(i() ? 1 : 0)) {
                this.p.a((boolean) lIlIllllllIl[0]);
            }
            if (lllIIIllIIIIII(Inventory.getFirst(item2 -> {
                String[] strArr2 = new String[lIlIllllllIl[0]];
                strArr2[lIlIllllllIl[1]] = lIlIllllllII[lIlIllllllIl[7]];
                return item2.hasAction(strArr2);
            })) && lllIIIlIllllll(h() ? 1 : 0)) {
                Log.info(lIlIllllllII[lIlIllllllIl[3]]);
                this.p.a((boolean) lIlIllllllIl[0]);
            }
            return lIlIllllllIl[1];
        }
        return lIlIllllllIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean a(String str) {
        if (!lllIIIllIIIIIl(str.toLowerCase().contains(lIlIllllllII[lIlIllllllIl[5]]) ? 1 : 0) || lllIIIlIllllll(str.toLowerCase().contains(lIlIllllllII[lIlIllllllIl[6]]) ? 1 : 0)) {
            ?? r0 = lIlIllllllIl[0];
            "".length();
            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIllllllIl[1];
    }

    private boolean i() {
        return Arrays.stream(((BankLoadout) this.o.bankLoadout().selected(BankLoadout.class)).getInventorySetup().getIds()).mapToObj(i -> {
            return Static.getClient().getItemDefinition(i);
        }).anyMatch(itemComposition -> {
            return a(itemComposition.getName());
        });
    }

    private static void lllIIIlIllllII() {
        lIlIllllllII = new String[lIlIllllllIl[8]];
        lIlIllllllII[lIlIllllllIl[1]] = lllIIIlIlllIIl("NhcCATsHHREddDcdEQIg", "uxpqT");
        lIlIllllllII[lIlIllllllIl[0]] = lllIIIlIlllIlI("BOm92oZ1AjX0TDwg2gTW1+H7nwPrSpi+astI4XgFADk4dchl5bDE5A==", "Nrftp");
        lIlIllllllII[lIlIllllllIl[3]] = lllIIIlIlllIIl("Hw8kJyQiDXAxLCIBOT0qbB4/czk+HzVzIjkecDwrbAw/PCk=", "LjPSM");
        lIlIllllllII[lIlIllllllIl[4]] = lllIIIlIlllIll("WM+5EEgY1Jc=", "dxGKH");
        lIlIllllllII[lIlIllllllIl[5]] = lllIIIlIlllIIl("ExsjNCcE", "ptNVF");
        lIlIllllllII[lIlIllllllIl[6]] = lllIIIlIlllIlI("vxS7JJWtPiE=", "TOKZG");
        lIlIllllllII[lIlIllllllIl[7]] = lllIIIlIlllIll("A+T94vT9tcw=", "heiJT");
    }

    private static String lllIIIlIlllIll(String lllllllllllllllIllIIIllIIIllIIII, String lllllllllllllllIllIIIllIIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIllIIIllIIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIllIIIlIllll.getBytes(StandardCharsets.UTF_8)), lIlIllllllIl[9]), "DES");
            Cipher lllllllllllllllIllIIIllIIIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIIIllIIIllIIlI.init(lIlIllllllIl[3], lllllllllllllllIllIIIllIIIllIIll);
            return new String(lllllllllllllllIllIIIllIIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIllIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIllIIIllIIIl) {
            lllllllllllllllIllIIIllIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIllIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIIlIllllll(int i) {
        return i != 0;
    }

    private static String lllIIIlIlllIIl(String lllllllllllllllIllIIIllIIIlIIIII, String lllllllllllllllIllIIIllIIIIlllll) {
        String lllllllllllllllIllIIIllIIIlIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIllIIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIllIIIIllllI = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIllIIIIlllll.toCharArray();
        int lllllllllllllllIllIIIllIIIIlllII = lIlIllllllIl[1];
        char[] charArray2 = lllllllllllllllIllIIIllIIIlIIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIllllllIl[1];
        while (lllIIIllIIIIlI(i, length)) {
            char lllllllllllllllIllIIIllIIIlIIIIl = charArray2[i];
            lllllllllllllllIllIIIllIIIIllllI.append((char) (lllllllllllllllIllIIIllIIIlIIIIl ^ charArray[lllllllllllllllIllIIIllIIIIlllII % charArray.length]));
            "".length();
            lllllllllllllllIllIIIllIIIIlllII++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIIllIIIIllllI);
    }

    private boolean h() {
        Stream flatMap = Arrays.stream(((BankLoadout) this.o.bankLoadout().selected(BankLoadout.class)).getInventorySetup().getIds()).mapToObj(i -> {
            return Static.getClient().getItemDefinition(i);
        }).flatMap(itemComposition -> {
            return Arrays.stream(itemComposition.getInventoryActions());
        });
        String str = lIlIllllllII[lIlIllllllIl[4]];
        return flatMap.anyMatch((v1) -> {
            return r1.equals(v1);
        });
    }

    private static boolean lllIIIllIIIIIl(int i) {
        return i == 0;
    }

    private static boolean lllIIIllIIIIII(Object obj) {
        return obj == null;
    }
}
