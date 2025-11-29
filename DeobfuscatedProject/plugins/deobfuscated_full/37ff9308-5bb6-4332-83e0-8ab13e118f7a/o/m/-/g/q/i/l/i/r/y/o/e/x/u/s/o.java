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
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

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
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.d;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.f;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.t;

/* TASK: Operate levers -> OperateleversTask */
@TaskDesc(name="Operate levers")
public class o
extends Task {
    private final /* synthetic */ SquireMixologyConfig Y;
    private static /* synthetic */ int[] lIIIIIIIIlIll;
    private /* synthetic */ int K;
    private static /* synthetic */ String[] lIIIIIIIIIllI;
    private /* synthetic */ int J;
    private /* synthetic */ int I;

    private static boolean lIIlIllIIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public o(SquireMixologyConfig squireMixologyConfig) {
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
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[3]] = o."Entering minigame area";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[4]] = o."\\s*\\(.*?\\)";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[11]] = o."";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[15]] = o."\\s*\\(.*?\\)";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[14]] = o."";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[17]] = o."\\s*\\(.*?\\)";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[16]] = o."";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[18]] = o."Empty";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[19]] = o."Empty";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[20]] = o."Empty";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[22]] = o."Empty";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[29]] = o."Drink";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[30]] = o."Vial";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[31]] = o."Vial";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[32]] = o."Drop";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[33]] = o."Stamina";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[34]] = o."Stamina";
        o.lIIIIIIIIIllI[o.lIIIIIIIIlIll[35]] = o."Stamina";
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

    private static String lIIlIllIIIlIlll(String var9, String var7) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIlIll[19]), "DES");
            Cipher var23 = Cipher.getInstance("DES");
            var23.init(lIIIIIIIIlIll[11], var13);
            return new String(var23.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
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

    private static String lIIlIllIIIllIII(String var10, String var3) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(lIIIIIIIIlIll[11], var11);
            return new String(var22.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIIllIllI(Object object, Object object2) {
        return object != object2;
    }

    private static String lIIlIllIIIlIllI(String var20, String var2) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var12 = var2.toCharArray();
        int var14 = lIIIIIIIIlIll[3];
        char[] var24 = var20.toCharArray();
        int var5 = var24.length;
        int var19 = lIIIIIIIIlIll[3];
        while (o.lIIlIllIIlllIIl(var19, var5)) {
            char var25 = var24[var19];
            var18.append((char)(var25 ^ var12[var14 % var12.length]));
            0;
            ++var14;
            ++var19;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean lIIlIllIIllIIlI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        o var17;
        block47: {
            block52: {
                String var1;
                block51: {
                    block50: {
                        String var15;
                        block49: {
                            block48: {
                                if (o.lIIlIllIIllIIlI(s.e() ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                int[] nArray = new int[lIIIIIIIIlIll[4]];
                                nArray[o.lIIIIIIIIlIll[3]] = lIIIIIIIIlIll[5];
                                TileObject var4 = TileObjects.getNearest((int[])nArray);
                                if (o.lIIlIllIIllIIll(var4) && o.lIIlIllIIllIlII(s.h() ? 1 : 0) && o.lIIlIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(var4.getWorldLocation()), lIIIIIIIIlIll[4])) {
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
                                if (o.lIIlIllIIllIllI((Object)var17.Y.pluginMode(), (Object)d.MINIGAME)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllIlll((Object)var17.Y.potionStrategy(), (Object)f.SINGLE_ORDER) && o.lIIlIllIIllIlII(s.f() ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllIlll((Object)var17.Y.potionStrategy(), (Object)f.MULTI_ORDER) && o.lIIlIllIIllIlII(s.g() ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if (o.lIIlIllIIllIlII(var17.Y.useStamina() ? 1 : 0) && o.lIIlIllIIllIIlI(Inventory.contains(item -> item.getName().contains(lIIIIIIIIIllI[lIIIIIIIIlIll[35]])) ? 1 : 0)) {
                                    return lIIIIIIIIlIll[3];
                                }
                                if ((!o.lIIlIllIIlllIII(Vars.getBit((int)var17.I), lIIIIIIIIlIll[9]) || !o.lIIlIllIIlllIII(Vars.getBit((int)var17.J), lIIIIIIIIlIll[9]) || o.lIIlIllIIlllIIl(Vars.getBit((int)var17.K), lIIIIIIIIlIll[9])) && o.lIIlIllIIllIIlI(s.f() ? 1 : 0)) {
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
                                    WorldPoint var16 = new WorldPoint(lIIIIIIIIlIll[12], lIIIIIIIIlIll[13], lIIIIIIIIlIll[3]);
                                    Movement.setDestination((WorldPoint)var16);
                                    return lIIIIIIIIlIll[3];
                                }
                                String var16 = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[11]).getText().replaceAll(lIIIIIIIIIllI[lIIIIIIIIlIll[4]], lIIIIIIIIIllI[lIIIIIIIIlIll[11]]).trim();
                                var15 = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[14]).getText().replaceAll(lIIIIIIIIIllI[lIIIIIIIIlIll[15]], lIIIIIIIIIllI[lIIIIIIIIlIll[14]]).trim();
                                var1 = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[16]).getText().replaceAll(lIIIIIIIIIllI[lIIIIIIIIlIll[17]], lIIIIIIIIIllI[lIIIIIIIIlIll[16]]).trim();
                                if (o.lIIlIllIIllIlll((Object)var17.Y.potionStrategy(), (Object)f.MULTI_ORDER)) {
                                    if (o.lIIlIllIIllIlII(s.b(var16, var15, var1) ? 1 : 0)) {
                                        return lIIIIIIIIlIll[3];
                                    }
                                    if (!o.lIIlIllIIllIIlI(SquireMixology.m.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[18]]) ? 1 : 0) || !o.lIIlIllIIllIIlI(SquireMixology.n.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[19]]) ? 1 : 0) || o.lIIlIllIIllIlII(SquireMixology.o.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[20]]) ? 1 : 0)) {
                                        SquireMixology.m = var16;
                                        SquireMixology.y.set(lIIIIIIIIlIll[3], var16);
                                        0;
                                        SquireMixology.n = var15;
                                        SquireMixology.y.set(lIIIIIIIIlIll[4], var15);
                                        0;
                                        SquireMixology.o = var1;
                                        SquireMixology.y.set(lIIIIIIIIlIll[11], var1);
                                        0;
                                    }
                                    if (!o.lIIlIllIIlllIll(SquireMixology.r, lIIIIIIIIlIll[21]) || !o.lIIlIllIIlllIll(SquireMixology.s, lIIIIIIIIlIll[21]) || o.lIIlIllIIllllII(SquireMixology.t, lIIIIIIIIlIll[21])) {
                                        SquireMixology.r = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[4]).getSpriteId();
                                        SquireMixology.z.set(lIIIIIIIIlIll[3], SquireMixology.r);
                                        0;
                                        SquireMixology.s = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[15]).getSpriteId();
                                        SquireMixology.z.set(lIIIIIIIIlIll[4], SquireMixology.s);
                                        0;
                                        SquireMixology.t = Widgets.get((int)lIIIIIIIIlIll[10], (int)lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[17]).getSpriteId();
                                        SquireMixology.z.set(lIIIIIIIIlIll[11], SquireMixology.t);
                                        0;
                                    }
                                }
                                if (o.lIIlIllIIllIllI((Object)var17.Y.potionStrategy(), (Object)f.MULTI_ORDER)) {
                                    t var21;
                                    if (o.lIIlIllIIllIlII(SquireMixology.m.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[22]]) ? 1 : 0) && o.lIIlIllIIllIlll((Object)var17.Y.potionStrategy(), (Object)f.SINGLE_ORDER) && o.lIIlIllIIllIIll((Object)(var21 = s.a(var16, var15, var1)))) {
                                        SquireMixology.m = var21.a();
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
                                if (o.lIIlIllIIllIlII(var17.Y.useStamina() ? 1 : 0) && o.lIIlIllIIlllIIl(Movement.getRunEnergy(), lIIIIIIIIlIll[28]) && o.lIIlIllIIllIlII(Inventory.contains(item -> item.getName().contains(lIIIIIIIIIllI[lIIIIIIIIlIll[34]])) ? 1 : 0) && o.lIIlIllIIllIIlI(Movement.isStaminaBoosted() ? 1 : 0)) {
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
                                if (!o.lIIlIllIIllIlll((Object)var17.Y.potionStrategy(), (Object)f.MULTI_ORDER)) break block47;
                                if (o.lIIlIllIIllllII(SquireMixology.u, lIIIIIIIIlIll[4]) && o.lIIlIllIIllllII(SquireMixology.v, lIIIIIIIIlIll[4]) && o.lIIlIllIIllllII(SquireMixology.w, lIIIIIIIIlIll[4])) {
                                    if (o.lIIlIllIIllIlII(var16.equalsIgnoreCase(var15) ? 1 : 0)) {
                                        SquireMixology.u += lIIIIIIIIlIll[4];
                                    }
                                    if (o.lIIlIllIIllIlII(var16.equalsIgnoreCase(var1) ? 1 : 0)) {
                                        SquireMixology.u += lIIIIIIIIlIll[4];
                                    }
                                    if (o.lIIlIllIIllIlII(var15.equalsIgnoreCase(var1) ? 1 : 0)) {
                                        SquireMixology.v += lIIIIIIIIlIll[4];
                                    }
                                    if (o.lIIlIllIIllIlII(var15.equalsIgnoreCase(var16) ? 1 : 0)) {
                                        SquireMixology.v += lIIIIIIIIlIll[4];
                                    }
                                    if (o.lIIlIllIIllIlII(var1.equalsIgnoreCase(var16) ? 1 : 0)) {
                                        SquireMixology.w += lIIIIIIIIlIll[4];
                                    }
                                    if (o.lIIlIllIIllIlII(var1.equalsIgnoreCase(var15) ? 1 : 0)) {
                                        SquireMixology.w += lIIIIIIIIlIll[4];
                                    }
                                }
                                System.out.println("POTION 1: " + SquireMixology.m + " Count: " + SquireMixology.u);
                                System.out.println("POTION 2: " + SquireMixology.n + " Count: " + SquireMixology.v);
                                System.out.println("POTION 3: " + SquireMixology.o + " Count: " + SquireMixology.w);
                                int[] nArray2 = new int[lIIIIIIIIlIll[4]];
                                nArray2[o.lIIIIIIIIlIll[3]] = s.e(var16);
                                if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block48;
                                int[] nArray3 = new int[lIIIIIIIIlIll[4]];
                                nArray3[o.lIIIIIIIIlIll[3]] = s.e(var16);
                                if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block49;
                                int[] nArray4 = new int[lIIIIIIIIlIll[4]];
                                nArray4[o.lIIIIIIIIlIll[3]] = s.e(var16);
                                if (!o.lIIlIllIIlllIll(Inventory.getCount((int[])nArray4), SquireMixology.u)) break block49;
                            }
                            SquireMixology.p = SquireMixology.m;
                            s.c(SquireMixology.m);
                            0;
                            SquireMixology.A = lIIIIIIIIlIll[3];
                            return lIIIIIIIIlIll[3];
                        }
                        int[] nArray = new int[lIIIIIIIIlIll[4]];
                        nArray[o.lIIIIIIIIlIll[3]] = s.e(var15);
                        if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block50;
                        int[] nArray5 = new int[lIIIIIIIIlIll[4]];
                        nArray5[o.lIIIIIIIIlIll[3]] = s.e(var15);
                        if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block51;
                        int[] nArray6 = new int[lIIIIIIIIlIll[4]];
                        nArray6[o.lIIIIIIIIlIll[3]] = s.e(var15);
                        if (!o.lIIlIllIIlllIll(Inventory.getCount((int[])nArray6), SquireMixology.v)) break block51;
                    }
                    SquireMixology.p = SquireMixology.n;
                    s.c(SquireMixology.n);
                    0;
                    SquireMixology.A = lIIIIIIIIlIll[3];
                    return lIIIIIIIIlIll[3];
                }
                int[] nArray = new int[lIIIIIIIIlIll[4]];
                nArray[o.lIIIIIIIIlIll[3]] = s.e(var1);
                if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block52;
                int[] nArray7 = new int[lIIIIIIIIlIll[4]];
                nArray7[o.lIIIIIIIIlIll[3]] = s.e(var1);
                if (!o.lIIlIllIIllIlII(Inventory.contains((int[])nArray7) ? 1 : 0)) break block47;
                int[] nArray8 = new int[lIIIIIIIIlIll[4]];
                nArray8[o.lIIIIIIIIlIll[3]] = s.e(var1);
                if (!o.lIIlIllIIlllIll(Inventory.getCount((int[])nArray8), SquireMixology.w)) break block47;
            }
            SquireMixology.p = SquireMixology.o;
            s.c(SquireMixology.o);
            0;
            SquireMixology.A = lIIIIIIIIlIll[3];
            return lIIIIIIIIlIll[3];
        }
        if (o.lIIlIllIIllIllI((Object)var17.Y.potionStrategy(), (Object)f.MULTI_ORDER)) {
            s.c(SquireMixology.m);
            0;
        }
        return lIIIIIIIIlIll[3];
    }

    private static void lIIlIllIIllIIIl() {
        lIIIIIIIIlIll = new int[37];
        o.lIIIIIIIIlIll[0] = 0xFFFFFEFF & 0x2DA7;
        o.lIIIIIIIIlIll[1] = 0xFFFFEFFA & 0x3CAD;
        o.lIIIIIIIIlIll[2] = 0xFFFFBCB9 & 0x6FEF;
        o.lIIIIIIIIlIll[3] = (0x94 ^ 0x9A ^ (0x85 ^ 0xA9)) & (0xA2 ^ 0xAC ^ (0x39 ^ 0x15) ^ -1);
        o.lIIIIIIIIlIll[4] = 1;
        o.lIIIIIIIIlIll[5] = 0xFFFFFE8F & 0xD7F5;
        o.lIIIIIIIIlIll[6] = 0xFFFF93BE & 0x7D7F;
        o.lIIIIIIIIlIll[7] = 0xFFFFB5FF & 0x5B3F;
        o.lIIIIIIIIlIll[8] = -(0xFFFF9ABF & 0x67EC) & (0xFFFFF7FF & 0x1BEB);
        o.lIIIIIIIIlIll[9] = 1 ^ 0x65;
        o.lIIIIIIIIlIll[10] = 0xFFFF8773 & 0x7BFE;
        o.lIIIIIIIIlIll[11] = 2;
        o.lIIIIIIIIlIll[12] = -(0xFFFFEE27 & 0x33DD) & (0xFFFFF7F7 & 0x2F7E);
        o.lIIIIIIIIlIll[13] = -(20 + 49 - 25 + 103) & (0xFFFFBCFE & 0x67FF);
        o.lIIIIIIIIlIll[14] = 0xA6 ^ 0xA2;
        o.lIIIIIIIIlIll[15] = 3;
        o.lIIIIIIIIlIll[16] = 1 ^ 0xD ^ (0xA3 ^ 0xA9);
        o.lIIIIIIIIlIll[17] = 0x72 ^ 0x77;
        o.lIIIIIIIIlIll[18] = 84 + 99 - 163 + 154 ^ 136 + 134 - 144 + 43;
        o.lIIIIIIIIlIll[19] = 95 + 72 - 74 + 58 ^ 125 + 17 - 6 + 23;
        o.lIIIIIIIIlIll[20] = 0x82 ^ 0x8B;
        o.lIIIIIIIIlIll[21] = -1;
        o.lIIIIIIIIlIll[22] = 0x75 ^ 0x4A ^ (0x1B ^ 0x2E);
        o.lIIIIIIIIlIll[23] = 0xFFFFFC7F & 0x2FCB;
        o.lIIIIIIIIlIll[24] = -(0xFFFFD2EB & 0x2F15) & (0xFFFFBFBF & 0x6E7F);
        o.lIIIIIIIIlIll[25] = 0xFFFFFD6A & 0x2ED5;
        o.lIIIIIIIIlIll[26] = 0xFFFFEEDD & 0x3D63;
        o.lIIIIIIIIlIll[27] = 47 + 75 - 28 + 35 ^ 136 + 48 - 133 + 98;
        o.lIIIIIIIIlIll[28] = 0xE8 ^ 0xA9;
        o.lIIIIIIIIlIll[29] = 9 ^ 2;
        o.lIIIIIIIIlIll[30] = 0x84 ^ 0x88;
        o.lIIIIIIIIlIll[31] = 0xCC ^ 0xC1;
        o.lIIIIIIIIlIll[32] = 0x83 ^ 0x8D;
        o.lIIIIIIIIlIll[33] = 0xB0 ^ 0xBF;
        o.lIIIIIIIIlIll[34] = 0xA1 ^ 0x9E ^ (0xB5 ^ 0x9A);
        o.lIIIIIIIIlIll[35] = 1 ^ 0x18 ^ (0x50 ^ 0x58);
        o.lIIIIIIIIlIll[36] = 0xC0 ^ 0x8F ^ (0x44 ^ 0x19);
    }
}

