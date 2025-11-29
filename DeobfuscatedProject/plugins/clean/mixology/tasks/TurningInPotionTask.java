/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.mixology.tasks.GameEnum15;
import gg.squire.mixology.tasks.GameEnum16;
import gg.squire.mixology.tasks.SHelper;

@TaskDesc(name="Turning in potion task")
public class TurningInPotionTask
extends Task {
    private final  SquireMixologyConfig Z;

    static {
        q.lIIlIlIlIlIIlll();
        q.lIIlIlIlIlIIIII();
    }

    @Inject
    public TurningInPotionTask(SquireMixologyConfig squireMixologyConfig) {
        this.Z = squireMixologyConfig;
    }

    private static boolean lIIlIlIlIlIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIlIlIlllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlIlIllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIlIlIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIlIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIlIlIllIl(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIlIlIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIlIlIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIlIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        q var2;
        block19: {
            block22: {
                int var3;
                int var4;
                int var5;
                block21: {
                    block20: {
                        if (q.lIIlIlIlIlIlIII(s.e() ? 1 : 0)) {
                            return lllllllIllII[0];
                        }
                        if (q.lIIlIlIlIlIlIIl((Object)var2.Z.pluginMode(), (Object)d.MINIGAME)) {
                            return lllllllIllII[0];
                        }
                        if (q.lIIlIlIlIlIlIlI(Movement.getRunEnergy(), lllllllIllII[1]) && q.lIIlIlIlIlIlIII(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                            return lllllllIllII[0];
                        }
                        int[] nArray = new int[lllllllIllII[2]];
                        nArray[q.lllllllIllII[0]] = lllllllIllII[3];
                        TileObject var6 = TileObjects.getNearest((int[])nArray);
                        if (q.lIIlIlIlIlIlIll(var6) && q.lIIlIlIlIlIllII(s.h() ? 1 : 0) && q.lIIlIlIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(var6.getWorldLocation()), lllllllIllII[2])) {
                            var6.interact(lllllllIllII[0]);
                            return lllllllIllII[0];
                        }
                        if (q.lIIlIlIlIlIlIll(var6) && q.lIIlIlIlIlIlIII(s.f() ? 1 : 0) && q.lIIlIlIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(var6.getWorldLocation()), lllllllIllII[2])) {
                            SquireMixology.m = lllllllIlIIl[lllllllIllII[0]];
                            SquireMixology.o = lllllllIlIIl[lllllllIllII[2]];
                            SquireMixology.n = lllllllIlIIl[lllllllIllII[4]];
                            SquireMixology.p = lllllllIlIIl[lllllllIllII[5]];
                            SquireMixology.r = lllllllIllII[6];
                            SquireMixology.A = lllllllIllII[0];
                            SquireMixology.k = lllllllIllII[0];
                            SquireMixology.u = lllllllIllII[2];
                            SquireMixology.v = lllllllIllII[2];
                            SquireMixology.w = lllllllIllII[2];
                            SquireMixology.s = lllllllIllII[6];
                            SquireMixology.t = lllllllIllII[6];
                            SquireMixology.x = lllllllIllII[6];
                            Integer[] integerArray = new Integer[lllllllIllII[5]];
                            integerArray[q.lllllllIllII[0]] = lllllllIllII[6];
                            integerArray[q.lllllllIllII[2]] = lllllllIllII[6];
                            integerArray[q.lllllllIllII[4]] = lllllllIllII[6];
                            SquireMixology.z = new ArrayList<Integer>(Arrays.asList(integerArray));
                            String[] stringArray = new String[lllllllIllII[5]];
                            stringArray[q.lllllllIllII[0]] = null;
                            stringArray[q.lllllllIllII[2]] = null;
                            stringArray[q.lllllllIllII[4]] = null;
                            SquireMixology.y = new ArrayList<String>(Arrays.asList(stringArray));
                        }
                        if (q.lIIlIlIlIlIlIII(s.h() ? 1 : 0)) {
                            return lllllllIllII[0];
                        }
                        String[] stringArray = new String[lllllllIllII[2]];
                        stringArray[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[7]];
                        TileObject var7 = TileObjects.getNearest((String[])stringArray);
                        if (q.lIIlIlIlIlIlIll(var7)) {
                            SquireMixology.g = lllllllIlIIl[lllllllIllII[8]];
                            var7.interact(lllllllIlIIl[lllllllIllII[9]]);
                            return lllllllIllII[0];
                        }
                        if (!q.lIIlIlIlIlIlllI((Object)var2.Z.potionStrategy(), (Object)f.MULTI_ORDER)) break block19;
                        var5 = s.e(SquireMixology.m);
                        var4 = s.e(SquireMixology.n);
                        var3 = s.e(SquireMixology.o);
                        int[] nArray2 = new int[lllllllIllII[2]];
                        nArray2[q.lllllllIllII[0]] = var5;
                        if (!q.lIIlIlIlIlIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                        int[] nArray3 = new int[lllllllIllII[2]];
                        nArray3[q.lllllllIllII[0]] = var5;
                        if (!q.lIIlIlIlIlIllll(Inventory.getCount((int[])nArray3), SquireMixology.u)) break block20;
                        int[] nArray4 = new int[lllllllIllII[2]];
                        nArray4[q.lllllllIllII[0]] = var4;
                        if (!q.lIIlIlIlIlIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                        int[] nArray5 = new int[lllllllIllII[2]];
                        nArray5[q.lllllllIllII[0]] = var4;
                        if (!q.lIIlIlIlIlIllll(Inventory.getCount((int[])nArray5), SquireMixology.v)) break block20;
                        int[] nArray6 = new int[lllllllIllII[2]];
                        nArray6[q.lllllllIllII[0]] = var3;
                        if (!q.lIIlIlIlIlIllII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block20;
                        int[] nArray7 = new int[lllllllIllII[2]];
                        nArray7[q.lllllllIllII[0]] = var3;
                        if (!q.lIIlIlIlIllIIII(Inventory.getCount((int[])nArray7), SquireMixology.w)) break block21;
                    }
                    return lllllllIllII[0];
                }
                int[] nArray = new int[lllllllIllII[2]];
                nArray[q.lllllllIllII[0]] = var5;
                if (!q.lIIlIlIlIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray8 = new int[lllllllIllII[2]];
                nArray8[q.lllllllIllII[0]] = var4;
                if (!q.lIIlIlIlIlIllII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block22;
                int[] nArray9 = new int[lllllllIllII[2]];
                nArray9[q.lllllllIllII[0]] = var3;
                if (!q.lIIlIlIlIlIlIII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block19;
            }
            return lllllllIllII[0];
        }
        String[] stringArray = new String[lllllllIllII[2]];
        stringArray[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[10]];
        if (q.lIIlIlIlIlIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (q.lIIlIlIlIllIIIl(Skills.getLevel((Skill)Skill.HERBLORE), lllllllIllII[11])) {
                String[] stringArray2 = new String[lllllllIllII[2]];
                stringArray2[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[12]];
                int[] nArray = new int[lllllllIllII[2]];
                nArray[q.lllllllIllII[0]] = s.e(SquireMixology.m);
                Inventory.getFirst((String[])stringArray2).useOn(Inventory.getFirst((int[])nArray));
            }
            if (q.lIIlIlIlIlIlIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllllllIllII[11])) {
                String[] stringArray3 = new String[lllllllIllII[2]];
                stringArray3[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[13]];
                if (q.lIIlIlIlIlIllII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lllllllIllII[2]];
                    stringArray4[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[14]];
                    int[] nArray = new int[lllllllIllII[2]];
                    nArray[q.lllllllIllII[0]] = s.e(lllllllIlIIl[lllllllIllII[15]]);
                    Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((int[])nArray));
                }
            }
        }
        String[] stringArray5 = new String[lllllllIllII[2]];
        stringArray5[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[16]];
        if (q.lIIlIlIlIlIllII(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
            String[] stringArray6 = new String[lllllllIllII[2]];
            stringArray6[q.lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[17]];
            Inventory.getFirst((String[])stringArray6).interact(lllllllIlIIl[lllllllIllII[18]]);
        }
        if (q.lIIlIlIlIlIllII(var2.Z.useStamina() ? 1 : 0) && q.lIIlIlIlIllIIIl(Movement.getRunEnergy(), lllllllIllII[19]) && q.lIIlIlIlIlIllII(Inventory.contains(item -> item.getName().contains(lllllllIlIIl[lllllllIllII[23]])) ? 1 : 0) && q.lIIlIlIlIlIlIII(Movement.isStaminaBoosted() ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(lllllllIlIIl[lllllllIllII[22]])).interact(lllllllIlIIl[lllllllIllII[20]]);
        }
        SquireMixology.g = lllllllIlIIl[lllllllIllII[21]];
        var1_1.interact(lllllllIllII[0]);
        return lllllllIllII[0];
    }

    private static void lIIlIlIlIlIIIII() {
        lllllllIlIIl = new String[lllllllIllII[24]];
        q.lllllllIlIIl[q.lllllllIllII[0]] = "Empty";
        q.lllllllIlIIl[q.lllllllIllII[2]] = "Empty";
        q.lllllllIlIIl[q.lllllllIllII[4]] = "Empty";
        q.lllllllIlIIl[q.lllllllIllII[5]] = "Empty";
        q.lllllllIlIIl[q.lllllllIllII[7]] = "Mature digweed";
        q.lllllllIlIIl[q.lllllllIllII[8]] = "Collecting digweed";
        q.lllllllIlIIl[q.lllllllIllII[9]] = "Collect";
        q.lllllllIlIIl[q.lllllllIllII[10]] = "Digweed";
        q.lllllllIlIIl[q.lllllllIllII[12]] = "Digweed";
        q.lllllllIlIIl[q.lllllllIllII[13]] = "Mixalot";
        q.lllllllIlIIl[q.lllllllIllII[14]] = "Digweed";
        q.lllllllIlIIl[q.lllllllIllII[15]] = "Mixalot";
        q.lllllllIlIIl[q.lllllllIllII[16]] = "Vial";
        q.lllllllIlIIl[q.lllllllIllII[17]] = "Vial";
        q.lllllllIlIIl[q.lllllllIllII[18]] = "Drop";
        q.lllllllIlIIl[q.lllllllIllII[20]] = "Drink";
        q.lllllllIlIIl[q.lllllllIllII[21]] = "Turning in potion";
        q.lllllllIlIIl[q.lllllllIllII[22]] = "Stamina";
        q.lllllllIlIIl[q.lllllllIllII[23]] = "Stamina";
    }

    private static boolean lIIlIlIlIlIllII(int n2) {
        return n2 != 0;
    }
}

