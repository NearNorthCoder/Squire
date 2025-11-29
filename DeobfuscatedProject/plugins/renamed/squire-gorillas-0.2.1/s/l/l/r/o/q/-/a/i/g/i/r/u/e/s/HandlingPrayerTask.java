/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Prayers
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Prayers;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c_Unknown;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.t_Unknown;

/* TASK: Handling Prayer -> HandlingprayerTask */
@TaskDesc(name="Handling Prayer", priority=100)
public class HandlingPrayerTask
extends Task {
    private final /* synthetic */ SquireGorillaConfig ae;
    private /* synthetic */ Prayer af;
    private final /* synthetic */ SquireGorillaPlugin ad;
    private static /* synthetic */ String[] llIIlIllIIll;
    private static /* synthetic */ int[] llIIlIllIlII;

    private static boolean lllllIllIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static /* synthetic */ boolean b(Player player, NPC nPC) {
        boolean bl;
        if (s.lllllIllIllIlI(nPC.getInteracting(), player)) {
            bl = llIIlIllIlII[0];
            0;
            if (-3 > 0) {
                return ((71 + 108 - 44 + 8 ^ 6 + 57 - -44 + 61) & (0xE ^ 0x3E ^ (0x95 ^ 0x82) ^ -1)) != 0;
            }
        } else {
            bl = llIIlIllIlII[1];
        }
        return bl;
    }

    @Inject
    public s(SquireGorillaPlugin squireGorillaPlugin, SquireGorillaConfig squireGorillaConfig) {
        this.af = Prayer.PROTECT_FROM_MAGIC;
        this.ad = squireGorillaPlugin;
        this.ae = squireGorillaConfig;
    }

    private static boolean lllllIllIllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllIllIllIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        NPC var1;
        NPC nPC2;
        void var7;
        Player player = Players.getLocal();
        NPC nPC3 = NPCs.getNearest(nPC -> {
            int n2;
            if (s.lllllIllIllIIl(nPC.getName().equals(llIIlIllIIll[llIIlIllIlII[1]]) ? 1 : 0) && s.lllllIllIllIlI(nPC.getInteracting(), player)) {
                n2 = llIIlIllIlII[0];
                0;
                if (1 >= (6 ^ 2)) {
                    return false;
                }
            } else {
                n2 = llIIlIllIlII[1];
            }
            return n2 != 0;
        });
        if (s.lllllIllIlIllI(nPC3)) {
            Prayers.flick(List.of(Prayer.PROTECT_FROM_MAGIC, Prayer.STEEL_SKIN));
            0;
            return llIIlIllIlII[0];
        }
        ArrayList lllllllllllllllIlIIlllIllllIIlll = new ArrayList();
        if (s.lllllIllIlIlll(var7.getInteracting())) {
            nPC2 = NPCs.getNearest(arg_0 -> s.b((Player)var7, arg_0));
            0;
            
            }
        } else {
            nPC2 = (NPC)var7.getInteracting();
        }
        if (s.lllllIllIlIllI(var1 = nPC2)) {
            s var10;
            c var6 = var10.ad.a(var1);
            if (s.lllllIllIlIllI(var6)) {
                ArrayList<d> var8 = new ArrayList<d>(var6.n());
                var8.remove((Object)d.BOULDER);
                0;
                if (s.lllllIllIllIII(var8.size(), llIIlIllIlII[0])) {
                    switch (t.ag[((d)((Object)var8.get(llIIlIllIlII[1]))).ordinal()]) {
                        case 1: {
                            var10.af = Prayer.PROTECT_FROM_MELEE;
                            0;
                            if (3 >= 1) break;
                            return ((0x62 ^ 0x7E ^ (0x15 ^ 0x11)) & (135 + 57 - 149 + 121 ^ 178 + 92 - 92 + 10 ^ -1)) != 0;
                        }
                        case 2: {
                            var10.af = Prayer.PROTECT_FROM_MAGIC;
                            0;
                            if (null == null) break;
                            return false;
                        }
                        case 3: {
                            var10.af = Prayer.PROTECT_FROM_MISSILES;
                        }
                    }
                    0;
                    if (2 <= 0) {
                        return ((0x81 ^ 0xBE ^ (0xC ^ 0x7C)) & (0x41 ^ 0x5F ^ (0x5D ^ 0xC) ^ -1)) != 0;
                    }
                } else {
                    var10.af = Prayer.PROTECT_FROM_MAGIC;
                }
                0;
                if (1 == 0) {
                    return ((0x24 ^ 0x4A ^ (0xDB ^ 0x8C)) & (0x2B ^ 0x14 ^ (0x17 ^ 0x11) ^ -1)) != 0;
                }
            } else {
                if (s.lllllIllIllIIl(Prayers.anyActive() ? 1 : 0)) {
                    Prayers.disableAll();
                }
                return llIIlIllIlII[0];
            }
            0;
            if (-(0x4F ^ 0x28 ^ (0xA1 ^ 0xC2)) > 0) {
                return ((53 + 89 - 103 + 104 ^ 122 + 40 - 157 + 149) & (3 ^ (0x1E ^ 8) ^ -1)) != 0;
            }
        } else {
            if (s.lllllIllIllIIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
            }
            return llIIlIllIlII[0];
        }
        var3_3.add(this.O());
        0;
        var3_3.add(this.af);
        0;
        Prayers.flick((List)var3_3);
        0;
        return llIIlIllIlII[0];
    }

    private Prayer O() {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)this.ae.ranged().selected(EquipmentSetup.class);
        if (s.lllllIllIlIllI(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            0;
            if (3 <= 0) {
                return null;
            }
        } else {
            nArray = new int[llIIlIllIlII[1]];
        }
        int[] var9 = nArray;
        Item var4 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (s.lllllIllIllIIl(IntStream.of(var9).anyMatch(n2 -> {
            boolean bl;
            if (s.lllllIllIllIII(n2, var4.getId())) {
                bl = llIIlIllIlII[0];
                0;
                if (-3 >= 0) {
                    return false;
                }
            } else {
                bl = llIIlIllIlII[1];
            }
            return bl;
        }) ? 1 : 0)) {
            s var5;
            return var5.ae.rangePrayer().C();
        }
        return this.ae.meleePrayer().C();
    }

    private static boolean lllllIllIlIlll(Object object) {
        return object == null;
    }

    private static boolean lllllIllIlIllI(Object object) {
        return object != null;
    }

    private static String lllllIllIlIIll(String var11, String var2) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llIIlIllIlII[2], var3);
            return new String(var12.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lllllIllIlIlIl() {
        llIIlIllIlII = new int[3];
        s.llIIlIllIlII[0] = 1;
        s.llIIlIllIlII[1] = (0x2A ^ 0x63) & ~(0x5A ^ 0x13);
        s.llIIlIllIlII[2] = 2;
    }

    static {
        s.lllllIllIlIlIl();
        s.lllllIllIlIlII();
    }

    private static void lllllIllIlIlII() {
        llIIlIllIIll = new String[llIIlIllIlII[0]];
        s.llIIlIllIIll[s.llIIlIllIlII[1]] = s."Tortured gorilla";
    }
}

