/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck;

/* TASK: Entering TOA -> EnteringtoaTask */
@TaskDesc(name="Entering TOA")
public class ci
extends ck {
    private static /* synthetic */ int[] llIIlllIllI;
    private static final /* synthetic */ int hR;
    private static /* synthetic */ String[] llIIlllIlIl;
    @Inject
    protected /* synthetic */ SquireAutoTOA aY;

    @Override
    public boolean bl() {
        ci var15;
        int[] nArray = new int[llIIlllIllI[0]];
        nArray[ci.llIIlllIllI[1]] = llIIlllIllI[2];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (ci.lIlIIIlllIIlII(tileObject)) {
            return llIIlllIllI[1];
        }
        BankLoadout var13 = (BankLoadout)var15.hY.loadout().selected(BankLoadout.class);
        if (ci.lIlIIIlllIIlIl(var13.needsToBank() ? 1 : 0)) {
            return llIIlllIllI[1];
        }
        if (ci.lIlIIIlllIIllI(Tabs.isOpen((Tab)Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
            return llIIlllIllI[0];
        }
        if (ci.lIlIIIlllIIlll(Magic.getCurrentSpellBook(), SpellBook.ANCIENT)) {
            Log.info((String)llIIlllIlIl[llIIlllIllI[1]]);
            var15.aY.forceStop();
            return llIIlllIllI[1];
        }
        if (ci.lIlIIIlllIIlIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIIlllIllI[0];
        }
        if (ci.lIlIIIlllIIlIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[llIIlllIllI[0]];
            stringArray[ci.llIIlllIllI[1]] = llIIlllIlIl[llIIlllIllI[0]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return llIIlllIllI[0];
        }
        tileObject.interact(llIIlllIlIl[llIIlllIllI[3]]);
        return llIIlllIllI[0];
    }

    private static void lIlIIIlllIIIll() {
        llIIlllIllI = new int[6];
        ci.llIIlllIllI[0] = 1;
        ci.llIIlllIllI[1] = (7 ^ 0x47 ^ (0xA6 ^ 0xAE)) & (197 + 182 - 231 + 52 ^ 99 + 124 - 172 + 77 ^ -1);
        ci.llIIlllIllI[2] = -(0xFFFFD575 & 0x6BEB) & (0xFFFFF569 & 0xFFFF);
        ci.llIIlllIllI[3] = 2;
        ci.llIIlllIllI[4] = 3;
        ci.llIIlllIllI[5] = 0x53 ^ 0x5B;
    }

    private static boolean lIlIIIlllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIIlllIIIII(String var11, String var18) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(llIIlllIllI[3], var20);
            return new String(var8.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIIllI(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIllIlllll(String var14, String var7) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var16 = llIIlllIllI[1];
        char[] var3 = var14.toCharArray();
        int var12 = var3.length;
        int var21 = llIIlllIllI[1];
        while (ci.lIlIIIlllIlIII(var21, var12)) {
            char var2 = var3[var21];
            var10.append((char)(var2 ^ var9[var16 % var9.length]));
            0;
            ++var16;
            ++var21;
            0;
            if (-1 <= (0x64 ^ 0x60)) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static void lIlIIIlllIIIlI() {
        llIIlllIlIl = new String[llIIlllIllI[4]];
        ci.llIIlllIlIl[ci.llIIlllIllI[1]] = ci."We need ancient spellbook, stopping";
        ci.llIIlllIlIl[ci.llIIlllIllI[0]] = ci."Yes";
        ci.llIIlllIlIl[ci.llIIlllIllI[3]] = ci."Enter";
    }

    private static boolean lIlIIIlllIIlIl(int n2) {
        return n2 != 0;
    }

    @Inject
    protected ci(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static boolean lIlIIIlllIIlll(Object object, Object object2) {
        return object != object2;
    }

    private static String lIlIIIlllIIIIl(String var5, String var6) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIIlllIllI[5]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(llIIlllIllI[3], var4);
            return new String(var19.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIIlII(Object object) {
        return object == null;
    }

    static {
        ci.lIlIIIlllIIIll();
        ci.lIlIIIlllIIIlI();
        hR = llIIlllIllI[2];
    }
}

