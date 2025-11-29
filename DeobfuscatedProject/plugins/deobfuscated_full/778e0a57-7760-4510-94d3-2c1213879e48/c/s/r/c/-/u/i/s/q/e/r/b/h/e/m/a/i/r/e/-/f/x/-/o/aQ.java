/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.api.combat.CombatOptions
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aR;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s;
import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

/* TASK: Olm Melee Spec -> OlmmeleespecTask */
@TaskDesc(name="Olm Melee Spec", priority=20001, blocking=true)
public class aQ
extends aR {
    private static /* synthetic */ String[] lIlIIIlIIlIl;
    private static /* synthetic */ int[] lIlIIIlIIllI;

    @Inject
    protected aQ(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIlIlIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIlllllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean dp() {
        aQ var5;
        void var19;
        List<WorldPoint> var21;
        ArrayList arrayList = new ArrayList();
        int n2 = this.ed.aA();
        if (aQ.llIlIlIlllllll(n2, lIlIIIlIIllI[5])) {
            var21 = this.dH();
        }
        if (aQ.llIlIlIlllllll((int)var19, lIlIIIlIIllI[6])) {
            Movement.setDestination((WorldPoint)var5.dJ());
            return lIlIIIlIIllI[4];
        }
        if (aQ.llIlIlIlllllll((int)var19, lIlIIIlIIllI[4])) {
            if (aQ.llIlIlIlllllll(var5.ed.az(), lIlIIIlIIllI[7])) {
                Movement.setDestination((WorldPoint)var5.dK());
                return lIlIIIlIIllI[4];
            }
            Movement.setDestination((WorldPoint)var5.dJ());
            return lIlIIIlIIllI[4];
        }
        if (aQ.llIlIlIlllllll((int)var19, lIlIIIlIIllI[7])) {
            var21 = var5.dQ().toWorldPointList();
        }
        String var11 = var5.k(lIlIIIlIIllI[4]);
        if (aQ.llIlIllIIIIIII(var5.dI() ? 1 : 0) && aQ.llIlIllIIIIIII(var11.equals(lIlIIIlIIlIl[lIlIIIlIIllI[4]]) ? 1 : 0)) {
            return var5.dt();
        }
        if (aQ.llIlIlIllllIll(var21.size())) {
            var21 = var5.dH();
        }
        if (aQ.llIlIlIllllIll(var21.contains(var5.bS.getWorldLocation()) ? 1 : 0)) {
            WorldPoint var16 = var21.stream().filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            Movement.setDestination((WorldPoint)var16);
            return lIlIIIlIIllI[4];
        }
        return lIlIIIlIIllI[4];
    }

    private static boolean llIlIllIIIIIII(int n2) {
        return n2 != 0;
    }

    private static void llIlIlIllllIIl() {
        lIlIIIlIIlIl = new String[lIlIIIlIIllI[6]];
        aQ.lIlIIIlIIlIl[aQ.lIlIIIlIIllI[0]] = aQ."You setup your spec weapon setup with a weapon that has no spec!!!";
        aQ.lIlIIIlIIlIl[aQ.lIlIIIlIIllI[4]] = aQ."RIGHT";
    }

    static {
        aQ.llIlIlIllllIlI();
        aQ.llIlIlIllllIIl();
    }

    private static void llIlIlIllllIlI() {
        lIlIIIlIIllI = new int[9];
        aQ.lIlIIIlIIllI[0] = (0x85 ^ 0x89) & ~(0xA8 ^ 0xA4);
        aQ.lIlIIIlIIllI[1] = -(0xFFFFF34C & 0x3EB7) & (0xFFFFBFF7 & 0x73FF);
        aQ.lIlIIIlIIllI[2] = -1;
        aQ.lIlIIIlIIllI[3] = -(0xFFFFEDCF & 0x7A76) & (0xFFFFEFFF & 0x7BCF);
        aQ.lIlIIIlIIllI[4] = 1;
        aQ.lIlIIIlIIllI[5] = 123 + 120 - 129 + 77 ^ 18 + 100 - 81 + 150;
        aQ.lIlIIIlIIllI[6] = 2;
        aQ.lIlIIIlIIllI[7] = 3;
        aQ.lIlIIIlIIllI[8] = 124 + 11 - 108 + 102 ^ 4 + 105 - 75 + 103;
    }

    private static String llIlIlIlllIlll(String var22, String var3) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var6 = var3.toCharArray();
        int var15 = lIlIIIlIIllI[0];
        char[] var7 = var22.toCharArray();
        int var18 = var7.length;
        int var24 = lIlIIIlIIllI[0];
        while (aQ.llIlIlIlllllII(var24, var18)) {
            char var9 = var7[var24];
            var2.append((char)(var9 ^ var6[var15 % var6.length]));
            0;
            ++var15;
            ++var24;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static String llIlIlIllllIII(String var17, String var1) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIllI[8]), "DES");
            Cipher var23 = Cipher.getInstance("DES");
            var23.init(lIlIIIlIIllI[6], var10);
            return new String(var23.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aQ.llIlIlIllllllI(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    private static boolean llIlIlIllllIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean cg() {
        aQ var14;
        if (aQ.llIlIlIllllIll(this.ds() ? 1 : 0)) {
            return lIlIIIlIIllI[0];
        }
        if (aQ.llIlIlIlllllII(var14.ed.aG(), lIlIIIlIIllI[1]) && aQ.llIlIlIlllllIl(var14.ed.aG(), lIlIIIlIIllI[2])) {
            return lIlIIIlIIllI[0];
        }
        Item var8 = s.aY();
        if (aQ.llIlIlIllllllI(var8)) {
            return lIlIIIlIIllI[0];
        }
        EquipmentSetup var4 = var14.ea.R();
        int var20 = var4.get(EquipmentInventorySlot.WEAPON);
        int var13 = Arrays.stream(Static.getClient().getEnum(lIlIIIlIIllI[3]).getKeys()).anyMatch(n3 -> {
            boolean bl2;
            if (aQ.llIlIlIlllllll(n3, var20)) {
                bl2 = lIlIIIlIIllI[4];
                0;
                if ((0xA8 ^ 0xAC) != (0x22 ^ 0x26)) {
                    return false;
                }
            } else {
                bl2 = lIlIIIlIIllI[0];
            }
            return bl2;
        }) ? 1 : 0;
        if (aQ.llIlIlIllllIll(var13)) {
            Log.warn((String)lIlIIIlIIlIl[lIlIIIlIIllI[0]]);
            return lIlIIIlIIllI[0];
        }
        if (aQ.llIlIlIllllIll(var14.ct() ? 1 : 0)) {
            return lIlIIIlIIllI[0];
        }
        if (aQ.llIlIlIllllIll(var14.dv() ? 1 : 0)) {
            return lIlIIIlIIllI[0];
        }
        if (aQ.llIlIlIllllIll(var4.isEquipped() ? 1 : 0)) {
            var4.swap();
        }
        if (aQ.llIlIlIllllIll(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            Combat.toggleSpec();
        }
        if (aQ.llIlIlIllllIll(var14.dT().contains((Locatable)var14.bS) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var14.dL());
            return lIlIIIlIIllI[4];
        }
        this.dt();
        0;
        return lIlIIIlIIllI[4];
    }

    private static boolean llIlIlIllllllI(Object object) {
        return object == null;
    }

    private static boolean llIlIlIlllllIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public EquipmentSetup cj() {
        return this.ea.R();
    }
}

