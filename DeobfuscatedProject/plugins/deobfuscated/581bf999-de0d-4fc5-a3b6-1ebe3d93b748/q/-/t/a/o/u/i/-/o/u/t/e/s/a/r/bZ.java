/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ca;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Running water", priority=50, register=true)
public class bZ
extends ca {
    private static /* synthetic */ int[] lIllIIlllII;
    private /* synthetic */ boolean hz;
    private /* synthetic */ Point hx;
    private /* synthetic */ int hy;
    private static final /* synthetic */ int hv;
    private static final /* synthetic */ int hu;
    private static /* synthetic */ String[] lIllIIllIll;
    private static final /* synthetic */ int hw;

    static {
        bZ.lIIlIllIIlIlIl();
        bZ.lIIlIllIIlIlII();
        hw = lIllIIlllII[9];
        hu = lIllIIlllII[10];
        hv = lIllIIlllII[11];
    }

    private static String lIIlIllIIlIIll(String llllllllllllllllIlIlIIllIIIllllI, String llllllllllllllllIlIlIIllIIIllIII) {
        llllllllllllllllIlIlIIllIIIllllI = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIllIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIIllIIIlllII = new StringBuilder();
        char[] llllllllllllllllIlIlIIllIIIllIll = llllllllllllllllIlIlIIllIIIllIII.toCharArray();
        int llllllllllllllllIlIlIIllIIIllIlI = lIllIIlllII[2];
        char[] llllllllllllllllIlIlIIllIIIlIlII = llllllllllllllllIlIlIIllIIIllllI.toCharArray();
        int llllllllllllllllIlIlIIllIIIlIIll = llllllllllllllllIlIlIIllIIIlIlII.length;
        int llllllllllllllllIlIlIIllIIIlIIlI = lIllIIlllII[2];
        while (bZ.lIIlIllIIllIll(llllllllllllllllIlIlIIllIIIlIIlI, llllllllllllllllIlIlIIllIIIlIIll)) {
            char llllllllllllllllIlIlIIllIIIlllll = llllllllllllllllIlIlIIllIIIlIlII[llllllllllllllllIlIlIIllIIIlIIlI];
            llllllllllllllllIlIlIIllIIIlllII.append((char)(llllllllllllllllIlIlIIllIIIlllll ^ llllllllllllllllIlIlIIllIIIllIll[llllllllllllllllIlIlIIllIIIllIlI % llllllllllllllllIlIlIIllIIIllIll.length]));
            0;
            ++llllllllllllllllIlIlIIllIIIllIlI;
            ++llllllllllllllllIlIlIIllIIIlIIlI;
            0;
            if ((14 + 7 - -56 + 58 ^ 92 + 124 - 134 + 48) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIIllIIIlllII);
    }

    @Override
    public boolean bl() {
        bZ llllllllllllllllIlIlIIllIlIIIlII;
        int[] nArray = new int[lIllIIlllII[3]];
        nArray[bZ.lIllIIlllII[2]] = lIllIIlllII[4];
        if (bZ.lIIlIllIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            this.hy = lIllIIlllII[2];
            return this.cJ();
        }
        WorldPoint llllllllllllllllIlIlIIllIlIIIIll = llllllllllllllllIlIlIIllIlIIIlII.a(llllllllllllllllIlIlIIllIlIIIlII.hx);
        if (bZ.lIIlIllIIlIllI(llllllllllllllllIlIlIIllIlIIIIll.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0) && bZ.lIIlIllIIlIllI(llllllllllllllllIlIlIIllIlIIIlII.hy)) {
            Log.info((String)lIllIIllIll[lIllIIlllII[2]]);
            Movement.setDestination((WorldPoint)llllllllllllllllIlIlIIllIlIIIIll);
            return lIllIIlllII[3];
        }
        if (bZ.lIIlIllIIlIlll(llllllllllllllllIlIlIIllIlIIIIll.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            llllllllllllllllIlIlIIllIlIIIlII.hy = lIllIIlllII[3];
        }
        if (bZ.lIIlIllIIlIllI(llllllllllllllllIlIlIIllIlIIIlII.hz ? 1 : 0)) {
            return llllllllllllllllIlIlIIllIlIIIlII.cI();
        }
        return this.cH();
    }

    /*
     * WARNING - void declaration
     */
    private boolean cH() {
        void var2_2;
        int[] nArray = new int[lIllIIlllII[3]];
        nArray[bZ.lIllIIlllII[2]] = this.aX();
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (bZ.lIIlIllIIllIIl(nPC)) {
            return lIllIIlllII[2];
        }
        int[] nArray2 = new int[lIllIIlllII[3]];
        nArray2[bZ.lIllIIlllII[2]] = lIllIIlllII[4];
        Item llllllllllllllllIlIlIIllIIllIlll = Inventory.getFirst((int[])nArray2);
        if (bZ.lIIlIllIIllIIl(llllllllllllllllIlIlIIllIIllIlll)) {
            return lIllIIlllII[2];
        }
        var2_2.useOn((Actor)nPC);
        return lIllIIlllII[3];
    }

    private boolean cJ() {
        TileObject tileObject = this.cK();
        if (bZ.lIIlIllIIllIIl(tileObject)) {
            return lIllIIlllII[2];
        }
        if (bZ.lIIlIllIIlIlll(Inventory.isFull() ? 1 : 0)) {
            bZ llllllllllllllllIlIlIIllIIlIllIl;
            llllllllllllllllIlIlIIllIIlIllIl.bh();
            return lIllIIlllII[3];
        }
        int[] nArray = new int[lIllIIlllII[3]];
        nArray[bZ.lIllIIlllII[2]] = lIllIIlllII[4];
        TileItem llllllllllllllllIlIlIIllIIlIlIll = TileItems.getNearest((int[])nArray);
        if (bZ.lIIlIllIIllIlI(llllllllllllllllIlIlIIllIIlIlIll)) {
            llllllllllllllllIlIlIIllIIlIlIll.interact(lIllIIllIll[lIllIIlllII[6]]);
            return lIllIIlllII[3];
        }
        return lIllIIlllII[2];
    }

    private static boolean lIIlIllIIllIII(Object object, Object object2) {
        return object != object2;
    }

    private TileObject cK() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bZ.lIIlIllIIlIlll(tileObject.getName().equals(lIllIIllIll[lIllIIlllII[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllII[3]];
                stringArray[bZ.lIllIIlllII[2]] = lIllIIllIll[lIllIIlllII[8]];
                if (bZ.lIIlIllIIlIlll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllII[3];
                    0;
                    if (1 >= -1) return n2 != 0;
                    return ((84 + 201 - 140 + 91 ^ 0 + 45 - -28 + 90) & (64 + 117 - 74 + 35 ^ 2 + 141 - 66 + 116 ^ -1)) != 0;
                }
            }
            n2 = lIllIIlllII[2];
            return n2 != 0;
        });
    }

    private static boolean lIIlIllIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIllIIlIllI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIllIIlIlII() {
        lIllIIllIll = new String[lIllIIlllII[12]];
        bZ.lIllIIllIll[bZ.lIllIIlllII[2]] = bZ."Walking to start";
        bZ.lIllIIllIll[bZ.lIllIIlllII[3]] = bZ."You fill your container.";
        bZ.lIllIIllIll[bZ.lIllIIlllII[5]] = bZ."You empty a";
        bZ.lIllIIllIll[bZ.lIllIIlllII[6]] = bZ."Take";
        bZ.lIllIIllIll[bZ.lIllIIlllII[7]] = bZ."Waterfall";
        bZ.lIllIIllIll[bZ.lIllIIlllII[8]] = bZ."Fill";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllllllllllllIlIlIIllIIlllllI;
        if (bZ.lIIlIllIIllIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String llllllllllllllllIlIlIIllIIllllIl = llllllllllllllllIlIlIIllIIlllllI.getMessage();
        if (bZ.lIIlIllIIlIlll(llllllllllllllllIlIlIIllIIllllIl.contains(lIllIIllIll[lIllIIlllII[3]]) ? 1 : 0)) {
            llllllllllllllllIlIlIIllIIllllll.hz = lIllIIlllII[3];
            0;
            if (3 <= ((0xB6 ^ 0x81) & ~(0x3D ^ 0xA))) {
                return;
            }
        } else if (bZ.lIIlIllIIlIlll(llllllllllllllllIlIlIIllIIllllIl.contains(lIllIIllIll[lIllIIlllII[5]]) ? 1 : 0)) {
            llllllllllllllllIlIlIIllIIllllll.hz = lIllIIlllII[2];
        }
    }

    @Inject
    protected bZ(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.hx = new Point(lIllIIlllII[0], lIllIIlllII[1]);
        this.hy = lIllIIlllII[2];
    }

    private static boolean lIIlIllIIllIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cI() {
        void var2_2;
        TileObject tileObject = this.cK();
        if (bZ.lIIlIllIIllIIl(tileObject)) {
            return lIllIIlllII[2];
        }
        int[] nArray = new int[lIllIIlllII[3]];
        nArray[bZ.lIllIIlllII[2]] = lIllIIlllII[4];
        Item llllllllllllllllIlIlIIllIIllIIIl = Inventory.getFirst((int[])nArray);
        if (bZ.lIIlIllIIllIIl(llllllllllllllllIlIlIIllIIllIIIl)) {
            return lIllIIlllII[2];
        }
        var2_2.useOn(tileObject);
        return lIllIIlllII[3];
    }

    private static boolean lIIlIllIIllIIl(Object object) {
        return object == null;
    }

    private static void lIIlIllIIlIlIl() {
        lIllIIlllII = new int[14];
        bZ.lIllIIlllII[0] = 0xB5 ^ 0x9D;
        bZ.lIllIIlllII[1] = 0x44 ^ 0x69;
        bZ.lIllIIlllII[2] = (0xAF ^ 0xC4 ^ (0x59 ^ 0x7F)) & (0x6C ^ 0x76 ^ (0x5F ^ 8) ^ -1);
        bZ.lIllIIlllII[3] = 1;
        bZ.lIllIIlllII[4] = -(0xFFFFD7BF & 0x2D61) & (0xFFFFEFFF & 0x7FBF);
        bZ.lIllIIlllII[5] = 2;
        bZ.lIllIIlllII[6] = 3;
        bZ.lIllIIlllII[7] = 0x57 ^ 0x53;
        bZ.lIllIIlllII[8] = 0x2E ^ 0x2B;
        bZ.lIllIIlllII[9] = -(0xFFFFF7A5 & 0x4EFF) & (0xFFFFFFFF & 0xF7FF);
        bZ.lIllIIlllII[10] = 0xFFFFF1EF & 0xBF77;
        bZ.lIllIIlllII[11] = -(0xFFFFAEB3 & 0x536D) & (0xFFFFFF7B & 0x27FF);
        bZ.lIllIIlllII[12] = 0xCC ^ 0xC4 ^ (0x24 ^ 0x2A);
        bZ.lIllIIlllII[13] = 0x2F ^ 0x27;
    }

    private static boolean lIIlIllIIlIlll(int n2) {
        return n2 != 0;
    }

    private static String lIIlIllIIlIIlI(String llllllllllllllllIlIlIIllIIIIIlll, String llllllllllllllllIlIlIIllIIIIIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIllIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIllIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIllIIlllII[13]), "DES");
            Cipher llllllllllllllllIlIlIIllIIIIlIll = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIllIIIIlIll.init(lIllIIlllII[5], llllllllllllllllIlIlIIllIIIIllII);
            return new String(llllllllllllllllIlIlIIllIIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIllIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIllIIIIlIlI) {
            llllllllllllllllIlIlIIllIIIIlIlI.printStackTrace();
            return null;
        }
    }
}

