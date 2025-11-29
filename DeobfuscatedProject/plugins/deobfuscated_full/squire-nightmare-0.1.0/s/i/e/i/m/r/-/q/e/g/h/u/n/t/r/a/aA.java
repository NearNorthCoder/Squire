/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.D;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

/* TASK: Entering PNM -> EnteringpnmTask */
@TaskDesc(name="Entering PNM", priority=500, blocking=true)
public class aA
extends D {
    private static final /* synthetic */ Logger eI;
    private static /* synthetic */ String[] llllIIIlIIll;
    private static /* synthetic */ int[] llllIIIlIlIl;

    @Inject
    protected aA(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void lIIIllllIIIlIII() {
        llllIIIlIlIl = new int[7];
        aA.llllIIIlIlIl[0] = (0xC7 ^ 0x84) & ~(0xF3 ^ 0xB0);
        aA.llllIIIlIlIl[1] = 1;
        aA.llllIIIlIlIl[2] = 2;
        aA.llllIIIlIlIl[3] = 3;
        aA.llllIIIlIlIl[4] = 0xE6 ^ 0xA5 ^ (0x5A ^ 0x1D);
        aA.llllIIIlIlIl[5] = 0xCA ^ 0x90 ^ (0x2A ^ 0x75);
        aA.llllIIIlIlIl[6] = 0x14 ^ 0x2A ^ (0x16 ^ 0x20);
    }

    private static void lIIIllllIIIIlII() {
        llllIIIlIIll = new String[llllIIIlIlIl[5]];
        aA.llllIIIlIIll[aA.llllIIIlIlIl[0]] = aA."you like to attempt";
        aA.llllIIIlIIll[aA.llllIIIlIlIl[1]] = aA."still like to";
        aA.llllIIIlIIll[aA.llllIIIlIlIl[2]] = aA."you sure you wish to begin";
        aA.llllIIIlIIll[aA.llllIIIlIlIl[3]] = aA."Drink-from";
        aA.llllIIIlIIll[aA.llllIIIlIlIl[4]] = aA."Pool of Nightmares";
    }

    private static String lIIIllllIIIIIll(String var5, String var9) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var1 = var9.toCharArray();
        int var8 = llllIIIlIlIl[0];
        char[] var2 = var5.toCharArray();
        int var15 = var2.length;
        int var3 = llllIIIlIlIl[0];
        while (aA.lIIIllllIIIllII(var3, var15)) {
            char var11 = var2[var3];
            var14.append((char)(var11 ^ var1[var8 % var1.length]));
            0;
            ++var8;
            ++var3;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    @Override
    public boolean bY() {
        aA var16;
        if (aA.lIIIllllIIIlIIl(this.cV.assistantMode() ? 1 : 0)) {
            return llllIIIlIlIl[0];
        }
        if (aA.lIIIllllIIIlIIl(var16.cW.ad() ? 1 : 0)) {
            return llllIIIlIlIl[0];
        }
        if (aA.lIIIllllIIIlIIl(var16.cV.useFireSpells() ? 1 : 0) && aA.lIIIllllIIIlIIl(var16.cW.av() ? 1 : 0)) {
            return llllIIIlIlIl[0];
        }
        if (aA.lIIIllllIIIlIlI(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIIlIlIl[0];
        }
        if (!aA.lIIIllllIIIlIlI(Dialog.getName().contains(llllIIIlIIll[llllIIIlIlIl[0]]) ? 1 : 0) || aA.lIIIllllIIIlIIl(Dialog.getName().contains(llllIIIlIIll[llllIIIlIlIl[1]]) ? 1 : 0)) {
            Dialog.chooseOption((int)llllIIIlIlIl[1]);
            0;
            return llllIIIlIlIl[1];
        }
        if (aA.lIIIllllIIIlIIl(Dialog.getName().contains(llllIIIlIIll[llllIIIlIlIl[2]]) ? 1 : 0)) {
            Dialog.chooseOption((int)llllIIIlIlIl[2]);
            0;
            return llllIIIlIlIl[1];
        }
        TileObject var6 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(llllIIIlIIll[llllIIIlIlIl[4]]));
        if (aA.lIIIllllIIIlIll(var6)) {
            var6.interact(llllIIIlIIll[llllIIIlIlIl[3]]);
            return llllIIIlIlIl[1];
        }
        return llllIIIlIlIl[0];
    }

    private static String lIIIllllIIIIIlI(String var10, String var7) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(llllIIIlIlIl[2], var13);
            return new String(var19.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIIllllIIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllllIIIIIIl(String var12, String var17) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), llllIIIlIlIl[6]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llllIIIlIlIl[2], var18);
            return new String(var4.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    static {
        aA.lIIIllllIIIlIII();
        aA.lIIIllllIIIIlII();
        eI = LoggerFactory.getLogger(aA.class);
    }
}

