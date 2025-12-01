package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Decanting potions", priority = 1000, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cc  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/cc.class */
public class cc extends Z {
    private static /* synthetic */ int[] llIlIlIlllI;
    private static /* synthetic */ String[] llIlIlIlIIl;

    private int n(String str) {
        return Integer.parseInt(str.split(llIlIlIlIIl[llIlIlIlllI[2]])[llIlIlIlllI[0]].split(llIlIlIlIIl[llIlIlIlllI[3]])[llIlIlIlllI[1]]);
    }

    static {
        lIlIIlllIlIIll();
        lIlIIllIllllIl();
    }

    private static String lIlIIllIllllII(String llllllllllllllllIIllIIlIIllIIllI, String llllllllllllllllIIllIIlIIllIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIlIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlIIllIIlIl.getBytes(StandardCharsets.UTF_8)), llIlIlIlllI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlIlllI[2], llllllllllllllllIIllIIlIIllIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIlIIllIIlll) {
            llllllllllllllllIIllIIlIIllIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIlllIll(String llllllllllllllllIIllIIlIIlllIIIl, String llllllllllllllllIIllIIlIIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIIlIIlllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIIlIIlllIlIl.init(llIlIlIlllI[2], secretKeySpec);
            return new String(llllllllllllllllIIllIIlIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIlIIlllIlII) {
            llllllllllllllllIIllIIlIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIlllIlI(String llllllllllllllllIIllIIlIIlIlIllI, String llllllllllllllllIIllIIlIIlIlIlIl) {
        String llllllllllllllllIIllIIlIIlIlIllI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIlIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIllIIlIIlIlIIll = llllllllllllllllIIllIIlIIlIlIlIl.toCharArray();
        int llllllllllllllllIIllIIlIIlIlIIlI = llIlIlIlllI[1];
        char[] charArray = llllllllllllllllIIllIIlIIlIlIllI2.toCharArray();
        int length = charArray.length;
        int llllllllllllllllIIllIIlIIlIIlIlI = llIlIlIlllI[1];
        while (lIlIIlllIllIlI(llllllllllllllllIIllIIlIIlIIlIlI, length)) {
            sb.append((char) (charArray[llllllllllllllllIIllIIlIIlIIlIlI] ^ llllllllllllllllIIllIIlIIlIlIIll[llllllllllllllllIIllIIlIIlIlIIlI % llllllllllllllllIIllIIlIIlIlIIll.length]));
            "".length();
            llllllllllllllllIIllIIlIIlIlIIlI++;
            llllllllllllllllIIllIIlIIlIIlIlI++;
            "".length();
            if ((((104 ^ 33) ^ (82 ^ 31)) & (((0 ^ 14) ^ (51 ^ 57)) ^ (-" ".length()))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[llIlIlIlllI[0]];
        strArr[llIlIlIlllI[1]] = llIlIlIlIIl[llIlIlIlllI[1]];
        Item first = Inventory.getFirst(strArr);
        if (lIlIIlllIlIlII(first)) {
            first.interact(llIlIlIlIIl[llIlIlIlllI[0]]);
            return llIlIlIlllI[0];
        }
        for (String str : (Set) Inventory.getAll(item -> {
            return item.getName().contains(llIlIlIlIIl[llIlIlIlllI[7]]);
        }).stream().filter(item2 -> {
            String[] strArr2 = new String[llIlIlIlllI[0]];
            strArr2[llIlIlIlllI[1]] = llIlIlIlIIl[llIlIlIlllI[6]];
            return item2.hasAction(strArr2);
        }).map(item3 -> {
            return item3.getName().split(llIlIlIlIIl[llIlIlIlllI[5]])[llIlIlIlllI[1]].trim();
        }).collect(Collectors.toSet())) {
            if (lIlIIlllIlIlIl(m(str) ? 1 : 0)) {
                return llIlIlIlllI[0];
            }
            "".length();
            if ((-"   ".length()) >= 0) {
                return ((((109 + 84) - 67) + 2) ^ (((108 + 122) - 133) + 64)) & (((27 ^ 39) ^ (110 ^ 115)) ^ (-" ".length()));
            }
        }
        return llIlIlIlllI[1];
    }

    private static boolean lIlIIlllIlIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIIlllIllIIl(int i) {
        return i == 0;
    }

    private static boolean lIlIIlllIlIlIl(int i) {
        return i != 0;
    }

    private static void lIlIIlllIlIIll() {
        llIlIlIlllI = new int[9];
        llIlIlIlllI[0] = " ".length();
        llIlIlIlllI[1] = (100 ^ 49) & ((90 ^ 15) ^ (-1));
        llIlIlIlllI[2] = "  ".length();
        llIlIlIlllI[3] = "   ".length();
        llIlIlIlllI[4] = (239 ^ 160) ^ (3 ^ 72);
        llIlIlIlllI[5] = 178 ^ 183;
        llIlIlIlllI[6] = 192 ^ 198;
        llIlIlIlllI[7] = (76 ^ 44) ^ (167 ^ 192);
        llIlIlIlllI[8] = 8 ^ 0;
    }

    private static boolean lIlIIlllIlIlll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIlllIllIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIlIIllIllllIl() {
        llIlIlIlIIl = new String[llIlIlIlllI[8]];
        llIlIlIlIIl[llIlIlIlllI[1]] = lIlIIllIlllIlI("GCwzAw==", "NERoX");
        llIlIlIlIIl[llIlIlIlllI[0]] = lIlIIllIlllIll("jbOlV0PB7ho=", "HiOCa");
        llIlIlIlIIl[llIlIlIlllI[2]] = lIlIIllIlllIlI("N30=", "kUilV");
        llIlIlIlIIl[llIlIlIlllI[3]] = lIlIIllIlllIlI("EEs=", "LbrmM");
        llIlIlIlIIl[llIlIlIlllI[4]] = lIlIIllIllllII("By8r9+Qo/Gs=", "ItUoe");
        llIlIlIlIIl[llIlIlIlllI[5]] = lIlIIllIlllIll("nYVmeh3HdEY=", "qwVqA");
        llIlIlIlIIl[llIlIlIlllI[6]] = lIlIIllIllllII("6Bpc/YTzEdM=", "jksQO");
        llIlIlIlIIl[llIlIlIlllI[7]] = lIlIIllIlllIlI("Sg==", "bNQpD");
    }

    @Inject
    protected cc(Client client) {
        super(client);
    }

    private static boolean lIlIIlllIllIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    private boolean m(String str) {
        List all = Inventory.getAll(item -> {
            if (lIlIIlllIlIlll(EnumC0056e.c(item.getId())) && lIlIIlllIlIlIl(item.getName().contains(str) ? 1 : 0) && lIlIIlllIllIIl(item.getName().contains(llIlIlIlIIl[llIlIlIlllI[4]]) ? 1 : 0)) {
                ?? r0 = llIlIlIlllI[0];
                "".length();
                return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIlIlllI[1];
        });
        if (lIlIIlllIlIllI(all.size(), llIlIlIlllI[0])) {
            return llIlIlIlllI[1];
        }
        Item item2 = (Item) all.stream().min(Comparator.comparingInt(item3 -> {
            return n(item3.getName());
        })).orElse(null);
        Item item4 = (Item) all.stream().filter(item5 -> {
            if (lIlIIlllIllIII(item5, item2)) {
                ?? r0 = llIlIlIlllI[0];
                "".length();
                return " ".length() == 0 ? ((((109 + 17) - 1) + 11) ^ (((18 + 151) - 68) + 71)) & (((66 ^ 43) ^ (34 ^ 111)) ^ (-" ".length())) : r0;
            }
            return llIlIlIlllI[1];
        }).max(Comparator.comparingInt(item6 -> {
            return n(item6.getName());
        })).orElse(null);
        if (lIlIIlllIlIlll(item4)) {
            return llIlIlIlllI[1];
        }
        item2.useOn(item4);
        return llIlIlIlllI[0];
    }

    private static boolean lIlIIlllIlIlII(Object obj) {
        return obj != null;
    }
}
