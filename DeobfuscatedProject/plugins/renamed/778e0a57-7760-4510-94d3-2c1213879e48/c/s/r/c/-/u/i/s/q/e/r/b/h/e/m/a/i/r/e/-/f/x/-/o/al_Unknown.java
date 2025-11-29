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

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.am_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.an_Unknown;
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

public class al_Unknown {
    private static final /* synthetic */ int cT;
    private static /* synthetic */ String[] lIlIIllllllI;
    private static /* synthetic */ int[] lIlIlIIIlIll;

    /*
     * WARNING - void declaration
     */
    public static void a(ItemStack itemStack, Collection<ItemStack> collection, boolean bl2) {
        Random var22;
        String var12;
        ItemComposition var20;
        Color color;
        ItemStack var24;
        String string;
        void var21;
        Object object;
        void var19;
        void var25;
        int var15;
        Object var31;
        void var28;
        Object var35;
        Client client = Static.getClient();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = lIlIlIIIlIll[0];
        int n3 = lIlIlIIIlIll[1];
        int n4 = lIlIlIIIlIll[0];
        Object var26 = collection.iterator();
        while (al.llIlllIIIIlIIl(var26.hasNext() ? 1 : 0)) {
            int var6;
            var35 = var26.next();
            var31 = var28.getItemDefinition(var35.getId());
            int var8 = Prices.getItemPrice((int)var31.getId()) * var35.getQuantity();
            if (al.llIlllIIIIlIlI(var8, var6)) {
                var6 = var8;
                var15 = var31.getId();
            }
            var19 += var8;
            var25.append(var35.getQuantity()).append(lIlIIllllllI[lIlIlIIIlIll[0]]).append(var31.getName()).append(lIlIIllllllI[lIlIlIIIlIll[2]]);
            0;
            0;
            if (2 > 1) continue;
            return;
        }
        if (al.llIlllIIIIlIll((int)var19, lIlIlIIIlIll[3])) {
            return;
        }
        if (al.llIlllIIIIllII(var28.getDiscordUsername())) {
            object = lIlIIllllllI[lIlIlIIIlIll[4]];
            0;
            if ((0x11 ^ 0x7C ^ (0x6E ^ 7)) == 0) {
                return;
            }
        } else {
            object = var26 = var28.getDiscordUsername();
        }
        if (al.llIlllIIIIlIIl((int)var21)) {
            var26 = lIlIIllllllI[lIlIlIIIlIll[5]];
        }
        if (al.llIlllIIIIllII(var28.getDiscordId())) {
            string = lIlIIllllllI[lIlIlIIIlIll[6]];
            0;
            if (-(0x55 ^ 0x50) >= 0) {
                return;
            }
        } else {
            string = var28.getDiscordId();
        }
        var35 = string;
        var31 = new am();
        ((am)var31).e(lIlIIllllllI[lIlIlIIIlIll[7]]);
        an var8 = new an();
        if (al.llIlllIIIIllII(var24)) {
            color = Color.WHITE;
            0;
            if (1 <= -1) {
                return;
            }
        } else {
            color = new Color(lIlIlIIIlIll[8], lIlIlIIIlIll[0], lIlIlIIIlIll[8]);
        }
        var8.a(color);
        0;
        Object[] objectArray = new Object[lIlIlIIIlIll[2]];
        objectArray[al.lIlIlIIIlIll[0]] = var26;
        var8.f(String.format(lIlIIllllllI[lIlIlIIIlIll[9]], objectArray));
        0;
        if (al.llIlllIIIIllIl(var24)) {
            var20 = var28.getItemComposition(var24.getId());
            var12 = var20.getName();
            var22 = new Random();
            if (al.llIlllIIIIlllI(var22.nextInt(lIlIlIIIlIll[7]))) {
                if (al.llIlllIIIIlIIl(var12.contains(lIlIIllllllI[lIlIlIIIlIll[10]]) ? 1 : 0)) {
                    var12 = lIlIIllllllI[lIlIlIIIlIll[11]];
                }
                if (al.llIlllIIIIlIIl(var12.contains(lIlIIllllllI[lIlIlIIIlIll[12]]) ? 1 : 0)) {
                    var12 = lIlIIllllllI[lIlIlIIIlIll[13]];
                }
                if (al.llIlllIIIIlIIl(var12.contains(lIlIIllllllI[lIlIlIIIlIll[14]]) ? 1 : 0)) {
                    var12 = lIlIIllllllI[lIlIlIIIlIll[15]];
                }
            }
            if (al.llIlllIIIIlllI(var22.nextInt(lIlIlIIIlIll[16])) && al.llIlllIIIIlIIl(var12.contains(lIlIIllllllI[lIlIlIIIlIll[17]]) ? 1 : 0)) {
                var12 = lIlIIllllllI[lIlIlIIIlIll[18]];
            }
            if (al.llIlllIIIIlIIl(var12.contains(lIlIIllllllI[lIlIlIIIlIll[19]]) ? 1 : 0)) {
                if (al.llIlllIIIIlIIl((int)var21)) {
                    Object[] objectArray2 = new Object[lIlIlIIIlIll[2]];
                    objectArray2[al.lIlIlIIIlIll[0]] = var12;
                    var8.g(String.format(lIlIIllllllI[lIlIlIIIlIll[20]], objectArray2));
                    0;
                    0;
                    if (1 == ((0x6D ^ 0x7C) & ~(0x53 ^ 0x42))) {
                        return;
                    }
                } else {
                    Object[] objectArray3 = new Object[lIlIlIIIlIll[4]];
                    objectArray3[al.lIlIlIIIlIll[0]] = var35;
                    objectArray3[al.lIlIlIIIlIll[2]] = var12;
                    var8.g(String.format(lIlIIllllllI[lIlIlIIIlIll[21]], objectArray3));
                    0;
                    0;
                    if (-3 > 0) {
                        return;
                    }
                }
            } else if (al.llIlllIIIIlIIl(var12.contains(lIlIIllllllI[lIlIlIIIlIll[22]]) ? 1 : 0)) {
                if (al.llIlllIIIIlIIl((int)var21)) {
                    Object[] objectArray4 = new Object[lIlIlIIIlIll[2]];
                    objectArray4[al.lIlIlIIIlIll[0]] = var12;
                    var8.g(String.format(lIlIIllllllI[lIlIlIIIlIll[23]], objectArray4));
                    0;
                    0;
                    if (((6 ^ 0x15) & ~(0xD1 ^ 0xC2)) == (0x4E ^ 0x4A)) {
                        return;
                    }
                } else {
                    Object[] objectArray5 = new Object[lIlIlIIIlIll[4]];
                    objectArray5[al.lIlIlIIIlIll[0]] = var35;
                    objectArray5[al.lIlIlIIIlIll[2]] = var12;
                    var8.g(String.format(lIlIIllllllI[lIlIlIIIlIll[24]], objectArray5));
                    0;
                    0;
                    if ((0x54 ^ 0x50) < 0) {
                        return;
                    }
                }
            } else if (al.llIlllIIIIlIIl((int)var21)) {
                Object[] objectArray6 = new Object[lIlIlIIIlIll[2]];
                objectArray6[al.lIlIlIIIlIll[0]] = var12;
                var8.g(String.format(lIlIIllllllI[lIlIlIIIlIll[25]], objectArray6));
                0;
                0;
                if (1 == 0) {
                    return;
                }
            } else {
                Object[] objectArray7 = new Object[lIlIlIIIlIll[4]];
                objectArray7[al.lIlIlIIIlIll[0]] = var35;
                objectArray7[al.lIlIlIIIlIll[2]] = var12;
                var8.g(String.format(lIlIIllllllI[lIlIlIIIlIll[26]], objectArray7));
                0;
            }
            0;
            if (2 < 0) {
                return;
            }
        } else {
            var8.g(lIlIIllllllI[lIlIlIIIlIll[27]]);
            0;
        }
        var8.a(lIlIIllllllI[lIlIlIIIlIll[28]], String.valueOf(var25), lIlIlIIIlIll[2]);
        0;
        var8.a(lIlIIllllllI[lIlIlIIIlIll[29]], QuantityFormatter.formatNumber((long)((long)var19)), lIlIlIIIlIll[2]);
        0;
        Object[] objectArray8 = new Object[lIlIlIIIlIll[2]];
        objectArray8[al.lIlIlIIIlIll[0]] = var15;
        var8.i(String.format(lIlIIllllllI[lIlIlIIIlIll[30]], objectArray8));
        0;
        Object[] objectArray9 = new Object[lIlIlIIIlIll[2]];
        objectArray9[al.lIlIlIIIlIll[0]] = var15;
        var8.j(String.format(lIlIIllllllI[lIlIlIIIlIll[31]], objectArray9));
        0;
        ((am)var31).a(var8);
        ((am)var31).d(lIlIIllllllI[lIlIlIIIlIll[32]]);
        var20 = RequestBody.create((MediaType)MediaType.parse((String)lIlIIllllllI[lIlIlIIIlIll[33]]), (String)((am)var31).cC().toString());
        var12 = new Request.Builder().url(lIlIIllllllI[lIlIlIIIlIll[16]]).post((RequestBody)var20).build();
        var22 = RuneLiteAPI.CLIENT;
        try {
            Response var29;
            block47: {
                var29 = var22.newCall((Request)var12).execute();
                try {
                    if (!al.llIlllIIIIlllI(var29.isSuccessful() ? 1 : 0)) break block47;
                    System.out.println(var29.body().string());
                    throw new IOException("Unsuccessful response: " + var29.message());
                }
                catch (Throwable var27) {
                    if (al.llIlllIIIIllIl(var29)) {
                        try {
                            var29.close();
                            0;
                        }
                        catch (Throwable var18) {
                            var27.addSuppressed(var18);
                        }
                        
                        }
                    }
                    throw var27;
                }
            }
            if (al.llIlllIIIIllIl(var29)) {
                var29.close();
                0;
                if (2 >= 3) {
                    return;
                }
            }
            0;
        }
        catch (IOException var29) {
            throw new RuntimeException(var29);
        }
        
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

    private static String llIllIlllIlIII(String var5, String var32) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var32.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIll[11]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlIlIIIlIll[4], var3);
            return new String(var7.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
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

    private static String llIllIlllIIlll(String var1, String var36) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var30 = var36.toCharArray();
        int var11 = lIlIlIIIlIll[0];
        char[] var13 = var1.toCharArray();
        int var16 = var13.length;
        int var4 = lIlIlIIIlIll[0];
        while (al.llIlllIIIIlIll(var4, var16)) {
            char var33 = var13[var4];
            var2.append((char)(var33 ^ var30[var11 % var30.length]));
            0;
            ++var11;
            ++var4;
            0;
            if (1 != (127 + 120 - 207 + 159 ^ 13 + 117 - -12 + 53)) continue;
            return null;
        }
        return String.valueOf(var2);
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

    private static String llIllIlllIlIIl(String var17, String var9) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlIlIIIlIll[4], var23);
            return new String(var14.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }
}

