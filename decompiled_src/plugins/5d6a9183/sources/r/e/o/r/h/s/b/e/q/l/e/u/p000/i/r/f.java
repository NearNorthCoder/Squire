package r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.client.eventbus.EventBus;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Banking")
/* renamed from: r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f  reason: invalid package */
/* loaded from: 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c.jar:r/e/o/r/h/s/b/e/q/l/e/u/-/i/r/f.class */
public class f extends d {
    private /* synthetic */ c e;
    private final /* synthetic */ EventBus o;
    private /* synthetic */ b f;
    private /* synthetic */ e g;
    private static final /* synthetic */ Logger n;
    private static /* synthetic */ String[] lllIlIIIIIII;
    private static /* synthetic */ int[] lllIlIIIIIIl;

    private static boolean lIIIlIllIllIllI(int i) {
        return i != 0;
    }

    private static boolean lIIIlIllIllIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIIIlIllIllIIII(String lllllllllllllllIIllIIlIlIIIIlIIl, String lllllllllllllllIIllIIlIlIIIIlIII) {
        String lllllllllllllllIIllIIlIlIIIIlIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIlIlIIIIlIII.toCharArray();
        int lllllllllllllllIIllIIlIlIIIIIlIl = lllIlIIIIIIl[0];
        char[] charArray2 = lllllllllllllllIIllIIlIlIIIIlIIl2.toCharArray();
        int lllllllllllllllIIllIIlIIlllllllI = charArray2.length;
        int i = lllIlIIIIIIl[0];
        while (lIIIlIllIlllIII(i, lllllllllllllllIIllIIlIIlllllllI)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIIlIlIIIIIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIllIIlIlIIIIIlIl++;
            i++;
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIlIllIllIIll() {
        lllIlIIIIIIl = new int[9];
        lllIlIIIIIIl[0] = ((32 ^ 116) ^ (59 ^ 115)) & (((66 ^ 125) ^ (28 ^ 63)) ^ (-" ".length()));
        lllIlIIIIIIl[1] = " ".length();
        lllIlIIIIIIl[2] = ((170 + 206) - 265) + 116;
        lllIlIIIIIIl[3] = "  ".length();
        lllIlIIIIIIl[4] = "   ".length();
        lllIlIIIIIIl[5] = (((7 + 19) - (-46)) + 78) ^ (((89 + 74) - 124) + 113);
        lllIlIIIIIIl[6] = 190 ^ 186;
        lllIlIIIIIIl[7] = (((102 + 144) - 70) + 12) ^ (((117 + 92) - 65) + 41);
        lllIlIIIIIIl[8] = 6 ^ 0;
    }

    static {
        lIIIlIllIllIIll();
        lIIIlIllIllIIlI();
        n = LoggerFactory.getLogger(f.class);
    }

    private static boolean lIIIlIllIlllIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    private boolean p() {
        if (lIIIlIllIllIlIl(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
        }
        for (Integer num : this.g.n().keySet()) {
            int[] iArr = new int[lllIlIIIIIIl[1]];
            iArr[lllIlIIIIIIl[0]] = num.intValue();
            if (lIIIlIllIllIlIl(Bank.contains(iArr) ? 1 : 0) && lIIIlIllIllIlIl(Inventory.contains(item -> {
                if (lIIIlIllIlllIIl(item.getId(), num.intValue()) && lIIIlIllIllIllI(item.isStackable() ? 1 : 0)) {
                    ?? r0 = lllIlIIIIIIl[1];
                    "".length();
                    return 0 != 0 ? ((197 ^ 163) ^ (58 ^ 22)) & (((((82 + 142) - 123) + 104) ^ (((72 + 43) - 20) + 40)) ^ (-" ".length())) : r0;
                }
                return lllIlIIIIIIl[0];
            }) ? 1 : 0)) {
                String str = lllIlIIIIIII[lllIlIIIIIIl[0]];
                Object[] objArr = new Object[lllIlIIIIIIl[1]];
                objArr[lllIlIIIIIIl[0]] = e.a(this.f);
                Log.info(str, objArr);
                if (!lIIIlIllIllIlII(this.e, c.ALL_STAGES_ALL_HERBS) || lIIIlIllIllIlII(this.f, b.values()[b.values().length - lllIlIIIIIIl[1]])) {
                    Log.info(lllIlIIIIIII[lllIlIIIIIIl[1]]);
                    k().forceStop();
                }
                return lllIlIIIIIIl[0];
            }
            int[] iArr2 = new int[lllIlIIIIIIl[1]];
            iArr2[lllIlIIIIIIl[0]] = num.intValue();
            if (lIIIlIllIllIllI(Bank.getFirst(iArr2).isStackable() ? 1 : 0)) {
                Bank.withdrawAll(num.intValue(), Bank.WithdrawMode.ITEM);
                "".length();
                if (" ".length() < " ".length()) {
                    return "   ".length() & ("   ".length() ^ (-1));
                }
            } else {
                Bank.withdraw(num.intValue(), this.g.n().get(num).intValue(), Bank.WithdrawMode.ITEM);
            }
            "".length();
            if (!(true ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIlIIIIIIl[1];
    }

    private boolean u() {
        return a(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    private boolean o() {
        switch (g.p[this.e.ordinal()]) {
            case 1:
                return r();
            case 2:
                return q();
            case 3:
                return p();
            default:
                return lllIlIIIIIIl[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t() {
        if (!lIIIlIllIllIlII(this.e, c.FINISH_POTS)) {
            s();
            return;
        }
        Item item = (Item) Bank.getAll(item2 -> {
            return Arrays.stream(b.values()).anyMatch(bVar -> {
                return bVar.a(item2.getId());
            });
        }).stream().min(Comparator.comparingInt((v0) -> {
            return v0.getId();
        })).orElse(null);
        if (lIIIlIllIllIlll(item)) {
            return;
        }
        b[] values = b.values();
        int length = values.length;
        int i = lllIlIIIIIIl[0];
        do {
            if (lIIIlIllIlllIII(i, length)) {
                b bVar = values[i];
                if (lIIIlIllIllIllI(bVar.a(item.getId()) ? 1 : 0)) {
                    this.f = bVar;
                    this.e = bVar.b(item.getId());
                    this.g = e.a(this.f);
                    this.o.post(new a(this.e, this.f, this.g));
                    "".length();
                    if ("  ".length() <= (-" ".length())) {
                        return;
                    }
                } else {
                    i++;
                    "".length();
                }
            }
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return;
            }
            return;
        } while ((112 ^ 116) > ((57 ^ 109) & ((82 ^ 6) ^ (-1))));
    }

    private void s() {
        switch (g.p[this.e.ordinal()]) {
            case 1:
                this.e = c.MAKE_UNF_POTS;
                "".length();
                if ((((((70 + 101) - 131) + 141) ^ (((102 + 106) - 72) + 7)) & (((55 ^ 77) ^ (95 ^ 31)) ^ (-" ".length()))) < 0) {
                    return;
                }
                break;
            case 2:
                this.e = c.FINISH_POTS;
                break;
        }
        this.o.post(new a(this.e, this.f, this.g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    private boolean r() {
        int[] iArr = new int[lllIlIIIIIIl[1]];
        iArr[lllIlIIIIIIl[0]] = this.f.e();
        if (!lIIIlIllIllIlIl(Bank.contains(iArr) ? 1 : 0)) {
            if (lIIIlIllIllIlIl(Inventory.isEmpty() ? 1 : 0)) {
                Bank.depositInventory();
            }
            Bank.withdrawAll(j().herb().e(), Bank.WithdrawMode.ITEM);
            return lllIlIIIIIIl[1];
        }
        String str = lllIlIIIIIII[lllIlIIIIIIl[6]];
        Object[] objArr = new Object[lllIlIIIIIIl[1]];
        objArr[lllIlIIIIIIl[0]] = this.f;
        Log.info(str, objArr);
        if (lIIIlIllIllIlII(this.e, c.CLEAN_HERBS)) {
            Log.info(lllIlIIIIIII[lllIlIIIIIIl[7]]);
            k().forceStop();
        }
        return lllIlIIIIIIl[0];
    }

    private static boolean lIIIlIllIllIlIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    private boolean a(c cVar) {
        switch (g.p[cVar.ordinal()]) {
            case 1:
                int[] iArr = new int[lllIlIIIIIIl[1]];
                iArr[lllIlIIIIIIl[0]] = j().herb().e();
                if (lIIIlIllIllIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                    ?? r0 = lllIlIIIIIIl[1];
                    "".length();
                    return (((6 ^ 21) ^ (73 ^ 84)) & (((27 ^ 69) ^ (147 ^ 195)) ^ (-" ".length()))) < 0 ? ((((21 + 205) - 191) + 192) ^ (((17 + 107) - 78) + 125)) & (((251 ^ 151) ^ (74 ^ 110)) ^ (-" ".length())) : r0;
                }
                return lllIlIIIIIIl[0];
            case 2:
                int[] iArr2 = new int[lllIlIIIIIIl[1]];
                iArr2[lllIlIIIIIIl[0]] = this.f.f();
                if (lIIIlIllIllIllI(Inventory.getCount(iArr2))) {
                    int[] iArr3 = new int[lllIlIIIIIIl[1]];
                    iArr3[lllIlIIIIIIl[0]] = lllIlIIIIIIl[2];
                    if (!lIIIlIllIllIlIl(Inventory.getCount(iArr3))) {
                        return lllIlIIIIIIl[0];
                    }
                }
                ?? r02 = lllIlIIIIIIl[1];
                "".length();
                return "   ".length() != "   ".length() ? ((12 ^ 109) ^ (99 ^ 76)) & (((109 ^ 0) ^ (144 ^ 179)) ^ (-" ".length())) : r02;
            case 3:
                for (Integer num : this.g.n().keySet()) {
                    int[] iArr4 = new int[lllIlIIIIIIl[1]];
                    iArr4[lllIlIIIIIIl[0]] = num.intValue();
                    if (lIIIlIllIllIlIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        return lllIlIIIIIIl[1];
                    }
                    "".length();
                    if ("  ".length() <= 0) {
                        return ((139 ^ 186) ^ (138 ^ 171)) & (((85 ^ 32) ^ (54 ^ 83)) ^ (-" ".length()));
                    }
                }
                return lllIlIIIIIIl[0];
            case 4:
            case 5:
                return a(cVar);
            default:
                return lllIlIIIIIIl[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    @Override // r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.d
    public boolean h() {
        if (lIIIlIllIllIlIl(u() ? 1 : 0)) {
            return lllIlIIIIIIl[0];
        }
        if (lIIIlIllIllIlIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            "".length();
            return lllIlIIIIIIl[1];
        }
        if (lIIIlIllIllIlIl(o() ? 1 : 0)) {
            if (lIIIlIllIllIlII(j().method(), c.ALL_STAGES)) {
                s();
                return lllIlIIIIIIl[1];
            } else if (lIIIlIllIllIlII(j().method(), c.ALL_STAGES_ALL_HERBS)) {
                t();
                return lllIlIIIIIIl[1];
            }
        }
        return lllIlIIIIIIl[0];
    }

    private static boolean lIIIlIllIllIlll(Object obj) {
        return obj == null;
    }

    private static String lIIIlIllIllIIIl(String lllllllllllllllIIllIIlIIllllIlII, String lllllllllllllllIIllIIlIIllllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIIIIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIIllllIlIl) {
            lllllllllllllllIIllIIlIIllllIlIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public f(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig, EventBus eventBus) {
        super(squireHerblore, herbloreConfig, c.values());
        this.o = eventBus;
        if (lIIIlIllIllIlII(herbloreConfig.method(), c.ALL_STAGES_ALL_HERBS)) {
            this.f = b.GUAM_LEAF;
            this.g = e.ATTACK_POTION;
            this.e = c.CLEAN_HERBS;
            "".length();
            if ("  ".length() < 0) {
                throw null;
            }
        } else if (!lIIIlIllIllIlII(herbloreConfig.method(), c.ALL_STAGES)) {
            this.f = herbloreConfig.herb();
            this.g = herbloreConfig.potion();
            this.e = herbloreConfig.method();
        } else {
            this.f = herbloreConfig.herb();
            this.g = e.a(this.f);
            this.e = c.CLEAN_HERBS;
            "".length();
            if ((-" ".length()) > "  ".length()) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    private boolean q() {
        int[] iArr = new int[lllIlIIIIIIl[1]];
        iArr[lllIlIIIIIIl[0]] = this.f.f();
        if (lIIIlIllIllIllI(Bank.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIlIIIIIIl[1]];
            iArr2[lllIlIIIIIIl[0]] = lllIlIIIIIIl[2];
            if (!lIIIlIllIllIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                if (lIIIlIllIllIlIl(Inventory.isEmpty() ? 1 : 0)) {
                    Bank.depositInventory();
                }
                Bank.withdraw(this.f.f(), lllIlIIIIIIl[5], Bank.WithdrawMode.ITEM);
                Bank.withdraw(lllIlIIIIIIl[2], lllIlIIIIIIl[5], Bank.WithdrawMode.ITEM);
                return lllIlIIIIIIl[1];
            }
        }
        String str = lllIlIIIIIII[lllIlIIIIIIl[3]];
        Object[] objArr = new Object[lllIlIIIIIIl[1]];
        objArr[lllIlIIIIIIl[0]] = this.f;
        Log.info(str, objArr);
        if (lIIIlIllIllIlII(this.e, c.MAKE_UNF_POTS)) {
            Log.info(lllIlIIIIIII[lllIlIIIIIIl[4]]);
            k().forceStop();
        }
        return lllIlIIIIIIl[0];
    }

    private static void lIIIlIllIllIIlI() {
        lllIlIIIIIII = new String[lllIlIIIIIIl[8]];
        lllIlIIIIIII[lllIlIIIIIIl[0]] = lIIIlIllIllIIII("Cwx5BTg3BnkLOCgTNgYyKxcqSCMqQzQJPCBDIhV3LA15CjYrCA==", "EcYhW");
        lllIlIIIIIII[lllIlIIIIIIl[1]] = lIIIlIllIllIIII("FQwHGgUvFg9KBSoNDwMbalgACwMjWAlKGy8bDUoRJwFIUFw=", "Fxhju");
        lllIlIIIIIII[lllIlIIIIIIl[3]] = lIIIlIllIllIIII("KAtaPj4UAVo7NBQGCXM+FEQMOjAKF1onPkYJGzg0RhEUNXEdGVojPhIX", "fdzSQ");
        lllIlIIIIIII[lllIlIIIIIIl[4]] = lIIIlIllIllIIIl("GeYvNZia9AsXA1eufrKS6mSzTS8zACBsFixHyYtPajEGUDKQUiO4hA==", "Ujxnf");
        lllIlIIIIIII[lllIlIIIIIIl[6]] = lIIIlIllIllIIII("GSRkCiclLmQcNXc/K0crOy4lCQ==", "WKDgH");
        lllIlIIIIIII[lllIlIIIIIIl[7]] = lIIIlIllIllIIIl("bdIVPCzjUqbZ0q/ThFE+romxQthaTxrTiXXC8zbQCUaAQp6sHg754w==", "QzCMe");
    }

    private static boolean lIIIlIllIlllIII(int i, int i2) {
        return i < i2;
    }
}
