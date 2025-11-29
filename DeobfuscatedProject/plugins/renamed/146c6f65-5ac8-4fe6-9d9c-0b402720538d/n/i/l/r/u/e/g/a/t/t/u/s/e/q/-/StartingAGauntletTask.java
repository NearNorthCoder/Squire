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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Starting a gauntlet -> StartingagauntletTask */
@TaskDesc(name="Starting a gauntlet", priority=3, blocking=true)
public class StartingAGauntletTask
extends n_Unknown {
    private /* synthetic */ int cl;
    private static /* synthetic */ int[] llIIllllIlII;
    private final /* synthetic */ GauntletConfig ck;
    private static /* synthetic */ String[] llIIllllIIll;

    private static String lIIIIIIIIIIlllI(String var15, String var3) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(llIIllllIlII[6], var10);
            return new String(var16.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
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
        aa var11;
        Item item2 = Inventory.getFirst(item -> Arrays.stream(this.ba.h().alching().split(llIIllllIIll[llIIllllIlII[6]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId()))));
        if (aa.lIIIIIIIIIlIIIl(item2) && aa.lIIIIIIIIIlIIlI(Magic.canCast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY) ? 1 : 0)) {
            return llIIllllIlII[1];
        }
        if (aa.lIIIIIIIIIlIIlI(var11.ck.waitAfterAttempt() ? 1 : 0) && aa.lIIIIIIIIIlIIll(var11.cl)) {
            var11.cl -= llIIllllIlII[0];
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
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (aa.lIIIIIIIIIlIIIl(var2)) {
            int n2;
            if (aa.lIIIIIIIIIlIIlI(var11.ba.G() ? 1 : 0)) {
                n2 = llIIllllIlII[0];
                0;
                if (1 != 1) {
                    return false;
                }
            } else {
                n2 = llIIllllIlII[1];
            }
            var2.interact(n2);
            var11.sleep(llIIllllIlII[3]);
            var11.cl = Rand.nextInt((int)llIIllllIlII[4], (int)llIIllllIlII[5]);
            return llIIllllIlII[0];
        }
        return llIIllllIlII[1];
    }

    private static String lIIIIIIIIIIllIl(String var1, String var4) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var5 = var4.toCharArray();
        int var14 = llIIllllIlII[1];
        char[] var6 = var1.toCharArray();
        int var7 = var6.length;
        int var8 = llIIllllIlII[1];
        while (aa.lIIIIIIIIIlIlII(var8, var7)) {
            char var9 = var6[var8];
            var13.append((char)(var9 ^ var5[var14 % var5.length]));
            0;
            ++var14;
            ++var8;
            0;
            if (((0x35 ^ 0x33) & ~(0x4E ^ 0x48)) == 0) continue;
            return null;
        }
        return String.valueOf(var13);
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

