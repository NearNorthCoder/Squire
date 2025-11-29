/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Repairing mast", priority=0x7FFFFFFF, blocking=true)
public class RepairingMastTask
extends TemporossTaskBase {

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ak() {
        boolean bl;
        m var11;
        TileObject tileObject = this.ar.x();
        if (m.var12(this.ar.L() ? 1 : 0) && m.var13(tileObject) && m.var14(this.ar.t() ? 1 : 0) && !m.var15(tileObject.distanceTo((Locatable)Players.getLocal()), var2[0]) || m.var14(var11.ar.K() ? 1 : 0)) {
            bl = var2[1];
            0;
            if (-1 > (0x4E ^ 0x2F ^ (0x66 ^ 3))) {
                return ((0xAF ^ 0xBC ^ (0x36 ^ 0x1E)) & (34 + 80 - -20 + 22 ^ 63 + 68 - 60 + 96 ^ -1)) != 0;
            }
        } else {
            bl = var2[2];
        }
        return bl;
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var16;
        m var17;
        Player player = Players.getLocal();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[var2[1]];
            stringArray[m.var2[2]] = var1[var2[1]];
            if (m.var14(tileObject.hasAction(stringArray) ? 1 : 0) && m.var3(tileObject.distanceTo((Locatable)player), var2[3])) {
                n2 = var2[1];
                0;
                if (-3 >= 0) {
                    return ((0xA3 ^ 0x88) & ~(0x58 ^ 0x73)) != 0;
                }
            } else {
                n2 = var2[2];
            }
            return n2 != 0;
        });
        if (m.var4(tileObject2)) {
            return var2[2];
        }
        if (m.var14(var17.au.a((Locatable)var16) ? 1 : 0)) {
            return var17.au.b((SceneEntity)var16);
        }
        tileObject2.interact(var1[var2[2]]);
        return var2[1];
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[2];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[2];
        while (m.var3(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (-1 < ((0x69 ^ 0x28 ^ (0x69 ^ 0x22)) & (77 + 95 - 154 + 172 ^ 144 + 83 - 194 + 147 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static boolean var15(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected RepairingMastTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    private static void var28() {
        var1 = new String[var2[4]];
        m.var1[m.var2[2]] = "Repair";
        m.var1[m.var2[1]] = "Repair";
    }

    private static void var29() {
        var2 = new int[6];
        m.var2[0] = 0x51 ^ 0x54;
        m.var2[1] = 1;
        m.var2[2] = (0xF ^ 0x74 ^ (0x46 ^ 0x73)) & (0x85 ^ 0xB4 ^ 121 + 85 - 180 + 101 ^ -1);
        m.var2[3] = 0x44 ^ 0x43 ^ (0x24 ^ 0x2C);
        m.var2[4] = 2;
        m.var2[5] = 0xB9 ^ 0xB1;
    }

    static {
        m.var29();
        m.var28();
    }
}

