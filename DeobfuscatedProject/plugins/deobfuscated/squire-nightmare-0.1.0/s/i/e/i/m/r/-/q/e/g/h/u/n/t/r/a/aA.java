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

    private static String lIIIllllIIIIIll(String lllllllllllllllIIlIllllllllllIll, String lllllllllllllllIIlIllllllllllIlI) {
        lllllllllllllllIIlIllllllllllIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllllllllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllllllllllllI = new StringBuilder();
        char[] lllllllllllllllIIlIlllllllllllIl = lllllllllllllllIIlIllllllllllIlI.toCharArray();
        int lllllllllllllllIIlIlllllllllllII = llllIIIlIlIl[0];
        char[] lllllllllllllllIIlIlllllllllIllI = lllllllllllllllIIlIllllllllllIll.toCharArray();
        int lllllllllllllllIIlIlllllllllIlIl = lllllllllllllllIIlIlllllllllIllI.length;
        int lllllllllllllllIIlIlllllllllIlII = llllIIIlIlIl[0];
        while (aA.lIIIllllIIIllII(lllllllllllllllIIlIlllllllllIlII, lllllllllllllllIIlIlllllllllIlIl)) {
            char lllllllllllllllIIllIIIIIIIIIIIIl = lllllllllllllllIIlIlllllllllIllI[lllllllllllllllIIlIlllllllllIlII];
            lllllllllllllllIIlIllllllllllllI.append((char)(lllllllllllllllIIllIIIIIIIIIIIIl ^ lllllllllllllllIIlIlllllllllllIl[lllllllllllllllIIlIlllllllllllII % lllllllllllllllIIlIlllllllllllIl.length]));
            0;
            ++lllllllllllllllIIlIlllllllllllII;
            ++lllllllllllllllIIlIlllllllllIlII;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllllllllllllI);
    }

    @Override
    public boolean bY() {
        aA lllllllllllllllIIllIIIIIIIlIIllI;
        if (aA.lIIIllllIIIlIIl(this.cV.assistantMode() ? 1 : 0)) {
            return llllIIIlIlIl[0];
        }
        if (aA.lIIIllllIIIlIIl(lllllllllllllllIIllIIIIIIIlIIllI.cW.ad() ? 1 : 0)) {
            return llllIIIlIlIl[0];
        }
        if (aA.lIIIllllIIIlIIl(lllllllllllllllIIllIIIIIIIlIIllI.cV.useFireSpells() ? 1 : 0) && aA.lIIIllllIIIlIIl(lllllllllllllllIIllIIIIIIIlIIllI.cW.av() ? 1 : 0)) {
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
        TileObject lllllllllllllllIIllIIIIIIIlIIlIl = TileObjects.getNearest(tileObject -> tileObject.getName().contains(llllIIIlIIll[llllIIIlIlIl[4]]));
        if (aA.lIIIllllIIIlIll(lllllllllllllllIIllIIIIIIIlIIlIl)) {
            lllllllllllllllIIllIIIIIIIlIIlIl.interact(llllIIIlIIll[llllIIIlIlIl[3]]);
            return llllIIIlIlIl[1];
        }
        return llllIIIlIlIl[0];
    }

    private static String lIIIllllIIIIIlI(String lllllllllllllllIIllIIIIIIIIIlllI, String lllllllllllllllIIllIIIIIIIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIIIIIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIIIIIIlIIlI.init(llllIIIlIlIl[2], lllllllllllllllIIllIIIIIIIIlIIll);
            return new String(lllllllllllllllIIllIIIIIIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIIIIIlIIIl) {
            lllllllllllllllIIllIIIIIIIIlIIIl.printStackTrace();
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

    private static String lIIIllllIIIIIIl(String lllllllllllllllIIllIIIIIIIIlllIl, String lllllllllllllllIIllIIIIIIIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIIIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIIIIlllII.getBytes(StandardCharsets.UTF_8)), llllIIIlIlIl[6]), "DES");
            Cipher lllllllllllllllIIllIIIIIIIIlllll = Cipher.getInstance("DES");
            lllllllllllllllIIllIIIIIIIIlllll.init(llllIIIlIlIl[2], lllllllllllllllIIllIIIIIIIlIIIII);
            return new String(lllllllllllllllIIllIIIIIIIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIIIIIllllI) {
            lllllllllllllllIIllIIIIIIIIllllI.printStackTrace();
            return null;
        }
    }

    static {
        aA.lIIIllllIIIlIII();
        aA.lIIIllllIIIIlII();
        eI = LoggerFactory.getLogger(aA.class);
    }
}

