/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l;

@TaskDesc(name="Cooking fish", priority=5, blocking=true)
public class e
extends l {
    private static /* synthetic */ int[] lIIllIlllIIII;
    private static /* synthetic */ String[] lIIllIllIllll;

    @Inject
    protected e(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static String lIllIIIlIlllIIl(String llllllllllllllIlllIlllIIIIlIIIll, String llllllllllllllIlllIlllIIIIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIIllIlllIIII[8]), "DES");
            Cipher llllllllllllllIlllIlllIIIIlIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIIIIlIIlIl.init(lIIllIlllIIII[4], llllllllllllllIlllIlllIIIIlIIllI);
            return new String(llllllllllllllIlllIlllIIIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIIIIlIIlII) {
            llllllllllllllIlllIlllIIIIlIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIllIlll(String llllllllllllllIlllIlllIIIIIlIlII, String llllllllllllllIlllIlllIIIIIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIIIIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIIIIIllIII.init(lIIllIlllIIII[4], llllllllllllllIlllIlllIIIIIllIIl);
            return new String(llllllllllllllIlllIlllIIIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIIIIIlIlll) {
            llllllllllllllIlllIlllIIIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllIIIIII(Object object) {
        return object != null;
    }

    private int d() {
        int[] nArray = new int[lIIllIlllIIII[0]];
        nArray[e.lIIllIlllIIII[1]] = lIIllIlllIIII[6];
        return Inventory.getCount((int[])nArray);
    }

    private static boolean lIllIIIlIllllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIIlIllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIlIllllII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void llllllllllllllIlllIlllIIIlIIIllI;
        e llllllllllllllIlllIlllIIIlIIlIII;
        void llllllllllllllIlllIlllIIIlIIIlII;
        void llllllllllllllIlllIlllIIIlIIIlIl;
        c c2 = this.ar.N();
        TileObject tileObject = c2.V();
        int[] nArray = new int[lIIllIlllIIII[0]];
        nArray[e.lIIllIlllIIII[1]] = lIIllIlllIIII[2];
        TileObject tileObject2 = TileObjects.getNearest((int[])nArray);
        Player player = Players.getLocal();
        if ((!e.lIllIIIlIllllll(player.getAnimation(), lIIllIlllIIII[3]) || e.lIllIIIlIllllIl(player.isMoving() ? 1 : 0)) && e.lIllIIIlIllllII(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIlllIIII[0];
        }
        if (e.lIllIIIlIllllIl(llllllllllllllIlllIlllIIIlIIIlIl instanceof GameObject) && e.lIllIIIlIllllIl(((GameObject)llllllllllllllIlllIlllIIIlIIIlIl).getWorldArea().contains(llllllllllllllIlllIlllIIIlIIIlII.getWorldLocation()) ? 1 : 0)) {
            System.out.println(lIIllIllIllll[lIIllIlllIIII[1]]);
            NPC llllllllllllllIlllIlllIIIlIIIIll = llllllllllllllIlllIlllIIIlIIlIII.au.a((SceneEntity)llllllllllllllIlllIlllIIIlIIIllI);
            if (e.lIllIIIllIIIIII(llllllllllllllIlllIlllIIIlIIIIll)) {
                return llllllllllllllIlllIlllIIIlIIlIII.au.b((SceneEntity)llllllllllllllIlllIlllIIIlIIIllI);
            }
            llllllllllllllIlllIlllIIIlIIIllI.interact(lIIllIllIllll[lIIllIlllIIII[0]]);
            return lIIllIlllIIII[1];
        }
        if (e.lIllIIIllIIIIIl(llllllllllllllIlllIlllIIIlIIIllI)) {
            void llllllllllllllIlllIlllIIIlIIIlll;
            System.out.println(lIIllIllIllll[lIIllIlllIIII[4]]);
            return llllllllllllllIlllIlllIIIlIIlIII.ar.f(llllllllllllllIlllIlllIIIlIIIlll.ah());
        }
        if (e.lIllIIIlIllllIl(llllllllllllllIlllIlllIIIlIIlIII.au.a((Locatable)llllllllllllllIlllIlllIIIlIIIllI) ? 1 : 0)) {
            return llllllllllllllIlllIlllIIIlIIlIII.au.b((SceneEntity)llllllllllllllIlllIlllIIIlIIIllI);
        }
        tileObject.interact(lIIllIllIllll[lIIllIlllIIII[5]]);
        this.sleep(lIIllIlllIIII[4]);
        return lIIllIlllIIII[0];
    }

    private static boolean lIllIIIlIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllIIIlIlllIlI() {
        lIIllIllIllll = new String[lIIllIlllIIII[7]];
        e.lIIllIllIllll[e.lIIllIlllIIII[1]] = e.lIllIIIlIllIlll("d42ZDF+GcyPAV3werBjEUQ==", "KbUrO");
        e.lIIllIllIllll[e.lIIllIlllIIII[0]] = e.lIllIIIlIllIlll("6OyHo1C3zuk=", "PHFry");
        e.lIIllIllIllll[e.lIIllIlllIIII[4]] = e.lIllIIIlIlllIII("EQ8LJh1DBxZhFhYCCQ==", "cneAx");
        e.lIIllIllIllll[e.lIIllIlllIIII[5]] = e.lIllIIIlIlllIIl("zoiDku2woKU=", "psRRb");
    }

    static {
        e.lIllIIIlIlllIll();
        e.lIllIIIlIlllIlI();
    }

    @Override
    public boolean ak() {
        int n2;
        e llllllllllllllIlllIlllIIIlIIllll;
        if ((!e.lIllIIIlIllllII(this.as.cookFish() ? 1 : 0) || e.lIllIIIlIllllIl(this.as.solo() ? 1 : 0)) && e.lIllIIIlIllllII(llllllllllllllIlllIlllIIIlIIllll.ar.L() ? 1 : 0) && e.lIllIIIlIllllIl(llllllllllllllIlllIlllIIIlIIllll.d()) && e.lIllIIIlIlllllI(llllllllllllllIlllIlllIIIlIIllll.au.f(), llllllllllllllIlllIlllIIIlIIllll.as.numberOfFish())) {
            n2 = lIIllIlllIIII[0];
            "".length();
            if (-" ".length() >= 0) {
                return ((112 + 90 - 75 + 10 ^ 84 + 33 - 87 + 103) & (0x49 ^ 0x73 ^ (0x98 ^ 0xAE) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIIllIlllIIII[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIlIlllIll() {
        lIIllIlllIIII = new int[9];
        e.lIIllIlllIIII[0] = " ".length();
        e.lIIllIlllIIII[1] = (0x1D ^ 0x1B) & ~(0x5A ^ 0x5C);
        e.lIIllIlllIIII[2] = 0xFFFFFE7F & 0xA1AE;
        e.lIIllIlllIIII[3] = -(0xFFFFF176 & 0x7E9F) & (0xFFFFFFB7 & 0x73DD);
        e.lIIllIlllIIII[4] = "  ".length();
        e.lIIllIlllIIII[5] = "   ".length();
        e.lIIllIlllIIII[6] = 0xFFFFEFDF & 0x73FC;
        e.lIIllIlllIIII[7] = 0x1A ^ 0x5C ^ (0x17 ^ 0x55);
        e.lIIllIlllIIII[8] = 0x8A ^ 0xB7 ^ (0 ^ 0x35);
    }

    private static boolean lIllIIIllIIIIIl(Object object) {
        return object == null;
    }

    private static String lIllIIIlIlllIII(String llllllllllllllIlllIlllIIIIllIIll, String llllllllllllllIlllIlllIIIIllIlll) {
        llllllllllllllIlllIlllIIIIllIIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIIIIllIllI = new StringBuilder();
        char[] llllllllllllllIlllIlllIIIIllIlIl = llllllllllllllIlllIlllIIIIllIlll.toCharArray();
        int llllllllllllllIlllIlllIIIIllIlII = lIIllIlllIIII[1];
        char[] llllllllllllllIlllIlllIIIIlIlllI = llllllllllllllIlllIlllIIIIllIIll.toCharArray();
        int llllllllllllllIlllIlllIIIIlIllIl = llllllllllllllIlllIlllIIIIlIlllI.length;
        int llllllllllllllIlllIlllIIIIlIllII = lIIllIlllIIII[1];
        while (e.lIllIIIllIIIIlI(llllllllllllllIlllIlllIIIIlIllII, llllllllllllllIlllIlllIIIIlIllIl)) {
            char llllllllllllllIlllIlllIIIIlllIIl = llllllllllllllIlllIlllIIIIlIlllI[llllllllllllllIlllIlllIIIIlIllII];
            llllllllllllllIlllIlllIIIIllIllI.append((char)(llllllllllllllIlllIlllIIIIlllIIl ^ llllllllllllllIlllIlllIIIIllIlIl[llllllllllllllIlllIlllIIIIllIlII % llllllllllllllIlllIlllIIIIllIlIl.length]));
            "".length();
            ++llllllllllllllIlllIlllIIIIllIlII;
            ++llllllllllllllIlllIlllIIIIlIllII;
            "".length();
            if ((0x1E ^ 0x1A) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllIIIIllIllI);
    }
}

