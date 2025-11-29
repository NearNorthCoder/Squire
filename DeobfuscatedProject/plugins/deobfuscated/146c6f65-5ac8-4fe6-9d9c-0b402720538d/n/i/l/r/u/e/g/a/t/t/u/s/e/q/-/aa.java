/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Dialog
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.gauntlet.GauntletConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Starting a gauntlet", priority=3, blocking=true)
public class aa
extends n {
    private /* synthetic */ int cl;
    private static /* synthetic */ int[] llIIllllIlII;
    private final /* synthetic */ GauntletConfig ck;
    private static /* synthetic */ String[] llIIllllIIll;

    private static String lIIIIIIIIIIlllI(String lllllllllllllllIlIIlIIIIIlIlllII, String lllllllllllllllIlIIlIIIIIlIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIIIIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIIIIIlIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIIIIIlIllllI.init(llIIllllIlII[6], lllllllllllllllIlIIlIIIIIlIlllll);
            return new String(lllllllllllllllIlIIlIIIIIlIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIIIIIlIlllIl) {
            lllllllllllllllIlIIlIIIIIlIlllIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public aa(c c2, GauntletConfig gauntletConfig) {
        d[] dArray = new d[llIIllllIlII[0]];
        dArray[aa.llIIllllIlII[1]] = d.OUTSIDE;
        super(c2, dArray);
        this.cl = llIIllllIlII[1];
        this.ck = gauntletConfig;
    }

    private static boolean lIIIIIIIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIIIlIIll(int n2) {
        return n2 > 0;
    }

    private static void lIIIIIIIIIlIIII() {
        llIIllllIlII = new int[8];
        aa.llIIllllIlII[0] = 1;
        aa.llIIllllIlII[1] = (0x11 ^ 0x56) & ~(0x58 ^ 0x1F);
        aa.llIIllllIlII[2] = 0xFFFFB3DC & 0xDDFF;
        aa.llIIllllIlII[3] = 73 + 69 - 110 + 152 ^ 85 + 100 - 7 + 0;
        aa.llIIllllIlII[4] = 0xBF ^ 0xAB;
        aa.llIIllllIlII[5] = 0xF3 ^ 0xA5 ^ (0x5A ^ 0x68);
        aa.llIIllllIlII[6] = 2;
        aa.llIIllllIlII[7] = 3;
    }

    @Override
    public boolean be() {
        aa lllllllllllllllIlIIlIIIIIllllllI;
        Item item2 = Inventory.getFirst(item -> Arrays.stream(this.ba.h().alching().split(llIIllllIIll[llIIllllIlII[6]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId()))));
        if (aa.lIIIIIIIIIlIIIl(item2) && aa.lIIIIIIIIIlIIlI(Magic.canCast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY) ? 1 : 0)) {
            return llIIllllIlII[1];
        }
        if (aa.lIIIIIIIIIlIIlI(lllllllllllllllIlIIlIIIIIllllllI.ck.waitAfterAttempt() ? 1 : 0) && aa.lIIIIIIIIIlIIll(lllllllllllllllIlIIlIIIIIllllllI.cl)) {
            lllllllllllllllIlIIlIIIIIllllllI.cl -= llIIllllIlII[0];
            return llIIllllIlII[0];
        }
        if (aa.lIIIIIIIIIlIIlI(Dialog.isViewingOptions() ? 1 : 0) && aa.lIIIIIIIIIlIIlI(Dialog.hasOption((String)llIIllllIIll[llIIllllIlII[1]]) ? 1 : 0)) {
            String[] stringArray = new String[llIIllllIlII[0]];
            stringArray[aa.llIIllllIlII[1]] = llIIllllIIll[llIIllllIlII[0]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return llIIllllIlII[0];
        }
        if (aa.lIIIIIIIIIlIIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIIllllIlII[0];
        }
        int[] nArray = new int[llIIllllIlII[0]];
        nArray[aa.llIIllllIlII[1]] = llIIllllIlII[2];
        TileObject lllllllllllllllIlIIlIIIIIlllllII = TileObjects.getNearest((int[])nArray);
        if (aa.lIIIIIIIIIlIIIl(lllllllllllllllIlIIlIIIIIlllllII)) {
            int n2;
            if (aa.lIIIIIIIIIlIIlI(lllllllllllllllIlIIlIIIIIllllllI.ba.G() ? 1 : 0)) {
                n2 = llIIllllIlII[0];
                0;
                if (1 != 1) {
                    return ((0x4E ^ 0x2C) & ~(0x6A ^ 8)) != 0;
                }
            } else {
                n2 = llIIllllIlII[1];
            }
            lllllllllllllllIlIIlIIIIIlllllII.interact(n2);
            lllllllllllllllIlIIlIIIIIllllllI.sleep(llIIllllIlII[3]);
            lllllllllllllllIlIIlIIIIIllllllI.cl = Rand.nextInt((int)llIIllllIlII[4], (int)llIIllllIlII[5]);
            return llIIllllIlII[0];
        }
        return llIIllllIlII[1];
    }

    private static String lIIIIIIIIIIllIl(String lllllllllllllllIlIIlIIIIIlllIIIl, String lllllllllllllllIlIIlIIIIIlllIIII) {
        lllllllllllllllIlIIlIIIIIlllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIIIIIllIllll = new StringBuilder();
        char[] lllllllllllllllIlIIlIIIIIllIlllI = lllllllllllllllIlIIlIIIIIlllIIII.toCharArray();
        int lllllllllllllllIlIIlIIIIIllIllIl = llIIllllIlII[1];
        char[] lllllllllllllllIlIIlIIIIIllIIlll = lllllllllllllllIlIIlIIIIIlllIIIl.toCharArray();
        int lllllllllllllllIlIIlIIIIIllIIllI = lllllllllllllllIlIIlIIIIIllIIlll.length;
        int lllllllllllllllIlIIlIIIIIllIIlIl = llIIllllIlII[1];
        while (aa.lIIIIIIIIIlIlII(lllllllllllllllIlIIlIIIIIllIIlIl, lllllllllllllllIlIIlIIIIIllIIllI)) {
            char lllllllllllllllIlIIlIIIIIlllIIlI = lllllllllllllllIlIIlIIIIIllIIlll[lllllllllllllllIlIIlIIIIIllIIlIl];
            lllllllllllllllIlIIlIIIIIllIllll.append((char)(lllllllllllllllIlIIlIIIIIlllIIlI ^ lllllllllllllllIlIIlIIIIIllIlllI[lllllllllllllllIlIIlIIIIIllIllIl % lllllllllllllllIlIIlIIIIIllIlllI.length]));
            0;
            ++lllllllllllllllIlIIlIIIIIllIllIl;
            ++lllllllllllllllIlIIlIIIIIllIIlIl;
            0;
            if (((0x35 ^ 0x33) & ~(0x4E ^ 0x48)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIIIIIllIllll);
    }

    private static boolean lIIIIIIIIIlIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIIIIIIIllll() {
        llIIllllIIll = new String[llIIllllIlII[7]];
        aa.llIIllllIIll[aa.llIIllllIlII[1]] = aa."Yes";
        aa.llIIllllIIll[aa.llIIllllIlII[0]] = aa."Yes";
        aa.llIIllllIIll[aa.llIIllllIlII[6]] = aa.",";
    }

    static {
        aa.lIIIIIIIIIlIIII();
        aa.lIIIIIIIIIIllll();
    }
}

