/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemStack
 *  net.runelite.client.util.QuantityFormatter
 *  net.runelite.http.api.RuneLiteAPI
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.client.Static
 *  okhttp3.MediaType
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.am;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.an;
import java.awt.Color;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.ItemComposition;
import net.runelite.client.game.ItemStack;
import net.runelite.client.util.QuantityFormatter;
import net.runelite.http.api.RuneLiteAPI;
import net.unethicalite.api.game.Prices;
import net.unethicalite.client.Static;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class al {
    private static final /* synthetic */ int cT;
    private static /* synthetic */ String[] lIlIIllllllI;
    private static /* synthetic */ int[] lIlIlIIIlIll;

    /*
     * WARNING - void declaration
     */
    public static void a(ItemStack itemStack, Collection<ItemStack> collection, boolean bl2) {
        Random lllllllllllllllIllIlIlIIlIIIIIlI;
        String lllllllllllllllIllIlIlIIlIIIIIll;
        ItemComposition lllllllllllllllIllIlIlIIlIIIIlII;
        Color color;
        ItemStack lllllllllllllllIllIlIlIIlIIlIIII;
        String string;
        void lllllllllllllllIllIlIlIIlIIIlllI;
        Object object;
        void lllllllllllllllIllIlIlIIlIIIlIll;
        void lllllllllllllllIllIlIlIIlIIIllII;
        int lllllllllllllllIllIlIlIIlIIIlIlI;
        Object lllllllllllllllIllIlIlIIlIIIIllI;
        void lllllllllllllllIllIlIlIIlIIIllIl;
        Object lllllllllllllllIllIlIlIIlIIIIlll;
        Client client = Static.getClient();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = lIlIlIIIlIll[0];
        int n3 = lIlIlIIIlIll[1];
        int n4 = lIlIlIIIlIll[0];
        Object lllllllllllllllIllIlIlIIlIIIlIII = collection.iterator();
        while (al.llIlllIIIIlIIl(lllllllllllllllIllIlIlIIlIIIlIII.hasNext() ? 1 : 0)) {
            int lllllllllllllllIllIlIlIIlIIIlIIl;
            lllllllllllllllIllIlIlIIlIIIIlll = lllllllllllllllIllIlIlIIlIIIlIII.next();
            lllllllllllllllIllIlIlIIlIIIIllI = lllllllllllllllIllIlIlIIlIIIllIl.getItemDefinition(lllllllllllllllIllIlIlIIlIIIIlll.getId());
            int lllllllllllllllIllIlIlIIlIIIIlIl = Prices.getItemPrice((int)lllllllllllllllIllIlIlIIlIIIIllI.getId()) * lllllllllllllllIllIlIlIIlIIIIlll.getQuantity();
            if (al.llIlllIIIIlIlI(lllllllllllllllIllIlIlIIlIIIIlIl, lllllllllllllllIllIlIlIIlIIIlIIl)) {
                lllllllllllllllIllIlIlIIlIIIlIIl = lllllllllllllllIllIlIlIIlIIIIlIl;
                lllllllllllllllIllIlIlIIlIIIlIlI = lllllllllllllllIllIlIlIIlIIIIllI.getId();
            }
            lllllllllllllllIllIlIlIIlIIIlIll += lllllllllllllllIllIlIlIIlIIIIlIl;
            lllllllllllllllIllIlIlIIlIIIllII.append(lllllllllllllllIllIlIlIIlIIIIlll.getQuantity()).append(lIlIIllllllI[lIlIlIIIlIll[0]]).append(lllllllllllllllIllIlIlIIlIIIIllI.getName()).append(lIlIIllllllI[lIlIlIIIlIll[2]]);
            0;
            0;
            if (2 > 1) continue;
            return;
        }
        if (al.llIlllIIIIlIll((int)lllllllllllllllIllIlIlIIlIIIlIll, lIlIlIIIlIll[3])) {
            return;
        }
        if (al.llIlllIIIIllII(lllllllllllllllIllIlIlIIlIIIllIl.getDiscordUsername())) {
            object = lIlIIllllllI[lIlIlIIIlIll[4]];
            0;
            if ((0x11 ^ 0x7C ^ (0x6E ^ 7)) == 0) {
                return;
            }
        } else {
            object = lllllllllllllllIllIlIlIIlIIIlIII = lllllllllllllllIllIlIlIIlIIIllIl.getDiscordUsername();
        }
        if (al.llIlllIIIIlIIl((int)lllllllllllllllIllIlIlIIlIIIlllI)) {
            lllllllllllllllIllIlIlIIlIIIlIII = lIlIIllllllI[lIlIlIIIlIll[5]];
        }
        if (al.llIlllIIIIllII(lllllllllllllllIllIlIlIIlIIIllIl.getDiscordId())) {
            string = lIlIIllllllI[lIlIlIIIlIll[6]];
            0;
            if (-(0x55 ^ 0x50) >= 0) {
                return;
            }
        } else {
            string = lllllllllllllllIllIlIlIIlIIIllIl.getDiscordId();
        }
        lllllllllllllllIllIlIlIIlIIIIlll = string;
        lllllllllllllllIllIlIlIIlIIIIllI = new am();
        ((am)lllllllllllllllIllIlIlIIlIIIIllI).e(lIlIIllllllI[lIlIlIIIlIll[7]]);
        an lllllllllllllllIllIlIlIIlIIIIlIl = new an();
        if (al.llIlllIIIIllII(lllllllllllllllIllIlIlIIlIIlIIII)) {
            color = Color.WHITE;
            0;
            if (1 <= -1) {
                return;
            }
        } else {
            color = new Color(lIlIlIIIlIll[8], lIlIlIIIlIll[0], lIlIlIIIlIll[8]);
        }
        lllllllllllllllIllIlIlIIlIIIIlIl.a(color);
        0;
        Object[] objectArray = new Object[lIlIlIIIlIll[2]];
        objectArray[al.lIlIlIIIlIll[0]] = lllllllllllllllIllIlIlIIlIIIlIII;
        lllllllllllllllIllIlIlIIlIIIIlIl.f(String.format(lIlIIllllllI[lIlIlIIIlIll[9]], objectArray));
        0;
        if (al.llIlllIIIIllIl(lllllllllllllllIllIlIlIIlIIlIIII)) {
            lllllllllllllllIllIlIlIIlIIIIlII = lllllllllllllllIllIlIlIIlIIIllIl.getItemComposition(lllllllllllllllIllIlIlIIlIIlIIII.getId());
            lllllllllllllllIllIlIlIIlIIIIIll = lllllllllllllllIllIlIlIIlIIIIlII.getName();
            lllllllllllllllIllIlIlIIlIIIIIlI = new Random();
            if (al.llIlllIIIIlllI(lllllllllllllllIllIlIlIIlIIIIIlI.nextInt(lIlIlIIIlIll[7]))) {
                if (al.llIlllIIIIlIIl(lllllllllllllllIllIlIlIIlIIIIIll.contains(lIlIIllllllI[lIlIlIIIlIll[10]]) ? 1 : 0)) {
                    lllllllllllllllIllIlIlIIlIIIIIll = lIlIIllllllI[lIlIlIIIlIll[11]];
                }
                if (al.llIlllIIIIlIIl(lllllllllllllllIllIlIlIIlIIIIIll.contains(lIlIIllllllI[lIlIlIIIlIll[12]]) ? 1 : 0)) {
                    lllllllllllllllIllIlIlIIlIIIIIll = lIlIIllllllI[lIlIlIIIlIll[13]];
                }
                if (al.llIlllIIIIlIIl(lllllllllllllllIllIlIlIIlIIIIIll.contains(lIlIIllllllI[lIlIlIIIlIll[14]]) ? 1 : 0)) {
                    lllllllllllllllIllIlIlIIlIIIIIll = lIlIIllllllI[lIlIlIIIlIll[15]];
                }
            }
            if (al.llIlllIIIIlllI(lllllllllllllllIllIlIlIIlIIIIIlI.nextInt(lIlIlIIIlIll[16])) && al.llIlllIIIIlIIl(lllllllllllllllIllIlIlIIlIIIIIll.contains(lIlIIllllllI[lIlIlIIIlIll[17]]) ? 1 : 0)) {
                lllllllllllllllIllIlIlIIlIIIIIll = lIlIIllllllI[lIlIlIIIlIll[18]];
            }
            if (al.llIlllIIIIlIIl(lllllllllllllllIllIlIlIIlIIIIIll.contains(lIlIIllllllI[lIlIlIIIlIll[19]]) ? 1 : 0)) {
                if (al.llIlllIIIIlIIl((int)lllllllllllllllIllIlIlIIlIIIlllI)) {
                    Object[] objectArray2 = new Object[lIlIlIIIlIll[2]];
                    objectArray2[al.lIlIlIIIlIll[0]] = lllllllllllllllIllIlIlIIlIIIIIll;
                    lllllllllllllllIllIlIlIIlIIIIlIl.g(String.format(lIlIIllllllI[lIlIlIIIlIll[20]], objectArray2));
                    0;
                    0;
                    if (1 == ((0x6D ^ 0x7C) & ~(0x53 ^ 0x42))) {
                        return;
                    }
                } else {
                    Object[] objectArray3 = new Object[lIlIlIIIlIll[4]];
                    objectArray3[al.lIlIlIIIlIll[0]] = lllllllllllllllIllIlIlIIlIIIIlll;
                    objectArray3[al.lIlIlIIIlIll[2]] = lllllllllllllllIllIlIlIIlIIIIIll;
                    lllllllllllllllIllIlIlIIlIIIIlIl.g(String.format(lIlIIllllllI[lIlIlIIIlIll[21]], objectArray3));
                    0;
                    0;
                    if (-3 > 0) {
                        return;
                    }
                }
            } else if (al.llIlllIIIIlIIl(lllllllllllllllIllIlIlIIlIIIIIll.contains(lIlIIllllllI[lIlIlIIIlIll[22]]) ? 1 : 0)) {
                if (al.llIlllIIIIlIIl((int)lllllllllllllllIllIlIlIIlIIIlllI)) {
                    Object[] objectArray4 = new Object[lIlIlIIIlIll[2]];
                    objectArray4[al.lIlIlIIIlIll[0]] = lllllllllllllllIllIlIlIIlIIIIIll;
                    lllllllllllllllIllIlIlIIlIIIIlIl.g(String.format(lIlIIllllllI[lIlIlIIIlIll[23]], objectArray4));
                    0;
                    0;
                    if (((6 ^ 0x15) & ~(0xD1 ^ 0xC2)) == (0x4E ^ 0x4A)) {
                        return;
                    }
                } else {
                    Object[] objectArray5 = new Object[lIlIlIIIlIll[4]];
                    objectArray5[al.lIlIlIIIlIll[0]] = lllllllllllllllIllIlIlIIlIIIIlll;
                    objectArray5[al.lIlIlIIIlIll[2]] = lllllllllllllllIllIlIlIIlIIIIIll;
                    lllllllllllllllIllIlIlIIlIIIIlIl.g(String.format(lIlIIllllllI[lIlIlIIIlIll[24]], objectArray5));
                    0;
                    0;
                    if ((0x54 ^ 0x50) < 0) {
                        return;
                    }
                }
            } else if (al.llIlllIIIIlIIl((int)lllllllllllllllIllIlIlIIlIIIlllI)) {
                Object[] objectArray6 = new Object[lIlIlIIIlIll[2]];
                objectArray6[al.lIlIlIIIlIll[0]] = lllllllllllllllIllIlIlIIlIIIIIll;
                lllllllllllllllIllIlIlIIlIIIIlIl.g(String.format(lIlIIllllllI[lIlIlIIIlIll[25]], objectArray6));
                0;
                0;
                if (1 == 0) {
                    return;
                }
            } else {
                Object[] objectArray7 = new Object[lIlIlIIIlIll[4]];
                objectArray7[al.lIlIlIIIlIll[0]] = lllllllllllllllIllIlIlIIlIIIIlll;
                objectArray7[al.lIlIlIIIlIll[2]] = lllllllllllllllIllIlIlIIlIIIIIll;
                lllllllllllllllIllIlIlIIlIIIIlIl.g(String.format(lIlIIllllllI[lIlIlIIIlIll[26]], objectArray7));
                0;
            }
            0;
            if (2 < 0) {
                return;
            }
        } else {
            lllllllllllllllIllIlIlIIlIIIIlIl.g(lIlIIllllllI[lIlIlIIIlIll[27]]);
            0;
        }
        lllllllllllllllIllIlIlIIlIIIIlIl.a(lIlIIllllllI[lIlIlIIIlIll[28]], String.valueOf(lllllllllllllllIllIlIlIIlIIIllII), lIlIlIIIlIll[2]);
        0;
        lllllllllllllllIllIlIlIIlIIIIlIl.a(lIlIIllllllI[lIlIlIIIlIll[29]], QuantityFormatter.formatNumber((long)((long)lllllllllllllllIllIlIlIIlIIIlIll)), lIlIlIIIlIll[2]);
        0;
        Object[] objectArray8 = new Object[lIlIlIIIlIll[2]];
        objectArray8[al.lIlIlIIIlIll[0]] = lllllllllllllllIllIlIlIIlIIIlIlI;
        lllllllllllllllIllIlIlIIlIIIIlIl.i(String.format(lIlIIllllllI[lIlIlIIIlIll[30]], objectArray8));
        0;
        Object[] objectArray9 = new Object[lIlIlIIIlIll[2]];
        objectArray9[al.lIlIlIIIlIll[0]] = lllllllllllllllIllIlIlIIlIIIlIlI;
        lllllllllllllllIllIlIlIIlIIIIlIl.j(String.format(lIlIIllllllI[lIlIlIIIlIll[31]], objectArray9));
        0;
        ((am)lllllllllllllllIllIlIlIIlIIIIllI).a(lllllllllllllllIllIlIlIIlIIIIlIl);
        ((am)lllllllllllllllIllIlIlIIlIIIIllI).d(lIlIIllllllI[lIlIlIIIlIll[32]]);
        lllllllllllllllIllIlIlIIlIIIIlII = RequestBody.create((MediaType)MediaType.parse((String)lIlIIllllllI[lIlIlIIIlIll[33]]), (String)((am)lllllllllllllllIllIlIlIIlIIIIllI).cC().toString());
        lllllllllllllllIllIlIlIIlIIIIIll = new Request.Builder().url(lIlIIllllllI[lIlIlIIIlIll[16]]).post((RequestBody)lllllllllllllllIllIlIlIIlIIIIlII).build();
        lllllllllllllllIllIlIlIIlIIIIIlI = RuneLiteAPI.CLIENT;
        try {
            Response lllllllllllllllIllIlIlIIlIIIIIIl;
            block47: {
                lllllllllllllllIllIlIlIIlIIIIIIl = lllllllllllllllIllIlIlIIlIIIIIlI.newCall((Request)lllllllllllllllIllIlIlIIlIIIIIll).execute();
                try {
                    if (!al.llIlllIIIIlllI(lllllllllllllllIllIlIlIIlIIIIIIl.isSuccessful() ? 1 : 0)) break block47;
                    System.out.println(lllllllllllllllIllIlIlIIlIIIIIIl.body().string());
                    throw new IOException("Unsuccessful response: " + lllllllllllllllIllIlIlIIlIIIIIIl.message());
                }
                catch (Throwable lllllllllllllllIllIlIlIIlIIIIIII) {
                    if (al.llIlllIIIIllIl(lllllllllllllllIllIlIlIIlIIIIIIl)) {
                        try {
                            lllllllllllllllIllIlIlIIlIIIIIIl.close();
                            0;
                        }
                        catch (Throwable lllllllllllllllIllIlIlIIIlllllll) {
                            lllllllllllllllIllIlIlIIlIIIIIII.addSuppressed(lllllllllllllllIllIlIlIIIlllllll);
                        }
                        if (null != null) {
                            return;
                        }
                    }
                    throw lllllllllllllllIllIlIlIIlIIIIIII;
                }
            }
            if (al.llIlllIIIIllIl(lllllllllllllllIllIlIlIIlIIIIIIl)) {
                lllllllllllllllIllIlIlIIlIIIIIIl.close();
                0;
                if (2 >= 3) {
                    return;
                }
            }
            0;
        }
        catch (IOException lllllllllllllllIllIlIlIIlIIIIIIl) {
            throw new RuntimeException(lllllllllllllllIllIlIlIIlIIIIIIl);
        }
        if (null != null) {
            return;
        }
    }

    private static void llIlllIIIIlIII() {
        lIlIlIIIlIll = new int[35];
        al.lIlIlIIIlIll[0] = (0x4F ^ 0x46) & ~(0x64 ^ 0x6D);
        al.lIlIlIIIlIll[1] = -1;
        al.lIlIlIIIlIll[2] = 1;
        al.lIlIlIIIlIll[3] = 0xFFFFF9B0 & 0xB77FF;
        al.lIlIlIIIlIll[4] = 2;
        al.lIlIlIIIlIll[5] = 3;
        al.lIlIlIIIlIll[6] = 3 ^ (0x7D ^ 0x7A);
        al.lIlIlIIIlIll[7] = 0xBA ^ 0x81 ^ (0xA9 ^ 0x97);
        al.lIlIlIIIlIll[8] = (0x8E ^ 0xC6) + (3 ^ 0x52) - (0x65 ^ 0x11) + (0x34 ^ 0x6F);
        al.lIlIlIIIlIll[9] = 9 ^ 0xF;
        al.lIlIlIIIlIll[10] = 0x20 ^ 0x27;
        al.lIlIlIIIlIll[11] = 87 + 118 - 69 + 3 ^ 51 + 5 - 7 + 82;
        al.lIlIlIIIlIll[12] = 0x75 ^ 0x7E ^ 2;
        al.lIlIlIIIlIll[13] = 0x94 ^ 0x9E;
        al.lIlIlIIIlIll[14] = 5 ^ 0x79 ^ (0x6A ^ 0x1D);
        al.lIlIlIIIlIll[15] = 0x54 ^ 0x58;
        al.lIlIlIIIlIll[16] = 0x4E ^ 4 ^ (0x47 ^ 0x13);
        al.lIlIlIIIlIll[17] = 0x6A ^ 0x67;
        al.lIlIlIIIlIll[18] = 0xB2 ^ 0xBC;
        al.lIlIlIIIlIll[19] = 75 + 66 - 121 + 164 ^ 82 + 150 - 179 + 130;
        al.lIlIlIIIlIll[20] = 91 + 117 - 193 + 112 ^ (0x6D ^ 2);
        al.lIlIlIIIlIll[21] = 153 + 5 - 45 + 76 ^ 99 + 41 - 73 + 105;
        al.lIlIlIIIlIll[22] = 94 + 55 - 126 + 114 ^ 118 + 121 - 229 + 145;
        al.lIlIlIIIlIll[23] = 109 + 157 - 245 + 161 ^ 162 + 79 - 117 + 41;
        al.lIlIlIIIlIll[24] = 43 + 82 - 25 + 61 ^ 34 + 94 - -9 + 44;
        al.lIlIlIIIlIll[25] = 0xD5 ^ 0xC0;
        al.lIlIlIIIlIll[26] = 0x7C ^ 0x66 ^ (0x4D ^ 0x41);
        al.lIlIlIIIlIll[27] = 66 + 65 - 44 + 90 ^ 114 + 47 - 27 + 32;
        al.lIlIlIIIlIll[28] = 0x4F ^ 0x57;
        al.lIlIlIIIlIll[29] = 0x3F ^ 0x26;
        al.lIlIlIIIlIll[30] = 38 + 9 - 19 + 115 ^ 25 + 147 - 98 + 75;
        al.lIlIlIIIlIll[31] = 63 + 46 - 17 + 74 ^ 153 + 176 - 179 + 39;
        al.lIlIlIIIlIll[32] = 126 + 87 - 60 + 22 ^ 42 + 40 - 15 + 112;
        al.lIlIlIIIlIll[33] = 0x6B ^ 0x62 ^ (0xA8 ^ 0xBC);
        al.lIlIlIIIlIll[34] = 0xA ^ 0x15;
    }

    private static boolean llIlllIIIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlllIIIIllIl(Object object) {
        return object != null;
    }

    private static boolean llIlllIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllIlllIlIII(String lllllllllllllllIllIlIlIIIlIlllll, String lllllllllllllllIllIlIlIIIlIllllI) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlIIIllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIIIlIllllI.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIll[11]), "DES");
            Cipher lllllllllllllllIllIlIlIIIllIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIllIlIlIIIllIIIIl.init(lIlIlIIIlIll[4], lllllllllllllllIllIlIlIIIllIIIlI);
            return new String(lllllllllllllllIllIlIlIIIllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIlIIIllIIIII) {
            lllllllllllllllIllIlIlIIIllIIIII.printStackTrace();
            return null;
        }
    }

    private static void llIllIlllIlIlI() {
        lIlIIllllllI = new String[lIlIlIIIlIll[34]];
        al.lIlIIllllllI[al.lIlIlIIIlIll[0]] = al."x ";
        al.lIlIIllllllI[al.lIlIlIIIlIll[2]] = al."\\n";
        al.lIlIIllllllI[al.lIlIlIIIlIll[4]] = al."Unknown";
        al.lIlIIllllllI[al.lIlIlIIIlIll[5]] = al."An anonymous user";
        al.lIlIIllllllI[al.lIlIlIIIlIll[6]] = al."unknown";
        al.lIlIIllllllI[al.lIlIlIIIlIll[7]] = al."https://imagedelivery.net/A5gbiev6F8AaBvp6M146Kw/08ae154b-5610-40dd-fb9f-609f01d8ae00/1600X1200";
        al.lIlIIllllllI[al.lIlIlIIIlIll[9]] = al."%s got some loot from Chambers of Xeric!";
        al.lIlIIllllllI[al.lIlIlIIIlIll[10]] = al."Arcane";
        al.lIlIIllllllI[al.lIlIlIIIlIll[11]] = al."2-ply toilet paper";
        al.lIlIIllllllI[al.lIlIlIIIlIll[12]] = al."Dexterous";
        al.lIlIIllllllI[al.lIlIlIIIlIll[13]] = al."3-ply toilet paper";
        al.lIlIIllllllI[al.lIlIlIIIlIll[14]] = al."buckler";
        al.lIlIIllllllI[al.lIlIlIIIlIll[15]] = al."wrong Twisted b";
        al.lIlIIllllllI[al.lIlIlIIIlIll[17]] = al."Kodai";
        al.lIlIIllllllI[al.lIlIlIIIlIll[18]] = al."buttplug";
        al.lIlIIllllllI[al.lIlIlIIIlIll[19]] = al."wrong";
        al.lIlIIllllllI[al.lIlIlIIIlIll[20]] = al."Condolences to an anonymous user for %s";
        al.lIlIIllllllI[al.lIlIlIIIlIll[21]] = al."Condolences <@%s> for your %s";
        al.lIlIIllllllI[al.lIlIlIIIlIll[22]] = al."buttplug";
        al.lIlIIllllllI[al.lIlIlIIIlIll[23]] = al."Congratulations to an anonymous user for ordering their brand new %s";
        al.lIlIIllllllI[al.lIlIlIIIlIll[24]] = al."Congratulations <@%s> on your brand new %s, enjoy your time with the toy!";
        al.lIlIIllllllI[al.lIlIlIIIlIll[25]] = al."Congratulations to an anonymous user on their %s";
        al.lIlIIllllllI[al.lIlIlIIIlIll[26]] = al."Congratulations <@%s> on your %s";
        al.lIlIIllllllI[al.lIlIlIIIlIll[27]] = al."Generic loot > 750k";
        al.lIlIIllllllI[al.lIlIlIIIlIll[28]] = al."Loot";
        al.lIlIIllllllI[al.lIlIlIIIlIll[29]] = al."Value";
        al.lIlIIllllllI[al.lIlIlIIIlIll[30]] = al."https://static.runelite.net/cache/item/icon/%d.png";
        al.lIlIIllllllI[al.lIlIlIIIlIll[31]] = al."https://static.runelite.net/cache/item/icon/%d.png";
        al.lIlIIllllllI[al.lIlIlIIIlIll[32]] = al."Mr Squire";
        al.lIlIIllllllI[al.lIlIlIIIlIll[33]] = al."application/json";
        al.lIlIIllllllI[al.lIlIlIIIlIll[16]] = al."https://discord.com/api/webhooks/1256526543811772486/wpcuacQOdOhKuwNRk9gP9ZFfFkQnd7TQhJ8TkR15zJDuLMB-IPGT8jJO5X2R8Pv_llMN";
    }

    private static boolean llIlllIIIIlIIl(int n2) {
        return n2 != 0;
    }

    private static String llIllIlllIIlll(String lllllllllllllllIllIlIlIIIlllIlII, String lllllllllllllllIllIlIlIIIllIlllI) {
        lllllllllllllllIllIlIlIIIlllIlII = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIlIIIlllIIlI = new StringBuilder();
        char[] lllllllllllllllIllIlIlIIIlllIIIl = lllllllllllllllIllIlIlIIIllIlllI.toCharArray();
        int lllllllllllllllIllIlIlIIIlllIIII = lIlIlIIIlIll[0];
        char[] lllllllllllllllIllIlIlIIIllIlIlI = lllllllllllllllIllIlIlIIIlllIlII.toCharArray();
        int lllllllllllllllIllIlIlIIIllIlIIl = lllllllllllllllIllIlIlIIIllIlIlI.length;
        int lllllllllllllllIllIlIlIIIllIlIII = lIlIlIIIlIll[0];
        while (al.llIlllIIIIlIll(lllllllllllllllIllIlIlIIIllIlIII, lllllllllllllllIllIlIlIIIllIlIIl)) {
            char lllllllllllllllIllIlIlIIIlllIlIl = lllllllllllllllIllIlIlIIIllIlIlI[lllllllllllllllIllIlIlIIIllIlIII];
            lllllllllllllllIllIlIlIIIlllIIlI.append((char)(lllllllllllllllIllIlIlIIIlllIlIl ^ lllllllllllllllIllIlIlIIIlllIIIl[lllllllllllllllIllIlIlIIIlllIIII % lllllllllllllllIllIlIlIIIlllIIIl.length]));
            0;
            ++lllllllllllllllIllIlIlIIIlllIIII;
            ++lllllllllllllllIllIlIlIIIllIlIII;
            0;
            if (1 != (127 + 120 - 207 + 159 ^ 13 + 117 - -12 + 53)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIlIIIlllIIlI);
    }

    static {
        al.llIlllIIIIlIII();
        al.llIllIlllIlIlI();
        cT = lIlIlIIIlIll[3];
    }

    private static boolean llIlllIIIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllIIIIllII(Object object) {
        return object == null;
    }

    private static String llIllIlllIlIIl(String lllllllllllllllIllIlIlIIIlIlIIII, String lllllllllllllllIllIlIlIIIlIIllll) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlIIIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIlIIIlIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIlIIIlIlIlII.init(lIlIlIIIlIll[4], lllllllllllllllIllIlIlIIIlIlIlIl);
            return new String(lllllllllllllllIllIlIlIIIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIlIIIlIlIIll) {
            lllllllllllllllIllIlIlIIIlIlIIll.printStackTrace();
            return null;
        }
    }
}

