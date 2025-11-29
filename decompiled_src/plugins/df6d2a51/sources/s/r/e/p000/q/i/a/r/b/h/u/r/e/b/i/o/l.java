package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;
@TaskDesc(name = "Banking", priority = 2)
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.l  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/l.class */
public class l extends Task {
    private static final /* synthetic */ WorldPoint ad;
    private static final /* synthetic */ Logger ac;
    private static /* synthetic */ int[] lllIIlllIlII;
    private final /* synthetic */ SquireHerbiboarConfig ae;
    private final /* synthetic */ SquireHerbiboarPlugin af;
    private static /* synthetic */ String[] lllIIlllIIll;
    private final /* synthetic */ d ag;
    /* synthetic */ Predicate<Item> ah = item -> {
        if (lIIIlIlIlllllIl(item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[3]]) ? 1 : 0) && lIIIlIlIlllllIl(item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[7]]) ? 1 : 0) && !lIIIlIlIllllIlI(item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[8]]) ? 1 : 0)) {
            return lllIIlllIlII[2];
        }
        ?? r0 = lllIIlllIlII[1];
        "".length();
        return " ".length() > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    };
    /* synthetic */ Predicate<Item> ai = item -> {
        return item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[6]]);
    };

    private static String lIIIlIlIlllIlIl(String lllllllllllllllIIllIIllIlllllIlI, String lllllllllllllllIIllIIllIlllllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIllIllllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIllIllllllII.init(lllIIlllIlII[4], lllllllllllllllIIllIIllIllllllIl);
            return new String(lllllllllllllllIIllIIllIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIllIlllllIll) {
            lllllllllllllllIIllIIllIlllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIllllllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public static boolean a(Predicate<Item> predicate) {
        int i = lllIIlllIlII[0];
        for (Item item : Inventory.getAll(predicate)) {
            int[] iArr = new int[lllIIlllIlII[1]];
            iArr[lllIIlllIlII[2]] = item.getId();
            Bank.depositAll(iArr);
            int i2 = i;
            i--;
            if (lIIIlIlIllllIll(i2)) {
                return lllIIlllIlII[1];
            }
            "".length();
            if ("   ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (lIIIlIlIlllllII(i, lllIIlllIlII[0])) {
            ?? r0 = lllIIlllIlII[1];
            "".length();
            return ((179 ^ 167) & ((42 ^ 62) ^ (-1))) >= (84 ^ 80) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIlllIlII[2];
    }

    private static boolean lIIIlIlIlllllIl(int i) {
        return i == 0;
    }

    private static void lIIIlIlIllllIIl() {
        lllIIlllIlII = new int[11];
        lllIIlllIlII[0] = (((65 + 89) - 127) + 103) ^ (((122 + 134) - 216) + 98);
        lllIIlllIlII[1] = " ".length();
        lllIIlllIlII[2] = (186 ^ 165) & ((136 ^ 151) ^ (-1));
        lllIIlllIlII[3] = (184 ^ 159) ^ (5 ^ 39);
        lllIIlllIlII[4] = "  ".length();
        lllIIlllIlII[5] = "   ".length();
        lllIIlllIlII[6] = (44 ^ 88) ^ (14 ^ 126);
        lllIIlllIlII[7] = (((50 + 20) - (-105)) + 17) ^ (((159 + 1) - (-16)) + 22);
        lllIIlllIlII[8] = (19 ^ 3) ^ (128 ^ 151);
        lllIIlllIlII[9] = (-12547) & 16286;
        lllIIlllIlII[10] = (-12290) & 16093;
    }

    private static boolean lIIIlIlIlllllII(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlIlIlllIlll(String lllllllllllllllIIllIIllIlllIlIlI, String lllllllllllllllIIllIIllIlllIlIIl) {
        String lllllllllllllllIIllIIllIlllIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllIlllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIllIlllIlIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIllIlllIlIIl.toCharArray();
        int lllllllllllllllIIllIIllIlllIIllI = lllIIlllIlII[2];
        char[] charArray2 = lllllllllllllllIIllIIllIlllIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = lllIIlllIlII[2];
        while (lIIIlIlIlllllII(i, length)) {
            char lllllllllllllllIIllIIllIlllIlIll = charArray2[i];
            lllllllllllllllIIllIIllIlllIlIII.append((char) (lllllllllllllllIIllIIllIlllIlIll ^ charArray[lllllllllllllllIIllIIllIlllIIllI % charArray.length]));
            "".length();
            lllllllllllllllIIllIIllIlllIIllI++;
            i++;
            "".length();
            if (((77 ^ 35) ^ (251 ^ 145)) <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIllIlllIlIII);
    }

    private static boolean lIIIlIllIIIIIII(int i) {
        return i > 0;
    }

    private static boolean lIIIlIlIlllllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIIIlIlIlllIllI(String lllllllllllllllIIllIIlllIIIIIlll, String lllllllllllllllIIllIIlllIIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlllIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIIIIIllI.getBytes(StandardCharsets.UTF_8)), lllIIlllIlII[0]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlllIlII[4], lllllllllllllllIIllIIlllIIIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlllIIIIlIII) {
            lllllllllllllllIIllIIlllIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIllllIll(int i) {
        return i <= 0;
    }

    @Inject
    public l(SquireHerbiboarConfig squireHerbiboarConfig, SquireHerbiboarPlugin squireHerbiboarPlugin, d dVar) {
        this.ae = squireHerbiboarConfig;
        this.af = squireHerbiboarPlugin;
        this.ag = dVar;
    }

    private static void lIIIlIlIllllIII() {
        lllIIlllIIll = new String[lllIIlllIlII[0]];
        lllIIlllIIll[lllIIlllIlII[2]] = lIIIlIlIlllIlIl("dLWyjXnPeEo=", "lVUTI");
        lllIIlllIIll[lllIIlllIlII[1]] = lIIIlIlIlllIlIl("bhbI4VK+nnU=", "MQzbj");
        lllIIlllIIll[lllIIlllIlII[4]] = lIIIlIlIlllIlIl("fA25aOOFbxI=", "jYcHH");
        lllIIlllIIll[lllIIlllIlII[5]] = lIIIlIlIlllIllI("b6lFHG5DdGk=", "xMrEf");
        lllIIlllIIll[lllIIlllIlII[6]] = lIIIlIlIlllIlll("GSgUL3oCLAUm", "qMfMZ");
        lllIIlllIIll[lllIIlllIlII[3]] = lIIIlIlIlllIlIl("Mcpv0uJw1Tc=", "wOzfS");
        lllIIlllIIll[lllIIlllIlII[7]] = lIIIlIlIlllIlIl("h1e7UXTsOI8=", "iwwtC");
        lllIIlllIIll[lllIIlllIlII[8]] = lIIIlIlIlllIlll("BwE1BCgAAD0=", "itXqD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v126, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v128, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v130, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v52, types: [boolean] */
    public boolean run() {
        if (!lIIIlIlIlllllIl(this.af.f() ? 1 : 0) && !lIIIlIlIlllllIl(Movement.shouldWalk() ? 1 : 0)) {
            Player local = Players.getLocal();
            if (lIIIlIlIlllllIl(Bank.isOpen() ? 1 : 0)) {
                if (lIIIlIlIllllllI(local.distanceTo(ad), lllIIlllIlII[3])) {
                    Movement.walkTo(ad);
                    "".length();
                    return lllIIlllIlII[1];
                }
                return Bank.open();
            }
            if (lIIIlIlIllllIlI(this.ae.useHerbSack() ? 1 : 0) && lIIIlIlIllllIlI(Inventory.contains(item -> {
                return item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[5]]);
            }) ? 1 : 0)) {
                this.af.b(lllIIlllIlII[2]);
            }
            if (lIIIlIlIllllIlI(Inventory.contains(this.ah) ? 1 : 0)) {
                a(this.ah);
                "".length();
                return lllIIlllIlII[1];
            }
            if (lIIIlIlIllllIlI(this.ae.useHerbSack() ? 1 : 0) && lIIIlIlIlllllIl(Inventory.contains(this.ai) ? 1 : 0)) {
                Bank.withdraw(this.ai, lllIIlllIlII[1], Bank.WithdrawMode.ITEM);
            }
            if (lIIIlIlIllllIlI(this.ae.useHerbSack() ? 1 : 0) && lIIIlIlIlllllIl(this.af.g() ? 1 : 0) && lIIIlIlIllllIlI(Inventory.contains(item2 -> {
                return item2.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[4]]);
            }) ? 1 : 0)) {
                Bank.Inventory.getFirst(item3 -> {
                    return item3.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[1]]);
                }).interact(lllIIlllIIll[lllIIlllIlII[2]]);
                return lllIIlllIlII[1];
            }
            e useEnergyRestoration = this.ae.useEnergyRestoration();
            if (lIIIlIlIlllllll(useEnergyRestoration, e.NONE)) {
                int quantity = this.ae.quantity();
                int[] j = useEnergyRestoration.j();
                int length = j.length;
                int i = lllIIlllIlII[2];
                do {
                    if (lIIIlIlIlllllII(i, length)) {
                        int i2 = j[i];
                        int[] iArr = new int[lllIIlllIlII[1]];
                        iArr[lllIIlllIlII[2]] = i2;
                        if (lIIIlIlIllllIlI(Bank.contains(iArr) ? 1 : 0)) {
                            ?? r0 = lllIIlllIlII[1];
                            int[] iArr2 = new int[lllIIlllIlII[1]];
                            iArr2[lllIIlllIlII[2]] = i2;
                            quantity -= Bank.getCount((boolean) r0, iArr2);
                            Bank.withdraw(i2, this.ae.quantity(), Bank.WithdrawMode.ITEM);
                            if (lIIIlIlIllllIll(quantity)) {
                                "".length();
                                if ((-((((95 + 122) - 60) + 26) ^ (((2 + 132) - (-41)) + 4))) >= 0) {
                                    return ((((8 + 47) - (-113)) + 68) ^ (((112 + 5) - (-40)) + 5)) & (((145 ^ 181) ^ (48 ^ 90)) ^ (-" ".length()));
                                }
                            }
                        }
                        i++;
                        "".length();
                    }
                    if (lIIIlIllIIIIIII(quantity)) {
                        Log.debug("We ran out of " + String.valueOf(this.ae.useEnergyRestoration()) + ", stopping");
                        this.af.forceStop();
                        return lllIIlllIlII[1];
                    }
                } while (0 == 0);
                return ((118 ^ 108) ^ (94 ^ 80)) & (((24 ^ 5) ^ (157 ^ 148)) ^ (-" ".length()));
            }
            this.af.a((boolean) lllIIlllIlII[2]);
            Bank.close();
            return lllIIlllIlII[2];
        }
        return lllIIlllIlII[2];
    }

    private static boolean lIIIlIlIllllIlI(int i) {
        return i != 0;
    }

    static {
        lIIIlIlIllllIIl();
        lIIIlIlIllllIII();
        ac = LoggerFactory.getLogger(l.class);
        ad = new WorldPoint(lllIIlllIlII[9], lllIIlllIlII[10], lllIIlllIlII[2]);
    }
}
