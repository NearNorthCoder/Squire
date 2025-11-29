/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="RewardHandlerTask", priority=10, blocking=true)
public class o
extends Task {
    private static /* synthetic */ int[] lIIllIlIIIIlI;
    private static /* synthetic */ String[] lIIllIlIIIIII;
    private final /* synthetic */ String[] N;
    private final /* synthetic */ TempleTrekkingConfig M;
    private final /* synthetic */ TempleTrekkingPlugin L;

    private static void lIllIIIIIlIlIIl() {
        lIIllIlIIIIlI = new int[18];
        o.lIIllIlIIIIlI[0] = 0x4F ^ 0x48;
        o.lIIllIlIIIIlI[1] = (0x87 ^ 0xC7) & ~(0x70 ^ 0x30);
        o.lIIllIlIIIIlI[2] = 1;
        o.lIIllIlIIIIlI[3] = 2;
        o.lIIllIlIIIIlI[4] = 3;
        o.lIIllIlIIIIlI[5] = 0x2D ^ 0x4A ^ (0x7F ^ 0x1C);
        o.lIIllIlIIIIlI[6] = 0xBB ^ 0x8A ^ (0xA4 ^ 0x90);
        o.lIIllIlIIIIlI[7] = 0 ^ 0x6E ^ (0x55 ^ 0x3D);
        o.lIIllIlIIIIlI[8] = 0x46 ^ 0x4E;
        o.lIIllIlIIIIlI[9] = 0x4D ^ 0x44;
        o.lIIllIlIIIIlI[10] = 0xFFFFF95E & 0x7B3;
        o.lIIllIlIIIIlI[11] = 0xBC ^ 0xB7;
        o.lIIllIlIIIIlI[12] = 26 + 85 - 86 + 149 ^ 154 + 120 - 191 + 81;
        o.lIIllIlIIIIlI[13] = 140 + 62 - 20 + 3 ^ 13 + 135 - 99 + 132;
        o.lIIllIlIIIIlI[14] = 155 + 186 - 249 + 108 ^ 56 + 21 - 29 + 149;
        o.lIIllIlIIIIlI[15] = 0x10 ^ 0x5C ^ (0x21 ^ 0x63);
        o.lIIllIlIIIIlI[16] = 7 ^ 0x76 ^ (0x5C ^ 0x22);
        o.lIIllIlIIIIlI[17] = 0x69 ^ 0x79;
    }

    static {
        o.lIllIIIIIlIlIIl();
        o.lIllIIIIIlIIlll();
    }

    @Inject
    public o(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        String[] stringArray = new String[lIIllIlIIIIlI[0]];
        stringArray[o.lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[1]];
        stringArray[o.lIIllIlIIIIlI[2]] = lIIllIlIIIIII[lIIllIlIIIIlI[2]];
        stringArray[o.lIIllIlIIIIlI[3]] = lIIllIlIIIIII[lIIllIlIIIIlI[3]];
        stringArray[o.lIIllIlIIIIlI[4]] = lIIllIlIIIIII[lIIllIlIIIIlI[4]];
        stringArray[o.lIIllIlIIIIlI[5]] = lIIllIlIIIIII[lIIllIlIIIIlI[5]];
        stringArray[o.lIIllIlIIIIlI[6]] = lIIllIlIIIIII[lIIllIlIIIIlI[6]];
        stringArray[o.lIIllIlIIIIlI[7]] = lIIllIlIIIIII[lIIllIlIIIIlI[7]];
        this.N = stringArray;
        this.L = templeTrekkingPlugin;
        this.M = templeTrekkingConfig;
    }

    private static boolean lIllIIIIIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIIIlIIIll(String llllllllllllllIlllIllllllllllIlI, String llllllllllllllIlllIlllllllllIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllllllllllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllllllllllII.init(lIIllIlIIIIlI[3], llllllllllllllIlllIlllllllllllIl);
            return new String(llllllllllllllIlllIlllllllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllllllllllIll) {
            llllllllllllllIlllIllllllllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIIIIlIIIIl(String llllllllllllllIlllIlllllllIlIIll, String llllllllllllllIlllIlllllllIlIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllllIlIlII.getBytes(StandardCharsets.UTF_8)), lIIllIlIIIIlI[8]), "DES");
            Cipher llllllllllllllIlllIlllllllIlIlll = Cipher.getInstance("DES");
            llllllllllllllIlllIlllllllIlIlll.init(lIIllIlIIIIlI[3], llllllllllllllIlllIlllllllIllIII);
            return new String(llllllllllllllIlllIlllllllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllllllIlIllI) {
            llllllllllllllIlllIlllllllIlIllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIlIIlll() {
        lIIllIlIIIIII = new String[lIIllIlIIIIlI[17]];
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[1]] = o."Agility tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[2]] = o."Firemaking tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[3]] = o."Fishing tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[4]] = o."Mining tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[5]] = o."Slayer tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[6]] = o."Thieving tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[7]] = o."Woodcutting tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[0]] = o."Read";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[8]] = o."Reward token";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[9]] = o."Reward token";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[12]] = o."Claiming rewards";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[11]] = o."Claim";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[13]] = o."Selecting rewards";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[14]] = o."Details";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[15]] = o."Opening interface";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[16]] = o."Look-at";
    }

    private static boolean lIllIIIIIlIllII(Object object) {
        return object != null;
    }

    private static String lIllIIIIIlIIllI(String llllllllllllllIlllIllllllllIIlIl, String llllllllllllllIlllIllllllllIlIIl) {
        llllllllllllllIlllIllllllllIIlIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllllllllIlIII = new StringBuilder();
        char[] llllllllllllllIlllIllllllllIIlll = llllllllllllllIlllIllllllllIlIIl.toCharArray();
        int llllllllllllllIlllIllllllllIIllI = lIIllIlIIIIlI[1];
        char[] llllllllllllllIlllIllllllllIIIII = llllllllllllllIlllIllllllllIIlIl.toCharArray();
        int llllllllllllllIlllIlllllllIlllll = llllllllllllllIlllIllllllllIIIII.length;
        int llllllllllllllIlllIlllllllIllllI = lIIllIlIIIIlI[1];
        while (o.lIllIIIIIlIlllI(llllllllllllllIlllIlllllllIllllI, llllllllllllllIlllIlllllllIlllll)) {
            char llllllllllllllIlllIllllllllIlIll = llllllllllllllIlllIllllllllIIIII[llllllllllllllIlllIlllllllIllllI];
            llllllllllllllIlllIllllllllIlIII.append((char)(llllllllllllllIlllIllllllllIlIll ^ llllllllllllllIlllIllllllllIIlll[llllllllllllllIlllIllllllllIIllI % llllllllllllllIlllIllllllllIIlll.length]));
            0;
            ++llllllllllllllIlllIllllllllIIllI;
            ++llllllllllllllIlllIlllllllIllllI;
            0;
            if (2 >= 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllllllllIlIII);
    }

    public boolean run() {
        Item item;
        if (o.lIllIIIIIlIlIlI(this.M.bankXPTomes() ? 1 : 0) && o.lIllIIIIIlIlIll(Inventory.contains((String[])this.N) ? 1 : 0) && o.lIllIIIIIlIllII(item = Inventory.getFirst((String[])this.N))) {
            item.interact(lIIllIlIIIIII[lIIllIlIIIIlI[0]]);
            return lIIllIlIIIIlI[2];
        }
        String[] stringArray = new String[lIIllIlIIIIlI[2]];
        stringArray[o.lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[8]];
        if (o.lIllIIIIIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return lIIllIlIIIIlI[1];
        }
        String[] stringArray2 = new String[lIIllIlIIIIlI[2]];
        stringArray2[o.lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[9]];
        Item llllllllllllllIllllIIIIIIIIIIlIl = Inventory.getFirst((String[])stringArray2);
        if (o.lIllIIIIIlIllII(llllllllllllllIllllIIIIIIIIIIlIl)) {
            o llllllllllllllIllllIIIIIIIIIIllI;
            Widget llllllllllllllIllllIIIIIIIIIIlII = Widgets.get((int)lIIllIlIIIIlI[10], (int)lIIllIlIIIIlI[11]);
            if (o.lIllIIIIIlIllII(llllllllllllllIllllIIIIIIIIIIlII) && o.lIllIIIIIlIlIll(llllllllllllllIllllIIIIIIIIIIlII.isVisible() ? 1 : 0)) {
                System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[12]]);
                llllllllllllllIllllIIIIIIIIIIlII.interact(lIIllIlIIIIII[lIIllIlIIIIlI[11]]);
                return lIIllIlIIIIlI[2];
            }
            int llllllllllllllIllllIIIIIIIIIIIll = llllllllllllllIllllIIIIIIIIIIllI.M.reward().x();
            Widget llllllllllllllIllllIIIIIIIIIIIlI = Widgets.get((int)lIIllIlIIIIlI[10], (int)lIIllIlIIIIlI[7], (int)llllllllllllllIllllIIIIIIIIIIIll);
            if (o.lIllIIIIIlIllII(llllllllllllllIllllIIIIIIIIIIIlI)) {
                System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[13]]);
                llllllllllllllIllllIIIIIIIIIIIlI.interact(lIIllIlIIIIII[lIIllIlIIIIlI[14]]);
                return lIIllIlIIIIlI[2];
            }
            System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[15]]);
            llllllllllllllIllllIIIIIIIIIIlIl.interact(lIIllIlIIIIII[lIIllIlIIIIlI[16]]);
            return lIIllIlIIIIlI[2];
        }
        return lIIllIlIIIIlI[1];
    }
}

