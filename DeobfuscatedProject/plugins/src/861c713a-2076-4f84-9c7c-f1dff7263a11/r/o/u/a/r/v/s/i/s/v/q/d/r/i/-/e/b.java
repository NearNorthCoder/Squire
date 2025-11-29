/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.InteractingChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemManager
 *  net.runelite.http.api.item.ItemEquipmentStats
 *  net.runelite.http.api.item.ItemStats
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.InteractingChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.http.api.item.ItemEquipmentStats;
import net.runelite.http.api.item.ItemStats;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.c;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.d;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.i;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.k;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.l;

@Singleton
public class b {
    public /* synthetic */ d F;
    public /* synthetic */ int E;
    final /* synthetic */ int A = 0;
    private final /* synthetic */ int B = 3;
    @Inject
    private /* synthetic */ Client w;
    public /* synthetic */ int D;
    private static /* synthetic */ int[] lIlIlIIIlIIll;
    private final /* synthetic */ int C = 2;
    private static /* synthetic */ String[] lIlIlIIIlIIlI;
    @Inject
    private /* synthetic */ ItemManager G;

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(GameTick gameTick) {
        boolean bl = this.t();
        switch (c.H[this.F.ordinal()]) {
            case 1: {
                b llllllllllllllIllIllIIIlIlIllIlI;
                void llllllllllllllIllIllIIIlIlIllIIl;
                if (!b.lIllllIlIllIIIl((int)llllllllllllllIllIllIIIlIlIllIIl)) break;
                llllllllllllllIllIllIIIlIlIllIlI.u();
                "".length();
                if (" ".length() != -" ".length()) break;
                return;
            }
            case 2: {
                b llllllllllllllIllIllIIIlIlIllIlI;
                void llllllllllllllIllIllIIIlIlIllIIl;
                if (!b.lIllllIlIllIIlI(llllllllllllllIllIllIIIlIlIllIlI.E)) break;
                if (b.lIllllIlIllIIIl((int)llllllllllllllIllIllIIIlIlIllIIl)) {
                    llllllllllllllIllIllIIIlIlIllIlI.u();
                    "".length();
                    if (((0x13 ^ 0x22) & ~(0x70 ^ 0x41)) == 0) break;
                    return;
                }
                llllllllllllllIllIllIIIlIlIllIlI.F = d.NOT_ATTACKING;
            }
        }
        this.E -= lIlIlIIIlIIll[6];
    }

    private static boolean lIllllIlIllIIlI(int n2) {
        return n2 <= 0;
    }

