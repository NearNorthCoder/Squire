/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.P_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.PluginState;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Collecting items -> CollectingitemsTask */
@TaskDesc(name="Collecting items", priority=0x7FFFFFFE, blocking=true, register=true)
public class CollectingItemsTask
extends P_Unknown {
    private static /* synthetic */ int[] lIllIllIIllII;
    private static final /* synthetic */ int ag;
    private static final /* synthetic */ int af;
    private static /* synthetic */ String[] lIllIllIIlIlI;

    static {
        L.llIIlIIIlllIIII();
        L.llIIlIIIllIllII();
        af = lIllIllIIllII[6];
        ag = lIllIllIIllII[4];
    }

    @Inject
    public L(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.COLLECTING_ZULRAH);
    }

    private static String llIIlIIIllIlIII(String var5, String var7) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIllIllIIllII[5], var21);
            return new String(var13.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIIllIlIIl(String var17, String var6) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIllIllIIllII[12]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIllIllIIllII[5], var9);
            return new String(var1.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIlllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIlllIIll(Object object) {
        return object != null;
    }

    private static boolean llIIlIIIlllIIIl(Object object) {
        return object == null;
    }

    @Override
    public boolean ac() {
        String var8;
        String[] var19;
        L var16;
        Item var18;
        int[] nArray = new int[lIllIllIIllII[0]];
        nArray[L.lIllIllIIllII[1]] = lIllIllIIllII[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (L.llIIlIIIlllIIIl(nPC)) {
            return lIllIllIIllII[1];
        }
        int[] nArray2 = new int[lIllIllIIllII[0]];
        nArray2[L.lIllIllIIllII[1]] = lIllIllIIllII[3];
        if (L.llIIlIIIlllIIlI(Inventory.contains((int[])nArray2) ? 1 : 0) && L.llIIlIIIlllIIll(var18 = Inventory.getFirst(item -> item.getName().endsWith(lIllIllIIlIlI[lIllIllIIllII[10]])))) {
            int[] nArray3 = new int[lIllIllIIllII[0]];
            nArray3[L.lIllIllIIllII[1]] = lIllIllIIllII[3];
            var18.useOn(Inventory.getFirst((int[])nArray3));
            return lIllIllIIllII[0];
        }
        if (L.llIIlIIIlllIIlI(Dialog.isOpen() ? 1 : 0) && L.llIIlIIIlllIIlI(Dialog.getText().contains(lIllIllIIlIlI[lIllIllIIllII[1]]) ? 1 : 0)) {
            var16.al.a(c.DONE);
        }
        if (L.llIIlIIIlllIIlI(Widgets.isVisible((Widget)(var18 = var16.aj.getWidget(lIllIllIIllII[4]))) ? 1 : 0) && L.llIIlIIIlllIIlI((var19 = (var8 = var18.getText()).split(lIllIllIIlIlI[lIllIllIIllII[0]]))[lIllIllIIllII[1]].contains(lIllIllIIlIlI[lIllIllIIllII[5]]) ? 1 : 0)) {
            var16.al.a(c.DONE);
            return lIllIllIIllII[1];
        }
        var8 = var16.aj.getWidget(lIllIllIIllII[6]);
        if (L.llIIlIIIlllIIlI(Widgets.isVisible((Widget)var8) ? 1 : 0)) {
            String[] stringArray = new String[lIllIllIIllII[5]];
            stringArray[L.lIllIllIIllII[1]] = lIllIllIIlIlI[lIllIllIIllII[7]];
            stringArray[L.lIllIllIIllII[0]] = lIllIllIIlIlI[lIllIllIIllII[8]];
            var8.interact(stringArray);
            return lIllIllIIllII[0];
        }
        nPC.interact(lIllIllIIlIlI[lIllIllIIllII[9]]);
        return lIllIllIIllII[0];
    }

    private static String llIIlIIIllIlIll(String var23, String var20) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var2 = var20.toCharArray();
        int var22 = lIllIllIIllII[1];
        char[] var10 = var23.toCharArray();
        int var3 = var10.length;
        int var14 = lIllIllIIllII[1];
        while (L.llIIlIIIlllIlIl(var14, var3)) {
            char var15 = var10[var14];
            var11.append((char)(var15 ^ var2[var22 % var2.length]));
            0;
            ++var22;
            ++var14;
            0;
            if ((0x69 ^ 0x6D) >= 3) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean llIIlIIIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIIllIllII() {
        lIllIllIIlIlI = new String[lIllIllIIllII[11]];
        L.lIllIllIIlIlI[L.lIllIllIIllII[1]] = L."I'm afraid I don't have";
        L.lIllIllIIlIlI[L.lIllIllIIllII[0]] = L."<br>";
        L.lIllIllIIlIlI[L.lIllIllIIllII[5]] = L.">0<";
        L.lIllIllIIlIlI[L.lIllIllIIllII[7]] = L."Unlock";
        L.lIllIllIIlIlI[L.lIllIllIIllII[8]] = L."Take-All";
        L.lIllIllIIlIlI[L.lIllIllIIllII[9]] = L."Collect";
        L.lIllIllIIlIlI[L.lIllIllIIllII[10]] = L."rune";
    }

    private static void llIIlIIIlllIIII() {
        lIllIllIIllII = new int[13];
        L.lIllIllIIllII[0] = 1;
        L.lIllIllIIllII[1] = (0xAA ^ 0x83 ^ (0xB ^ 0xF)) & (103 + 110 - 79 + 40 ^ 95 + 2 - -1 + 33 ^ -1);
        L.lIllIllIIllII[2] = 0xFFFFBFFB & 0x47F5;
        L.lIllIllIIllII[3] = 0xFFFFF3F7 & 0x3DFF;
        L.lIllIllIIllII[4] = 0xFFFFE6BE & 0x25A194B;
        L.lIllIllIIllII[5] = 2;
        L.lIllIllIIllII[6] = 0xFFFFEE57 & 0x25A11AE;
        L.lIllIllIIllII[7] = 3;
        L.lIllIllIIllII[8] = 0xF2 ^ 0x9A ^ (0x63 ^ 0xF);
        L.lIllIllIIllII[9] = 0x49 ^ 0x4C;
        L.lIllIllIIllII[10] = 0x99 ^ 0x9F;
        L.lIllIllIIllII[11] = 0x29 ^ 0x2E;
        L.lIllIllIIllII[12] = 0x8D ^ 0x85;
    }
}

