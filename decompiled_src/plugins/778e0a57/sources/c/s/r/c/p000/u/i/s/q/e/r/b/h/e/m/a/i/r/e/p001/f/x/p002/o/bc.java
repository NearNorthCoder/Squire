package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Prep Get Vials", priority = 21001, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bc  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/bc.class */
public class bc extends bg {
    private static /* synthetic */ String[] lIlIIIIlllll;
    private static /* synthetic */ int[] lIlIIIlIIIII;

    private static String llIlIlIlIlIIII(String lllllllllllllllIlllIIIlIIIllIIlI, String lllllllllllllllIlllIIIlIIIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIlIIIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIlIIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIIII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIlIIIII[4], lllllllllllllllIlllIIIlIIIllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIlIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIlIIIllIIll) {
            lllllllllllllllIlllIIIlIIIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIlIlIlll(int i) {
        return i <= 0;
    }

    private static boolean llIlIlIlIllIIl(int i) {
        return i > 0;
    }

    private static boolean llIlIlIlIllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlIlIlIllIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIlIlIlIllIll(int i) {
        return i == 0;
    }

    static {
        llIlIlIlIlIlII();
        llIlIlIlIlIIll();
    }

    private static String llIlIlIlIlIIIl(String lllllllllllllllIlllIIIlIIlIlIlII, String lllllllllllllllIlllIIIlIIlIlIIll) {
        String lllllllllllllllIlllIIIlIIlIlIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIlIIlIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIlIIlIlIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIIlIIlIlIIll.toCharArray();
        int lllllllllllllllIlllIIIlIIlIlIIII = lIlIIIlIIIII[2];
        char[] charArray2 = lllllllllllllllIlllIIIlIIlIlIlII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIlIIIII[2];
        while (llIlIlIlIlIllI(i, length)) {
            lllllllllllllllIlllIIIlIIlIlIIlI.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlllIIIlIIlIlIIII % charArray.length]));
            "".length();
            lllllllllllllllIlllIIIlIIlIlIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIIIlIIlIlIIlI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.bg
    public boolean dY() {
        if (llIlIlIlIlIlIl(ef(), ed())) {
            int lllllllllllllllIlllIIIlIIllIIlIl = lIlIIIlIIIII[0];
            int[] iArr = new int[lIlIIIlIIIII[1]];
            iArr[lIlIIIlIIIII[2]] = lIlIIIlIIIII[3];
            List all = Inventory.getAll(iArr);
            int i = lIlIIIlIIIII[2];
            do {
                if (llIlIlIlIlIllI(i, all.size())) {
                    if (llIlIlIlIlIlll(lllllllllllllllIlllIIIlIIllIIlIl)) {
                        "".length();
                        if ("  ".length() == (((((202 + 111) - 135) + 33) ^ (((97 + 27) - 65) + 69)) & (((95 ^ 18) ^ (185 ^ 167)) ^ (-" ".length())))) {
                            return ((18 ^ 100) ^ (105 ^ 90)) & (((((126 + 172) - 240) + 135) ^ (((24 + 81) - (-18)) + 9)) ^ (-" ".length()));
                        }
                    } else {
                        if (llIlIlIlIllIII(i, ed())) {
                            ((Item) all.get(i)).drop();
                            lllllllllllllllIlllIIIlIIllIIlIl--;
                        }
                        i++;
                        "".length();
                    }
                }
                return lIlIIIlIIIII[1];
            } while (!((true ^ true) & ((true ^ true) ^ true)));
            return (true ^ true) & ((true ^ true) ^ true);
        } else if (llIlIlIlIllIII(eh(), ed())) {
            return lIlIIIlIIIII[2];
        } else {
            if (!llIlIlIlIllIIl(ef())) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (llIlIlIlIlllII(tileObject.getName().contains(lIlIIIIlllll[lIlIIIlIIIII[0]]) ? 1 : 0)) {
                        String[] strArr = new String[lIlIIIlIIIII[1]];
                        strArr[lIlIIIlIIIII[2]] = lIlIIIIlllll[lIlIIIlIIIII[7]];
                        if (llIlIlIlIlllII(tileObject.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = lIlIIIlIIIII[1];
                            "".length();
                            return (-(178 ^ 182)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIlIIIlIIIII[2];
                });
                if (llIlIlIlIllIlI(nearest)) {
                    return lIlIIIlIIIII[2];
                }
                if (!llIlIlIlIllIll(this.bS.isAnimating() ? 1 : 0) || llIlIlIlIlllII(this.bS.isMoving() ? 1 : 0)) {
                    System.out.println(lIlIIIIlllll[lIlIIIlIIIII[5]]);
                    return lIlIIIlIIIII[1];
                }
                nearest.interact(lIlIIIIlllll[lIlIIIlIIIII[6]]);
                return lIlIIIlIIIII[1];
            }
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                if (llIlIlIlIlllII(tileObject2.getName().contains(lIlIIIIlllll[lIlIIIlIIIII[8]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIIIlIIIII[1]];
                    strArr[lIlIIIlIIIII[2]] = lIlIIIIlllll[lIlIIIlIIIII[9]];
                    if (llIlIlIlIlllII(tileObject2.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIlIIIlIIIII[1];
                        "".length();
                        return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIlIIIlIIIII[2];
            });
            if (llIlIlIlIllIlI(nearest2)) {
                System.out.println(lIlIIIIlllll[lIlIIIlIIIII[2]]);
                return lIlIIIlIIIII[2];
            } else if (!llIlIlIlIllIll(this.bS.isAnimating() ? 1 : 0) || llIlIlIlIlllII(this.bS.isMoving() ? 1 : 0)) {
                System.out.println(lIlIIIIlllll[lIlIIIlIIIII[1]]);
                return lIlIIIlIIIII[1];
            } else {
                nearest2.interact(lIlIIIIlllll[lIlIIIlIIIII[4]]);
                sleep(lIlIIIlIIIII[4]);
                return lIlIIIlIIIII[1];
            }
        }
    }

    private static boolean llIlIlIlIlIllI(int i, int i2) {
        return i < i2;
    }

    private static String llIlIlIlIlIIlI(String lllllllllllllllIlllIIIlIIIllllll, String lllllllllllllllIlllIIIlIIIlllllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIlIIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIlIIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIIlIIlIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIIlIIlIIIIIl.init(lIlIIIlIIIII[4], lllllllllllllllIlllIIIlIIlIIIIlI);
            return new String(lllllllllllllllIlllIIIlIIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIlIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIlIIlIIIIII) {
            lllllllllllllllIlllIIIlIIlIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIlIlIlIl(int i, int i2) {
        return i > i2;
    }

    @Inject
    protected bc(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIlIlIlIlllII(int i) {
        return i != 0;
    }

    private static void llIlIlIlIlIIll() {
        lIlIIIIlllll = new String[lIlIIIlIIIII[10]];
        lIlIIIIlllll[lIlIIIlIIIII[2]] = llIlIlIlIlIIII("rRHq04fbAug711+SXhg6pg==", "hjVEw");
        lIlIIIIlllll[lIlIIIlIIIII[1]] = llIlIlIlIlIIII("fGkkx4OF/o0Elsrgv484ow==", "vvvrA");
        lIlIIIIlllll[lIlIIIlIIIII[4]] = llIlIlIlIlIIIl("PhQP", "kgjIT");
        lIlIIIIlllll[lIlIIIlIIIII[5]] = llIlIlIlIlIIIl("CDoXATkCdRUHdxEnBA0=", "eUahW");
        lIlIIIIlllll[lIlIIIlIIIII[6]] = llIlIlIlIlIIIl("HAQNEmkgAhoK", "LmnyD");
        lIlIIIIlllll[lIlIIIlIIIII[0]] = llIlIlIlIlIIlI("FbN7RSUJC0q00sa5fwgXsQ==", "JUDho");
        lIlIIIIlllll[lIlIIIlIIIII[7]] = llIlIlIlIlIIII("5dSeWselTia3wZEaEIGZrg==", "bcGwP");
        lIlIIIIlllll[lIlIIIlIIIII[8]] = llIlIlIlIlIIIl("Hhc1IzQr", "YrLPQ");
        lIlIIIIlllll[lIlIIIlIIIII[9]] = llIlIlIlIlIIII("LOyaQ0LkRNc=", "HCYHI");
    }

    private static void llIlIlIlIlIlII() {
        lIlIIIlIIIII = new int[11];
        lIlIIIlIIIII[0] = (243 ^ 197) ^ (69 ^ 118);
        lIlIIIlIIIII[1] = " ".length();
        lIlIIIlIIIII[2] = ((130 ^ 140) ^ (95 ^ 122)) & (((((149 + 95) - 174) + 119) ^ (((113 + 85) - 114) + 66)) ^ (-" ".length()));
        lIlIIIlIIIII[3] = (-8214) & 29013;
        lIlIIIlIIIII[4] = "  ".length();
        lIlIIIlIIIII[5] = "   ".length();
        lIlIIIlIIIII[6] = (193 ^ 171) ^ (118 ^ 24);
        lIlIIIlIIIII[7] = 92 ^ 90;
        lIlIIIlIIIII[8] = 86 ^ 81;
        lIlIIIlIIIII[9] = (((21 + 162) - 126) + 123) ^ (((70 + 9) - (-4)) + 105);
        lIlIIIlIIIII[10] = 201 ^ 192;
    }
}
