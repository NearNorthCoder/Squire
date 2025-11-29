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

    private static String lIIllIIIlllllI(String llllllllllllllllIlIIllIlIlIlIlll, String llllllllllllllllIlIIllIlIlIlIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIllIlIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIllIlIlIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIllIlIlIllIll.init(lIlllIlIIII[4], llllllllllllllllIlIIllIlIlIlllII);
            return new String(llllllllllllllllIlIIllIlIlIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIllIlIlIllIlI) {
            llllllllllllllllIlIIllIlIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIllIIIllllll(String llllllllllllllllIlIIllIlIlllIllI, String llllllllllllllllIlIIllIlIlllIlIl) {
        llllllllllllllllIlIIllIlIlllIllI = new String(Base64.getDecoder().decode(llllllllllllllllIlIIllIlIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIllIlIllllIIl = new StringBuilder();
        char[] llllllllllllllllIlIIllIlIllllIII = llllllllllllllllIlIIllIlIlllIlIl.toCharArray();
        int llllllllllllllllIlIIllIlIlllIlll = lIlllIlIIII[0];
        char[] llllllllllllllllIlIIllIlIlllIIIl = llllllllllllllllIlIIllIlIlllIllI.toCharArray();
        int llllllllllllllllIlIIllIlIlllIIII = llllllllllllllllIlIIllIlIlllIIIl.length;
        int llllllllllllllllIlIIllIlIllIllll = lIlllIlIIII[0];
        while (D.lIIllIIlIlIIII(llllllllllllllllIlIIllIlIllIllll, llllllllllllllllIlIIllIlIlllIIII)) {
            char llllllllllllllllIlIIllIlIlllllII = llllllllllllllllIlIIllIlIlllIIIl[llllllllllllllllIlIIllIlIllIllll];
            llllllllllllllllIlIIllIlIllllIIl.append((char)(llllllllllllllllIlIIllIlIlllllII ^ llllllllllllllllIlIIllIlIllllIII[llllllllllllllllIlIIllIlIlllIlll % llllllllllllllllIlIIllIlIllllIII.length]));
            0;
            ++llllllllllllllllIlIIllIlIlllIlll;
            ++llllllllllllllllIlIIllIlIllIllll;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIllIlIllllIIl);
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
        void llllllllllllllllIlIIllIllIIlIllI;
        ItemComposition llllllllllllllllIlIIllIllIIIlIll;
        Color color;
        ItemStack llllllllllllllllIlIIllIllIIllIII;
        String string2;
        void llllllllllllllllIlIIllIllIIlIlIl;
        Object object;
        void llllllllllllllllIlIIllIllIIlIIlI;
        void llllllllllllllllIlIIllIllIIlIIll;
        int llllllllllllllllIlIIllIllIIlIIIl;
        Object llllllllllllllllIlIIllIllIIIllIl;
        void llllllllllllllllIlIIllIllIIlIlII;
        Object llllllllllllllllIlIIllIllIIIlllI;
        Client client = Static.getClient();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = lIlllIlIIII[0];
        int n3 = lIlllIlIIII[1];
        int n4 = lIlllIlIIII[0];
        Object llllllllllllllllIlIIllIllIIIllll = collection.iterator();
        while (D.lIIllIIlIIlllI(llllllllllllllllIlIIllIllIIIllll.hasNext() ? 1 : 0)) {
            int llllllllllllllllIlIIllIllIIlIIII;
            llllllllllllllllIlIIllIllIIIlllI = llllllllllllllllIlIIllIllIIIllll.next();
            llllllllllllllllIlIIllIllIIIllIl = llllllllllllllllIlIIllIllIIlIlII.getItemDefinition(llllllllllllllllIlIIllIllIIIlllI.getId());
            int llllllllllllllllIlIIllIllIIIllII = Prices.getItemPrice((int)llllllllllllllllIlIIllIllIIIllIl.getId()) * llllllllllllllllIlIIllIllIIIlllI.getQuantity();
            if (D.lIIllIIlIIllll(llllllllllllllllIlIIllIllIIIllII, llllllllllllllllIlIIllIllIIlIIII)) {
                llllllllllllllllIlIIllIllIIlIIII = llllllllllllllllIlIIllIllIIIllII;
                llllllllllllllllIlIIllIllIIlIIIl = llllllllllllllllIlIIllIllIIIllIl.getId();
            }
            llllllllllllllllIlIIllIllIIlIIlI += llllllllllllllllIlIIllIllIIIllII;
            llllllllllllllllIlIIllIllIIlIIll.append(llllllllllllllllIlIIllIllIIIlllI.getQuantity()).append(lIlllIIlIll[lIlllIlIIII[0]]).append(llllllllllllllllIlIIllIllIIIllIl.getName()).append(lIlllIIlIll[lIlllIlIIII[2]]);
            0;
            0;
            if (null == null) continue;
            return;
        }
        if (D.lIIllIIlIlIIII((int)llllllllllllllllIlIIllIllIIlIIlI, lIlllIlIIII[3])) {
            return;
        }
        if (D.lIIllIIlIlIIIl(llllllllllllllllIlIIllIllIIlIlII.getDiscordUsername())) {
            object = lIlllIIlIll[lIlllIlIIII[4]];
            0;
            if (((179 + 6 - 129 + 130 ^ 1 + 71 - -9 + 53) & (7 + 127 - 98 + 154 ^ 102 + 100 - 181 + 109 ^ -1)) != ((5 + 121 - 92 + 161 ^ 25 + 136 - 128 + 112) & (8 ^ 0x7E ^ (0x60 ^ 0x44) ^ -1))) {
                return;
            }
        } else {
            object = llllllllllllllllIlIIllIllIIIllll = llllllllllllllllIlIIllIllIIlIlII.getDiscordUsername();
        }
        if (D.lIIllIIlIIlllI((int)llllllllllllllllIlIIllIllIIlIlIl)) {
            llllllllllllllllIlIIllIllIIIllll = lIlllIIlIll[lIlllIlIIII[5]];
        }
        if (D.lIIllIIlIlIIIl(llllllllllllllllIlIIllIllIIlIlII.getDiscordId())) {
            string2 = lIlllIIlIll[lIlllIlIIII[6]];
            0;
            if (-1 >= 2) {
                return;
            }
        } else {
            string2 = llllllllllllllllIlIIllIllIIlIlII.getDiscordId();
        }
        llllllllllllllllIlIIllIllIIIlllI = string2;
        llllllllllllllllIlIIllIllIIIllIl = new E();
        ((E)llllllllllllllllIlIIllIllIIIllIl).c(lIlllIIlIll[lIlllIlIIII[7]]);
        F llllllllllllllllIlIIllIllIIIllII = new F();
        if (D.lIIllIIlIlIIIl(llllllllllllllllIlIIllIllIIllIII)) {
            color = Color.WHITE;
            0;
            if (null != null) {
                return;
            }
        } else {
            color = new Color(lIlllIlIIII[8], lIlllIlIIII[0], lIlllIlIIII[8]);
        }
        llllllllllllllllIlIIllIllIIIllII.a(color);
        0;
        Object[] objectArray = new Object[lIlllIlIIII[2]];
        objectArray[D.lIlllIlIIII[0]] = llllllllllllllllIlIIllIllIIIllll;
        llllllllllllllllIlIIllIllIIIllII.d(String.format(lIlllIIlIll[lIlllIlIIII[9]], objectArray));
        0;
        if (D.lIIllIIlIlIIlI(llllllllllllllllIlIIllIllIIllIII)) {
            llllllllllllllllIlIIllIllIIIlIll = llllllllllllllllIlIIllIllIIlIlII.getItemComposition(llllllllllllllllIlIIllIllIIllIII.getId());
            if (D.lIIllIIlIIlllI((int)llllllllllllllllIlIIllIllIIlIlIl)) {
                Object[] objectArray2 = new Object[lIlllIlIIII[2]];
                objectArray2[D.lIlllIlIIII[0]] = llllllllllllllllIlIIllIllIIIlIll.getName();
                llllllllllllllllIlIIllIllIIIllII.e(String.format(lIlllIIlIll[lIlllIlIIII[10]], objectArray2));
                0;
                0;
                if ((77 + 114 - 68 + 22 ^ 39 + 3 - -7 + 100) == 0) {
                    return;
                }
            } else {
                Object[] objectArray3 = new Object[lIlllIlIIII[4]];
                objectArray3[D.lIlllIlIIII[0]] = llllllllllllllllIlIIllIllIIIlllI;
                objectArray3[D.lIlllIlIIII[2]] = llllllllllllllllIlIIllIllIIIlIll.getName();
                llllllllllllllllIlIIllIllIIIllII.e(String.format(lIlllIIlIll[lIlllIlIIII[11]], objectArray3));
                0;
            }
            0;
            if (1 == (0x6B ^ 0x6F)) {
                return;
            }
        } else {
            llllllllllllllllIlIIllIllIIIllII.e(lIlllIIlIll[lIlllIlIIII[12]]);
            0;
        }
        llllllllllllllllIlIIllIllIIIllII.a(lIlllIIlIll[lIlllIlIIII[13]], (String)llllllllllllllllIlIIllIllIIlIllI, lIlllIlIIII[2]);
        0;
        llllllllllllllllIlIIllIllIIIllII.a(lIlllIIlIll[lIlllIlIIII[14]], String.valueOf(llllllllllllllllIlIIllIllIIlIIll), lIlllIlIIII[2]);
        0;
        llllllllllllllllIlIIllIllIIIllII.a(lIlllIIlIll[lIlllIlIIII[15]], QuantityFormatter.formatNumber((long)((long)llllllllllllllllIlIIllIllIIlIIlI)), lIlllIlIIII[2]);
        0;
        Object[] objectArray4 = new Object[lIlllIlIIII[2]];
        objectArray4[D.lIlllIlIIII[0]] = llllllllllllllllIlIIllIllIIlIIIl;
        llllllllllllllllIlIIllIllIIIllII.g(String.format(lIlllIIlIll[lIlllIlIIII[16]], objectArray4));
        0;
        Object[] objectArray5 = new Object[lIlllIlIIII[2]];
        objectArray5[D.lIlllIlIIII[0]] = llllllllllllllllIlIIllIllIIlIIIl;
        llllllllllllllllIlIIllIllIIIllII.h(String.format(lIlllIIlIll[lIlllIlIIII[17]], objectArray5));
        0;
        ((E)llllllllllllllllIlIIllIllIIIllIl).a(llllllllllllllllIlIIllIllIIIllII);
        ((E)llllllllllllllllIlIIllIllIIIllIl).b(lIlllIIlIll[lIlllIlIIII[18]]);
        llllllllllllllllIlIIllIllIIIlIll = RequestBody.create((MediaType)MediaType.parse((String)lIlllIIlIll[lIlllIlIIII[19]]), (String)((E)llllllllllllllllIlIIllIllIIIllIl).aw().toString());
        Request llllllllllllllllIlIIllIllIIIlIlI = new Request.Builder().url(lIlllIIlIll[lIlllIlIIII[20]]).post((RequestBody)llllllllllllllllIlIIllIllIIIlIll).build();
        OkHttpClient llllllllllllllllIlIIllIllIIIlIIl = RuneLiteAPI.CLIENT;
        try {
            Response llllllllllllllllIlIIllIllIIIlIII;
            block30: {
                llllllllllllllllIlIIllIllIIIlIII = llllllllllllllllIlIIllIllIIIlIIl.newCall(llllllllllllllllIlIIllIllIIIlIlI).execute();
                try {
                    if (!D.lIIllIIlIlIIll(llllllllllllllllIlIIllIllIIIlIII.isSuccessful() ? 1 : 0)) break block30;
                    System.out.println(llllllllllllllllIlIIllIllIIIlIII.body().string());
                    throw new IOException("Unsuccessful response: " + llllllllllllllllIlIIllIllIIIlIII.message());
                }
                catch (Throwable llllllllllllllllIlIIllIllIIIIlll) {
                    if (D.lIIllIIlIlIIlI(llllllllllllllllIlIIllIllIIIlIII)) {
                        try {
                            llllllllllllllllIlIIllIllIIIlIII.close();
                            0;
                        }
                        catch (Throwable llllllllllllllllIlIIllIllIIIIllI) {
                            llllllllllllllllIlIIllIllIIIIlll.addSuppressed(llllllllllllllllIlIIllIllIIIIllI);
                        }
                        if (1 < -1) {
                            return;
                        }
                    }
                    throw llllllllllllllllIlIIllIllIIIIlll;
                }
            }
            if (D.lIIllIIlIlIIlI(llllllllllllllllIlIIllIllIIIlIII)) {
                llllllllllllllllIlIIllIllIIIlIII.close();
                0;
                if (null != null) {
                    return;
                }
            }
            0;
        }
        catch (IOException llllllllllllllllIlIIllIllIIIlIII) {
            throw new RuntimeException(llllllllllllllllIlIIllIllIIIlIII);
        }
        if (((8 ^ 2) & ~(0x46 ^ 0x4C)) <= -1) {
            return;
        }
    }

    private static String lIIllIIlIIIlII(String llllllllllllllllIlIIllIlIllIIlII, String llllllllllllllllIlIIllIlIllIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIllIlIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), lIlllIlIIII[11]), "DES");
            Cipher llllllllllllllllIlIIllIlIllIlIII = Cipher.getInstance("DES");
            llllllllllllllllIlIIllIlIllIlIII.init(lIlllIlIIII[4], llllllllllllllllIlIIllIlIllIlIIl);
            return new String(llllllllllllllllIlIIllIlIllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIlIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIllIlIllIIlll) {
            llllllllllllllllIlIIllIlIllIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }
}

