/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a_Unknown;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.BEnum;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Smithing -> SmithingTask */
@TaskDesc(name="Smithing")
public class SmithingTask
extends a_Unknown {
    private static /* synthetic */ int[] lllIIlIIIIl;
    private static /* synthetic */ String[] lllIIlIIIII;

    private static boolean lIlIllIllIllII(Object object) {
        return object != null;
    }

    private static String lIlIllIllIIlIl(String var3, String var22) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lllIIlIIIIl[4], var7);
            return new String(var1.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllIlIII() {
        lllIIlIIIIl = new int[11];
        Q.lllIIlIIIIl[0] = 0xFFFF9F2F & 0x69FB;
        Q.lllIIlIIIIl[1] = 1;
        Q.lllIIlIIIIl[2] = (0x28 ^ 3 ^ (0x14 ^ 0x74)) & (0xE2 ^ 0x97 ^ (0xF8 ^ 0xC6) ^ -1);
        Q.lllIIlIIIIl[3] = 0x93 ^ 0x99;
        Q.lllIIlIIIIl[4] = 2;
        Q.lllIIlIIIIl[5] = 3;
        Q.lllIIlIIIIl[6] = 0x4A ^ 0x22 ^ (0xE5 ^ 0x89);
        Q.lllIIlIIIIl[7] = 129 + 27 - -2 + 5 ^ 63 + 29 - -59 + 15;
        Q.lllIIlIIIIl[8] = 0x68 ^ 0x73 ^ (0x61 ^ 0x7C);
        Q.lllIIlIIIIl[9] = 0x83 ^ 0xB2 ^ (0x91 ^ 0xA7);
        Q.lllIIlIIIIl[10] = 0x69 ^ 0 ^ (0xD1 ^ 0xB0);
    }

    @Inject
    public Q(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.SMITHING);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var2_2;
        if (Q.lIlIllIllIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllIIlIIIIl[2]);
        }
        if (Q.lIlIllIllIlIlI(Movement.isRunEnabled() ? 1 : 0) && Q.lIlIllIllIlIll(Movement.getRunEnergy(), lllIIlIIIIl[3])) {
            Movement.toggleRun();
            return lllIIlIIIIl[2];
        }
        Widget var15 = Widgets.get((WidgetInfo)WidgetInfo.SMITHING_INVENTORY_ITEMS_CONTAINER);
        if (Q.lIlIllIllIllII(var15)) {
            Q var16;
            String[] stringArray = new String[lllIIlIIIIl[1]];
            stringArray[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[2]];
            if (Q.lIlIllIllIlIlI(Widgets.get((WidgetInfo)var16.j.smithingProduct().Q()).hasAction(stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIIlIIIIl[1]];
                stringArray2[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[1]];
                if (Q.lIlIllIllIlIlI(Widgets.get((WidgetInfo)var16.j.smithingProduct().Q()).hasAction(stringArray2) ? 1 : 0)) {
                    Log.info((String)lllIIlIIIII[lllIIlIIIIl[4]]);
                    return lllIIlIIIIl[2];
                }
            }
            String[] stringArray3 = new String[lllIIlIIIIl[4]];
            stringArray3[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[5]];
            stringArray3[Q.lllIIlIIIIl[1]] = lllIIlIIIII[lllIIlIIIIl[6]];
            Widgets.get((WidgetInfo)var16.j.smithingProduct().Q()).interact(stringArray3);
            var16.sleep(var16.i());
            return lllIIlIIIIl[1];
        }
        TileObject var8 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (Q.lIlIllIllIllII(tileObject.getActions())) {
                String[] stringArray = new String[lllIIlIIIIl[1]];
                stringArray[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[9]];
                if (Q.lIlIllIllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIlIIIIl[1];
                    0;
                    if (3 > 0) return n2 != 0;
                    return ((0x5D ^ 0x54 ^ (0x31 ^ 0x21)) & (62 + 152 - 130 + 73 ^ 72 + 131 - 102 + 31 ^ -1)) != 0;
                }
            }
            n2 = lllIIlIIIIl[2];
            return n2 != 0;
        });
        if (Q.lIlIllIllIllIl(var8)) {
            Log.info((String)lllIIlIIIII[lllIIlIIIIl[7]]);
            return lllIIlIIIIl[2];
        }
        var2_2.interact(lllIIlIIIII[lllIIlIIIIl[8]]);
        this.sleep(lllIIlIIIIl[4]);
        return lllIIlIIIIl[1];
    }

    static {
        Q.lIlIllIllIlIII();
        Q.lIlIllIllIIlll();
    }

    private static boolean lIlIllIllIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllIllIlIlI(int n2) {
        return n2 == 0;
    }

    private static String lIlIllIllIIllI(String var18, String var4) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var19 = var4.toCharArray();
        int var21 = lllIIlIIIIl[2];
        char[] var14 = var18.toCharArray();
        int var12 = var14.length;
        int var20 = lllIIlIIIIl[2];
        while (Q.lIlIllIllIlllI(var20, var12)) {
            char var13 = var14[var20];
            var9.append((char)(var13 ^ var19[var21 % var19.length]));
            0;
            ++var21;
            ++var20;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    @Override
    public int i() {
        return lllIIlIIIIl[5];
    }

    private static boolean lIlIllIllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIllIIlll() {
        lllIIlIIIII = new String[lllIIlIIIIl[10]];
        Q.lllIIlIIIII[Q.lllIIlIIIIl[2]] = Q."Smith";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[1]] = Q."Smith set";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[4]] = Q."something is wrong";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[5]] = Q."Smith";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[6]] = Q."Smith set";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[7]] = Q."Cant find an anvil";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[8]] = Q."Smith";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[9]] = Q."Smith";
    }

    private static String lIlIllIllIIlII(String var10, String var17) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lllIIlIIIIl[10]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lllIIlIIIIl[4], var5);
            return new String(var11.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIllIllIl(Object object) {
        return object == null;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIlIIIIl[0], lllIIlIIIIl[1], this.j.smithingBar().p(), this.j.smithingProduct().R());
    }
}

