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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.c_Unknown;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.DEnum;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.IEnum;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.KEnum;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.LEnum;

@Singleton
public class b_Unknown {
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
                b var8;
                void var14;
                if (!b.lIllllIlIllIIIl((int)var14)) break;
                var8.u();
                0;
                if (1 != -1) break;
                return;
            }
            case 2: {
                b var8;
                void var14;
                if (!b.lIllllIlIllIIlI(var8.E)) break;
                if (b.lIllllIlIllIIIl((int)var14)) {
                    var8.u();
                    0;
                    if (((0x13 ^ 0x22) & ~(0x70 ^ 0x41)) == 0) break;
                    return;
                }
                var8.F = d.NOT_ATTACKING;
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
        void var3;
        if (b.lIllllIlIlIllll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var6 = var3.getMessage();
        if (!b.lIllllIlIllIIII(var6.startsWith(lIlIlIIIlIIlI[lIlIlIIIlIIll[0]]) ? 1 : 0) || b.lIllllIlIllIIIl(var6.startsWith(lIlIlIIIlIIlI[lIlIlIIIlIIll[6]]) ? 1 : 0)) {
            b var21;
            int var9;
            int n2;
            if (b.lIllllIlIllIIIl(var6.toLowerCase().contains(lIlIlIIIlIIlI[lIlIlIIIlIIll[2]]) ? 1 : 0)) {
                n2 = lIlIlIIIlIIll[2];
                0;
                if (3 <= 0) {
                    return;
                }
            } else {
                n2 = var9 = lIlIlIIIlIIll[1];
            }
            if (b.lIllllIlIlIllIl((Object)var21.F, (Object)d.DELAYED)) {
                var21.E += var9;
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

    private static String lIllllIlIlIIllI(String var10, String var16) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIlIIIlIIll[2], var20);
            return new String(var5.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private ItemStats a(ItemContainer itemContainer, int n2) {
        ItemStats itemStats;
        Item item = itemContainer.getItem(n2);
        if (b.lIllllIlIlIlIlI(item)) {
            itemStats = this.G.getItemStats(item.getId(), lIlIlIIIlIIll[0]);
            0;
            if (-3 > 0) {
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
                    b var12;
                    if (!b.lIllllIlIllIIIl(var12.t() ? 1 : 0)) break;
                    var12.u();
                    0;
                    if (3 <= (0x37 ^ 0x33)) break;
                    return;
                }
            }
        }
    }

    private static String lIllllIlIlIIlll(String var15, String var13) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIIll[7]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIlIIIlIIll[2], var7);
            return new String(var2.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int s() {
        void var3_3;
        b var1;
        void var4;
        ItemStats itemStats = this.q();
        if (b.lIllllIlIlIllII(itemStats)) {
            return lIlIlIIIlIIll[5];
        }
        ItemEquipmentStats var11 = var4.getEquipment();
        int var18 = var11.getAspeed();
        if (b.lIllllIlIlIllIl((Object)var1.r(), (Object)k.RANGING) && b.lIllllIlIlIlllI(var1.w.getVarpValue(lIlIlIIIlIIll[3]), lIlIlIIIlIIll[6])) {
            --var18;
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
        b.lIlIlIIIlIIll[1] = 3;
        b.lIlIlIIIlIIll[2] = 2;
        b.lIlIlIIIlIIll[3] = 0 ^ 0x51 ^ (0x40 ^ 0x3A);
        b.lIlIlIIIlIIll[4] = -(0xFFFFCE9D & 0x7FE3) & (0xFFFFDFF5 & 0x6FEF);
        b.lIlIlIIIlIIll[5] = 0x74 ^ 0x70;
        b.lIlIlIIIlIIll[6] = 1;
        b.lIlIlIIIlIIll[7] = 0x8A ^ 0x82;
    }

    private static void lIllllIlIlIlIII() {
        lIlIlIIIlIIlI = new String[lIlIlIIIlIIll[1]];
        b.lIlIlIIIlIIlI[b.lIlIlIIIlIIll[0]] = b."You eat";
        b.lIlIlIIIlIIlI[b.lIlIlIIIlIIll[6]] = b."You drink the wine";
        b.lIlIlIIIlIIlI[b.lIlIlIIIlIIll[2]] = b."karambwan";
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
            0;
            
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

