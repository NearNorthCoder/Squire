package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

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
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.al  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/al.class */
public class C0012al {
    private static final /* synthetic */ int cT;
    private static /* synthetic */ String[] lIlIIllllllI;
    private static /* synthetic */ int[] lIlIlIIIlIll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    public static void a(ItemStack itemStack, Collection<ItemStack> collection, boolean z) {
        String discordUsername;
        String discordId;
        Color color;
        Client client = Static.getClient();
        StringBuilder sb = new StringBuilder();
        int i = lIlIlIIIlIll[0];
        int i2 = lIlIlIIIlIll[1];
        int i3 = lIlIlIIIlIll[0];
        for (ItemStack itemStack2 : collection) {
            ItemComposition itemDefinition = client.getItemDefinition(itemStack2.getId());
            int itemPrice = Prices.getItemPrice(itemDefinition.getId()) * itemStack2.getQuantity();
            if (llIlllIIIIlIlI(itemPrice, i3)) {
                i3 = itemPrice;
                i2 = itemDefinition.getId();
            }
            i += itemPrice;
            sb.append(itemStack2.getQuantity()).append(lIlIIllllllI[lIlIlIIIlIll[0]]).append(itemDefinition.getName()).append(lIlIIllllllI[lIlIlIIIlIll[2]]);
            "".length();
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        if (llIlllIIIIlIll(i, lIlIlIIIlIll[3])) {
            return;
        }
        if (llIlllIIIIllII(client.getDiscordUsername())) {
            discordUsername = lIlIIllllllI[lIlIlIIIlIll[4]];
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return;
            }
        } else {
            discordUsername = client.getDiscordUsername();
        }
        String str = discordUsername;
        if (llIlllIIIIlIIl(z ? 1 : 0)) {
            str = lIlIIllllllI[lIlIlIIIlIll[5]];
        }
        if (llIlllIIIIllII(client.getDiscordId())) {
            discordId = lIlIIllllllI[lIlIlIIIlIll[6]];
            "".length();
            if ((-(85 ^ 80)) >= 0) {
                return;
            }
        } else {
            discordId = client.getDiscordId();
        }
        String str2 = discordId;
        C0013am c0013am = new C0013am();
        c0013am.e(lIlIIllllllI[lIlIlIIIlIll[7]]);
        C0014an c0014an = new C0014an();
        if (llIlllIIIIllII(itemStack)) {
            color = Color.WHITE;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return;
            }
        } else {
            color = new Color(lIlIlIIIlIll[8], lIlIlIIIlIll[0], lIlIlIIIlIll[8]);
        }
        c0014an.a(color);
        "".length();
        String str3 = lIlIIllllllI[lIlIlIIIlIll[9]];
        Object[] objArr = new Object[lIlIlIIIlIll[2]];
        objArr[lIlIlIIIlIll[0]] = str;
        c0014an.f(String.format(str3, objArr));
        "".length();
        if (llIlllIIIIllIl(itemStack)) {
            String name = client.getItemComposition(itemStack.getId()).getName();
            Random random = new Random();
            if (llIlllIIIIlllI(random.nextInt(lIlIlIIIlIll[7]))) {
                if (llIlllIIIIlIIl(name.contains(lIlIIllllllI[lIlIlIIIlIll[10]]) ? 1 : 0)) {
                    name = lIlIIllllllI[lIlIlIIIlIll[11]];
                }
                if (llIlllIIIIlIIl(name.contains(lIlIIllllllI[lIlIlIIIlIll[12]]) ? 1 : 0)) {
                    name = lIlIIllllllI[lIlIlIIIlIll[13]];
                }
                if (llIlllIIIIlIIl(name.contains(lIlIIllllllI[lIlIlIIIlIll[14]]) ? 1 : 0)) {
                    name = lIlIIllllllI[lIlIlIIIlIll[15]];
                }
            }
            if (llIlllIIIIlllI(random.nextInt(lIlIlIIIlIll[16])) && llIlllIIIIlIIl(name.contains(lIlIIllllllI[lIlIlIIIlIll[17]]) ? 1 : 0)) {
                name = lIlIIllllllI[lIlIlIIIlIll[18]];
            }
            if (llIlllIIIIlIIl(name.contains(lIlIIllllllI[lIlIlIIIlIll[19]]) ? 1 : 0)) {
                if (llIlllIIIIlIIl(z ? 1 : 0)) {
                    String str4 = lIlIIllllllI[lIlIlIIIlIll[20]];
                    Object[] objArr2 = new Object[lIlIlIIIlIll[2]];
                    objArr2[lIlIlIIIlIll[0]] = name;
                    c0014an.g(String.format(str4, objArr2));
                    "".length();
                    "".length();
                    if (" ".length() == ((109 ^ 124) & ((83 ^ 66) ^ (-1)))) {
                        return;
                    }
                } else {
                    String str5 = lIlIIllllllI[lIlIlIIIlIll[21]];
                    Object[] objArr3 = new Object[lIlIlIIIlIll[4]];
                    objArr3[lIlIlIIIlIll[0]] = str2;
                    objArr3[lIlIlIIIlIll[2]] = name;
                    c0014an.g(String.format(str5, objArr3));
                    "".length();
                    "".length();
                    if ((-"   ".length()) > 0) {
                        return;
                    }
                }
            } else if (llIlllIIIIlIIl(name.contains(lIlIIllllllI[lIlIlIIIlIll[22]]) ? 1 : 0)) {
                if (llIlllIIIIlIIl(z ? 1 : 0)) {
                    String str6 = lIlIIllllllI[lIlIlIIIlIll[23]];
                    Object[] objArr4 = new Object[lIlIlIIIlIll[2]];
                    objArr4[lIlIlIIIlIll[0]] = name;
                    c0014an.g(String.format(str6, objArr4));
                    "".length();
                    "".length();
                    if (((true ^ true) & ((true ^ true) ^ true)) == (true ^ true)) {
                        return;
                    }
                } else {
                    String str7 = lIlIIllllllI[lIlIlIIIlIll[24]];
                    Object[] objArr5 = new Object[lIlIlIIIlIll[4]];
                    objArr5[lIlIlIIIlIll[0]] = str2;
                    objArr5[lIlIlIIIlIll[2]] = name;
                    c0014an.g(String.format(str7, objArr5));
                    "".length();
                    "".length();
                    if ((84 ^ 80) < 0) {
                        return;
                    }
                }
            } else if (llIlllIIIIlIIl(z ? 1 : 0)) {
                String str8 = lIlIIllllllI[lIlIlIIIlIll[25]];
                Object[] objArr6 = new Object[lIlIlIIIlIll[2]];
                objArr6[lIlIlIIIlIll[0]] = name;
                c0014an.g(String.format(str8, objArr6));
                "".length();
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            } else {
                String str9 = lIlIIllllllI[lIlIlIIIlIll[26]];
                Object[] objArr7 = new Object[lIlIlIIIlIll[4]];
                objArr7[lIlIlIIIlIll[0]] = str2;
                objArr7[lIlIlIIIlIll[2]] = name;
                c0014an.g(String.format(str9, objArr7));
                "".length();
            }
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        } else {
            c0014an.g(lIlIIllllllI[lIlIlIIIlIll[27]]);
            "".length();
        }
        c0014an.a(lIlIIllllllI[lIlIlIIIlIll[28]], String.valueOf(sb), (boolean) lIlIlIIIlIll[2]);
        "".length();
        c0014an.a(lIlIIllllllI[lIlIlIIIlIll[29]], QuantityFormatter.formatNumber(i), (boolean) lIlIlIIIlIll[2]);
        "".length();
        String str10 = lIlIIllllllI[lIlIlIIIlIll[30]];
        Object[] objArr8 = new Object[lIlIlIIIlIll[2]];
        objArr8[lIlIlIIIlIll[0]] = Integer.valueOf(i2);
        c0014an.i(String.format(str10, objArr8));
        "".length();
        String str11 = lIlIIllllllI[lIlIlIIIlIll[31]];
        Object[] objArr9 = new Object[lIlIlIIIlIll[2]];
        objArr9[lIlIlIIIlIll[0]] = Integer.valueOf(i2);
        c0014an.j(String.format(str11, objArr9));
        "".length();
        c0013am.a(c0014an);
        c0013am.d(lIlIIllllllI[lIlIlIIIlIll[32]]);
        try {
            Response execute = RuneLiteAPI.CLIENT.newCall(new Request.Builder().url(lIlIIllllllI[lIlIlIIIlIll[16]]).post(RequestBody.create(MediaType.parse(lIlIIllllllI[lIlIlIIIlIll[33]]), c0013am.cC().toString())).build()).execute();
            if (llIlllIIIIlllI(execute.isSuccessful() ? 1 : 0)) {
                System.out.println(execute.body().string());
                throw new IOException("Unsuccessful response: " + execute.message());
            }
            if (llIlllIIIIllIl(execute)) {
                execute.close();
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
            }
            "".length();
            if (0 != 0) {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void llIlllIIIIlIII() {
        lIlIlIIIlIll = new int[35];
        lIlIlIIIlIll[0] = (79 ^ 70) & ((100 ^ 109) ^ (-1));
        lIlIlIIIlIll[1] = -" ".length();
        lIlIlIIIlIll[2] = " ".length();
        lIlIlIIIlIll[3] = (-1616) & 751615;
        lIlIlIIIlIll[4] = "  ".length();
        lIlIlIIIlIll[5] = "   ".length();
        lIlIlIIIlIll[6] = "   ".length() ^ (125 ^ 122);
        lIlIlIIIlIll[7] = (186 ^ 129) ^ (169 ^ 151);
        lIlIlIIIlIll[8] = (((142 ^ 198) + (3 ^ 82)) - (101 ^ 17)) + (52 ^ 111);
        lIlIlIIIlIll[9] = 9 ^ 15;
        lIlIlIIIlIll[10] = 32 ^ 39;
        lIlIlIIIlIll[11] = (((87 + 118) - 69) + 3) ^ (((51 + 5) - 7) + 82);
        lIlIlIIIlIll[12] = (117 ^ 126) ^ "  ".length();
        lIlIlIIIlIll[13] = 148 ^ 158;
        lIlIlIIIlIll[14] = (5 ^ 121) ^ (106 ^ 29);
        lIlIlIIIlIll[15] = 84 ^ 88;
        lIlIlIIIlIll[16] = (78 ^ 4) ^ (71 ^ 19);
        lIlIlIIIlIll[17] = 106 ^ 103;
        lIlIlIIIlIll[18] = 178 ^ 188;
        lIlIlIIIlIll[19] = (((75 + 66) - 121) + 164) ^ (((82 + 150) - 179) + 130);
        lIlIlIIIlIll[20] = (((91 + 117) - 193) + 112) ^ (109 ^ 2);
        lIlIlIIIlIll[21] = (((153 + 5) - 45) + 76) ^ (((99 + 41) - 73) + 105);
        lIlIlIIIlIll[22] = (((94 + 55) - 126) + 114) ^ (((118 + 121) - 229) + 145);
        lIlIlIIIlIll[23] = (((109 + 157) - 245) + 161) ^ (((162 + 79) - 117) + 41);
        lIlIlIIIlIll[24] = (((43 + 82) - 25) + 61) ^ (((34 + 94) - (-9)) + 44);
        lIlIlIIIlIll[25] = 213 ^ 192;
        lIlIlIIIlIll[26] = (124 ^ 102) ^ (77 ^ 65);
        lIlIlIIIlIll[27] = (((66 + 65) - 44) + 90) ^ (((114 + 47) - 27) + 32);
        lIlIlIIIlIll[28] = 79 ^ 87;
        lIlIlIIIlIll[29] = 63 ^ 38;
        lIlIlIIIlIll[30] = (((38 + 9) - 19) + 115) ^ (((25 + 147) - 98) + 75);
        lIlIlIIIlIll[31] = (((63 + 46) - 17) + 74) ^ (((153 + 176) - 179) + 39);
        lIlIlIIIlIll[32] = (((126 + 87) - 60) + 22) ^ (((42 + 40) - 15) + 112);
        lIlIlIIIlIll[33] = (107 ^ 98) ^ (168 ^ 188);
        lIlIlIIIlIll[34] = 10 ^ 21;
    }

    private static boolean llIlllIIIIlIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlllIIIIllIl(Object obj) {
        return obj != null;
    }

    private static boolean llIlllIIIIlIll(int i, int i2) {
        return i < i2;
    }

    private static String llIllIlllIlIII(String lllllllllllllllIllIlIlIIIlIlllIl, String lllllllllllllllIllIlIlIIIlIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIIIlIllllI.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIll[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIlIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIlIIIlIllIll) {
            lllllllllllllllIllIlIlIIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static void llIllIlllIlIlI() {
        lIlIIllllllI = new String[lIlIlIIIlIll[34]];
        lIlIIllllllI[lIlIlIIIlIll[0]] = llIllIlllIIlll("NFA=", "LpUbD");
        lIlIIllllllI[lIlIlIIIlIll[2]] = llIllIlllIIlll("HT0=", "ASXnx");
        lIlIIllllllI[lIlIlIIIlIll[4]] = llIllIlllIlIII("9tCsxO/IF3o=", "rJxWt");
        lIlIIllllllI[lIlIlIIIlIll[5]] = llIllIlllIIlll("Bx1SCwQpHQsHBTMAUh8ZIwE=", "Fsrjj");
        lIlIIllllllI[lIlIlIIIlIll[6]] = llIllIlllIIlll("PSgDOyw/KA==", "HFhUC");
        lIlIIllllllI[lIlIlIIIlIll[7]] = llIllIlllIlIIl("B9IH2KkNPgb3/Gtr54Hy4A51RKNopBAS+X1NdlaGscVnigl1Q6WFroxlKcQigPzZot6x91ROoaA4PCAruYG1VSfL4rerVZrfUf6D/WTIBL4Ylil0Nig6KrMqcLOQaL6V", "FboAg");
        lIlIIllllllI[lIlIlIIIlIll[9]] = llIllIlllIlIII("adKNlIJdsrLjuMCuQLFD3Vvnyxb0OCkwbuy9S38SHes6YDB2Nyexvpz7fRvjAbMJ", "whSsn");
        lIlIIllllllI[lIlIlIIIlIll[10]] = llIllIlllIIlll("Njk6JCMS", "wKYEM");
        lIlIIllllllI[lIlIlIIIlIll[11]] = llIllIlllIlIIl("0VaHQorq0bMYdL7ZGcdHCgdsP/htC307", "JmxEw");
        lIlIIllllllI[lIlIlIIIlIll[12]] = llIllIlllIlIIl("rDw1iWePJMonSRvOV69SLw==", "abyrb");
        lIlIIllllllI[lIlIlIIIlIll[13]] = llIllIlllIlIII("Sa2nCpzcRd+BVPiJWPKKBURSgUIOKNdi", "sfHiQ");
        lIlIIllllllI[lIlIlIIIlIll[14]] = llIllIlllIlIII("y+HqiMO9Vm8=", "JIqbM");
        lIlIIllllllI[lIlIlIIIlIll[15]] = llIllIlllIlIIl("zNXEizMkwznxRagN7spizQ==", "jMqUa");
        lIlIIllllllI[lIlIlIIIlIll[17]] = llIllIlllIIlll("JiQPCiE=", "mKkkH");
        lIlIIllllllI[lIlIlIIIlIll[18]] = llIllIlllIIlll("FDchFzEaNzI=", "vBUcA");
        lIlIIllllllI[lIlIlIIIlIll[19]] = llIllIlllIlIIl("iVXnBx86/As=", "bhOLi");
        lIlIIllllllI[lIlIlIIIlIll[20]] = llIllIlllIIlll("CSEAEjwmKwAVNjluGhlzKyBOFz0lIBcbPD89TgMgLzxOEDw4bksF", "JNnvS");
        lIlIIllllllI[lIlIlIIIlIll[21]] = llIllIlllIlIII("4qzhvqJzLbf59HfnEsjWg9Pe/0GMFpm6lGC3shKW6k4=", "ExBqK");
        lIlIIllllllI[lIlIlIIIlIll[22]] = llIllIlllIIlll("GxQeDDUVFA0=", "yajxE");
        lIlIIllllllI[lIlIlIIIlIll[23]] = llIllIlllIIlll("BiMeBiYkOAUNNTElHw8nZTgfQTUrbBEPOys1HQ4hNmwFEjE3bBYOJmUjAgUxNyUeBnQxJBUIJmUuAgA6IWweBCNlaQM=", "ELpaT");
        lIlIIllllllI[lIlIlIIIlIll[24]] = llIllIlllIIlll("FC0iLiE2NjklMiMrIycgd34MbCBpYiMncy4tOTtzNTAtJzd3LCk+c3IxYGk2OSgjMHMuLTk7cyMrISxzICs4IXMjKilpJzg7bQ==", "WBLIS");
        lIlIIllllllI[lIlIlIIIlIll[25]] = llIllIlllIlIII("F03CEvdIvl5gjWwX9PVjhn/EzpXIg98rLvHTU6RamJaBDy3IBNd+AO72MiqnaLo7YHaikyG6N1g=", "HYppi");
        lIlIIllllllI[lIlIlIIIlIll[26]] = llIllIlllIlIIl("7hOWmAvNzUOylf8Xjoo3ii4NUftaavY43g60EuEF+UQKRp/RbiP18A==", "cTKaU");
        lIlIIllllllI[lIlIlIIIlIll[27]] = llIllIlllIIlll("CT8YPCsnOVY1NiEuVmd5eW9GMg==", "NZvYY");
        lIlIIllllllI[lIlIlIIIlIll[28]] = llIllIlllIlIIl("yp43KYpcyBE=", "xOFWb");
        lIlIIllllllI[lIlIlIIIlIll[29]] = llIllIlllIlIIl("FLAY8sIBHp4=", "oScRp");
        lIlIIllllllI[lIlIlIIIlIll[30]] = llIllIlllIlIII("g9hZkBXqhB/A7554q2FPz1vGC4wMN8smgu0IFUaVrjtvxlyBa3ehiluhmeWp2sr24hzeG38aEpo=", "GEqiU");
        lIlIIllllllI[lIlIlIIIlIll[31]] = llIllIlllIlIII("w0kZWg2tKErlfpyI+hfcZLYk8t3c8sOntWVoWFmXu3e0IF09XU/gdhycDv3tMLqQFS7rrHN33kI=", "MWMBX");
        lIlIIllllllI[lIlIlIIIlIll[32]] = llIllIlllIlIIl("FamuCxqxJxZ9srwXxuYFVw==", "HeYay");
        lIlIIllllllI[lIlIlIIIlIll[33]] = llIllIlllIIlll("NzU4OC01JDw9KzhqIicrOA==", "VEHTD");
        lIlIIllllllI[lIlIlIIIlIll[16]] = llIllIlllIlIII("g3IHRGlNjmd6mYp1XHOKSZt/3bRKEDnyzOjsyGYpHjUlvtgAjCLmuHZK8ht+YpHhAjl34Kbnq2jxq3S6AJ84ODacBDoPY4GUXbBM9J4s0X72QyP4wi2DKKbmTlr1PC9Vs1w/TkKOpeiPbj7JgSiK06XgcIEdeQcyCQSswGBsslU=", "TKnRK");
    }

    private static boolean llIlllIIIIlIIl(int i) {
        return i != 0;
    }

    private static String llIllIlllIIlll(String lllllllllllllllIllIlIlIIIlllIlII, String lllllllllllllllIllIlIlIIIlllIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIlIlIIIlllIIIl = lllllllllllllllIllIlIlIIIlllIIll.toCharArray();
        int lllllllllllllllIllIlIlIIIlllIIII = lIlIlIIIlIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIIlIll[0];
        while (llIlllIIIIlIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIlIlIIIlllIIIl[lllllllllllllllIllIlIlIIIlllIIII % lllllllllllllllIllIlIlIIIlllIIIl.length]));
            "".length();
            lllllllllllllllIllIlIlIIIlllIIII++;
            i++;
            "".length();
            if (" ".length() == ((((127 + 120) - 207) + 159) ^ (((13 + 117) - (-12)) + 53))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llIlllIIIIlIII();
        llIllIlllIlIlI();
        cT = lIlIlIIIlIll[3];
    }

    private static boolean llIlllIIIIlllI(int i) {
        return i == 0;
    }

    private static boolean llIlllIIIIllII(Object obj) {
        return obj == null;
    }

    private static String llIllIlllIlIIl(String lllllllllllllllIllIlIlIIIlIlIIlI, String lllllllllllllllIllIlIlIIIlIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIIlIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIlIIIlIlIIll) {
            lllllllllllllllIllIlIlIIIlIlIIll.printStackTrace();
            return null;
        }
    }
}