    public int w() {
        return this.D;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllllllllllIllIllIIIlIllIlIIl;
        if (b.lIllllIlIlIllll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String llllllllllllllIllIllIIIlIllIlIII = llllllllllllllIllIllIIIlIllIlIIl.getMessage();
        if (!b.lIllllIlIllIIII(llllllllllllllIllIllIIIlIllIlIII.startsWith(lIlIlIIIlIIlI[lIlIlIIIlIIll[0]]) ? 1 : 0) || b.lIllllIlIllIIIl(llllllllllllllIllIllIIIlIllIlIII.startsWith(lIlIlIIIlIIlI[lIlIlIIIlIIll[6]]) ? 1 : 0)) {
            b llllllllllllllIllIllIIIlIllIlIlI;
            int llllllllllllllIllIllIIIlIllIIlll;
            int n2;
            if (b.lIllllIlIllIIIl(llllllllllllllIllIllIIIlIllIlIII.toLowerCase().contains(lIlIlIIIlIIlI[lIlIlIIIlIIll[2]]) ? 1 : 0)) {
                n2 = lIlIlIIIlIIll[2];
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            } else {
                n2 = llllllllllllllIllIllIIIlIllIIlll = lIlIlIIIlIIll[1];
            }
            if (b.lIllllIlIlIllIl((Object)llllllllllllllIllIllIIIlIllIlIlI.F, (Object)d.DELAYED)) {
                llllllllllllllIllIllIIIlIllIlIlI.E += llllllllllllllIllIllIIIlIllIIlll;
            }
        }
    }

    private static boolean lIllllIlIlIllll(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public b() {
        this.A = lIlIlIIIlIIll[0];
        this.B = lIlIlIIIlIIll[1];
        this.C = lIlIlIIIlIIll[2];
        this.D = lIlIlIIIlIIll[0];
        this.E = lIlIlIIIlIIll[0];
        this.F = d.NOT_ATTACKING;
    }

    public int v() {
        return lIlIlIIIlIIll[6] + this.E;
    }

    public void x() {
        this.E = lIlIlIIIlIIll[0];
    }

    private static String lIllllIlIlIIllI(String llllllllllllllIllIllIIIlIlIIIIlI, String llllllllllllllIllIllIIIlIlIIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIlIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIIlIlIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIIlIlIIIllI.init(lIlIlIIIlIIll[2], llllllllllllllIllIllIIIlIlIIIlll);
            return new String(llllllllllllllIllIllIIIlIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIIlIlIIIlIl) {
            llllllllllllllIllIllIIIlIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private ItemStats a(ItemContainer itemContainer, int n2) {
        ItemStats itemStats;
        Item item = itemContainer.getItem(n2);
        if (b.lIllllIlIlIlIlI(item)) {
            itemStats = this.G.getItemStats(item.getId(), lIlIlIIIlIIll[0]);
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        } else {
            itemStats = null;
        }
        return itemStats;
    }

    @Subscribe
    public void a(InteractingChanged interactingChanged) {
        Actor actor = interactingChanged.getSource();
        Actor actor2 = interactingChanged.getTarget();
        Player player = this.w.getLocalPlayer();
        if (b.lIllllIlIllIIIl(actor.equals(player) ? 1 : 0) && b.lIllllIlIllIIIl(actor2 instanceof NPC)) {
            switch (c.H[this.F.ordinal()]) {
                case 1: {
                    b llllllllllllllIllIllIIIlIllIIIIl;
                    if (!b.lIllllIlIllIIIl(llllllllllllllIllIllIIIlIllIIIIl.t() ? 1 : 0)) break;
                    llllllllllllllIllIllIIIlIllIIIIl.u();
                    "".length();
                    if ("   ".length() <= (0x37 ^ 0x33)) break;
                    return;
                }
            }
        }
    }

    private static String lIllllIlIlIIlll(String llllllllllllllIllIllIIIlIlIIllll, String llllllllllllllIllIllIIIlIlIIlllI) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIlIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIIll[7]), "DES");
            Cipher llllllllllllllIllIllIIIlIlIlIIll = Cipher.getInstance("DES");
            llllllllllllllIllIllIIIlIlIlIIll.init(lIlIlIIIlIIll[2], llllllllllllllIllIllIIIlIlIlIlII);
            return new String(llllllllllllllIllIllIIIlIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIlIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIIlIlIlIIlI) {
            llllllllllllllIllIllIIIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int s() {
        void var3_3;
        b llllllllllllllIllIllIIIlIlllIlII;
        void llllllllllllllIllIllIIIlIlllIIll;
        ItemStats itemStats = this.q();
        if (b.lIllllIlIlIllII(itemStats)) {
            return lIlIlIIIlIIll[5];
        }
        ItemEquipmentStats llllllllllllllIllIllIIIlIlllIIlI = llllllllllllllIllIllIIIlIlllIIll.getEquipment();
        int llllllllllllllIllIllIIIlIlllIIIl = llllllllllllllIllIllIIIlIlllIIlI.getAspeed();
        if (b.lIllllIlIlIllIl((Object)llllllllllllllIllIllIIIlIlllIlII.r(), (Object)k.RANGING) && b.lIllllIlIlIlllI(llllllllllllllIllIllIIIlIlllIlII.w.getVarpValue(lIlIlIIIlIIll[3]), lIlIlIIIlIIll[6])) {
            --llllllllllllllIllIllIIIlIlllIIIl;
        }
        return (int)var3_3;
    }

    private static boolean lIllllIlIlIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllllIlIllIIIl(int n2) {
        return n2 != 0;
    }

    static {
        b.lIllllIlIlIlIIl();
        b.lIllllIlIlIlIII();
    }

    private static void lIllllIlIlIlIIl() {
        lIlIlIIIlIIll = new int[8];
        b.lIlIlIIIlIIll[0] = (0xD6 ^ 0xC1) & ~(0x45 ^ 0x52);
        b.lIlIlIIIlIIll[1] = "   ".length();
        b.lIlIlIIIlIIll[2] = "  ".length();
        b.lIlIlIIIlIIll[3] = 0 ^ 0x51 ^ (0x40 ^ 0x3A);
        b.lIlIlIIIlIIll[4] = -(0xFFFFCE9D & 0x7FE3) & (0xFFFFDFF5 & 0x6FEF);
        b.lIlIlIIIlIIll[5] = 0x74 ^ 0x70;
        b.lIlIlIIIlIIll[6] = " ".length();
        b.lIlIlIIIlIIll[7] = 0x8A ^ 0x82;
    }

    private static void lIllllIlIlIlIII() {
        lIlIlIIIlIIlI = new String[lIlIlIIIlIIll[1]];
        b.lIlIlIIIlIIlI[b.lIlIlIIIlIIll[0]] = b.lIllllIlIlIIllI("sVWlv5yTHqI=", "afeIi");
        b.lIlIlIIIlIIlI[b.lIlIlIIIlIIll[6]] = b.lIllllIlIlIIllI("lYfZ5QdvPFzpcNxzpNiGlOLaMzrsrBIK", "yPQRz");
        b.lIlIlIIIlIIlI[b.lIlIlIIIlIIll[2]] = b.lIllllIlIlIIlll("2TUNnKCWTgZTJEuKFor+dQ==", "qgmOd");
    }

    private ItemStats q() {
        return this.a(this.w.getItemContainer(InventoryID.EQUIPMENT), EquipmentInventorySlot.WEAPON.getSlotIdx());
    }

    private static boolean lIllllIlIlIlIlI(Object object) {
        return object != null;
    }

    private static boolean lIllllIlIlIllII(Object object) {
        return object == null;
    }

    private void u() {
        this.F = d.DELAYED;
        this.D = this.E = this.s();
    }

    private static boolean lIllllIlIlIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private boolean t() {
        boolean bl;
        if (b.lIllllIlIlIlIlI((Object)i.d(this.w.getLocalPlayer().getAnimation()))) {
            bl = lIlIlIIIlIIll[6];
            "".length();
            if (null != null) {
                return ((178 + 90 - 87 + 2 ^ 93 + 102 - 147 + 123) & (7 + 33 - -143 + 6 ^ 46 + 55 - 23 + 83 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIlIIIlIIll[0];
        }
        return bl;
    }

    private k r() {
        int n2;
        k[] kArray;
        int n3 = this.w.getVarpValue(lIlIlIIIlIIll[3]);
        if (b.lIllllIlIlIlIll(n3, (kArray = l.e(n2 = this.w.getVarbitValue(lIlIlIIIlIIll[4])).O()).length)) {
            return kArray[n3];
        }
        return k.ACCURATE;
    }

    private static boolean lIllllIlIllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIlIlIlIll(int n2, int n3) {
        return n2 < n3;
    }
}

