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
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Olm Mage Hand -> OlmmagehandTask */
@TaskDesc(name="Olm Mage Hand", priority=20000)
public class OlmMageHandTask
extends aR_Unknown {
    private static /* synthetic */ int[] lIlIIIlIllll;
    private static /* synthetic */ String[] lIlIIIlIlllI;
    private /* synthetic */ boolean dZ;

    @Override
    public boolean cg() {
        List<WorldPoint> var7;
        String var10;
        aN var11;
        if (aN.llIlIllIIllIIl(this.ct() ? 1 : 0)) {
            return lIlIIIlIllll[0];
        }
        if (aN.llIlIllIIllIIl(var11.du() ? 1 : 0)) {
            return lIlIIIlIllll[0];
        }
        var11.cm();
        var11.db();
        if (aN.llIlIllIIllIIl(var11.ed.aH())) {
            var11.dw();
            0;
            return lIlIIIlIllll[1];
        }
        System.out.println("Turn: " + var11.dI() + " | " + var11.ed.az() + " | direction: " + var11.ed.am());
        if (aN.llIlIllIIllIlI(var11.dI() ? 1 : 0)) {
            System.out.println(lIlIIIlIlllI[lIlIIIlIllll[0]]);
            var10 = var11.k(lIlIIIlIllll[0]);
            if (aN.llIlIllIIllIlI(var10.equals(lIlIIIlIlllI[lIlIIIlIllll[1]]) ? 1 : 0) && (!aN.llIlIllIIllIlI(var11.ed.at() ? 1 : 0) || aN.llIlIllIIllIll(var11.ed.aH(), var11.dU()))) {
                var7 = var11.m(var10);
                0;
                if (3 <= 2) {
                    return false;
                }
            } else {
                return var11.dw();
            }
            0;
            if ((1 & (1 ^ -1)) != 0) {
                return ((0xF9 ^ 0x94 ^ (0x8F ^ 0xC4)) & (4 + 53 - -10 + 89 ^ 35 + 116 - 91 + 126 ^ -1)) != 0;
            }
        } else {
            var7 = var11.dH();
        }
        if (aN.llIlIllIIllIIl(var7.contains(var11.bS.getWorldLocation()) ? 1 : 0)) {
            var10 = var7.stream().filter(worldPoint -> {
                int n2;
                if (aN.llIlIllIIllIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aN.llIlIllIIllIIl(this.ed.ap().contains(worldPoint) ? 1 : 0)) {
                    n2 = lIlIIIlIllll[1];
                    0;
                    if ((60 + 0 - 42 + 118 ^ 44 + 73 - 110 + 133) <= 3) {
                        return ((213 + 172 - 292 + 128 ^ 71 + 79 - 127 + 136) & (0x9C ^ 0xB4 ^ (0xAD ^ 0xC7) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIIIlIllll[0];
                }
                return n2 != 0;
            }).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            if (aN.llIlIllIIlllII(Movement.getDestination()) && aN.llIlIllIIllIlI(Movement.getDestination().equals((Object)var10) ? 1 : 0)) {
                return lIlIIIlIllll[0];
            }
            Movement.setDestination((WorldPoint)var10);
            return lIlIIIlIllll[1];
        }
        return lIlIIIlIllll[0];
    }

    private static boolean llIlIllIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIllIIlIllI(String var13, String var16) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var2 = var16.toCharArray();
        int var15 = lIlIIIlIllll[0];
        char[] var17 = var13.toCharArray();
        int var5 = var17.length;
        int var3 = lIlIIIlIllll[0];
        while (aN.llIlIllIIlllll(var3, var5)) {
            char var4 = var17[var3];
            var12.append((char)(var4 ^ var2[var15 % var2.length]));
            0;
            ++var15;
            ++var3;
            0;
            if ((0xAC ^ 0xA8) >= (0x6C ^ 0x68)) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean llIlIllIIlllII(Object object) {
        return object != null;
    }

    private static boolean llIlIllIIlllIl(Object object) {
        return object == null;
    }

    private static boolean llIlIllIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIIllIIl(int n2) {
        return n2 == 0;
    }

    private static String llIlIllIIlIlIl(String var9, String var14) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIIIlIllll[2], var8);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    static {
        aN.llIlIllIIllIII();
        aN.llIlIllIIlIlll();
    }

    @Inject
    protected aN(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dZ = lIlIIIlIllll[0];
    }

    private static boolean llIlIllIIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aN.llIlIllIIlllIl(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    private static void llIlIllIIllIII() {
        lIlIIIlIllll = new int[3];
        aN.lIlIIIlIllll[0] = (0xD1 ^ 0x95) & ~(0x54 ^ 0x10);
        aN.lIlIIIlIllll[1] = 1;
        aN.lIlIIIlIllll[2] = 2;
    }

    @Override
    public EquipmentSetup cj() {
        return this.ea.P();
    }

    private static boolean llIlIllIIllllI(Object object, Object object2) {
        return object != object2;
    }

    public void db() {
        if (aN.llIlIllIIllIlI(this.cj().isFullyEquipped() ? 1 : 0) && aN.llIlIllIIllllI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
    }

    private static void llIlIllIIlIlll() {
        lIlIIIlIlllI = new String[lIlIIIlIllll[2]];
        aN.lIlIIIlIlllI[aN.lIlIIIlIllll[0]] = aN."head will be turning";
        aN.lIlIIIlIlllI[aN.lIlIIIlIllll[1]] = aN."RIGHT";
    }
}

