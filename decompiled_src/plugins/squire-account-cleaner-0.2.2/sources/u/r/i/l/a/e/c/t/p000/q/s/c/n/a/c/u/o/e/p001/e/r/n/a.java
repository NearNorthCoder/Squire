package u.r.i.l.a.e.c.t.p000.q.s.c.n.a.c.u.o.e.p001.e.r.n;

import com.google.inject.Inject;
import gg.squire.cleaner.SquireAccountCleanerConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
@TaskDesc(name = "Banking")
/* renamed from: u.r.i.l.a.e.c.t.-.q.s.c.n.a.c.u.o.e.-.e.r.n.a  reason: invalid package */
/* loaded from: squire-account-cleaner-0.2.2.jar:u/r/i/l/a/e/c/t/-/q/s/c/n/a/c/u/o/e/-/e/r/n/a.class */
public class a extends Task {
    private static /* synthetic */ int[] lIlIlIIIIIl;
    private final /* synthetic */ SquireAccountCleanerConfig d;
    private static /* synthetic */ String[] lIlIlIIIIII;

    private static boolean lIIlIIIIllIlII(Object obj) {
        return obj != null;
    }

    private static String lIIlIIIIlIlllI(String llllllllllllllllIlIlllIllllIllII, String llllllllllllllllIlIlllIllllIlIll) {
        String llllllllllllllllIlIlllIllllIllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIlllIllllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIlllIllllIlIll.toCharArray();
        int llllllllllllllllIlIlllIllllIlIII = lIlIlIIIIIl[1];
        char[] charArray2 = llllllllllllllllIlIlllIllllIllII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIIIIl[1];
        while (lIIlIIIIllIllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIlIlllIllllIlIII % charArray.length]));
            "".length();
            llllllllllllllllIlIlllIllllIlIII++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIlIIIIllIIIl() {
        lIlIlIIIIII = new String[lIlIlIIIIIl[6]];
        lIlIlIIIIII[lIlIlIIIIIl[1]] = lIIlIIIIlIlllI("AS4XODcx", "COySR");
        lIlIlIIIIII[lIlIlIIIIIl[0]] = lIIlIIIIlIlllI("Cw0eLQ==", "IlpFH");
        lIlIlIIIIII[lIlIlIIIIIl[2]] = lIIlIIIIlIllll("W8Qlm1Wodqo=", "qfpQL");
        lIlIlIIIIII[lIlIlIIIIIl[4]] = lIIlIIIIllIIII("fg28iXZ7yWI=", "CbtFf");
    }

    private static boolean lIIlIIIIlllIII(int i, int i2) {
        return i != i2;
    }

    private static String lIIlIIIIllIIII(String llllllllllllllllIlIlllIlllIIlIlI, String llllllllllllllllIlIlllIlllIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlllIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIl[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlllIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlllIlllIIlIll) {
            llllllllllllllllIlIlllIlllIIlIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public a(SquireAccountCleanerConfig squireAccountCleanerConfig) {
        this.d = squireAccountCleanerConfig;
    }

    private static void lIIlIIIIllIIlI() {
        lIlIlIIIIIl = new int[7];
        lIlIlIIIIIl[0] = " ".length();
        lIlIlIIIIIl[1] = (113 ^ 109) & ((152 ^ 132) ^ (-1));
        lIlIlIIIIIl[2] = "  ".length();
        lIlIlIIIIIl[3] = (((113 + 62) - 137) + 131) ^ (((118 + 58) - 78) + 63);
        lIlIlIIIIIl[4] = "   ".length();
        lIlIlIIIIIl[5] = (-((-1635) & 28271)) & (-4113) & 31743;
        lIlIlIIIIIl[6] = "   ".length() ^ (92 ^ 91);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean a(Item item) {
        return lIIlIIIIllIIll(item.getName().contains(lIlIlIIIIII[lIlIlIIIIIl[4]]) ? 1 : 0) ? lIlIlIIIIIl[1] : Static.getClient().getItemComposition(item.getId()).isTradeable();
    }

    private int b(Item item) {
        Static.getClient().getItemDefinition(item.getId()).getName().toLowerCase();
        return Prices.getItemPrice(item.getId()) * item.getQuantity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    public boolean run() {
        if (lIIlIIIIllIIll(Inventory.contains(item -> {
            if (lIIlIIIIlllIII(item.getId(), lIlIlIIIIIl[5])) {
                ?? r0 = lIlIlIIIIIl[0];
                "".length();
                return ((85 ^ 92) ^ (206 ^ 194)) <= 0 ? ((168 ^ 183) ^ (84 ^ 40)) & (((226 ^ 138) ^ (80 ^ 91)) ^ (-" ".length())) : r0;
            }
            return lIlIlIIIIIl[1];
        }) ? 1 : 0) && lIIlIIIIllIIll(Bank.isOpen() ? 1 : 0)) {
            String[] strArr = new String[lIlIlIIIIIl[0]];
            strArr[lIlIlIIIIIl[1]] = lIlIlIIIIII[lIlIlIIIIIl[1]];
            NPC nearest = NPCs.getNearest(strArr);
            if (lIIlIIIIllIlII(nearest) && lIIlIIIIllIlIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                nearest.interact(lIlIlIIIIII[lIlIlIIIIIl[0]]);
                return lIlIlIIIIIl[1];
            }
        }
        String ignoreList = this.d.ignoreList();
        ArrayList arrayList = new ArrayList();
        if (lIIlIIIIllIIll(ignoreList.isEmpty() ? 1 : 0)) {
            String[] split = ignoreList.split(lIlIlIIIIII[lIlIlIIIIIl[2]]);
            int length = split.length;
            int i = lIlIlIIIIIl[1];
            while (lIIlIIIIllIllI(i, length)) {
                arrayList.add(Integer.valueOf(Integer.parseInt(split[i])));
                "".length();
                i++;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        if (lIIlIIIIllIlIl(Bank.isOpen() ? 1 : 0) && lIIlIIIIllIIll(Inventory.isFull() ? 1 : 0)) {
            List all = Bank.getAll(item2 -> {
                if (lIIlIIIIllIlll(b(item2), this.d.sellValue()) && lIIlIIIIllIIll(arrayList.contains(Integer.valueOf(item2.getId())) ? 1 : 0) && (!lIIlIIIIllIIll(item2.isTradable() ? 1 : 0) || lIIlIIIIllIlIl(a(item2) ? 1 : 0))) {
                    ?? r0 = lIlIlIIIIIl[0];
                    "".length();
                    return "  ".length() <= 0 ? ((((167 + 117) - 246) + 130) ^ (((62 + 76) - 38) + 34)) & (((((63 + 17) - (-29)) + 31) ^ (((147 + 59) - 70) + 26)) ^ (-" ".length())) : r0;
                }
                return lIlIlIIIIIl[1];
            });
            int i2 = lIlIlIIIIIl[1];
            Iterator it = all.iterator();
            do {
                if (lIIlIIIIllIlIl(it.hasNext() ? 1 : 0)) {
                    Item item3 = (Item) it.next();
                    if (lIIlIIIIllIlll(i2, lIlIlIIIIIl[3])) {
                        "".length();
                        if ((41 ^ 44) <= 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        i2++;
                        Bank.withdrawAll(item3.getId(), Bank.WithdrawMode.NOTED);
                        "".length();
                    }
                }
            } while (" ".length() == " ".length());
            return ((((117 + 166) - 259) + 167) ^ (((144 + 137) - 119) + 17)) & (((102 ^ 105) ^ "   ".length()) ^ (-" ".length()));
        }
        return lIlIlIIIIIl[0];
    }

    private static boolean lIIlIIIIllIIll(int i) {
        return i == 0;
    }

    private static boolean lIIlIIIIllIlll(int i, int i2) {
        return i > i2;
    }

    private static String lIIlIIIIlIllll(String llllllllllllllllIlIlllIlllIlIlIl, String llllllllllllllllIlIlllIlllIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlllIlllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlllIlllIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlllIlllIllIIl.init(lIlIlIIIIIl[2], secretKeySpec);
            return new String(llllllllllllllllIlIlllIlllIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlllIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlllIlllIllIII) {
            llllllllllllllllIlIlllIlllIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIllIllI(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIIIIllIIlI();
        lIIlIIIIllIIIl();
    }

    private static boolean lIIlIIIIllIlIl(int i) {
        return i != 0;
    }
}
