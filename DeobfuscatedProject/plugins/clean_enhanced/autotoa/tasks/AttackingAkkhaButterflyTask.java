/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum4;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Akkha (Butterfly)")
public class AttackingAkkhaButterflyTask
extends AutotoaManager {
    
    private  int dr;

    private static boolean var3(int n2, int n3) {
        return n2 > n3;
    }

    static {
        ay.var4();
        ay.var5();
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = var1[0];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = var1[0];
        while (ay.var7(var16, var15)) {
            char var17 = var14[var16];
            var11.append((char)(var17 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void var4() {
        var1 = new int[3];
        ay.var1[0] = (0xD ^ 2 ^ (0x6E ^ 0x34)) & (0x58 ^ 0x57 ^ (0x7F ^ 0x25) ^ -1);
        ay.var1[1] = 1;
        ay.var1[2] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        NPC llllllllllllllllIlIlIIllIlllllll2;
        WorldPoint var18;
        o var19;
        ay var20;
        if (ay.var6(this.bu() ? 1 : 0)) {
            return var1[0];
        }
        if (ay.var21(Players.getLocal().isMoving() ? 1 : 0)) {
            var20.bp();
        }
        if (ay.var22((Object)(var19 = var20.bv()))) {
            return var1[0];
        }
        WorldPoint var23 = null;
        int llllllllllllllllIlIlIIllIlllllll2 = var1[0];
        while (ay.var7(llllllllllllllllIlIlIIllIlllllll2, var19.M().size())) {
            var18 = var20.a(var19.M().get(llllllllllllllllIlIlIIllIlllllll2));
            if (ay.var21(var18.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var23 = var20.a(var19.M().get((llllllllllllllllIlIlIIllIlllllll2 + var1[1]) % var19.M().size()));
                0;
                if null == null break;
                return ((0xD7 ^ 0x8B) & ~(0x70 ^ 0x2C)) != 0;
            }
            ++llllllllllllllllIlIlIIllIlllllll2;
            0;
            if ((0xF7 ^ 0xBC ^ (0x48 ^ 7)) == (44 + 59 - 44 + 91 ^ 37 + 22 - 29 + 116)) continue;
            return ((0x25 ^ 0x5D ^ (0x5D ^ 4)) & (0xE2 ^ 0x90 ^ (0x55 ^ 6) ^ -1)) != 0;
        }
        if (ay.var6(var20.g(llllllllllllllllIlIlIIllIlllllll2 = var20.J()) ? 1 : 0)) {
            var18 = var20.bx().a(var20.cu);
            String[] stringArray = new String[var1[1]];
            stringArray[ay.var1[0]] = var2[var1[0]];
            llllllllllllllllIlIlIIllIlllllll2 = NPCs.getNearest((WorldPoint)var18, (String[])stringArray);
        }
        if (ay.var22(llllllllllllllllIlIlIIllIlllllll2)) {
            return var1[0];
        }
        var18 = Players.getLocal().getWorldLocation();
        NPC var24 = var19.N().iterator();
        while (ay.var21(var24.hasNext() ? 1 : 0)) {
            Point var25 = var24.next();
            if (ay.var21(var18.equals((Object)var20.a(var25)) ? 1 : 0)) {
                llllllllllllllllIlIlIIllIlllllll2.interact(var2[var1[1]]);
            }
            0;
            if ((89 + 130 - 89 + 1 ^ 112 + 111 - 201 + 113) != -1) continue;
            return ((0xA4 ^ 0x82 ^ (0x44 ^ 0x20)) & (110 + 78 - 142 + 82 ^ 187 + 118 - 186 + 75 ^ -1)) != 0;
        }
        if (ay.var22(var23) && ay.var6(Players.getLocal().isMoving() ? 1 : 0)) {
            var20.g(var20.a(var19.M().get(var1[0])));
            return var1[1];
        }
        var24 = var20.J();
        if (ay.var3(var24.getWorldArea().distanceTo((Locatable)Players.getLocal()), var1[2])) {
            return var1[0];
        }
        if (ay.var22(var23)) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return var1[1];
    }

    private static void var5() {
        var2 = new String[var1[2]];
        ay.var2[ay.var1[0]] = "Akkha's Shadow";
        ay.var2[ay.var1[1]] = "Attack";
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static boolean var22(Object object) {
        return object == null;
    }

    private static boolean var21(int n2) {
        return n2 != 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        if (ay.var6(this.g(this.J()) ? 1 : 0)) {
            return this.cW.shadowAttackStyle();
        }
        return super.br();
    }

    @Inject
    protected AttackingAkkhaButterflyTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.dr = var1[0];
    }
}

