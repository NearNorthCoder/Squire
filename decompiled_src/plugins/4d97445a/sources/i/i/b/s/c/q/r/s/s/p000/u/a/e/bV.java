package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.shop.SquireShopBuyer;
import gg.squire.basics.shop.SquireShopConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.WorldType;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Buying shop items")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bV  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bV.class */
public class bV extends Task {
    private static /* synthetic */ String[] lIIIIIlI;
    private static /* synthetic */ int[] lIIIIIll;
    private /* synthetic */ SquireShopConfig hc;
    private /* synthetic */ boolean hd;
    private /* synthetic */ SquireShopBuyer hb;

    static {
        lllllIllI();
        lllllIlIl();
    }

    private static String lllllIlII(String lllIIlIIlIIIllI, String lllIIlIIlIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIlIIlIIlIII = Cipher.getInstance("Blowfish");
            lllIIlIIlIIlIII.init(lIIIIIll[7], secretKeySpec);
            return new String(lllIIlIIlIIlIII.doFinal(Base64.getDecoder().decode(lllIIlIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIlIIlIIIlll) {
            lllIIlIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static void lllllIlIl() {
        lIIIIIlI = new String[lIIIIIll[8]];
        lIIIIIlI[lIIIIIll[0]] = lllllIIlI("jIavkKMQvk1KXePiRQbVQ56aiNRidE1iuCw4PeZXnnY=", "TiXNm");
        lIIIIIlI[lIIIIIll[1]] = lllllIIll("DSE1BC4xPzZFLjA0cRYuOSMlDDQ/cT0KOTklOAo0eDAiRS09cSIAPzVxJQp6MDAnAHo1PicAPngwcQczLH8=", "XQQeZ");
        lIIIIIlI[lIIIIIll[7]] = lllllIIll("EiUoOC40LXg8KHo9NzorPmojNQ==", "ZJXHG");
        lIIIIIlI[lIIIIIll[9]] = lllllIIll("PANdJQlLABslTAoRGy5MDRQVOkwfDh93HwMJCncABAUbIwUECFZ3GwoKET4CDEYYNg8ASA==", "kfzWl");
        lIIIIIlI[lIIIIIll[10]] = lllllIlII("94SgKRgxFuOP2a74GqBWZg==", "lmxAY");
        lIIIIIlI[lIIIIIll[5]] = lllllIIlI("djUb34woesk=", "gXqiC");
        lIIIIIlI[lIIIIIll[2]] = lllllIIlI("b6RHrij964M=", "MrWxc");
        lIIIIIlI[lIIIIIll[11]] = lllllIIlI("pu9IzwKT9Ra4ayKMoldMgQ==", "Ilafl");
        lIIIIIlI[lIIIIIll[4]] = lllllIlII("0EccQn1X/ZNulFvngfgbJmISbz/iu/jkLEgMZbjJ8eatEipmLtZrWl6TPCSiIY6B/J/jvmTMkU8=", "apRHu");
        lIIIIIlI[lIIIIIll[12]] = lllllIIll("Qg==", "nQlHi");
        lIIIIIlI[lIIIIIll[13]] = lllllIIlI("LBjHBkze5Ug=", "muVMX");
    }

    private static void lllllIllI() {
        lIIIIIll = new int[14];
        lIIIIIll[0] = " ".length() & (" ".length() ^ (-1));
        lIIIIIll[1] = " ".length();
        lIIIIIll[2] = (102 ^ 48) ^ (44 ^ 124);
        lIIIIIll[3] = (((63 + 105) - 147) + 113) ^ (((64 + 58) - (-28)) + 7);
        lIIIIIll[4] = (30 ^ 81) ^ (67 ^ 4);
        lIIIIIll[5] = (84 ^ 83) ^ "  ".length();
        lIIIIIll[6] = 242 ^ 192;
        lIIIIIll[7] = "  ".length();
        lIIIIIll[8] = 162 ^ 169;
        lIIIIIll[9] = "   ".length();
        lIIIIIll[10] = (((69 + 123) - 108) + 75) ^ (((7 + 24) - 16) + 140);
        lIIIIIll[11] = 127 ^ 120;
        lIIIIIll[12] = (((107 + 155) - 208) + 102) ^ (((61 + 92) - 18) + 14);
        lIIIIIll[13] = (70 ^ 58) ^ (244 ^ 130);
    }

    @Inject
    public bV(SquireShopBuyer squireShopBuyer, SquireShopConfig squireShopConfig) {
        this.hb = squireShopBuyer;
        this.hc = squireShopConfig;
    }

    private static boolean llllllllI(Object obj) {
        return obj != null;
    }

    private static String lllllIIlI(String lllIIlIIllIlIll, String lllIIlIIllIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIIllIlIlI.getBytes(StandardCharsets.UTF_8)), lIIIIIll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIll[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIlIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIlIIllIIlll) {
            lllIIlIIllIIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int[] bO() {
        if (lllllIlll(this.hc.moreItemIds().trim().isEmpty() ? 1 : 0)) {
            int[] iArr = new int[lIIIIIll[1]];
            iArr[lIIIIIll[0]] = this.hc.buyItemId();
            return iArr;
        }
        String[] split = this.hc.moreItemIds().split(lIIIIIlI[lIIIIIll[12]]);
        int[] iArr2 = new int[split.length + lIIIIIll[1]];
        iArr2[lIIIIIll[0]] = this.hc.buyItemId();
        int lllIIlIlIIIIIlI = lIIIIIll[1];
        int lllIIlIlIIIIIII = split.length;
        int i2 = lIIIIIll[0];
        while (llllllIlI(i2, lllIIlIlIIIIIII)) {
            try {
                int i3 = lllIIlIlIIIIIlI;
                lllIIlIlIIIIIlI++;
                iArr2[i3] = Integer.parseInt(split[i2]);
                "".length();
                if (((1 ^ 67) & ((77 ^ 15) ^ (-1))) > ((23 ^ 40) & ((46 ^ 17) ^ (-1)))) {
                    return null;
                }
            } catch (NumberFormatException e) {
                int i4 = lllIIlIlIIIIIlI;
                lllIIlIlIIIIIlI++;
                iArr2[i4] = this.hc.buyItemId();
            }
            i2++;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return iArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v154, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v164, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v166, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v78, types: [boolean] */
    public boolean run() {
        Runnable runnable;
        int i2;
        if (lllllIlll(Inventory.isFull() ? 1 : 0)) {
            return lIIIIIll[0];
        }
        Player local = Players.getLocal();
        if (llllllIII(local)) {
            return lIIIIIll[0];
        }
        if (llllllIII(this.hb.cW())) {
            this.hb.n(local.getWorldLocation());
            String str = lIIIIIlI[lIIIIIll[0]];
            Object[] objArr = new Object[lIIIIIll[1]];
            objArr[lIIIIIll[0]] = this.hb.cW();
            Log.info(str, objArr);
        }
        if (!lllllIlll(Shop.isOpen() ? 1 : 0)) {
            if (lllllIlll(this.hd ? 1 : 0)) {
                World random = Worlds.getRandom(world -> {
                    if (lllllIlll(world.isNormal() ? 1 : 0) && lllllIlll(world.isMembers() ? 1 : 0)) {
                        ?? r0 = lIIIIIll[1];
                        "".length();
                        return "  ".length() < 0 ? ((((72 + 97) - 130) + 90) ^ (((110 + 86) - 87) + 32)) & (((74 ^ 120) ^ (23 ^ 41)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIll[0];
                });
                String str2 = lIIIIIlI[lIIIIIll[7]];
                Object[] objArr2 = new Object[lIIIIIll[1]];
                objArr2[lIIIIIll[0]] = Integer.valueOf(random.getId());
                Log.info(str2, objArr2);
                Worlds.hopTo(random);
                this.hd = lIIIIIll[0];
                return lIIIIIll[1];
            } else if (lllllllIl(Movement.shouldWalk() ? 1 : 0)) {
                return lIIIIIll[0];
            } else {
                if (llllllIIl(local.distanceTo(this.hb.cW()), lIIIIIll[8])) {
                    Log.info(lIIIIIlI[lIIIIIll[9]]);
                    if (llllllIIl(local.distanceTo(this.hb.cW()), lIIIIIll[8])) {
                        String str3 = lIIIIIlI[lIIIIIll[10]];
                        Object[] objArr3 = new Object[lIIIIIll[1]];
                        objArr3[lIIIIIll[0]] = this.hb.cW();
                        Log.info(str3, objArr3);
                        Movement.walkTo(this.hb.cW());
                        "".length();
                        return lIIIIIll[1];
                    }
                }
                NPC nearest = NPCs.getNearest(npc -> {
                    if (llllllIll(npc.getId(), this.hc.shopperId())) {
                        String str4 = lIIIIIlI[lIIIIIll[13]];
                        if (lllllIlll(npc.hasAction((v1) -> {
                            return r1.equals(v1);
                        }) ? 1 : 0)) {
                            ?? r0 = lIIIIIll[1];
                            "".length();
                            return "   ".length() <= " ".length() ? ((((193 + 152) - 134) + 10) ^ (((115 + 109) - 178) + 93)) & (((5 ^ 93) ^ (109 ^ 99)) ^ (-" ".length())) : r0;
                        }
                    }
                    return lIIIIIll[0];
                });
                if (llllllllI(nearest)) {
                    nearest.interact(lIIIIIlI[lIIIIIll[5]]);
                    return lIIIIIll[1];
                }
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llllllIll(tileObject.getId(), this.hc.shopperId())) {
                        ?? r0 = lIIIIIll[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIll[0];
                });
                if (!llllllllI(nearest2)) {
                    Log.info(lIIIIIlI[lIIIIIll[4]]);
                    return lIIIIIll[0];
                }
                String[] strArr = new String[lIIIIIll[7]];
                strArr[lIIIIIll[0]] = lIIIIIlI[lIIIIIll[2]];
                strArr[lIIIIIll[1]] = lIIIIIlI[lIIIIIll[11]];
                nearest2.interact(strArr);
                return lIIIIIll[1];
            }
        }
        if (llllllIIl(local.distanceTo(this.hb.cW()), lIIIIIll[2])) {
            Log.info(lIIIIIlI[lIIIIIll[1]]);
            this.hb.n(local.getWorldLocation());
        }
        if (lllllIlll(this.hd ? 1 : 0)) {
            Keyboard.type(lIIIIIll[3]);
            return lIIIIIll[1];
        }
        this.hd = lIIIIIll[1];
        boolean contains = Static.getClient().getWorldType().contains(WorldType.SEASONAL);
        int[] bO = bO();
        int length = bO.length;
        int i3 = lIIIIIll[0];
        while (llllllIlI(i3, length)) {
            int i4 = bO[i3];
            int stock = Shop.getStock(i4);
            if (lllllIlll(contains ? 1 : 0)) {
                this.hd = lIIIIIll[0];
                if (llllllIll(stock, lIIIIIll[1])) {
                    runnable = () -> {
                        Shop.buyOne(i4);
                    };
                    "".length();
                    if (0 != 0) {
                        return "  ".length() & ("  ".length() ^ (-1));
                    }
                } else {
                    runnable = () -> {
                        Shop.buyFive(i4);
                    };
                }
                Runnable runnable2 = runnable;
                int i5 = lIIIIIll[0];
                while (true) {
                    int i6 = i5;
                    if (llllllIll(stock, lIIIIIll[1])) {
                        i2 = lIIIIIll[4];
                        "".length();
                        if ("   ".length() <= " ".length()) {
                            return ((26 ^ 47) ^ (144 ^ 148)) & (((127 ^ 41) ^ (220 ^ 187)) ^ (-" ".length()));
                        }
                    } else {
                        i2 = lIIIIIll[5];
                    }
                    if (llllllIlI(i6, i2)) {
                        runnable2.run();
                        i5++;
                        "".length();
                        if ((-"   ".length()) > 0) {
                            return ((((10 + 105) - 48) + 80) ^ (((55 + 47) - (-75)) + 9)) & (((((7 + 29) - (-10)) + 192) ^ (((92 + 189) - 112) + 30)) ^ (-" ".length()));
                        }
                    } else {
                        "".length();
                        if ((-" ".length()) >= 0) {
                            return ((19 ^ 6) ^ (89 ^ 108)) & (((112 ^ 96) ^ (76 ^ 124)) ^ (-" ".length()));
                        }
                    }
                }
            } else if (lllllllII(stock, this.hc.itemMinStock())) {
                this.hd = lIIIIIll[0];
                int max = Math.max(lIIIIIll[1], Math.min(lIIIIIll[4], (stock - this.hc.itemMinStock()) / lIIIIIll[6]));
                int i7 = lIIIIIll[0];
                while (llllllIlI(i7, max)) {
                    Shop.buyFifty(i4);
                    i7++;
                    "".length();
                    if ((-" ".length()) > 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
            i3++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return ((((108 + 24) - 9) + 11) ^ (((102 + 98) - 132) + 99)) & (((79 ^ 99) ^ (31 ^ 18)) ^ (-" ".length()));
            }
        }
        return lIIIIIll[1];
    }

    private static boolean lllllllIl(int i2) {
        return i2 == 0;
    }

    private static boolean lllllIlll(int i2) {
        return i2 != 0;
    }

    private static String lllllIIll(String lllIIlIIlIllIll, String lllIIlIIlIllIlI) {
        String lllIIlIIlIllIll2 = new String(Base64.getDecoder().decode(lllIIlIIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllIIlIIlIllIII = lllIIlIIlIllIlI.toCharArray();
        int lllIIlIIlIlIlll = lIIIIIll[0];
        char[] charArray = lllIIlIIlIllIll2.toCharArray();
        int lllIIlIIlIlIIII = charArray.length;
        int i2 = lIIIIIll[0];
        while (llllllIlI(i2, lllIIlIIlIlIIII)) {
            sb.append((char) (charArray[i2] ^ lllIIlIIlIllIII[lllIIlIIlIlIlll % lllIIlIIlIllIII.length]));
            "".length();
            lllIIlIIlIlIlll++;
            i2++;
            "".length();
            if (" ".length() < ((183 ^ 191) & ((153 ^ 145) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllllIll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lllllllII(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean llllllIIl(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean llllllIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llllllIII(Object obj) {
        return obj == null;
    }
}
