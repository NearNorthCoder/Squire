/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.i;

@TaskDesc(name="Pathing to Boss", priority=0x7FFFFF37, blocking=true)
public class k
extends i {
    private static /* synthetic */ String[] lIIlIllIIllII;
    private final /* synthetic */ SquireScurrius R;
    private static /* synthetic */ int[] lIIlIllIIlllI;
    private final /* synthetic */ b S;
    private /* synthetic */ WorldArea V;
    private static /* synthetic */ WorldPoint Q;
    private final /* synthetic */ SquireScurriusConfig T;
    private final /* synthetic */ int U = 4661;

    static {
        k.lIlIllIlIIIIIII();
        k.lIlIllIIlllllII();
        Q = new WorldPoint(lIIlIllIIlllI[9], lIIlIllIIlllI[10], lIIlIllIIlllI[3]);
    }

    private static boolean lIlIllIlIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIlIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean a() {
        k llllllllllllllIllllIlIllIIIlIlIl;
        if (k.lIlIllIlIIIIIIl(this.c() ? 1 : 0)) {
            return lIIlIllIIlllI[3];
        }
        if (k.lIlIllIlIIIIIIl(llllllllllllllIllllIlIllIIIlIlIl.R.k() ? 1 : 0)) {
            llllllllllllllIllllIlIllIIIlIlIl.R.forceStop();
            return lIIlIllIIlllI[6];
        }
        Player llllllllllllllIllllIlIllIIIlIlII = Players.getLocal();
        if (k.lIlIllIlIIIIIlI(llllllllllllllIllllIlIllIIIlIlII)) {
            return lIIlIllIIlllI[3];
        }
        if (k.lIlIllIlIIIIIIl(llllllllllllllIllllIlIllIIIlIlIl.V.contains((Locatable)llllllllllllllIllllIlIllIIIlIlII) ? 1 : 0)) {
            if (k.lIlIllIlIIIIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIllIIlllI[6]];
                stringArray[k.lIIlIllIIlllI[3]] = lIIlIllIIllII[lIIlIllIIlllI[3]];
                Dialog.chooseOption((String[])stringArray);
                "".length();
                return lIIlIllIIlllI[6];
            }
            llllllllllllllIllllIlIllIIIlIlIl.a(lIIlIllIIllII[lIIlIllIIlllI[6]], lIIlIllIIllII[lIIlIllIIlllI[7]], lIIlIllIIlllI[8], llllllllllllllIllllIlIllIIIlIlII);
            return lIIlIllIIlllI[6];
        }
        Movement.walkTo((WorldPoint)Q);
        "".length();
        return lIIlIllIIlllI[6];
    }

    private static String lIlIllIIllllIll(String llllllllllllllIllllIlIlIlllIIlIl, String llllllllllllllIllllIlIlIlllIIlII) {
        llllllllllllllIllllIlIlIlllIIlIl = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIlIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIlIlllIlIII = new StringBuilder();
        char[] llllllllllllllIllllIlIlIlllIIlll = llllllllllllllIllllIlIlIlllIIlII.toCharArray();
        int llllllllllllllIllllIlIlIlllIIllI = lIIlIllIIlllI[3];
        char[] llllllllllllllIllllIlIlIlllIIIII = llllllllllllllIllllIlIlIlllIIlIl.toCharArray();
        int llllllllllllllIllllIlIlIllIlllll = llllllllllllllIllllIlIlIlllIIIII.length;
        int llllllllllllllIllllIlIlIllIllllI = lIIlIllIIlllI[3];
        while (k.lIlIllIlIIIIlII(llllllllllllllIllllIlIlIllIllllI, llllllllllllllIllllIlIlIllIlllll)) {
            char llllllllllllllIllllIlIlIlllIlIll = llllllllllllllIllllIlIlIlllIIIII[llllllllllllllIllllIlIlIllIllllI];
            llllllllllllllIllllIlIlIlllIlIII.append((char)(llllllllllllllIllllIlIlIlllIlIll ^ llllllllllllllIllllIlIlIlllIIlll[llllllllllllllIllllIlIlIlllIIllI % llllllllllllllIllllIlIlIlllIIlll.length]));
            "".length();
            ++llllllllllllllIllllIlIlIlllIIllI;
            ++llllllllllllllIllllIlIlIllIllllI;
            "".length();
            if (" ".length() < "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlIlIlllIlIII);
    }

    @Override
    public boolean run() {
        if (k.lIlIllIlIIIIIIl(this.R.m() ? 1 : 0)) {
            return lIIlIllIIlllI[3];
        }
        return this.a();
    }

    @Inject
    public k(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.U = lIIlIllIIlllI[0];
        this.V = new WorldArea(new WorldPoint(lIIlIllIIlllI[1], lIIlIllIIlllI[2], lIIlIllIIlllI[3]), new WorldPoint(lIIlIllIIlllI[4], lIIlIllIIlllI[5], lIIlIllIIlllI[3]));
        this.R = squireScurrius;
        this.S = squireScurrius.n();
        this.T = squireScurriusConfig;
    }

    private static String lIlIllIIllllIlI(String llllllllllllllIllllIlIlIlllllIlI, String llllllllllllllIllllIlIlIlllllIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIlIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlIlllllIIl.getBytes(StandardCharsets.UTF_8)), lIIlIllIIlllI[12]), "DES");
            Cipher llllllllllllllIllllIlIlIllllllII = Cipher.getInstance("DES");
            llllllllllllllIllllIlIlIllllllII.init(lIIlIllIIlllI[7], llllllllllllllIllllIlIlIllllllIl);
            return new String(llllllllllllllIllllIlIlIllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIlIlllllIll) {
            llllllllllllllIllllIlIlIlllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIlIIIIIII() {
        lIIlIllIIlllI = new int[13];
        k.lIIlIllIIlllI[0] = -(0xFFFFF2FB & 0x4D47) & (0xFFFFD777 & 0x7AFF);
        k.lIIlIllIIlllI[1] = -(0xFFFFD3B5 & 0x6E7F) & (0xFFFFFEFD & 0x4FFF);
        k.lIIlIllIIlllI[2] = 0xFFFFEF9B & 0x36EF;
        k.lIIlIllIIlllI[3] = (0x91 ^ 0x95 ^ (0x4D ^ 0x1D)) & (0x93 ^ 0x8F ^ (0x77 ^ 0x3F) ^ -" ".length());
        k.lIIlIllIIlllI[4] = 0xFFFF9FFE & 0x6CD3;
        k.lIIlIllIIlllI[5] = -(0xFFFFEDEF & 0x537B) & (0xFFFFFFFE & 0x67FF);
        k.lIIlIllIIlllI[6] = " ".length();
        k.lIIlIllIIlllI[7] = "  ".length();
        k.lIIlIllIIlllI[8] = 0xFFFFB7FB & 0x7F7F;
        k.lIIlIllIIlllI[9] = 0xFFFFCCDC & 0x3FEF;
        k.lIIlIllIIlllI[10] = -(0xFFFFDFFE & 0x6123) & (0xFFFFE7EF & 0x7FBF);
        k.lIIlIllIIlllI[11] = "   ".length();
        k.lIIlIllIIlllI[12] = 0x63 ^ 0x6B;
    }

    private static void lIlIllIIlllllII() {
        lIIlIllIIllII = new String[lIIlIllIIlllI[11]];
        k.lIIlIllIIllII[k.lIIlIllIIlllI[3]] = k.lIlIllIIllllIIl("zKui5Oj6ks8=", "ipMjl");
        k.lIIlIllIIllII[k.lIIlIllIIlllI[6]] = k.lIlIllIIllllIlI("hwm0koL6FyI3b31EscXvNA==", "tQIqt");
        k.lIIlIllIIllII[k.lIIlIllIIlllI[7]] = k.lIlIllIIllllIll("GgsoAyt0EykcJiwAKU5hKRUoGCgtAmg=", "YgAnI");
    }

    private static String lIlIllIIllllIIl(String llllllllllllllIllllIlIlIllIlIIll, String llllllllllllllIllllIlIlIllIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIlIlIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlIllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIlIllIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIlIllIlIlll.init(lIIlIllIIlllI[7], llllllllllllllIllllIlIlIllIllIII);
            return new String(llllllllllllllIllllIlIlIllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIlIllIlIllI) {
            llllllllllllllIllllIlIlIllIlIllI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, String string2, int n2, Player player) {
        void llllllllllllllIllllIlIllIIIIlIll;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (k.lIlIllIlIIIIIll(tileObject.getId(), n2) && k.lIlIllIlIIIIIIl(tileObject.getName().equals(string) ? 1 : 0)) {
                String[] stringArray = new String[lIIlIllIIlllI[6]];
                stringArray[k.lIIlIllIIlllI[3]] = string2;
                if (k.lIlIllIlIIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n3 = lIIlIllIIlllI[6];
                    "".length();
                    if (-"   ".length() <= 0) return n3 != 0;
                    return ((0x60 ^ 0x24 ^ (0xC3 ^ 0x80)) & (0x59 ^ 0x60 ^ (0x4A ^ 0x74) ^ -" ".length())) != 0;
                }
            }
            n3 = lIIlIllIIlllI[3];
            return n3 != 0;
        });
        if (k.lIlIllIlIIIIIlI(tileObject2)) {
            return;
        }
        if (k.lIlIllIlIIIIIIl(llllllllllllllIllllIlIllIIIIlIll.isMoving() ? 1 : 0)) {
            return;
        }
        tileObject2.interact(string2);
    }

    private static boolean lIlIllIlIIIIIlI(Object object) {
        return object == null;
    }
}

