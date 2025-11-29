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
        D.lIlllIIlIll[D.lIlllIlIIII[0]] = D.lIIllIIIlllllI("xVUVns1EZ3g=", "cudDG");
        D.lIlllIIlIll[D.lIlllIlIIII[2]] = D.lIIllIIIllllll("DSQ=", "QJTNT");
        D.lIlllIIlIll[D.lIlllIlIIII[4]] = D.lIIllIIIlllllI("zGZBwEOBjU8=", "YQigs");
        D.lIlllIIlIll[D.lIlllIlIIII[5]] = D.lIIllIIIlllllI("k6cXME8CgSf04pqyuq3ee/lz4z7m+GKO", "NGiRY");
        D.lIlllIIlIll[D.lIlllIlIIII[6]] = D.lIIllIIIllllll("FwgsIz8VCA==", "bfGMP");
        D.lIlllIIlIll[D.lIlllIlIIII[7]] = D.lIIllIIlIIIlII("QO+4iwbOHIdsEDjtBUcmJ6YG+NNKa7tGP6xVIa036HfFFjK5tiF2zNJqxK1Sx9zcMripGp08B3bjGn2WCkjmkh+D3dVcOz/uluo+LGKcdlnAveCvW0iAzFN4E5cnNHQp", "IoGXP");
        D.lIlllIIlIll[D.lIlllIlIIII[9]] = D.lIIllIIIllllll("aThsFQ44az8dDClrIB0OOGsqAA4haxgdDC44bB0HbAohExIvPjhT", "LKLra");
        D.lIlllIIlIll[D.lIlllIlIIII[10]] = D.lIIllIIlIIIlII("AJr59q+1/ehavKV4oo9f8wOCXstPZliFRz0+seQfixUHKzgH4q9GwwHnPokEAjzLUsx0eRWxv08=", "AmTud");
        D.lIlllIIlIll[D.lIlllIlIIII[11]] = D.lIIllIIIllllll("JiYbETkEPQAaKhEgGhg4RXU1UzhbaRoYaxwmAARrQDo=", "eIuvK");
        D.lIlllIIlIll[D.lIlllIlIIII[12]] = D.lIIllIIIlllllI("jQleWNiNfrUEzpRPEWhoZKKfGtly1kTc", "puOcJ");
        D.lIlllIIlIll[D.lIlllIlIIII[13]] = D.lIIllIIlIIIlII("dvt249+23Vvs18wCYkpMqw==", "mvaof");
        D.lIlllIIlIll[D.lIlllIlIIII[14]] = D.lIIllIIIllllll("DyIBMg==", "CMnFr");
        D.lIlllIIlIll[D.lIlllIlIIII[15]] = D.lIIllIIIllllll("GBQPGDQ=", "NucmQ");
        D.lIlllIIlIll[D.lIlllIlIIII[16]] = D.lIIllIIIllllll("HyIcFQFNeUcWBhYiAQZcBSMGAB4eIg1LHBIiRwYTFD4NShsDMwVKGxQ5BkpXE3gYCxU=", "wVher");
        D.lIlllIIlIll[D.lIlllIlIIII[17]] = D.lIIllIIIllllll("GgMuPxRIWHU8ExMDMyxJAAI0KgsbAz9hCRcDdSwGER8/YA4GEjdgDhEYNGBCFlkqIQA=", "rwZOg");
        D.lIlllIIlIll[D.lIlllIlIIII[18]] = D.lIIllIIlIIIlII("qGVsAADldrdaQRW/0BT7SA==", "Lnoij");
        D.lIlllIIlIll[D.lIlllIlIIII[19]] = D.lIIllIIIllllll("FSc5JxsXNj0iHRp4IzgdGg==", "tWIKr");
        D.lIlllIIlIll[D.lIlllIlIIII[20]] = D.lIIllIIIlllllI("LirvOShI8hWZJFw2oWw+DR10IS7a1ORBSDipXvxT/P5ibhax9LskuYwhs5fhsv1qfanYj7Sp8sRclS45SGOHbe2SOJjp+0vx4OHIgRBiqSBH/IXIlaFuBqy+NkrTVJdOEfROp+wCtzRy6NhW1lMYqZYVNnD7cEN7OgtKzL0biuY=", "EGrfa");
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
            "".length();
            ++llllllllllllllllIlIIllIlIlllIlll;
            ++llllllllllllllllIlIIllIlIllIllll;
            "".length();
            if ("  ".length() >= 0) continue;
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
        D.lIlllIlIIII[0] = (126 + 81 - 151 + 104 ^ 66 + 104 - 136 + 108) & (0x39 ^ 0x67 ^ (0x63 ^ 0x13) ^ -" ".length());
        D.lIlllIlIIII[1] = -" ".length();
        D.lIlllIlIIII[2] = " ".length();
        D.lIlllIlIIII[3] = -(0xFFFFDF77 & 0x3DBF) & (0xFFFFFF77 & 0xF5FFE);
        D.lIlllIlIIII[4] = "  ".length();
        D.lIlllIlIIII[5] = "   ".length();
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
            "".length();
            "".length();
            if (null == null) continue;
            return;
        }
        if (D.lIIllIIlIlIIII((int)llllllllllllllllIlIIllIllIIlIIlI, lIlllIlIIII[3])) {
            return;
        }
        if (D.lIIllIIlIlIIIl(llllllllllllllllIlIIllIllIIlIlII.getDiscordUsername())) {
            object = lIlllIIlIll[lIlllIlIIII[4]];
            "".length();
            if (((179 + 6 - 129 + 130 ^ 1 + 71 - -9 + 53) & (7 + 127 - 98 + 154 ^ 102 + 100 - 181 + 109 ^ -" ".length())) != ((5 + 121 - 92 + 161 ^ 25 + 136 - 128 + 112) & (8 ^ 0x7E ^ (0x60 ^ 0x44) ^ -" ".length()))) {
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
            "".length();
            if (-" ".length() >= "  ".length()) {
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
            "".length();
            if (null != null) {
                return;
            }
        } else {
            color = new Color(lIlllIlIIII[8], lIlllIlIIII[0], lIlllIlIIII[8]);
        }
        llllllllllllllllIlIIllIllIIIllII.a(color);
        "".length();
        Object[] objectArray = new Object[lIlllIlIIII[2]];
        objectArray[D.lIlllIlIIII[0]] = llllllllllllllllIlIIllIllIIIllll;
        llllllllllllllllIlIIllIllIIIllII.d(String.format(lIlllIIlIll[lIlllIlIIII[9]], objectArray));
        "".length();
        if (D.lIIllIIlIlIIlI(llllllllllllllllIlIIllIllIIllIII)) {
            llllllllllllllllIlIIllIllIIIlIll = llllllllllllllllIlIIllIllIIlIlII.getItemComposition(llllllllllllllllIlIIllIllIIllIII.getId());
            if (D.lIIllIIlIIlllI((int)llllllllllllllllIlIIllIllIIlIlIl)) {
                Object[] objectArray2 = new Object[lIlllIlIIII[2]];
                objectArray2[D.lIlllIlIIII[0]] = llllllllllllllllIlIIllIllIIIlIll.getName();
                llllllllllllllllIlIIllIllIIIllII.e(String.format(lIlllIIlIll[lIlllIlIIII[10]], objectArray2));
                "".length();
                "".length();
                if ((77 + 114 - 68 + 22 ^ 39 + 3 - -7 + 100) == 0) {
                    return;
                }
            } else {
                Object[] objectArray3 = new Object[lIlllIlIIII[4]];
                objectArray3[D.lIlllIlIIII[0]] = llllllllllllllllIlIIllIllIIIlllI;
                objectArray3[D.lIlllIlIIII[2]] = llllllllllllllllIlIIllIllIIIlIll.getName();
                llllllllllllllllIlIIllIllIIIllII.e(String.format(lIlllIIlIll[lIlllIlIIII[11]], objectArray3));
                "".length();
            }
            "".length();
            if (" ".length() == (0x6B ^ 0x6F)) {
                return;
            }
        } else {
            llllllllllllllllIlIIllIllIIIllII.e(lIlllIIlIll[lIlllIlIIII[12]]);
            "".length();
        }
        llllllllllllllllIlIIllIllIIIllII.a(lIlllIIlIll[lIlllIlIIII[13]], (String)llllllllllllllllIlIIllIllIIlIllI, lIlllIlIIII[2]);
        "".length();
        llllllllllllllllIlIIllIllIIIllII.a(lIlllIIlIll[lIlllIlIIII[14]], String.valueOf(llllllllllllllllIlIIllIllIIlIIll), lIlllIlIIII[2]);
        "".length();
        llllllllllllllllIlIIllIllIIIllII.a(lIlllIIlIll[lIlllIlIIII[15]], QuantityFormatter.formatNumber((long)((long)llllllllllllllllIlIIllIllIIlIIlI)), lIlllIlIIII[2]);
        "".length();
        Object[] objectArray4 = new Object[lIlllIlIIII[2]];
        objectArray4[D.lIlllIlIIII[0]] = llllllllllllllllIlIIllIllIIlIIIl;
        llllllllllllllllIlIIllIllIIIllII.g(String.format(lIlllIIlIll[lIlllIlIIII[16]], objectArray4));
        "".length();
        Object[] objectArray5 = new Object[lIlllIlIIII[2]];
        objectArray5[D.lIlllIlIIII[0]] = llllllllllllllllIlIIllIllIIlIIIl;
        llllllllllllllllIlIIllIllIIIllII.h(String.format(lIlllIIlIll[lIlllIlIIII[17]], objectArray5));
        "".length();
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
                            "".length();
                        }
                        catch (Throwable llllllllllllllllIlIIllIllIIIIllI) {
                            llllllllllllllllIlIIllIllIIIIlll.addSuppressed(llllllllllllllllIlIIllIllIIIIllI);
                        }
                        if (" ".length() < -" ".length()) {
                            return;
                        }
                    }
                    throw llllllllllllllllIlIIllIllIIIIlll;
                }
            }
            if (D.lIIllIIlIlIIlI(llllllllllllllllIlIIllIllIIIlIII)) {
                llllllllllllllllIlIIllIllIIIlIII.close();
                "".length();
                if (null != null) {
                    return;
                }
            }
            "".length();
        }
        catch (IOException llllllllllllllllIlIIllIllIIIlIII) {
            throw new RuntimeException(llllllllllllllllIlIIllIllIIIlIII);
        }
        if (((8 ^ 2) & ~(0x46 ^ 0x4C)) <= -" ".length()) {
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

