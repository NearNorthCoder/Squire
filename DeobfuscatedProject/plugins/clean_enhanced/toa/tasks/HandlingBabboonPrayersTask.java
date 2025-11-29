/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Handling babboon prayers")
public class HandlingBabboonPrayersTask
extends ToaManager {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var10(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean I() {
        boolean bl;
        if (N.var10((Object)this.aT.prayModeBaboons(), (Object)n.NONE)) {
            bl = var2[0];
            0;
            if (-(0xAD ^ 0xA8) >= 0) {
                return ((0x70 ^ 0x3B) & ~(0x3F ^ 0x74)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    private static void var11() {
        var1 = new String[var2[6]];
        N.var1[N.var2[1]] = "Baboon Thrower";
        N.var1[N.var2[0]] = "Baboon Mage";
        N.var1[N.var2[2]] = "Baboon Brawler";
        N.var1[N.var2[3]] = "Baboon Thrall";
        N.var1[N.var2[5]] = "Baboon";
    }

    @Override
    public boolean C() {
        boolean bl;
        if (N.var12((Object)this.aT.prayModeBaboons(), (Object)n.NONE)) {
            return var2[1];
        }
        if (N.var13(NPCs.getNearest(nPC -> nPC.getName().contains(var1[var2[5]])))) {
            bl = var2[0];
            0;
            if (3 != 3) {
                return ((0x66 ^ 0x7D) & ~(0x6C ^ 0x77)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    @Override
    public int F() {
        return var2[4];
    }

    private static boolean var14(int n2, int n3) {
        return n2 > n3;
    }

    static {
        N.var15();
        N.var11();
    }

    private static void var15() {
        var2 = new int[8];
        N.var2[0] = 1;
        N.var2[1] = (36 + 27 - -67 + 22 ^ 97 + 42 - 16 + 6) & (136 + 76 - 69 + 4 ^ 136 + 100 - 233 + 135 ^ -1);
        N.var2[2] = 2;
        N.var2[3] = 3;
        N.var2[4] = 0xFFFFBB57 & 0x7FFA;
        N.var2[5] = 0x88 ^ 0x8C;
        N.var2[6] = 0x2F ^ 0x2A;
        N.var2[7] = 0x7C ^ 0x74;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var2[1];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var2[1];
        while (N.var25(var24, var23)) {
            char var26 = var22[var24];
            var19.append((char)(var26 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (-1 <= (0xAD ^ 0xA9)) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    @Override
    public n J() {
        return this.aT.prayModeBaboons();
    }

    @Inject
    public HandlingBabboonPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    private static boolean var13(Object object) {
        return object != null;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> E() {
        Prayer var33;
        void var34;
        void var35;
        String[] stringArray = new String[var2[0]];
        stringArray[N.var2[1]] = var1[var2[1]];
        int n2 = NPCs.getAll((String[])stringArray).size();
        String[] stringArray2 = new String[var2[0]];
        stringArray2[N.var2[1]] = var1[var2[0]];
        int n3 = NPCs.getAll((String[])stringArray2).size();
        Prayer prayer = null;
        if (N.var14(n3, n2)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            0;
            
        } else if (N.var14((int)var35, (int)var34)) {
            var33 = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (3 <= 0) {
                return null;
            }
        } else {
            String[] stringArray3 = new String[var2[2]];
            stringArray3[N.var2[1]] = var1[var2[2]];
            stringArray3[N.var2[0]] = var1[var2[3]];
            NPC var36 = NPCs.getNearest((String[])stringArray3);
            if (!N.var13(var36) || N.var9(var36.distanceTo((Locatable)Players.getLocal()), var2[2])) {
                if (N.var37((int)var34)) {
                    var33 = Prayer.PROTECT_FROM_MAGIC;
                    0;
                    if (-2 > 0) {
                        return null;
                    }
                }
            } else {
                var33 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        if (N.var13(var33)) {
            N var38;
            return List.of(var38.H(), var33);
        }
        return List.of(this.H());
    }

    private static boolean var12(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var25(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var37(int n2) {
        return n2 > 0;
    }
}

