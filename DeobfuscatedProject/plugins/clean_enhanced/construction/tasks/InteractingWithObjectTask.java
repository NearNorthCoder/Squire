/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Interacting with object")
public class InteractingWithObjectTask
extends Task {
    private static  int[] lIIIIIIlI;
    private  int fQ;
    private static  String[] lIIIIIIIl;
    private  int fR;
    private final  SquireQuestHelper fP;

    @Inject
    public InteractingWithObjectTask(SquireQuestHelper squireQuestHelper) {
        this.fQ = 0;
        this.fP = squireQuestHelper;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        String[] var1;
        Item var2;
        bn var3;
        if ((Dialog.isOpen( != 0) ? 1 : 0) && (this.fP.cu( == 0) ? 1 : 0) && (this.fR < 3)) {
            this.fR += 2;
            return 0;
        }
        var3.fR = 0;
        String var4 = var3.fP.cz();
        if ((var4.equals(lIIIIIIIl[0] == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 0;
        }
        TileObject var5 = var3.fP.cx();
        if var5 == null {
            Log.info((String)lIIIIIIIl[2]);
            return var3.fP.cB();
        }
        if ((bn.ellIIllllIIIllII) && (var3.fQ <= 3)) {
            if ((var3.fP.dllIIllllIIIllII)) {
                return 2;
            }
            Log.info((String)lIIIIIIIl[4]);
            var3.fQ += 2;
            return 2;
        }
        var3.fQ = 0;
        List<Integer> var6 = var3.fP.cI();
        if ((var6.isEmpty( == 0) ? 1 : 0) && (var2 = Inventory.getFirst(item -> var6.contains(item.getId( != null))))) {
            var2.useOn(var5);
            var3.sleep(5);
            return 2;
        }
        var2 = var3.cL();
        String[] var7 = var1 = var5.getActions();
        int var8 = var7.length;
        int var9 = 0;
        while (var9 < var8) {
            String var10 = var7[var9];
            if var10 == null {
                0;
                if null != null {
                    return ((0x83 ^ 0xC7) & ~(0xC3 ^ 0x87)) != 0;
                }
            } else if ((var2.testllIIllllIIIIlIl)) {
                var3.sleep(4);
                Object[] objectArray = new Object[2];
                objectArray[0] = var10;
                Log.info((String)lIIIIIIIl[6], (Object[])objectArray);
                var5.interact(var10);
                return 2;
            }
            ++var9;
            0;
            if (-1 == -1) continue;
            return ((0x4B ^ 6) & ~(0x59 ^ 0x14)) != 0;
        }
        Log.info((String)lIIIIIIIl[5]);
        var2_2.interact(Objects::nonNull);
        return 2;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private Predicate<String> cL() {
        Object object = this.fP.cy();
        List<String> list = this.fP.cD();
        return string -> {
            void var21;
            if string == null {
                return 0;
            }
            String[] var22 = var21.replaceAll(lIIIIIIIl[3], lIIIIIIIl[7]).split(lIIIIIIIl[8]);
            int var23 = var22.length;
            int var24 = 0;
            while (var24 < var23) {
                List var25;
                String var26 = var22[var24];
                if ((var25.stream( == 0).noneMatch(string2 -> string2.toLowerCase().contains(var26.toLowerCase())) ? 1 : 0)) {
                    return 0;
                }
                ++var24;
                0;
                if null == null continue;
                return ((0x4F ^ 0x7A) & ~(0x16 ^ 0x23)) != 0;
            }
            return 2;
        };
    }

    private static boolean e(TileObject tileObject) {
        int n2;
        if (!(Reachable.isInteractable(LocatabletileObject) ? 1 : 0) || (tileObject.getWorldLocation().distanceTo((Locatable)Players.getLocal()) > 1)) {
            n2 = 2;
            0;
            
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

}

