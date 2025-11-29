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
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.awt.Color;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
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
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.E;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.F;

public class D {
    private static /* synthetic */ String[] lIlllIIlIll;
    private static /* synthetic */ int[] lIlllIlIIII;
    private static final /* synthetic */ int bg;

    private static boolean lIIllIIlIlIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIllIIlIIlllI(int n2) {
        return n2 != 0;
    }

    private static void lIIllIIlIIIlll() {
        lIlllIIlIll = new String[lIlllIlIIII[21]];
        D.lIlllIIlIll[D.lIlllIlIIII[0]] = D."x ";
        D.lIlllIIlIll[D.lIlllIlIIII[2]] = D."\\n";
        D.lIlllIIlIll[D.lIlllIlIIII[4]] = D."Unknown";
        D.lIlllIIlIll[D.lIlllIlIIII[5]] = D."An anonymous user";
        D.lIlllIIlIll[D.lIlllIlIIII[6]] = D."unknown";
        D.lIlllIIlIll[D.lIlllIlIIII[7]] = D."https://imagedelivery.net/A5gbiev6F8AaBvp6M146Kw/08ae154b-5610-40dd-fb9f-609f01d8ae00/1600X1200";
        D.lIlllIIlIll[D.lIlllIlIIII[9]] = D."%s got some loot from Tombs of Amascut!";
        D.lIlllIIlIll[D.lIlllIlIIII[10]] = D."Congratulations to an anonymous user on their %s";
        D.lIlllIIlIll[D.lIlllIlIIII[11]] = D."Congratulations <@%s> on your %s";
        D.lIlllIIlIll[D.lIlllIlIIII[12]] = D."Generic loot > 1m";
        D.lIlllIIlIll[D.lIlllIlIIII[13]] = D."Invocation";
        D.lIlllIIlIll[D.lIlllIlIIII[14]] = D."Loot";
        D.lIlllIIlIll[D.lIlllIlIIII[15]] = D."Value";
        D.lIlllIIlIll[D.lIlllIlIIII[16]] = D."https://static.runelite.net/cache/item/icon/%d.png";
        D.lIlllIIlIll[D.lIlllIlIIII[17]] = D."https://static.runelite.net/cache/item/icon/%d.png";
        D.lIlllIIlIll[D.lIlllIlIIII[18]] = D."Mr Squire";
        D.lIlllIIlIll[D.lIlllIlIIII[19]] = D."application/json";
        D.lIlllIIlIll[D.lIlllIlIIII[20]] = D."https://discord.com/api/webhooks/1154718947032178729/z82OAyQKqnyHNDpEn2diIsvx3qf_GlA-SkXsgjsNqFV3gQXWV1Y7i6NyO-4L2uGxwxN6";
    }

