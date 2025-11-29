/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
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
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck;

/* TASK: Creating TOA Party -> CreatingtoapartyTask */
@TaskDesc(name="Creating TOA Party", priority=5, blocking=true)
public class ch
extends ck {
    private static /* synthetic */ String[] llIllIllllI;
    private static /* synthetic */ int[] llIllIlllll;
    private static final /* synthetic */ int hQ;

    @Override
    public boolean bl() {
        ch var8;
        if (ch.lIlIlIlIlIllIl(Vars.getBit((int)llIllIlllll[0]), llIllIlllll[1])) {
            return llIllIlllll[2];
        }
        BankLoadout var7 = (BankLoadout)var8.hY.loadout().selected(BankLoadout.class);
        if (ch.lIlIlIlIlIlllI(var7.needsToBank() ? 1 : 0)) {
            return llIllIlllll[2];
        }
        Widget var13 = var8.cu.getWidget(llIllIlllll[3]);
        if (ch.lIlIlIlIlIlllI(Widgets.isVisible((Widget)var13) ? 1 : 0)) {
            Log.info((String)llIllIllllI[llIllIlllll[2]]);
            var13.interact(llIllIllllI[llIllIlllll[1]]);
            return llIllIlllll[1];
        }
        int[] nArray = new int[llIllIlllll[4]];
        nArray[ch.llIllIlllll[2]] = llIllIlllll[5];
        nArray[ch.llIllIlllll[1]] = llIllIlllll[6];
        TileObject var14 = TileObjects.getNearest((int[])nArray);
        if (ch.lIlIlIlIlIllll(var14)) {
            Log.info((String)llIllIllllI[llIllIlllll[4]]);
            var14.interact(llIllIllllI[llIllIlllll[7]]);
            return llIllIlllll[1];
        }
        return llIllIlllll[2];
    }

    private static boolean lIlIlIlIlIlllI(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIlIlIlIIl(String var5, String var4) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llIllIlllll[9]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llIllIlllll[4], var12);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIlIlIlI(String var9, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIllIlllll[4], var1);
            return new String(var3.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        ch.lIlIlIlIlIllII();
        ch.lIlIlIlIlIlIll();
        hQ = llIllIlllll[0];
    }

    private static void lIlIlIlIlIllII() {
        llIllIlllll = new int[10];
        ch.llIllIlllll[0] = -(0xFFFF9FF9 & 0x6647) & (0xFFFFFFC9 & 0x3E7F);
        ch.llIllIlllll[1] = 1;
        ch.llIllIlllll[2] = (108 + 44 - 150 + 130 ^ 113 + 73 - 84 + 41) & (9 ^ 0x28 ^ (0xF ^ 0x25) ^ -1);
        ch.llIllIlllll[3] = 0xFFFFC7D6 & 0x3043869;
        ch.llIllIlllll[4] = 2;
        ch.llIllIlllll[5] = 0xFFFFFFFE & 0xB3F5;
        ch.llIllIlllll[6] = 0xFFFFB3F7 & 0xFFFD;
        ch.llIllIlllll[7] = 3;
        ch.llIllIlllll[8] = 0x61 ^ 0x65;
        ch.llIllIlllll[9] = 0x51 ^ 0xF ^ (0xC5 ^ 0x93);
    }

    private static boolean lIlIlIlIlIllIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected ch(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void lIlIlIlIlIlIll() {
        llIllIllllI = new String[llIllIlllll[8]];
        ch.llIllIllllI[ch.llIllIlllll[2]] = ch."[CreateParty] Creating a party";
        ch.llIllIllllI[ch.llIllIlllll[1]] = ch."Make Party";
        ch.llIllIllllI[ch.llIllIlllll[4]] = ch."[CreateParty] Opening party menu";
        ch.llIllIllllI[ch.llIllIlllll[7]] = ch."Inspect";
    }

    private static boolean lIlIlIlIlIllll(Object object) {
        return object != null;
    }
}

