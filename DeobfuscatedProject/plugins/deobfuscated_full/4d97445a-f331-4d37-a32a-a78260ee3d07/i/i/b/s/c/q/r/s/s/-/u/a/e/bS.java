/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bO;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

/* TASK: Collecting Snape Grass -> CollectingsnapegrassTask */
@TaskDesc(name="Collecting Snape Grass")
public class bS
extends Task {
    private static final /* synthetic */ WorldPoint gW;
    private static final /* synthetic */ WorldPoint gX;
    private static /* synthetic */ int[] lIIIIIllI;
    private static /* synthetic */ String[] lIIIIIlIl;
    private static final /* synthetic */ WorldArea gU;
    private static final /* synthetic */ int gS;
    @Inject
    private /* synthetic */ SecondariesConfig gK;
    private static final /* synthetic */ int gT;
    private static final /* synthetic */ WorldArea gV;

    /*
     * WARNING - void declaration
     */
    protected boolean t(int n2) {
        void llIIllIlllIIlIl;
        Client client = Static.getClient();
        int[] nArray = client.getMapRegions();
        int n3 = nArray.length;
        int llIIllIlllIIlII = lIIIIIllI[0];
        while (bS.lllIlIIIll(llIIllIlllIIlII, (int)llIIllIlllIIlIl)) {
            void llIIllIlllIlIII;
            void llIIllIlllIIllI;
            void llIIllIlllIIIll = llIIllIlllIIllI[llIIllIlllIIlII];
            if (bS.lllIlIIlII((int)llIIllIlllIIIll, (int)llIIllIlllIlIII)) {
                return lIIIIIllI[2];
            }
            ++llIIllIlllIIlII;
            0;
            if (((0xFF ^ 0x96 ^ (0xEA ^ 0xA4)) & (0xD1 ^ 0xB6 ^ (0x13 ^ 0x53) ^ -1)) == 0) continue;
            return ((128 + 127 - 117 + 34 ^ 33 + 102 - 94 + 114) & (0xAE ^ 0xA7 ^ (0xB2 ^ 0x8C) ^ -1)) != 0;
        }
        return lIIIIIllI[0];
    }

    private static boolean lllIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static String lllIIllIll(String llIIllIllIIIIIl, String llIIllIlIlllllI) {
        try {
            SecretKeySpec llIIllIllIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIlIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIllIllIIIIll = Cipher.getInstance("Blowfish");
            llIIllIllIIIIll.init(lIIIIIllI[14], llIIllIllIIIlII);
            return new String(llIIllIllIIIIll.doFinal(Base64.getDecoder().decode(llIIllIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIllIIIIlI) {
            llIIllIllIIIIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (bS.lllIIllllI((Object)this.gK.secondary(), (Object)bO.SNAPE_GRASS)) {
            return lIIIIIllI[0];
        }
        if (bS.lllIIlllll(Inventory.isFull() ? 1 : 0)) {
            return lIIIIIllI[0];
        }
        if (bS.lllIlIIIII(gX.distanceTo((Locatable)Players.getLocal()), lIIIIIllI[1])) {
            Movement.walkTo((WorldPoint)gX);
            0;
            return lIIIIIllI[2];
        }
        TileItem llIIllIlllIllll = TileItems.getNearest(tileItem -> {
            int n2;
            if (bS.lllIIlllll(tileItem.getName().equals(lIIIIIlIl[lIIIIIllI[2]]) ? 1 : 0) && bS.lllIIlllll(gV.contains(tileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = lIIIIIllI[2];
                0;
                
                }
            } else {
                n2 = lIIIIIllI[0];
            }
            return n2 != 0;
        });
        if (bS.lllIlIIIIl(llIIllIlllIllll)) {
            if (bS.lllIlIIIlI(Players.getLocal().getWorldLocation().equals((Object)gX) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)gX);
                return lIIIIIllI[2];
            }
            return lIIIIIllI[0];
        }
        var1_1.interact(lIIIIIlIl[lIIIIIllI[0]]);
        return lIIIIIllI[2];
    }

    private static boolean lllIIllllI(Object object, Object object2) {
        return object != object2;
    }

    static {
        bS.lllIIlllIl();
        bS.lllIIlllII();
        gS = lIIIIIllI[3];
        gT = lIIIIIllI[4];
        gU = new WorldArea(lIIIIIllI[5], lIIIIIllI[6], lIIIIIllI[7], lIIIIIllI[7], lIIIIIllI[0]);
        gV = new WorldArea(lIIIIIllI[8], lIIIIIllI[9], lIIIIIllI[7], lIIIIIllI[7], lIIIIIllI[0]);
        gW = new WorldPoint(lIIIIIllI[10], lIIIIIllI[11], lIIIIIllI[0]);
        gX = new WorldPoint(lIIIIIllI[12], lIIIIIllI[13], lIIIIIllI[0]);
    }

    private static boolean lllIlIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllIIlllIl() {
        lIIIIIllI = new int[15];
        bS.lIIIIIllI[0] = (0x55 ^ 0x3F ^ (0x33 ^ 0x72)) & (0x6C ^ 0x1E ^ (0x1D ^ 0x44) ^ -1);
        bS.lIIIIIllI[1] = 0xC8 ^ 0xA8 ^ (0x53 ^ 0x39);
        bS.lIIIIIllI[2] = 1;
        bS.lIIIIIllI[3] = 0xFFFFFFBB & 0x277E;
        bS.lIIIIIllI[4] = -(0xFFFFE44F & 0x7BF7) & (0xFFFFFE7F & 0x7DFE);
        bS.lIIIIIllI[5] = -(0x54 ^ 0x50) & (0xFFFF8DFF & 0x7BEF);
        bS.lIIIIIllI[6] = 0xFFFFDEE7 & 0x2FBE;
        bS.lIIIIIllI[7] = 0x2F ^ 0x3F;
        bS.lIIIIIllI[8] = -(0xFFFFF97F & 0x7695) & (0xFFFFFF3F & 0x77FE);
        bS.lIIIIIllI[9] = -(0xFFFFF85B & 0x77E5) & (0xFFFFFEF7 & 0x7F7D);
        bS.lIIIIIllI[10] = 0xFFFF99FF & 0x6FF5;
        bS.lIIIIIllI[11] = 0xFFFFAEFF & 0x5FAE;
        bS.lIIIIIllI[12] = 0xFFFFDF7F & 0x27AF;
        bS.lIIIIIllI[13] = -(0xFFFFD9C7 & 0x77FB) & (0xFFFFFFFA & 0x5FFF);
        bS.lIIIIIllI[14] = 2;
    }

    private static String lllIIllIlI(String llIIllIllIlIIIl, String llIIllIllIlIIII) {
        llIIllIllIlIIIl = new String(Base64.getDecoder().decode(llIIllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIllIllIlIlII = new StringBuilder();
        char[] llIIllIllIlIIll = llIIllIllIlIIII.toCharArray();
        int llIIllIllIlIIlI = lIIIIIllI[0];
        char[] llIIllIllIIllII = llIIllIllIlIIIl.toCharArray();
        int llIIllIllIIlIll = llIIllIllIIllII.length;
        int llIIllIllIIlIlI = lIIIIIllI[0];
        while (bS.lllIlIIIll(llIIllIllIIlIlI, llIIllIllIIlIll)) {
            char llIIllIllIlIlll = llIIllIllIIllII[llIIllIllIIlIlI];
            llIIllIllIlIlII.append((char)(llIIllIllIlIlll ^ llIIllIllIlIIll[llIIllIllIlIIlI % llIIllIllIlIIll.length]));
            0;
            ++llIIllIllIlIIlI;
            ++llIIllIllIIlIlI;
            0;
            if (((0x17 ^ 0x36) & ~(0x8D ^ 0xAC)) <= 3) continue;
            return null;
        }
        return String.valueOf(llIIllIllIlIlII);
    }

    private static boolean lllIlIIIIl(Object object) {
        return object == null;
    }

    private static boolean lllIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIlllll(int n2) {
        return n2 != 0;
    }

    private static void lllIIlllII() {
        lIIIIIlIl = new String[lIIIIIllI[14]];
        bS.lIIIIIlIl[bS.lIIIIIllI[0]] = bS."Take";
        bS.lIIIIIlIl[bS.lIIIIIllI[2]] = bS."Snape grass";
    }
}

