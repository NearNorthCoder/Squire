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
        ci llllllllllllllllIIlllIlIlIIIlllI;
        int[] nArray = new int[llIIlllIllI[0]];
        nArray[ci.llIIlllIllI[1]] = llIIlllIllI[2];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (ci.lIlIIIlllIIlII(tileObject)) {
            return llIIlllIllI[1];
        }
        BankLoadout llllllllllllllllIIlllIlIlIIIllII = (BankLoadout)llllllllllllllllIIlllIlIlIIIlllI.hY.loadout().selected(BankLoadout.class);
        if (ci.lIlIIIlllIIlIl(llllllllllllllllIIlllIlIlIIIllII.needsToBank() ? 1 : 0)) {
            return llIIlllIllI[1];
        }
        if (ci.lIlIIIlllIIllI(Tabs.isOpen((Tab)Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
            return llIIlllIllI[0];
        }
        if (ci.lIlIIIlllIIlll(Magic.getCurrentSpellBook(), SpellBook.ANCIENT)) {
            Log.info((String)llIIlllIlIl[llIIlllIllI[1]]);
            llllllllllllllllIIlllIlIlIIIlllI.aY.forceStop();
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

    private static String lIlIIIlllIIIII(String llllllllllllllllIIlllIlIlIIIIlII, String llllllllllllllllIIlllIlIlIIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlllIlIlIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIlIlIIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIlIlIIIIllI.init(llIIlllIllI[3], llllllllllllllllIIlllIlIlIIIIlll);
            return new String(llllllllllllllllIIlllIlIlIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIlIlIIIIlIl) {
            llllllllllllllllIIlllIlIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIIllI(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIllIlllll(String llllllllllllllllIIlllIlIIllIIlll, String llllllllllllllllIIlllIlIIllIIllI) {
        llllllllllllllllIIlllIlIIllIIlll = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIlIIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIlIIllIIlIl = new StringBuilder();
        char[] llllllllllllllllIIlllIlIIllIIlII = llllllllllllllllIIlllIlIIllIIllI.toCharArray();
        int llllllllllllllllIIlllIlIIllIIIll = llIIlllIllI[1];
        char[] llllllllllllllllIIlllIlIIlIlllIl = llllllllllllllllIIlllIlIIllIIlll.toCharArray();
        int llllllllllllllllIIlllIlIIlIlllII = llllllllllllllllIIlllIlIIlIlllIl.length;
        int llllllllllllllllIIlllIlIIlIllIll = llIIlllIllI[1];
        while (ci.lIlIIIlllIlIII(llllllllllllllllIIlllIlIIlIllIll, llllllllllllllllIIlllIlIIlIlllII)) {
            char llllllllllllllllIIlllIlIIllIlIII = llllllllllllllllIIlllIlIIlIlllIl[llllllllllllllllIIlllIlIIlIllIll];
            llllllllllllllllIIlllIlIIllIIlIl.append((char)(llllllllllllllllIIlllIlIIllIlIII ^ llllllllllllllllIIlllIlIIllIIlII[llllllllllllllllIIlllIlIIllIIIll % llllllllllllllllIIlllIlIIllIIlII.length]));
            0;
            ++llllllllllllllllIIlllIlIIllIIIll;
            ++llllllllllllllllIIlllIlIIlIllIll;
            0;
            if (-1 <= (0x64 ^ 0x60)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIlIIllIIlIl);
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

    private static String lIlIIIlllIIIIl(String llllllllllllllllIIlllIlIIlllIlIl, String llllllllllllllllIIlllIlIIlllIlII) {
        try {
            SecretKeySpec llllllllllllllllIIlllIlIIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlIIlllIlII.getBytes(StandardCharsets.UTF_8)), llIIlllIllI[5]), "DES");
            Cipher llllllllllllllllIIlllIlIIllllIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlllIlIIllllIIl.init(llIIlllIllI[3], llllllllllllllllIIlllIlIIllllIlI);
            return new String(llllllllllllllllIIlllIlIIllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIlIIllllIII) {
            llllllllllllllllIIlllIlIIllllIII.printStackTrace();
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

