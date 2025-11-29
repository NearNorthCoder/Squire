/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Entering Minigame", priority=2, blocking=true)
public class z
extends h {
    private static final /* synthetic */ String bg;
    private static /* synthetic */ int[] llIIllIIlllI;
    private static final /* synthetic */ String bh;
    private static /* synthetic */ String[] llIIllIIllIl;
    private /* synthetic */ boolean bi;
    private static final /* synthetic */ int bf;

    private static String llllllIIlIIIIl(String lllllllllllllllIlIIllIllIIIlllll, String lllllllllllllllIlIIllIllIIIllIIl) {
        lllllllllllllllIlIIllIllIIIlllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIllIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIllIIIlllIl = new StringBuilder();
        char[] lllllllllllllllIlIIllIllIIIlllII = lllllllllllllllIlIIllIllIIIllIIl.toCharArray();
        int lllllllllllllllIlIIllIllIIIllIll = llIIllIIlllI[1];
        char[] lllllllllllllllIlIIllIllIIIlIlIl = lllllllllllllllIlIIllIllIIIlllll.toCharArray();
        int lllllllllllllllIlIIllIllIIIlIlII = lllllllllllllllIlIIllIllIIIlIlIl.length;
        int lllllllllllllllIlIIllIllIIIlIIll = llIIllIIlllI[1];
        while (z.llllllIIlIlIlI(lllllllllllllllIlIIllIllIIIlIIll, lllllllllllllllIlIIllIllIIIlIlII)) {
            char lllllllllllllllIlIIllIllIIlIIIII = lllllllllllllllIlIIllIllIIIlIlIl[lllllllllllllllIlIIllIllIIIlIIll];
            lllllllllllllllIlIIllIllIIIlllIl.append((char)(lllllllllllllllIlIIllIllIIlIIIII ^ lllllllllllllllIlIIllIllIIIlllII[lllllllllllllllIlIIllIllIIIllIll % lllllllllllllllIlIIllIllIIIlllII.length]));
            0;
            ++lllllllllllllllIlIIllIllIIIllIll;
            ++lllllllllllllllIlIIllIllIIIlIIll;
            0;
            if ((0x2C ^ 0x28) > -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllIllIIIlllIl);
    }

    private void c(String string) {
        if (z.llllllIIlIlIIl(string.contains(llIIllIIllIl[llIIllIIlllI[7]]) ? 1 : 0)) {
            return;
        }
        String string2 = string.substring(string.indexOf(llIIllIIllIl[llIIllIIlllI[2]])).trim().substring(llIIllIIlllI[1], llIIllIIlllI[6]);
    }

    private static boolean llllllIIlIlIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void llllllIIlIIlII() {
        llIIllIIlllI = new int[11];
        z.llIIllIIlllI[0] = 1;
        z.llIIllIIlllI[1] = (0xA7 ^ 0x81) & ~(0x9E ^ 0xB8);
        z.llIIllIIlllI[2] = 0xB8 ^ 0xBC;
        z.llIIllIIlllI[3] = 0xFFFFEBFF & 0xBEB4;
        z.llIIllIIlllI[4] = 0x79 ^ 1 ^ (0x76 ^ 8);
        z.llIIllIIlllI[5] = 0x5B ^ 0x34 ^ (0x61 ^ 0x1C);
        z.llIIllIIlllI[6] = 2;
        z.llIIllIIlllI[7] = 3;
        z.llIIllIIlllI[8] = 111 + 106 - 178 + 130 ^ 108 + 31 - 52 + 85;
        z.llIIllIIlllI[9] = 0x40 ^ 0x47;
        z.llIIllIIlllI[10] = 60 + 45 - 94 + 159 ^ 2 + 60 - -43 + 57;
    }

    private static boolean llllllIIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        z.llllllIIlIIlII();
        z.llllllIIlIIIll();
        bh = llIIllIIllIl[llIIllIIlllI[8]];
        bg = llIIllIIllIl[llIIllIIlllI[4]];
        bf = llIIllIIlllI[3];
    }

    private static boolean llllllIIlIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllIIlIIllI(Object object) {
        return object != null;
    }

    @Inject
    public z(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllIIlllI[0]];
        cArray[z.llIIllIIlllI[1]] = c.OUTSIDE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean llllllIIlIIlIl(int n2) {
        return n2 != 0;
    }

    private static String llllllIIlIIIII(String lllllllllllllllIlIIllIllIIllllII, String lllllllllllllllIlIIllIllIIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIllIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIllIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIllIIlllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIllIIlllllI.init(llIIllIIlllI[6], lllllllllllllllIlIIllIllIIllllll);
            return new String(lllllllllllllllIlIIllIllIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIllIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIllIIllllIl) {
            lllllllllllllllIlIIllIllIIllllIl.printStackTrace();
            return null;
        }
    }

    private static String llllllIIlIIIlI(String lllllllllllllllIlIIllIllIIlIllIl, String lllllllllllllllIlIIllIllIIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIllIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIllIIlIllII.getBytes(StandardCharsets.UTF_8)), llIIllIIlllI[10]), "DES");
            Cipher lllllllllllllllIlIIllIllIIllIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIllIIllIIIl.init(llIIllIIlllI[6], lllllllllllllllIlIIllIllIIllIIlI);
            return new String(lllllllllllllllIlIIllIllIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIllIIllIIII) {
            lllllllllllllllIlIIllIllIIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIlIlIIl(int n2) {
        return n2 == 0;
    }

    private static void llllllIIlIIIll() {
        llIIllIIllIl = new String[llIIllIIlllI[9]];
        z.llIIllIIllIl[z.llIIllIIlllI[1]] = z."It looks like the rift is already being guarded";
        z.llIIllIIllIl[z.llIIllIIlllI[0]] = z."finishing up";
        z.llIIllIIllIl[z.llIIllIIlllI[6]] = z."Quick-pass";
        z.llIIllIIllIl[z.llIIllIIlllI[7]] = z."Great<br>Guardian power:";
        z.llIIllIIllIl[z.llIIllIIlllI[2]] = z."Great<br>Guardian power:";
        z.llIIllIIllIl[z.llIIllIIlllI[8]] = z."finishing up";
        z.llIIllIIllIl[z.llIIllIIlllI[4]] = z."It looks like the rift is already being guarded";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ak() {
        void var1_1;
        if (z.llllllIIlIIlIl(this.aV.f() ? 1 : 0)) {
            return llIIllIIlllI[1];
        }
        if (z.llllllIIlIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIIllIIlllI[1];
        }
        TileObject lllllllllllllllIlIIllIllIlIIlIlI = TileObjects.getNearest((int[])SquireGOTRPlugin.d);
        if (!z.llllllIIlIIllI(lllllllllllllllIlIIllIllIlIIlIlI) || z.llllllIIlIIlll(lllllllllllllllIlIIllIllIlIIlIlI.distanceTo((Locatable)Players.getLocal()), llIIllIIlllI[2])) {
            return llIIllIIlllI[1];
        }
        if (z.llllllIIlIlIII(lllllllllllllllIlIIllIllIlIIlIlI.getId(), llIIllIIlllI[3])) {
            return llIIllIIlllI[1];
        }
        Widget lllllllllllllllIlIIllIllIlIIlIIl = Widgets.get((WidgetInfo)WidgetInfo.MINIGAME_DIALOG_TEXT);
        if (z.llllllIIlIIllI(lllllllllllllllIlIIllIllIlIIlIIl)) {
            z lllllllllllllllIlIIllIllIlIIlIll;
            String lllllllllllllllIlIIllIllIlIIlIII = lllllllllllllllIlIIllIllIlIIlIIl.getText();
            if (z.llllllIIlIIlIl(lllllllllllllllIlIIllIllIlIIlIII.contains(llIIllIIllIl[llIIllIIlllI[1]]) ? 1 : 0)) {
                lllllllllllllllIlIIllIllIlIIlIll.sleep(Rand.nextInt((int)llIIllIIlllI[4], (int)llIIllIIlllI[5]));
            }
            if (z.llllllIIlIIlIl(lllllllllllllllIlIIllIllIlIIlIII.contains(llIIllIIllIl[llIIllIIlllI[0]]) ? 1 : 0)) {
                lllllllllllllllIlIIllIllIlIIlIll.sleep(Rand.nextInt((int)llIIllIIlllI[6], (int)llIIllIIlllI[2]));
            }
        }
        var1_1.interact(llIIllIIllIl[llIIllIIlllI[6]]);
        return llIIllIIlllI[0];
    }
}

