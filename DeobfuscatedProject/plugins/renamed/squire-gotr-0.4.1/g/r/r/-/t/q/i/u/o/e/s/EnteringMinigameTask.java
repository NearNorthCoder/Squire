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

import g.r.r.-.t.q.i.u.o.e.s.CEnum;
import g.r.r.-.t.q.i.u.o.e.s.h_Unknown;
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

/* TASK: Entering Minigame -> EnteringminigameTask */
@TaskDesc(name="Entering Minigame", priority=2, blocking=true)
public class EnteringMinigameTask
extends h_Unknown {
    private static final /* synthetic */ String bg;
    private static /* synthetic */ int[] llIIllIIlllI;
    private static final /* synthetic */ String bh;
    private static /* synthetic */ String[] llIIllIIllIl;
    private /* synthetic */ boolean bi;
    private static final /* synthetic */ int bf;

    private static String llllllIIlIIIIl(String var16, String var10) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var14 = var10.toCharArray();
        int var15 = llIIllIIlllI[1];
        char[] var20 = var16.toCharArray();
        int var1 = var20.length;
        int var3 = llIIllIIlllI[1];
        while (z.llllllIIlIlIlI(var3, var1)) {
            char var18 = var20[var3];
            var9.append((char)(var18 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var3;
            0;
            if ((0x2C ^ 0x28) > -1) continue;
            return null;
        }
        return String.valueOf(var9);
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

    private static String llllllIIlIIIII(String var7, String var13) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(llIIllIIlllI[6], var11);
            return new String(var8.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String llllllIIlIIIlI(String var23, String var5) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llIIllIIlllI[10]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llIIllIIlllI[6], var12);
            return new String(var4.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
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
        TileObject var6 = TileObjects.getNearest((int[])SquireGOTRPlugin.d);
        if (!z.llllllIIlIIllI(var6) || z.llllllIIlIIlll(var6.distanceTo((Locatable)Players.getLocal()), llIIllIIlllI[2])) {
            return llIIllIIlllI[1];
        }
        if (z.llllllIIlIlIII(var6.getId(), llIIllIIlllI[3])) {
            return llIIllIIlllI[1];
        }
        Widget var17 = Widgets.get((WidgetInfo)WidgetInfo.MINIGAME_DIALOG_TEXT);
        if (z.llllllIIlIIllI(var17)) {
            z var21;
            String var22 = var17.getText();
            if (z.llllllIIlIIlIl(var22.contains(llIIllIIllIl[llIIllIIlllI[1]]) ? 1 : 0)) {
                var21.sleep(Rand.nextInt((int)llIIllIIlllI[4], (int)llIIllIIlllI[5]));
            }
            if (z.llllllIIlIIlIl(var22.contains(llIIllIIllIl[llIIllIIlllI[0]]) ? 1 : 0)) {
                var21.sleep(Rand.nextInt((int)llIIllIIlllI[6], (int)llIIllIIlllI[2]));
            }
        }
        var1_1.interact(llIIllIIllIl[llIIllIIlllI[6]]);
        return llIIllIIlllI[0];
    }
}

