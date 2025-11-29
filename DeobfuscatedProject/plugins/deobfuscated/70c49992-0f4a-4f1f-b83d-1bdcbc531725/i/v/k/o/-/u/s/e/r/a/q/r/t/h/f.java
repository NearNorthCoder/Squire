/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponMap
 *  com.openosrs.client.util.WeaponStyle
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.j;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@Singleton
public class f {
    private static final /* synthetic */ int K;
    private static /* synthetic */ int[] lIlIlIlIlIIIl;
    private static final /* synthetic */ int N;
    private static final /* synthetic */ String J;
    public /* synthetic */ int Q;
    public /* synthetic */ int O;
    private /* synthetic */ boolean R;
    private static final /* synthetic */ int L;
    private static /* synthetic */ String[] lIlIlIlIIllll;
    public /* synthetic */ int P;
    private static final /* synthetic */ int M;
    @Inject
    private /* synthetic */ SquireVorkathConfig y;

    /*
     * WARNING - void declaration
     */
    public boolean d(WorldPoint worldPoint, WorldPoint worldPoint2) {
        int n2;
        void llllllllllllllIllIlIlIllllllIllI;
        void llllllllllllllIllIlIlIllllllIlll;
        f llllllllllllllIllIlIlIlllllllIlI;
        int llllllllllllllIllIlIlIllllllIlIl;
        int n3 = Math.abs(worldPoint.getY() - worldPoint2.getWorldY());
        WorldPoint worldPoint3 = worldPoint.dy(lIlIlIlIlIIIl[3]);
        int n4 = lIlIlIlIlIIIl[10];
        if (f.lIlllllIlllIlIl(Equipment.contains(item -> item.getName().toLowerCase().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[12]])) ? 1 : 0)) {
            llllllllllllllIllIlIlIllllllIlIl = lIlIlIlIlIIIl[11];
        }
        if (f.lIlllllIlllIlIl(llllllllllllllIllIlIlIlllllllIlI.C() ? 1 : 0)) {
            llllllllllllllIllIlIlIllllllIlIl = lIlIlIlIlIIIl[9];
        }
        if (f.lIlllllIllllIIl((int)llllllllllllllIllIlIlIllllllIlll, llllllllllllllIllIlIlIllllllIlIl) && f.lIlllllIlllIlIl(TileObjects.getAll(arg_0 -> f.c((WorldPoint)llllllllllllllIllIlIlIllllllIllI, arg_0)).isEmpty() ? 1 : 0)) {
            n2 = lIlIlIlIlIIIl[3];
            0;
            if (3 <= 2) {
                return ((0x13 ^ 0x4E) & ~(0x7C ^ 0x21)) != 0;
            }
        } else {
            n2 = lIlIlIlIlIIIl[1];
        }
        return n2 != 0;
    }

    public boolean z() {
        int n2;
        int[] nArray = new int[lIlIlIlIlIIIl[3]];
        nArray[f.lIlIlIlIlIIIl[1]] = lIlIlIlIlIIIl[6];
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (f.lIlllllIlllIIIl(projectile) && f.lIlllllIlllIIlI(projectile.getRemainingCycles(), lIlIlIlIlIIIl[7])) {
            n2 = lIlIlIlIlIIIl[3];
            0;
            if (((0xD9 ^ 0x8C ^ (0x12 ^ 0x26)) & (110 + 85 - 97 + 122 ^ 58 + 14 - 11 + 128 ^ -1)) >= 1) {
                return ((154 + 189 - 162 + 25 ^ 114 + 0 - -15 + 30) & (0x1D ^ 0x73 ^ (4 ^ 0x3B) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIlIlIlIIIl[1];
        }
        return n2 != 0;
    }

    public j B() {
        f llllllllllllllIllIlIllIIIIIlIIll;
        if (f.lIlllllIlllIlIl(this.R ? 1 : 0)) {
            return j.FREEZE;
        }
        if (f.lIlllllIlllIlIl(llllllllllllllIllIlIllIIIIIlIIll.y() ? 1 : 0)) {
            return j.FIRE_BALLS;
        }
        return j.NONE;
    }

    public int F() {
        return this.O;
    }

    private static /* synthetic */ boolean c(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (f.lIlllllIlllIIll(tileObject.getId(), lIlIlIlIlIIIl[5]) && f.lIlllllIlllIlIl(tileObject.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = lIlIlIlIlIIIl[3];
            0;
            if (((0x37 ^ 0x23 ^ (0xC5 ^ 0xC0)) & (0x6C ^ 0x23 ^ (0x28 ^ 0x76) ^ -1)) >= 3) {
                return (1 & (1 ^ -1)) != 0;
            }
        } else {
            n2 = lIlIlIlIlIIIl[1];
        }
        return n2 != 0;
    }

    public int H() {
        return this.Q;
    }

    public void a() {
        this.O = lIlIlIlIlIIIl[0];
        this.R = lIlIlIlIlIIIl[1];
    }

    private static int lIlllllIlllIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lIlllllIllIlIII(String llllllllllllllIllIlIlIlllIllllII, String llllllllllllllIllIlIlIlllIlllIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlllIlllIll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIIIl[10]), "DES");
            Cipher llllllllllllllIllIlIlIlllIlllllI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIlllIlllllI.init(lIlIlIlIlIIIl[9], llllllllllllllIllIlIlIlllIllllll);
            return new String(llllllllllllllIllIlIlIlllIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIlllIllllIl) {
            llllllllllllllIllIlIlIlllIllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIlllIlIl(int n2) {
        return n2 != 0;
    }

    public NPC A() {
        String[] stringArray = new String[lIlIlIlIlIIIl[3]];
        stringArray[f.lIlIlIlIlIIIl[1]] = lIlIlIlIIllll[lIlIlIlIlIIIl[9]];
        return NPCs.getNearest((String[])stringArray);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean y() {
        int n2;
        block5: {
            block4: {
                void llllllllllllllIllIlIllIIIIlIlIIl;
                NPC nPC = this.c(lIlIlIlIlIIIl[3]);
                if (f.lIlllllIllIllll(nPC)) {
                    return lIlIlIlIlIIIl[1];
                }
                if (!f.lIlllllIlllIIII(llllllllllllllIllIlIllIIIIlIlIIl.getAnimation(), lIlIlIlIlIIIl[4])) break block4;
                int[] nArray = new int[lIlIlIlIlIIIl[3]];
                nArray[f.lIlIlIlIlIIIl[1]] = lIlIlIlIlIIIl[5];
                if (!f.lIlllllIllIllll(TileObjects.getNearest((int[])nArray))) break block4;
                int[] nArray2 = new int[lIlIlIlIlIIIl[3]];
                nArray2[f.lIlIlIlIlIIIl[1]] = lIlIlIlIlIIIl[6];
                if (!f.lIlllllIlllIIIl(Projectiles.getNearest((int[])nArray2))) break block5;
            }
            n2 = lIlIlIlIlIIIl[3];
            0;
            if (1 > 0) return n2 != 0;
            return ((0xFD ^ 0x81 ^ (0x59 ^ 0x29)) & (59 + 99 - 42 + 34 ^ 27 + 73 - 65 + 119 ^ -1)) != 0;
        }
        n2 = lIlIlIlIlIIIl[1];
        return n2 != 0;
    }

    static {
        f.lIlllllIllIllIl();
        f.lIlllllIllIlIll();
        K = lIlIlIlIlIIIl[4];
        M = lIlIlIlIlIIIl[8];
        J = lIlIlIlIIllll[lIlIlIlIlIIIl[16]];
        L = lIlIlIlIlIIIl[5];
        N = lIlIlIlIlIIIl[17];
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC nPC = this.c(lIlIlIlIlIIIl[3]);
        if (f.lIlllllIlllIllI(animationChanged.getActor(), nPC) && f.lIlllllIlllIIII(animationChanged.getActor().getAnimation(), lIlIlIlIlIIIl[0])) {
            this.Q = Static.getClient().getTickCount();
        }
    }

    private static boolean lIlllllIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllllIllIIllI(String llllllllllllllIllIlIlIlllllIIIIl, String llllllllllllllIllIlIlIllllIllllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlllllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIllllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIlllllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIlllllIIIll.init(lIlIlIlIlIIIl[9], llllllllllllllIllIlIlIlllllIIlII);
            return new String(llllllllllllllIllIlIlIlllllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIlllllIIIlI) {
            llllllllllllllIllIlIlIlllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlllllIllIIlll(String llllllllllllllIllIlIlIllllIlIIIl, String llllllllllllllIllIlIlIllllIlIIII) {
        llllllllllllllIllIlIlIllllIlIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIllllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIllllIIllll = new StringBuilder();
        char[] llllllllllllllIllIlIlIllllIIlllI = llllllllllllllIllIlIlIllllIlIIII.toCharArray();
        int llllllllllllllIllIlIlIllllIIllIl = lIlIlIlIlIIIl[1];
        char[] llllllllllllllIllIlIlIllllIIIlll = llllllllllllllIllIlIlIllllIlIIIl.toCharArray();
        int llllllllllllllIllIlIlIllllIIIllI = llllllllllllllIllIlIlIllllIIIlll.length;
        int llllllllllllllIllIlIlIllllIIIlIl = lIlIlIlIlIIIl[1];
        while (f.lIlllllIllllIlI(llllllllllllllIllIlIlIllllIIIlIl, llllllllllllllIllIlIlIllllIIIllI)) {
            char llllllllllllllIllIlIlIllllIlIIlI = llllllllllllllIllIlIlIllllIIIlll[llllllllllllllIllIlIlIllllIIIlIl];
            llllllllllllllIllIlIlIllllIIllll.append((char)(llllllllllllllIllIlIlIllllIlIIlI ^ llllllllllllllIllIlIlIllllIIlllI[llllllllllllllIllIlIlIllllIIllIl % llllllllllllllIllIlIlIllllIIlllI.length]));
            0;
            ++llllllllllllllIllIlIlIllllIIllIl;
            ++llllllllllllllIllIlIlIllllIIIlIl;
            0;
            if (((2 ^ (0x31 ^ 0x2B)) & (0xF6 ^ 0xB2 ^ (0xE3 ^ 0xBF) ^ -1)) < 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIllllIIllll);
    }

    private static void lIlllllIllIlIll() {
        lIlIlIlIIllll = new String[lIlIlIlIlIIIl[18]];
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[1]] = f."You become unfrozen";
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[3]] = f."unfreezing you as it does so";
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[9]] = f."Zombified Spawn";
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[12]] = f."blowpipe";
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[13]] = f."(e)";
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[7]] = f."dia";
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[11]] = f."(e)";
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[14]] = f."Vorkath";
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[10]] = f."Attack";
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[15]] = f."Poke";
        f.lIlIlIlIIllll[f.lIlIlIlIlIIIl[16]] = f."Zombified Spawn";
    }

    public int x() {
        return Vars.getBit((int)lIlIlIlIlIIIl[2]);
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        if (!f.lIlllllIlllIlII(chatMessage.getMessage().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[1]]) ? 1 : 0) || f.lIlllllIlllIlIl(chatMessage.getMessage().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[3]]) ? 1 : 0)) {
            llllllllllllllIllIlIllIIIIlIIIII.R = lIlIlIlIlIIIl[1];
        }
    }

    public boolean I() {
        return this.R;
    }

    public f() {
        this.O = lIlIlIlIlIIIl[0];
        this.P = lIlIlIlIlIIIl[0];
        this.Q = lIlIlIlIlIIIl[0];
        this.R = lIlIlIlIlIIIl[1];
    }

    private static boolean lIlllllIlllIIIl(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        f llllllllllllllIllIlIllIIIIIlllII;
        NPC nPC = this.A();
        if (f.lIlllllIlllIIIl(nPC) && f.lIlllllIlllIlIl(nPC.isDead() ? 1 : 0)) {
            this.R = lIlIlIlIlIIIl[1];
        }
        if (f.lIlllllIllIllll(llllllllllllllIllIlIllIIIIIlllII.c(lIlIlIlIlIIIl[3]))) {
            llllllllllllllIllIlIllIIIIIlllII.R = lIlIlIlIlIIIl[1];
        }
    }

    public int G() {
        return this.P;
    }

    private static boolean lIlllllIllIllll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public EquipmentSetup D() {
        void llllllllllllllIllIlIllIIIIIIIlll;
        void llllllllllllllIllIlIllIIIIIIIllI;
        NPC nPC = this.c(lIlIlIlIlIIIl[3]);
        EquipmentSetup equipmentSetup = ((BankLoadout)this.y.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
        if (f.lIlllllIllIllll(nPC)) {
            return llllllllllllllIllIlIllIIIIIIIllI;
        }
        int llllllllllllllIllIlIllIIIIIIIlIl = llllllllllllllIllIlIllIIIIIIIlll.getHealthScale();
        int llllllllllllllIllIlIllIIIIIIIlII = llllllllllllllIllIlIllIIIIIIIlll.getHealthRatio();
        double llllllllllllllIllIlIllIIIIIIIIll = (double)llllllllllllllIllIlIllIIIIIIIlII / (double)llllllllllllllIllIlIllIIIIIIIlIl * 100.0;
        if (f.lIlllllIlllIlII(llllllllllllllIllIlIllIIIIIIIllI.contains(itemComposition -> {
            int n2;
            if (f.lIlllllIlllIIIl(itemComposition.getName()) && f.lIlllllIlllIlIl(itemComposition.getName().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[11]]) ? 1 : 0)) {
                n2 = lIlIlIlIlIIIl[3];
                0;
                if (2 == 0) {
                    return ((0x78 ^ 0x2F ^ (0x62 ^ 2)) & (0x96 ^ 0x84 ^ (0x3C ^ 0x19) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlIlIlIIIl[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return llllllllllllllIllIlIllIIIIIIIllI;
        }
        Item llllllllllllllIllIlIllIIIIIIIIlI = Inventory.getFirst(item -> {
            int n2;
            if (f.lIlllllIlllIlIl(item.getName().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[13]]) ? 1 : 0) && f.lIlllllIlllIlIl(item.getName().toLowerCase().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[7]]) ? 1 : 0)) {
                n2 = lIlIlIlIlIIIl[3];
                0;
                if (3 == 0) {
                    return (3 & (3 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlIlIlIIIl[1];
            }
            return n2 != 0;
        });
        Item llllllllllllllIllIlIllIIIIIIIIIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.AMMO);
        if (f.lIlllllIllIllll(llllllllllllllIllIlIllIIIIIIIIlI)) {
            llllllllllllllIllIlIllIIIIIIIIlI = llllllllllllllIllIlIllIIIIIIIIIl;
        }
        if (f.lIlllllIllllIII(f.lIlllllIlllIlll(llllllllllllllIllIlIllIIIIIIIIll, 35.0))) {
            int n2;
            if (f.lIlllllIlllIIIl(llllllllllllllIllIlIllIIIIIIIIlI)) {
                n2 = llllllllllllllIllIlIllIIIIIIIIlI.getId();
                0;
                if (-1 > ((0xE ^ 0x4B) & ~(0xB ^ 0x4E))) {
                    return null;
                }
            } else {
                n2 = lIlIlIlIlIIIl[0];
            }
            return llllllllllllllIllIlIllIIIIIIIllI.derive(EquipmentInventorySlot.AMMO, n2);
        }
        return equipmentSetup;
    }

    private static boolean lIlllllIlllIllI(Object object, Object object2) {
        return object == object2;
    }

    public void a(int n2) {
        this.O = n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean C() {
        boolean bl;
        void llllllllllllllIllIlIllIIIIIlIIIl;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (f.lIlllllIllIllll(item)) {
            return lIlIlIlIlIIIl[3];
        }
        if (f.lIlllllIlllIllI(WeaponMap.StyleMap.getOrDefault(llllllllllllllIllIlIllIIIIIlIIIl.getId(), WeaponStyle.MELEE), WeaponStyle.MELEE)) {
            bl = lIlIlIlIlIIIl[3];
            0;
            if (null != null) {
                return ((0x32 ^ 1 ^ (0xFB ^ 0xC7)) & (80 + 124 - 90 + 16 ^ 55 + 88 - 37 + 35 ^ -1)) != 0;
            }
        } else {
            bl = lIlIlIlIlIIIl[1];
        }
        return bl;
    }

    private static boolean lIlllllIllllIII(int n2) {
        return n2 <= 0;
    }

    public NPC c(boolean bl) {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (f.lIlllllIlllIlIl(nPC.getName().equals(lIlIlIlIIllll[lIlIlIlIlIIIl[14]]) ? 1 : 0)) {
                String string;
                String[] stringArray = new String[lIlIlIlIlIIIl[3]];
                if (f.lIlllllIlllIlIl(bl ? 1 : 0)) {
                    string = lIlIlIlIIllll[lIlIlIlIlIIIl[10]];
                    0;
                    if (null != null) {
                        return ((0xC9 ^ 0x93) & ~(0xF ^ 0x55)) != 0;
                    }
                } else {
                    string = stringArray[f.lIlIlIlIlIIIl[1]] = lIlIlIlIIllll[lIlIlIlIlIIIl[15]];
                }
                if (f.lIlllllIlllIlIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIlIlIIIl[3];
                    0;
                    if (2 != 0) return n2 != 0;
                    return ((0xA3 ^ 0xBB ^ (0x8D ^ 0x9E)) & (0x9F ^ 0x89 ^ (0x29 ^ 0x34) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIlIlIIIl[1];
            return n2 != 0;
        });
    }

    private static boolean lIlllllIlllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlllllIllllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (f.lIlllllIlllIIll(projectileSpawned.getProjectile().getId(), lIlIlIlIlIIIl[8])) {
            this.R = lIlIlIlIlIIIl[3];
        }
    }

    public boolean E() {
        boolean bl;
        if (f.lIlllllIllllIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS))) {
            bl = lIlIlIlIlIIIl[3];
            0;
            if (-1 >= 2) {
                return ((0x3B ^ 0x1A ^ (0x9A ^ 0x81)) & (0x16 ^ 0x36 ^ (0xB8 ^ 0xA2) ^ -1)) != 0;
            }
        } else {
            bl = lIlIlIlIlIIIl[1];
        }
        return bl;
    }

    private static void lIlllllIllIllIl() {
        lIlIlIlIlIIIl = new int[19];
        f.lIlIlIlIlIIIl[0] = -1;
        f.lIlIlIlIlIIIl[1] = (0x2B ^ 0x66) & ~(0xFD ^ 0xB0) & ~((0x3E ^ 0x31) & ~(0xCC ^ 0xC3));
        f.lIlIlIlIlIIIl[2] = -(0xFFFFEF6D & 0x18BB) & (0xFFFFFFFF & 0x1FFB);
        f.lIlIlIlIlIIIl[3] = 1;
        f.lIlIlIlIlIIIl[4] = 0xFFFFBF55 & 0x5FBF;
        f.lIlIlIlIlIIIl[5] = 0xFFFFFD37 & 0x7FC8;
        f.lIlIlIlIlIIIl[6] = -(0xFFFFB6FF & 0x7B05) & (0xFFFFB7CF & Short.MAX_VALUE);
        f.lIlIlIlIlIIIl[7] = 80 + 98 - 141 + 113 ^ 9 + 57 - 53 + 134;
        f.lIlIlIlIlIIIl[8] = -(0xFFFFDAB3 & 0x7F4F) & (0xFFFFFFCE & 0x5FFF);
        f.lIlIlIlIlIIIl[9] = 2;
        f.lIlIlIlIlIIIl[10] = 0x57 ^ 0x5F;
        f.lIlIlIlIlIIIl[11] = 0x79 ^ 0x56 ^ (0x69 ^ 0x40);
        f.lIlIlIlIlIIIl[12] = 3;
        f.lIlIlIlIlIIIl[13] = 0x5E ^ 0x78 ^ (1 ^ 0x23);
        f.lIlIlIlIlIIIl[14] = 0x5C ^ 0x5B;
        f.lIlIlIlIlIIIl[15] = 77 + 65 - 60 + 59 ^ 26 + 109 - 43 + 40;
        f.lIlIlIlIlIIIl[16] = 10 + 134 - -32 + 31 ^ 187 + 140 - 314 + 184;
        f.lIlIlIlIlIIIl[17] = 0xFFFFF5C5 & 0xFFF;
        f.lIlIlIlIlIIIl[18] = 0xB8 ^ 0xB3;
    }

    public void b(int n2) {
        this.P = n2;
    }

    private static boolean lIlllllIlllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlllllIlllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlllllIlllIlII(int n2) {
        return n2 == 0;
    }
}

