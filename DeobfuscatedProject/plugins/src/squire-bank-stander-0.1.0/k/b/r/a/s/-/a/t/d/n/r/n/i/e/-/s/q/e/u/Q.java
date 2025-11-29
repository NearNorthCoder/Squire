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
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Smithing")
public class Q
extends a {
    private static /* synthetic */ int[] lllIIlIIIIl;
    private static /* synthetic */ String[] lllIIlIIIII;

    private static boolean lIlIllIllIllII(Object object) {
        return object != null;
    }

    private static String lIlIllIllIIlIl(String llllllllllllllllIIlIlIIIllIIllll, String llllllllllllllllIIlIlIIIllIlIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIIllIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIIllIlIIll.init(lllIIlIIIIl[4], llllllllllllllllIIlIlIIIllIlIlII);
            return new String(llllllllllllllllIIlIlIIIllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIllIlIIlI) {
            llllllllllllllllIIlIlIIIllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllIlIII() {
        lllIIlIIIIl = new int[11];
        Q.lllIIlIIIIl[0] = 0xFFFF9F2F & 0x69FB;
        Q.lllIIlIIIIl[1] = " ".length();
        Q.lllIIlIIIIl[2] = (0x28 ^ 3 ^ (0x14 ^ 0x74)) & (0xE2 ^ 0x97 ^ (0xF8 ^ 0xC6) ^ -" ".length());
        Q.lllIIlIIIIl[3] = 0x93 ^ 0x99;
        Q.lllIIlIIIIl[4] = "  ".length();
        Q.lllIIlIIIIl[5] = "   ".length();
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
        Widget llllllllllllllllIIlIlIIIllIlllII = Widgets.get((WidgetInfo)WidgetInfo.SMITHING_INVENTORY_ITEMS_CONTAINER);
        if (Q.lIlIllIllIllII(llllllllllllllllIIlIlIIIllIlllII)) {
            Q llllllllllllllllIIlIlIIIllIlllIl;
            String[] stringArray = new String[lllIIlIIIIl[1]];
            stringArray[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[2]];
            if (Q.lIlIllIllIlIlI(Widgets.get((WidgetInfo)llllllllllllllllIIlIlIIIllIlllIl.j.smithingProduct().Q()).hasAction(stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIIlIIIIl[1]];
                stringArray2[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[1]];
                if (Q.lIlIllIllIlIlI(Widgets.get((WidgetInfo)llllllllllllllllIIlIlIIIllIlllIl.j.smithingProduct().Q()).hasAction(stringArray2) ? 1 : 0)) {
                    Log.info((String)lllIIlIIIII[lllIIlIIIIl[4]]);
                    return lllIIlIIIIl[2];
                }
            }
            String[] stringArray3 = new String[lllIIlIIIIl[4]];
            stringArray3[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[5]];
            stringArray3[Q.lllIIlIIIIl[1]] = lllIIlIIIII[lllIIlIIIIl[6]];
            Widgets.get((WidgetInfo)llllllllllllllllIIlIlIIIllIlllIl.j.smithingProduct().Q()).interact(stringArray3);
            llllllllllllllllIIlIlIIIllIlllIl.sleep(llllllllllllllllIIlIlIIIllIlllIl.i());
            return lllIIlIIIIl[1];
        }
        TileObject llllllllllllllllIIlIlIIIllIllIll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (Q.lIlIllIllIllII(tileObject.getActions())) {
                String[] stringArray = new String[lllIIlIIIIl[1]];
                stringArray[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[9]];
                if (Q.lIlIllIllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIlIIIIl[1];
                    "".length();
                    if ("   ".length() > 0) return n2 != 0;
                    return ((0x5D ^ 0x54 ^ (0x31 ^ 0x21)) & (62 + 152 - 130 + 73 ^ 72 + 131 - 102 + 31 ^ -" ".length())) != 0;
                }
            }
            n2 = lllIIlIIIIl[2];
            return n2 != 0;
        });
        if (Q.lIlIllIllIllIl(llllllllllllllllIIlIlIIIllIllIll)) {
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

    private static String lIlIllIllIIllI(String llllllllllllllllIIlIlIIIlIlIllll, String llllllllllllllllIIlIlIIIlIllIIll) {
        llllllllllllllllIIlIlIIIlIlIllll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIIlIllIIlI = new StringBuilder();
        char[] llllllllllllllllIIlIlIIIlIllIIIl = llllllllllllllllIIlIlIIIlIllIIll.toCharArray();
        int llllllllllllllllIIlIlIIIlIllIIII = lllIIlIIIIl[2];
        char[] llllllllllllllllIIlIlIIIlIlIlIlI = llllllllllllllllIIlIlIIIlIlIllll.toCharArray();
        int llllllllllllllllIIlIlIIIlIlIlIIl = llllllllllllllllIIlIlIIIlIlIlIlI.length;
        int llllllllllllllllIIlIlIIIlIlIlIII = lllIIlIIIIl[2];
        while (Q.lIlIllIllIlllI(llllllllllllllllIIlIlIIIlIlIlIII, llllllllllllllllIIlIlIIIlIlIlIIl)) {
            char llllllllllllllllIIlIlIIIlIllIlIl = llllllllllllllllIIlIlIIIlIlIlIlI[llllllllllllllllIIlIlIIIlIlIlIII];
            llllllllllllllllIIlIlIIIlIllIIlI.append((char)(llllllllllllllllIIlIlIIIlIllIlIl ^ llllllllllllllllIIlIlIIIlIllIIIl[llllllllllllllllIIlIlIIIlIllIIII % llllllllllllllllIIlIlIIIlIllIIIl.length]));
            "".length();
            ++llllllllllllllllIIlIlIIIlIllIIII;
            ++llllllllllllllllIIlIlIIIlIlIlIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIIIlIllIIlI);
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
        Q.lllIIlIIIII[Q.lllIIlIIIIl[2]] = Q.lIlIllIllIIlII("TqzGyZzLsN0=", "mlrta");
        Q.lllIIlIIIII[Q.lllIIlIIIIl[1]] = Q.lIlIllIllIIlII("z+ydY8q53SCscZ3kP1OBwA==", "DngUa");
        Q.lllIIlIIIII[Q.lllIIlIIIIl[4]] = Q.lIlIllIllIIlIl("xK5BHk57/cQq/kwIn9zQ4c3BM/i++YMC", "AKOEz");
        Q.lllIIlIIIII[Q.lllIIlIIIIl[5]] = Q.lIlIllIllIIlIl("j9MykQCTShk=", "ekcYk");
        Q.lllIIlIIIII[Q.lllIIlIIIIl[6]] = Q.lIlIllIllIIllI("MhQ9FiRBCjEW", "ayTbL");
        Q.lllIIlIIIII[Q.lllIIlIIIIl[7]] = Q.lIlIllIllIIlII("UEmlixZsMT19xnDVK7E87wIIv76OTNl1", "hGKhW");
        Q.lllIIlIIIII[Q.lllIIlIIIIl[8]] = Q.lIlIllIllIIlII("Xp2EJufChE8=", "HYvqU");
        Q.lllIIlIIIII[Q.lllIIlIIIIl[9]] = Q.lIlIllIllIIllI("AQUzJgA=", "RhZRh");
    }

    private static String lIlIllIllIIlII(String llllllllllllllllIIlIlIIIllIIIIlI, String llllllllllllllllIIlIlIIIllIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), lllIIlIIIIl[10]), "DES");
            Cipher llllllllllllllllIIlIlIIIllIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIIllIIIllI.init(lllIIlIIIIl[4], llllllllllllllllIIlIlIIIllIIIlll);
            return new String(llllllllllllllllIIlIlIIIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIllIIIlIl) {
            llllllllllllllllIIlIlIIIllIIIlIl.printStackTrace();
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

