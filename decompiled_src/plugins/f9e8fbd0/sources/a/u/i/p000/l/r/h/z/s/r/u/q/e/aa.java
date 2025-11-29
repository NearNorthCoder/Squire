package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Panic tping", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.aa  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/aa.class */
public class aa extends ad {
    private static /* synthetic */ int[] lIllIllIlIlll;
    private static /* synthetic */ String[] lIllIllIlIIll;

    private static boolean llIIlIIlIIllIII(int i, int i2) {
        return i > i2;
    }

    private static void llIIlIIlIIlIIlI() {
        lIllIllIlIIll = new String[lIllIllIlIlll[3]];
        lIllIllIlIIll[lIllIllIlIlll[0]] = llIIlIIlIIIlIll("PCsUODY=", "yZaQF");
        lIllIllIlIIll[lIllIllIlIlll[2]] = llIIlIIlIIIllII("iXcL2/SdhTg=", "PdsWU");
        lIllIllIlIIll[lIllIllIlIlll[1]] = llIIlIIlIIIllII("hbL0iMPzUuM=", "RUYZB");
    }

    private static boolean llIIlIIlIIlIlll(int i) {
        return i > 0;
    }

    @Inject
    protected aa(C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(c0021v, client, squireZulrahConfig);
    }

    private static String llIIlIIlIIIllII(String llllllllllllllIllIIIlIlIIIllIlIl, String llllllllllllllIllIIIlIlIIIllIlII) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIlIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIlIIIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIlIIIllIlll.init(lIllIllIlIlll[1], llllllllllllllIllIIIlIlIIIlllIII);
            return new String(llllllllllllllIllIIIlIlIIIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIlIIIllIllI) {
            llllllllllllllIllIIIlIlIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIIllIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ad
    public boolean ac() {
        if (!llIIlIIlIIlIllI(this.aB.isInInstancedRegion() ? 1 : 0) && !llIIlIIlIIlIlll(Inventory.getCount(item -> {
            String str = lIllIllIlIIll[lIllIllIlIlll[1]];
            return item.hasAction((v1) -> {
                return r1.equals(v1);
            });
        })) && !llIIlIIlIIllIII(Combat.getCurrentHealth(), this.aA.eatAtHP())) {
            EnumC0007h[] values = EnumC0007h.values();
            int length = values.length;
            int i = lIllIllIlIlll[0];
            do {
                if (llIIlIIlIIllIIl(i, length)) {
                    EnumC0007h enumC0007h = values[i];
                    if (llIIlIIlIIlIllI(Inventory.contains(enumC0007h.u()) ? 1 : 0) && llIIlIIlIIlIllI(Equipment.contains(enumC0007h.u()) ? 1 : 0)) {
                        "".length();
                        if (0 != 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else if (llIIlIIlIIllIlI(enumC0007h.t() ? 1 : 0)) {
                        if (llIIlIIlIIllIlI(Inventory.contains(enumC0007h.u()) ? 1 : 0)) {
                            Item first = Inventory.getFirst(enumC0007h.u());
                            String[] strArr = new String[lIllIllIlIlll[1]];
                            strArr[lIllIllIlIlll[0]] = lIllIllIlIIll[lIllIllIlIlll[0]];
                            strArr[lIllIllIlIlll[2]] = lIllIllIlIIll[lIllIllIlIlll[2]];
                            first.interact(strArr);
                        }
                        if (llIIlIIlIIllIlI(Equipment.contains(enumC0007h.u()) ? 1 : 0)) {
                            Equipment.getFirst(enumC0007h.u()).interact(enumC0007h.s());
                            "".length();
                            if (" ".length() < 0) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        }
                    } else if (llIIlIIlIIllIlI(Inventory.contains(enumC0007h.u()) ? 1 : 0)) {
                        Inventory.getFirst(enumC0007h.u()).interact(enumC0007h.s());
                        "".length();
                        if (0 != 0) {
                            return ((((25 + 139) - 133) + 160) ^ (((74 + 146) - 174) + 124)) & (((238 ^ 128) ^ (42 ^ 81)) ^ (-" ".length()));
                        }
                    }
                    i++;
                    "".length();
                }
                this.E.a((boolean) lIllIllIlIlll[2]);
                return lIllIllIlIlll[2];
            } while ((11 ^ 15) >= ((25 ^ 58) & ((24 ^ 59) ^ (-1))));
            return (true ^ true) & ((true ^ true) ^ true);
        }
        return lIllIllIlIlll[0];
    }

    private static boolean llIIlIIlIIlIllI(int i) {
        return i == 0;
    }

    private static boolean llIIlIIlIIllIIl(int i, int i2) {
        return i < i2;
    }

    static {
        llIIlIIlIIlIlIl();
        llIIlIIlIIlIIlI();
    }

    private static void llIIlIIlIIlIlIl() {
        lIllIllIlIlll = new int[4];
        lIllIllIlIlll[0] = "   ".length() & ("   ".length() ^ (-1));
        lIllIllIlIlll[1] = "  ".length();
        lIllIllIlIlll[2] = " ".length();
        lIllIllIlIlll[3] = "   ".length();
    }

    private static String llIIlIIlIIIlIll(String llllllllllllllIllIIIlIlIIIlIIIII, String llllllllllllllIllIIIlIlIIIlIIlII) {
        String llllllllllllllIllIIIlIlIIIlIIIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIIlIlIIIlIIIlI = llllllllllllllIllIIIlIlIIIlIIlII.toCharArray();
        int llllllllllllllIllIIIlIlIIIlIIIIl = lIllIllIlIlll[0];
        char[] charArray = llllllllllllllIllIIIlIlIIIlIIIII2.toCharArray();
        int length = charArray.length;
        int i = lIllIllIlIlll[0];
        while (llIIlIIlIIllIIl(i, length)) {
            char llllllllllllllIllIIIlIlIIIlIIllI = charArray[i];
            sb.append((char) (llllllllllllllIllIIIlIlIIIlIIllI ^ llllllllllllllIllIIIlIlIIIlIIIlI[llllllllllllllIllIIIlIlIIIlIIIIl % llllllllllllllIllIIIlIlIIIlIIIlI.length]));
            "".length();
            llllllllllllllIllIIIlIlIIIlIIIIl++;
            i++;
            "".length();
            if ("  ".length() > ((2 ^ 52) ^ (112 ^ 66))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
