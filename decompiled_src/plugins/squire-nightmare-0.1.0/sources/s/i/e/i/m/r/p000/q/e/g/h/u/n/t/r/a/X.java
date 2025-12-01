package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Retrieving teleport for death walking.", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.X  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/X.class */
public class X extends Y {
    private static /* synthetic */ int[] llllIlIIlIlI;
    private static /* synthetic */ String[] llllIlIIlIIl;

    private static boolean lIIlIIIIlIIIIll(int i) {
        return i != 0;
    }

    @Inject
    protected X(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.Y, s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIlIIIIlIIIIlI(this.cV.enableBanking() ? 1 : 0) && !lIIlIIIIlIIIIlI(this.cW.ad() ? 1 : 0)) {
            int[] iArr = new int[llllIlIIlIlI[1]];
            iArr[llllIlIIlIlI[0]] = llllIlIIlIlI[2];
            iArr[llllIlIIlIlI[3]] = llllIlIIlIlI[4];
            if (!lIIlIIIIlIIIIll(Inventory.contains(iArr) ? 1 : 0) && !lIIlIIIIlIIIlII(TileObjects.getNearest(tileObject -> {
                return tileObject.getName().contains(llllIlIIlIIl[llllIlIIlIlI[6]]);
            }))) {
                if (lIIlIIIIlIIIIll(Bank.isOpen() ? 1 : 0)) {
                    Predicate<Item> predicate = item -> {
                        if (lIIlIIIIlIIIIll(item.getName().toLowerCase().contains(llllIlIIlIIl[llllIlIIlIlI[1]]) ? 1 : 0) && lIIlIIIIlIIIIlI(item.isPlaceholder() ? 1 : 0)) {
                            ?? r0 = llllIlIIlIlI[3];
                            "".length();
                            return ((71 ^ 64) ^ "   ".length()) == " ".length() ? ((89 ^ 53) ^ (76 ^ 17)) & (((((21 + 166) - 70) + 57) ^ (((150 + 12) - 133) + 130)) ^ (-" ".length())) : r0;
                        }
                        return llllIlIIlIlI[0];
                    };
                    if (lIIlIIIIlIIIIll(cb() ? 1 : 0) && lIIlIIIIlIIIIll(Bank.contains(predicate) ? 1 : 0)) {
                        return a(predicate);
                    }
                    if (lIIlIIIIlIIIIll(C0013j.aU() ? 1 : 0)) {
                        int[] iArr2 = new int[llllIlIIlIlI[3]];
                        iArr2[llllIlIIlIlI[0]] = llllIlIIlIlI[4];
                        Item first = Bank.getFirst(iArr2);
                        if (lIIlIIIIlIIIlIl(first)) {
                            int[] iArr3 = new int[llllIlIIlIlI[3]];
                            iArr3[llllIlIIlIlI[0]] = llllIlIIlIlI[2];
                            first = Bank.getFirst(iArr3);
                        }
                        if (lIIlIIIIlIIIlII(first)) {
                            Bank.withdraw(first.getId(), llllIlIIlIlI[3], Bank.WithdrawMode.ITEM);
                            sleep(llllIlIIlIlI[1]);
                            return llllIlIIlIlI[3];
                        }
                        "".length();
                        if ((false ^ true) & ((true ^ true) ^ true)) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        int[] iArr4 = new int[llllIlIIlIlI[3]];
                        iArr4[llllIlIIlIlI[0]] = llllIlIIlIlI[2];
                        Item first2 = Bank.getFirst(iArr4);
                        if (lIIlIIIIlIIIlIl(first2)) {
                            int[] iArr5 = new int[llllIlIIlIlI[3]];
                            iArr5[llllIlIIlIlI[0]] = llllIlIIlIlI[4];
                            first2 = Bank.getFirst(iArr5);
                        }
                        if (lIIlIIIIlIIIlII(first2)) {
                            Bank.withdraw(first2.getId(), llllIlIIlIlI[3], Bank.WithdrawMode.ITEM);
                            sleep(llllIlIIlIlI[1]);
                            return llllIlIIlIlI[3];
                        }
                    }
                }
                if (lIIlIIIIlIIIIlI(Movement.shouldWalk() ? 1 : 0)) {
                    return llllIlIIlIlI[0];
                }
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIIIlIIIllI(nearest.getArea().distanceTo(Players.getLocal().getWorldLocation()), llllIlIIlIlI[5])) {
                    Movement.walkTo(nearest.getArea());
                    "".length();
                    return llllIlIIlIlI[3];
                }
                return Bank.open();
            }
            return llllIlIIlIlI[0];
        }
        return llllIlIIlIlI[0];
    }

    private static void lIIlIIIIIllllll() {
        llllIlIIlIIl = new String[llllIlIIlIlI[5]];
        llllIlIIlIIl[llllIlIIlIlI[0]] = lIIlIIIIIllllIl("PAArGzE=", "xrBuZ");
        llllIlIIlIIl[llllIlIIlIlI[3]] = lIIlIIIIIllllIl("Fygu", "RIZNV");
        llllIlIIlIIl[llllIlIIlIlI[1]] = lIIlIIIIIllllIl("BhAmPx0bBWciGwENKDw=", "udGRt");
        llllIlIIlIIl[llllIlIIlIlI[6]] = lIIlIIIIIlllllI("IAiOfjYOmQfGXjNKBfJ0jib7xcqxjcSd", "aYGvA");
    }

    private static boolean lIIlIIIIlIIIIlI(int i) {
        return i == 0;
    }

    private static String lIIlIIIIIllllIl(String lllllllllllllllIIlIllIllIIllIllI, String lllllllllllllllIIlIllIllIIllIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIllIIllIlII = new StringBuilder();
        char[] lllllllllllllllIIlIllIllIIllIIll = lllllllllllllllIIlIllIllIIllIlIl.toCharArray();
        int lllllllllllllllIIlIllIllIIllIIlI = llllIlIIlIlI[0];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIIlIllIllIIlIlIll = charArray.length;
        int lllllllllllllllIIlIllIllIIlIlIlI = llllIlIIlIlI[0];
        while (lIIlIIIIlIIIlll(lllllllllllllllIIlIllIllIIlIlIlI, lllllllllllllllIIlIllIllIIlIlIll)) {
            char lllllllllllllllIIlIllIllIIllIlll = charArray[lllllllllllllllIIlIllIllIIlIlIlI];
            lllllllllllllllIIlIllIllIIllIlII.append((char) (lllllllllllllllIIlIllIllIIllIlll ^ lllllllllllllllIIlIllIllIIllIIll[lllllllllllllllIIlIllIllIIllIIlI % lllllllllllllllIIlIllIllIIllIIll.length]));
            "".length();
            lllllllllllllllIIlIllIllIIllIIlI++;
            lllllllllllllllIIlIllIllIIlIlIlI++;
            "".length();
            if (((83 ^ 67) & ((118 ^ 102) ^ (-1))) < ((153 ^ 191) & ((74 ^ 108) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIllIIllIlII);
    }

    private static boolean lIIlIIIIlIIIlIl(Object obj) {
        return obj == null;
    }

    static {
        lIIlIIIIlIIIIIl();
        lIIlIIIIIllllll();
    }

    private static String lIIlIIIIIlllllI(String lllllllllllllllIIlIllIllIIlIIIIl, String lllllllllllllllIIlIllIllIIlIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIIlIIIII.getBytes(StandardCharsets.UTF_8)), llllIlIIlIlI[7]), "DES");
            Cipher lllllllllllllllIIlIllIllIIlIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIllIIlIIIll.init(llllIlIIlIlI[1], lllllllllllllllIIlIllIllIIlIIlII);
            return new String(lllllllllllllllIIlIllIllIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIllIIlIIIlI) {
            lllllllllllllllIIlIllIllIIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIIlIIIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    protected boolean a(Predicate<Item> predicate) {
        if (!lIIlIIIIlIIIlII(Bank.Inventory.getFirst(predicate))) {
            if (lIIlIIIIlIIIlll(Inventory.getFreeSlots(), llllIlIIlIlI[3])) {
                Bank.depositInventory();
                return llllIlIIlIlI[3];
            }
            Bank.withdraw(predicate, llllIlIIlIlI[3], Bank.WithdrawMode.ITEM);
            return llllIlIIlIlI[3];
        }
        Item first = Bank.Inventory.getFirst(predicate);
        String[] strArr = new String[llllIlIIlIlI[1]];
        strArr[llllIlIIlIlI[0]] = llllIlIIlIIl[llllIlIIlIlI[0]];
        strArr[llllIlIIlIlI[3]] = llllIlIIlIIl[llllIlIIlIlI[3]];
        first.interact(strArr);
        return llllIlIIlIlI[3];
    }

    private static void lIIlIIIIlIIIIIl() {
        llllIlIIlIlI = new int[8];
        llllIlIIlIlI[0] = (165 ^ 131) & ((91 ^ 125) ^ (-1));
        llllIlIIlIlI[1] = "  ".length();
        llllIlIIlIlI[2] = (-26213) & 30463;
        llllIlIIlIlI[3] = " ".length();
        llllIlIIlIlI[4] = (-2120) & 24519;
        llllIlIIlIlI[5] = (((107 + 131) - 139) + 82) ^ (((35 + 22) - 39) + 159);
        llllIlIIlIlI[6] = "   ".length();
        llllIlIIlIlI[7] = (((146 + 148) - 206) + 119) ^ (((57 + 132) - 140) + 150);
    }

    private static boolean lIIlIIIIlIIIllI(int i, int i2) {
        return i > i2;
    }
}
