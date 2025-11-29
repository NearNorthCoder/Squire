/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Teleporting out", priority=20, blocking=true)
public class TeleportingOutTask
extends Task {
    private static  String[] llIIIlIll;
    private final  a cP;
    private static  int[] llIIIllII;

    private static void var1() {
        llIIIlIll = new String[llIIIllII[10]];
        ak.llIIIlIll[ak.llIIIllII[1]] = "teleport";
        ak.llIIIlIll[ak.llIIIllII[0]] = "Prayer";
        ak.llIIIlIll[ak.llIIIllII[8]] = "Super rest";
        ak.llIIIlIll[ak.llIIIllII[9]] = "Eat";
    }

    private static boolean var2(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        ak.var3();
        ak.var1();
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static void var3() {
        llIIIllII = new int[12];
        ak.llIIIllII[0] = 1;
        ak.llIIIllII[1] = (0x16 ^ 0x49 ^ (0x63 ^ 0x6E)) & (0 ^ 0xA ^ (0xFB ^ 0xA3) ^ -1);
        ak.llIIIllII[2] = 0xFFFFE3CD & 0x3E3B;
        ak.llIIIllII[3] = 0xFFFF97FF & 0x6F26;
        ak.llIIIllII[4] = -(0xFFFFCE4F & 0x79BF) & (0xFFFFFEFF & 0x6FAF);
        ak.llIIIllII[5] = 0xE ^ 0xB ^ (1 ^ 0x1C);
        ak.llIIIllII[6] = 137 + 70 - 80 + 34 ^ 36 + 139 - 46 + 53;
        ak.llIIIllII[7] = 0x3A ^ 0x24;
        ak.llIIIllII[8] = 2;
        ak.llIIIllII[9] = 3;
        ak.llIIIllII[10] = 0xB0 ^ 0xB4;
        ak.llIIIllII[11] = 0xCF ^ 0xA7 ^ (0xA2 ^ 0xC2);
    }

    private boolean U() {
        Spell spell = Arrays.stream(SpellBook.Standard.values()).filter(standard -> {
            int n2;
            if (ak.var5(standard.canCast() ? 1 : 0) && ak.var5(standard.toString().toLowerCase().contains(llIIIlIll[llIIIllII[1]]) ? 1 : 0)) {
                n2 = llIIIllII[0];
                0;
                if null != null {
                    return ((0x54 ^ 0x4B ^ (0xC ^ 0x2A)) & (0x10 ^ 0x18 ^ (0xBD ^ 0x8C) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIllII[1];
            }
            return n2 != 0;
        }).findFirst().orElse(null);
        if (ak.var4(spell)) {
            return llIIIllII[1];
        }
        Magic.cast((Spespell);
        return llIIIllII[0];
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        ak var7;
        void var8;
        int[] nArray = new int[llIIIllII[0]];
        nArray[ak.llIIIllII[1]] = llIIIllII[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(llIIIllII[3], llIIIllII[4], llIIIllII[5], llIIIllII[6], llIIIllII[1]);
        if (ak.var9(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIIllII[1];
        }
        if (ak.var4(var8)) {
            return llIIIllII[1];
        }
        if (ak.var2(Combat.getCurrentHealth(), llIIIllII[7]) && ak.var9(Inventory.contains(item -> item.hasAction(llIIIlIll[llIIIllII[9]]::equals)) ? 1 : 0)) {
            return var7.U();
        }
        if (ak.var9(Prayers.getPoints()) && ak.var9(Inventory.contains(item -> {
            int n2;
            if (!ak.var9(item.getName().startsWith(llIIIlIll[llIIIllII[0]]) ? 1 : 0) || ak.var5(item.getName().startsWith(llIIIlIll[llIIIllII[8]]) ? 1 : 0)) {
                n2 = llIIIllII[0];
                0;
                if (-1 > 0) {
                    return ((0xFA ^ 0x87 ^ (0xE3 ^ 0xA7)) & (0x65 ^ 0x32 ^ (0x7F ^ 0x11) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIllII[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return var7.U();
        }
        return llIIIllII[1];
    }

    @Inject
    private TeleportingOutTask(a a2) {
        this.cP = a2;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = llIIIllII[1];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = llIIIllII[1];
        while (ak.var6(var18, var17)) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var13);
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }
}

