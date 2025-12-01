package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.BoostingPotion;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Loot", priority = 2000, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.L  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/L.class */
public class L extends w {
    private static /* synthetic */ String[] lIlIlIlIlIlII;
    private static final /* synthetic */ int cr;
    private static /* synthetic */ int[] lIlIlIlIlIlIl;
    @Inject
    /* synthetic */ C0007h ch;

    private static String lIllllllIIIIIll(String llllllllllllllIllIlIlIllIIIIIIII, String llllllllllllllIllIlIlIlIllllllll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIllIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlIllllllll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIlIl[13]), "DES");
            Cipher llllllllllllllIllIlIlIllIIIIIIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIllIIIIIIlI.init(lIlIlIlIlIlIl[3], llllllllllllllIllIlIlIllIIIIIIll);
            return new String(llllllllllllllIllIlIlIllIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIllIIIIIIIl) {
            llllllllllllllIllIlIlIllIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIIllII(int i2) {
        return i2 != 0;
    }

    private static boolean lIllllllIIIlllI(int i2, int i3) {
        return i2 > i3;
    }

    private static void lIllllllIIIlIII() {
        lIlIlIlIlIlIl = new int[15];
        lIlIlIlIlIlIl[0] = ((149 ^ 163) ^ (175 ^ 164)) & (((31 ^ 56) ^ (178 ^ 168)) ^ (-" ".length()));
        lIlIlIlIlIlIl[1] = " ".length();
        lIlIlIlIlIlIl[2] = (171 ^ 152) ^ (77 ^ 116);
        lIlIlIlIlIlIl[3] = "  ".length();
        lIlIlIlIlIlIl[4] = "   ".length();
        lIlIlIlIlIlIl[5] = 8 ^ 13;
        lIlIlIlIlIlIl[6] = (-((-2518) & 7679)) & (-25089) & 32749;
        lIlIlIlIlIlIl[7] = 52 ^ 59;
        lIlIlIlIlIlIl[8] = 14 ^ 10;
        lIlIlIlIlIlIl[9] = (-28679) & 30159;
        lIlIlIlIlIlIl[10] = (146 ^ 149) ^ " ".length();
        lIlIlIlIlIlIl[11] = 156 ^ 155;
        lIlIlIlIlIlIl[12] = (-((-115) & 22907)) & (-1) & 24543;
        lIlIlIlIlIlIl[13] = 207 ^ 199;
        lIlIlIlIlIlIl[14] = (3 ^ 43) ^ (163 ^ 130);
    }

    private static boolean lIllllllIIIlIlI(int i2) {
        return i2 == 0;
    }

    private static boolean lIllllllIIIllIl(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean b(TileItem tileItem) {
        if (lIllllllIIIlIIl(tileItem)) {
            return lIlIlIlIlIlIl[0];
        }
        if (lIllllllIIIlIlI(Inventory.isFull() ? 1 : 0)) {
            c(tileItem);
            return lIlIlIlIlIlIl[1];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIlIlIlIlIlIl[1]];
            strArr[lIlIlIlIlIlIl[0]] = lIlIlIlIlIlII[lIlIlIlIlIlIl[13]];
            return item.hasAction(strArr);
        });
        return (lIllllllIIIlIll(first) && lIllllllIIIllII(a(tileItem, first) ? 1 : 0)) ? lIlIlIlIlIlIl[1] : lIlIlIlIlIlIl[0];
    }

    private static void lIllllllIIIIllI() {
        lIlIlIlIlIlII = new String[lIlIlIlIlIlIl[14]];
        lIlIlIlIlIlII[lIlIlIlIlIlIl[0]] = lIllllllIIIIIll("ryyJMQhnfNg=", "RXoaU");
        lIlIlIlIlIlII[lIlIlIlIlIlIl[1]] = lIllllllIIIIlII("IQQw", "deDEk");
        lIlIlIlIlIlII[lIlIlIlIlIlIl[3]] = lIllllllIIIIlII("MCgJFg==", "tZffd");
        lIlIlIlIlIlII[lIlIlIlIlIlIl[4]] = lIllllllIIIIlIl("jOiAXTkb17g=", "VJpsF");
        lIlIlIlIlIlII[lIlIlIlIlIlIl[8]] = lIllllllIIIIIll("RfehcfWPTMQ=", "hjDTV");
        lIlIlIlIlIlII[lIlIlIlIlIlIl[5]] = lIllllllIIIIlII("PiI7Bg==", "jCPcu");
        lIlIlIlIlIlII[lIlIlIlIlIlIl[10]] = lIllllllIIIIlIl("RfSo4DwRBD4=", "mWhFx");
        lIlIlIlIlIlII[lIlIlIlIlIlIl[11]] = lIllllllIIIIlIl("9o9Fry2GeJo=", "tLrQi");
        lIlIlIlIlIlII[lIlIlIlIlIlIl[13]] = lIllllllIIIIIll("iD1zO/1Edic=", "PYoqO");
    }

    static {
        lIllllllIIIlIII();
        lIllllllIIIIllI();
        cr = lIlIlIlIlIlIl[6];
    }

    private static boolean lIllllllIIIllll(int i2, int i3) {
        return i2 >= i3;
    }

    private void v(Item item) {
        item.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[0]]);
    }

    private Item a(List<C0010k> list, TileItem tileItem) {
        Item a = C0007h.a(list);
        if (lIllllllIIIlIll(a) && lIllllllIIIllIl(Prices.getItemPrice(a.getId()), Prices.getItemPrice(tileItem.getId()))) {
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
            return a;
        }
        return null;
    }

    private C0010k b(List<C0010k> list, TileItem tileItem) {
        return list.stream().filter(c0010k -> {
            return c0010k.M().equals(tileItem.getName());
        }).findFirst().orElse(null);
    }

    @Inject
    protected L(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static String lIllllllIIIIlIl(String llllllllllllllIllIlIlIllIIIIllIl, String llllllllllllllIllIlIlIllIIIIllII) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIllIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIllIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIlIlIlIl[3], llllllllllllllIllIlIlIllIIIlIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIllIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIllIIIIlllI) {
            llllllllllllllIllIlIlIllIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIIIIlII(String llllllllllllllIllIlIlIlIllllIIII, String llllllllllllllIllIlIlIlIlllIllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIlIlIlllIllll.toCharArray();
        int llllllllllllllIllIlIlIlIlllIllII = lIlIlIlIlIlIl[0];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllIllIlIlIlIlllIIlIl = charArray2.length;
        int i2 = lIlIlIlIlIlIl[0];
        while (lIllllllIIIllIl(i2, llllllllllllllIllIlIlIlIlllIIlIl)) {
            char llllllllllllllIllIlIlIlIllllIIIl = charArray2[i2];
            sb.append((char) (llllllllllllllIllIlIlIlIllllIIIl ^ charArray[llllllllllllllIllIlIlIlIlllIllII % charArray.length]));
            "".length();
            llllllllllllllIllIlIlIlIlllIllII++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private void a(Item item, TileItem tileItem) {
        v(item);
        c(tileItem);
    }

    private static boolean lIllllllIIlIIIl(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        if (lIllllllIIIlIll(this.cg.c(lIlIlIlIlIlIl[1]))) {
            if (lIllllllIIIlIlI(this.cg.y() ? 1 : 0) && lIllllllIIIllII(ag() ? 1 : 0)) {
                ?? r0 = lIlIlIlIlIlIl[1];
                "".length();
                return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
            }
            return lIlIlIlIlIlIl[0];
        } else if (lIllllllIIIllII(TileItems.getAll().isEmpty() ? 1 : 0)) {
            sleep(lIlIlIlIlIlIl[5]);
            return lIlIlIlIlIlIl[1];
        } else {
            TileItem tileItem = (TileItem) TileItems.getAll().stream().filter(tileItem2 -> {
                if (!lIllllllIIlIIIl(tileItem2.getId(), lIlIlIlIlIlIl[12]) || lIllllllIIIlIlI(V() ? 1 : 0)) {
                    ?? r02 = lIlIlIlIlIlIl[1];
                    "".length();
                    return "  ".length() == ((((65 + 71) - 29) + 87) ^ (((189 + 43) - 66) + 32)) ? ((((189 + 47) - 51) + 23) ^ (((101 + 106) - 79) + 31)) & (((84 ^ 73) ^ (209 ^ 131)) ^ (-" ".length())) : r02;
                }
                return lIlIlIlIlIlIl[0];
            }).max(Comparator.comparingInt(tileItem3 -> {
                return Prices.getItemPrice(tileItem3.getId()) * tileItem3.getQuantity();
            })).orElse(null);
            if (lIllllllIIIlIIl(tileItem)) {
                return lIlIlIlIlIlIl[0];
            }
            int itemPrice = Prices.getItemPrice(tileItem.getId()) * tileItem.getQuantity();
            if (lIllllllIIIllII(Inventory.isFull() ? 1 : 0) && lIllllllIIIllIl(itemPrice, lIlIlIlIlIlIl[6])) {
                if (lIllllllIIIllIl(Skills.getBoostedLevel(Skill.HITPOINTS) - Skills.getLevel(Skill.HITPOINTS), lIlIlIlIlIlIl[7])) {
                    if (lIllllllIIIlIlI(V() ? 1 : 0)) {
                    }
                    return lIlIlIlIlIlIl[0];
                }
                "".length();
                if ((-" ".length()) > 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIllllllIIIllII(Inventory.isFull() ? 1 : 0)) {
                BoostingPotion boostingPotion = null;
                BoostingPotion[] values = BoostingPotion.values();
                int length = values.length;
                int i2 = lIlIlIlIlIlIl[0];
                while (lIllllllIIIllIl(i2, length)) {
                    BoostingPotion boostingPotion2 = values[i2];
                    if (lIllllllIIIllII(Inventory.contains(item -> {
                        if (lIllllllIIIllII(item.getName().contains(lIlIlIlIlIlII[lIlIlIlIlIlIl[11]]) ? 1 : 0) && lIllllllIIIllII(item.getName().equals(boostingPotion2.getName()) ? 1 : 0)) {
                            ?? r02 = lIlIlIlIlIlIl[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                        return lIlIlIlIlIlIl[0];
                    }) ? 1 : 0)) {
                        boostingPotion = boostingPotion2;
                    }
                    i2++;
                    "".length();
                    if ("   ".length() < 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
                if (lIllllllIIIlIll(boostingPotion)) {
                    BoostingPotion boostingPotion3 = boostingPotion;
                    Skill skill = boostingPotion.getSkills()[lIlIlIlIlIlIl[0]];
                    if (lIllllllIIIllll(Skills.getLevel(skill) + ((int) (0.95d * boostingPotion.getBoostAmount(skill))), Skills.getBoostedLevel(skill))) {
                        Item first = Inventory.getFirst(item2 -> {
                            return item2.getName().startsWith(boostingPotion3.getName());
                        });
                        if (lIllllllIIIlIll(first)) {
                            first.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[8]]);
                            return lIlIlIlIlIlIl[1];
                        }
                    }
                }
            }
            return b(tileItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean a(TileItem tileItem, Item item) {
        if (lIllllllIIIlllI(this.cf.getBoostedSkillLevel(Skill.HITPOINTS) - this.cf.getRealSkillLevel(Skill.HITPOINTS), lIlIlIlIlIlIl[2])) {
            item.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[1]]);
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((((119 + 182) - 261) + 182) ^ (((140 + 140) - 143) + 11)) & (((90 ^ 0) ^ (208 ^ 192)) ^ (-" ".length()));
            }
        } else {
            item.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[3]]);
        }
        c(tileItem);
        return lIlIlIlIlIlIl[0];
    }

    private static boolean lIllllllIIlIIII(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    private boolean ag() {
        int[] iArr = new int[lIlIlIlIlIlIl[1]];
        iArr[lIlIlIlIlIlIl[0]] = lIlIlIlIlIlIl[9];
        if (!lIllllllIIIlIll(Projectiles.getNearest(iArr)) && !lIllllllIIlIIII(Inventory.getFreeSlots(), lIlIlIlIlIlIl[1])) {
            TileItem nearest = TileItems.getNearest(this::a);
            if (!lIllllllIIIlIlI(this.cg.E() ? 1 : 0) && !lIllllllIIIllII(Inventory.contains(item -> {
                String[] strArr = new String[lIlIlIlIlIlIl[1]];
                strArr[lIlIlIlIlIlIl[0]] = lIlIlIlIlIlII[lIlIlIlIlIlIl[10]];
                return item.hasAction(strArr);
            }) ? 1 : 0) && !lIllllllIIIlIIl(nearest)) {
                nearest.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[5]]);
                return lIlIlIlIlIlIl[1];
            }
            return lIlIlIlIlIlIl[0];
        }
        return lIlIlIlIlIlIl[0];
    }

    private static boolean lIllllllIIIlIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllllllIIIlIll(Object obj) {
        return obj != null;
    }

    private void c(TileItem tileItem) {
        tileItem.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[4]]);
    }
}
