/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.Y;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Withdrawing items", priority=19000, blocking=true)
public class aa
extends Y {
    private static /* synthetic */ int[] lIlIIllIIlll;
    private static /* synthetic */ String[] lIlIIllIIllI;
    private final /* synthetic */ int cz = 0xF0000A;

    public aa() {
        this.cz = lIlIIllIIlll[0];
    }

    private static boolean llIllIlIIlIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cs() {
        void var3_4;
        int[] nArray = new int[lIlIIllIIlll[3]];
        nArray[aa.lIlIIllIIlll[1]] = lIlIIllIIlll[4];
        if (aa.llIllIlIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIllIIlll[1];
        }
        if (aa.llIllIlIIlIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIIllIIlll[3];
        }
        if (aa.llIllIlIIlIIII(Dialog.isViewingOptions() ? 1 : 0) && aa.llIllIlIIlIIII(Dialog.hasOption((String)lIlIIllIIllI[lIlIIllIIlll[7]]) ? 1 : 0) && aa.llIllIlIIlIIII(Dialog.hasOption((String)lIlIIllIIllI[lIlIIllIIlll[5]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIllIIlll[3]];
            stringArray[aa.lIlIIllIIlll[1]] = lIlIIllIIllI[lIlIIllIIlll[8]];
            Dialog.chooseOption((String[])stringArray);
            "".length();
            return lIlIIllIIlll[3];
        }
        Widget lllllllllllllllIllIllIIIlIllIIIl = Widgets.get((int)lIlIIllIIlll[9], (int)lIlIIllIIlll[10], (int)lIlIIllIIlll[1]);
        if (aa.llIllIlIIIlllI(lllllllllllllllIllIllIIIlIllIIIl) && aa.llIllIlIIlIIII(lllllllllllllllIllIllIIIlIllIIIl.isVisible() ? 1 : 0) && aa.llIllIlIIlIIII(lllllllllllllllIllIllIIIlIllIIIl.getText().contains(lIlIIllIIllI[lIlIIllIIlll[6]]) ? 1 : 0)) {
            Widget lllllllllllllllIllIllIIIlIllIIII = Widgets.get((int)lIlIIllIIlll[9], (int)lIlIIllIIlll[10]);
            if (aa.llIllIlIIlIIIl(lllllllllllllllIllIllIIIlIllIIII)) {
                return lIlIIllIIlll[1];
            }
            lllllllllllllllIllIllIIIlIllIIII.interact(lIlIIllIIllI[lIlIIllIIlll[2]]);
            return lIlIIllIIlll[3];
        }
        Widget lllllllllllllllIllIllIIIlIllIIII = Static.getClient().getWidget(lIlIIllIIlll[0]);
        if (aa.llIllIlIIIlllI(lllllllllllllllIllIllIIIlIllIIII)) {
            lllllllllllllllIllIllIIIlIllIIII.interact(lIlIIllIIlll[3], lIlIIllIIlll[11], lIlIIllIIlll[12], lIlIIllIIlll[0]);
            return lIlIIllIIlll[3];
        }
        int[] nArray2 = new int[lIlIIllIIlll[3]];
        nArray2[aa.lIlIIllIIlll[1]] = lIlIIllIIlll[4];
        Item lllllllllllllllIllIllIIIlIlIllll = Inventory.getFirst((int[])nArray2);
        if (aa.llIllIlIIlIIIl(lllllllllllllllIllIllIIIlIlIllll)) {
            return lIlIIllIIlll[1];
        }
        var3_4.interact(lIlIIllIIllI[lIlIIllIIlll[13]]);
        return lIlIIllIIlll[3];
    }

    private static boolean llIllIlIIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllIlIIIlllI(Object object) {
        return object != null;
    }

    private static String llIllIlIIIlIlI(String lllllllllllllllIllIllIIIlIIllIII, String lllllllllllllllIllIllIIIlIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIlIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIlIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIIIlIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIIIlIIllIlI.init(lIlIIllIIlll[7], lllllllllllllllIllIllIIIlIIllIll);
            return new String(lllllllllllllllIllIllIIIlIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIIlIIllIIl) {
            lllllllllllllllIllIllIIIlIIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIllIlIIIllII() {
        lIlIIllIIlll = new int[17];
        aa.lIlIIllIIlll[0] = 0xFFFFDFFB & 0xF0200E;
        aa.lIlIIllIIlll[1] = (144 + 110 - 77 + 74 ^ 35 + 67 - 59 + 125) & (144 + 170 - 122 + 10 ^ 115 + 129 - 129 + 38 ^ -" ".length());
        aa.lIlIIllIIlll[2] = 0xB0 ^ 0xB6;
        aa.lIlIIllIIlll[3] = " ".length();
        aa.lIlIIllIIlll[4] = 0xFFFFDB27 & 0x76FB;
        aa.lIlIIllIIlll[5] = "   ".length();
        aa.lIlIIllIIlll[6] = 0x37 ^ 0x7A ^ (0x24 ^ 0x6C);
        aa.lIlIIllIIlll[7] = "  ".length();
        aa.lIlIIllIIlll[8] = 0xBC ^ 0xA6 ^ (0x55 ^ 0x4B);
        aa.lIlIIllIIlll[9] = 208 + 225 - 292 + 99;
        aa.lIlIIllIIlll[10] = 75 + 97 - 65 + 20 ^ (0x4E ^ 0x2B);
        aa.lIlIIllIIlll[11] = 130 + 77 - 63 + 4 ^ 132 + 56 - 49 + 34;
        aa.lIlIIllIIlll[12] = -" ".length();
        aa.lIlIIllIIlll[13] = 0x2A ^ 0x2D;
        aa.lIlIIllIIlll[14] = 0x7E ^ 0x76;
        aa.lIlIIllIIlll[15] = 0x92 ^ 0x9B;
        aa.lIlIIllIIlll[16] = 0x15 ^ 0x77 ^ (0x50 ^ 0x38);
    }

    private static String llIllIlIIIlIII(String lllllllllllllllIllIllIIIlIlIIlIl, String lllllllllllllllIllIllIIIlIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIlIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIllIIlll[14]), "DES");
            Cipher lllllllllllllllIllIllIIIlIlIIlll = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIIlIlIIlll.init(lIlIIllIIlll[7], lllllllllllllllIllIllIIIlIlIlIII);
            return new String(lllllllllllllllIllIllIIIlIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIIlIlIIllI) {
            lllllllllllllllIllIllIIIlIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIIlIIII(int n2) {
        return n2 != 0;
    }

    private static void llIllIlIIIlIll() {
        lIlIIllIIllI = new String[lIlIIllIIlll[16]];
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[1]] = aa.llIllIlIIIlIII("HII2Wz28uokskFq+166vWXfzdMM9VEYJp2So1xY/XTE=", "xzFQf");
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[3]] = aa.llIllIlIIIlIIl("KREHMwUFF0k+DQIcDDxMXlAdMQEOA0kxAksRSSoDHFxJKxgEABkxAgw=", "kpiXl");
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[7]] = aa.llIllIlIIIlIII("aafABLttQHo=", "cwoOs");
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[5]] = aa.llIllIlIIIlIII("QpsDYqmh8sE4ksW9EsKGSg==", "pTbIe");
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[8]] = aa.llIllIlIIIlIlI("osAuS4gZWZk=", "yRhvG");
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[6]] = aa.llIllIlIIIlIIl("DxY8ET8oASs=", "GsNsS");
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[2]] = aa.llIllIlIIIlIlI("xVsx0xnqqik=", "hjWeZ");
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[13]] = aa.llIllIlIIIlIlI("C9BpP0V1+10=", "qpZXH");
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[14]] = aa.llIllIlIIIlIIl("EQgoMXIwASMpJg==", "SiFZR");
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[15]] = aa.llIllIlIIIlIlI("L0MxvYLAfng=", "cVJpS");
    }

    static {
        aa.llIllIlIIIllII();
        aa.llIllIlIIIlIll();
    }

    @Override
    public boolean cg() {
        aa lllllllllllllllIllIllIIIlIllIllI;
        if (aa.llIllIlIIIllIl(this.cr() ? 1 : 0)) {
            return lIlIIllIIlll[1];
        }
        if (aa.llIllIlIIIllIl(cw ? 1 : 0)) {
            return lIlIIllIIlll[1];
        }
        TileObject lllllllllllllllIllIllIIIlIllIlIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aa.llIllIlIIlIIII(tileObject.getName().equals(lIlIIllIIllI[lIlIIllIIlll[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIIlll[3]];
                stringArray[aa.lIlIIllIIlll[1]] = lIlIIllIIllI[lIlIIllIIlll[15]];
                if (aa.llIllIlIIlIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIllIIlll[3];
                    "".length();
                    if (-" ".length() <= 0) return n2 != 0;
                    return ((24 + 237 - 182 + 160 ^ 79 + 15 - -12 + 73) & (0x25 ^ 0x6A ^ (0xA ^ 0x19) ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIIllIIlll[1];
            return n2 != 0;
        });
        if (aa.llIllIlIIIlllI(lllllllllllllllIllIllIIIlIllIlIl) && aa.llIllIlIIIllll(Players.getLocal().distanceTo((Locatable)lllllllllllllllIllIllIIIlIllIlIl), lIlIIllIIlll[2])) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIllIIIlIllIlIl.getWorldLocation());
            return lIlIIllIIlll[3];
        }
        int[] nArray = new int[lIlIIllIIlll[3]];
        nArray[aa.lIlIIllIIlll[1]] = lIlIIllIIlll[4];
        if (aa.llIllIlIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllIllIllIIIlIllIllI.cs();
            "".length();
            return lIlIIllIIlll[3];
        }
        if (aa.llIllIlIIlIIIl(lllllllllllllllIllIllIIIlIllIllI.q())) {
            Log.error((String)lIlIIllIIllI[lIlIIllIIlll[1]]);
            return lIlIIllIIlll[1];
        }
        if (aa.llIllIlIIIllIl(lllllllllllllllIllIllIIIlIllIllI.q().needsToBank() ? 1 : 0)) {
            if (aa.llIllIlIIIllIl(Bank.isOpen() ? 1 : 0)) {
                lllllllllllllllIllIllIIIlIllIllI.v.b(lIlIIllIIlll[1]);
                return lIlIIllIIlll[1];
            }
            Bank.close();
            lllllllllllllllIllIllIIIlIllIllI.sleep(lIlIIllIIlll[5]);
            return lIlIIllIIlll[3];
        }
        if (aa.llIllIlIIIllIl(BankLoadouts.withdrawWithRetries((BankLoadout)lllllllllllllllIllIllIIIlIllIllI.q(), (int)lIlIIllIIlll[6]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIlIIllIIllI[lIlIIllIIlll[3]]);
            return lIlIIllIIlll[1];
        }
        this.sleep(lIlIIllIIlll[7]);
        return lIlIIllIIlll[3];
    }

    private static String llIllIlIIIlIIl(String lllllllllllllllIllIllIIIlIIIIIll, String lllllllllllllllIllIllIIIlIIIIlll) {
        lllllllllllllllIllIllIIIlIIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIIIlIIIIllI = new StringBuilder();
        char[] lllllllllllllllIllIllIIIlIIIIlIl = lllllllllllllllIllIllIIIlIIIIlll.toCharArray();
        int lllllllllllllllIllIllIIIlIIIIlII = lIlIIllIIlll[1];
        char[] lllllllllllllllIllIllIIIIllllllI = lllllllllllllllIllIllIIIlIIIIIll.toCharArray();
        int lllllllllllllllIllIllIIIIlllllIl = lllllllllllllllIllIllIIIIllllllI.length;
        int lllllllllllllllIllIllIIIIlllllII = lIlIIllIIlll[1];
        while (aa.llIllIlIIlIIlI(lllllllllllllllIllIllIIIIlllllII, lllllllllllllllIllIllIIIIlllllIl)) {
            char lllllllllllllllIllIllIIIlIIIlIIl = lllllllllllllllIllIllIIIIllllllI[lllllllllllllllIllIllIIIIlllllII];
            lllllllllllllllIllIllIIIlIIIIllI.append((char)(lllllllllllllllIllIllIIIlIIIlIIl ^ lllllllllllllllIllIllIIIlIIIIlIl[lllllllllllllllIllIllIIIlIIIIlII % lllllllllllllllIllIllIIIlIIIIlIl.length]));
            "".length();
            ++lllllllllllllllIllIllIIIlIIIIlII;
            ++lllllllllllllllIllIllIIIIlllllII;
            "".length();
            if ((0x1B ^ 0x1F) == (0x4D ^ 0x49)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIIIlIIIIllI);
    }

    private static boolean llIllIlIIIllIl(int n2) {
        return n2 == 0;
    }
}

