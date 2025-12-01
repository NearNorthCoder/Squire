package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Selling drops (Restocking)", priority = 14674, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.T  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/T.class */
public class T extends S {
    private static /* synthetic */ int[] llllIlIlIlII;
    private static /* synthetic */ String[] llllIlIlIIIl;

    private static boolean lIIlIIIIlllllII(int i) {
        return i != 0;
    }

    @Inject
    protected T(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v39, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.S
    public boolean ci() {
        if (!lIIlIIIIllllIll(this.cW.D() ? 1 : 0) && !lIIlIIIIlllllII(this.cW.C() ? 1 : 0)) {
            if (lIIlIIIIllllIll(ds.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return llllIlIlIlII[0];
            }
            if (lIIlIIIIlllllII(Bank.isOpen() ? 1 : 0) && lIIlIIIIllllIll(cl() ? 1 : 0) && lIIlIIIIlllllII(cm() ? 1 : 0)) {
                Log.info(llllIlIlIIIl[llllIlIlIlII[0]]);
                String str = llllIlIlIIIl[llllIlIlIlII[1]];
                Object[] objArr = new Object[llllIlIlIlII[2]];
                objArr[llllIlIlIlII[0]] = Boolean.valueOf(cl());
                objArr[llllIlIlIlII[1]] = Boolean.valueOf(cm());
                Log.info(str, objArr);
                this.cW.f((boolean) llllIlIlIlII[0]);
                this.cW.e((boolean) llllIlIlIlII[1]);
                return llllIlIlIlII[1];
            } else if (lIIlIIIIllllIll(GrandExchange.isOpen() ? 1 : 0)) {
                GrandExchange.open();
                return llllIlIlIlII[1];
            } else if (lIIlIIIIlllllII(GrandExchange.canCollect() ? 1 : 0)) {
                Log.info(llllIlIlIIIl[llllIlIlIlII[2]]);
                GrandExchange.collect();
                return llllIlIlIlII[1];
            } else {
                Item first = Inventory.getFirst(item -> {
                    int i;
                    List<Integer> list = dt;
                    int id = item.getId();
                    if (lIIlIIIIlllllII(item.isNoted() ? 1 : 0)) {
                        i = llllIlIlIlII[1];
                        "".length();
                        if ((1 ^ 5) > (133 ^ 129)) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        i = llllIlIlIlII[0];
                    }
                    return list.contains(Integer.valueOf(id - i));
                });
                if (lIIlIIIIlllllIl(first)) {
                    Log.info(llllIlIlIIIl[llllIlIlIlII[3]]);
                    if (!lIIlIIIIlllllII(cm() ? 1 : 0) || !lIIlIIIIlllllII(GrandExchange.isEmpty() ? 1 : 0)) {
                        Log.info(llllIlIlIIIl[llllIlIlIlII[5]]);
                        return llllIlIlIlII[0];
                    }
                    Log.info(llllIlIlIIIl[llllIlIlIlII[4]]);
                    this.cW.f((boolean) llllIlIlIlII[0]);
                    this.cW.e((boolean) llllIlIlIlII[1]);
                    return llllIlIlIlII[1];
                }
                if (lIIlIIIIllllIll(GrandExchange.isSelling() ? 1 : 0)) {
                    Log.info("[SellDrops]: Selling " + first.getName() + " for " + Prices.getItemPrice(first.getId()) + " GP");
                    int[] iArr = new int[llllIlIlIlII[1]];
                    iArr[llllIlIlIlII[0]] = first.getId();
                    GrandExchange.sell(iArr);
                    "".length();
                    if (0 != 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    int itemPrice = (int) (Prices.getItemPrice(first.getId()) * 0.8d);
                    Log.info("[SellDrops]: Setting price to " + itemPrice + " GP");
                    GrandExchange.setPrice(itemPrice);
                    GrandExchange.confirm();
                }
                return llllIlIlIlII[1];
            }
        }
        return llllIlIlIlII[0];
    }

    private static void lIIlIIIIllllIlI() {
        llllIlIlIlII = new int[8];
        llllIlIlIlII[0] = (139 ^ 163) & ((132 ^ 172) ^ (-1));
        llllIlIlIlII[1] = " ".length();
        llllIlIlIlII[2] = "  ".length();
        llllIlIlIlII[3] = "   ".length();
        llllIlIlIlII[4] = (((35 + 79) - 72) + 133) ^ (((125 + 143) - 214) + 117);
        llllIlIlIlII[5] = 30 ^ 27;
        llllIlIlIlII[6] = 3 ^ 5;
        llllIlIlIlII[7] = (200 ^ 195) ^ "   ".length();
    }

    private static String lIIlIIIIllIlIll(String lllllllllllllllIIlIllIIllIIlIIII, String lllllllllllllllIIlIllIIllIIIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIIllIIIllll.toCharArray();
        int lllllllllllllllIIlIllIIllIIIllII = llllIlIlIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIlIlIlII[0];
        while (lIIlIIIIllllllI(i, length)) {
            char lllllllllllllllIIlIllIIllIIlIIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIllIIllIIlIIIl ^ charArray[lllllllllllllllIIlIllIIllIIIllII % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIIllIIIllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIlIIIIllllIlI();
        lIIlIIIIlllIIlI();
    }

    private static void lIIlIIIIlllIIlI() {
        llllIlIlIIIl = new String[llllIlIlIlII[6]];
        llllIlIlIIIl[llllIlIlIlII[0]] = lIIlIIIIllIlIll("Ijw0OSU9HT4lOiRVcRsmWRw0OSUYDT0waRAbNDg6WQY/dSsYATp1JgtPODs/HAElOjsAQ3E4Jg8GPzJpFgF/", "yoQUI");
        llllIlIlIIIl[llllIlIlIlII[1]] = lIIlIIIIllIllIl("M+20hGQI6EwHSN3VpTegzykRQL9tcWwFnSFmtHcvyT2CaQj9FJARkpYUFeaZlMv8Ukn+1Uxf8R8=", "HfhtU");
        llllIlIlIIIl[llllIlIlIlII[2]] = lIIlIIIIllIllIl("QDvAnGHA/cPKy7pzONdjzQyKrQoUQKI6z1vEvzuJt1hkW+vq1Z52Bg==", "Hfolv");
        llllIlIlIIIl[llllIlIlIlII[3]] = lIIlIIIIllIlIll("EiofHj0NCxUCIhRDWjEwJxcVBnEvEBQWcSgXA1I4PRwXAXE9FloBNCUVVA==", "IyzrQ");
        llllIlIlIIIl[llllIlIlIlII[4]] = lIIlIIIIllIllIl("17snQpXbaCX8jrRNMSd6RY6Oc0nS8n3OPtyco+tm8a3+rhqAan+qJ2Gn3hR1gfZoKtvID9tn7nSvK/DoPYU0j5NkJSalHilV", "LsaDY");
        llllIlIlIIIl[llllIlIlIlII[5]] = lIIlIIIIlllIIIl("6zMyzg9dig236DC3lzhMMCDNh9uyDda9HzY5Otm82Cw0FqZbWMptpTWlOawoXWbJn/4+1nSNh2UufYZwur9gBicASqMkFtds", "RPnSG");
    }

    private static boolean lIIlIIIIllllllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIIIllIllIl(String lllllllllllllllIIlIllIIllIlIIIII, String lllllllllllllllIIlIllIIllIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIllIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIlIlII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIllIlIIIIl) {
            lllllllllllllllIIlIllIIllIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIlllIIIl(String lllllllllllllllIIlIllIIllIlIllIl, String lllllllllllllllIIlIllIIllIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIllIlIllII.getBytes(StandardCharsets.UTF_8)), llllIlIlIlII[7]), "DES");
            Cipher lllllllllllllllIIlIllIIllIlIllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIllIlIllll.init(llllIlIlIlII[2], secretKeySpec);
            return new String(lllllllllllllllIIlIllIIllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIllIlIlllI) {
            lllllllllllllllIIlIllIIllIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlllllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIIllllIll(int i) {
        return i == 0;
    }
}