    private static String lIIllIIIlllllI(String var30, String var17) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var27 = Cipher.getInstance("Blowfish");
            var27.init(lIlllIlIIII[4], var12);
            return new String(var27.doFinal(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static String lIIllIIIllllll(String var20, String var13) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var36 = new StringBuilder();
        char[] var25 = var13.toCharArray();
        int var29 = lIlllIlIIII[0];
        char[] var6 = var20.toCharArray();
        int var10 = var6.length;
        int var7 = lIlllIlIIII[0];
        while (D.lIIllIIlIlIIII(var7, var10)) {
            char var24 = var6[var7];
            var36.append((char)(var24 ^ var25[var29 % var25.length]));
            0;
            ++var29;
            ++var7;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(var36);
    }

    static {
        D.lIIllIIlIIllIl();
        D.lIIllIIlIIIlll();
        bg = lIlllIlIIII[3];
    }

    private static boolean lIIllIIlIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIIlIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIllIIlIIllIl() {
        lIlllIlIIII = new int[22];
        D.lIlllIlIIII[0] = (126 + 81 - 151 + 104 ^ 66 + 104 - 136 + 108) & (0x39 ^ 0x67 ^ (0x63 ^ 0x13) ^ -1);
        D.lIlllIlIIII[1] = -1;
        D.lIlllIlIIII[2] = 1;
        D.lIlllIlIIII[3] = -(0xFFFFDF77 & 0x3DBF) & (0xFFFFFF77 & 0xF5FFE);
        D.lIlllIlIIII[4] = 2;
        D.lIlllIlIIII[5] = 3;
        D.lIlllIlIIII[6] = 0x27 ^ 0x59 ^ (0x45 ^ 0x3F);
        D.lIlllIlIIII[7] = 0x17 ^ 0x12;
        D.lIlllIlIIII[8] = (0xF ^ 0x42) + (0x8B ^ 0xBC) - (0x10 ^ 0x50) + (0x10 ^ 0x2C);
        D.lIlllIlIIII[9] = 0x59 ^ 0x5F;
        D.lIlllIlIIII[10] = 0x91 ^ 0xAD ^ (0x6B ^ 0x50);
        D.lIlllIlIIII[11] = 120 + 137 - 186 + 67 ^ 9 + 71 - -50 + 0;
        D.lIlllIlIIII[12] = 0x14 ^ 0x1D;
        D.lIlllIlIIII[13] = 0 ^ 0xA;
        D.lIlllIlIIII[14] = 0x9C ^ 0x97;
        D.lIlllIlIIII[15] = 6 ^ 0x35 ^ (0x86 ^ 0xB9);
        D.lIlllIlIIII[16] = 0x8D ^ 0x80;
        D.lIlllIlIIII[17] = 0xE3 ^ 0xC3 ^ (0x21 ^ 0xF);
        D.lIlllIlIIII[18] = 0x4A ^ 0x26 ^ (0x3D ^ 0x5E);
        D.lIlllIlIIII[19] = 0x4A ^ 0x5A;
        D.lIlllIlIIII[20] = 0xAF ^ 0xBE;
        D.lIlllIlIIII[21] = 0x4F ^ 6 ^ (0x7E ^ 0x25);
    }

    private static boolean lIIllIIlIlIIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(ItemStack itemStack, Collection<ItemStack> collection, String string, boolean bl2) {
        void var16;
        ItemComposition var28;
        Color color;
        ItemStack var5;
        String string2;
        void var14;
        Object object;
        void var3;
        void var34;
        int var33;
        Object var19;
        void var2;
        Object var9;
        Client client = Static.getClient();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = lIlllIlIIII[0];
        int n3 = lIlllIlIIII[1];
        int n4 = lIlllIlIIII[0];
        Object var18 = collection.iterator();
        while (D.lIIllIIlIIlllI(var18.hasNext() ? 1 : 0)) {
            int var15;
            var9 = var18.next();
            var19 = var2.getItemDefinition(var9.getId());
            int var37 = Prices.getItemPrice((int)var19.getId()) * var9.getQuantity();
            if (D.lIIllIIlIIllll(var37, var15)) {
                var15 = var37;
                var33 = var19.getId();
            }
            var3 += var37;
            var34.append(var9.getQuantity()).append(lIlllIIlIll[lIlllIlIIII[0]]).append(var19.getName()).append(lIlllIIlIll[lIlllIlIIII[2]]);
            0;
            0;
            
            return;
        }
        if (D.lIIllIIlIlIIII((int)var3, lIlllIlIIII[3])) {
            return;
        }
        if (D.lIIllIIlIlIIIl(var2.getDiscordUsername())) {
            object = lIlllIIlIll[lIlllIlIIII[4]];
            0;
            if (((179 + 6 - 129 + 130 ^ 1 + 71 - -9 + 53) & (7 + 127 - 98 + 154 ^ 102 + 100 - 181 + 109 ^ -1)) != ((5 + 121 - 92 + 161 ^ 25 + 136 - 128 + 112) & (8 ^ 0x7E ^ (0x60 ^ 0x44) ^ -1))) {
                return;
            }
        } else {
            object = var18 = var2.getDiscordUsername();
        }
        if (D.lIIllIIlIIlllI((int)var14)) {
            var18 = lIlllIIlIll[lIlllIlIIII[5]];
        }
        if (D.lIIllIIlIlIIIl(var2.getDiscordId())) {
            string2 = lIlllIIlIll[lIlllIlIIII[6]];
            0;
            if (-1 >= 2) {
                return;
            }
        } else {
            string2 = var2.getDiscordId();
        }
        var9 = string2;
        var19 = new E();
        ((E)var19).c(lIlllIIlIll[lIlllIlIIII[7]]);
        F var37 = new F();
        if (D.lIIllIIlIlIIIl(var5)) {
            color = Color.WHITE;
            0;
            
            }
        } else {
            color = new Color(lIlllIlIIII[8], lIlllIlIIII[0], lIlllIlIIII[8]);
        }
        var37.a(color);
        0;
        Object[] objectArray = new Object[lIlllIlIIII[2]];
        objectArray[D.lIlllIlIIII[0]] = var18;
        var37.d(String.format(lIlllIIlIll[lIlllIlIIII[9]], objectArray));
        0;
        if (D.lIIllIIlIlIIlI(var5)) {
            var28 = var2.getItemComposition(var5.getId());
            if (D.lIIllIIlIIlllI((int)var14)) {
                Object[] objectArray2 = new Object[lIlllIlIIII[2]];
                objectArray2[D.lIlllIlIIII[0]] = var28.getName();
                var37.e(String.format(lIlllIIlIll[lIlllIlIIII[10]], objectArray2));
                0;
                0;
                if ((77 + 114 - 68 + 22 ^ 39 + 3 - -7 + 100) == 0) {
                    return;
                }
            } else {
                Object[] objectArray3 = new Object[lIlllIlIIII[4]];
                objectArray3[D.lIlllIlIIII[0]] = var9;
                objectArray3[D.lIlllIlIIII[2]] = var28.getName();
                var37.e(String.format(lIlllIIlIll[lIlllIlIIII[11]], objectArray3));
                0;
            }
            0;
            if (1 == (0x6B ^ 0x6F)) {
                return;
            }
        } else {
            var37.e(lIlllIIlIll[lIlllIlIIII[12]]);
            0;
        }
        var37.a(lIlllIIlIll[lIlllIlIIII[13]], (String)var16, lIlllIlIIII[2]);
        0;
        var37.a(lIlllIIlIll[lIlllIlIIII[14]], String.valueOf(var34), lIlllIlIIII[2]);
        0;
        var37.a(lIlllIIlIll[lIlllIlIIII[15]], QuantityFormatter.formatNumber((long)((long)var3)), lIlllIlIIII[2]);
        0;
        Object[] objectArray4 = new Object[lIlllIlIIII[2]];
        objectArray4[D.lIlllIlIIII[0]] = var33;
        var37.g(String.format(lIlllIIlIll[lIlllIlIIII[16]], objectArray4));
        0;
        Object[] objectArray5 = new Object[lIlllIlIIII[2]];
        objectArray5[D.lIlllIlIIII[0]] = var33;
        var37.h(String.format(lIlllIIlIll[lIlllIlIIII[17]], objectArray5));
        0;
        ((E)var19).a(var37);
        ((E)var19).b(lIlllIIlIll[lIlllIlIIII[18]]);
        var28 = RequestBody.create((MediaType)MediaType.parse((String)lIlllIIlIll[lIlllIlIIII[19]]), (String)((E)var19).aw().toString());
        Request var23 = new Request.Builder().url(lIlllIIlIll[lIlllIlIIII[20]]).post((RequestBody)var28).build();
        OkHttpClient var21 = RuneLiteAPI.CLIENT;
        try {
            Response var32;
            block30: {
                var32 = var21.newCall(var23).execute();
                try {
                    if (!D.lIIllIIlIlIIll(var32.isSuccessful() ? 1 : 0)) break block30;
                    System.out.println(var32.body().string());
                    throw new IOException("Unsuccessful response: " + var32.message());
                }
                catch (Throwable var8) {
                    if (D.lIIllIIlIlIIlI(var32)) {
                        try {
                            var32.close();
                            0;
                        }
                        catch (Throwable var22) {
                            var8.addSuppressed(var22);
                        }
                        if (1 < -1) {
                            return;
                        }
                    }
                    throw var8;
                }
            }
            if (D.lIIllIIlIlIIlI(var32)) {
                var32.close();
                0;
                
                }
            }
            0;
        }
        catch (IOException var32) {
            throw new RuntimeException(var32);
        }
        if (((8 ^ 2) & ~(0x46 ^ 0x4C)) <= -1) {
            return;
        }
    }

    private static String lIIllIIlIIIlII(String var4, String var11) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIlllIlIIII[11]), "DES");
            Cipher var31 = Cipher.getInstance("DES");
            var31.init(lIlllIlIIII[4], var26);
            return new String(var31.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }
}

