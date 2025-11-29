/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.BoostingPotion
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.h;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.k;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.BoostingPotion;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Loot", priority=2000, blocking=true)
public class L
extends w {
    private static /* synthetic */ String[] lIlIlIlIlIlII;
    private static final /* synthetic */ int cr;
    private static /* synthetic */ int[] lIlIlIlIlIlIl;
    @Inject
    /* synthetic */ h ch;

    private static String lIllllllIIIIIll(String llllllllllllllIllIlIlIllIIIIIIII, String llllllllllllllIllIlIlIlIllllllIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIllIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlIllllllIl.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIlIl[13]), "DES");
            Cipher llllllllllllllIllIlIlIllIIIIIIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIllIIIIIIlI.init(lIlIlIlIlIlIl[3], llllllllllllllIllIlIlIllIIIIIIll);
            return new String(llllllllllllllIllIlIlIllIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIllIIIIIIIl) {
            llllllllllllllIllIlIlIllIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllllIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllllllIIIlIII() {
        lIlIlIlIlIlIl = new int[15];
        L.lIlIlIlIlIlIl[0] = (0x95 ^ 0xA3 ^ (0xAF ^ 0xA4)) & (0x1F ^ 0x38 ^ (0xB2 ^ 0xA8) ^ -" ".length());
        L.lIlIlIlIlIlIl[1] = " ".length();
        L.lIlIlIlIlIlIl[2] = 0xAB ^ 0x98 ^ (0x4D ^ 0x74);
        L.lIlIlIlIlIlIl[3] = "  ".length();
        L.lIlIlIlIlIlIl[4] = "   ".length();
        L.lIlIlIlIlIlIl[5] = 8 ^ 0xD;
        L.lIlIlIlIlIlIl[6] = -(0xFFFFF62A & 0x1DFF) & (0xFFFF9DFF & 0x7FED);
        L.lIlIlIlIlIlIl[7] = 0x34 ^ 0x3B;
        L.lIlIlIlIlIlIl[8] = 0xE ^ 0xA;
        L.lIlIlIlIlIlIl[9] = 0xFFFF8FF9 & 0x75CF;
        L.lIlIlIlIlIlIl[10] = 0x92 ^ 0x95 ^ " ".length();
        L.lIlIlIlIlIlIl[11] = 0x9C ^ 0x9B;
        L.lIlIlIlIlIlIl[12] = -(0xFFFFFF8D & 0x597B) & (0xFFFFFFFF & 0x5FDF);
        L.lIlIlIlIlIlIl[13] = 0xCF ^ 0xC7;
        L.lIlIlIlIlIlIl[14] = 3 ^ 0x2B ^ (0xA3 ^ 0x82);
    }

    private static boolean lIllllllIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(TileItem tileItem) {
        void llllllllllllllIllIlIlIllIlIIIlII;
        L llllllllllllllIllIlIlIllIlIIIlIl;
        if (L.lIllllllIIIlIIl(tileItem)) {
            return lIlIlIlIlIlIl[0];
        }
        if (L.lIllllllIIIlIlI(Inventory.isFull() ? 1 : 0)) {
            llllllllllllllIllIlIlIllIlIIIlIl.c((TileItem)llllllllllllllIllIlIlIllIlIIIlII);
            return lIlIlIlIlIlIl[1];
        }
        Item llllllllllllllIllIlIlIllIlIIIIll = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlIlIlIlIl[1]];
            stringArray[L.lIlIlIlIlIlIl[0]] = lIlIlIlIlIlII[lIlIlIlIlIlIl[13]];
            return item.hasAction(stringArray);
        });
        if (L.lIllllllIIIlIll(llllllllllllllIllIlIlIllIlIIIIll) && L.lIllllllIIIllII(llllllllllllllIllIlIlIllIlIIIlIl.a((TileItem)llllllllllllllIllIlIlIllIlIIIlII, llllllllllllllIllIlIlIllIlIIIIll) ? 1 : 0)) {
            return lIlIlIlIlIlIl[1];
        }
        return lIlIlIlIlIlIl[0];
    }

    private static void lIllllllIIIIllI() {
        lIlIlIlIlIlII = new String[lIlIlIlIlIlIl[14]];
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[0]] = L.lIllllllIIIIIll("ryyJMQhnfNg=", "RXoaU");
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[1]] = L.lIllllllIIIIlII("IQQw", "deDEk");
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[3]] = L.lIllllllIIIIlII("MCgJFg==", "tZffd");
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[4]] = L.lIllllllIIIIlIl("jOiAXTkb17g=", "VJpsF");
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[8]] = L.lIllllllIIIIIll("RfehcfWPTMQ=", "hjDTV");
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[5]] = L.lIllllllIIIIlII("PiI7Bg==", "jCPcu");
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[10]] = L.lIllllllIIIIlIl("RfSo4DwRBD4=", "mWhFx");
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[11]] = L.lIllllllIIIIlIl("9o9Fry2GeJo=", "tLrQi");
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[13]] = L.lIllllllIIIIIll("iD1zO/1Edic=", "PYoqO");
    }

    static {
        L.lIllllllIIIlIII();
        L.lIllllllIIIIllI();
        cr = lIlIlIlIlIlIl[6];
    }

    private static boolean lIllllllIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private void v(Item item) {
        item.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[0]]);
    }

    private Item a(List<k> list, TileItem tileItem) {
        Item item;
        Item item2 = h.a(list);
        if (L.lIllllllIIIlIll(item2) && L.lIllllllIIIllIl(Prices.getItemPrice((int)item2.getId()), Prices.getItemPrice((int)tileItem.getId()))) {
            item = item2;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        } else {
            item = null;
        }
        return item;
    }

    private k b(List<k> list, TileItem tileItem) {
        return list.stream().filter(k2 -> k2.M().equals(tileItem.getName())).findFirst().orElse(null);
    }

    @Inject
    protected L(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static String lIllllllIIIIlIl(String llllllllllllllIllIlIlIllIIIIllIl, String llllllllllllllIllIlIlIllIIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIllIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIllIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIllIIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIllIIIIllll.init(lIlIlIlIlIlIl[3], llllllllllllllIllIlIlIllIIIlIIII);
            return new String(llllllllllllllIllIlIlIllIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIllIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIllIIIIlllI) {
            llllllllllllllIllIlIlIllIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIIIIlII(String llllllllllllllIllIlIlIlIllllIIII, String llllllllllllllIllIlIlIlIlllIllll) {
        llllllllllllllIllIlIlIlIllllIIII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIlIlllIlllI = new StringBuilder();
        char[] llllllllllllllIllIlIlIlIlllIllIl = llllllllllllllIllIlIlIlIlllIllll.toCharArray();
        int llllllllllllllIllIlIlIlIlllIllII = lIlIlIlIlIlIl[0];
        char[] llllllllllllllIllIlIlIlIlllIIllI = llllllllllllllIllIlIlIlIllllIIII.toCharArray();
        int llllllllllllllIllIlIlIlIlllIIlIl = llllllllllllllIllIlIlIlIlllIIllI.length;
        int llllllllllllllIllIlIlIlIlllIIlII = lIlIlIlIlIlIl[0];
        while (L.lIllllllIIIllIl(llllllllllllllIllIlIlIlIlllIIlII, llllllllllllllIllIlIlIlIlllIIlIl)) {
            char llllllllllllllIllIlIlIlIllllIIIl = llllllllllllllIllIlIlIlIlllIIllI[llllllllllllllIllIlIlIlIlllIIlII];
            llllllllllllllIllIlIlIlIlllIlllI.append((char)(llllllllllllllIllIlIlIlIllllIIIl ^ llllllllllllllIllIlIlIlIlllIllIl[llllllllllllllIllIlIlIlIlllIllII % llllllllllllllIllIlIlIlIlllIllIl.length]));
            "".length();
            ++llllllllllllllIllIlIlIlIlllIllII;
            ++llllllllllllllIllIlIlIlIlllIIlII;
            "".length();
            if (((0x1A ^ 0x11) & ~(0xA6 ^ 0xAD)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIlIlllIlllI);
    }

    private void a(Item item, TileItem tileItem) {
        this.v(item);
        this.c(tileItem);
    }

    private static boolean lIllllllIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var3_3;
        L llllllllllllllIllIlIlIllIIlIlIlI;
        NPC nPC = this.cg.c(lIlIlIlIlIlIl[1]);
        if (L.lIllllllIIIlIll(nPC)) {
            int n2;
            if (L.lIllllllIIIlIlI(this.cg.y() ? 1 : 0) && L.lIllllllIIIllII(this.ag() ? 1 : 0)) {
                n2 = lIlIlIlIlIlIl[1];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return ((0x7A ^ 0x68) & ~(0x8A ^ 0x98) & ~((0xB1 ^ 0xAA) & ~(0x61 ^ 0x7A))) != 0;
                }
            } else {
                n2 = lIlIlIlIlIlIl[0];
            }
            return n2 != 0;
        }
        List llllllllllllllIllIlIlIllIIlIlIII = TileItems.getAll();
        if (L.lIllllllIIIllII(llllllllllllllIllIlIlIllIIlIlIII.isEmpty() ? 1 : 0)) {
            llllllllllllllIllIlIlIllIIlIlIlI.sleep(lIlIlIlIlIlIl[5]);
            return lIlIlIlIlIlIl[1];
        }
        TileItem llllllllllllllIllIlIlIllIIlIIlll = TileItems.getAll().stream().filter(tileItem -> {
            boolean bl;
            if (!L.lIllllllIIlIIIl(tileItem.getId(), lIlIlIlIlIlIl[12]) || L.lIllllllIIIlIlI(this.V() ? 1 : 0)) {
                bl = lIlIlIlIlIlIl[1];
                "".length();
                if ("  ".length() == (65 + 71 - 29 + 87 ^ 189 + 43 - 66 + 32)) {
                    return ((189 + 47 - 51 + 23 ^ 101 + 106 - 79 + 31) & (0x54 ^ 0x49 ^ (0xD1 ^ 0x83) ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlIlIlIlIlIl[0];
            }
            return bl;
        }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity())).orElse(null);
        if (L.lIllllllIIIlIIl(llllllllllllllIllIlIlIllIIlIIlll)) {
            return lIlIlIlIlIlIl[0];
        }
        int llllllllllllllIllIlIlIllIIlIIllI = Prices.getItemPrice((int)llllllllllllllIllIlIlIllIIlIIlll.getId()) * llllllllllllllIllIlIlIllIIlIIlll.getQuantity();
        if (L.lIllllllIIIllII(Inventory.isFull() ? 1 : 0) && L.lIllllllIIIllIl(llllllllllllllIllIlIlIllIIlIIllI, lIlIlIlIlIlIl[6])) {
            int llllllllllllllIllIlIlIllIIlIIlIl = Skills.getBoostedLevel((Skill)Skill.HITPOINTS) - Skills.getLevel((Skill)Skill.HITPOINTS);
            if (L.lIllllllIIIllIl(llllllllllllllIllIlIlIllIIlIIlIl, lIlIlIlIlIlIl[7])) {
                if (L.lIllllllIIIlIlI(llllllllllllllIllIlIlIllIIlIlIlI.V() ? 1 : 0)) {
                    // empty if block
                }
                return lIlIlIlIlIlIl[0];
            }
            "".length();
            if (-" ".length() > 0) {
                return ((0xBC ^ 0xB5) & ~(0x10 ^ 0x19)) != 0;
            }
        } else if (L.lIllllllIIIllII(Inventory.isFull() ? 1 : 0)) {
            BoostingPotion llllllllllllllIllIlIlIllIIlIIIIl;
            BoostingPotion llllllllllllllIllIlIlIllIIlIIlIl = null;
            BoostingPotion[] llllllllllllllIllIlIlIllIIlIIlII = BoostingPotion.values();
            int llllllllllllllIllIlIlIllIIlIIIll2 = llllllllllllllIllIlIlIllIIlIIlII.length;
            int llllllllllllllIllIlIlIllIIlIIIlI = lIlIlIlIlIlIl[0];
            while (L.lIllllllIIIllIl(llllllllllllllIllIlIlIllIIlIIIlI, llllllllllllllIllIlIlIllIIlIIIll2)) {
                llllllllllllllIllIlIlIllIIlIIIIl = llllllllllllllIllIlIlIllIIlIIlII[llllllllllllllIllIlIlIllIIlIIIlI];
                if (L.lIllllllIIIllII(Inventory.contains(item -> {
                    int n2;
                    if (L.lIllllllIIIllII(item.getName().contains(lIlIlIlIlIlII[lIlIlIlIlIlIl[11]]) ? 1 : 0) && L.lIllllllIIIllII(item.getName().equals(llllllllllllllIllIlIlIllIIlIIIIl.getName()) ? 1 : 0)) {
                        n2 = lIlIlIlIlIlIl[1];
                        "".length();
                        if (((0x38 ^ 0x26) & ~(0x43 ^ 0x5D)) != 0) {
                            return ((0x1C ^ 0x27) & ~(0x21 ^ 0x1A)) != 0;
                        }
                    } else {
                        n2 = lIlIlIlIlIlIl[0];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    llllllllllllllIllIlIlIllIIlIIlIl = llllllllllllllIllIlIlIllIIlIIIIl;
                }
                ++llllllllllllllIllIlIlIllIIlIIIlI;
                "".length();
                if ("   ".length() >= 0) continue;
                return ((0xFA ^ 0xA5) & ~(0x14 ^ 0x4B)) != 0;
            }
            if (L.lIllllllIIIlIll(llllllllllllllIllIlIlIllIIlIIlIl)) {
                llllllllllllllIllIlIlIllIIlIIlII = llllllllllllllIllIlIlIllIIlIIlIl;
                Skill llllllllllllllIllIlIlIllIIlIIIll2 = llllllllllllllIllIlIlIllIIlIIlIl.getSkills()[lIlIlIlIlIlIl[0]];
                llllllllllllllIllIlIlIllIIlIIIlI = (int)(0.95 * (double)llllllllllllllIllIlIlIllIIlIIlIl.getBoostAmount(llllllllllllllIllIlIlIllIIlIIIll2));
                if (L.lIllllllIIIllll(Skills.getLevel((Skill)llllllllllllllIllIlIlIllIIlIIIll2) + llllllllllllllIllIlIlIllIIlIIIlI, Skills.getBoostedLevel((Skill)llllllllllllllIllIlIlIllIIlIIIll2)) && L.lIllllllIIIlIll(llllllllllllllIllIlIlIllIIlIIIIl = Inventory.getFirst(arg_0 -> L.a((BoostingPotion)llllllllllllllIllIlIlIllIIlIIlII, arg_0)))) {
                    llllllllllllllIllIlIlIllIIlIIIIl.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[8]]);
                    return lIlIlIlIlIlIl[1];
                }
            }
        }
        return this.b((TileItem)var3_3);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(TileItem tileItem, Item item) {
        int n2 = this.cf.getBoostedSkillLevel(Skill.HITPOINTS) - this.cf.getRealSkillLevel(Skill.HITPOINTS);
        if (L.lIllllllIIIlllI(n2, lIlIlIlIlIlIl[2])) {
            item.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[1]]);
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((119 + 182 - 261 + 182 ^ 140 + 140 - 143 + 11) & (0x5A ^ 0 ^ (0xD0 ^ 0xC0) ^ -" ".length())) != 0;
            }
        } else {
            void llllllllllllllIllIlIlIllIIllIllI;
            llllllllllllllIllIlIlIllIIllIllI.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[3]]);
        }
        this.c(tileItem);
        return lIlIlIlIlIlIl[0];
    }

    private static boolean lIllllllIIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean ag() {
        void var1_1;
        L llllllllllllllIllIlIlIllIIIllllI;
        int[] nArray = new int[lIlIlIlIlIlIl[1]];
        nArray[L.lIlIlIlIlIlIl[0]] = lIlIlIlIlIlIl[9];
        if (L.lIllllllIIIlIll(Projectiles.getNearest((int[])nArray))) {
            return lIlIlIlIlIlIl[0];
        }
        if (L.lIllllllIIlIIII(Inventory.getFreeSlots(), lIlIlIlIlIlIl[1])) {
            return lIlIlIlIlIlIl[0];
        }
        TileItem llllllllllllllIllIlIlIllIIIlllIl = TileItems.getNearest(llllllllllllllIllIlIlIllIIIllllI::a);
        if (L.lIllllllIIIlIlI(llllllllllllllIllIlIlIllIIIllllI.cg.E() ? 1 : 0)) {
            return lIlIlIlIlIlIl[0];
        }
        if (L.lIllllllIIIllII(Inventory.contains(item -> {
            String[] stringArray = new String[lIlIlIlIlIlIl[1]];
            stringArray[L.lIlIlIlIlIlIl[0]] = lIlIlIlIlIlII[lIlIlIlIlIlIl[10]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            return lIlIlIlIlIlIl[0];
        }
        if (L.lIllllllIIIlIIl(llllllllllllllIllIlIlIllIIIlllIl)) {
            return lIlIlIlIlIlIl[0];
        }
        var1_1.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[5]]);
        return lIlIlIlIlIlIl[1];
    }

    private static boolean lIllllllIIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIllllllIIIlIll(Object object) {
        return object != null;
    }

    private static /* synthetic */ boolean a(BoostingPotion boostingPotion, Item item) {
        return item.getName().startsWith(boostingPotion.getName());
    }

    private void c(TileItem tileItem) {
        tileItem.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[4]]);
    }
}

