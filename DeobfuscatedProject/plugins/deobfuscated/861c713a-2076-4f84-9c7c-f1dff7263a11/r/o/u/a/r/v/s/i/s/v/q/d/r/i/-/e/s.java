/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.q;

@TaskDesc(name="Pathing to Boss", priority=2147483547, blocking=true)
public class s
extends q {
    private static /* synthetic */ WorldPoint ai;
    private static final /* synthetic */ int ah;
    private final /* synthetic */ int am = 4661;
    private /* synthetic */ WorldArea an;
    private static /* synthetic */ int[] lIlIlIIIIIllI;
    private final /* synthetic */ SquireVardorvisConfig al;
    private static /* synthetic */ String[] lIlIlIIIIIlIl;
    private final /* synthetic */ SquireVardorvis aj;
    private final /* synthetic */ e ak;

    @Inject
    public s(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.am = lIlIlIIIIIllI[0];
        this.an = new WorldArea(new WorldPoint(lIlIlIIIIIllI[1], lIlIlIIIIIllI[2], lIlIlIIIIIllI[3]), new WorldPoint(lIlIlIIIIIllI[4], lIlIlIIIIIllI[5], lIlIlIIIIIllI[3]));
        this.aj = squireVardorvis;
        this.ak = squireVardorvis.j();
        this.al = squireVardorvisConfig;
    }

    private static boolean lIllllIlIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean run() {
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(this.aj.h() ? 1 : 0)) {
            return lIlIlIIIIIllI[3];
        }
        return this.l();
    }

    private static boolean lIllllIlIIIIIII(int n2) {
        return n2 != 0;
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIIlllllll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIIllllllI();
        ah = lIlIlIIIIIllI[12];
        ai = new WorldPoint(lIlIlIIIIIllI[13], lIlIlIIIIIllI[14], lIlIlIIIIIllI[3]);
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, String string2, int n2, Player player) {
        void llllllllllllllIllIllIIlIlIIlllll;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIll(tileObject.getId(), n2) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(tileObject.getName().equals(string) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIIIllI[6]];
                stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3]] = string2;
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n3 = lIlIlIIIIIllI[6];
                    0;
                    if (((74 + 106 - 159 + 107 ^ 55 + 50 - 22 + 60) & (34 + 9 - 30 + 125 ^ 78 + 34 - 80 + 101 ^ -1)) <= 0) return n3 != 0;
                    return ((99 + 43 - 30 + 29 ^ 34 + 152 - 44 + 35) & (0xAC ^ 0xB7 ^ (0x99 ^ 0xBE) ^ -1)) != 0;
                }
            }
            n3 = lIlIlIIIIIllI[3];
            return n3 != 0;
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIIl(tileObject2)) {
            return;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(llllllllllllllIllIllIIlIlIIlllll.isMoving() ? 1 : 0)) {
            return;
        }
        tileObject2.interact(string2);
    }

    private static void lIllllIIllllllI() {
        lIlIlIIIIIlIl = new String[lIlIlIIIIIllI[15]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s."No";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[6]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s."Rocks";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[7]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s."Climb-over";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[10]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s."Ring of shadows";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[11]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s."Teleport";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[9]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s."Ring of shadows";
    }

    private static String lIllllIIlllllIl(String llllllllllllllIllIllIIlIlIIIIlII, String llllllllllllllIllIllIIlIlIIIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIllIIlIlIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIlIIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIllI[16]), "DES");
            Cipher llllllllllllllIllIllIIlIlIIIlIII = Cipher.getInstance("DES");
            llllllllllllllIllIllIIlIlIIIlIII.init(lIlIlIIIIIllI[7], llllllllllllllIllIllIIlIlIIIlIIl);
            return new String(llllllllllllllIllIllIIlIlIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIlIlIIIIlll) {
            llllllllllllllIllIllIIlIlIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean S() {
        int n3;
        s llllllllllllllIllIllIIlIlIIllIlI;
        void llllllllllllllIllIllIIlIlIIllIIl;
        int[] nArray = this.w.getMapRegions();
        int llllllllllllllIllIllIIlIlIIllIII = lIlIlIIIIIllI[3];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIlI(llllllllllllllIllIllIIlIlIIllIII, ((void)llllllllllllllIllIllIIlIlIIllIIl).length)) {
            ++llllllllllllllIllIllIIlIlIIllIII;
            0;
            if (2 >= 1) continue;
            return ((0x4D ^ 0x7A) & ~(0xA8 ^ 0x9F)) != 0;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(IntStream.of((int[])llllllllllllllIllIllIIlIlIIllIIl).noneMatch(n2 -> {
            boolean bl;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIll(n2, lIlIlIIIIIllI[0])) {
                bl = lIlIlIIIIIllI[6];
                0;
                if (-2 > 0) {
                    return ((13 + 81 - -39 + 108 ^ 42 + 110 - 129 + 124) & (154 + 186 - 186 + 60 ^ 114 + 125 - 146 + 87 ^ -1)) != 0;
                }
            } else {
                bl = lIlIlIIIIIllI[3];
            }
            return bl;
        }) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIll(llllllllllllllIllIllIIlIlIIllIlI.w.getVarbitValue(lIlIlIIIIIllI[12]), lIlIlIIIIIllI[6])) {
            String[] stringArray = new String[lIlIlIIIIIllI[6]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[9]];
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n3 = lIlIlIIIIIllI[6];
                0;
                if (-3 <= 0) return n3 != 0;
                return ((60 + 8 - 2 + 103 ^ 6 + 58 - 59 + 146) & (45 + 33 - 13 + 122 ^ 100 + 32 - 15 + 16 ^ -1)) != 0;
            }
        }
        n3 = lIlIlIIIIIllI[3];
        return n3 != 0;
    }

    private static String lIllllIIlllllII(String llllllllllllllIllIllIIlIIlllIllI, String llllllllllllllIllIllIIlIIlllIIII) {
        llllllllllllllIllIllIIlIIlllIllI = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIlIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIllIIlIIlllIlII = new StringBuilder();
        char[] llllllllllllllIllIllIIlIIlllIIll = llllllllllllllIllIllIIlIIlllIIII.toCharArray();
        int llllllllllllllIllIllIIlIIlllIIlI = lIlIlIIIIIllI[3];
        char[] llllllllllllllIllIllIIlIIllIllII = llllllllllllllIllIllIIlIIlllIllI.toCharArray();
        int llllllllllllllIllIllIIlIIllIlIll = llllllllllllllIllIllIIlIIllIllII.length;
        int llllllllllllllIllIllIIlIIllIlIlI = lIlIlIIIIIllI[3];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIlI(llllllllllllllIllIllIIlIIllIlIlI, llllllllllllllIllIllIIlIIllIlIll)) {
            char llllllllllllllIllIllIIlIIlllIlll = llllllllllllllIllIllIIlIIllIllII[llllllllllllllIllIllIIlIIllIlIlI];
            llllllllllllllIllIllIIlIIlllIlII.append((char)(llllllllllllllIllIllIIlIIlllIlll ^ llllllllllllllIllIllIIlIIlllIIll[llllllllllllllIllIllIIlIIlllIIlI % llllllllllllllIllIllIIlIIlllIIll.length]));
            0;
            ++llllllllllllllIllIllIIlIIlllIIlI;
            ++llllllllllllllIllIllIIlIIllIlIlI;
            0;
            if (((0x83 ^ 0xBC ^ (0x6A ^ 0xF)) & (175 + 184 - 141 + 19 ^ 149 + 82 - 136 + 88 ^ -1)) != 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIllIIlIIlllIlII);
    }

    private static void lIllllIIlllllll() {
        lIlIlIIIIIllI = new int[17];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[0] = 0xFFFF9AFD & 0x7737;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[1] = 0xFFFFD6DF & 0x2D79;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[2] = -(0xFFFFEAB5 & 0x77DB) & (0xFFFFEFFF & 0x7FF3);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3] = (33 + 135 - 110 + 107 ^ 69 + 112 - 151 + 139) & (0xE ^ 0x4A ^ (0x2E ^ 0x66) ^ -1);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[4] = 0xFFFF8F6C & 0x74F3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[5] = -(0xFFFFF75D & 0x5AB7) & (0xFFFFDF7F & Short.MAX_VALUE);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[6] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[7] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[8] = 0xFFFFDD57 & 0xE3FF;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[9] = 0xA ^ 0x7B ^ (0xFB ^ 0x8F);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[10] = 3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[11] = 0x75 ^ 0x45 ^ (0x64 ^ 0x50);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[12] = 0xFFFFBF2F & 0x7BF4;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[13] = 0xFFFF9D5F & 0x66FD;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[14] = -(0xFFFFFAE4 & 0x779F) & (0xFFFFFFFF & 0x7FE7);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[15] = 146 + 45 - 46 + 39 ^ 179 + 137 - 301 + 175;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[16] = 19 + 70 - -4 + 48 ^ 125 + 5 - 40 + 43;
    }

    @Override
    public boolean l() {
        s llllllllllllllIllIllIIlIlIlIlIlI;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIIIIIllI[3];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(llllllllllllllIllIllIIlIlIlIlIlI.aj.i() ? 1 : 0)) {
            return lIlIlIIIIIllI[6];
        }
        Player llllllllllllllIllIllIIlIlIlIlIIl = Players.getLocal();
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIIl(llllllllllllllIllIllIIlIlIlIlIIl)) {
            return lIlIlIIIIIllI[3];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(llllllllllllllIllIllIIlIlIlIlIlI.an.contains((Locatable)llllllllllllllIllIllIIlIlIlIlIIl) ? 1 : 0)) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIIIllI[6]];
                stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[3]];
                Dialog.chooseOption((String[])stringArray);
                0;
                return lIlIlIIIIIllI[6];
            }
            llllllllllllllIllIllIIlIlIlIlIlI.a(lIlIlIIIIIlIl[lIlIlIIIIIllI[6]], lIlIlIIIIIlIl[lIlIlIIIIIllI[7]], lIlIlIIIIIllI[8], llllllllllllllIllIllIIlIlIlIlIIl);
            return lIlIlIIIIIllI[6];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(llllllllllllllIllIllIIlIlIlIlIlI.S() ? 1 : 0)) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(Dialog.isOpen() ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlIlIIIIIllI[9]);
                0;
            }
            String[] stringArray = new String[lIlIlIIIIIllI[6]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[10]];
            Item llllllllllllllIllIllIIlIlIlIlIII = Inventory.getFirst((String[])stringArray);
            llllllllllllllIllIllIIlIlIlIlIII.interact(lIlIlIIIIIlIl[lIlIlIIIIIllI[11]]);
            return lIlIlIIIIIllI[6];
        }
        Movement.walkTo((WorldPoint)ai);
        0;
        return lIlIlIIIIIllI[6];
    }

    private static boolean lIllllIlIIIIIIl(Object object) {
        return object == null;
    }
}

