/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import gg.squire.mixology.overlay.MixologyInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.mixology.tasks.GameEnum15;
import gg.squire.mixology.tasks.GameEnum16;
import gg.squire.mixology.tasks.SHelper;
import gg.squire.mixology.tasks.GameEnum;

@TaskDesc(name="Operate levers")
public class OperateLeversTask
extends Task {
    private final  SquireMixologyConfig Y;
    
    private  int K;
    
    private  int J;
    private  int I;

    private static boolean lIIlIllIIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public OperateLeversTask(SquireMixologyConfig squireMixologyConfig) {
        this.I = lIIIIIIIIlIll[0];
        this.J = lIIIIIIIIlIll[1];
        this.K = lIIIIIIIIlIll[2];
        this.Y = squireMixologyConfig;
    }

    private static boolean lIIlIllIIllIIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIllIIllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIllIIllIIII() {
        lIIIIIIIIIllI = new String[lIIIIIIIIlIll[36]];
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[3]] = "Entering minigame area";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[4]] = "\\s*\\(.*?\\)";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[11]] = o.lIIlIllIIIllIII("TNjCO/UmkLM=", "djvWl");
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[15]] = "\\s*\\(.*?\\)";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[14]] = o.lIIlIllIIIllIII("dKCTrtcTUmA=", "GVwpi");
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[17]] = "\\s*\\(.*?\\)";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[16]] = o.lIIlIllIIIllIII("ogANug5q1Go=", "jPWhC");
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[18]] = "Empty";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[19]] = "Empty";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[20]] = "Empty";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[22]] = "Empty";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[29]] = "Drink";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[30]] = "Vial";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[31]] = "Vial";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[32]] = "Drop";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[33]] = "Stamina";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[34]] = "Stamina";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[35]] = "Stamina";
    }

    private static boolean lIIlIllIIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIllIIllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIllIIllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIllIIllllIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIllIIlllIlI(Object object) {
        return object == null;
    }

    static {
        o.lIIlIllIIllIIIl();
        o.lIIlIllIIllIIII();
    }

    private static boolean lIIlIllIIlllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIllIIlllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIllIIllIllI(Object object, Object object2) {
        return object != object2;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIllIIllIIlI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        o var2;
        block47: {
            block52: {
                String var3;
                block51: {
                    block50: {
                        String var4;
                        block49: {
                            block48: {
                                if (o.lIIlIllIIllIIlI(s.e() ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                int[] nArray = new int[lIIIIIIIIlIll[4]];
                                nArray[o.lIIIIIIIIlIll[3]] = lIIIIIIIIlIll[5];
                                TileObject var5 = TileObjects.getNearest((int[])nArray);
                                if (o.lIIlIllIIllIIll(var5) && o.lIIlIllIIllIlII(s.h() ? 1 : 0) && o.lIIlIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(var5.getWorldLocation()), lIIIIIIIIlIll[4])) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllIIlI(MixologyInfoBox.D)) {
                                    MixologyInfoBox.D = Static.getClient().getVarpValue(lIIIIIIIIlIll[6]);
                                }
                                if (o.lIIlIllIIllIIlI(MixologyInfoBox.E)) {
                                    MixologyInfoBox.E = Static.getClient().getVarpValue(lIIIIIIIIlIll[7]);
                                }
                                if (o.lIIlIllIIllIIlI(MixologyInfoBox.F)) {
                                    MixologyInfoBox.F = Static.getClient().getVarpValue(lIIIIIIIIlIll[8]);
                                }
                                if (o.lIIlIllIIllIllI((Object)var2.Y.pluginMode(), (Object)d.MINIGAME)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllIlll((Object)var2.Y.potionStrategy(), (Object)f.SINGLE_ORDER) && o.lIIlIllIIllIlII(s.f() ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllIlll((Object)var2.Y.potionStrategy(), (Object)f.MULTI_ORDER) && o.lIIlIllIIllIlII(s.g() ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllIlII(var2.Y.useStamina() ? 1 : 0) && o.lIIlIllIIllIIlI(Inventory.contains(item -> item.getName().contains(lIIIIIIIIIllI[lIIIIIIIIlIll[35]])) ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if ((!o.lIIlIllIIlllIII(Vars.getBit((int)var2.I), lIIIIIIIIlIll[9]) || !o.lIIlIllIIlllIII(Vars.getBit((int)var2.J), lIIIIIIIIlIll[9]) || o.lIIlIllIIlllIIl(Vars.getBit((int)var2.K), lIIIIIIIIlIll[9])) && o.lIIlIllIIllIIlI(s.f() ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllIlII(SquireMixology.j ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllIlII(SquireMixology.k ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIlllIlI(Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]))) {
                                    SquireMixology.g = lIIIIIIIIIllI[lIIIIIIIIlIll[3]];
                                    WorldPoint var6 = new WorldPoint(lIIIIIIIIlIll[12], lIIIIIIIIlIll[13], lIIIIIIIIlIll[3]);
                                    Movement.setDestination((WorldPoint)var6);
                                    return lIIIIIIIIlIll[3];
                                }
                                String var6 = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[11]).getText().replaceAll(lIIIIIIIIIllI[lIIIIIIIIlIll[4]], lIIIIIIIIIllI[lIIIIIIIIlIll[11]]).trim();
                                var4 = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[14]).getText().replaceAll(lIIIIIIIIIllI[lIIIIIIIIlIll[15]], lIIIIIIIIIllI[lIIIIIIIIlIll[14]]).trim();
                                var3 = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[16]).getText().replaceAll(lIIIIIIIIIllI[lIIIIIIIIlIll[17]], lIIIIIIIIIllI[lIIIIIIIIlIll[16]]).trim();
                                if (o.lIIlIllIIllIlll((Object)var2.Y.potionStrategy(), (Object)f.MULTI_ORDER)) {
                                    if (o.lIIlIllIIllIlII(s.b(var6, var4, var3) ? 1 : 0)) {
                                        return lIIIIIIIIlIll[3];
                                    }
                                    if (!o.lIIlIllIIllIIlI(SquireMixology.m.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[18]]) ? 1 : 0) || !o.lIIlIllIIllIIlI(SquireMixology.n.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[19]]) ? 1 : 0) || o.lIIlIllIIllIlII(SquireMixology.o.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[20]]) ? 1 : 0)) {
                                        SquireMixology.m = var6;
                                        SquireMixology.y.set(lIIIIIIIIlIll[3], var6);

                                        SquireMixology.n = var4;
                                        SquireMixology.y.set(lIIIIIIIIlIll[4], var4);

                                        SquireMixology.o = var3;
                                        SquireMixology.y.set(lIIIIIIIIlIll[11], var3);

                                    }
                                    if (!o.lIIlIllIIlllIll(SquireMixology.r, lIIIIIIIIlIll[21]) || !o.lIIlIllIIlllIll(SquireMixology.s, lIIIIIIIIlIll[21]) || o.lIIlIllIIllllII(SquireMixology.t, lIIIIIIIIlIll[21])) {
                                        SquireMixology.r = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[4]).getSpriteId();
                                        SquireMixology.z.set(lIIIIIIIIlIll[3], SquireMixology.r);

                                        SquireMixology.s = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[15]).getSpriteId();
                                        SquireMixology.z.set(lIIIIIIIIlIll[4], SquireMixology.s);

                                        SquireMixology.t = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[17]).getSpriteId();
                                        SquireMixology.z.set(lIIIIIIIIlIll[11], SquireMixology.t);

                                    }
                                }
                                if (o.lIIlIllIIllIllI((Object)var2.Y.potionStrategy(), (Object)f.MULTI_ORDER)) {
                                    t var7;
                                    if (o.lIIlIllIIllIlII(SquireMixology.m.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[22]]) ? 1 : 0) && o.lIIlIllIIllIlll((Object)var2.Y.potionStrategy(), (Object)f.SINGLE_ORDER) && o.lIIlIllIIllIIll((Object)(var7 = s.a(var6, var4, var3)))) {
                                        SquireMixology.m = var7.a();
                                    }
                                    if (o.lIIlIllIIllllII(SquireMixology.r, lIIIIIIIIlIll[21]) && o.lIIlIllIIllIIll(SquireMixology.m)) {
                                        SquireMixology.r = s.b(SquireMixology.m);
                                    }
                                }
                                if (!o.lIIlIllIIllIIll(SquireMixology.m) || o.lIIlIllIIllllII(SquireMixology.r, lIIIIIIIIlIll[21])) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllllIl(Vars.getBit((int)lIIIIIIIIlIll[23]))) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllllIl(Vars.getBit((int)lIIIIIIIIlIll[24]))) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllllIl(Vars.getBit((int)lIIIIIIIIlIll[25]))) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllllIl(Vars.getBit((int)lIIIIIIIIlIll[26]))) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (!o.lIIlIllIIllIIlI(Players.getLocal().isAnimating() ? 1 : 0) || o.lIIlIllIIllIIlI(Players.getLocal().isIdle() ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIlllIII(Movement.getRunEnergy(), lIIIIIIIIlIll[27]) && o.lIIlIllIIllIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                                    Movement.toggleRun();
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllIlII(var2.Y.useStamina() ? 1 : 0) && o.lIIlIllIIlllIIl(Movement.getRunEnergy(), lIIIIIIIIlIll[28]) && o.lIIlIllIIllIlII(Inventory.contains(item -> item.getName().contains(lIIIIIIIIIllI[lIIIIIIIIlIll[34]])) ? 1 : 0) && o.lIIlIllIIllIIlI(Movement.isStaminaBoosted() ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(lIIIIIIIIIllI[lIIIIIIIIlIll[33]])).interact(lIIIIIIIIIllI[lIIIIIIIIlIll[29]]);
                                }
                                if (o.lIIlIllIIllIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] stringArray = new String[lIIIIIIIIlIll[4]];
                                stringArray[o.lIIIIIIIIlIll[3]] = lIIIIIIIIIllI[lIIIIIIIIlIll[30]];
                                if (o.lIIlIllIIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIIIIIIIIlIll[4]];
                                    stringArray2[o.lIIIIIIIIlIll[3]] = lIIIIIIIIIllI[lIIIIIIIIlIll[31]];
                                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIIIllI[lIIIIIIIIlIll[32]]);
                                }
                                if (!o.lIIlIllIIllIlll((Object)var2.Y.potionStrategy(), (Object)f.MULTI_ORDER)) break block47;
                                if (o.lIIlIllIIllllII(SquireMixology.u, lIIIIIIIIlIll[4]) && o.lIIlIllIIllllII(SquireMixology.v, lIIIIIIIIlIll[4]) && o.lIIlIllIIllllII(SquireMixology.w, lIIIIIIIIlIll[4])) {
                                    if (o.lIIlIllIIllIlII(var6.equalsIgnoreCase(var4) ? 1 : 0)) {
                                        SquireMixology.u += lIIIIIIIIlIll[4];
                                    }
                                    if (o.lIIlIllIIllIlII(var6.equalsIgnoreCase(var3) ? 1 : 0)) {
                                        SquireMixology.u += lIIIIIIIIlIll[4];
                                    }
                                    if (o.lIIlIllIIllIlII(var4.equalsIgnoreCase(var3) ? 1 : 0)) {
                                        SquireMixology.v += lIIIIIIIIlIll[4];
                                    }
                                    if (o.lIIlIllIIllIlII(var4.equalsIgnoreCase(var6) ? 1 : 0)) {
                                        SquireMixology.v += lIIIIIIIIlIll[4];
                                    }
                                    if (o.lIIlIllIIllIlII(var3.equalsIgnoreCase(var6) ? 1 : 0)) {
                                        SquireMixology.w += lIIIIIIIIlIll[4];
                                    }
                                    if (o.lIIlIllIIllIlII(var3.equalsIgnoreCase(var4) ? 1 : 0)) {
                                        SquireMixology.w += lIIIIIIIIlIll[4];
                                    }
                                }
                                System.out.println("POTION 1: " + SquireMixology.m + " Count: " + SquireMixology.u);
                                System.out.println("POTION 2: " + SquireMixology.n + " Count: " + SquireMixology.v);
                                System.out.println("POTION 3: " + SquireMixology.o + " Count: " + SquireMixology.w);
                                int[] nArray2 = new int[lIIIIIIIIlIll[4]];
                                nArray2[o.lIIIIIIIIlIll[3]] = s.e(var6);
                                if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block48;
                                int[] nArray3 = new int[lIIIIIIIIlIll[4]];
                                nArray3[o.lIIIIIIIIlIll[3]] = s.e(var6);
                                if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block49;
                                int[] nArray4 = new int[lIIIIIIIIlIll[4]];
                                nArray4[o.lIIIIIIIIlIll[3]] = s.e(var6);
                                if (!o.lIIlIllIIlllIll(Inventory.getCount((int[])nArray4), SquireMixology.u)) break block49;
                            }
                            SquireMixology.p = SquireMixology.m;
                            s.c(SquireMixology.m);

                            SquireMixology.A = lIIIIIIIIlIll[3];
                            return lIIIIIIIIlIll[3];
                        }
                        int[] nArray = new int[lIIIIIIIIlIll[4]];
                        nArray[o.lIIIIIIIIlIll[3]] = s.e(var4);
                        if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block50;
                        int[] nArray5 = new int[lIIIIIIIIlIll[4]];
                        nArray5[o.lIIIIIIIIlIll[3]] = s.e(var4);
                        if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block51;
                        int[] nArray6 = new int[lIIIIIIIIlIll[4]];
                        nArray6[o.lIIIIIIIIlIll[3]] = s.e(var4);
                        if (!o.lIIlIllIIlllIll(Inventory.getCount((int[])nArray6), SquireMixology.v)) break block51;
                    }
                    SquireMixology.p = SquireMixology.n;
                    s.c(SquireMixology.n);

                    SquireMixology.A = lIIIIIIIIlIll[3];
                    return lIIIIIIIIlIll[3];
                }
                int[] nArray = new int[lIIIIIIIIlIll[4]];
                nArray[o.lIIIIIIIIlIll[3]] = s.e(var3);
                if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block52;
                int[] nArray7 = new int[lIIIIIIIIlIll[4]];
                nArray7[o.lIIIIIIIIlIll[3]] = s.e(var3);
                if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray7) ? 1 : 0)) break block47;
                int[] nArray8 = new int[lIIIIIIIIlIll[4]];
                nArray8[o.lIIIIIIIIlIll[3]] = s.e(var3);
                if (!o.lIIlIllIIlllIll(Inventory.getCount((int[])nArray8), SquireMixology.w)) break block47;
            }
            SquireMixology.p = SquireMixology.o;
            s.c(SquireMixology.o);

            SquireMixology.A = lIIIIIIIIlIll[3];
            return lIIIIIIIIlIll[3];
        }
        if (o.lIIlIllIIllIllI((Object)var2.Y.potionStrategy(), (Object)f.MULTI_ORDER)) {
            s.c(SquireMixology.m);

        }
        return lIIIIIIIIlIll[3];
    }

}

