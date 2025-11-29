package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.whisperer.config.SquireWhispererConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@Singleton
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/b.class */
public class C0001b {
    private static /* synthetic */ int[] lIlIlllIlIlll;
    private static /* synthetic */ String[] lIlIlllIlIlII;
    private final /* synthetic */ SquireWhispererConfig i;

    private static boolean llIIIIlIlIIIIII(int i) {
        return i == 0;
    }

    public List<Integer> a(int i) {
        return new ArrayList(ItemVariationMapping.getVariations(i));
    }

    static {
        llIIIIlIIlllIll();
        llIIIIlIIlllIlI();
    }

    @Inject
    public C0001b(SquireWhispererConfig squireWhispererConfig) {
        this.i = squireWhispererConfig;
    }

    public boolean a(int[] iArr) {
        return Equipment.containsAllOf(iArr);
    }

    private static boolean llIIIIlIIlllllI(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIlIIllllIl(int i) {
        return i != 0;
    }

    private static boolean llIIIIlIIllllII(int i, int i2) {
        return i < i2;
    }

    public int[] c() {
        BankLoadout bankLoadout = (BankLoadout) this.i.bankLoadout().selected(BankLoadout.class);
        return llIIIIlIIlllllI(bankLoadout) ? new int[lIlIlllIlIlll[0]] : bankLoadout.getEquipmentSetup().getIds();
    }

    private static boolean llIIIIlIIllllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean b(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = lIlIlllIlIlll[0];
        while (llIIIIlIIllllII(i, length)) {
            int i2 = iArr[i];
            arrayList.addAll(Inventory.getAll(item -> {
                return a(i2).contains(Integer.valueOf(item.getId()));
            }));
            "".length();
            i++;
            "".length();
            if ((18 ^ 22) <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (llIIIIlIIllllIl(arrayList.isEmpty() ? 1 : 0)) {
            return lIlIlllIlIlll[0];
        }
        int i3 = lIlIlllIlIlll[0];
        while (llIIIIlIIllllII(i3, Math.min(arrayList.size(), lIlIlllIlIlll[1]))) {
            ((Item) arrayList.get(i3)).interact(str -> {
                if (!llIIIIlIIllllll(str) || (llIIIIlIlIIIIII(str.equals(lIlIlllIlIlII[lIlIlllIlIlll[0]]) ? 1 : 0) && llIIIIlIlIIIIII(str.equals(lIlIlllIlIlII[lIlIlllIlIlll[2]]) ? 1 : 0) && !llIIIIlIIllllIl(str.equals(lIlIlllIlIlII[lIlIlllIlIlll[3]]) ? 1 : 0))) {
                    return lIlIlllIlIlll[0];
                }
                ?? r0 = lIlIlllIlIlll[2];
                "".length();
                return "  ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            });
            i3++;
            "".length();
            if (((156 ^ 179) & ((20 ^ 59) ^ (-1))) <= (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIlllIlIlll[2];
    }

    private static String llIIIIlIIllIIIl(String llllllllllllllIllIIllllllIIlIIlI, String llllllllllllllIllIIllllllIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllllIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlllIlIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllllllIIlIIll) {
            llllllllllllllIllIIllllllIIlIIll.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIIlllIlI() {
        lIlIlllIlIlII = new String[lIlIlllIlIlll[4]];
        lIlIlllIlIlII[lIlIlllIlIlll[0]] = llIIIIlIIllIIIl("1XtVfH+pHNw=", "WXLTO");
        lIlIlllIlIlII[lIlIlllIlIlll[2]] = llIIIIlIIllIIIl("s/Ta6FbkQuE=", "shmat");
        lIlIlllIlIlII[lIlIlllIlIlll[3]] = llIIIIlIIllIIIl("At5n2xSawFc=", "tNchU");
    }

    private static void llIIIIlIIlllIll() {
        lIlIlllIlIlll = new int[5];
        lIlIlllIlIlll[0] = ((207 ^ 163) ^ (110 ^ 79)) & (((253 ^ 166) ^ (17 ^ 7)) ^ (-" ".length()));
        lIlIlllIlIlll[1] = (61 ^ 64) ^ (33 ^ 91);
        lIlIlllIlIlll[2] = " ".length();
        lIlIlllIlIlll[3] = "  ".length();
        lIlIlllIlIlll[4] = "   ".length();
    }
}
