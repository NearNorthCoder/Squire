/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.combat.CombatOptions
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.af;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Special Attack", priority=6, blocking=true)
public class an
extends af {
    private static /* synthetic */ int[] lllIlllIllll;
    private static final /* synthetic */ Logger ee;
    private static /* synthetic */ String[] lllIlllIlllI;

    private static boolean lIIIlllIIIIIIIl(Object object) {
        return object == null;
    }

    private int cB() {
        int n2 = this.cq().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(lllIlllIllll[1]).getIntValue(n2);
        return n3 / lllIlllIllll[9];
    }

    /*
     * WARNING - void declaration
     */
    public boolean cC() {
        boolean bl;
        double lllllllllllllllIIllIIlIIIlIlIlll;
        void lllllllllllllllIIllIIlIIIlIlllIl;
        double d2;
        double lllllllllllllllIIllIIlIIIlIllIIl;
        double lllllllllllllllIIllIIlIIIlIllIII;
        double lllllllllllllllIIllIIlIIIlIlllII;
        double d3;
        an lllllllllllllllIIllIIlIIIlIllllI;
        int n2 = CombatOptions.getSpecialAttackEnergy();
        if (an.lIIIlllIIIIIllI(n2, this.cB())) {
            return lllIlllIllll[0];
        }
        if (an.lIIIlllIIIIIIlI(lllllllllllllllIIllIIlIIIlIllllI.cM.Q(), lllIlllIllll[7])) {
            return lllIlllIllll[3];
        }
        int[] nArray = new int[lllIlllIllll[3]];
        nArray[an.lllIlllIllll[0]] = lllIlllIllll[10];
        if (an.lIIIllIllllllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            d3 = 20.0;
            0;
            if ((0x57 ^ 0x53) != (0x92 ^ 0x96)) {
                return ((0xBD ^ 0xA4) & ~(0x2F ^ 0x36)) != 0;
            }
        } else {
            d3 = lllllllllllllllIIllIIlIIIlIlllII = 10.0;
        }
        if (!an.lIIIlllIIIIIIII(lllllllllllllllIIllIIlIIIlIllllI.cM.X().isEmpty() ? 1 : 0) || an.lIIIllIllllllll(lllllllllllllllIIllIIlIIIlIllllI.cM.W().get(lllllllllllllllIIllIIlIIIlIllllI.cM.Q() - lllIlllIllll[3]).isEmpty() ? 1 : 0)) {
            switch (lllllllllllllllIIllIIlIIIlIllllI.cM.Q()) {
                case 1: 
                case 2: 
                case 3: {
                    return lllIlllIllll[3];
                }
                case 4: {
                    return lllIlllIllll[0];
                }
            }
        }
        double lllllllllllllllIIllIIlIIIlIllIll = lllllllllllllllIIllIIlIIIlIllllI.cM.X().stream().mapToDouble(Duration::toMillis).average().orElse(0.0) / 1000.0;
        double lllllllllllllllIIllIIlIIIlIllIlI = lllllllllllllllIIllIIlIIIlIllllI.cM.W().get(lllllllllllllllIIllIIlIIIlIllllI.cM.Q() - lllIlllIllll[3]).stream().mapToDouble(Duration::toMillis).average().orElse(0.0) / 1000.0;
        if (an.lIIIlllIIIIIIlI(lllllllllllllllIIllIIlIIIlIllllI.cM.Q(), lllIlllIllll[6])) {
            lllllllllllllllIIllIIlIIIlIllIII = lllllllllllllllIIllIIlIIIlIllllI.cM.W().get(lllIlllIllll[6]).stream().mapToDouble(Duration::toMillis).average().orElse(0.0) / 1000.0;
            lllllllllllllllIIllIIlIIIlIllIIl = lllllllllllllllIIllIIlIIIlIllIll - lllllllllllllllIIllIIlIIIlIllIlI - lllllllllllllllIIllIIlIIIlIllIII;
            0;
            if (null != null) {
                return ((0x33 ^ 0x45 ^ (0x25 ^ 0x30)) & (0xA7 ^ 0xB2 ^ (4 ^ 0x72) ^ -1)) != 0;
            }
        } else {
            lllllllllllllllIIllIIlIIIlIllIIl = lllllllllllllllIIllIIlIIIlIllIll - lllllllllllllllIIllIIlIIIlIllIlI;
        }
        lllllllllllllllIIllIIlIIIlIllIII = lllllllllllllllIIllIIlIIIlIllIIl / 30.0 * lllllllllllllllIIllIIlIIIlIlllII;
        if (an.lIIIlllIIIIIIlI(lllllllllllllllIIllIIlIIIlIllllI.cM.Q(), lllIlllIllll[6])) {
            d2 = 105.0;
            0;
            if (null != null) {
                return ((0x12 ^ 0) & ~(0x71 ^ 0x63)) != 0;
            }
        } else {
            d2 = 100.0;
        }
        if (an.lIIIlllIIIIIlll(an.lIIIlllIIIIIlIl(lllllllllllllllIIllIIlIIIlIllIII + (double)lllllllllllllllIIllIIlIIIlIlllIl, lllllllllllllllIIllIIlIIIlIlIlll = d2))) {
            bl = lllIlllIllll[3];
            0;
            if (1 == 0) {
                return ((0xB4 ^ 0x97) & ~(0xB7 ^ 0x94)) != 0;
            }
        } else {
            bl = lllIlllIllll[0];
        }
        return bl;
    }

    private static int lIIIlllIIIIIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static void lIIIllIllllllIl() {
        lllIlllIlllI = new String[lllIlllIllll[14]];
        an.lllIlllIlllI[an.lllIlllIllll[0]] = an."You setup your spec weapon setup with a weapon that has no spec!!!";
        an.lllIlllIlllI[an.lllIlllIllll[3]] = an."could not eat food to free up space for spec swap??";
        an.lllIlllIlllI[an.lllIlllIllll[4]] = an."unable to find a brew or food to free up to make room for swap. resorting to prayer pots or balms now...";
        an.lllIlllIlllI[an.lllIlllIllll[5]] = an."Drink";
        an.lllIlllIlllI[an.lllIlllIllll[6]] = an."UNABLE TO MAKE SPACE FOR GEAR SWAP! ERRROR ERROR!";
        an.lllIlllIlllI[an.lllIlllIllll[7]] = an."Eat";
        an.lllIlllIlllI[an.lllIlllIllll[8]] = an."Attack";
        an.lllIlllIlllI[an.lllIlllIllll[11]] = an."prayer potion";
        an.lllIlllIlllI[an.lllIlllIllll[12]] = an."balm";
        an.lllIlllIlllI[an.lllIlllIllll[13]] = an."brew";
        an.lllIlllIlllI[an.lllIlllIllll[9]] = an."Eat";
    }

    private static void lIIIllIlllllllI() {
        lllIlllIllll = new int[15];
        an.lllIlllIllll[0] = (0x1B ^ 0x32) & ~(6 ^ 0x2F);
        an.lllIlllIllll[1] = -(0xFFFFFC73 & 0x5FAD) & (0xFFFFFFBE & 0x5FEB);
        an.lllIlllIllll[2] = 0xFFFFDFB3 & 0x7EED;
        an.lllIlllIllll[3] = 1;
        an.lllIlllIllll[4] = 2;
        an.lllIlllIllll[5] = 3;
        an.lllIlllIllll[6] = 0x53 ^ 0x57;
        an.lllIlllIllll[7] = 10 + 181 - 162 + 156 ^ 75 + 52 - 119 + 180;
        an.lllIlllIllll[8] = 8 ^ 0xE;
        an.lllIlllIllll[9] = 0x1C ^ 0x16;
        an.lllIlllIllll[10] = 0xFFFFEF7F & 0x75F7;
        an.lllIlllIllll[11] = 0x23 ^ 0x24;
        an.lllIlllIllll[12] = 16 + 0 - -46 + 86 ^ 16 + 26 - -50 + 64;
        an.lllIlllIllll[13] = 0x27 ^ 0x2E;
        an.lllIlllIllll[14] = 0x3D ^ 0x75 ^ (0xE ^ 0x4D);
    }

    private static boolean lIIIlllIIIIIlll(int n2) {
        return n2 >= 0;
    }

    @Inject
    public an(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2, e2);
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.specGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIIlllIIIIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIllllllll(int n2) {
        return n2 != 0;
    }

    private static String lIIIllIlllllIlI(String lllllllllllllllIIllIIlIIIIllIlII, String lllllllllllllllIIllIIlIIIIlllIII) {
        lllllllllllllllIIllIIlIIIIllIlII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIIIIllIlll = new StringBuilder();
        char[] lllllllllllllllIIllIIlIIIIllIllI = lllllllllllllllIIllIIlIIIIlllIII.toCharArray();
        int lllllllllllllllIIllIIlIIIIllIlIl = lllIlllIllll[0];
        char[] lllllllllllllllIIllIIlIIIIlIllll = lllllllllllllllIIllIIlIIIIllIlII.toCharArray();
        int lllllllllllllllIIllIIlIIIIlIlllI = lllllllllllllllIIllIIlIIIIlIllll.length;
        int lllllllllllllllIIllIIlIIIIlIllIl = lllIlllIllll[0];
        while (an.lIIIlllIIIIIllI(lllllllllllllllIIllIIlIIIIlIllIl, lllllllllllllllIIllIIlIIIIlIlllI)) {
            char lllllllllllllllIIllIIlIIIIlllIlI = lllllllllllllllIIllIIlIIIIlIllll[lllllllllllllllIIllIIlIIIIlIllIl];
            lllllllllllllllIIllIIlIIIIllIlll.append((char)(lllllllllllllllIIllIIlIIIIlllIlI ^ lllllllllllllllIIllIIlIIIIllIllI[lllllllllllllllIIllIIlIIIIllIlIl % lllllllllllllllIIllIIlIIIIllIllI.length]));
            0;
            ++lllllllllllllllIIllIIlIIIIllIlIl;
            ++lllllllllllllllIIllIIlIIIIlIllIl;
            0;
            if ((0x94 ^ 0x91) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlIIIIllIlll);
    }

    @Override
    public boolean cr() {
        an lllllllllllllllIIllIIlIIIlllIIIl;
        if (an.lIIIllIllllllll(this.cK.assistantMode() ? 1 : 0)) {
            return lllIlllIllll[0];
        }
        if (an.lIIIlllIIIIIIII(lllllllllllllllIIllIIlIIIlllIIIl.cs() ? 1 : 0)) {
            return lllIlllIllll[0];
        }
        if (an.lIIIllIllllllll(SquireNightmarePlugin.D.contains(lllllllllllllllIIllIIlIIIlllIIIl.cS.getId()) ? 1 : 0)) {
            int lllllllllllllllIIllIIlIIIlllIIII = lllllllllllllllIIllIIlIIIlllIIIl.cq().get(EquipmentInventorySlot.WEAPON);
            int lllllllllllllllIIllIIlIIIllIllll = Arrays.stream(Static.getClient().getEnum(lllIlllIllll[1]).getKeys()).anyMatch(n3 -> {
                boolean bl;
                if (an.lIIIlllIIIIIIlI(n3, lllllllllllllllIIllIIlIIIlllIIII)) {
                    bl = lllIlllIllll[3];
                    0;
                    if (((78 + 83 - 40 + 41 ^ 87 + 38 - 37 + 102) & (0x1A ^ 0x30 ^ (0xB4 ^ 0x82) ^ -1)) < 0) {
                        return ((0x35 ^ 0x3F ^ (0x73 ^ 0x56)) & (0x11 ^ 3 ^ (0x37 ^ 0xA) ^ -1)) != 0;
                    }
                } else {
                    bl = lllIlllIllll[0];
                }
                return bl;
            }) ? 1 : 0;
            if (an.lIIIlllIIIIIIII(lllllllllllllllIIllIIlIIIllIllll)) {
                Log.warn((String)lllIlllIlllI[lllIlllIllll[0]]);
                return lllIlllIllll[0];
            }
            if (an.lIIIlllIIIIIIIl(Players.getLocal().getInteracting()) && an.lIIIlllIIIIIIlI(lllllllllllllllIIllIIlIIIlllIIII, lllIlllIllll[2])) {
                return lllIlllIllll[0];
            }
            if (an.lIIIlllIIIIIIII(lllllllllllllllIIllIIlIIIlllIIIl.cC() ? 1 : 0)) {
                return lllIlllIllll[0];
            }
            if (an.lIIIllIllllllll(lllllllllllllllIIllIIlIIIlllIIIl.cu() ? 1 : 0)) {
                return lllllllllllllllIIllIIlIIIlllIIIl.cA();
            }
        }
        return lllIlllIllll[0];
    }

    /*
     * WARNING - void declaration
     */
    private boolean cA() {
        an lllllllllllllllIIllIIlIIIllIlIlI;
        if (an.lIIIllIllllllll(Inventory.isFull() ? 1 : 0) && an.lIIIlllIIIIIIll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && an.lIIIlllIIIIIlII(this.cq().get(EquipmentInventorySlot.SHIELD))) {
            void lllllllllllllllIIllIIlIIIllIlIIl;
            Item item2 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lllIlllIllll[3]];
                stringArray[an.lllIlllIllll[0]] = lllIlllIlllI[lllIlllIllll[9]];
                return item.hasAction(stringArray);
            });
            if (an.lIIIlllIIIIIIIl(item2)) {
                ee.info(lllIlllIlllI[lllIlllIllll[3]]);
                Item item3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIlllIlllI[lllIlllIllll[13]]));
                if (an.lIIIlllIIIIIIll(item3)) {
                    item3.drop();
                    return lllIlllIllll[3];
                }
                Log.warn((String)lllIlllIlllI[lllIlllIllll[4]]);
                Item lllllllllllllllIIllIIlIIIllIIlll = Inventory.getFirst(item -> {
                    boolean bl;
                    if (!an.lIIIlllIIIIIIII(item.getName().toLowerCase().contains(lllIlllIlllI[lllIlllIllll[11]]) ? 1 : 0) || an.lIIIllIllllllll(item.getName().toLowerCase().contains(lllIlllIlllI[lllIlllIllll[12]]) ? 1 : 0)) {
                        bl = lllIlllIllll[3];
                        0;
                        if (2 <= ((0x41 ^ 0x5E) & ~(0x8A ^ 0x95))) {
                            return ((0x3E ^ 0x63) & ~(0 ^ 0x5D)) != 0;
                        }
                    } else {
                        bl = lllIlllIllll[0];
                    }
                    return bl;
                });
                if (an.lIIIlllIIIIIIll(lllllllllllllllIIllIIlIIIllIIlll)) {
                    lllllllllllllllIIllIIlIIIllIIlll.interact(lllIlllIlllI[lllIlllIllll[5]]);
                    lllllllllllllllIIllIIlIIIllIIlll.drop();
                    return lllIlllIllll[3];
                }
                Log.error((String)lllIlllIlllI[lllIlllIllll[6]]);
                return lllIlllIllll[0];
            }
            lllllllllllllllIIllIIlIIIllIlIIl.interact(lllIlllIlllI[lllIlllIllll[7]]);
            return lllIlllIllll[3];
        }
        if (an.lIIIlllIIIIIIII(lllllllllllllllIIllIIlIIIllIlIlI.cq().isEquipped() ? 1 : 0)) {
            lllllllllllllllIIllIIlIIIllIlIlI.cq().swap();
        }
        if (an.lIIIlllIIIIIIII(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            Combat.toggleSpec();
        }
        this.cS.interact(lllIlllIlllI[lllIlllIllll[8]]);
        return lllIlllIllll[3];
    }

    private static boolean lIIIlllIIIIIlII(int n2) {
        return n2 <= 0;
    }

    private static String lIIIllIlllllIll(String lllllllllllllllIIllIIlIIIlIIlIIl, String lllllllllllllllIIllIIlIIIlIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIIIlIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), lllIlllIllll[12]), "DES");
            Cipher lllllllllllllllIIllIIlIIIlIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIIIlIIlIll.init(lllIlllIllll[4], lllllllllllllllIIllIIlIIIlIIllII);
            return new String(lllllllllllllllIIllIIlIIIlIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIIIlIIlIlI) {
            lllllllllllllllIIllIIlIIIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIIIIll(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        an.lIIIllIlllllllI();
        an.lIIIllIllllllIl();
        ee = LoggerFactory.getLogger(an.class);
    }

    private static String lIIIllIllllllII(String lllllllllllllllIIllIIlIIIIlIIIlI, String lllllllllllllllIIllIIlIIIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIIIIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIIIIlIIllI.init(lllIlllIllll[4], lllllllllllllllIIllIIlIIIIlIIlll);
            return new String(lllllllllllllllIIllIIlIIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIIIIlIIlIl) {
            lllllllllllllllIIllIIlIIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIIIIlI(int n2, int n3) {
        return n2 == n3;
    }
}

