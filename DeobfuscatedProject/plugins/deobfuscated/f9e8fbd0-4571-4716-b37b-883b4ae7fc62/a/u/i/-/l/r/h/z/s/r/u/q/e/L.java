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

import a.u.i.-.l.r.h.z.s.r.u.q.e.P;
import a.u.i.-.l.r.h.z.s.r.u.q.e.c;
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

@TaskDesc(name="Collecting items", priority=0x7FFFFFFE, blocking=true, register=true)
public class L
extends P {
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

    private static String llIIlIIIllIlIII(String llllllllllllllIllIIIlIllIIllllll, String llllllllllllllIllIIIlIllIIllllIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIllIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIllIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIllIlIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIllIlIIIIll.init(lIllIllIIllII[5], llllllllllllllIllIIIlIllIlIIIlIl);
            return new String(llllllllllllllIllIIIlIllIlIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIllIlIIIIIl) {
            llllllllllllllIllIIIlIllIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIIllIlIIl(String llllllllllllllIllIIIlIllIllllIII, String llllllllllllllIllIIIlIllIlllIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIllIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIllIlllIlIl.getBytes(StandardCharsets.UTF_8)), lIllIllIIllII[12]), "DES");
            Cipher llllllllllllllIllIIIlIllIllllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIllIllllIlI.init(lIllIllIIllII[5], llllllllllllllIllIIIlIllIllllIll);
            return new String(llllllllllllllIllIIIlIllIllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIllIllllIIl) {
            llllllllllllllIllIIIlIllIllllIIl.printStackTrace();
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
        String llllllllllllllIllIIIlIlllIIIlIII;
        String[] llllllllllllllIllIIIlIlllIIIIllI;
        L llllllllllllllIllIIIlIlllIIIllII;
        Item llllllllllllllIllIIIlIlllIIIlIlI;
        int[] nArray = new int[lIllIllIIllII[0]];
        nArray[L.lIllIllIIllII[1]] = lIllIllIIllII[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (L.llIIlIIIlllIIIl(nPC)) {
            return lIllIllIIllII[1];
        }
        int[] nArray2 = new int[lIllIllIIllII[0]];
        nArray2[L.lIllIllIIllII[1]] = lIllIllIIllII[3];
        if (L.llIIlIIIlllIIlI(Inventory.contains((int[])nArray2) ? 1 : 0) && L.llIIlIIIlllIIll(llllllllllllllIllIIIlIlllIIIlIlI = Inventory.getFirst(item -> item.getName().endsWith(lIllIllIIlIlI[lIllIllIIllII[10]])))) {
            int[] nArray3 = new int[lIllIllIIllII[0]];
            nArray3[L.lIllIllIIllII[1]] = lIllIllIIllII[3];
            llllllllllllllIllIIIlIlllIIIlIlI.useOn(Inventory.getFirst((int[])nArray3));
            return lIllIllIIllII[0];
        }
        if (L.llIIlIIIlllIIlI(Dialog.isOpen() ? 1 : 0) && L.llIIlIIIlllIIlI(Dialog.getText().contains(lIllIllIIlIlI[lIllIllIIllII[1]]) ? 1 : 0)) {
            llllllllllllllIllIIIlIlllIIIllII.al.a(c.DONE);
        }
        if (L.llIIlIIIlllIIlI(Widgets.isVisible((Widget)(llllllllllllllIllIIIlIlllIIIlIlI = llllllllllllllIllIIIlIlllIIIllII.aj.getWidget(lIllIllIIllII[4]))) ? 1 : 0) && L.llIIlIIIlllIIlI((llllllllllllllIllIIIlIlllIIIIllI = (llllllllllllllIllIIIlIlllIIIlIII = llllllllllllllIllIIIlIlllIIIlIlI.getText()).split(lIllIllIIlIlI[lIllIllIIllII[0]]))[lIllIllIIllII[1]].contains(lIllIllIIlIlI[lIllIllIIllII[5]]) ? 1 : 0)) {
            llllllllllllllIllIIIlIlllIIIllII.al.a(c.DONE);
            return lIllIllIIllII[1];
        }
        llllllllllllllIllIIIlIlllIIIlIII = llllllllllllllIllIIIlIlllIIIllII.aj.getWidget(lIllIllIIllII[6]);
        if (L.llIIlIIIlllIIlI(Widgets.isVisible((Widget)llllllllllllllIllIIIlIlllIIIlIII) ? 1 : 0)) {
            String[] stringArray = new String[lIllIllIIllII[5]];
            stringArray[L.lIllIllIIllII[1]] = lIllIllIIlIlI[lIllIllIIllII[7]];
            stringArray[L.lIllIllIIllII[0]] = lIllIllIIlIlI[lIllIllIIllII[8]];
            llllllllllllllIllIIIlIlllIIIlIII.interact(stringArray);
            return lIllIllIIllII[0];
        }
        nPC.interact(lIllIllIIlIlI[lIllIllIIllII[9]]);
        return lIllIllIIllII[0];
    }

    private static String llIIlIIIllIlIll(String llllllllllllllIllIIIlIllIlIlllIl, String llllllllllllllIllIIIlIllIllIIlIl) {
        llllllllllllllIllIIIlIllIlIlllIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIllIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIllIllIIIll = new StringBuilder();
        char[] llllllllllllllIllIIIlIllIllIIIIl = llllllllllllllIllIIIlIllIllIIlIl.toCharArray();
        int llllllllllllllIllIIIlIllIlIlllll = lIllIllIIllII[1];
        char[] llllllllllllllIllIIIlIllIlIlIIll = llllllllllllllIllIIIlIllIlIlllIl.toCharArray();
        int llllllllllllllIllIIIlIllIlIlIIIl = llllllllllllllIllIIIlIllIlIlIIll.length;
        int llllllllllllllIllIIIlIllIlIIllll = lIllIllIIllII[1];
        while (L.llIIlIIIlllIlIl(llllllllllllllIllIIIlIllIlIIllll, llllllllllllllIllIIIlIllIlIlIIIl)) {
            char llllllllllllllIllIIIlIllIllIlIII = llllllllllllllIllIIIlIllIlIlIIll[llllllllllllllIllIIIlIllIlIIllll];
            llllllllllllllIllIIIlIllIllIIIll.append((char)(llllllllllllllIllIIIlIllIllIlIII ^ llllllllllllllIllIIIlIllIllIIIIl[llllllllllllllIllIIIlIllIlIlllll % llllllllllllllIllIIIlIllIllIIIIl.length]));
            0;
            ++llllllllllllllIllIIIlIllIlIlllll;
            ++llllllllllllllIllIIIlIllIlIIllll;
            0;
            if ((0x69 ^ 0x6D) >= 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlIllIllIIIll);
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

