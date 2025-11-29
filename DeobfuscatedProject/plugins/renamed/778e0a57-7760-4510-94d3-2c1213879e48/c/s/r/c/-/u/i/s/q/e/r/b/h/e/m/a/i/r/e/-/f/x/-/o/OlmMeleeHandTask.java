/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aR_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
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
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Olm Melee Hand -> OlmmeleehandTask */
@TaskDesc(name="Olm Melee Hand", priority=20000)
public class OlmMeleeHandTask
extends aR_Unknown {
    private static /* synthetic */ int[] lIlIIlIIlIll;
    private static /* synthetic */ String[] lIlIIlIIlIlI;
    private /* synthetic */ boolean dZ;

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aO.llIllIIIlIllII(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    private static void llIllIIIlIIllI() {
        lIlIIlIIlIlI = new String[lIlIIlIIlIll[7]];
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[0]] = aO."LEFT";
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[3]] = aO."MIDDLE";
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[4]] = aO."LEFT";
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[2]] = aO."MIDDLE";
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[1]] = aO."RIGHT";
    }

    /*
     * WARNING - void declaration
     */
    private boolean dp() {
        aO var3;
        void var7;
        List<WorldPoint> var12;
        ArrayList arrayList = new ArrayList();
        int n2 = this.ed.aA();
        if (aO.llIllIIIlIlIlI(n2, lIlIIlIIlIll[1])) {
            var12 = this.dH();
        }
        if (aO.llIllIIIlIlIlI((int)var7, lIlIIlIIlIll[4])) {
            Movement.setDestination((WorldPoint)var3.dJ());
            return lIlIIlIIlIll[3];
        }
        if (aO.llIllIIIlIlIlI((int)var7, lIlIIlIIlIll[3])) {
            if (!aO.llIllIIIlIlIll(var3.ed.az(), lIlIIlIIlIll[2]) || aO.llIllIIIlIlIlI(var3.ed.az(), lIlIIlIIlIll[4])) {
                Movement.setDestination((WorldPoint)var3.dK());
                return lIlIIlIIlIll[3];
            }
            Movement.setDestination((WorldPoint)var3.dJ());
            return lIlIIlIIlIll[3];
        }
        if (aO.llIllIIIlIlIlI((int)var7, lIlIIlIIlIll[2])) {
            if (aO.llIllIIIlIlIIl(var3.ed.am().equals(lIlIIlIIlIlI[lIlIIlIIlIll[2]]) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var3.dJ());
                return lIlIIlIIlIll[3];
            }
            var12 = var3.dQ().toWorldPointList();
        }
        String var11 = var3.k(lIlIIlIIlIll[3]);
        if (aO.llIllIIIlIlIIl(var3.dI() ? 1 : 0) && aO.llIllIIIlIlIIl(var11.equals(lIlIIlIIlIlI[lIlIIlIIlIll[1]]) ? 1 : 0)) {
            return var3.dt();
        }
        if (aO.llIllIIIlIlIII(var12.size())) {
            var12 = var3.dH();
        }
        if (aO.llIllIIIlIlIII(var12.contains(var3.bS.getWorldLocation()) ? 1 : 0)) {
            WorldPoint var10 = var12.stream().filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            Movement.setDestination((WorldPoint)var10);
            return lIlIIlIIlIll[3];
        }
        return lIlIIlIIlIll[3];
    }

    private static boolean llIllIIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIllIIIlIlIIl(int n2) {
        return n2 != 0;
    }

    static {
        aO.llIllIIIlIIlll();
        aO.llIllIIIlIIllI();
    }

    private static boolean llIllIIIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    public void db() {
        if (aO.llIllIIIlIlIIl(this.cj().isFullyEquipped() ? 1 : 0) && aO.llIllIIIlIllIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            int[] nArray = new int[lIlIIlIIlIll[4]];
            nArray[aO.lIlIIlIIlIll[0]] = lIlIIlIIlIll[5];
            nArray[aO.lIlIIlIIlIll[3]] = lIlIIlIIlIll[6];
            if (aO.llIllIIIlIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
            }
        }
    }

    @Override
    public EquipmentSetup cj() {
        return this.ea.Q();
    }

    private static boolean llIllIIIlIllIl(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    protected aO(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dZ = lIlIIlIIlIll[0];
    }

    private static void llIllIIIlIIlll() {
        lIlIIlIIlIll = new int[9];
        aO.lIlIIlIIlIll[0] = (0x47 ^ 0x41 ^ (0x41 ^ 6)) & (0x12 ^ 0x2C ^ 1 + 57 - -57 + 12 ^ -1);
        aO.lIlIIlIIlIll[1] = 0x47 ^ 0x43;
        aO.lIlIIlIIlIll[2] = 3;
        aO.lIlIIlIIlIll[3] = 1;
        aO.lIlIIlIIlIll[4] = 2;
        aO.lIlIIlIIlIll[5] = 0xFFFFDBFA & 0x7DC7;
        aO.lIlIIlIIlIll[6] = 0xFFFFFEF3 & 0x2F7D;
        aO.lIlIIlIIlIll[7] = 0x33 ^ 0xA ^ (0x26 ^ 0x1A);
        aO.lIlIIlIIlIll[8] = 65 + 63 - 88 + 91 ^ 122 + 91 - 104 + 30;
    }

    private static String llIllIIIlIIlII(String var13, String var20) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlIll[8]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIlIIlIIlIll[4], var9);
            return new String(var18.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIlIllII(Object object) {
        return object == null;
    }

    @Override
    public boolean cg() {
        aO var19;
        if (aO.llIllIIIlIlIII(this.ct() ? 1 : 0)) {
            return lIlIIlIIlIll[0];
        }
        if (aO.llIllIIIlIlIIl(var19.du() ? 1 : 0)) {
            return lIlIIlIIlIll[0];
        }
        if (aO.llIllIIIlIlIII(var19.ds() ? 1 : 0)) {
            return lIlIIlIIlIll[0];
        }
        var19.cm();
        var19.db();
        if (aO.llIllIIIlIlIII(var19.ed.aG())) {
            var19.dt();
            0;
            return lIlIIlIIlIll[0];
        }
        String var21 = var19.ed.am();
        if (aO.llIllIIIlIlIlI(var19.ed.az(), lIlIIlIIlIll[1])) {
            return var19.dt();
        }
        if (aO.llIllIIIlIlIlI(var19.ed.aA(), lIlIIlIIlIll[2])) {
            int n2;
            if (!aO.llIllIIIlIlIII(var21.equals(lIlIIlIIlIlI[lIlIIlIIlIll[0]]) ? 1 : 0) || aO.llIllIIIlIlIIl(var21.equals(lIlIIlIIlIlI[lIlIIlIIlIll[3]]) ? 1 : 0)) {
                n2 = lIlIIlIIlIll[3];
                0;
                
                }
            } else {
                var19.dZ = lIlIIlIIlIll[0];
                n2 = var19.dZ ? 1 : 0;
            }
        }
        if (aO.llIllIIIlIlIIl(var19.dZ ? 1 : 0)) {
            return var19.dp();
        }
        if (aO.llIllIIIlIlIIl(var21.equals(lIlIIlIIlIlI[lIlIIlIIlIll[4]]) ? 1 : 0) && aO.llIllIIIlIlIII(var19.bS.getWorldLocation().equals((Object)var19.dJ()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var19.dJ());
            return lIlIIlIIlIll[3];
        }
        if (aO.llIllIIIlIlIII(var19.bS.getWorldLocation().equals((Object)var19.dJ()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var19.dL());
            return lIlIIlIIlIll[3];
        }
        return lIlIIlIIlIll[0];
    }

    private static String llIllIIIlIIlIl(String var6, String var2) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var4 = var2.toCharArray();
        int var15 = lIlIIlIIlIll[0];
        char[] var1 = var6.toCharArray();
        int var16 = var1.length;
        int var17 = lIlIIlIIlIll[0];
        while (aO.llIllIIIlIlllI(var17, var16)) {
            char var5 = var1[var17];
            var14.append((char)(var5 ^ var4[var15 % var4.length]));
            0;
            ++var15;
            ++var17;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }
}

