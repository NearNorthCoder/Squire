/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg;
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

@TaskDesc(name="Prep Get Vials", priority=21001, blocking=true)
public class bc
extends bg {
    private static /* synthetic */ String[] lIlIIIIlllll;
    private static /* synthetic */ int[] lIlIIIlIIIII;

    private static String llIlIlIlIlIIII(String lllllllllllllllIlllIIIlIIIllIIlI, String lllllllllllllllIlllIIIlIIIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIlIIIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIlIIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIIII[9]), "DES");
            Cipher lllllllllllllllIlllIIIlIIIllIlII = Cipher.getInstance("DES");
            lllllllllllllllIlllIIIlIIIllIlII.init(lIlIIIlIIIII[4], lllllllllllllllIlllIIIlIIIllIlIl);
            return new String(lllllllllllllllIlllIIIlIIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIlIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIIlIIIllIIll) {
            lllllllllllllllIlllIIIlIIIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIlIlIlll(int n2) {
        return n2 <= 0;
    }

    private static boolean llIlIlIlIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIlIlIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIlIllIlI(Object object) {
        return object == null;
    }

    private static boolean llIlIlIlIllIll(int n2) {
        return n2 == 0;
    }

    static {
        bc.llIlIlIlIlIlII();
        bc.llIlIlIlIlIIll();
    }

    private static String llIlIlIlIlIIIl(String lllllllllllllllIlllIIIlIIlIIllll, String lllllllllllllllIlllIIIlIIlIIlllI) {
        lllllllllllllllIlllIIIlIIlIIllll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIlIIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIlIIlIlIIlI = new StringBuilder();
        char[] lllllllllllllllIlllIIIlIIlIlIIIl = lllllllllllllllIlllIIIlIIlIIlllI.toCharArray();
        int lllllllllllllllIlllIIIlIIlIlIIII = lIlIIIlIIIII[2];
        char[] lllllllllllllllIlllIIIlIIlIIlIlI = lllllllllllllllIlllIIIlIIlIIllll.toCharArray();
        int lllllllllllllllIlllIIIlIIlIIlIIl = lllllllllllllllIlllIIIlIIlIIlIlI.length;
        int lllllllllllllllIlllIIIlIIlIIlIII = lIlIIIlIIIII[2];
        while (bc.llIlIlIlIlIllI(lllllllllllllllIlllIIIlIIlIIlIII, lllllllllllllllIlllIIIlIIlIIlIIl)) {
            char lllllllllllllllIlllIIIlIIlIlIlIl = lllllllllllllllIlllIIIlIIlIIlIlI[lllllllllllllllIlllIIIlIIlIIlIII];
            lllllllllllllllIlllIIIlIIlIlIIlI.append((char)(lllllllllllllllIlllIIIlIIlIlIlIl ^ lllllllllllllllIlllIIIlIIlIlIIIl[lllllllllllllllIlllIIIlIIlIlIIII % lllllllllllllllIlllIIIlIIlIlIIIl.length]));
            "".length();
            ++lllllllllllllllIlllIIIlIIlIlIIII;
            ++lllllllllllllllIlllIIIlIIlIIlIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIIlIIlIlIIlI);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_4;
        bc lllllllllllllllIlllIIIlIIllIIlll;
        int n2 = this.ef();
        if (bc.llIlIlIlIlIlIl(n2, this.ed())) {
            void lllllllllllllllIlllIIIlIIllIIlII;
            int n3 = lIlIIIlIIIII[0];
            int[] nArray = new int[lIlIIIlIIIII[1]];
            nArray[bc.lIlIIIlIIIII[2]] = lIlIIIlIIIII[3];
            List list = Inventory.getAll((int[])nArray);
            int lllllllllllllllIlllIIIlIIllIIIll = lIlIIIlIIIII[2];
            while (bc.llIlIlIlIlIllI(lllllllllllllllIlllIIIlIIllIIIll, lllllllllllllllIlllIIIlIIllIIlII.size())) {
                void lllllllllllllllIlllIIIlIIllIIlIl;
                if (bc.llIlIlIlIlIlll((int)lllllllllllllllIlllIIIlIIllIIlIl)) {
                    "".length();
                    if ("  ".length() != ((202 + 111 - 135 + 33 ^ 97 + 27 - 65 + 69) & (0x5F ^ 0x12 ^ (0xB9 ^ 0xA7) ^ -" ".length()))) break;
                    return ((0x12 ^ 0x64 ^ (0x69 ^ 0x5A)) & (126 + 172 - 240 + 135 ^ 24 + 81 - -18 + 9 ^ -" ".length())) != 0;
                }
                if (bc.llIlIlIlIllIII(lllllllllllllllIlllIIIlIIllIIIll, lllllllllllllllIlllIIIlIIllIIlll.ed())) {
                    ((Item)lllllllllllllllIlllIIIlIIllIIlII.get(lllllllllllllllIlllIIIlIIllIIIll)).drop();
                    --lllllllllllllllIlllIIIlIIllIIlIl;
                }
                ++lllllllllllllllIlllIIIlIIllIIIll;
                "".length();
                if (((0xDC ^ 0x93) & ~(0xCF ^ 0x80)) == 0) continue;
                return ((0x6B ^ 0x53) & ~(0xA1 ^ 0x99)) != 0;
            }
            return lIlIIIlIIIII[1];
        }
        if (bc.llIlIlIlIllIII(lllllllllllllllIlllIIIlIIllIIlll.eh(), lllllllllllllllIlllIIIlIIllIIlll.ed())) {
            return lIlIIIlIIIII[2];
        }
        if (bc.llIlIlIlIllIIl(lllllllllllllllIlllIIIlIIllIIlll.ef())) {
            TileObject lllllllllllllllIlllIIIlIIllIIlIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bc.llIlIlIlIlllII(tileObject.getName().contains(lIlIIIIlllll[lIlIIIlIIIII[8]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIlIIIII[1]];
                    stringArray[bc.lIlIIIlIIIII[2]] = lIlIIIIlllll[lIlIIIlIIIII[9]];
                    if (bc.llIlIlIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIlIIIII[1];
                        "".length();
                        if ("  ".length() > " ".length()) return n2 != 0;
                        return ((0xE ^ 0x1A) & ~(0x75 ^ 0x61)) != 0;
                    }
                }
                n2 = lIlIIIlIIIII[2];
                return n2 != 0;
            });
            if (bc.llIlIlIlIllIlI(lllllllllllllllIlllIIIlIIllIIlIl)) {
                System.out.println(lIlIIIIlllll[lIlIIIlIIIII[2]]);
                return lIlIIIlIIIII[2];
            }
            if (!bc.llIlIlIlIllIll(lllllllllllllllIlllIIIlIIllIIlll.bS.isAnimating() ? 1 : 0) || bc.llIlIlIlIlllII(lllllllllllllllIlllIIIlIIllIIlll.bS.isMoving() ? 1 : 0)) {
                System.out.println(lIlIIIIlllll[lIlIIIlIIIII[1]]);
                return lIlIIIlIIIII[1];
            }
            lllllllllllllllIlllIIIlIIllIIlIl.interact(lIlIIIIlllll[lIlIIIlIIIII[4]]);
            lllllllllllllllIlllIIIlIIllIIlll.sleep(lIlIIIlIIIII[4]);
            return lIlIIIlIIIII[1];
        }
        TileObject lllllllllllllllIlllIIIlIIllIIlIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bc.llIlIlIlIlllII(tileObject.getName().contains(lIlIIIIlllll[lIlIIIlIIIII[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIII[1]];
                stringArray[bc.lIlIIIlIIIII[2]] = lIlIIIIlllll[lIlIIIlIIIII[7]];
                if (bc.llIlIlIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIII[1];
                    "".length();
                    if (-(0xB2 ^ 0xB6) < 0) return n2 != 0;
                    return ((0x25 ^ 0x7F) & ~(0xD6 ^ 0x8C)) != 0;
                }
            }
            n2 = lIlIIIlIIIII[2];
            return n2 != 0;
        });
        if (bc.llIlIlIlIllIlI(lllllllllllllllIlllIIIlIIllIIlIl)) {
            return lIlIIIlIIIII[2];
        }
        if (!bc.llIlIlIlIllIll(lllllllllllllllIlllIIIlIIllIIlll.bS.isAnimating() ? 1 : 0) || bc.llIlIlIlIlllII(lllllllllllllllIlllIIIlIIllIIlll.bS.isMoving() ? 1 : 0)) {
            System.out.println(lIlIIIIlllll[lIlIIIlIIIII[5]]);
            return lIlIIIlIIIII[1];
        }
        var2_4.interact(lIlIIIIlllll[lIlIIIlIIIII[6]]);
        return lIlIIIlIIIII[1];
    }

    private static boolean llIlIlIlIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIlIlIlIIlI(String lllllllllllllllIlllIIIlIIIllllIl, String lllllllllllllllIlllIIIlIIIlllllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIlIIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIlIIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIIlIIlIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIIlIIlIIIIIl.init(lIlIIIlIIIII[4], lllllllllllllllIlllIIIlIIlIIIIlI);
            return new String(lllllllllllllllIlllIIIlIIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIlIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIIlIIlIIIIII) {
            lllllllllllllllIlllIIIlIIlIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIlIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected bc(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIlIlIlIlllII(int n2) {
        return n2 != 0;
    }

    private static void llIlIlIlIlIIll() {
        lIlIIIIlllll = new String[lIlIIIlIIIII[10]];
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[2]] = bc.llIlIlIlIlIIII("rRHq04fbAug711+SXhg6pg==", "hjVEw");
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[1]] = bc.llIlIlIlIlIIII("fGkkx4OF/o0Elsrgv484ow==", "vvvrA");
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[4]] = bc.llIlIlIlIlIIIl("PhQP", "kgjIT");
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[5]] = bc.llIlIlIlIlIIIl("CDoXATkCdRUHdxEnBA0=", "eUahW");
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[6]] = bc.llIlIlIlIlIIIl("HAQNEmkgAhoK", "LmnyD");
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[0]] = bc.llIlIlIlIlIIlI("FbN7RSUJC0q00sa5fwgXsQ==", "JUDho");
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[7]] = bc.llIlIlIlIlIIII("5dSeWselTia3wZEaEIGZrg==", "bcGwP");
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[8]] = bc.llIlIlIlIlIIIl("Hhc1IzQr", "YrLPQ");
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[9]] = bc.llIlIlIlIlIIII("LOyaQ0LkRNc=", "HCYHI");
    }

    private static void llIlIlIlIlIlII() {
        lIlIIIlIIIII = new int[11];
        bc.lIlIIIlIIIII[0] = 0xF3 ^ 0xC5 ^ (0x45 ^ 0x76);
        bc.lIlIIIlIIIII[1] = " ".length();
        bc.lIlIIIlIIIII[2] = (0x82 ^ 0x8C ^ (0x5F ^ 0x7A)) & (149 + 95 - 174 + 119 ^ 113 + 85 - 114 + 66 ^ -" ".length());
        bc.lIlIIIlIIIII[3] = 0xFFFFDFEA & 0x7155;
        bc.lIlIIIlIIIII[4] = "  ".length();
        bc.lIlIIIlIIIII[5] = "   ".length();
        bc.lIlIIIlIIIII[6] = 0xC1 ^ 0xAB ^ (0x76 ^ 0x18);
        bc.lIlIIIlIIIII[7] = 0x5C ^ 0x5A;
        bc.lIlIIIlIIIII[8] = 0x56 ^ 0x51;
        bc.lIlIIIlIIIII[9] = 21 + 162 - 126 + 123 ^ 70 + 9 - -4 + 105;
        bc.lIlIIIlIIIII[10] = 0xC9 ^ 0xC0;
    }
}

