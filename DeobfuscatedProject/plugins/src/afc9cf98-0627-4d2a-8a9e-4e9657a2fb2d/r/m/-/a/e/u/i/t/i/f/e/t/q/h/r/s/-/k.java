/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.a;

@TaskDesc(name="Buying Rewards", priority=0x7FFFFFFF, blocking=true)
public class k
extends Task {
    private /* synthetic */ boolean M;
    private static final /* synthetic */ int F;
    private static final /* synthetic */ int G;
    private final /* synthetic */ Client L;
    private final /* synthetic */ SquireTitheConfig K;
    private static final /* synthetic */ int E;
    private static /* synthetic */ String[] lIIllllllllIl;
    private static final /* synthetic */ int H;
    private static final /* synthetic */ int J;
    private static final /* synthetic */ int I;
    private static /* synthetic */ int[] lIIlllllllllI;

    private static boolean lIllIllIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIllIIlIlIlI(String llllllllllllllIlllIIlIlIllIIlllI, String llllllllllllllIlllIIlIlIllIIllIl) {
        llllllllllllllIlllIIlIlIllIIlllI = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIlIllIlIIIl = new StringBuilder();
        char[] llllllllllllllIlllIIlIlIllIlIIII = llllllllllllllIlllIIlIlIllIIllIl.toCharArray();
        int llllllllllllllIlllIIlIlIllIIllll = lIIlllllllllI[0];
        char[] llllllllllllllIlllIIlIlIllIIlIIl = llllllllllllllIlllIIlIlIllIIlllI.toCharArray();
        int llllllllllllllIlllIIlIlIllIIlIII = llllllllllllllIlllIIlIlIllIIlIIl.length;
        int llllllllllllllIlllIIlIlIllIIIlll = lIIlllllllllI[0];
        while (k.lIllIllIIllIIlI(llllllllllllllIlllIIlIlIllIIIlll, llllllllllllllIlllIIlIlIllIIlIII)) {
            char llllllllllllllIlllIIlIlIllIlIlII = llllllllllllllIlllIIlIlIllIIlIIl[llllllllllllllIlllIIlIlIllIIIlll];
            llllllllllllllIlllIIlIlIllIlIIIl.append((char)(llllllllllllllIlllIIlIlIllIlIlII ^ llllllllllllllIlllIIlIlIllIlIIII[llllllllllllllIlllIIlIlIllIIllll % llllllllllllllIlllIIlIlIllIlIIII.length]));
            "".length();
            ++llllllllllllllIlllIIlIlIllIIllll;
            ++llllllllllllllIlllIIlIlIllIIIlll;
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIlIllIlIIIl);
    }

    private static boolean lIllIllIIllIIIl(Object object) {
        return object != null;
    }

    public boolean run() {
        k llllllllllllllIlllIIlIlIlllllIll;
        if (k.lIllIllIIlIllll(this.L.isInInstancedRegion() ? 1 : 0)) {
            this.M = lIIlllllllllI[0];
            return lIIlllllllllI[0];
        }
        if (k.lIllIllIIlIllll(llllllllllllllIlllIIlIlIlllllIll.M ? 1 : 0)) {
            return lIIlllllllllI[0];
        }
        if (k.lIllIllIIllIIII((Object)llllllllllllllIlllIIlIlIlllllIll.K.buyItems(), (Object)a.NONE)) {
            return lIIlllllllllI[0];
        }
        String[] stringArray = new String[lIIlllllllllI[1]];
        stringArray[k.lIIlllllllllI[0]] = lIIllllllllIl[lIIlllllllllI[0]];
        stringArray[k.lIIlllllllllI[2]] = lIIllllllllIl[lIIlllllllllI[2]];
        Item llllllllllllllIlllIIlIlIlllllIlI = Inventory.getFirst((String[])stringArray);
        if (k.lIllIllIIllIIIl(llllllllllllllIlllIIlIlIlllllIlI)) {
            llllllllllllllIlllIIlIlIlllllIlI.interact(lIIllllllllIl[lIIlllllllllI[1]]);
            return lIIlllllllllI[2];
        }
        int llllllllllllllIlllIIlIlIlllllIIl = Vars.getBit((int)lIIlllllllllI[3]);
        if (k.lIllIllIIllIIlI(llllllllllllllIlllIIlIlIlllllIIl, lIIlllllllllI[4])) {
            llllllllllllllIlllIIlIlIlllllIll.M = lIIlllllllllI[2];
            return lIIlllllllllI[0];
        }
        Widget llllllllllllllIlllIIlIlIlllllIII = llllllllllllllIlllIIlIlIlllllIll.L.getWidget(lIIlllllllllI[5]);
        if (k.lIllIllIIllIIll(Widgets.isVisible((Widget)llllllllllllllIlllIIlIlIlllllIII) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlllllllllI[2]];
            stringArray2[k.lIIlllllllllI[0]] = lIIllllllllIl[lIIlllllllllI[6]];
            NPC llllllllllllllIlllIIlIlIllllIlll = NPCs.getNearest((String[])stringArray2);
            if (k.lIllIllIIllIlII(llllllllllllllIlllIIlIlIllllIlll)) {
                return lIIlllllllllI[0];
            }
            llllllllllllllIlllIIlIlIllllIlll.interact(lIIllllllllIl[lIIlllllllllI[7]]);
            return lIIlllllllllI[2];
        }
        this.x();
        "".length();
        return lIIlllllllllI[2];
    }

    @Inject
    public k(SquireTitheConfig squireTitheConfig, Client client) {
        this.K = squireTitheConfig;
        this.L = client;
    }

    private static boolean lIllIllIIlIllll(int n2) {
        return n2 != 0;
    }

    static {
        k.lIllIllIIlIlllI();
        k.lIllIllIIlIllIl();
        I = lIIlllllllllI[10];
        J = lIIlllllllllI[11];
        G = lIIlllllllllI[8];
        H = lIIlllllllllI[9];
        E = lIIlllllllllI[5];
        F = lIIlllllllllI[4];
    }

    private static String lIllIllIIlIlIll(String llllllllllllllIlllIIlIlIlllIIIIl, String llllllllllllllIlllIIlIlIlllIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIlllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIlllIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllllllllI[14]), "DES");
            Cipher llllllllllllllIlllIIlIlIlllIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIlIlllIIlIl.init(lIIlllllllllI[1], llllllllllllllIlllIIlIlIlllIIllI);
            return new String(llllllllllllllIlllIIlIlIlllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlIlllIIlII) {
            llllllllllllllIlllIIlIlIlllIIlII.printStackTrace();
            return null;
        }
    }

    public boolean x() {
        k llllllllllllllIlllIIlIlIllllIIII;
        Widget llllllllllllllIlllIIlIlIlllIlllI;
        int llllllllllllllIlllIIlIlIlllIllll;
        int n2;
        if (k.lIllIllIIllIIII((Object)this.K.buyItems(), (Object)a.HERB_BOX)) {
            n2 = lIIlllllllllI[8];
            "".length();
            if ((54 + 20 - 69 + 133 ^ 136 + 82 - 134 + 58) == 0) {
                return ((0x24 ^ 0xE ^ (0x1D ^ 0x22)) & (72 + 81 - 101 + 85 ^ 43 + 18 - -89 + 6 ^ -" ".length())) != 0;
            }
        } else {
            n2 = llllllllllllllIlllIIlIlIlllIllll = lIIlllllllllI[9];
        }
        if (k.lIllIllIIllIlII(llllllllllllllIlllIIlIlIlllIlllI = llllllllllllllIlllIIlIlIllllIIII.L.getWidget(lIIlllllllllI[10]))) {
            return lIIlllllllllI[0];
        }
        Widget llllllllllllllIlllIIlIlIlllIllIl = llllllllllllllIlllIIlIlIlllIlllI.getDynamicChildren()[llllllllllllllIlllIIlIlIlllIllll];
        if (k.lIllIllIIllIlII(llllllllllllllIlllIIlIlIlllIllIl)) {
            return lIIlllllllllI[0];
        }
        Object[] llllllllllllllIlllIIlIlIlllIllII = llllllllllllllIlllIIlIlIlllIllIl.getOnOpListener();
        llllllllllllllIlllIIlIlIllllIIII.L.runScript(llllllllllllllIlllIIlIlIlllIllII);
        Widget llllllllllllllIlllIIlIlIlllIlIll = llllllllllllllIlllIIlIlIllllIIII.L.getWidget(lIIlllllllllI[11]);
        if (k.lIllIllIIllIIIl(llllllllllllllIlllIIlIlIlllIlIll)) {
            llllllllllllllIlllIIlIlIlllIlIll.interact(lIIllllllllIl[lIIlllllllllI[12]]);
            return lIIlllllllllI[2];
        }
        return lIIlllllllllI[0];
    }

    private static boolean lIllIllIIllIlII(Object object) {
        return object == null;
    }

    private static void lIllIllIIlIlllI() {
        lIIlllllllllI = new int[15];
        k.lIIlllllllllI[0] = (15 + 59 - 45 + 149 ^ 51 + 145 - 144 + 111) & (0x3D ^ 0x29 ^ (0x10 ^ 0x15) ^ -" ".length());
        k.lIIlllllllllI[1] = "  ".length();
        k.lIIlllllllllI[2] = " ".length();
        k.lIIlllllllllI[3] = -(0xFFFFA4ED & 0x7FD3) & (0xFFFFFFFD & 0x37DF);
        k.lIIlllllllllI[4] = 0x15 ^ 0xB;
        k.lIIlllllllllI[5] = -(0xFFFFEFB9 & 0x5DFF) & (0xFFFFFFFF & 0xEC4DBF);
        k.lIIlllllllllI[6] = "   ".length();
        k.lIIlllllllllI[7] = 0x98 ^ 0x92 ^ (0x5A ^ 0x54);
        k.lIIlllllllllI[8] = 0xE1 ^ 0x99 ^ (0x57 ^ 0x4F);
        k.lIIlllllllllI[9] = 0x73 ^ 0x1F;
        k.lIIlllllllllI[10] = 0xFFFFE269 & 0x3331DB7;
        k.lIIlllllllllI[11] = -(0xFFFFEF6F & 0x3FD2) & (0xFFFFFF5D & 0x3332FFF);
        k.lIIlllllllllI[12] = 0x27 ^ 0x22;
        k.lIIlllllllllI[13] = 0x7A ^ 0x7C;
        k.lIIlllllllllI[14] = 0xD0 ^ 0xA0 ^ (0x7B ^ 3);
    }

    private static boolean lIllIllIIllIIII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIllIIlIllII(String llllllllllllllIlllIIlIlIlIllllII, String llllllllllllllIlllIIlIlIlIlllIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIlIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIllIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIllIIIIII.init(lIIlllllllllI[1], llllllllllllllIlllIIlIlIllIIIIIl);
            return new String(llllllllllllllIlllIIlIlIllIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlIlIllllll) {
            llllllllllllllIlllIIlIlIlIllllll.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIIlIllIl() {
        lIIllllllllIl = new String[lIIlllllllllI[13]];
        k.lIIllllllllIl[k.lIIlllllllllI[0]] = k.lIllIllIIlIlIlI("HB8bK0E2FRE=", "TziIa");
        k.lIIllllllllIl[k.lIIlllllllllI[2]] = k.lIllIllIIlIlIlI("CzYpJk4oMi8p", "XSLBn");
        k.lIIllllllllIl[k.lIIlllllllllI[1]] = k.lIllIllIIlIlIlI("EBApHVgzHSs=", "RqGvu");
        k.lIIllllllllIl[k.lIIlllllllllI[6]] = k.lIllIllIIlIlIll("aVMGutlw3J7vxFT+lC+o7VVvLGOyZW7b", "OPfAR");
        k.lIIllllllllIl[k.lIIlllllllllI[7]] = k.lIllIllIIlIllII("d+VQIFvxFv4=", "obiTA");
        k.lIIllllllllIl[k.lIIlllllllllI[12]] = k.lIllIllIIlIllII("/XHBszU4yG4=", "TRIKN");
    }

    private static boolean lIllIllIIllIIll(int n2) {
        return n2 == 0;
    }
}

